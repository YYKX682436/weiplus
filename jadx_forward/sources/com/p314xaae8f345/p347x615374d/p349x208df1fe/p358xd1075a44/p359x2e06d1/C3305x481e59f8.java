package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1;

/* renamed from: com.tencent.kinda.framework.widget.base.KindaPhoneEditTextImpl */
/* loaded from: classes9.dex */
public class C3305x481e59f8 extends com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622 implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3498x3e26a75a {

    /* renamed from: clearButtonMode */
    private com.p314xaae8f345.p347x615374d.gen.EnumC3388xac047a02 f12813xe771c222 = com.p314xaae8f345.p347x615374d.gen.EnumC3388xac047a02.WHILEEDITING;

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622, com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: getClearButtonMode */
    public com.p314xaae8f345.p347x615374d.gen.EnumC3388xac047a02 mo26529xcbd393ec() {
        return this.f12813xe771c222;
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622, com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: getFocus */
    public boolean mo26530x746efb22() {
        return this.f13003x5f7d1257.isFocused();
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622, com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: getText */
    public java.lang.String mo26531xfb85ada3() {
        android.text.Editable text = this.f13003x5f7d1257.getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622, com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: setFocus */
    public void mo26532x52fd1596(boolean z17) {
        if (z17) {
            this.f13003x5f7d1257.requestFocus();
        } else {
            this.f13003x5f7d1257.clearFocus();
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622, com.p314xaae8f345.p347x615374d.gen.InterfaceC3453xd363fbc2
    /* renamed from: setText */
    public void mo26533x765074af(java.lang.String str) {
        if (str == null || mo26531xfb85ada3().equals(str)) {
            return;
        }
        this.f13003x5f7d1257.setText(str);
        if (str.contains("+")) {
            this.f13003x5f7d1257.setSelection(str.length());
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3498x3e26a75a
    /* renamed from: showTip */
    public void mo26534x7b38305e(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc abstractActivityC3282x418ff5cc = this.f13012x83fc3379;
        java.lang.String string = abstractActivityC3282x418ff5cc.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.kix);
        java.lang.String string2 = abstractActivityC3282x418ff5cc.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.kmf);
        qp5.x xVar = new qp5.x();
        android.view.View inflate = ((android.view.LayoutInflater) abstractActivityC3282x418ff5cc.getSystemService("layout_inflater")).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d7w, (android.view.ViewGroup) null);
        if (str2 != null && !str2.isEmpty()) {
            ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568867ob5)).setText(str2);
        }
        abstractActivityC3282x418ff5cc.mo53058xe5d1a549(db5.e1.w(abstractActivityC3282x418ff5cc, string, string2, inflate, xVar));
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3331x1644c622, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0
    /* renamed from: createView, reason: avoid collision after fix types in other method */
    public android.widget.LinearLayout mo26107x519d71c1(android.content.Context context) {
        android.widget.LinearLayout mo26107x519d71c1 = super.mo26107x519d71c1(context);
        if (context instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc) {
            mo26868x2c956328(11);
            ((com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc) context).m26057x8f91b80(this.f13003x5f7d1257, 0, false);
        }
        android.view.ViewGroup.LayoutParams layoutParams = this.f13003x5f7d1257.getLayoutParams();
        layoutParams.height = -2;
        this.f13003x5f7d1257.setLayoutParams(layoutParams);
        return mo26107x519d71c1;
    }
}
