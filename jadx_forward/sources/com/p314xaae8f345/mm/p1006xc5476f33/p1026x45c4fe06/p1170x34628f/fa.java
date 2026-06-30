package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class fa extends com.p314xaae8f345.mm.sdk.p2603x2137b148.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f168149h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia f168150i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia iaVar, long j17, java.lang.Boolean bool, int i17) {
        super(j17, bool);
        this.f168150i = iaVar;
        this.f168149h = i17;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.d8
    public java.lang.Object b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia iaVar = this.f168150i;
        int i17 = iaVar.f168293d;
        int i18 = this.f168149h;
        boolean z17 = false;
        if (i18 == i17 && iaVar.p(i18) != null) {
            iaVar.f168297h.g();
            z17 = true;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
