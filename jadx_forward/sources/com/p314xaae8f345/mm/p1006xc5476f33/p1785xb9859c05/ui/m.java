package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes8.dex */
public class m implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.o f224461d;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.o oVar) {
        this.f224461d = oVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        java.lang.String charSequence2 = charSequence.toString();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String trim = charSequence2.replaceAll("[\\.\\-]", "").trim();
        boolean contains = trim.contains(" ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.o oVar = this.f224461d;
        if (contains) {
            trim = trim.replace(" ", "");
            oVar.f224484c.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.r(trim));
        } else if ((!oVar.f224503v.equals(trim) || i19 > 0) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(trim)) {
            oVar.f224503v = trim;
            oVar.f224484c.setText("");
        }
        if (t83.c.m(trim)) {
            java.lang.String a17 = t83.c.a(trim);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
                oVar.f224483b.setText("+" + a17);
                oVar.f224484c.setText(t83.c.b(trim));
            }
        } else if (!trim.equals(oVar.f224503v)) {
            oVar.f224503v = trim;
            oVar.f224484c.setText(trim);
            android.widget.TextView textView = oVar.f224483b;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(textView.getText().toString())) {
                textView.setText("+" + t83.c.h());
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.n nVar = oVar.f224482a;
        if (nVar != null) {
            java.lang.String obj = oVar.f224484c.getText().toString();
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16134x74658289 activityC16134x74658289 = (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16134x74658289) nVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallDialUI", "onModifyPhoneNumberByUser:phoneNumber:%s,mPhoneNumber:%s", obj, activityC16134x74658289.f224132q);
            int i27 = activityC16134x74658289.f224138w;
            if (i27 == 2 || i27 == -1 || activityC16134x74658289.f224132q.equals(obj)) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallDialUI", "modifyCountryCodeByUsder");
            activityC16134x74658289.f224138w = 2;
            if (activityC16134x74658289.f224137v == 1) {
                activityC16134x74658289.f224137v = 2;
            } else {
                activityC16134x74658289.f224137v = 4;
            }
        }
    }
}
