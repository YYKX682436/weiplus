package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1;

/* renamed from: com.tencent.kinda.framework.widget.base.KindaPickerViewImpl */
/* loaded from: classes15.dex */
public class C3306x3c1b5a0<T> extends android.widget.LinearLayout {
    private static final java.lang.String TAG = "KindaPickerViewImpl";

    /* renamed from: mIsLinkage */
    private boolean f12814x62b6a04e;

    /* renamed from: mLeftWheelItems */
    private java.util.List<T> f12815xca538659;

    /* renamed from: mOnSelectChangeListener */
    private com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3306x3c1b5a0.OnSelectChangeListener f12816x78b0adec;

    /* renamed from: mRightWheelItems */
    private java.util.List<? extends java.util.List<T>> f12817xddd3f834;

    /* renamed from: mWheelViewLeft */
    private com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480 f12818x5152115a;

    /* renamed from: mWheelViewRight */
    private com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480 f12819xd9467b29;

    /* renamed from: com.tencent.kinda.framework.widget.base.KindaPickerViewImpl$OnSelectChangeListener */
    /* loaded from: classes15.dex */
    public interface OnSelectChangeListener {
        /* renamed from: onSelected */
        void mo26552xec20159a(java.util.ArrayList<java.lang.Integer> arrayList);
    }

    public C3306x3c1b5a0(android.content.Context context) {
        super(context);
        this.f12814x62b6a04e = true;
        m26540x316510(context);
    }

    /* renamed from: forceSetSelectedItems */
    private void m26539x550229ae(java.util.List<java.lang.Integer> list) {
        if (list == null || list.size() < 1) {
            return;
        }
        if (this.f12815xca538659 != null) {
            this.f12818x5152115a.m48596x940d026a(list.get(0).intValue());
        }
        if (this.f12817xddd3f834 == null || list.size() <= 1) {
            return;
        }
        this.f12819xd9467b29.m48595x6cab2c8d(new o51.a(this.f12817xddd3f834.get(list.get(0).intValue())));
        this.f12819xd9467b29.m48596x940d026a(list.get(1).intValue());
    }

