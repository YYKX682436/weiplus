package pf5;

/* loaded from: classes5.dex */
public class q implements p012xc85e97e9.p093xedfae76a.m1 {

    /* renamed from: d, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f435461d = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.q1.f392103c));

    /* renamed from: e, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f435462e = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a));

    /* renamed from: f, reason: collision with root package name */
    public final pf5.v0 f435463f = new pf5.v0(true);

    public final qf5.a a(java.lang.String str) {
        java.lang.String str2 = "com.tencent.mm.ui.component.UicApiExporterFor" + str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SupportUIC", "[attachUicApiRegister] name=" + str2);
        java.lang.Object newInstance = java.lang.Class.forName(str2).newInstance();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(newInstance, "null cannot be cast to non-null type com.tencent.mm.ui.component.annotation.UicApiRegister");
        return (qf5.a) newInstance;
    }

    public void b(java.lang.String javaClassName) {
        java.lang.Object m143895xf1229813;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(javaClassName, "javaClassName");
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            a(javaClassName).a();
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("SupportUIC", m143898xd4a2fc34, "", new java.lang.Object[0]);
        }
    }

    public void c() {
        this.f435463f.a();
        p3325xe03a0797.p3326xc267989b.z0.d(this.f435461d, this + " onCleared.", null, 2, null);
        p3325xe03a0797.p3326xc267989b.z0.d(this.f435462e, this + " onCleared.", null, 2, null);
    }

    @Override // p012xc85e97e9.p093xedfae76a.m1
    /* renamed from: getViewModelStore */
    public p012xc85e97e9.p093xedfae76a.l1 getViewModel() {
        return this.f435463f;
    }
}
