package df2;

/* loaded from: classes3.dex */
public final class gi implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.wi f311753d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f311754e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.z53 f311755f;

    public gi(df2.wi wiVar, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, r45.z53 z53Var) {
        this.f311753d = wiVar;
        this.f311754e = c0Var;
        this.f311755f = z53Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        df2.wi wiVar = this.f311753d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(wiVar.f313223m, "dialog ok isInstall:" + this.f311754e.f391645d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.b3 b3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.b3.f183555a;
        android.content.Context O6 = wiVar.O6();
        java.lang.String m75945x2fec8307 = this.f311755f.m75945x2fec8307(3);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        b3Var.c(O6, m75945x2fec8307);
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.x2.f184206b == 18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.x2.f184205a.b(8);
        }
    }
}
