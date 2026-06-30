package com.tencent.mm.plugin.appbrand.task;

/* loaded from: classes7.dex */
public final class t0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f89194d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.task.preload.v f89195e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(boolean z17, com.tencent.mm.plugin.appbrand.task.preload.v vVar) {
        super(2);
        this.f89194d = z17;
        this.f89195e = vVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) obj2).booleanValue();
        if (!this.f89194d) {
            com.tencent.mm.plugin.appbrand.task.preload.w wVar = com.tencent.mm.plugin.appbrand.task.preload.x.f89149a;
            com.tencent.mm.plugin.appbrand.task.preload.v type = this.f89195e;
            kotlin.jvm.internal.o.g(type, "type");
            int ordinal = type.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    if (booleanValue) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(915, 36);
                    } else if (booleanValue2) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(915, 23);
                    }
                }
            } else if (booleanValue) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(915, 35);
            } else if (booleanValue2) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(915, 22);
            }
        }
        return jz5.f0.f302826a;
    }
}
