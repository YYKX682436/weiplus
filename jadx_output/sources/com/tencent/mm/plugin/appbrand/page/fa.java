package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class fa extends com.tencent.mm.sdk.platformtools.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f86616h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.ia f86617i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa(com.tencent.mm.plugin.appbrand.page.ia iaVar, long j17, java.lang.Boolean bool, int i17) {
        super(j17, bool);
        this.f86617i = iaVar;
        this.f86616h = i17;
    }

    @Override // com.tencent.mm.sdk.platformtools.d8
    public java.lang.Object b() {
        com.tencent.mm.plugin.appbrand.page.ia iaVar = this.f86617i;
        int i17 = iaVar.f86760d;
        int i18 = this.f86616h;
        boolean z17 = false;
        if (i18 == i17 && iaVar.p(i18) != null) {
            iaVar.f86764h.g();
            z17 = true;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
