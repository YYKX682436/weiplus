package com.tencent.mm.booter;

/* loaded from: classes12.dex */
public class j implements com.tencent.mm.booter.b2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f63399a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f63400b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f63401c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.booter.CoreService f63402d;

    public j(com.tencent.mm.booter.CoreService coreService, int i17, int i18, byte[] bArr) {
        this.f63402d = coreService;
        this.f63399a = i17;
        this.f63400b = i18;
        this.f63401c = bArr;
    }

    public void a(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFailWithScene: opType=");
        int i17 = this.f63399a;
        sb6.append(i17);
        sb6.append(", respType=");
        int i18 = this.f63400b;
        sb6.append(i18);
        sb6.append(", scene=");
        sb6.append(str);
        com.tencent.mars.xlog.Log.w("MicroMsg.CoreService", sb6.toString());
        if (str == null) {
            str = "light_push_abort";
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.CoreService", "[scene = %s] deal with notify sync in push failed, pull main proc & deal notify in main proc", str);
        com.tencent.mm.booter.n.b(str);
        if (i17 == 1) {
            return;
        }
        com.tencent.mm.booter.l lVar = com.tencent.mm.booter.CoreService.f63234v;
        this.f63402d.g(i18, this.f63401c);
        a25.q qVar = (a25.q) i95.n0.c(a25.q.class);
        java.lang.Throwable th6 = new java.lang.Throwable();
        java.lang.String[] strArr = new java.lang.String[4];
        strArr[0] = "lightPushAbort";
        strArr[1] = str;
        strArr[2] = com.tencent.mm.sdk.platformtools.x2.f193077g ? "1" : "0";
        strArr[3] = java.lang.String.valueOf(i18);
        ((aq1.q0) qVar).getClass();
        uq3.h hVar = (uq3.h) i95.n0.c(uq3.h.class);
        java.lang.String[] keys = (java.lang.String[]) java.util.Arrays.copyOf(strArr, 4);
        ((com.tencent.mm.feature.performance.r4) hVar).getClass();
        kotlin.jvm.internal.o.g(keys, "keys");
        if (!(keys.length == 0)) {
            dr0.x0.f242571a.a(java.lang.String.valueOf(keys[0]), new com.tencent.mm.feature.performance.q4(keys, th6, null));
        }
    }

    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CoreService", "onSuccess: opType=" + this.f63399a + ", respType=" + this.f63400b);
    }
}
