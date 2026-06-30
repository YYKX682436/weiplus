package com.tencent.matrix.lifecycle.owners;

/* loaded from: classes12.dex */
public final class i implements android.os.Handler.Callback {

    /* renamed from: d, reason: collision with root package name */
    public boolean f52749d;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Handler.Callback f52750e;

    public i(android.os.Handler.Callback callback) {
        this.f52750e = callback;
    }

    public static final void a(com.tencent.matrix.lifecycle.owners.i iVar) {
        android.util.ArrayMap arrayMap;
        java.lang.reflect.Field field;
        com.tencent.matrix.lifecycle.owners.d dVar;
        java.lang.reflect.Field field2;
        com.tencent.matrix.lifecycle.owners.d dVar2;
        com.tencent.matrix.lifecycle.owners.d dVar3;
        iVar.getClass();
        com.tencent.matrix.lifecycle.owners.ForegroundServiceLifecycleOwner foregroundServiceLifecycleOwner = com.tencent.matrix.lifecycle.owners.ForegroundServiceLifecycleOwner.INSTANCE;
        arrayMap = com.tencent.matrix.lifecycle.owners.ForegroundServiceLifecycleOwner.ActivityThreadmServices;
        if (arrayMap != null) {
            for (java.util.Map.Entry entry : arrayMap.entrySet()) {
                com.tencent.matrix.lifecycle.owners.ForegroundServiceLifecycleOwner foregroundServiceLifecycleOwner2 = com.tencent.matrix.lifecycle.owners.ForegroundServiceLifecycleOwner.INSTANCE;
                field = com.tencent.matrix.lifecycle.owners.ForegroundServiceLifecycleOwner.fieldServicemActivityManager;
                java.lang.Object obj = field != null ? field.get(entry.getValue()) : null;
                kotlin.jvm.internal.o.d(obj);
                if (java.lang.reflect.Proxy.isProxyClass(obj.getClass())) {
                    java.lang.reflect.InvocationHandler invocationHandler = java.lang.reflect.Proxy.getInvocationHandler(obj);
                    dVar3 = com.tencent.matrix.lifecycle.owners.ForegroundServiceLifecycleOwner.fgServiceHandler;
                    if (kotlin.jvm.internal.o.b(invocationHandler, dVar3)) {
                        continue;
                    }
                }
                dVar = com.tencent.matrix.lifecycle.owners.ForegroundServiceLifecycleOwner.fgServiceHandler;
                if (dVar == null) {
                    oj.j.c("Matrix.lifecycle.FgService", "first inject", new java.lang.Object[0]);
                    com.tencent.matrix.lifecycle.owners.ForegroundServiceLifecycleOwner.fgServiceHandler = new com.tencent.matrix.lifecycle.owners.d(obj);
                }
                oj.j.c("Matrix.lifecycle.FgService", "going to inject " + entry.getValue(), new java.lang.Object[0]);
                java.lang.Object value = entry.getValue();
                if (value == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type android.app.Service");
                }
                android.app.Service service = (android.app.Service) value;
                com.tencent.matrix.lifecycle.q0.f52785f.a().post(new com.tencent.matrix.lifecycle.owners.e(iVar, new android.content.ComponentName(service, service.getClass().getName())));
                field2 = com.tencent.matrix.lifecycle.owners.ForegroundServiceLifecycleOwner.fieldServicemActivityManager;
                if (field2 != null) {
                    java.lang.Object value2 = entry.getValue();
                    java.lang.ClassLoader classLoader = obj.getClass().getClassLoader();
                    java.lang.Class<?>[] interfaces = obj.getClass().getInterfaces();
                    dVar2 = com.tencent.matrix.lifecycle.owners.ForegroundServiceLifecycleOwner.fgServiceHandler;
                    kotlin.jvm.internal.o.d(dVar2);
                    field2.set(value2, java.lang.reflect.Proxy.newProxyInstance(classLoader, interfaces, dVar2));
                }
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message msg) {
        android.os.Handler handler;
        android.os.Handler handler2;
        kotlin.jvm.internal.o.g(msg, "msg");
        if (this.f52749d) {
            oj.j.b("Matrix.lifecycle.FgService", "reentrant!!! ignore this msg: " + msg.what, new java.lang.Object[0]);
            return false;
        }
        int i17 = msg.what;
        if (i17 == 114) {
            com.tencent.matrix.lifecycle.owners.ForegroundServiceLifecycleOwner foregroundServiceLifecycleOwner = com.tencent.matrix.lifecycle.owners.ForegroundServiceLifecycleOwner.INSTANCE;
            handler = com.tencent.matrix.lifecycle.owners.ForegroundServiceLifecycleOwner.ActivityThreadmH;
            if (handler != null) {
                handler.post(new com.tencent.matrix.lifecycle.owners.f(this));
            }
        } else if (i17 == 116) {
            com.tencent.matrix.lifecycle.owners.ForegroundServiceLifecycleOwner foregroundServiceLifecycleOwner2 = com.tencent.matrix.lifecycle.owners.ForegroundServiceLifecycleOwner.INSTANCE;
            handler2 = com.tencent.matrix.lifecycle.owners.ForegroundServiceLifecycleOwner.ActivityThreadmH;
            if (handler2 != null) {
                handler2.post(new com.tencent.matrix.lifecycle.owners.h(this));
            }
        }
        this.f52749d = true;
        android.os.Handler.Callback callback = this.f52750e;
        java.lang.Boolean valueOf = callback != null ? java.lang.Boolean.valueOf(callback.handleMessage(msg)) : null;
        this.f52749d = false;
        if (valueOf != null) {
            return valueOf.booleanValue();
        }
        return false;
    }
}
