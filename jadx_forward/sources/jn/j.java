package jn;

/* loaded from: classes11.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public java.util.concurrent.Future f382002a = null;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedDeque f382003b = new java.util.concurrent.ConcurrentLinkedDeque();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f382004c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f382005d = "";

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f382006e = new jn.h(this, "OpenImMigrateService");

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Runnable f382007f = new jn.i(this);

    public static void a(jn.j jVar, java.lang.String str) {
        jVar.getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(str);
        if (z07 != null) {
            z07.f69102x22419ccf = 3;
            ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().mo11260x413cb2b4(z07);
        }
    }

    public static void d(java.lang.String str, java.lang.String str2, int i17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6804x4b1d7ad2 c6804x4b1d7ad2 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6804x4b1d7ad2();
        c6804x4b1d7ad2.f141336d = c6804x4b1d7ad2.b("roomID", str, true);
        c6804x4b1d7ad2.f141337e = c6804x4b1d7ad2.b("oldRoomID", str2, true);
        c6804x4b1d7ad2.f141338f = i17;
        c6804x4b1d7ad2.k();
    }

    public void b(java.lang.String str, java.lang.String str2) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        objArr[0] = str == null ? "" : str;
        objArr[1] = str2 == null ? "" : str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.openIm.OpenImMigrateService", "addFirstMigrateTask %s %s", objArr);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str2, this.f382005d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.openIm.OpenImMigrateService", "addFirstMigrateTask in curChatName");
            return;
        }
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = this.f382003b;
        if (concurrentLinkedDeque.contains(str)) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            objArr2[0] = str != null ? str : "";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.openIm.OpenImMigrateService", "addFirstMigrateTask %s exist", objArr2);
            concurrentLinkedDeque.remove(str);
        } else {
            this.f382004c.put(str, str2);
        }
        concurrentLinkedDeque.addFirst(str);
        e();
    }

    public void c(java.lang.String str, java.lang.String str2) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        objArr[0] = str == null ? "" : str;
        objArr[1] = str2 == null ? "" : str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.openIm.OpenImMigrateService", "addMigrateTask %s %s", objArr);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str2, this.f382005d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.openIm.OpenImMigrateService", "addMigrateTask in curChatName");
            return;
        }
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = this.f382003b;
        if (!concurrentLinkedDeque.contains(str)) {
            this.f382004c.put(str, str2);
            concurrentLinkedDeque.add(str);
            e();
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            if (str == null) {
                str = "";
            }
            objArr2[0] = str;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.openIm.OpenImMigrateService", "addMigrateTask %s exist", objArr2);
        }
    }

    public final void e() {
        java.util.concurrent.Future future = this.f382002a;
        if (future != null && !future.isDone()) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.openIm.OpenImMigrateService", "running stack:%s", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            return;
        }
        this.f382002a = ((ku5.t0) ku5.t0.f394148d).h(this.f382007f, "migrate_tag");
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.openIm.OpenImMigrateService", "run stack:%s", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
    }
}
