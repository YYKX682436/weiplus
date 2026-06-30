package df2;

/* loaded from: classes10.dex */
public final class jr implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.lt f312028d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f312029e;

    public jr(df2.lt ltVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f312028d = ltVar;
        this.f312029e = h0Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        java.lang.String str = df2.lt.W;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePromoteBannerController", "dismiss half dialog");
        df2.lt ltVar = this.f312028d;
        ltVar.T = null;
        ltVar.f312248w = true;
        ltVar.x7();
        ((yg0.u3) ((zg0.c3) i95.n0.c(zg0.c3.class))).Ai((java.lang.String) this.f312029e.f391656d);
        dk2.ef.f314905a.V(false);
    }
}
