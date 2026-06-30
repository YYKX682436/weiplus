package df2;

/* loaded from: classes10.dex */
public final class js implements ym5.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ df2.lt f312030a;

    public js(df2.lt ltVar) {
        this.f312030a = ltVar;
    }

    @Override // ym5.n3
    public void a(android.view.MotionEvent ev6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
    }

    @Override // ym5.n3
    public boolean b(int i17, android.view.MotionEvent event, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (event.getAction() == 0) {
            java.lang.String str = df2.lt.W;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePromoteBannerController", "bannerRv action down");
            p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f312030a.B;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
        }
        return z17;
    }
}
