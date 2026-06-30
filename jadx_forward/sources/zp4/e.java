package zp4;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final zp4.e f556487a = new zp4.e();

    public final l75.k0 a() {
        jm0.i iVar = jm0.k.f381802h;
        l75.k0 Q4 = ((zp4.c) iVar.a(zp4.c.class)).Q4();
        if (Q4 != null) {
            return Q4;
        }
        b();
        l75.k0 Q42 = ((zp4.c) iVar.a(zp4.c.class)).Q4();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Q42);
        return Q42;
    }

    public final void b() {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_BACKGROUND_VIDEO_DATA_DB_VERSION_INT;
        java.lang.Object m17 = c17.m(u3Var, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) m17).intValue();
        if (intValue != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg，BackgroundVideoInfoStorageManager", "diff sql version， delete sql file, " + intValue + ", 0");
            com.p314xaae8f345.mm.vfs.w6.f(gm0.j1.u().h() + "mediaOpt/remux/dbFolder/");
        }
        synchronized (jm0.k.f381803i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(zp4.c.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(zp4.c.class);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(gm0.j1.u().h() + "mediaOpt/remux/dbFolder/");
        sb6.append("background_video_table.db");
        if (((zp4.c) a17).O6(sb6.toString())) {
            gm0.j1.u().c().x(u3Var, 0);
        }
    }

    public final dm.q0 c(int i17, int i18) {
        l75.k0 a17 = a();
        p75.m c17 = new p75.r0("sns_local_id", java.lang.String.valueOf(i17)).c(new p75.r0("sns_create_time", java.lang.String.valueOf(i18)));
        p75.i0 i19 = dm.q0.R.i();
        i19.f434189c = "MicroMsg，BackgroundVideoInfoStorageManager";
        i19.f434190d = c17;
        dm.q0 q0Var = (dm.q0) i19.a().o(a17, dm.q0.class);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("selectVideoInfoBySnsLocalIdAndCreateTime >> snsLocalId: ");
        sb6.append(i17);
        sb6.append(", snsCreateTime: ");
        sb6.append(i18);
        sb6.append(", result is find: ");
        sb6.append(q0Var != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg，BackgroundVideoInfoStorageManager", sb6.toString());
        return q0Var;
    }

    public final dm.q0 d(java.lang.String workTagId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(workTagId, "workTagId");
        l75.k0 a17 = a();
        p75.i0 i17 = dm.q0.R.i();
        i17.f434190d = dm.q0.S.j(workTagId);
        i17.f434189c = "MicroMsg.SDK.BaseBackgroundVideoInfo";
        dm.q0 q0Var = (dm.q0) i17.a().o(a17, dm.q0.class);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("selectVideoInfoByWorkTagId >> workTagId: ");
        sb6.append(workTagId);
        sb6.append(", result is find: ");
        sb6.append(q0Var != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg，BackgroundVideoInfoStorageManager", sb6.toString());
        return q0Var;
    }

    public final void e(java.lang.String workTagId, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(workTagId, "workTagId");
        l75.k0 a17 = a();
        p75.n0 n0Var = dm.q0.R;
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("is_sns_double_check", java.lang.Integer.valueOf(z17 ? 1 : 2));
        p75.m0 j17 = dm.q0.S.j(workTagId);
        p75.h1 j18 = dm.q0.R.j(contentValues);
        j18.b(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg，BackgroundVideoInfoStorageManager", "updateUseSnsDoubleCheckByWorkTagId >> workTagId: " + workTagId + ", isUse: " + z17 + ", result: " + j18.a().f(a17));
    }

    public final void f(java.lang.String workTagId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(workTagId, "workTagId");
        l75.k0 a17 = a();
        p75.n0 n0Var = dm.q0.R;
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("work_type", java.lang.Integer.valueOf(i17));
        p75.m0 j17 = dm.q0.S.j(workTagId);
        p75.h1 j18 = dm.q0.R.j(contentValues);
        j18.b(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg，BackgroundVideoInfoStorageManager", "updateWorkTypeByWorkTagId >> workTagId: " + workTagId + ", workType: " + i17 + ", result: " + j18.a().f(a17));
    }
}
