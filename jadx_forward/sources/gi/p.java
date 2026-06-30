package gi;

/* loaded from: classes12.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static android.os.Handler f353608a = null;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f353609b = "unknown";

    /* renamed from: c, reason: collision with root package name */
    public static java.util.List f353610c = java.util.Collections.emptyList();

    public static void a(boolean z17, java.lang.String str) {
        ph.u e17 = gi.d.e();
        if (e17 != null) {
            e17.a(z17);
        }
        if (!z17) {
            b("background");
            return;
        }
        b(str);
        ((ku5.t0) ku5.t0.f394148d).h(new gi.RunnableC28360x337573(), "Matrix.battery.LifeCycle");
        gi.i0.b(false);
    }

    public static void b(java.lang.String str) {
        ph.u uVar;
        if (ih.d.c() && (uVar = (ph.u) ih.d.d().a(ph.u.class)) != null) {
            if (uVar.f444988g == 4) {
                return;
            }
            java.lang.String b17 = ri.t.b(str);
            rh.w wVar = (rh.w) uVar.f435829h.i(rh.w.class);
            if (wVar != null) {
                if (((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.k) wVar.f476827a.i(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.k.class)) != null) {
                    new com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e.SceneStatRecord().f134153f = b17;
                }
                synchronized ("Matrix.battery.AppStatMonitorFeature") {
                    try {
                        java.util.List list = wVar.f477062f;
                        if (list != java.util.Collections.EMPTY_LIST) {
                            list.add(0, new wh.f2(b17));
                            android.os.Handler handler = wVar.f476827a.f444870f;
                            java.lang.Runnable runnable = wVar.f477063g;
                            handler.removeCallbacks(runnable);
                            wVar.f476827a.f444870f.postDelayed(runnable, 1000L);
                        }
                    } catch (java.lang.Throwable th6) {
                        throw th6;
                    }
                }
                oj.j.c("Matrix.battery.AppStatMonitorFeature", "updateAppImportance when launch: " + b17, new java.lang.Object[0]);
                wVar.n();
            }
            if ("background".equals(str)) {
                return;
            }
            f353609b = b17;
        }
    }
}
