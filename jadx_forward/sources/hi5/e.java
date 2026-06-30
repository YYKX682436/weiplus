package hi5;

/* loaded from: classes8.dex */
public final class e extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2721x33323e.C22452xfeb68e00 f363096a;

    public e(com.p314xaae8f345.mm.ui.p2721x33323e.C22452xfeb68e00 c22452xfeb68e00) {
        this.f363096a = c22452xfeb68e00;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (z17) {
            i95.m c17 = i95.n0.c(c00.x3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            c00.x3.m8((c00.x3) c17, bw5.n9.EXPOSE_WITHOUT_REDDOT, null, 2, null);
            if (((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0("Card.Entrance.Right") != null) {
                i95.m c18 = i95.n0.c(c00.x3.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                c00.x3.m8((c00.x3) c18, bw5.n9.EXPOSE_WITH_REDDOT, null, 2, null);
            }
            this.f363096a.i1(1);
        }
    }
}
