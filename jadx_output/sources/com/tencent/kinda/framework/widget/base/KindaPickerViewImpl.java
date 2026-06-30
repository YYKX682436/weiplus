package com.tencent.kinda.framework.widget.base;

/* loaded from: classes15.dex */
public class KindaPickerViewImpl<T> extends android.widget.LinearLayout {
    private static final java.lang.String TAG = "KindaPickerViewImpl";
    private boolean mIsLinkage;
    private java.util.List<T> mLeftWheelItems;
    private com.tencent.kinda.framework.widget.base.KindaPickerViewImpl.OnSelectChangeListener mOnSelectChangeListener;
    private java.util.List<? extends java.util.List<T>> mRightWheelItems;
    private com.tencent.mm.picker.base.view.WheelView mWheelViewLeft;
    private com.tencent.mm.picker.base.view.WheelView mWheelViewRight;

    /* loaded from: classes15.dex */
    public interface OnSelectChangeListener {
        void onSelected(java.util.ArrayList<java.lang.Integer> arrayList);
    }

    public KindaPickerViewImpl(android.content.Context context) {
        super(context);
        this.mIsLinkage = true;
        init(context);
    }

    private void forceSetSelectedItems(java.util.List<java.lang.Integer> list) {
        if (list == null || list.size() < 1) {
            return;
        }
        if (this.mLeftWheelItems != null) {
            this.mWheelViewLeft.setCurrentItem(list.get(0).intValue());
        }
        if (this.mRightWheelItems == null || list.size() <= 1) {
            return;
        }
        this.mWheelViewRight.setAdapter(new o51.a(this.mRightWheelItems.get(list.get(0).intValue())));
        this.mWheelViewRight.setCurrentItem(list.get(1).intValue());
    }

