package com.tencent.mm.plugin.appbrand.ipc;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0002H'J\b\u0010\u0005\u001a\u00020\u0002H\u0017J\u0006\u0010\u0006\u001a\u00020\u0002¨\u0006\t"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/ipc/AccountScopedMainProcessTask;", "Lcom/tencent/mm/plugin/appbrand/ipc/MainProcessTask;", "Ljz5/f0;", "z", "F", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "D", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public abstract class AccountScopedMainProcessTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final java.lang.Object B(com.tencent.mm.plugin.appbrand.ipc.AccountScopedMainProcessTask accountScopedMainProcessTask, kotlin.coroutines.Continuation continuation) {
        accountScopedMainProcessTask.getClass();
        boolean z17 = gm0.j1.b().f273254q;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (z17) {
            return f0Var;
        }
        boolean n17 = gm0.j1.b().n();
        boolean r17 = gm0.m.r();
        if (!n17 || r17) {
            throw new c01.c();
        }
        final oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.CoreAccountInitializationNotifiedEvent>(a0Var) { // from class: com.tencent.mm.plugin.appbrand.ipc.AccountScopedMainProcessTask$waitForAccount$2$1
            {
                this.__eventId = 19430116;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.CoreAccountInitializationNotifiedEvent coreAccountInitializationNotifiedEvent) {
                com.tencent.mm.autogen.events.CoreAccountInitializationNotifiedEvent event = coreAccountInitializationNotifiedEvent;
                kotlin.jvm.internal.o.g(event, "event");
                dead();
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                nVar.resumeWith(kotlin.Result.m521constructorimpl(jz5.f0.f302826a));
                return false;
            }
        }.alive();
        java.lang.Object a17 = nVar.a();
        return a17 == pz5.a.f359186d ? a17 : f0Var;
    }

    public static final java.lang.Object C(com.tencent.mm.plugin.appbrand.ipc.AccountScopedMainProcessTask accountScopedMainProcessTask, kotlin.coroutines.Continuation continuation) {
        accountScopedMainProcessTask.getClass();
        boolean z17 = gm0.j1.i().f273208a.f273299d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (z17) {
            return f0Var;
        }
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        gm0.j1.i().m(new com.tencent.mm.plugin.appbrand.ipc.c(nVar));
        java.lang.Object a17 = nVar.a();
        return a17 == pz5.a.f359186d ? a17 : f0Var;
    }

    public final void D() {
        pm0.v.X(com.tencent.mm.plugin.appbrand.ipc.a.f78394d);
    }

    public void E() {
        D();
    }

    public abstract void F();

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public final void z() {
        kotlinx.coroutines.y0 b17 = kotlinx.coroutines.z0.b();
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(b17, ((t26.a) kotlinx.coroutines.internal.b0.f310484a).f415347h, null, new com.tencent.mm.plugin.appbrand.ipc.b(this, null), 2, null);
    }
}
