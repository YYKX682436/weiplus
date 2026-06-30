package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420;

/* loaded from: classes12.dex */
public final class i implements android.os.Handler.Callback {

    /* renamed from: d, reason: collision with root package name */
    public boolean f134282d;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Handler.Callback f134283e;

    public i(android.os.Handler.Callback callback) {
        this.f134283e = callback;
    }

    public static final void a(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.i iVar) {
        android.util.ArrayMap arrayMap;
        java.lang.reflect.Field field;
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.d dVar;
        java.lang.reflect.Field field2;
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.d dVar2;
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.d dVar3;
        iVar.getClass();
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4669x11d5b5db c4669x11d5b5db = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4669x11d5b5db.f19940x4fbc8495;
        arrayMap = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4669x11d5b5db.ActivityThreadmServices;
        if (arrayMap != null) {
            for (java.util.Map.Entry entry : arrayMap.entrySet()) {
                com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4669x11d5b5db c4669x11d5b5db2 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4669x11d5b5db.f19940x4fbc8495;
                field = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4669x11d5b5db.fieldServicemActivityManager;
                java.lang.Object obj = field != null ? field.get(entry.getValue()) : null;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
                if (java.lang.reflect.Proxy.isProxyClass(obj.getClass())) {
                    java.lang.reflect.InvocationHandler invocationHandler = java.lang.reflect.Proxy.getInvocationHandler(obj);
                    dVar3 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4669x11d5b5db.fgServiceHandler;
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(invocationHandler, dVar3)) {
                        continue;
                    }
                }
                dVar = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4669x11d5b5db.fgServiceHandler;
                if (dVar == null) {
                    oj.j.c("Matrix.lifecycle.FgService", "first inject", new java.lang.Object[0]);
                    com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4669x11d5b5db.fgServiceHandler = new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.d(obj);
                }
                oj.j.c("Matrix.lifecycle.FgService", "going to inject " + entry.getValue(), new java.lang.Object[0]);
                java.lang.Object value = entry.getValue();
                if (value == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type android.app.Service");
                }
                android.app.Service service = (android.app.Service) value;
                com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.q0.f134318f.a().post(new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.e(iVar, new android.content.ComponentName(service, service.getClass().getName())));
                field2 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4669x11d5b5db.fieldServicemActivityManager;
                if (field2 != null) {
                    java.lang.Object value2 = entry.getValue();
                    java.lang.ClassLoader classLoader = obj.getClass().getClassLoader();
                    java.lang.Class<?>[] interfaces = obj.getClass().getInterfaces();
                    dVar2 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4669x11d5b5db.fgServiceHandler;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar2);
                    field2.set(value2, java.lang.reflect.Proxy.newProxyInstance(classLoader, interfaces, dVar2));
                }
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message msg) {
        android.os.Handler handler;
        android.os.Handler handler2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        if (this.f134282d) {
            oj.j.b("Matrix.lifecycle.FgService", "reentrant!!! ignore this msg: " + msg.what, new java.lang.Object[0]);
            return false;
        }
        int i17 = msg.what;
        if (i17 == 114) {
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4669x11d5b5db c4669x11d5b5db = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4669x11d5b5db.f19940x4fbc8495;
            handler = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4669x11d5b5db.ActivityThreadmH;
            if (handler != null) {
                handler.post(new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f(this));
            }
        } else if (i17 == 116) {
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4669x11d5b5db c4669x11d5b5db2 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4669x11d5b5db.f19940x4fbc8495;
            handler2 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4669x11d5b5db.ActivityThreadmH;
            if (handler2 != null) {
                handler2.post(new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.h(this));
            }
        }
        this.f134282d = true;
        android.os.Handler.Callback callback = this.f134283e;
        java.lang.Boolean valueOf = callback != null ? java.lang.Boolean.valueOf(callback.handleMessage(msg)) : null;
        this.f134282d = false;
        if (valueOf != null) {
            return valueOf.booleanValue();
        }
        return false;
    }
}
