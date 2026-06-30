package com.tencent.kinda.framework.widget.base;

/* loaded from: classes9.dex */
public class KindaPhoneEditTextImpl extends com.tencent.kinda.framework.widget.base.MMKEditText implements com.tencent.kinda.gen.KPhoneEditText {
    private com.tencent.kinda.gen.ClearButtonMode clearButtonMode = com.tencent.kinda.gen.ClearButtonMode.WHILEEDITING;

    @Override // com.tencent.kinda.framework.widget.base.MMKEditText, com.tencent.kinda.gen.KEditText
    public com.tencent.kinda.gen.ClearButtonMode getClearButtonMode() {
        return this.clearButtonMode;
    }

    @Override // com.tencent.kinda.framework.widget.base.MMKEditText, com.tencent.kinda.gen.KEditText
    public boolean getFocus() {
        return this.editText.isFocused();
    }

    @Override // com.tencent.kinda.framework.widget.base.MMKEditText, com.tencent.kinda.gen.KEditText
    public java.lang.String getText() {
        android.text.Editable text = this.editText.getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    @Override // com.tencent.kinda.framework.widget.base.MMKEditText, com.tencent.kinda.gen.KEditText
    public void setFocus(boolean z17) {
        if (z17) {
            this.editText.requestFocus();
        } else {
            this.editText.clearFocus();
        }
    }

    @Override // com.tencent.kinda.framework.widget.base.MMKEditText, com.tencent.kinda.gen.KEditText
    public void setText(java.lang.String str) {
        if (str == null || getText().equals(str)) {
            return;
        }
        this.editText.setText(str);
        if (str.contains("+")) {
            this.editText.setSelection(str.length());
        }
    }

    @Override // com.tencent.kinda.gen.KPhoneEditText
    public void showTip(java.lang.String str, java.lang.String str2) {
        com.tencent.kinda.framework.widget.base.BaseFrActivity baseFrActivity = this.mBaseFrActivity;
        java.lang.String string = baseFrActivity.getResources().getString(com.tencent.mm.R.string.kix);
        java.lang.String string2 = baseFrActivity.getResources().getString(com.tencent.mm.R.string.kmf);
        qp5.x xVar = new qp5.x();
        android.view.View inflate = ((android.view.LayoutInflater) baseFrActivity.getSystemService("layout_inflater")).inflate(com.tencent.mm.R.layout.d7w, (android.view.ViewGroup) null);
        if (str2 != null && !str2.isEmpty()) {
            ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487334ob5)).setText(str2);
        }
        baseFrActivity.addDialog(db5.e1.w(baseFrActivity, string, string2, inflate, xVar));
    }

    @Override // com.tencent.kinda.framework.widget.base.MMKEditText, com.tencent.kinda.framework.widget.base.MMKView
    public android.widget.LinearLayout createView(android.content.Context context) {
        android.widget.LinearLayout createView = super.createView(context);
        if (context instanceof com.tencent.kinda.framework.widget.base.BaseFrActivity) {
            setMaxLength(11);
            ((com.tencent.kinda.framework.widget.base.BaseFrActivity) context).setEditFocusListener(this.editText, 0, false);
        }
        android.view.ViewGroup.LayoutParams layoutParams = this.editText.getLayoutParams();
        layoutParams.height = -2;
        this.editText.setLayoutParams(layoutParams);
        return createView;
    }
}
