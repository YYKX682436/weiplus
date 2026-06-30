package vy5;

/* loaded from: classes11.dex */
public final class g implements io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.StreamHandler {

    /* renamed from: d, reason: collision with root package name */
    public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.StreamHandler f523059d;

    public g(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.StreamHandler impl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(impl, "impl");
        this.f523059d = impl;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.StreamHandler
    /* renamed from: onCancel */
    public void mo14279x3d6f0539(java.lang.Object obj) {
        try {
            this.f523059d.mo14279x3d6f0539(obj);
        } catch (java.lang.Throwable th6) {
            io.p3284xd2ae381c.Log.e("MicroMsg.PatchedConnectivityPlugin", "onCancel() occurs an exception: " + th6, th6);
        }
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.StreamHandler
    /* renamed from: onListen */
    public void mo14280x4d3de486(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink eventSink) {
        try {
            io.p3284xd2ae381c.Log.i("MicroMsg.PatchedConnectivityPlugin", "onListen, arguments:" + obj + ", event:" + eventSink);
            this.f523059d.mo14280x4d3de486(obj, eventSink);
        } catch (java.lang.Throwable th6) {
            io.p3284xd2ae381c.Log.e("MicroMsg.PatchedConnectivityPlugin", "onListen() occurs an exception: " + th6, th6);
        }
    }
}
