package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes7.dex */
public final class i3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f94318d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f94319e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f94320f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(kotlin.jvm.internal.h0 h0Var, java.lang.String str, kotlin.jvm.internal.c0 c0Var) {
        super(1);
        this.f94318d = h0Var;
        this.f94319e = str;
        this.f94320f = c0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        java.lang.String str = (java.lang.String) obj;
        java.util.concurrent.locks.ReentrantLock reentrantLock = com.tencent.mm.plugin.brandservice.ui.timeline.preload.n3.f94373c;
        kotlin.jvm.internal.h0 h0Var = this.f94318d;
        java.lang.String str2 = this.f94319e;
        kotlin.jvm.internal.c0 c0Var = this.f94320f;
        reentrantLock.lock();
        if (str != null) {
            try {
                if (str.length() != 0) {
                    z17 = false;
                    if (!z17 && !kotlin.jvm.internal.o.b(str, "null") && !kotlin.jvm.internal.o.b(str, "undefined")) {
                        h0Var.f310123d = "_manifest_" + com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.j(str2) + '_' + str;
                    }
                    com.tencent.mm.plugin.brandservice.ui.timeline.preload.n3.f94374d.signalAll();
                    c0Var.f310112d = false;
                    reentrantLock.unlock();
                    return jz5.f0.f302826a;
                }
            } catch (java.lang.Throwable th6) {
                reentrantLock.unlock();
                throw th6;
            }
        }
        z17 = true;
        if (!z17) {
            h0Var.f310123d = "_manifest_" + com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.j(str2) + '_' + str;
        }
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.n3.f94374d.signalAll();
        c0Var.f310112d = false;
        reentrantLock.unlock();
        return jz5.f0.f302826a;
    }
}
