package rq2;

/* loaded from: classes2.dex */
public final class w extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public int f480435d;

    /* renamed from: e, reason: collision with root package name */
    public int f480436e;

    /* renamed from: f, reason: collision with root package name */
    public int f480437f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f480438g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f480439h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f480440i;

    /* renamed from: m, reason: collision with root package name */
    public long f480441m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f480442n;

    /* renamed from: o, reason: collision with root package name */
    public long f480443o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f480444p;

    /* renamed from: q, reason: collision with root package name */
    public int f480445q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f480446r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f480435d = -1;
        this.f480436e = -1;
        this.f480437f = -1;
        this.f480438g = new java.util.HashMap();
        this.f480440i = "";
        this.f480442n = true;
        this.f480444p = "";
        ws5.j[] jVarArr = ws5.j.f530751d;
        this.f480445q = 4;
        this.f480446r = true;
        this.f480445q = m158359x1e885992().getIntExtra("nearby_live_enter_source_params_key", 4);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbySquareEntranceReporterUIC", "on create, set enterSource to " + this.f480445q);
    }

    public final void O6(ml2.i5 action, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6521x558e678f c6521x558e678f = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6521x558e678f();
        if (str == null) {
            str = "";
        }
        c6521x558e678f.f138719d = c6521x558e678f.b("FinderUsrName", str, true);
        c6521x558e678f.f138721f = java.lang.System.currentTimeMillis();
        c6521x558e678f.f138722g = action.f409114d;
        java.lang.String str5 = this.f480439h;
        if (str5 == null) {
            str5 = "";
        }
        c6521x558e678f.f138725j = c6521x558e678f.b("commentscene", str5, true);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        if (b17 == null) {
            b17 = "";
        }
        c6521x558e678f.f138726k = c6521x558e678f.b("contextid", b17, true);
        if (str2 == null) {
            str2 = "";
        }
        c6521x558e678f.f138732q = c6521x558e678f.b("NotificationId", str2, true);
        c6521x558e678f.f138738w = c6521x558e678f.b("chnlExtra", str3, true);
        c6521x558e678f.f138739x = c6521x558e678f.b("NoticeID", str4, true);
        c6521x558e678f.k();
    }

    public final void P6(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbySquareEntranceReporterUIC", "report23057 chnlExtra: " + str + " contextId: " + str2 + " eidStr: " + str3 + " eidUdfKv: " + str4);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6464xd152d07e c6464xd152d07e = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6464xd152d07e();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        c6464xd152d07e.f138070d = java.lang.System.currentTimeMillis();
        c6464xd152d07e.u("");
        if (str == null) {
            str = "";
        }
        c6464xd152d07e.p(str);
        c6464xd152d07e.A("");
        c6464xd152d07e.y("");
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        c6464xd152d07e.w(Ri);
        if (str2 == null) {
            str2 = "";
        }
        c6464xd152d07e.r(str2);
        java.lang.String str5 = this.f480439h;
        if (str5 == null) {
            str5 = "";
        }
        c6464xd152d07e.q(str5);
        c6464xd152d07e.x("");
        c6464xd152d07e.v("");
        c6464xd152d07e.f138081o = c6464xd152d07e.b("ref_commentscene", "", true);
        if (str3 == null) {
            str3 = "";
        }
        c6464xd152d07e.s(str3);
        if (str4 == null) {
            str4 = "";
        }
        c6464xd152d07e.t(str4);
        c6464xd152d07e.z(((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).ck());
        c6464xd152d07e.k();
    }

    public final void Q6(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbySquareEntranceReporterUIC", "report23059 contextId: " + str + " eidStr: " + str2 + " eidUdfKv: " + str3);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6463x6ead4318 c6463x6ead4318 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6463x6ead4318();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        c6463x6ead4318.f138055d = java.lang.System.currentTimeMillis();
        c6463x6ead4318.u("");
        c6463x6ead4318.p("");
        c6463x6ead4318.B("");
        c6463x6ead4318.y("");
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        c6463x6ead4318.w(Ri);
        if (str == null) {
            str = "";
        }
        c6463x6ead4318.r(str);
        java.lang.String str4 = this.f480439h;
        if (str4 == null) {
            str4 = "";
        }
        c6463x6ead4318.q(str4);
        c6463x6ead4318.A("");
        c6463x6ead4318.x("");
        c6463x6ead4318.v("");
        if (str2 == null) {
            str2 = "";
        }
        c6463x6ead4318.s(str2);
        if (str3 == null) {
            str3 = "";
        }
        c6463x6ead4318.t(str3);
        c6463x6ead4318.z(((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).ck());
        c6463x6ead4318.k();
    }

    public final void R6(int i17) {
        this.f480437f = i17;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        ml2.b1.a(ml2.b1.f408744a, java.lang.String.valueOf(m158354x19263085().hashCode()), null, 2, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f480439h, "182") && this.f480446r) {
            this.f480446r = false;
            return;
        }
        cl0.g gVar = new cl0.g();
        gVar.s("is_new_square", 1);
        gVar.s(ya.b.f77502x92235c1b, java.lang.Integer.valueOf(this.f480445q));
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6465xc36db3c4 c6465xc36db3c4 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6465xc36db3c4();
        c6465xc36db3c4.f138086d = c01.id.c();
        c6465xc36db3c4.r(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f480439h, "182") ? "182" : "1001");
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        c6465xc36db3c4.f138090h = c6465xc36db3c4.b("sessionid", Ri, true);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        if (b17 == null) {
            b17 = "";
        }
        c6465xc36db3c4.q(b17);
        java.lang.String str = this.f480439h;
        c6465xc36db3c4.p(str != null ? str : "");
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        c6465xc36db3c4.s(r26.i0.t(gVar2, ",", ";", false));
        c6465xc36db3c4.f138097o = c6465xc36db3c4.b("switch_extra", ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).ck(), true);
        ml2.b1.f408744a.b(new ml2.a1(java.lang.String.valueOf(m158354x19263085().hashCode()), c6465xc36db3c4));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f480435d = -1;
        this.f480436e = -1;
        this.f480437f = -1;
        this.f480438g = new java.util.HashMap();
        this.f480440i = "";
        this.f480442n = true;
        this.f480444p = "";
        ws5.j[] jVarArr = ws5.j.f530751d;
        this.f480445q = 4;
        this.f480446r = true;
        this.f480445q = m158359x1e885992().getIntExtra("nearby_live_enter_source_params_key", 4);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbySquareEntranceReporterUIC", "on create, set enterSource to " + this.f480445q);
    }
}
