package vi1;

/* loaded from: classes7.dex */
public final class p0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi1.b1 f518957d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f518958e;

    public p0(vi1.b1 b1Var, java.lang.String str) {
        this.f518957d = b1Var;
        this.f518958e = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.p1177xd1075a44.C12545x36e72905 c12545x36e72905;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("sendSms appId:");
        vi1.b1 b1Var = this.f518957d;
        java.lang.String str = b1Var.f518807b;
        sb6.append(str);
        sb6.append(", mobile:");
        java.lang.String mobile = this.f518958e;
        sb6.append(mobile);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PhoneNumberAddLogic", sb6.toString());
        vi1.e0 e0Var = b1Var.f518809d;
        if (e0Var != null && (c12545x36e72905 = ((vi1.j1) e0Var).f518880d) != null) {
            c12545x36e72905.f168945g.setVisibility(8);
            c12545x36e72905.f168944f.setVisibility(0);
            c12545x36e72905.f168944f.setText(c12545x36e72905.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572180a30, java.lang.Integer.valueOf(c12545x36e72905.f168949n)));
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = c12545x36e72905.f168951p;
            if (b4Var != null) {
                b4Var.d();
                c12545x36e72905.f168951p.c(1000L, 1000L);
            } else if (c12545x36e72905.getContext() != null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(c12545x36e72905.getContext().getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new wi1.c(c12545x36e72905), true);
                c12545x36e72905.f168951p = b4Var2;
                b4Var2.c(1000L, 1000L);
            } else {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var3 = c12545x36e72905.f168951p;
                if (b4Var3 != null) {
                    b4Var3.d();
                }
            }
        }
        android.content.Context context = b1Var.f518806a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g4 c17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g4.c(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a3u), true, null);
        vi1.l2 l2Var = vi1.l2.f518934a;
        vi1.j2 a17 = l2Var.a(str);
        if (a17 != null) {
            vi1.j2 a18 = l2Var.a(str);
            java.lang.Long valueOf = a18 != null ? java.lang.Long.valueOf(a18.f518896l) : null;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
            a17.f518896l = valueOf.longValue() + 1;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mobile, "mobile");
        vi1.u0 u0Var = new vi1.u0(b1Var, c17);
        r45.xz5 xz5Var = new r45.xz5();
        xz5Var.f472164d = str;
        xz5Var.f472165e = mobile;
        ((km5.q) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0) nd.f.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0.class)).e1("/cgi-bin/mmbiz-bin/wxaapp/customphone/sendverifycode", str, xz5Var, r45.yz5.class).n(new vi1.n(u0Var))).s(new vi1.o(u0Var));
    }
}
