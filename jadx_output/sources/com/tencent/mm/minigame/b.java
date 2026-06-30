package com.tencent.mm.minigame;

/* loaded from: classes5.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f68999d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String str) {
        super(1);
        this.f68999d = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.task.k it = (com.tencent.mm.plugin.appbrand.task.k) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return java.lang.Boolean.valueOf(kotlin.jvm.internal.o.b(it.i(), this.f68999d));
    }
}
