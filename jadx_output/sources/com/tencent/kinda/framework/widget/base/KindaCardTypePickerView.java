package com.tencent.kinda.framework.widget.base;

/* loaded from: classes9.dex */
public class KindaCardTypePickerView extends com.tencent.kinda.framework.widget.base.MMKView<android.view.View> implements com.tencent.kinda.gen.KCardTypePickerView {
    private com.tencent.kinda.gen.KCardTypePickerViewOnSelectCallback mCallBack;
    private android.widget.LinearLayout mContainer;
    private android.content.Context mContext;
    private android.widget.EditText mEditText;
    private com.tencent.mm.ui.widget.picker.c0 mOptionPiker;
    private java.util.ArrayList<com.tencent.kinda.gen.Option> mOptions;
    java.lang.String TAG = "KindaCardTypePickerView";
    private int selected = -1;

    @Override // com.tencent.kinda.framework.widget.base.MMKView
    public android.view.View createView(android.content.Context context) {
        android.widget.EditText editText = new android.widget.EditText(context);
        this.mEditText = editText;
        editText.setInputType(0);
        this.mEditText.setFocusable(false);
        this.mEditText.setBackground(null);
        this.mEditText.setTextSize(1, com.tencent.kinda.framework.widget.tools.MMKViewUtil.getScaleSize(context) * 17.0f);
        this.mEditText.setPadding(0, 0, 0, 0);
        this.mContext = context;
        this.mEditText.setHintTextColor(context.getResources().getColor(com.tencent.mm.R.color.FG_0));
        this.mEditText.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.FG_0));
        com.tencent.kinda.framework.widget.base.LayoutWrapper layoutWrapper = new com.tencent.kinda.framework.widget.base.LayoutWrapper(context, this.mEditText);
        this.mContainer = layoutWrapper;
        return layoutWrapper;
    }

    @Override // com.tencent.kinda.gen.KCardTypePickerView
    public boolean getEnabled() {
        return this.mEditText.isEnabled();
    }

    @Override // com.tencent.kinda.gen.KCardTypePickerView
    public boolean getFocus() {
        return this.mEditText.isFocused();
    }

    @Override // com.tencent.kinda.gen.KCardTypePickerView
    public void select(int i17) {
        this.selected = i17;
        this.mEditText.setText(this.mOptions.get(i17).mContent);
        this.mContainer.setContentDescription(this.mOptions.get(i17).mContent);
    }

    @Override // com.tencent.kinda.gen.KCardTypePickerView
    public void setEnabled(boolean z17) {
        this.mEditText.setEnabled(z17);
        if (z17) {
            this.mEditText.setTextColor(this.mContext.getResources().getColor(com.tencent.mm.R.color.FG_0));
        } else {
            this.mEditText.setTextColor(this.mContext.getResources().getColor(com.tencent.mm.R.color.FG_1));
        }
    }

    @Override // com.tencent.kinda.gen.KCardTypePickerView
    public void setFocus(boolean z17) {
        if (z17 && this.mEditText.isEnabled()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<com.tencent.kinda.gen.Option> it = this.mOptions.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().mContent);
            }
            com.tencent.mm.ui.widget.picker.c0 c0Var = new com.tencent.mm.ui.widget.picker.c0(this.mContext, arrayList);
            this.mOptionPiker = c0Var;
            c0Var.f212259t = new com.tencent.mm.ui.widget.picker.a0() { // from class: com.tencent.kinda.framework.widget.base.KindaCardTypePickerView.1
                @Override // com.tencent.mm.ui.widget.picker.a0
                public void onResult(boolean z18, java.lang.Object obj, java.lang.Object obj2) {
                    com.tencent.kinda.framework.widget.base.KindaCardTypePickerView.this.mOptionPiker.d();
                    if (z18) {
                        java.lang.String str = (java.lang.String) obj;
                        com.tencent.kinda.framework.widget.base.KindaCardTypePickerView.this.mEditText.setText(str);
                        com.tencent.kinda.framework.widget.base.KindaCardTypePickerView.this.mContainer.setContentDescription(str);
                        com.tencent.kinda.framework.widget.base.KindaCardTypePickerView kindaCardTypePickerView = com.tencent.kinda.framework.widget.base.KindaCardTypePickerView.this;
                        kindaCardTypePickerView.selected = kindaCardTypePickerView.mOptionPiker.b();
                        com.tencent.kinda.framework.widget.base.KindaCardTypePickerView.this.mCallBack.onSelect(com.tencent.kinda.framework.widget.base.KindaCardTypePickerView.this.mOptionPiker.b());
                    }
                }
            };
            int i17 = this.selected;
            if (i17 != -1) {
                this.mOptionPiker.i(i17);
            }
            this.mOptionPiker.l();
        }
    }

    @Override // com.tencent.kinda.gen.KCardTypePickerView
    public void setHint(java.lang.String str) {
        android.widget.EditText editText = this.mEditText;
        if (editText != null) {
            editText.setHint(str);
            if (this.mContainer == null || !com.tencent.mm.sdk.platformtools.t8.J0(this.mEditText.getText())) {
                return;
            }
            this.mContainer.setContentDescription(str);
        }
    }

    @Override // com.tencent.kinda.gen.KCardTypePickerView
    public void setOnSelectCallback(com.tencent.kinda.gen.KCardTypePickerViewOnSelectCallback kCardTypePickerViewOnSelectCallback) {
        this.mCallBack = kCardTypePickerViewOnSelectCallback;
    }

    @Override // com.tencent.kinda.gen.KCardTypePickerView
    public void setOptions(java.util.ArrayList<com.tencent.kinda.gen.Option> arrayList) {
        this.mEditText.setText("");
        this.mContainer.setContentDescription("");
        this.mOptions = arrayList;
    }

    @Override // com.tencent.kinda.gen.KCardTypePickerView
    public void setTextSize(float f17) {
        if (f17 > 0.0f) {
            this.mEditText.setTextSize(1, f17 * (getSupportDynamicSize() ? com.tencent.kinda.framework.widget.tools.MMKViewUtil.getScaleSize(com.tencent.mm.sdk.platformtools.x2.f193071a) : 1.0f));
            notifyChanged();
        }
    }
}
