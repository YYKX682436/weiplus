package av4;

/* loaded from: classes.dex */
public final class a0 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14254d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f14255e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f14256f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f14257g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f14258h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f14259i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f14260m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f14261n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ nw4.k f14262o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ double f14263p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f14264q;

    public a0(int i17, java.lang.String str, java.lang.String str2, int i18, java.lang.String str3, int i19, boolean z17, android.content.Intent intent, nw4.k kVar, double d17, boolean z18) {
        this.f14254d = i17;
        this.f14255e = str;
        this.f14256f = str2;
        this.f14257g = i18;
        this.f14258h = str3;
        this.f14259i = i19;
        this.f14260m = z17;
        this.f14261n = intent;
        this.f14262o = kVar;
        this.f14263p = d17;
        this.f14264q = z18;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        java.lang.String str;
        java.util.Map t17 = kz5.c1.t(((com.tencent.mm.plugin.websearch.jsapi.OpenWXSearchHalfPageJSApi$ResponseWrapper) obj).f181551d);
        int i17 = this.f14254d;
        boolean a17 = tg0.r2.a(i17);
        java.lang.String str2 = this.f14255e;
        if (a17) {
            str = str2;
        } else {
            try {
                str = fp.s0.b(str2, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
            } catch (java.lang.Throwable unused) {
                str = str2;
            }
            if (str == null) {
                str = "";
            }
        }
        kotlin.jvm.internal.o.d(str);
        t17.put("query", str);
        t17.put("isHalfScreen", "1");
        java.lang.String f17 = su4.r2.f(i17);
        kotlin.jvm.internal.o.d(f17);
        t17.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, f17);
        boolean a18 = tg0.r2.a(i17);
        java.lang.String str3 = this.f14256f;
        if (!a18) {
            str3 = fp.s0.a(str3);
        }
        kotlin.jvm.internal.o.d(str3);
        t17.put("thirdExtParam", str3);
        java.lang.String h17 = ((com.tencent.mm.plugin.websearch.a0) ((com.tencent.mm.plugin.websearch.w1) ((su4.x0) i95.n0.c(su4.x0.class))).Zi()).h(su4.t0.MP, this.f14254d, this.f14257g, f17, f17, this.f14255e, null, this.f14258h);
        if (h17 != null) {
            t17.put("pRequestId", h17);
        }
        boolean z17 = this.f14259i == 0;
        boolean z18 = this.f14260m;
        if (z18 && !z17) {
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            java.lang.String valueOf = java.lang.String.valueOf(ri.l0.a(kz5.c1.k(new jz5.l("hideNavBar", bool), new jz5.l("hideSearchBar", bool))));
            if (!tg0.r2.a(i17)) {
                valueOf = fp.s0.a(valueOf);
            }
            kotlin.jvm.internal.o.d(valueOf);
            t17.put("extParams", valueOf);
        }
        android.content.Intent intent = this.f14261n;
        intent.putExtra("ftsQuery", str2);
        intent.putExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, f17);
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
        ((yg0.c4) ((zg0.f3) i95.n0.c(zg0.f3.class))).Ai(new zg0.s3(this.f14262o.f340860a, intent, false, this.f14263p, (this.f14264q && z17) || z18, null, null, false, 224, null));
    }
}
