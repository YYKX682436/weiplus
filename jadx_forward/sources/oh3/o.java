package oh3;

/* loaded from: classes5.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f426978d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oh3.q f426979e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426980f;

    public o(boolean z17, oh3.q qVar, java.lang.String str) {
        this.f426978d = z17;
        this.f426979e = qVar;
        this.f426980f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object m143895xf1229813;
        ((h00.m) ((c00.t3) i95.n0.c(c00.t3.class))).getClass();
        if (((java.lang.Boolean) ((jz5.n) h00.h.f359354b).mo141623x754a37bb()).booleanValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PluginMMEcFeatureService", "skip this doInit isUseNewEcsInitCgi");
            return;
        }
        boolean z17 = this.f426978d;
        oh3.q qVar = this.f426979e;
        java.lang.String str = this.f426980f;
        if (z17 && java.lang.System.currentTimeMillis() - qVar.f426988h <= oh3.q.f426982n) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PluginMMEcFeatureService", "skip this doInit(" + str + ')');
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PluginMMEcFeatureService", "[doInit] source=" + str);
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813((jz5.f0) p3325xe03a0797.p3326xc267989b.l.f(null, new oh3.n(qVar, str, null), 1, null));
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("PluginMMEcFeatureService", m143898xd4a2fc34, "", new java.lang.Object[0]);
        }
    }
}
