package cw2;

/* loaded from: classes10.dex */
public final class m9 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentSkipListMap f305406a = new java.util.concurrent.ConcurrentSkipListMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentSkipListMap f305407b = new java.util.concurrent.ConcurrentSkipListMap();

    /* renamed from: c, reason: collision with root package name */
    public final cw2.l9 f305408c = new cw2.l9(this);

    public final boolean a(kk4.c cVar) {
        int i17 = ((c61.l7) i95.n0.c(c61.l7.class)).ek().f546241y * 1000;
        kk4.f0 f0Var = (kk4.f0) cVar;
        long mo100920x21a0b6d0 = f0Var.mo100920x21a0b6d0() - f0Var.mo100915xddd35a52();
        return mo100920x21a0b6d0 < ((long) i17) && mo100920x21a0b6d0 < f0Var.mo100917x37a7fa50();
    }

    public final void b(java.lang.String mediaId, kk4.c player) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(player, "player");
        cw2.j9 j9Var = (cw2.j9) this.f305406a.get(mediaId);
        if (j9Var == null || !a(player)) {
            return;
        }
        j9Var.f305325c++;
    }
}
