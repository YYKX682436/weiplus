package com.tencent.mm.plugin.exdevice.model;

@j95.b
/* loaded from: classes12.dex */
public class l3 extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public v32.c f98973d;

    /* renamed from: e, reason: collision with root package name */
    public v32.g f98974e;

    /* renamed from: f, reason: collision with root package name */
    public v32.e f98975f;

    /* renamed from: g, reason: collision with root package name */
    public s32.d f98976g;

    /* renamed from: h, reason: collision with root package name */
    public ny3.b f98977h;

    /* renamed from: i, reason: collision with root package name */
    public s32.a f98978i;

    /* renamed from: m, reason: collision with root package name */
    public s32.b f98979m;

    /* renamed from: n, reason: collision with root package name */
    public s32.e f98980n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.exdevice.model.o0 f98981o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.exdevice.model.d0 f98982p;

    /* renamed from: q, reason: collision with root package name */
    public q32.c f98983q;

    /* renamed from: r, reason: collision with root package name */
    public q32.a f98984r;

    /* renamed from: s, reason: collision with root package name */
    public p32.b f98985s;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.exdevice.model.d1 f98988v;

    /* renamed from: t, reason: collision with root package name */
    public n11.a f98986t = null;

    /* renamed from: u, reason: collision with root package name */
    public o11.g f98987u = null;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.network.s0 f98989w = new com.tencent.mm.plugin.exdevice.model.g3(this);

    /* renamed from: x, reason: collision with root package name */
    public final l75.z0 f98990x = new com.tencent.mm.plugin.exdevice.model.j3(this);

    public static com.tencent.mm.plugin.exdevice.model.l3 Ai() {
        return (com.tencent.mm.plugin.exdevice.model.l3) i95.n0.c(com.tencent.mm.plugin.exdevice.model.l3.class);
    }

    public static com.tencent.mm.plugin.exdevice.model.d0 Bi() {
        if (Ai().f98982p == null) {
            Ai().f98982p = new com.tencent.mm.plugin.exdevice.model.d0();
        }
        return Ai().f98982p;
    }

    public static com.tencent.mm.plugin.exdevice.model.o0 Di() {
        if (Ai().f98981o == null) {
            Ai().f98981o = new com.tencent.mm.plugin.exdevice.model.o0();
        }
        return Ai().f98981o;
    }

    public static com.tencent.mm.plugin.exdevice.model.d1 Ni() {
        if (Ai().f98988v == null) {
            Ai().f98988v = new com.tencent.mm.plugin.exdevice.model.d1();
        }
        return Ai().f98988v;
    }

    public static s32.a Ri() {
        gm0.j1.b().c();
        if (Ai().f98978i == null) {
            Ai().f98978i = new s32.a(gm0.j1.u().f273153f);
        }
        return Ai().f98978i;
    }

    public static v32.c Ui() {
        gm0.j1.b().c();
        if (Ai().f98973d == null) {
            Ai().f98973d = new v32.c(gm0.j1.u().f273153f);
        }
        return Ai().f98973d;
    }

    public static v32.d Vi(long j17) {
        android.database.Cursor D = Zi().f433095d.D("HardIotCdnInfo", null, "msgid=?", new java.lang.String[]{java.lang.String.valueOf(j17)}, null, null, null, 2);
        if (D == null) {
            return null;
        }
        if (D.moveToFirst()) {
            v32.d dVar = new v32.d();
            dVar.convertFrom(D);
            D.close();
            return dVar;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.exdevice.HardIotCdnInfoStorage", "get null with msgId:" + j17);
        D.close();
        return null;
    }

    public static v32.e Zi() {
        gm0.j1.b().c();
        if (Ai().f98975f == null) {
            Ai().f98975f = new v32.e(gm0.j1.u().f273153f);
        }
        return Ai().f98975f;
    }

    public static v32.g aj() {
        gm0.j1.b().c();
        if (Ai().f98974e == null) {
            Ai().f98974e = new v32.g(gm0.j1.u().f273153f);
        }
        return Ai().f98974e;
    }

    public static s32.e bj() {
        gm0.j1.b().c();
        if (Ai().f98980n == null) {
            Ai().f98980n = new s32.e(gm0.j1.u().f273153f);
        }
        return Ai().f98980n;
    }

    public static q32.c cj() {
        if (Ai().f98983q == null) {
            Ai().f98983q = new q32.c();
        }
        return Ai().f98983q;
    }

    public static s32.d fj() {
        gm0.j1.b().c();
        if (Ai().f98976g == null) {
            Ai().f98976g = new s32.d(gm0.j1.u().f273153f);
        }
        return Ai().f98976g;
    }

    public static q32.a hj() {
        if (Ai().f98984r == null) {
            Ai().f98984r = new q32.a();
        }
        return Ai().f98984r;
    }

    public static ny3.b ij() {
        gm0.j1.b().c();
        if (Ai().f98977h == null) {
            Ai().f98977h = new ny3.b(gm0.j1.u().f273153f);
        }
        return Ai().f98977h;
    }

    public static s32.b wi() {
        gm0.j1.b().c();
        if (Ai().f98979m == null) {
            Ai().f98979m = new s32.b(gm0.j1.u().f273153f);
        }
        return Ai().f98979m;
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.SubCoreExDevice", "onAccountPostReset");
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().a(this.f98990x);
        i32.s a17 = i32.s.a();
        a17.getClass();
        gm0.j1.n().f273288b.a(538, a17);
        Di().f99016e.alive();
        Di().f99017f.alive();
        Di().f99018g.alive();
        Di().f99037z.alive();
        Di().f99015d.alive();
        Di().f99014c.alive();
        Di().f99019h.alive();
        Di().f99020i.alive();
        ((zr.d) com.tencent.mm.sdk.event.q.f192403a.a(zr.d.class)).N6(gm0.j1.b().f273245h, "MicroMsg.exdevice.SubCoreExDevice", Di().f99021j);
        Di().A.alive();
        Di().f99022k.alive();
        Di().f99023l.alive();
        Di().f99024m.alive();
        Di().f99025n.alive();
        Di().f99027p.alive();
        Di().f99026o.alive();
        Di().f99031t.alive();
        Di().f99029r.alive();
        Di().f99030s.alive();
        Di().f99032u.alive();
        Di().B.alive();
        Di().C.alive();
        Di().f99028q.alive();
        Di().f99033v.alive();
        Di().f99034w.alive();
        Di().f99035x.alive();
        Di().f99036y.alive();
        Di().L.alive();
        Di().M.alive();
        Di().N.alive();
        Di().P.alive();
        Di().O.alive();
        Di().D.alive();
        Di().F.alive();
        Di().E.alive();
        Di().G.alive();
        Di().H.alive();
        Di().f99011J.alive();
        Di().K.alive();
        Di().I.alive();
        Di().Q.alive();
        if (fp.h.c(19)) {
            try {
                com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.exdevice.model.k3(this), 30000L);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.SubCoreExDevice", "[hakon][step] exception in deviceFeaturesKVStat, %s", e17.getMessage());
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.exdevice.SubCoreExDevice", e17, "", new java.lang.Object[0]);
            }
        }
        gm0.j1.n().a(this.f98989w);
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        super.onAccountReleased(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.SubCoreExDevice", "onAccountRelease");
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(this.f98990x);
        Di().f99016e.dead();
        Di().f99017f.dead();
        Di().f99018g.dead();
        Di().f99037z.dead();
        Di().B.dead();
        Di().f99015d.dead();
        Di().f99014c.dead();
        Di().f99019h.dead();
        Di().f99020i.dead();
        Di().A.dead();
        Di().L.dead();
        Di().M.dead();
        Di().N.dead();
        Di().P.dead();
        Di().O.dead();
        Di().D.dead();
        Di().F.dead();
        Di().G.dead();
        Di().H.dead();
        Di().f99011J.dead();
        Di().K.dead();
        Di().I.dead();
        Di().f99024m.dead();
        Di().Q.dead();
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "releaseAllSharePreferences");
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("exdevice_pref", 0);
        if (sharedPreferences == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "null == sp");
        } else if (!sharedPreferences.edit().clear().commit()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "sp.edit().clear().commit() Failed!!!");
        }
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("exdevice_kv");
        if (M != null) {
            M.clear();
        }
        u32.w a17 = u32.h1.a();
        a17.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceInfoManager", "delAllDeviceAuthFlag");
        java.util.HashMap hashMap = a17.f424390a;
        if (hashMap == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceInfoManager", "null == exdeviceInfoList");
        } else {
            for (java.util.Map.Entry entry : hashMap.entrySet()) {
                u32.v vVar = (u32.v) entry.getValue();
                vVar.f424384f = false;
                entry.setValue(vVar);
            }
        }
        i32.s a18 = i32.s.a();
        a18.getClass();
        gm0.j1.n().f273288b.q(538, a18);
        i32.s.f288139g = null;
        Di().f99022k.dead();
        Di().f99023l.dead();
        Ai();
        java.util.HashMap hashMap2 = Bi().f98867c;
        if (hashMap2 != null && !hashMap2.isEmpty()) {
            java.util.Iterator it = hashMap2.entrySet().iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.sdk.platformtools.b4) ((java.util.Map.Entry) it.next()).getValue()).d();
            }
            hashMap2.clear();
        }
        if (Ai().f98983q != null) {
            q32.c cVar = Ai().f98983q;
            cVar.getClass();
            gm0.j1.n().f273288b.q(1042, cVar);
            gm0.j1.n().f273288b.q(com.tencent.mm.plugin.appbrand.jsapi.auth.v1.CTRL_INDEX, cVar);
            gm0.j1.n().f273288b.q(1043, cVar);
            gm0.j1.n().f273288b.q(1040, cVar);
        }
        if (Ai().f98986t != null) {
            Ai().f98986t.c();
        }
        gm0.j1.n().d(this.f98989w);
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.SubCoreExDevice", "onCreate: ");
        if (this.f98982p == null) {
            this.f98982p = new com.tencent.mm.plugin.exdevice.model.d0();
        }
        if (this.f98981o == null) {
            this.f98981o = new com.tencent.mm.plugin.exdevice.model.o0();
        }
        com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner.INSTANCE.addLifecycleCallback(new com.tencent.mm.plugin.exdevice.model.h3(this));
    }
}