    private void init(android.content.Context context) {
        com.tencent.mm.ui.id.b(context).inflate(com.tencent.kinda.framework.R.layout.kinda_picker_view, this);
        this.mWheelViewLeft = (com.tencent.mm.picker.base.view.WheelView) findViewById(com.tencent.kinda.framework.R.id.options_left);
        this.mWheelViewRight = (com.tencent.mm.picker.base.view.WheelView) findViewById(com.tencent.kinda.framework.R.id.options_right);
        setDividerHeight(context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480137pc));
        setDividerColor(b3.l.getColor(context, com.tencent.mm.R.color.BW_0_Alpha_0_1));
        setPadding(0, context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn), 0, context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn));
        setItemHeight(context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn));
        setTextColor(b3.l.getColor(context, com.tencent.mm.R.color.BW_0_Alpha_0_9));
        setLoop(false);
    }

    public java.util.ArrayList<java.lang.Integer> getCurrentItems() {
        java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList<>();
        int currentItem = this.mWheelViewLeft.getCurrentItem();
        int currentItem2 = this.mWheelViewRight.getCurrentItem();
        java.util.List<? extends java.util.List<T>> list = this.mRightWheelItems;
        if (list != null && list.size() > 0 && currentItem2 > this.mRightWheelItems.get(currentItem).size() - 1) {
            currentItem2 = 0;
        }
        arrayList.add(java.lang.Integer.valueOf(currentItem));
        arrayList.add(java.lang.Integer.valueOf(currentItem2));
        return arrayList;
    }

    public void setCurrentItems(java.util.List<java.lang.Integer> list) {
        if (list == null || list.size() < 1) {
            return;
        }
        if (this.mIsLinkage) {
            forceSetSelectedItems(list);
            return;
        }
        this.mWheelViewLeft.setCurrentItem(list.get(0).intValue());
        if (list.size() > 1) {
            this.mWheelViewRight.setCurrentItem(list.get(1).intValue());
        }
    }

    public void setDividerColor(int i17) {
        this.mWheelViewLeft.setDividerColor(i17);
        this.mWheelViewRight.setDividerColor(i17);
    }

    public void setDividerHeight(float f17) {
        this.mWheelViewLeft.setDividerHeight(f17);
        this.mWheelViewRight.setDividerHeight(f17);
    }

    public void setIndividualPicker(java.util.List<? extends java.util.List<T>> list) {
        if (list == null || list.size() < 1) {
            return;
        }
        java.util.List<T> list2 = list.get(0);
        java.util.List<T> list3 = list.size() > 1 ? list.get(1) : null;
        this.mIsLinkage = false;
        this.mWheelViewLeft.setAdapter(new o51.a(list2));
        this.mWheelViewLeft.setCurrentItem(0);
        if (list3 != null) {
            this.mWheelViewRight.setVisibility(0);
            this.mWheelViewRight.setAdapter(new o51.a(list3));
            com.tencent.mm.picker.base.view.WheelView wheelView = this.mWheelViewRight;
            wheelView.setCurrentItem(wheelView.getCurrentItem());
        }
        this.mWheelViewLeft.setIsOptions(true);
        this.mWheelViewRight.setIsOptions(true);
        if (this.mOnSelectChangeListener == null) {
            return;
        }
        this.mWheelViewLeft.setOnItemSelectedListener(new q51.b() { // from class: com.tencent.kinda.framework.widget.base.KindaPickerViewImpl.3
            @Override // q51.b
            public void onItemSelected(int i17) {
                java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList<>();
                arrayList.add(java.lang.Integer.valueOf(i17));
                arrayList.add(java.lang.Integer.valueOf(com.tencent.kinda.framework.widget.base.KindaPickerViewImpl.this.mWheelViewRight.getCurrentItem()));
                if (com.tencent.kinda.framework.widget.base.KindaPickerViewImpl.this.mOnSelectChangeListener != null) {
                    com.tencent.kinda.framework.widget.base.KindaPickerViewImpl.this.mOnSelectChangeListener.onSelected(arrayList);
                }
            }
        });
        if (list3 != null) {
            this.mWheelViewRight.setOnItemSelectedListener(new q51.b() { // from class: com.tencent.kinda.framework.widget.base.KindaPickerViewImpl.4
                @Override // q51.b
                public void onItemSelected(int i17) {
                    java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList<>();
                    arrayList.add(java.lang.Integer.valueOf(com.tencent.kinda.framework.widget.base.KindaPickerViewImpl.this.mWheelViewLeft.getCurrentItem()));
                    arrayList.add(java.lang.Integer.valueOf(i17));
                    if (com.tencent.kinda.framework.widget.base.KindaPickerViewImpl.this.mOnSelectChangeListener != null) {
                        com.tencent.kinda.framework.widget.base.KindaPickerViewImpl.this.mOnSelectChangeListener.onSelected(arrayList);
                    }
                }
            });
        }
    }

    public void setItemHeight(int i17) {
        com.tencent.mm.picker.base.view.WheelView wheelView = this.mWheelViewLeft;
        wheelView.f72379d = i17;
        wheelView.invalidate();
        com.tencent.mm.picker.base.view.WheelView wheelView2 = this.mWheelViewRight;
        wheelView2.f72379d = i17;
        wheelView2.invalidate();
    }

    public void setLinkagePicker(java.util.List<T> list, java.util.List<? extends java.util.List<T>> list2) {
        if (list == null) {
            return;
        }
        this.mLeftWheelItems = list;
        this.mRightWheelItems = list2;
        this.mIsLinkage = true;
        this.mWheelViewLeft.setAdapter(new o51.a(list));
        this.mWheelViewLeft.setCurrentItem(0);
        if (this.mLeftWheelItems != null) {
            this.mWheelViewRight.setAdapter(new o51.a(this.mRightWheelItems.get(0)));
        }
        com.tencent.mm.picker.base.view.WheelView wheelView = this.mWheelViewRight;
        wheelView.setCurrentItem(wheelView.getCurrentItem());
        this.mWheelViewLeft.setOnItemSelectedListener(new q51.b() { // from class: com.tencent.kinda.framework.widget.base.KindaPickerViewImpl.1
            @Override // q51.b
            public void onItemSelected(int i17) {
                if (com.tencent.kinda.framework.widget.base.KindaPickerViewImpl.this.mOnSelectChangeListener == null) {
                    return;
                }
                java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList<>();
                arrayList.add(java.lang.Integer.valueOf(i17));
                arrayList.add(0);
                if (com.tencent.kinda.framework.widget.base.KindaPickerViewImpl.this.mRightWheelItems != null) {
                    com.tencent.kinda.framework.widget.base.KindaPickerViewImpl.this.mWheelViewRight.setAdapter(new o51.a((java.util.List) com.tencent.kinda.framework.widget.base.KindaPickerViewImpl.this.mRightWheelItems.get(i17)));
                    com.tencent.kinda.framework.widget.base.KindaPickerViewImpl.this.mWheelViewRight.setCurrentItem(0);
                }
                com.tencent.kinda.framework.widget.base.KindaPickerViewImpl.this.mOnSelectChangeListener.onSelected(arrayList);
            }
        });
        if (list2 != null) {
            this.mWheelViewRight.setOnItemSelectedListener(new q51.b() { // from class: com.tencent.kinda.framework.widget.base.KindaPickerViewImpl.2
                @Override // q51.b
                public void onItemSelected(int i17) {
                    if (com.tencent.kinda.framework.widget.base.KindaPickerViewImpl.this.mOnSelectChangeListener == null) {
                        return;
                    }
                    java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList<>();
                    arrayList.add(java.lang.Integer.valueOf(com.tencent.kinda.framework.widget.base.KindaPickerViewImpl.this.mWheelViewLeft.getCurrentItem()));
                    arrayList.add(java.lang.Integer.valueOf(i17));
                    com.tencent.kinda.framework.widget.base.KindaPickerViewImpl.this.mOnSelectChangeListener.onSelected(arrayList);
                }
            });
        }
    }

    public void setLoop(boolean z17) {
        this.mWheelViewLeft.setCyclic(z17);
        this.mWheelViewRight.setCyclic(z17);
    }

    public void setOnSelectChangeListener(com.tencent.kinda.framework.widget.base.KindaPickerViewImpl.OnSelectChangeListener onSelectChangeListener) {
        this.mOnSelectChangeListener = onSelectChangeListener;
    }

    @Override // android.view.View
    public void setPadding(int i17, int i18, int i19, int i27) {
        this.mWheelViewLeft.setPadding(i17, i18, i19, i27);
        this.mWheelViewRight.setPadding(i17, i18, i19, i27);
    }

    public void setTextColor(int i17) {
        this.mWheelViewLeft.e(i17);
        this.mWheelViewRight.e(i17);
    }

    public KindaPickerViewImpl(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mIsLinkage = true;
        init(context);
    }

    public KindaPickerViewImpl(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.mIsLinkage = true;
        init(context);
    }

    public KindaPickerViewImpl(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        super(context, attributeSet, i17, i18);
        this.mIsLinkage = true;
        init(context);
    }
}
