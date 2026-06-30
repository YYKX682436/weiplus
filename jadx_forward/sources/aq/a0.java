package aq;

/* loaded from: classes4.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f94361d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f94362e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f94363f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ double f94364g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ double f94365h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ double f94366i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f94367m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(java.lang.String str, java.lang.String str2, double d17, double d18, double d19, double d27, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f94361d = str;
        this.f94362e = str2;
        this.f94363f = d17;
        this.f94364g = d18;
        this.f94365h = d19;
        this.f94366i = d27;
        this.f94367m = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new aq.a0(this.f94361d, this.f94362e, this.f94363f, this.f94364g, this.f94365h, this.f94366i, this.f94367m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((aq.a0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        android.graphics.Bitmap E;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dealClusterCropCenterImage >> cropImagePath: ");
        java.lang.String str = this.f94361d;
        sb6.append(str);
        sb6.append(", imagePath: ");
        java.lang.String imagePath = this.f94362e;
        sb6.append(imagePath);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQuerySDKCore", sb6.toString());
        android.graphics.Bitmap M = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.M(imagePath, com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.f48865xd4605761, com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.f48865xd4605761, true, null);
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (M == null || (E = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.E(M, a06.d.a(this.f94363f), a06.d.a(this.f94364g), a06.d.a(this.f94365h), a06.d.a(this.f94366i), true)) == null) {
            return f0Var;
        }
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(E, 100, android.graphics.Bitmap.CompressFormat.PNG, str, true);
            com.p314xaae8f345.mm.p2621x8fb0427b.s8 s8Var = com.p314xaae8f345.mm.p2621x8fb0427b.s8.f276847a;
            java.lang.String str2 = aq.o.f94454b;
            java.lang.String valueOf = java.lang.String.valueOf(this.f94367m);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imagePath, "$imagePath");
            s8Var.j(str2, valueOf, str, imagePath);
        } catch (java.io.IOException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImageQuerySDKCore", "saveBitmapToImage error >> cropImagePath: " + str);
        }
        return f0Var;
    }
}
