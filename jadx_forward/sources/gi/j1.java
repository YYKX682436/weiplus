package gi;

/* loaded from: classes12.dex */
public class j1 implements android.app.Application.ActivityLifecycleCallbacks {
    public j1(gi.h1 h1Var) {
    }

    public final java.lang.String a(android.app.Activity activity) {
        ((vk.n) ((ob0.f3) i95.n0.c(ob0.f3.class))).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        for (java.util.Map.Entry entry : ((java.util.HashMap) ((v40.u) ((c50.t0) i95.n0.c(c50.t0.class))).wi()).entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            if (((java.util.List) entry.getValue()).contains(activity.getClass())) {
                return str;
            }
        }
        java.lang.Class<?> cls = activity.getClass();
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.ActivityC18203x35bf69b5.class) ? "Moment" : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls, com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.ui.ActivityC13018x47b52238.class) ? "Biz" : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls, com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1294xd2ae381c.ActivityC12989x4216896f.class) ? "BizFeed" : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19313x7ad402ad.class) ? "Web" : null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        ob0.f3 f3Var = (ob0.f3) i95.n0.c(ob0.f3.class);
        java.lang.String name = activity.getClass().getName();
        vk.n nVar = (vk.n) f3Var;
        nVar.getClass();
        vk.l lVar = vk.n.f519274d;
        synchronized (vk.l.a(lVar)) {
            vk.l.a(lVar).add(name);
        }
        nVar.Ai(name, true);
        java.lang.String a17 = a(activity);
        if (a17 != null) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.q) ((ob0.c3) i95.n0.c(ob0.c3.class))).Ai(a17);
            ((vk.n) ((ob0.f3) i95.n0.c(ob0.f3.class))).wi(a17, true);
            if (mm.o.f() && a17.equals("Finder")) {
                ((ku5.t0) ku5.t0.f394148d).g(new gi.i1(this));
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        ob0.f3 f3Var = (ob0.f3) i95.n0.c(ob0.f3.class);
        java.lang.String name = activity.getClass().getName();
        vk.n nVar = (vk.n) f3Var;
        nVar.getClass();
        vk.l lVar = vk.n.f519274d;
        synchronized (vk.l.a(lVar)) {
            vk.l.a(lVar).remove(name);
        }
        nVar.Ai(name, false);
        java.lang.String a17 = a(activity);
        if (a17 != null) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.q) ((ob0.c3) i95.n0.c(ob0.c3.class))).Bi(a17);
            ((vk.n) ((ob0.f3) i95.n0.c(ob0.f3.class))).wi(a17, false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
    }
}
