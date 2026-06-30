package com.tencent.mm.feature.performance.adpf;

/* loaded from: classes12.dex */
public abstract class x1 {

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.feature.performance.adpf.g1 f67507f = new com.tencent.mm.feature.performance.adpf.g1(null);

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f67508g = jz5.h.b(com.tencent.mm.feature.performance.adpf.f1.f67417d);

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f67509h = jz5.h.b(com.tencent.mm.feature.performance.adpf.e1.f67414d);

    /* renamed from: i, reason: collision with root package name */
    public static final jz5.g f67510i = jz5.h.b(com.tencent.mm.feature.performance.adpf.d1.f67411d);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f67511d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f67512e;

    public x1(java.lang.String policyName, java.util.List bindingUiList) {
        kotlin.jvm.internal.o.g(policyName, "policyName");
        kotlin.jvm.internal.o.g(bindingUiList, "bindingUiList");
        this.f67511d = policyName;
        this.f67512e = jz5.h.b(com.tencent.mm.feature.performance.adpf.w1.f67502d);
        jz5.h.b(new com.tencent.mm.feature.performance.adpf.u1(this));
    }

    public final boolean a() {
        boolean contains;
        for (java.lang.String activityName : d()) {
            ((vk.n) ((ob0.f3) i95.n0.c(ob0.f3.class))).getClass();
            kotlin.jvm.internal.o.g(activityName, "activityName");
            vk.l lVar = vk.n.f437741d;
            synchronized (vk.l.a(lVar)) {
                contains = vk.l.a(lVar).contains(activityName);
            }
            if (contains) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AdpfFeatureService", "checkIfUiBounded: true, by bindingUI: ".concat(activityName));
                return true;
            }
        }
        return false;
    }

    public final boolean b(ob0.d callback) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(callback, "callback");
        synchronized (f()) {
            java.util.Iterator it = f().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.o.b(((com.tencent.mm.feature.performance.adpf.b) ((ob0.e) obj)).f67394d, callback)) {
                    break;
                }
            }
            return ((ob0.e) obj) != null;
        }
    }

    public abstract com.tencent.mm.feature.performance.adpf.x0 c(java.lang.String str);

    public abstract java.util.List d();

    public java.lang.String e() {
        return this.f67511d;
    }

    public final java.util.List f() {
        return (java.util.List) ((jz5.n) this.f67512e).getValue();
    }

    public final void g(java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        com.tencent.mm.feature.performance.adpf.x0 c17 = c(source);
        synchronized (f()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AdpfFeatureService", e() + " dispatchSignal: " + c17 + ", list=" + f().size());
            if (f().isEmpty()) {
                return;
            }
            com.tencent.mm.feature.performance.adpf.r1 r1Var = new com.tencent.mm.feature.performance.adpf.r1(this, c17);
            android.os.Looper myLooper = android.os.Looper.myLooper();
            jz5.g gVar = com.tencent.mm.feature.performance.adpf.a2.f67391a;
            if (kotlin.jvm.internal.o.b(myLooper, ((android.os.Handler) ((jz5.n) gVar).getValue()).getLooper())) {
                r1Var.invoke();
            } else {
                ((android.os.Handler) ((jz5.n) gVar).getValue()).post(new com.tencent.mm.feature.performance.adpf.v1(r1Var));
            }
        }
    }

    public abstract void h();

    public final boolean i(ob0.d callback) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(callback, "callback");
        synchronized (f()) {
            java.util.Iterator it = f().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.o.b(((com.tencent.mm.feature.performance.adpf.b) ((ob0.e) obj)).f67394d, callback)) {
                    break;
                }
            }
            ob0.e eVar = (ob0.e) obj;
            if (eVar == null) {
                return false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AdpfFeatureService", e() + " remove: " + callback.getName());
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
