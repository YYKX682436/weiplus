package vi1;

/* loaded from: classes7.dex */
public final class h3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi1.k3 f518861d;

    public h3(vi1.k3 k3Var) {
        this.f518861d = k3Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.text.Editable text;
        android.text.Editable text2;
        android.text.Editable text3;
        java.lang.Object[] objArr = new java.lang.Object[1];
        vi1.k3 k3Var = this.f518861d;
        android.widget.EditText editText = k3Var.f518923g;
        java.lang.Integer num = null;
        boolean z17 = false;
        objArr[0] = editText != null ? editText.getText() : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PhoneNumberVerifyCodeDialog", "to verify sms %s", objArr);
        android.widget.EditText editText2 = k3Var.f518923g;
        if (editText2 != null && (text3 = editText2.getText()) != null && text3.length() == 6) {
            z17 = true;
        }
        android.content.Context context = k3Var.f518917a;
        if (!z17) {
            java.lang.Integer valueOf = (editText2 == null || (text2 = editText2.getText()) == null) ? null : java.lang.Integer.valueOf(text2.length());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
            if (valueOf.intValue() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PhoneNumberVerifyCodeDialog", "code is empty");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.m1.a(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571682ma), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571676m4), vi1.f3.f518853d);
                return;
            }
            if (editText2 != null && (text = editText2.getText()) != null) {
                num = java.lang.Integer.valueOf(text.length());
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
            if (num.intValue() < 6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PhoneNumberVerifyCodeDialog", "code is length is < 6");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.m1.a(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571683mb), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571676m4), vi1.g3.f518857d);
                return;
            }
            return;
        }
        dialogInterface.dismiss();
        k3Var.g();
        android.view.View view = k3Var.f518922f;
        if (view != null) {
            view.post(new vi1.b3(k3Var));
        }
        java.lang.String valueOf2 = java.lang.String.valueOf(editText2 != null ? editText2.getText() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PhoneNumberVerifyCodeDialog", "doVerifyCode");
        vi1.j2 j2Var = k3Var.f518919c;
        if (j2Var != null) {
            java.lang.Long valueOf3 = java.lang.Long.valueOf(j2Var.f518908x);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf3);
            j2Var.f518908x = valueOf3.longValue() + 1;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g4 c17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g4.c(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a3w), true, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581 c12542x3a17e581 = k3Var.f518920d;
        boolean z18 = c12542x3a17e581.f168939n;
        java.lang.String mobile = c12542x3a17e581.f168932d;
        java.lang.String appId = k3Var.f518918b;
        if (z18) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mobile, "mobile");
            vi1.w2 w2Var = new vi1.w2(c17, k3Var);
            r45.w20 w20Var = new r45.w20();
            w20Var.f470331d = appId;
            w20Var.f470332e = mobile;
            w20Var.f470333f = valueOf2;
            ((km5.q) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0) nd.f.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0.class)).e1("/cgi-bin/mmbiz-bin/wxaapp/checkverifycode", appId, w20Var, r45.x20.class).n(new vi1.i(w2Var))).s(new vi1.j(w2Var));
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mobile, "mobile");
        vi1.z2 z2Var = new vi1.z2(c17, k3Var);
        r45.w20 w20Var2 = new r45.w20();
        w20Var2.f470331d = appId;
        w20Var2.f470332e = mobile;
        w20Var2.f470333f = valueOf2;
        ((km5.q) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0) nd.f.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0.class)).e1("/cgi-bin/mmbiz-bin/wxaapp/customphone/checkverifycode", appId, w20Var2, r45.x20.class).n(new vi1.g(z2Var))).s(new vi1.h(z2Var));
    }
}
