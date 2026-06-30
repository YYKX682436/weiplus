package dk2;

/* loaded from: classes3.dex */
public final class f6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f314977d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f314978e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f314979f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314980g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ gk2.e f314981h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ dk2.xf f314982i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ dk2.k6 f314983m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r45.l01 f314984n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yz5.t f314985o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f314986p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314987q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(boolean z17, int i17, boolean z18, java.lang.String str, gk2.e eVar, dk2.xf xfVar, dk2.k6 k6Var, r45.l01 l01Var, yz5.t tVar, int i18, java.lang.String str2) {
        super(0);
        this.f314977d = z17;
        this.f314978e = i17;
        this.f314979f = z18;
        this.f314980g = str;
        this.f314981h = eVar;
        this.f314982i = xfVar;
        this.f314983m = k6Var;
        this.f314984n = l01Var;
        this.f314985o = tVar;
        this.f314986p = i18;
        this.f314987q = str2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createLive success:");
        boolean z17 = this.f314977d;
        sb6.append(z17);
        sb6.append(", errCode:");
        int i17 = this.f314978e;
        sb6.append(i17);
        sb6.append(" needFaceVerify:");
        boolean z18 = this.f314979f;
        sb6.append(z18);
        sb6.append(" verifyUrl:");
        java.lang.String str = this.f314980g;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveExternalHelper", sb6.toString());
        r45.l01 l01Var = this.f314984n;
        if (z17) {
            gk2.e eVar = this.f314981h;
            ya2.b2 b2Var = ((mm2.c1) eVar.a(mm2.c1.class)).J4;
            if (b2Var == null) {
                ya2.g gVar = ya2.h.f542017a;
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                b2Var = gVar.b(xy2.c.e(context));
            }
            if (b2Var != null) {
                mm2.c1 c1Var = (mm2.c1) eVar.a(mm2.c1.class);
                int i18 = (int) ((mm2.c1) eVar.a(mm2.c1.class)).f410399q;
                java.util.regex.Pattern pattern = pm0.v.f438335a;
                c1Var.p8(i18 & (-257));
                ((mm2.c1) eVar.a(mm2.c1.class)).Z9(((mm2.c1) eVar.a(mm2.c1.class)).f410399q);
                ((mm2.c1) eVar.a(mm2.c1.class)).aa(b2Var.f69326x798040b1);
                ((mm2.c1) eVar.a(mm2.c1.class)).T9(b2Var.f69326x798040b1);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n2.f197173a.e("postLive", (int) ((mm2.c1) eVar.a(mm2.c1.class)).f410399q);
            dk2.xf.e(this.f314982i, ((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0), ((mm2.e1) eVar.a(mm2.e1.class)).f410516m, ((mm2.c1) eVar.a(mm2.c1.class)).f410399q, 0, false, null, 56, null);
            dk2.u7.f315714a.i();
            dk2.k6 k6Var = this.f314983m;
            r45.wp1 wp1Var = k6Var.f315217b;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) l01Var.m75936x14adae67(1);
            wp1Var.set(5, c19792x256d2725 != null ? c19792x256d2725.m76844x18abdfee() : null);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("before joinLive: anchorStatusFlag:");
            sb7.append((int) ((mm2.c1) eVar.a(mm2.c1.class)).f410399q);
            sb7.append(", switchFlag:");
            sb7.append(b2Var != null ? java.lang.Long.valueOf(b2Var.f69326x798040b1) : null);
            sb7.append(" giftFuncEnabel:");
            sb7.append(((mm2.c1) eVar.a(mm2.c1.class)).f410395p3);
            sb7.append(", linkMicFuncEnabel:");
            sb7.append(((mm2.o4) eVar.a(mm2.o4.class)).I);
            sb7.append(", wxaGameExportId:");
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) l01Var.m75936x14adae67(1);
            sb7.append(c19792x256d27252 != null ? c19792x256d27252.m76844x18abdfee() : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveExternalHelper", sb7.toString());
            dk2.xf xfVar = this.f314982i;
            if (xfVar != null) {
                ((dk2.r4) xfVar).E(null, ((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0), 1, null, new dk2.e6(this.f314985o, k6Var, eVar));
            }
        } else {
            int i19 = this.f314986p;
            if (!z18 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8 p8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.f183993a;
                java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.f184108u.f184073b;
                r45.l84 l84Var = new r45.l84();
                l84Var.set(1, java.lang.Integer.valueOf(i17));
                l84Var.set(2, this.f314987q);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.c(p8Var, str2, hc2.b.a(l84Var), false, true, 4, null);
                android.os.Bundle bundle = new android.os.Bundle();
                yz5.t tVar = this.f314985o;
                java.lang.String str3 = this.f314987q;
                r45.qp1 qp1Var = (r45.qp1) l01Var.m75936x14adae67(3);
                bundle.putByteArray("EXT_INFO_KEY_ERROR_PAGE", qp1Var != null ? qp1Var.mo14344x5f01b1f6() : null);
                tVar.J(java.lang.Boolean.FALSE, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19), str3, bundle, l01Var);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.f183993a, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.f184109v.f184073b, null, false, false, 14, null);
                android.os.Bundle bundle2 = new android.os.Bundle();
                yz5.t tVar2 = this.f314985o;
                java.lang.String str4 = this.f314987q;
                bundle2.putString("EXT_INFO_KEY_REAL_NAME_URL", str);
                tVar2.J(java.lang.Boolean.FALSE, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19), str4, bundle2, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
