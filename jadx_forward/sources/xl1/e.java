package xl1;

/* loaded from: classes7.dex */
public class e implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.sms.C12811x748ecb f536637d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.sms.C12811x748ecb c12811x748ecb) {
        this.f536637d = c12811x748ecb;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        android.widget.TextView[] textViewArr;
        xl1.i iVar;
        if (editable == null) {
            return;
        }
        editable.toString();
        java.lang.String obj = editable.toString();
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.sms.C12811x748ecb.f173642g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.sms.C12811x748ecb c12811x748ecb = this.f536637d;
        c12811x748ecb.getClass();
        int length = obj.length();
        int i18 = 0;
        while (true) {
            textViewArr = c12811x748ecb.f173643d;
            if (i18 >= length) {
                break;
            }
            char charAt = obj.charAt(i18);
            textViewArr[i18].setText(java.lang.String.valueOf(charAt));
            textViewArr[i18].setSelected(false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditVerifyCodeViewNew", "i:%d text:%s", java.lang.Integer.valueOf(i18), java.lang.String.valueOf(charAt));
            i18++;
        }
        boolean z17 = true;
        int i19 = length;
        while (true) {
            if (i19 >= 6) {
                break;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditVerifyCodeViewNew", "i:%d text:%s", java.lang.Integer.valueOf(i19), "");
            textViewArr[i19].setText("");
            if (z17) {
                textViewArr[i19].setSelected(true);
                z17 = false;
            } else {
                textViewArr[i19].setSelected(false);
            }
            i19++;
        }
        if (length != 6 || (iVar = c12811x748ecb.f173645f) == null) {
            return;
        }
        vi1.z3 z3Var = ((vi1.o3) iVar).f518955a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.sms.C12811x748ecb c12811x748ecb2 = z3Var.f519061r;
        java.lang.String m53695xfb85ada3 = c12811x748ecb2 != null ? c12811x748ecb2.m53695xfb85ada3() : null;
        java.lang.String str = m53695xfb85ada3 != null ? m53695xfb85ada3 : "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.FULL.PhoneNumberVerifyCodeDialogNew", "doVerifyCode: code:".concat(str));
        vi1.j2 j2Var = z3Var.f519053g;
        if (j2Var != null) {
            java.lang.Long valueOf = java.lang.Long.valueOf(j2Var.f518908x);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
            j2Var.f518908x = valueOf.longValue() + 1;
        }
        android.content.Context context = z3Var.f519050d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g4 c17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g4.c(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a3w), true, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581 c12542x3a17e581 = z3Var.f519054h;
        boolean z18 = c12542x3a17e581.f168939n;
        java.lang.String mobile = c12542x3a17e581.f168932d;
        java.lang.String appId = z3Var.f519052f;
        if (z18) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mobile, "mobile");
            vi1.w3 w3Var = new vi1.w3(z3Var, c17);
            r45.w20 w20Var = new r45.w20();
            w20Var.f470331d = appId;
            w20Var.f470332e = mobile;
            w20Var.f470333f = str;
            ((km5.q) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0) nd.f.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0.class)).e1("/cgi-bin/mmbiz-bin/wxaapp/checkverifycode", appId, w20Var, r45.x20.class).n(new vi1.i(w3Var))).s(new vi1.j(w3Var));
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mobile, "mobile");
        vi1.y3 y3Var = new vi1.y3(c17, z3Var);
        r45.w20 w20Var2 = new r45.w20();
        w20Var2.f470331d = appId;
        w20Var2.f470332e = mobile;
        w20Var2.f470333f = str;
        ((km5.q) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0) nd.f.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0.class)).e1("/cgi-bin/mmbiz-bin/wxaapp/customphone/checkverifycode", appId, w20Var2, r45.x20.class).n(new vi1.g(y3Var))).s(new vi1.h(y3Var));
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
