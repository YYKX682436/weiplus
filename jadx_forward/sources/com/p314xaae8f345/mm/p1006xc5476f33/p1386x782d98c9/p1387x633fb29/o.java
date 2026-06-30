package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes13.dex */
public class o implements w32.d {

    /* renamed from: f, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.o f180538f;

    /* renamed from: a, reason: collision with root package name */
    public u32.n0 f180539a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.n f180540b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Vector f180541c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f180542d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f180543e;

    public o() {
        new java.util.HashMap();
        this.f180542d = new byte[0];
        this.f180541c = new java.util.Vector();
        this.f180543e = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("ExdeviceHandlerThread");
    }

    @Override // w32.d
    public void a(long j17, int i17, int i18, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExDeviceTaskService", "onTaskSceneEnd, taskid =%d, errType =%d, errCode = %d, errMsg =%s, wattingtask size : %d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(this.f180541c.size()));
        synchronized (this.f180542d) {
            c();
        }
    }

    public boolean b(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.o3 o3Var) {
        this.f180543e.m77784x795fa299(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.m(this, o3Var));
        return true;
    }

    public final void c() {
        java.util.Vector vector = this.f180541c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExDeviceTaskService", "now watting task size is %d", java.lang.Integer.valueOf(vector.size()));
        if (vector.isEmpty()) {
            return;
        }
        b((com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.o3) vector.remove(0));
    }
}
