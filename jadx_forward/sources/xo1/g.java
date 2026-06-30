package xo1;

/* loaded from: classes5.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f537284d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f537285e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.lang.ref.WeakReference weakReference, java.util.List list) {
        super(0);
        this.f537284d = weakReference;
        this.f537285e = list;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1266xb06b1e56.ActivityC12862xdeb2e81d activityC12862xdeb2e81d = (com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1266xb06b1e56.ActivityC12862xdeb2e81d) this.f537284d.get();
        if (activityC12862xdeb2e81d != null && !activityC12862xdeb2e81d.mo78538xecd98af8() && !activityC12862xdeb2e81d.isFinishing() && !activityC12862xdeb2e81d.isDestroyed()) {
            activityC12862xdeb2e81d.U6((po1.d) kz5.n0.Z(this.f537285e));
        }
        return jz5.f0.f384359a;
    }
}
