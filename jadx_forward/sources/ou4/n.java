package ou4;

/* loaded from: classes8.dex */
public abstract class n implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f430528d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f430529e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f430530f;

    public final void a(java.lang.String eventName, java.util.Map map) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventName, "eventName");
        ou4.l lVar = new ou4.l(this, eventName, map);
        if (this.f430530f) {
            lVar.run();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.m2) this).f263102g, "callFlutter: not ready, queuing eventName=".concat(eventName));
            ((java.util.ArrayList) this.f430529e).add(lVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.m2 m2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.m2) this;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m2Var.f263102g, "onAttachedToEngine");
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        java.lang.String str = null;
        java.lang.Object[] objArr = 0;
        com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.InterfaceC25293x529e01b6.Companion.m93485x97a46f3a(com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.InterfaceC25293x529e01b6.INSTANCE, m137983x3b5b91dc, this instanceof com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.InterfaceC25293x529e01b6 ? (com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.InterfaceC25293x529e01b6) this : null, null, 4, null);
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc2 = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc2, "getBinaryMessenger(...)");
        m2Var.f263103h = new com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.C25290xc23c837a(m137983x3b5b91dc2, str, 2, objArr == true ? 1 : 0);
        this.f430530f = true;
        java.util.Iterator it = ((java.util.ArrayList) this.f430529e).iterator();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
        ((java.util.ArrayList) this.f430529e).clear();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.m2 m2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.m2) this;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m2Var.f263102g, "onDetachedFromEngine");
        this.f430530f = false;
        m2Var.f263103h = null;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.InterfaceC25293x529e01b6.Companion.m93485x97a46f3a(com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.InterfaceC25293x529e01b6.INSTANCE, m137983x3b5b91dc, null, null, 4, null);
        java.util.Collection values = this.f430528d.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            ((ou4.c0) it.next()).getClass();
        }
        this.f430528d.clear();
    }
}
