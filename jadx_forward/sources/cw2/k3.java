package cw2;

/* loaded from: classes10.dex */
public final class k3 implements ne2.d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f305335a;

    public k3(java.lang.ref.WeakReference rFinderLivePlayView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rFinderLivePlayView, "rFinderLivePlayView");
        this.f305335a = rFinderLivePlayView;
    }

    @Override // ne2.d
    public void a(r45.q84 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        if (info.m75939xb282bd08(1) <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b c15182x1607686b = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b) this.f305335a.get();
            if (c15182x1607686b == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePlayView", "timer finish bug reference is null!");
            } else {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b.f212130p1;
                c15182x1607686b.q(true);
            }
        }
    }
}
