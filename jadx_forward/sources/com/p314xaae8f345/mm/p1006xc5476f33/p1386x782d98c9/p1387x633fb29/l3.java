package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

@j95.b
/* loaded from: classes12.dex */
public class l3 extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public v32.c f180506d;

    /* renamed from: e, reason: collision with root package name */
    public v32.g f180507e;

    /* renamed from: f, reason: collision with root package name */
    public v32.e f180508f;

    /* renamed from: g, reason: collision with root package name */
    public s32.d f180509g;

    /* renamed from: h, reason: collision with root package name */
    public ny3.b f180510h;

    /* renamed from: i, reason: collision with root package name */
    public s32.a f180511i;

    /* renamed from: m, reason: collision with root package name */
    public s32.b f180512m;

    /* renamed from: n, reason: collision with root package name */
    public s32.e f180513n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.o0 f180514o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.d0 f180515p;

    /* renamed from: q, reason: collision with root package name */
    public q32.c f180516q;

    /* renamed from: r, reason: collision with root package name */
    public q32.a f180517r;

    /* renamed from: s, reason: collision with root package name */
    public p32.b f180518s;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.d1 f180521v;

    /* renamed from: t, reason: collision with root package name */
    public n11.a f180519t = null;

    /* renamed from: u, reason: collision with root package name */
    public o11.g f180520u = null;

    /* renamed from: w, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p971x6de15a2e.s0 f180522w = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.g3(this);

    /* renamed from: x, reason: collision with root package name */
    public final l75.z0 f180523x = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.j3(this);

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3 Ai() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.class);
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.d0 Bi() {
        if (Ai().f180515p == null) {
            Ai().f180515p = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.d0();
        }
        return Ai().f180515p;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.o0 Di() {
        if (Ai().f180514o == null) {
            Ai().f180514o = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.o0();
        }
        return Ai().f180514o;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.d1 Ni() {
        if (Ai().f180521v == null) {
            Ai().f180521v = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.d1();
        }
        return Ai().f180521v;
    }

    public static s32.a Ri() {
        gm0.j1.b().c();
        if (Ai().f180511i == null) {
            Ai().f180511i = new s32.a(gm0.j1.u().f354686f);
        }
        return Ai().f180511i;
    }

    public static v32.c Ui() {
        gm0.j1.b().c();
        if (Ai().f180506d == null) {
            Ai().f180506d = new v32.c(gm0.j1.u().f354686f);
        }
        return Ai().f180506d;
    }

    public static v32.d Vi(long j17) {
        android.database.Cursor D = Zi().f514628d.D("HardIotCdnInfo", null, "msgid=?", new java.lang.String[]{java.lang.String.valueOf(j17)}, null, null, null, 2);
        if (D == null) {
            return null;
        }
        if (D.moveToFirst()) {
            v32.d dVar = new v32.d();
            dVar.mo9015xbf5d97fd(D);
            D.close();
            return dVar;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exdevice.HardIotCdnInfoStorage", "get null with msgId:" + j17);
        D.close();
        return null;
    }

    public static v32.e Zi() {
        gm0.j1.b().c();
        if (Ai().f180508f == null) {
            Ai().f180508f = new v32.e(gm0.j1.u().f354686f);
        }
        return Ai().f180508f;
    }

    public static v32.g aj() {
        gm0.j1.b().c();
        if (Ai().f180507e == null) {
            Ai().f180507e = new v32.g(gm0.j1.u().f354686f);
        }
        return Ai().f180507e;
    }

    public static s32.e bj() {
        gm0.j1.b().c();
        if (Ai().f180513n == null) {
            Ai().f180513n = new s32.e(gm0.j1.u().f354686f);
        }
        return Ai().f180513n;
    }

    public static q32.c cj() {
        if (Ai().f180516q == null) {
            Ai().f180516q = new q32.c();
        }
        return Ai().f180516q;
    }

    public static s32.d fj() {
        gm0.j1.b().c();
        if (Ai().f180509g == null) {
            Ai().f180509g = new s32.d(gm0.j1.u().f354686f);
        }
        return Ai().f180509g;
    }

    public static q32.a hj() {
        if (Ai().f180517r == null) {
            Ai().f180517r = new q32.a();
        }
        return Ai().f180517r;
    }

    public static ny3.b ij() {
        gm0.j1.b().c();
        if (Ai().f180510h == null) {
            Ai().f180510h = new ny3.b(gm0.j1.u().f354686f);
        }
        return Ai().f180510h;
    }

    public static s32.b wi() {
        gm0.j1.b().c();
        if (Ai().f180512m == null) {
            Ai().f180512m = new s32.b(gm0.j1.u().f354686f);
        }
        return Ai().f180512m;
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        super.mo204xfac946a6(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.SubCoreExDevice", "onAccountPostReset");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().a(this.f180523x);
        i32.s a17 = i32.s.a();
        a17.getClass();
        gm0.j1.n().f354821b.a(538, a17);
        Di().f180549e.mo48813x58998cd();
        Di().f180550f.mo48813x58998cd();
        Di().f180551g.mo48813x58998cd();
        Di().f180570z.mo48813x58998cd();
        Di().f180548d.mo48813x58998cd();
        Di().f180547c.mo48813x58998cd();
        Di().f180552h.mo48813x58998cd();
        Di().f180553i.mo48813x58998cd();
        ((zr.d) com.p314xaae8f345.mm.sdk.p2600x5c6729a.q.f273936a.a(zr.d.class)).N6(gm0.j1.b().f354778h, "MicroMsg.exdevice.SubCoreExDevice", Di().f180554j);
        Di().A.mo48813x58998cd();
        Di().f180555k.mo48813x58998cd();
        Di().f180556l.mo48813x58998cd();
        Di().f180557m.mo48813x58998cd();
        Di().f180558n.mo48813x58998cd();
        Di().f180560p.mo48813x58998cd();
        Di().f180559o.mo48813x58998cd();
        Di().f180564t.mo48813x58998cd();
        Di().f180562r.mo48813x58998cd();
        Di().f180563s.mo48813x58998cd();
        Di().f180565u.mo48813x58998cd();
        Di().B.mo48813x58998cd();
        Di().C.mo48813x58998cd();
        Di().f180561q.mo48813x58998cd();
        Di().f180566v.mo48813x58998cd();
        Di().f180567w.mo48813x58998cd();
        Di().f180568x.mo48813x58998cd();
        Di().f180569y.mo48813x58998cd();
        Di().L.mo48813x58998cd();
        Di().M.mo48813x58998cd();
        Di().N.mo48813x58998cd();
        Di().P.mo48813x58998cd();
        Di().O.mo48813x58998cd();
        Di().D.mo48813x58998cd();
        Di().F.mo48813x58998cd();
        Di().E.mo48813x58998cd();
        Di().G.mo48813x58998cd();
        Di().H.mo48813x58998cd();
        Di().f180544J.mo48813x58998cd();
        Di().K.mo48813x58998cd();
        Di().I.mo48813x58998cd();
        Di().Q.mo48813x58998cd();
        if (fp.h.c(19)) {
            try {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.k3(this), 30000L);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.SubCoreExDevice", "[hakon][step] exception in deviceFeaturesKVStat, %s", e17.getMessage());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.exdevice.SubCoreExDevice", e17, "", new java.lang.Object[0]);
            }
        }
        gm0.j1.n().a(this.f180522w);
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        super.mo836xb8969aab(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.SubCoreExDevice", "onAccountRelease");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(this.f180523x);
        Di().f180549e.mo48814x2efc64();
        Di().f180550f.mo48814x2efc64();
        Di().f180551g.mo48814x2efc64();
        Di().f180570z.mo48814x2efc64();
        Di().B.mo48814x2efc64();
        Di().f180548d.mo48814x2efc64();
        Di().f180547c.mo48814x2efc64();
        Di().f180552h.mo48814x2efc64();
        Di().f180553i.mo48814x2efc64();
        Di().A.mo48814x2efc64();
        Di().L.mo48814x2efc64();
        Di().M.mo48814x2efc64();
        Di().N.mo48814x2efc64();
        Di().P.mo48814x2efc64();
        Di().O.mo48814x2efc64();
        Di().D.mo48814x2efc64();
        Di().F.mo48814x2efc64();
        Di().G.mo48814x2efc64();
        Di().H.mo48814x2efc64();
        Di().f180544J.mo48814x2efc64();
        Di().K.mo48814x2efc64();
        Di().I.mo48814x2efc64();
        Di().f180557m.mo48814x2efc64();
        Di().Q.mo48814x2efc64();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "releaseAllSharePreferences");
        android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("exdevice_pref", 0);
        if (sharedPreferences == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "null == sp");
        } else if (!sharedPreferences.edit().clear().commit()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "sp.edit().clear().commit() Failed!!!");
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("exdevice_kv");
        if (M != null) {
            M.clear();
        }
        u32.w a17 = u32.h1.a();
        a17.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceInfoManager", "delAllDeviceAuthFlag");
        java.util.HashMap hashMap = a17.f505923a;
        if (hashMap == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExdeviceInfoManager", "null == exdeviceInfoList");
        } else {
            for (java.util.Map.Entry entry : hashMap.entrySet()) {
                u32.v vVar = (u32.v) entry.getValue();
                vVar.f505917f = false;
                entry.setValue(vVar);
            }
        }
        i32.s a18 = i32.s.a();
        a18.getClass();
        gm0.j1.n().f354821b.q(538, a18);
        i32.s.f369672g = null;
        Di().f180555k.mo48814x2efc64();
        Di().f180556l.mo48814x2efc64();
        Ai();
        java.util.HashMap hashMap2 = Bi().f180400c;
        if (hashMap2 != null && !hashMap2.isEmpty()) {
            java.util.Iterator it = hashMap2.entrySet().iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.sdk.p2603x2137b148.b4) ((java.util.Map.Entry) it.next()).getValue()).d();
            }
            hashMap2.clear();
        }
        if (Ai().f180516q != null) {
            q32.c cVar = Ai().f180516q;
            cVar.getClass();
            gm0.j1.n().f354821b.q(1042, cVar);
            gm0.j1.n().f354821b.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.v1.f33869x366c91de, cVar);
            gm0.j1.n().f354821b.q(1043, cVar);
            gm0.j1.n().f354821b.q(1040, cVar);
        }
        if (Ai().f180519t != null) {
            Ai().f180519t.c();
        }
        gm0.j1.n().d(this.f180522w);
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.SubCoreExDevice", "onCreate: ");
        if (this.f180515p == null) {
            this.f180515p = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.d0();
        }
        if (this.f180514o == null) {
            this.f180514o = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.o0();
        }
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4673x87f0d602.f19955x4fbc8495.mo40963x40b15f2e(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.h3(this));
    }
}
