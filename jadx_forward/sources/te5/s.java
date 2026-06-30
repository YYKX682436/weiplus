package te5;

/* loaded from: classes9.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f500268d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f500269e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f500270f;

    /* renamed from: g, reason: collision with root package name */
    public long f500271g;

    /* renamed from: h, reason: collision with root package name */
    public int f500272h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ x05.k f500273i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f500274m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.view.View f500275n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f500276o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f500277p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(x05.k kVar, long j17, android.view.View view, long j18, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f500273i = kVar;
        this.f500274m = j17;
        this.f500275n = view;
        this.f500276o = j18;
        this.f500277p = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new te5.s(this.f500273i, this.f500274m, this.f500275n, this.f500276o, this.f500277p, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((te5.s) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String authContent;
        java.lang.Object a17;
        long j17;
        android.view.View view;
        x05.k kVar;
        java.lang.String m174827x6d346f39;
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f500272h;
        sl2.h hVar = sl2.h.f490784a;
        long j18 = this.f500274m;
        android.view.View view2 = this.f500275n;
        x05.k kVar2 = this.f500273i;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
            r45.g92 a18 = zy2.e5.a(kVar2);
            android.content.Context context = view2.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            this.f500268d = view2;
            authContent = this.f500277p;
            this.f500269e = authContent;
            this.f500270f = kVar2;
            this.f500271g = j18;
            this.f500272h = 1;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) w0Var).getClass();
            a17 = hVar.a(a18, context, this);
            if (a17 == aVar) {
                return aVar;
            }
            j17 = j18;
            view = view2;
            kVar = kVar2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j19 = this.f500271g;
            x05.k kVar3 = (x05.k) this.f500270f;
            java.lang.String str2 = (java.lang.String) this.f500269e;
            android.view.View view3 = (android.view.View) this.f500268d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            view = view3;
            authContent = str2;
            a17 = obj;
            kVar = kVar3;
            j17 = j19;
        }
        boolean booleanValue = ((java.lang.Boolean) a17).booleanValue();
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (!booleanValue) {
            s40.w0 w0Var2 = (s40.w0) i95.n0.c(s40.w0.class);
            android.content.Context context2 = view.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type android.app.Activity");
            java.lang.String s17 = kVar.s();
            ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) w0Var2).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(authContent, "authContent");
            hVar.d((android.app.Activity) context2, j17, authContent, s17);
            return f0Var;
        }
        if (j18 != 0) {
            boolean Zi = ((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).Zi(kVar2.m174826x93d5ac12(), view2.findViewById(com.p314xaae8f345.mm.R.id.f4x), view2.findViewById(com.p314xaae8f345.mm.R.id.f7y), this.f500276o);
            boolean vk6 = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).vk(null, "chat");
            if (!Zi || vk6) {
                java.lang.String m174826x93d5ac12 = kVar2.m174826x93d5ac12();
                boolean z17 = m174826x93d5ac12 == null || m174826x93d5ac12.length() == 0;
                long j27 = this.f500276o;
                if (!z17) {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(kVar2.m174826x93d5ac12(), ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ui(view2.getContext()))) {
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("KEY_PARAMS_SOURCE_TYPE", kVar2.m174830xac019deb());
                        s40.w0 w0Var3 = (s40.w0) i95.n0.c(s40.w0.class);
                        android.content.Context context3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                        long j28 = this.f500274m;
                        java.lang.Long l17 = new java.lang.Long(j27);
                        java.lang.String B = kVar2.B();
                        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) w0Var3).oj(intent, context3, j28, l17, B == null ? "" : B, kVar2.s(), "", "", "");
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemHelperKt", "onQuoteLiveMsgClick livestate: " + kVar2.m174828x2220c3f4());
                android.content.Context context4 = view2.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context4, "getContext(...)");
                android.content.Intent intent2 = new android.content.Intent();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemHelperKt", "enterFinderLiveVisitorUI feedId:" + pm0.v.u(j18) + ", liveId:" + pm0.v.u(j27));
                java.lang.String Gj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Gj(3, 2, 65);
                intent2.putExtra("CURRENT_FEED_ID", j18);
                intent2.putExtra("key_enter_live_param_bind_type", kVar2.k());
                java.lang.String m174824xa822edd3 = kVar2.m174824xa822edd3();
                if (m174824xa822edd3 == null) {
                    m174824xa822edd3 = "";
                }
                intent2.putExtra("key_enter_live_param_by_biz_username", m174824xa822edd3);
                java.lang.String m174823xbc300d6b = kVar2.m174823xbc300d6b();
                if (m174823xbc300d6b == null) {
                    m174823xbc300d6b = "";
                }
                intent2.putExtra("key_enter_live_param_by_biz_nickname", m174823xbc300d6b);
                x05.n K = kVar2.K();
                java.lang.String m174833x66e287ae = K != null ? K.m174833x66e287ae() : null;
                if (m174833x66e287ae == null || m174833x66e287ae.length() == 0) {
                    java.lang.String m174827x6d346f392 = kVar2.m174827x6d346f39();
                    m174827x6d346f39 = !(m174827x6d346f392 == null || m174827x6d346f392.length() == 0) ? kVar2.m174827x6d346f39() : "";
                } else {
                    x05.n K2 = kVar2.K();
                    m174827x6d346f39 = K2 != null ? K2.m174833x66e287ae() : null;
                }
                intent2.putExtra("key_enter_live_cover_url", m174827x6d346f39);
                x05.o E = kVar2.E();
                if (E == null || (str = E.j()) == null) {
                    str = "";
                }
                intent2.putExtra("KEY_ENTER_LIVE_PARAM_DISCOUNT_ACTIVITY_KEY", str);
                intent2.putExtra("KEY_ENTER_LIVE_PARAM_LIVE_EVENT_SOURCE", 7);
                r45.m84 m84Var = new r45.m84();
                m84Var.set(0, java.lang.Long.valueOf(j18));
                m84Var.set(1, java.lang.Long.valueOf(j27));
                java.lang.String B2 = kVar2.B();
                if (B2 == null) {
                    B2 = "";
                }
                m84Var.set(2, B2);
                java.lang.String m174826x93d5ac122 = kVar2.m174826x93d5ac12();
                if (m174826x93d5ac122 == null) {
                    m174826x93d5ac122 = "";
                }
                m84Var.set(3, m174826x93d5ac122);
                m84Var.set(4, "");
                m84Var.set(5, kVar2.s());
                r45.wk0 wk0Var = new r45.wk0();
                wk0Var.set(0, Gj);
                wk0Var.set(1, "");
                wk0Var.set(3, -1);
                wk0Var.set(4, -1);
                wk0Var.set(5, 1);
                wk0Var.set(7, new r45.ta4());
                ((vd2.f1) ((ss5.e0) i95.n0.c(ss5.e0.class))).Ri(context4, intent2, m84Var, false, wk0Var, null);
            } else {
                android.content.Context context5 = view2.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context5, "getContext(...)");
                long j29 = this.f500274m;
                long j37 = this.f500276o;
                java.lang.String Gj2 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Gj(3, 2, 65);
                int n17 = kVar2.n();
                ((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).Vi(false, j29, ya.a.f77453x4b357bf, ((n17 == 2 || n17 == 8 || n17 == 16) || kVar2.n() == 6) ? 1 : 2, 1);
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                android.content.Intent b17 = vd2.t3.f517454a.b(null, ya.a.f77453x4b357bf, 1);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemHelperKt", "jumpToReplayLive validStatus");
                ss5.i0 i0Var = (ss5.i0) i95.n0.c(ss5.i0.class);
                java.lang.String m174826x93d5ac123 = kVar2.m174826x93d5ac12();
                java.lang.String str3 = m174826x93d5ac123 == null ? "" : m174826x93d5ac123;
                java.lang.String B3 = kVar2.B();
                ((vd2.d5) i0Var).wi(b17, context5, j29, j37, str3, B3 == null ? "" : B3, kVar2.s(), Gj2, ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Ck());
            }
        }
        return f0Var;
    }
}
