package ow;

/* loaded from: classes11.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f430809d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.p0 f430810e;

    public z(java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        this.f430809d = str;
        this.f430810e = p0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yw.a3 a3Var = yw.a3.f547799a;
        java.lang.String g17 = x51.j1.g(this.f430810e.f152259a.f459094h);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "skstringToString(...)");
        java.lang.String type = this.f430809d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        if (!yw.a3.f547803e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FlutterBrandServiceBridge", "onReceiveXmlPush hasInit=" + yw.a3.f547803e);
        } else if (zv.q.f557612a.g()) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3135xb0941fd.v.f297582c.p(type, g17, yw.x2.f548041a);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterBrandServiceBridge", "onReceiveXmlPush but not use aff. discard this msg");
        }
    }
}
