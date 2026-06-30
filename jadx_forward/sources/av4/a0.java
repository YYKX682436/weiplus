package av4;

/* loaded from: classes.dex */
public final class a0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f95787d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f95788e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f95789f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f95790g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f95791h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f95792i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f95793m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f95794n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ nw4.k f95795o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ double f95796p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f95797q;

    public a0(int i17, java.lang.String str, java.lang.String str2, int i18, java.lang.String str3, int i19, boolean z17, android.content.Intent intent, nw4.k kVar, double d17, boolean z18) {
        this.f95787d = i17;
        this.f95788e = str;
        this.f95789f = str2;
        this.f95790g = i18;
        this.f95791h = str3;
        this.f95792i = i19;
        this.f95793m = z17;
        this.f95794n = intent;
        this.f95795o = kVar;
        this.f95796p = d17;
        this.f95797q = z18;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        java.lang.String str;
        java.util.Map t17 = kz5.c1.t(((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2395x60b7c31.C19212xf72cfeaa) obj).f263084d);
        int i17 = this.f95787d;
        boolean a17 = tg0.r2.a(i17);
        java.lang.String str2 = this.f95788e;
        if (a17) {
            str = str2;
        } else {
            try {
                str = fp.s0.b(str2, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
            } catch (java.lang.Throwable unused) {
                str = str2;
            }
            if (str == null) {
                str = "";
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        t17.put("query", str);
        t17.put("isHalfScreen", "1");
        java.lang.String f17 = su4.r2.f(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f17);
        t17.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, f17);
        boolean a18 = tg0.r2.a(i17);
        java.lang.String str3 = this.f95789f;
        if (!a18) {
            str3 = fp.s0.a(str3);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
        t17.put("thirdExtParam", str3);
        java.lang.String h17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.a0) ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.w1) ((su4.x0) i95.n0.c(su4.x0.class))).Zi()).h(su4.t0.MP, this.f95787d, this.f95790g, f17, f17, this.f95788e, null, this.f95791h);
        if (h17 != null) {
            t17.put("pRequestId", h17);
        }
        boolean z17 = this.f95792i == 0;
        boolean z18 = this.f95793m;
        if (z18 && !z17) {
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            java.lang.String valueOf = java.lang.String.valueOf(ri.l0.a(kz5.c1.k(new jz5.l("hideNavBar", bool), new jz5.l("hideSearchBar", bool))));
            if (!tg0.r2.a(i17)) {
                valueOf = fp.s0.a(valueOf);
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
            t17.put("extParams", valueOf);
        }
        android.content.Intent intent = this.f95794n;
        intent.putExtra("ftsQuery", str2);
        intent.putExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, f17);
        intent.putExtra("rawUrl", su4.r2.e(t17, 0));
        intent.putExtra("ftsbizscene", i17);
        intent.putExtra("key_search_icon_and_hint_fix_default", true);
        intent.putExtra("ftsInitToSearch", true);
        boolean z19 = !z17;
        intent.putExtra("hideSearchCancel", z19);
        intent.putExtra("hideSearchInput", z19);
        if (!z17) {
            intent.putExtra("key_back_btn_type", 2);
            intent.putExtra("hideSearchTitle", true);
        }
        ((yg0.c4) ((zg0.f3) i95.n0.c(zg0.f3.class))).Ai(new zg0.s3(this.f95795o.f422393a, intent, false, this.f95796p, (this.f95797q && z17) || z18, null, null, false, 224, null));
    }
}
