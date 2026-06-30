package j13;

/* loaded from: classes8.dex */
public final class a extends l75.n0 {

    /* renamed from: d, reason: collision with root package name */
    public static final j13.a f378710d = new j13.a();

    /* renamed from: e, reason: collision with root package name */
    public static final l75.k0 f378711e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f378712f;

    static {
        l75.k0 k0Var = gm0.j1.u().f354686f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k0Var);
        f378711e = k0Var;
        f378712f = new java.util.concurrent.ConcurrentHashMap();
    }

    public a() {
        super(gm0.j1.u().f354686f, i13.j.D, "ForceNotifyData", new java.lang.String[]{"DROP INDEX IF EXISTS statusIndex", "CREATE INDEX IF NOT EXISTS userNameIndex ON ForceNotifyData(UserName)", "CREATE INDEX IF NOT EXISTS forcePushIdIndex ON ForceNotifyData(ForcePushId)", "CREATE INDEX IF NOT EXISTS ForceNotifyData_statusIndex ON ForceNotifyData(Status)", "CREATE INDEX IF NOT EXISTS expireTimeIndex ON ForceNotifyData(ExpiredTime)"});
    }

    @Override // l75.n0
    /* renamed from: D0, reason: merged with bridge method [inline-methods] */
    public boolean mo11260x413cb2b4(i13.j info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        boolean mo11260x413cb2b4 = super.mo11260x413cb2b4(info);
        if (mo11260x413cb2b4) {
            java.lang.String field_ForcePushId = info.f66499xaeadb4bb;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_ForcePushId, "field_ForcePushId");
            bn0.g.f104312a.k(field_ForcePushId, new bn0.b(field_ForcePushId, info.f66495x81959a6e, info.f66497xc9a553ad, info.f66500xda05eaf7, info.f66501x2253a77f));
        }
        return mo11260x413cb2b4;
    }

    public final void J0(java.lang.String forcePushId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(forcePushId, "forcePushId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForceNotifyStorage", "updateStatus(" + forcePushId + ", " + i17 + ')');
        i13.j jVar = new i13.j();
        jVar.f66499xaeadb4bb = forcePushId;
        if (get(jVar, new java.lang.String[0])) {
            jVar.f66500xda05eaf7 = i17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForceNotifyStorage", "[updateStatus] ret:%s %s", java.lang.Long.valueOf(f378711e.m("ForceNotifyData", "ForcePushId", jVar.mo9763xeb27878e())), jVar);
            f378712f.put(forcePushId, jVar);
            m145262xf35bbb4();
            java.lang.String field_ForcePushId = jVar.f66499xaeadb4bb;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_ForcePushId, "field_ForcePushId");
            bn0.g.f104312a.k(field_ForcePushId, new bn0.b(field_ForcePushId, jVar.f66495x81959a6e, jVar.f66497xc9a553ad, jVar.f66500xda05eaf7, jVar.f66501x2253a77f));
        }
    }

    public final boolean d(java.lang.String forcePushId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(forcePushId, "forcePushId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForceNotifyStorage", "delete(" + forcePushId + ')');
        if (f378711e.mo70514xb06685ab("ForceNotifyData", "ForcePushId=?", new java.lang.String[]{forcePushId}) < 0) {
            return false;
        }
        f378712f.remove(forcePushId);
        m145262xf35bbb4();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = bn0.g.f104312a.e().a();
        if (a17 != null) {
            a17.remove(forcePushId);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LightPushKV", "deleteLightPushForceNotifyData forcePushId = %s", forcePushId);
        return true;
    }

    public final void y0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForceNotifyStorage", "deleteExpireInfo()");
        if (!gm0.j1.a() || i95.n0.c(i50.q.class) == null) {
            return;
        }
        android.database.Cursor D = f378711e.D("ForceNotifyData", new java.lang.String[]{"*"}, "ExpiredTime<=?", new java.lang.String[]{java.lang.String.valueOf(c01.id.c())}, null, null, null, 2);
        if (D != null) {
            try {
                D.moveToFirst();
                while (!D.isAfterLast()) {
                    i13.j jVar = new i13.j();
                    jVar.mo9015xbf5d97fd(D);
                    ((h13.c0) ((i50.q) i95.n0.c(i50.q.class))).wi(jVar.f66499xaeadb4bb, 5, c01.id.c() / 1000);
                    D.moveToNext();
                }
                vz5.b.a(D, null);
            } catch (java.lang.Throwable th6) {
                try {
                    throw th6;
                } catch (java.lang.Throwable th7) {
                    vz5.b.a(D, th6);
                    throw th7;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForceNotifyStorage", "[deleteExpireInfo] ret:%s", java.lang.Integer.valueOf(f378711e.mo70514xb06685ab("ForceNotifyData", "ExpiredTime<=?", new java.lang.String[]{java.lang.String.valueOf(c01.id.c())})));
    }

    public final i13.j z0(java.lang.String forcePushId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(forcePushId, "forcePushId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForceNotifyStorage", "getById(" + forcePushId + ')');
        android.database.Cursor D = f378711e.D("ForceNotifyData", new java.lang.String[]{"*"}, "ForcePushId=?", new java.lang.String[]{forcePushId}, null, null, "ExpiredTime Desc", 2);
        i13.j jVar = new i13.j();
        if (D == null) {
            return null;
        }
        try {
            D.moveToFirst();
            if (D.isAfterLast()) {
                vz5.b.a(D, null);
                return null;
            }
            jVar.mo9015xbf5d97fd(D);
            vz5.b.a(D, null);
            return jVar;
        } finally {
        }
    }
}
