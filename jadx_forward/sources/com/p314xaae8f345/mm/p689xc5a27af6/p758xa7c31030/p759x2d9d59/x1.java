package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59;

/* loaded from: classes12.dex */
public abstract class x1 {

    /* renamed from: f, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.g1 f149040f = new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.g1(null);

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f149041g = jz5.h.b(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.f1.f148950d);

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f149042h = jz5.h.b(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.e1.f148947d);

    /* renamed from: i, reason: collision with root package name */
    public static final jz5.g f149043i = jz5.h.b(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.d1.f148944d);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f149044d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f149045e;

    public x1(java.lang.String policyName, java.util.List bindingUiList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(policyName, "policyName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bindingUiList, "bindingUiList");
        this.f149044d = policyName;
        this.f149045e = jz5.h.b(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.w1.f149035d);
        jz5.h.b(new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.u1(this));
    }

    public final boolean a() {
        boolean contains;
        for (java.lang.String activityName : d()) {
            ((vk.n) ((ob0.f3) i95.n0.c(ob0.f3.class))).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityName, "activityName");
            vk.l lVar = vk.n.f519274d;
            synchronized (vk.l.a(lVar)) {
                contains = vk.l.a(lVar).contains(activityName);
            }
            if (contains) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdpfFeatureService", "checkIfUiBounded: true, by bindingUI: ".concat(activityName));
                return true;
            }
        }
        return false;
    }

    public final boolean b(ob0.d callback) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        synchronized (f()) {
            java.util.Iterator it = f().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.b) ((ob0.e) obj)).f148927d, callback)) {
                    break;
                }
            }
            return ((ob0.e) obj) != null;
        }
    }

    public abstract com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x0 c(java.lang.String str);

    public abstract java.util.List d();

    public java.lang.String e() {
        return this.f149044d;
    }

    public final java.util.List f() {
        return (java.util.List) ((jz5.n) this.f149045e).mo141623x754a37bb();
    }

    public final void g(java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x0 c17 = c(source);
        synchronized (f()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdpfFeatureService", e() + " dispatchSignal: " + c17 + ", list=" + f().size());
            if (f().isEmpty()) {
                return;
            }
            com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.r1 r1Var = new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.r1(this, c17);
            android.os.Looper myLooper = android.os.Looper.myLooper();
            jz5.g gVar = com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.a2.f148924a;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(myLooper, ((android.os.Handler) ((jz5.n) gVar).mo141623x754a37bb()).getLooper())) {
                r1Var.mo152xb9724478();
            } else {
                ((android.os.Handler) ((jz5.n) gVar).mo141623x754a37bb()).post(new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.v1(r1Var));
            }
        }
    }

    public abstract void h();

    public final boolean i(ob0.d callback) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        synchronized (f()) {
            java.util.Iterator it = f().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.b) ((ob0.e) obj)).f148927d, callback)) {
                    break;
                }
            }
            ob0.e eVar = (ob0.e) obj;
            if (eVar == null) {
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdpfFeatureService", e() + " remove: " + callback.m150909xfb82e301());
            f().remove(eVar);
            return true;
        }
    }

    public final int j() {
        int size;
        synchronized (f()) {
            size = f().size();
        }
        return size;
    }

    public abstract void k();
}
