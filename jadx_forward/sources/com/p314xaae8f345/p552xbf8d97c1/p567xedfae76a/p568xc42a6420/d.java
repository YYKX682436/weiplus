package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420;

/* loaded from: classes12.dex */
public final class d implements java.lang.reflect.InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f134245a = jz5.h.b(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.c.f134243d);

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f134246b;

    public d(java.lang.Object obj) {
        this.f134246b = obj;
    }

    public final java.util.HashSet a() {
        return (java.util.HashSet) ((jz5.n) this.f134245a).mo141623x754a37bb();
    }

    public final void b(android.content.ComponentName componentName) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(componentName, "componentName");
        synchronized (a()) {
            oj.j.c("Matrix.lifecycle.FgService", "hack onStartForeground: " + componentName, new java.lang.Object[0]);
            if (a().isEmpty()) {
                oj.j.c("Matrix.lifecycle.FgService", "should turn ON", new java.lang.Object[0]);
                z17 = true;
            } else {
                z17 = false;
            }
            a().add(componentName);
        }
        if (z17) {
            oj.j.c("Matrix.lifecycle.FgService", "do turn ON", new java.lang.Object[0]);
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4669x11d5b5db.f19940x4fbc8495.m40993xcc985f3c();
        }
    }

    public final void c(android.content.ComponentName componentName) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(componentName, "componentName");
        synchronized (a()) {
            oj.j.c("Matrix.lifecycle.FgService", "hack onStopForeground: " + componentName, new java.lang.Object[0]);
            a().remove(componentName);
            if (a().isEmpty()) {
                oj.j.c("Matrix.lifecycle.FgService", "should turn OFF", new java.lang.Object[0]);
                z17 = true;
            } else {
                z17 = false;
            }
        }
        if (z17) {
            oj.j.c("Matrix.lifecycle.FgService", "do turn OFF", new java.lang.Object[0]);
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4669x11d5b5db.f19940x4fbc8495.m40992xc67387b2();
        }
    }

    @Override // java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object... args) {
        java.lang.Object invoke;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(args, "args");
        if (method != null) {
            try {
                invoke = method.invoke(this.f134246b, java.util.Arrays.copyOf(args, args.length));
            } catch (java.lang.Throwable th6) {
                oj.j.d("Matrix.lifecycle.FgService", th6, "", new java.lang.Object[0]);
                return null;
            }
        } else {
            invoke = null;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(method != null ? method.getName() : null, "setServiceForeground")) {
            java.lang.String arrays = java.util.Arrays.toString(args);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrays, "java.util.Arrays.toString(this)");
            oj.j.c("Matrix.lifecycle.FgService", "real invoked setServiceForeground: ".concat(arrays), new java.lang.Object[0]);
            if (args.length <= 3 || args[3] != null) {
                java.lang.Object obj2 = args[0];
                if (obj2 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type android.content.ComponentName");
                }
                b((android.content.ComponentName) obj2);
            } else {
                java.lang.Object obj3 = args[0];
                if (obj3 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type android.content.ComponentName");
                }
                c((android.content.ComponentName) obj3);
            }
        }
        return invoke;
    }
}
