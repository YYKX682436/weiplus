package com.tencent.mm.plugin.appbrand.launching.teenmode;

/* loaded from: classes3.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f85199d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(java.lang.String str) {
        super(1);
        this.f85199d = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        k91.v5 info = (k91.v5) obj;
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20912, 2, 10, this.f85199d, info.field_nickname);
        return jz5.f0.f302826a;
    }
}
