package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class s implements ik1.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f85129a;

    public s(java.lang.String str) {
        this.f85129a = str;
    }

    @Override // ik1.h
    public boolean invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.launching.v task = (com.tencent.mm.plugin.appbrand.launching.v) obj;
        kotlin.jvm.internal.o.g(task, "task");
        boolean b17 = kotlin.jvm.internal.o.b(task.f85237a, this.f85129a);
        if (b17) {
            try {
                task.f85242f.cancel(true);
            } catch (java.lang.Exception unused) {
            }
        }
        return b17;
    }
}
