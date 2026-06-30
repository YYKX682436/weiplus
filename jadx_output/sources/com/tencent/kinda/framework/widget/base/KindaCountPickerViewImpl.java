package com.tencent.kinda.framework.widget.base;

/* loaded from: classes9.dex */
public class KindaCountPickerViewImpl extends com.tencent.kinda.framework.widget.base.MMKView implements com.tencent.kinda.gen.KCountPickerView {
    private android.content.Context mContext;
    private com.tencent.kinda.gen.KCountPickerViewOnSelectCallback mCountPickerCallback;
    private android.widget.EditText mEditText;
    private int mSelectCreCountIndex;
    private java.lang.String[] mTimesArray;

    @Override // com.tencent.kinda.framework.widget.base.MMKView
    public android.view.View createView(android.content.Context context) {
        this.mContext = context;
        this.mTimesArray = new java.lang.String[100];
        int i17 = 0;
        while (true) {
            java.lang.String[] strArr = this.mTimesArray;
            if (i17 >= strArr.length) {
                this.mSelectCreCountIndex = 0;
                android.widget.EditText editText = new android.widget.EditText(context);
                this.mEditText = editText;
                editText.setInputType(0);
                this.mEditText.setFocusable(false);
                this.mEditText.setBackground(null);
                this.mEditText.setHint(com.tencent.mm.R.string.khf);
                this.mEditText.setPadding(0, 0, 0, 0);
                this.mEditText.setTextSize(16.0f);
                return this.mEditText;
            }
            strArr[i17] = this.mContext.getString(com.tencent.mm.R.string.kkh, java.lang.String.valueOf(i17));
            i17++;
        }
    }

    @Override // com.tencent.kinda.gen.KCountPickerView
    public boolean getFocus() {
        android.widget.EditText editText = this.mEditText;
        if (editText == null) {
            return false;
        }
        return editText.hasFocus();
    }

    @Override // com.tencent.kinda.gen.KCountPickerView
    public java.lang.String getValue() {
        return "" + this.mSelectCreCountIndex;
    }

    @Override // com.tencent.kinda.gen.KCountPickerView
    public void setDefaultCount(int i17) {
        this.mSelectCreCountIndex = i17;
        this.mEditText.setText(this.mContext.getString(com.tencent.mm.R.string.kkh, java.lang.String.valueOf(i17)));
    }

    @Override // com.tencent.kinda.gen.KCountPickerView
    public void setFocus(boolean z17) {
        if (z17) {
            final com.tencent.mm.ui.widget.picker.c0 c0Var = new com.tencent.mm.ui.widget.picker.c0(this.mContext, this.mTimesArray);
            c0Var.f212259t = new com.tencent.mm.ui.widget.picker.a0() { // from class: com.tencent.kinda.framework.widget.base.KindaCountPickerViewImpl.1
                @Override // com.tencent.mm.ui.widget.picker.a0
                public void onResult(boolean z18, java.lang.Object obj, java.lang.Object obj2) {
                    if (z18) {
                        com.tencent.kinda.framework.widget.base.KindaCountPickerViewImpl.this.mSelectCreCountIndex = c0Var.b();
                        com.tencent.kinda.framework.widget.base.KindaCountPickerViewImpl.this.mEditText.setText(obj.toString());
                        com.tencent.kinda.framework.widget.base.KindaCountPickerViewImpl.this.mCountPickerCallback.onSelect(java.lang.String.valueOf(com.tencent.kinda.framework.widget.base.KindaCountPickerViewImpl.this.mSelectCreCountIndex));
                    }
                    c0Var.d();
                }
            };
            c0Var.i(this.mSelectCreCountIndex);
            c0Var.l();
        }
    }

    @Override // com.tencent.kinda.gen.KCountPickerView
    public void setOnSelectCallback(com.tencent.kinda.gen.KCountPickerViewOnSelectCallback kCountPickerViewOnSelectCallback) {
        this.mCountPickerCallback = kCountPickerViewOnSelectCallback;
    }

    @Override // com.tencent.kinda.gen.KCountPickerView
    public void setValue(java.lang.String str) {
    }
}
