package ro2;

/* loaded from: classes2.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f479601d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f479602e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f479603f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f479604g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f479605h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe f479606i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f479607m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(android.graphics.Bitmap bitmap, android.content.Context context, int i17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar, in5.s0 s0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f479601d = bitmap;
        this.f479602e = context;
        this.f479603f = i17;
        this.f479604g = i18;
        this.f479605h = abstractC14490x69736cb5;
        this.f479606i = qeVar;
        this.f479607m = s0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ro2.n(this.f479601d, this.f479602e, this.f479603f, this.f479604g, this.f479605h, this.f479606i, this.f479607m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ro2.n nVar = (ro2.n) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        nVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9 e9Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183665a;
        sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183672h);
        sb6.append("mile_stone_");
        sb6.append(java.lang.System.currentTimeMillis());
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(this.f479601d, 100, android.graphics.Bitmap.CompressFormat.JPEG, sb7, true);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("poster_type", this.f479603f);
        jSONObject.put("poster_num", this.f479604g);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullConvert", "saveMileStoneBitmap, writeExifSuccess: " + com.p314xaae8f345.mm.sdk.p2603x2137b148.x.L0(jSONObject.toString(), sb7) + ' ');
        zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar = this.f479606i;
        in5.s0 s0Var = this.f479607m;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f479605h;
        android.content.Context context = this.f479602e;
        ((yb0.g) b0Var).wi(context, sb7, new ro2.m(abstractC14490x69736cb5, context, qeVar, s0Var));
        return jz5.f0.f384359a;
    }
}
