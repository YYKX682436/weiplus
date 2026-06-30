package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class ba extends com.tencent.mm.sdk.platformtools.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f86435h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.ia f86436i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba(com.tencent.mm.plugin.appbrand.page.ia iaVar, long j17, java.lang.Boolean bool, int i17) {
        super(j17, bool);
        this.f86436i = iaVar;
        this.f86435h = i17;
    }

    @Override // com.tencent.mm.sdk.platformtools.d8
    public java.lang.Object b() {
        return java.lang.Boolean.valueOf(this.f86436i.s(this.f86435h));
    }
}
