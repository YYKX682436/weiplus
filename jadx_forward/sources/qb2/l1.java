package qb2;

/* loaded from: classes5.dex */
public final class l1 extends qz5.l implements yz5.p {
    public final /* synthetic */ java.lang.String A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ java.lang.String E;
    public final /* synthetic */ java.lang.String F;
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 G;
    public final /* synthetic */ int H;

    /* renamed from: d, reason: collision with root package name */
    public int f442768d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u26.w f442769e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qb2.r1 f442770f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f442771g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f442772h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f442773i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f442774m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f442775n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f442776o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f442777p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f442778q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f442779r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f442780s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f442781t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f442782u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f442783v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f442784w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f442785x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f442786y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f442787z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(u26.w wVar, qb2.r1 r1Var, java.lang.String str, java.lang.String str2, long j17, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, java.lang.String str3, int i17, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, boolean z17, boolean z18, long j18, long j19, int i18, int i19, int i27, java.lang.String str8, int i28, int i29, boolean z19, java.lang.String str9, java.lang.String str10, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862, int i37, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f442769e = wVar;
        this.f442770f = r1Var;
        this.f442771g = str;
        this.f442772h = str2;
        this.f442773i = j17;
        this.f442774m = f0Var;
        this.f442775n = str3;
        this.f442776o = i17;
        this.f442777p = str4;
        this.f442778q = str5;
        this.f442779r = str6;
        this.f442780s = str7;
        this.f442781t = z17;
        this.f442782u = z18;
        this.f442783v = j18;
        this.f442784w = j19;
        this.f442785x = i18;
        this.f442786y = i19;
        this.f442787z = i27;
        this.A = str8;
        this.B = i28;
        this.C = i29;
        this.D = z19;
        this.E = str9;
        this.F = str10;
        this.G = c19786x6a1e2862;
        this.H = i37;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qb2.l1(this.f442769e, this.f442770f, this.f442771g, this.f442772h, this.f442773i, this.f442774m, this.f442775n, this.f442776o, this.f442777p, this.f442778q, this.f442779r, this.f442780s, this.f442781t, this.f442782u, this.f442783v, this.f442784w, this.f442785x, this.f442786y, this.f442787z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((qb2.l1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object r17;
        android.graphics.Bitmap bitmap;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f442768d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f442768d = 1;
            r17 = this.f442769e.r(this);
            if (r17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            r17 = obj;
        }
        android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) r17;
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f442774m;
        if (bitmap2 != null) {
            bitmap = bitmap2;
            this.f442770f.l(this.f442771g, this.f442772h, this.f442773i, f0Var.f391649d, this.f442775n, this.f442776o, this.f442777p, this.f442778q, this.f442779r, this.f442780s, bitmap, this.f442781t, this.f442782u, this.f442783v, this.f442784w, this.f442785x, this.f442786y, this.f442787z, this.A, this.B, this.C, this.D, this.E, this.F, this.G);
        } else {
            bitmap = bitmap2;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(23669, this.f442777p, "return", new java.lang.Long(java.lang.System.currentTimeMillis()), "13", new java.lang.Integer(this.H), new java.lang.Integer(f0Var.f391649d));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.GlobalPushNewXmlConsumer", "loadLinkIcon resource :" + bitmap);
        return jz5.f0.f384359a;
    }
}
