package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class da extends com.tencent.mm.sdk.platformtools.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f86533h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float[] f86534i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f86535j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f86536k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f86537l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.ia f86538m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da(com.tencent.mm.plugin.appbrand.page.ia iaVar, long j17, java.lang.Boolean bool, int i17, float[] fArr, int i18, java.lang.Boolean bool2, java.lang.Boolean bool3) {
        super(j17, bool);
        this.f86538m = iaVar;
        this.f86533h = i17;
        this.f86534i = fArr;
        this.f86535j = i18;
        this.f86536k = bool2;
        this.f86537l = bool3;
    }

    @Override // com.tencent.mm.sdk.platformtools.d8
    public java.lang.Object b() {
        return java.lang.Boolean.valueOf(this.f86538m.x(this.f86533h, this.f86534i, this.f86535j, this.f86536k, this.f86537l));
    }
}
