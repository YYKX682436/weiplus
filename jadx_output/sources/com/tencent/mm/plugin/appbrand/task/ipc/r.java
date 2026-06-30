package com.tencent.mm.plugin.appbrand.task.ipc;

/* loaded from: classes5.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f89072d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(java.lang.String str) {
        super(1);
        this.f89072d = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.task.k it = (com.tencent.mm.plugin.appbrand.task.k) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return java.lang.Boolean.valueOf(kotlin.jvm.internal.o.b(it.i(), this.f89072d));
    }
}
