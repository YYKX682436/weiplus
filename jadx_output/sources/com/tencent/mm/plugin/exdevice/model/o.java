package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes13.dex */
public class o implements w32.d {

    /* renamed from: f, reason: collision with root package name */
    public static com.tencent.mm.plugin.exdevice.model.o f99005f;

    /* renamed from: a, reason: collision with root package name */
    public u32.n0 f99006a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.exdevice.model.n f99007b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Vector f99008c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f99009d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f99010e;

    public o() {
        new java.util.HashMap();
        this.f99009d = new byte[0];
        this.f99008c = new java.util.Vector();
        this.f99010e = new com.tencent.mm.sdk.platformtools.n3("ExdeviceHandlerThread");
    }

    @Override // w32.d
    public void a(long j17, int i17, int i18, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExDeviceTaskService", "onTaskSceneEnd, taskid =%d, errType =%d, errCode = %d, errMsg =%s, wattingtask size : %d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(this.f99008c.size()));
        synchronized (this.f99009d) {
            c();
        }
    }

    public boolean b(com.tencent.mm.plugin.exdevice.model.o3 o3Var) {
        this.f99010e.postToWorker(new com.tencent.mm.plugin.exdevice.model.m(this, o3Var));
        return true;
    }

    public final void c() {
        java.util.Vector vector = this.f99008c;
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExDeviceTaskService", "now watting task size is %d", java.lang.Integer.valueOf(vector.size()));
        if (vector.isEmpty()) {
            return;
        }
        b((com.tencent.mm.plugin.exdevice.model.o3) vector.remove(0));
    }
}
