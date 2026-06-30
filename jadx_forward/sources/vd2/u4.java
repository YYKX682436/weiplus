package vd2;

/* loaded from: classes3.dex */
public final class u4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c f517465d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f517466e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c c14167x40aca97c, boolean z17) {
        super(0);
        this.f517465d = c14167x40aca97c;
        this.f517466e = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c c14167x40aca97c = this.f517465d;
        if (!c14167x40aca97c.f193014J) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#setNewGuide isRealHistory=");
            boolean z17 = this.f517466e;
            sb6.append(z17);
            sb6.append(" scroll, cur data pos:");
            sb6.append(c14167x40aca97c.f193028t.f517588f);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveViewCallback", sb6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c.N = z17 ? 1 : 2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveViewCallback", "#detachSnapHelperToRV");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.o6) ((jz5.n) c14167x40aca97c.f193024p).mo141623x754a37bb()).b(null);
            c14167x40aca97c.f193025q.b1(0, z17 ? -c14167x40aca97c.f193034z : c14167x40aca97c.A, new android.view.animation.DecelerateInterpolator());
            pm0.v.V(100L, new vd2.t4(z17, c14167x40aca97c));
            c14167x40aca97c.x(!z17, true);
        }
        return jz5.f0.f384359a;
    }
}
