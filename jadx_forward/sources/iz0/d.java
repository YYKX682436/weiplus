package iz0;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final iz0.d f377577a = new iz0.d();

    public final l75.k0 a() {
        jm0.i iVar = jm0.k.f381802h;
        l75.k0 Q4 = ((iz0.b) iVar.a(iz0.b.class)).Q4();
        if (Q4 != null) {
            return Q4;
        }
        b();
        l75.k0 Q42 = ((iz0.b) iVar.a(iz0.b.class)).Q4();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Q42);
        return Q42;
    }

    public final void b() {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_TEMPLATE_BACKGROUND_VIDEO_DATA_DB_VERSION_INT;
        java.lang.Object m17 = c17.m(u3Var, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) m17).intValue();
        java.lang.String str = gm0.j1.u().h() + "mediaOpt/maas_clip/dbFolder/";
        if (intValue != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TemplateBackgroundVideoInfoStorageManager", "diff sql version， delete sql file, " + intValue + ", 0");
            com.p314xaae8f345.mm.vfs.w6.f(str);
        }
        synchronized (jm0.k.f381803i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(iz0.b.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(iz0.b.class);
        }
        if (((iz0.b) a17).O6(str + "template_background_video_table.db")) {
            gm0.j1.u().c().x(u3Var, 0);
        }
    }

    public final dm.ib c(int i17, int i18) {
        l75.k0 a17 = a();
        p75.m c17 = new p75.r0("sns_local_id", java.lang.String.valueOf(i17)).c(new p75.r0("sns_create_time", java.lang.String.valueOf(i18)));
        p75.i0 i19 = dm.ib.f319203y.i();
        i19.f434189c = "MicroMsg.TemplateBackgroundVideoInfoStorageManager";
        i19.f434190d = c17;
        dm.ib ibVar = (dm.ib) i19.a().o(a17, dm.ib.class);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("selectVideoInfoBySnsLocalIdAndCreateTime >> snsLocalId: ");
        sb6.append(i17);
        sb6.append(", snsCreateTime: ");
        sb6.append(i18);
        sb6.append(", result is find: ");
        sb6.append(ibVar != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TemplateBackgroundVideoInfoStorageManager", sb6.toString());
        return ibVar;
    }

    public final dm.ib d(java.lang.String workTagId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(workTagId, "workTagId");
        l75.k0 a17 = a();
        p75.i0 i17 = dm.ib.f319203y.i();
        i17.f434190d = dm.ib.f319204z.j(workTagId);
        i17.f434189c = "MicroMsg.SDK.BaseTemplateBackgroundVideoInfo";
        dm.ib ibVar = (dm.ib) i17.a().o(a17, dm.ib.class);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("selectVideoInfoByWorkTagId >> workTagId: ");
        sb6.append(workTagId);
        sb6.append(", workType:");
        sb6.append(ibVar != null ? java.lang.Integer.valueOf(ibVar.f67037xdb9e6ea3) : null);
        sb6.append(", result is find: ");
        sb6.append(ibVar != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TemplateBackgroundVideoInfoStorageManager", sb6.toString());
        return ibVar;
    }

    public final void e(java.lang.String workTagId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(workTagId, "workTagId");
        l75.k0 a17 = a();
        p75.n0 n0Var = dm.ib.f319203y;
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("work_type", java.lang.Integer.valueOf(i17));
        p75.m0 j17 = dm.ib.f319204z.j(workTagId);
        p75.h1 j18 = dm.ib.f319203y.j(contentValues);
        j18.b(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TemplateBackgroundVideoInfoStorageManager", "updateWorkTypeByWorkTagId >> workTagId: " + workTagId + ", workType: " + i17 + ", result: " + j18.a().f(a17));
    }
}
