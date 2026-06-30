package com.tencent.mm.plugin.base.stub;

/* loaded from: classes12.dex */
public class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v25.b f93773d;

    public m0(com.tencent.mm.plugin.base.stub.WXCommProvider wXCommProvider, v25.b bVar) {
        this.f93773d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (gm0.j1.a()) {
                c01.d9.e().g(new c01.ra(new com.tencent.mm.plugin.base.stub.l0(this), null));
            }
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXCommProvider", "exception in NetSceneLocalProxy");
            this.f93773d.a();
        }
    }
}
