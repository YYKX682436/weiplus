package sg0;

/* loaded from: classes8.dex */
public final class v2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f489362d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f489363e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f489364f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f489365g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f489366h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ sg0.w2 f489367i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f489368m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f489369n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f489370o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f489371p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f489372q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f489373r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f489374s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f489375t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f489376u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f489377v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(int i17, java.lang.String str, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, sg0.w2 w2Var, java.lang.String str2, boolean z17, boolean z18, boolean z19, java.lang.String str3, java.util.Map map, boolean z27, long j17, android.view.ViewGroup viewGroup, p3325xe03a0797.p3326xc267989b.y0 y0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f489364f = i17;
        this.f489365g = str;
        this.f489366h = activityC0065xcd7aa112;
        this.f489367i = w2Var;
        this.f489368m = str2;
        this.f489369n = z17;
        this.f489370o = z18;
        this.f489371p = z19;
        this.f489372q = str3;
        this.f489373r = map;
        this.f489374s = z27;
        this.f489375t = j17;
        this.f489376u = viewGroup;
        this.f489377v = y0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        sg0.v2 v2Var = new sg0.v2(this.f489364f, this.f489365g, this.f489366h, this.f489367i, this.f489368m, this.f489369n, this.f489370o, this.f489371p, this.f489372q, this.f489373r, this.f489374s, this.f489375t, this.f489376u, this.f489377v, interfaceC29045xdcb5ca57);
        v2Var.f489363e = obj;
        return v2Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((sg0.v2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        ou4.d0 wi6;
        ou4.d0 d0Var;
        p012xc85e97e9.p093xedfae76a.o oVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f489362d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        try {
            try {
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.hitest.WebSearchFlutterService", "tryShowSearchResultPage failed: " + e17.getMessage(), e17);
                java.lang.String str = (java.lang.String) this.f489367i.f489383n.remove(new java.lang.Long(this.f489375t));
                if (str != null) {
                    try {
                        ou4.e0 hj6 = this.f489367i.hj();
                        if (hj6 != null) {
                            ((ou4.z) hj6).Ai(str);
                        }
                    } catch (java.lang.Exception unused) {
                    }
                }
                this.f489367i.f489385p.remove(new java.lang.Long(this.f489375t));
            }
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.hitest.WebSearchFlutterService", "tryShowSearchResultPage, scene: " + this.f489364f + ", searchText: " + this.f489365g);
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65473x269eedd3(this.f489366h, "wxalite13df24d39cdd33868c7c01a247000f87");
                java.util.Map Zi = sg0.w2.Zi(this.f489367i, this.f489364f, this.f489365g, this.f489368m, this.f489369n, this.f489370o, this.f489371p, this.f489372q, this.f489373r, this.f489374s);
                sg0.j2 aj6 = sg0.w2.aj(this.f489367i);
                java.util.List cj6 = sg0.w2.cj(this.f489367i, aj6);
                ou4.d0 fj6 = sg0.w2.fj(this.f489367i);
                if (fj6 != null) {
                    ((ou4.s) fj6).a(cj6);
                    wi6 = fj6;
                } else {
                    ou4.e0 hj7 = this.f489367i.hj();
                    wi6 = hj7 != null ? ((ou4.z) hj7).wi("websearch", new ou4.t("result_page", Zi, cj6, false, false, null, 56, null)) : null;
                }
                if (wi6 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.hitest.WebSearchFlutterService", "IFlutterContainerService not available, cannot create container");
                    return f0Var;
                }
                this.f489367i.f489383n.put(new java.lang.Long(this.f489375t), ((ou4.s) wi6).f430550a);
                this.f489367i.f489385p.put(new java.lang.Long(this.f489375t), new sg0.i2(aj6, this.f489366h));
                ou4.s sVar = (ou4.s) wi6;
                sVar.d(vg0.n.f517996a.a(null));
                if (((ou4.s) wi6).f430559j) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.hitest.WebSearchFlutterService", "tryShowSearchResultPage: reusing preloaded container");
                    this.f489363e = wi6;
                    this.f489362d = 1;
                    if (sVar.c("result_page", Zi, this) == aVar) {
                        return aVar;
                    }
                } else {
                    this.f489363e = wi6;
                    this.f489362d = 2;
                    if (sVar.f(this) == aVar) {
                        return aVar;
                    }
                }
                d0Var = wi6;
            } else {
                if (i17 != 1 && i17 != 2) {
                    if (i17 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.hitest.WebSearchFlutterService", "showAsView end");
                    return f0Var;
                }
                d0Var = (ou4.d0) this.f489363e;
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6 c10716x931597c6 = this.f489374s ? new com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6(0, 0, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode.opaque, false, false, false, null, 0, false, false, false, null, 3323, null) : new com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6(0, 0, null, false, false, false, null, 0, false, true, false, null, 3327, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.hitest.WebSearchFlutterService", "showAsView start");
            android.view.ViewGroup viewGroup = this.f489376u;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f489366h;
            if (activityC0065xcd7aa112 == null || (oVar = activityC0065xcd7aa112.mo273xed6858b4()) == null) {
                oVar = (jm0.s) ((jz5.n) this.f489367i.f381810e).mo141623x754a37bb();
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(oVar);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa1122 = this.f489366h;
            this.f489363e = null;
            this.f489362d = 3;
            if (((ou4.s) d0Var).e(viewGroup, oVar, c10716x931597c6, activityC0065xcd7aa1122, this) == aVar) {
                return aVar;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.hitest.WebSearchFlutterService", "showAsView end");
            return f0Var;
        } finally {
            p3325xe03a0797.p3326xc267989b.z0.e(this.f489377v, null, 1, null);
        }
    }
}
