package cw2;

/* loaded from: classes10.dex */
public final class ja implements ne2.d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f305327a;

    public ja(java.lang.ref.WeakReference playerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(playerView, "playerView");
        this.f305327a = playerView;
    }

    @Override // ne2.d
    public void a(r45.q84 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        if (info.m75939xb282bd08(1) <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15201xe049f190 c15201xe049f190 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15201xe049f190) this.f305327a.get();
            if (c15201xe049f190 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveFeedPlayerView", "timer finish bug reference is null!");
            } else {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15201xe049f190.f212269p0;
                c15201xe049f190.R(true);
            }
        }
    }
}
