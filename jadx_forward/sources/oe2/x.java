package oe2;

/* loaded from: classes8.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final oe2.x f426319a = new oe2.x();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f426320b = jz5.h.b(oe2.w.f426318d);

    public static final void a(oe2.x xVar, dm.s4 s4Var) {
        xVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveTipsBarDataEventReceiver", "checkAndInsert ".concat(pm0.v.u(s4Var.f68258x41d5e0c)));
        i95.m c17 = i95.n0.c(s40.w0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        s40.w0 w0Var = (s40.w0) c17;
        long j17 = s4Var.f68258x41d5e0c;
        oe2.v vVar = new oe2.v(s4Var);
        qs5.d dVar = qs5.d.f447959e;
        s40.w0.u9(w0Var, j17, false, null, vVar, 1, null, null, null, 224, null);
    }

    public static final rl2.v b(oe2.x xVar) {
        xVar.getClass();
        return (rl2.v) ((jz5.n) f426320b).mo141623x754a37bb();
    }

    public final dm.s4 c(java.lang.String str, org.json.JSONObject jSONObject) {
        try {
            dm.s4 s4Var = new dm.s4();
            s4Var.f68258x41d5e0c = pm0.v.Z(jSONObject.getString("liveid"));
            s4Var.f68257x7560f783 = str;
            s4Var.f68261x9c2463f1 = jSONObject.optLong("createtime", c01.id.e());
            s4Var.f68254x123da011 = jSONObject.getString("livesendername");
            s4Var.f68253xf5ec756 = jSONObject.getString("liveusername");
            s4Var.f68252x236be6ee = jSONObject.getString("nickname");
            s4Var.f68256x6a75a8e5 = pm0.v.Z(jSONObject.getString("finderobjectid"));
            s4Var.f68255xb362ffdf = jSONObject.optString("findernonceid");
            if (s4Var.f68258x41d5e0c != 0) {
                return s4Var;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveTipsBarDataEventReceiver", "liveId invalid, json:" + jSONObject);
            return null;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.FinderLiveTipsBarDataEventReceiver", th6, "jsonToBaseFinderLiveTipsBar", new java.lang.Object[0]);
            pm0.z.b(xy2.b.f539688b, "parseNewXmlToTipsBarData_item", false, null, null, false, false, null, 124, null);
            return null;
        }
    }
}
