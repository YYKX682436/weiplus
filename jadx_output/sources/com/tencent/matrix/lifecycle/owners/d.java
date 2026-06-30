package com.tencent.matrix.lifecycle.owners;

/* loaded from: classes12.dex */
public final class d implements java.lang.reflect.InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f52712a = jz5.h.b(com.tencent.matrix.lifecycle.owners.c.f52710d);

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f52713b;

    public d(java.lang.Object obj) {
        this.f52713b = obj;
    }

    public final java.util.HashSet a() {
        return (java.util.HashSet) ((jz5.n) this.f52712a).getValue();
    }

    public final void b(android.content.ComponentName componentName) {
        boolean z17;
        kotlin.jvm.internal.o.g(componentName, "componentName");
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
            com.tencent.matrix.lifecycle.owners.ForegroundServiceLifecycleOwner.INSTANCE.turnOn();
        }
    }

    public final void c(android.content.ComponentName componentName) {
        boolean z17;
        kotlin.jvm.internal.o.g(componentName, "componentName");
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
            com.tencent.matrix.lifecycle.owners.ForegroundServiceLifecycleOwner.INSTANCE.turnOff();
        }
    }

    @Override // java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object... args) {
        java.lang.Object invoke;
        kotlin.jvm.internal.o.g(args, "args");
        if (method != null) {
            try {
                invoke = method.invoke(this.f52713b, java.util.Arrays.copyOf(args, args.length));
            } catch (java.lang.Throwable th6) {
                oj.j.d("Matrix.lifecycle.FgService", th6, "", new java.lang.Object[0]);
                return null;
            }
        } else {
            invoke = null;
        }
        if (kotlin.jvm.internal.o.b(method != null ? method.getName() : null, "setServiceForeground")) {
            java.lang.String arrays = java.util.Arrays.toString(args);
            kotlin.jvm.internal.o.f(arrays, "java.util.Arrays.toString(this)");
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