    /* renamed from: init */
    private void m26540x316510(android.content.Context context) {
        com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.C3089xbddafb2a.f11647xbe21dc4, this);
        this.f12818x5152115a = (com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480) findViewById(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.id.f11576x8aa84508);
        this.f12819xd9467b29 = (com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480) findViewById(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.id.f11577xcab6bd3b);
        m26544x6c813c5e(context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561670pc));
        m26543x4d90c14c(b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77630xad7ef28));
        setPadding(0, context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), 0, context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
        m26546x8002241c(context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
        m26550x1c5c5ff4(b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77654xad7ef30));
        m26548x764cf626(false);
    }

    /* renamed from: getCurrentItems */
    public java.util.ArrayList<java.lang.Integer> m26541xb74a503d() {
        java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList<>();
        int m48589xfda78ef6 = this.f12818x5152115a.m48589xfda78ef6();
        int m48589xfda78ef62 = this.f12819xd9467b29.m48589xfda78ef6();
        java.util.List<? extends java.util.List<T>> list = this.f12817xddd3f834;
        if (list != null && list.size() > 0 && m48589xfda78ef62 > this.f12817xddd3f834.get(m48589xfda78ef6).size() - 1) {
            m48589xfda78ef62 = 0;
        }
        arrayList.add(java.lang.Integer.valueOf(m48589xfda78ef6));
        arrayList.add(java.lang.Integer.valueOf(m48589xfda78ef62));
        return arrayList;
    }

    /* renamed from: setCurrentItems */
    public void m26542xed934b49(java.util.List<java.lang.Integer> list) {
        if (list == null || list.size() < 1) {
            return;
        }
        if (this.f12814x62b6a04e) {
            m26539x550229ae(list);
            return;
        }
        this.f12818x5152115a.m48596x940d026a(list.get(0).intValue());
        if (list.size() > 1) {
            this.f12819xd9467b29.m48596x940d026a(list.get(1).intValue());
        }
    }

    /* renamed from: setDividerColor */
    public void m26543x4d90c14c(int i17) {
        this.f12818x5152115a.m48598x4d90c14c(i17);
        this.f12819xd9467b29.m48598x4d90c14c(i17);
    }

    /* renamed from: setDividerHeight */
    public void m26544x6c813c5e(float f17) {
        this.f12818x5152115a.m48599x6c813c5e(f17);
        this.f12819xd9467b29.m48599x6c813c5e(f17);
    }

    /* renamed from: setIndividualPicker */
    public void m26545x84e47d09(java.util.List<? extends java.util.List<T>> list) {
        if (list == null || list.size() < 1) {
            return;
        }
        java.util.List<T> list2 = list.get(0);
        java.util.List<T> list3 = list.size() > 1 ? list.get(1) : null;
        this.f12814x62b6a04e = false;
        this.f12818x5152115a.m48595x6cab2c8d(new o51.a(list2));
        this.f12818x5152115a.m48596x940d026a(0);
        if (list3 != null) {
            this.f12819xd9467b29.setVisibility(0);
            this.f12819xd9467b29.m48595x6cab2c8d(new o51.a(list3));
            com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480 c11323x28056480 = this.f12819xd9467b29;
            c11323x28056480.m48596x940d026a(c11323x28056480.m48589xfda78ef6());
        }
        this.f12818x5152115a.m48601xeeb8ffd2(true);
        this.f12819xd9467b29.m48601xeeb8ffd2(true);
        if (this.f12816x78b0adec == null) {
            return;
        }
        this.f12818x5152115a.m48604x88423923(new q51.b() { // from class: com.tencent.kinda.framework.widget.base.KindaPickerViewImpl.3
            @Override // q51.b
            /* renamed from: onItemSelected */
            public void mo26551xe1bd9a4d(int i17) {
                java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList<>();
                arrayList.add(java.lang.Integer.valueOf(i17));
                arrayList.add(java.lang.Integer.valueOf(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3306x3c1b5a0.this.f12819xd9467b29.m48589xfda78ef6()));
                if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3306x3c1b5a0.this.f12816x78b0adec != null) {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3306x3c1b5a0.this.f12816x78b0adec.mo26552xec20159a(arrayList);
                }
            }
        });
        if (list3 != null) {
            this.f12819xd9467b29.m48604x88423923(new q51.b() { // from class: com.tencent.kinda.framework.widget.base.KindaPickerViewImpl.4
                @Override // q51.b
                /* renamed from: onItemSelected */
                public void mo26551xe1bd9a4d(int i17) {
                    java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList<>();
                    arrayList.add(java.lang.Integer.valueOf(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3306x3c1b5a0.this.f12818x5152115a.m48589xfda78ef6()));
                    arrayList.add(java.lang.Integer.valueOf(i17));
                    if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3306x3c1b5a0.this.f12816x78b0adec != null) {
                        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3306x3c1b5a0.this.f12816x78b0adec.mo26552xec20159a(arrayList);
                    }
                }
            });
        }
    }

    /* renamed from: setItemHeight */
    public void m26546x8002241c(int i17) {
        com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480 c11323x28056480 = this.f12818x5152115a;
        c11323x28056480.f153912d = i17;
        c11323x28056480.invalidate();
        com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480 c11323x280564802 = this.f12819xd9467b29;
        c11323x280564802.f153912d = i17;
        c11323x280564802.invalidate();
    }

    /* renamed from: setLinkagePicker */
    public void m26547x93273e71(java.util.List<T> list, java.util.List<? extends java.util.List<T>> list2) {
        if (list == null) {
            return;
        }
        this.f12815xca538659 = list;
        this.f12817xddd3f834 = list2;
        this.f12814x62b6a04e = true;
        this.f12818x5152115a.m48595x6cab2c8d(new o51.a(list));
        this.f12818x5152115a.m48596x940d026a(0);
        if (this.f12815xca538659 != null) {
            this.f12819xd9467b29.m48595x6cab2c8d(new o51.a(this.f12817xddd3f834.get(0)));
        }
        com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480 c11323x28056480 = this.f12819xd9467b29;
        c11323x28056480.m48596x940d026a(c11323x28056480.m48589xfda78ef6());
        this.f12818x5152115a.m48604x88423923(new q51.b() { // from class: com.tencent.kinda.framework.widget.base.KindaPickerViewImpl.1
            @Override // q51.b
            /* renamed from: onItemSelected */
            public void mo26551xe1bd9a4d(int i17) {
                if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3306x3c1b5a0.this.f12816x78b0adec == null) {
                    return;
                }
                java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList<>();
                arrayList.add(java.lang.Integer.valueOf(i17));
                arrayList.add(0);
                if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3306x3c1b5a0.this.f12817xddd3f834 != null) {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3306x3c1b5a0.this.f12819xd9467b29.m48595x6cab2c8d(new o51.a((java.util.List) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3306x3c1b5a0.this.f12817xddd3f834.get(i17)));
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3306x3c1b5a0.this.f12819xd9467b29.m48596x940d026a(0);
                }
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3306x3c1b5a0.this.f12816x78b0adec.mo26552xec20159a(arrayList);
            }
        });
        if (list2 != null) {
            this.f12819xd9467b29.m48604x88423923(new q51.b() { // from class: com.tencent.kinda.framework.widget.base.KindaPickerViewImpl.2
                @Override // q51.b
                /* renamed from: onItemSelected */
                public void mo26551xe1bd9a4d(int i17) {
                    if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3306x3c1b5a0.this.f12816x78b0adec == null) {
                        return;
                    }
                    java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList<>();
                    arrayList.add(java.lang.Integer.valueOf(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3306x3c1b5a0.this.f12818x5152115a.m48589xfda78ef6()));
                    arrayList.add(java.lang.Integer.valueOf(i17));
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3306x3c1b5a0.this.f12816x78b0adec.mo26552xec20159a(arrayList);
                }
            });
        }
    }

    /* renamed from: setLoop */
    public void m26548x764cf626(boolean z17) {
        this.f12818x5152115a.m48597x813dbbb(z17);
        this.f12819xd9467b29.m48597x813dbbb(z17);
    }

    /* renamed from: setOnSelectChangeListener */
    public void m26549x4e5bd421(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3306x3c1b5a0.OnSelectChangeListener onSelectChangeListener) {
        this.f12816x78b0adec = onSelectChangeListener;
    }

    @Override // android.view.View
    public void setPadding(int i17, int i18, int i19, int i27) {
        this.f12818x5152115a.setPadding(i17, i18, i19, i27);
        this.f12819xd9467b29.setPadding(i17, i18, i19, i27);
    }

    /* renamed from: setTextColor */
    public void m26550x1c5c5ff4(int i17) {
        this.f12818x5152115a.e(i17);
        this.f12819xd9467b29.e(i17);
    }

    public C3306x3c1b5a0(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12814x62b6a04e = true;
        m26540x316510(context);
    }

    public C3306x3c1b5a0(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f12814x62b6a04e = true;
        m26540x316510(context);
    }

    public C3306x3c1b5a0(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        super(context, attributeSet, i17, i18);
        this.f12814x62b6a04e = true;
        m26540x316510(context);
    }
}
