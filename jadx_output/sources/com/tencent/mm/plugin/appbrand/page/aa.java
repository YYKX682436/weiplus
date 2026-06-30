package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class aa extends com.tencent.mm.sdk.platformtools.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f86402h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f86403i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f86404j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float[] f86405k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f86406l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f86407m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f86408n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f86409o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.ia f86410p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa(com.tencent.mm.plugin.appbrand.page.ia iaVar, long j17, java.lang.Boolean bool, android.view.View view, int i17, int i18, float[] fArr, int i19, boolean z17, boolean z18, boolean z19) {
        super(j17, bool);
        this.f86410p = iaVar;
        this.f86402h = view;
        this.f86403i = i17;
        this.f86404j = i18;
        this.f86405k = fArr;
        this.f86406l = i19;
        this.f86407m = z17;
        this.f86408n = z18;
        this.f86409o = z19;
    }

    @Override // com.tencent.mm.sdk.platformtools.d8
    public java.lang.Object b() {
        return java.lang.Boolean.valueOf(this.f86410p.g(this.f86402h, this.f86403i, this.f86404j, this.f86405k, this.f86406l, this.f86407m, this.f86408n, this.f86409o));
    }
}
