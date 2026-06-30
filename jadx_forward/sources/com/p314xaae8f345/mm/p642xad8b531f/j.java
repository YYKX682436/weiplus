package com.p314xaae8f345.mm.p642xad8b531f;

/* loaded from: classes12.dex */
public class j implements com.p314xaae8f345.mm.p642xad8b531f.b2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f144932a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f144933b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f144934c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p642xad8b531f.ServiceC10285xbf7f55f6 f144935d;

    public j(com.p314xaae8f345.mm.p642xad8b531f.ServiceC10285xbf7f55f6 serviceC10285xbf7f55f6, int i17, int i18, byte[] bArr) {
        this.f144935d = serviceC10285xbf7f55f6;
        this.f144932a = i17;
        this.f144933b = i18;
        this.f144934c = bArr;
    }

    public void a(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFailWithScene: opType=");
        int i17 = this.f144932a;
        sb6.append(i17);
        sb6.append(", respType=");
        int i18 = this.f144933b;
        sb6.append(i18);
        sb6.append(", scene=");
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CoreService", sb6.toString());
        if (str == null) {
            str = "light_push_abort";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CoreService", "[scene = %s] deal with notify sync in push failed, pull main proc & deal notify in main proc", str);
        com.p314xaae8f345.mm.p642xad8b531f.n.b(str);
        if (i17 == 1) {
            return;
        }
        com.p314xaae8f345.mm.p642xad8b531f.l lVar = com.p314xaae8f345.mm.p642xad8b531f.ServiceC10285xbf7f55f6.f144767v;
        this.f144935d.g(i18, this.f144934c);
        a25.q qVar = (a25.q) i95.n0.c(a25.q.class);
        java.lang.Throwable th6 = new java.lang.Throwable();
        java.lang.String[] strArr = new java.lang.String[4];
        strArr[0] = "lightPushAbort";
        strArr[1] = str;
        strArr[2] = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274610g ? "1" : "0";
        strArr[3] = java.lang.String.valueOf(i18);
        ((aq1.q0) qVar).getClass();
        uq3.h hVar = (uq3.h) i95.n0.c(uq3.h.class);
        java.lang.String[] keys = (java.lang.String[]) java.util.Arrays.copyOf(strArr, 4);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.r4) hVar).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keys, "keys");
        if (!(keys.length == 0)) {
            dr0.x0.f324104a.a(java.lang.String.valueOf(keys[0]), new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.q4(keys, th6, null));
        }
    }

    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CoreService", "onSuccess: opType=" + this.f144932a + ", respType=" + this.f144933b);
    }
}
