package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class ic implements com.tencent.mapsdk.internal.jk<com.tencent.mapsdk.internal.fu> {
    @Override // com.tencent.mapsdk.internal.jk
    public final /* synthetic */ com.tencent.mapsdk.internal.fu a(float f17, com.tencent.mapsdk.internal.fu fuVar, com.tencent.mapsdk.internal.fu fuVar2) {
        com.tencent.mapsdk.internal.fu fuVar3 = fuVar;
        com.tencent.mapsdk.internal.fu fuVar4 = fuVar2;
        double d17 = fuVar3.f49467a;
        double d18 = f17;
        double d19 = d17 + ((fuVar4.f49467a - d17) * d18);
        double d27 = fuVar3.f49468b;
        return new com.tencent.mapsdk.internal.fu(d19, d27 + (d18 * (fuVar4.f49468b - d27)));
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private static com.tencent.mapsdk.internal.fu a2(float f17, com.tencent.mapsdk.internal.fu fuVar, com.tencent.mapsdk.internal.fu fuVar2) {
        double d17 = fuVar.f49467a;
        double d18 = f17;
        double d19 = d17 + ((fuVar2.f49467a - d17) * d18);
        double d27 = fuVar.f49468b;
        return new com.tencent.mapsdk.internal.fu(d19, d27 + (d18 * (fuVar2.f49468b - d27)));
    }
}
