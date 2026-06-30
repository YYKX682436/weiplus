package me5;

/* loaded from: classes5.dex */
public class o extends tg3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ih3.l f407515e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f407516f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f407517g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f407518h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f407519i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ me5.p f407520m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(me5.p pVar, int i17, r35.m3 m3Var, ih3.l lVar, java.util.Map map, android.os.Bundle bundle, java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2) {
        super(i17, m3Var);
        this.f407520m = pVar;
        this.f407515e = lVar;
        this.f407516f = map;
        this.f407517g = bundle;
        this.f407518h = weakReference;
        this.f407519i = weakReference2;
    }

    @Override // tg3.a
    public void a(android.view.View view) {
        ih3.l lVar;
        me5.p pVar = this.f407520m;
        java.lang.ref.WeakReference weakReference = pVar.f373128d;
        if (weakReference != null && weakReference.get() != null) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.yh yhVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.yh) ((ih3.m) weakReference.get());
            yhVar.getClass();
            if (view != null && (lVar = this.f407515e) != null) {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.add(lVar.f373126a);
                yhVar.n0(view, linkedList, lVar.f373127b);
            }
        }
        tg3.k1 k1Var = (tg3.k1) i95.n0.c(tg3.k1.class);
        pVar.getClass();
        ((ih3.e) k1Var).Di("link_revoke_qrcode", this.f407516f, this.f407517g, this.f407518h, this.f407519i);
    }
}
