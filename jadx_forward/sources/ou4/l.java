package ou4;

/* loaded from: classes8.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ou4.n f430522d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f430523e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f430524f;

    public l(ou4.n nVar, java.lang.String str, java.util.Map map) {
        this.f430522d = nVar;
        this.f430523e = str;
        this.f430524f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Map<java.lang.String, ? extends java.lang.Object> map = this.f430524f;
        if (!(map instanceof java.util.Map)) {
            map = null;
        }
        ou4.n nVar = this.f430522d;
        java.lang.String eventName = this.f430523e;
        ou4.k kVar = new ou4.k(nVar, eventName);
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.m2 m2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.m2) nVar;
        m2Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventName, "eventName");
        com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.C25290xc23c837a c25290xc23c837a = m2Var.f263103h;
        if (c25290xc23c837a != null) {
            c25290xc23c837a.m93480xc038d2dc(eventName, map, kVar);
        }
    }
}
