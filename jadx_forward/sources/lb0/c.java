package lb0;

/* loaded from: classes5.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final lb0.c f399201d = new lb0.c();

    public c() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object m143895xf1229813;
        lb0.d dVar = lb0.d.f399202a;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            java.lang.String uj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).uj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2558xb4b58865.C20608x4bceacd1());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicAdUtil", "Loading yuanbao config: " + uj6);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(uj6);
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(lb0.d.a(dVar, uj6));
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicAdUtil", "Failed to load yuan bao config", m143898xd4a2fc34);
            m143895xf1229813 = kz5.q0.f395534d;
        }
        return (java.util.Map) m143895xf1229813;
    }
}
