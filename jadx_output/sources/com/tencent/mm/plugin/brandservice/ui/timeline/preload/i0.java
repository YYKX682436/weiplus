package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes8.dex */
public final class i0 {
    public long C;
    public long D;
    public long E;
    public long F;
    public long G;
    public long H;
    public long I;

    /* renamed from: J, reason: collision with root package name */
    public long f94267J;
    public long K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public int V;
    public boolean W;
    public boolean X;
    public int Y;
    public long Z;

    /* renamed from: a, reason: collision with root package name */
    public r45.wm6 f94268a;

    /* renamed from: a0, reason: collision with root package name */
    public long f94269a0;

    /* renamed from: b0, reason: collision with root package name */
    public long f94271b0;

    /* renamed from: c0, reason: collision with root package name */
    public long f94273c0;

    /* renamed from: d, reason: collision with root package name */
    public int f94274d;

    /* renamed from: d0, reason: collision with root package name */
    public long f94275d0;

    /* renamed from: e0, reason: collision with root package name */
    public long f94277e0;

    /* renamed from: f0, reason: collision with root package name */
    public long f94279f0;

    /* renamed from: g0, reason: collision with root package name */
    public long f94281g0;

    /* renamed from: h0, reason: collision with root package name */
    public long f94283h0;

    /* renamed from: i0, reason: collision with root package name */
    public long f94285i0;

    /* renamed from: j, reason: collision with root package name */
    public long f94286j;

    /* renamed from: k, reason: collision with root package name */
    public long f94288k;

    /* renamed from: l, reason: collision with root package name */
    public long f94290l;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f94291l0;

    /* renamed from: m, reason: collision with root package name */
    public long f94292m;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f94293m0;

    /* renamed from: n, reason: collision with root package name */
    public long f94294n;

    /* renamed from: o, reason: collision with root package name */
    public long f94296o;

    /* renamed from: p, reason: collision with root package name */
    public long f94298p;

    /* renamed from: q, reason: collision with root package name */
    public long f94300q;

    /* renamed from: r, reason: collision with root package name */
    public long f94301r;

    /* renamed from: s, reason: collision with root package name */
    public long f94302s;

    /* renamed from: t, reason: collision with root package name */
    public long f94303t;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f94270b = "";

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f94272c = "";

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f94276e = jz5.h.b(new com.tencent.mm.plugin.brandservice.ui.timeline.preload.c0(this));

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f94278f = jz5.h.b(new com.tencent.mm.plugin.brandservice.ui.timeline.preload.f0(this));

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f94280g = jz5.h.b(new com.tencent.mm.plugin.brandservice.ui.timeline.preload.d0(this));

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f94282h = jz5.h.b(new com.tencent.mm.plugin.brandservice.ui.timeline.preload.e0(this));

    /* renamed from: i, reason: collision with root package name */
    public long f94284i = -1;

    /* renamed from: u, reason: collision with root package name */
    public long f94304u = -1;

    /* renamed from: v, reason: collision with root package name */
    public long f94305v = -1;

    /* renamed from: w, reason: collision with root package name */
    public long f94306w = -1;

    /* renamed from: x, reason: collision with root package name */
    public long f94307x = -1;

    /* renamed from: y, reason: collision with root package name */
    public long f94308y = -1;

    /* renamed from: z, reason: collision with root package name */
    public long f94309z = -1;
    public long A = -1;
    public long B = -1;

    /* renamed from: j0, reason: collision with root package name */
    public java.lang.String f94287j0 = "";

    /* renamed from: k0, reason: collision with root package name */
    public final jz5.g f94289k0 = jz5.h.b(com.tencent.mm.plugin.brandservice.ui.timeline.preload.h0.f94255d);

    /* renamed from: n0, reason: collision with root package name */
    public int f94295n0 = 10000;

    /* renamed from: o0, reason: collision with root package name */
    public final jz5.g f94297o0 = jz5.h.b(new com.tencent.mm.plugin.brandservice.ui.timeline.preload.g0(this));

    /* renamed from: p0, reason: collision with root package name */
    public final long f94299p0 = 3600000;

    public static final java.lang.Long[] a(com.tencent.mm.plugin.brandservice.ui.timeline.preload.i0 i0Var, java.lang.Long[] lArr, long... jArr) {
        i0Var.getClass();
        int i17 = 0;
        if (jArr.length == 0) {
            throw new java.lang.UnsupportedOperationException("Empty array can't be reduced.");
        }
        long j17 = jArr[0];
        kz5.x0 it = new e06.k(1, jArr.length - 1).iterator();
        while (((e06.j) it).f246214f) {
            j17 *= jArr[it.b()];
        }
        if (j17 == 0) {
            kotlin.jvm.internal.o.g(lArr, "<this>");
            int length = lArr.length - 1;
            if (length >= 0) {
                while (true) {
                    lArr[i17] = -1L;
                    if (i17 == length) {
                        break;
                    }
                    i17++;
                }
            }
        }
        return lArr;
    }

    public static final java.lang.String n(long j17, com.tencent.mm.plugin.brandservice.ui.timeline.preload.i0 i0Var) {
        return (i0Var.f(j17) > j17 ? 1 : (i0Var.f(j17) == j17 ? 0 : -1)) == 0 ? java.lang.String.valueOf(j17) : "NaN";
    }

    public final java.lang.String b(float f17, int i17) {
        return java.lang.String.format("%." + i17 + 'f', java.lang.Float.valueOf(f17));
    }

    public final int c() {
        return ((java.lang.Number) ((jz5.n) this.f94278f).getValue()).intValue();
    }

    public final r45.wm6 d() {
        r45.wm6 wm6Var = this.f94268a;
        if (wm6Var != null) {
            return wm6Var;
        }
        kotlin.jvm.internal.o.o("tmplParams");
        throw null;
    }

    public final java.lang.String e() {
        return (java.lang.String) ((jz5.n) this.f94289k0).getValue();
    }

    public final long f(long j17) {
        long j18 = this.f94299p0;
        return java.lang.Math.min(java.lang.Math.max(-j18, j17), j18);
    }

    public final java.lang.String g() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (!this.L) {
            sb6.append("async;");
        }
        if (this.P) {
            sb6.append("mounted;");
        }
        if (this.T) {
            sb6.append("cache_tmpl;");
        }
        if (r26.n0.N(sb6)) {
            sb6.append("ok;");
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    public final java.lang.String h(java.lang.CharSequence charSequence) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0.a().getBoolean("preload_tmpl_test_noredir", false)) {
            sb6.append(((java.lang.Object) charSequence) + "no re-direct;");
        }
        boolean z17 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0.a().getBoolean("preload_data", true);
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.UseNewProfile", "//mppagefastopen data false");
        }
        if (!z17) {
            sb6.append(((java.lang.Object) charSequence) + "no preload data;");
        }
        if (com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0.a().getBoolean("preload_tmpl_test_no_preload_next", false)) {
            sb6.append(((java.lang.Object) charSequence) + "no preload webview;");
        }
        if (com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0.a().getBoolean("preload_data_noexpire", false)) {
            sb6.append(((java.lang.Object) charSequence) + "data no expire;");
        }
        if (com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0.a().getBoolean("preload_tmpl_test_no_red", false)) {
            sb6.append(((java.lang.Object) charSequence) + "no red;");
        }
        java.lang.String headers = d().f389298m;
        kotlin.jvm.internal.o.f(headers, "headers");
        if (!r26.n0.N(headers)) {
            sb6.append(d().f389298m);
        }
        if (r26.n0.N(sb6)) {
            sb6.append("none;");
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    public final java.lang.String i() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (this.V == 1) {
            sb6.append("relanuch;");
        }
        if (!this.U) {
            sb6.append("cold;");
        }
        if (r26.n0.N(sb6)) {
            sb6.append("ok;");
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    public final java.lang.String j() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (this.Q) {
            sb6.append("zip;");
        }
        if (this.R) {
            sb6.append("prefixMP;");
        }
        if (r26.n0.N(sb6)) {
            sb6.append("none;");
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    public final java.lang.String k() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (this.V == 2) {
            sb6.append("relanuch;");
        }
        if (!this.M) {
            sb6.append("cold;");
        }
        if (!this.O) {
            sb6.append("tmpl fail;");
        } else if (!this.N) {
            sb6.append("inject fail;");
        }
        if (this.f94293m0) {
            sb6.append("timeout;");
        } else if (this.f94291l0) {
            sb6.append("h5;");
        }
        if (this.S) {
            sb6.append("xweb_cc;");
        }
        if (r26.n0.N(sb6)) {
            sb6.append("ok;");
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    public final void l(yz5.q data) {
        java.lang.String str;
        int i17;
        kotlin.jvm.internal.o.g(data, "data");
        if (this.W && this.X) {
            ax4.a.b(d().f389300o, 132, 1, true);
            java.lang.String b17 = com.tencent.mm.pluginsdk.model.e.f189277a.b();
            long max = java.lang.Math.max(this.f94288k, this.f94303t);
            long j17 = this.f94288k;
            long j18 = this.f94303t;
            this.Y = j17 < j18 ? 1 : 2;
            long j19 = this.f94286j;
            this.Z = max - j19;
            this.f94279f0 = this.f94296o - j19;
            long j27 = this.f94307x;
            long j28 = j27 - this.f94308y;
            this.f94277e0 = j28;
            this.f94281g0 = j18 - j19;
            this.f94283h0 = j18 - 0;
            this.f94290l = j17 - j19;
            long j29 = this.f94304u;
            long j37 = j29 - j19;
            this.f94269a0 = j37;
            long j38 = this.f94305v - j29;
            this.f94271b0 = j38;
            long j39 = this.f94300q - this.f94298p;
            this.f94275d0 = j39;
            long j47 = j27 - this.f94306w;
            this.f94273c0 = j47;
            this.f94284i = j28;
            this.f94285i0 = j37 + j38 + j39 + j47 + this.f94294n + this.f94292m;
            d();
            c();
            d();
            d();
            e();
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            try {
                java.lang.String str3 = this.f94272c;
                kotlin.jvm.internal.o.d(str3);
                str = fp.s0.b(str3, com.tencent.mapsdk.internal.rv.f51270c);
            } catch (java.io.UnsupportedEncodingException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Preload.Kv15862", e17, "url:%d", this.f94272c);
                str = null;
            }
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.d(15862, java.lang.Integer.valueOf(d().f389293e), str, java.lang.Integer.valueOf(c()), b17, java.lang.Long.valueOf(f(this.Z)), java.lang.Integer.valueOf(this.Y), java.lang.Long.valueOf(f(this.f94290l)), java.lang.Long.valueOf(f(this.f94281g0)), java.lang.Integer.valueOf(this.M ? 1 : 0), java.lang.Long.valueOf(f(this.A - this.f94309z)), java.lang.Integer.valueOf(this.L ? 1 : 0), java.lang.Long.valueOf(f(this.f94275d0)), java.lang.Long.valueOf(f(this.f94283h0)), java.lang.Long.valueOf(f(this.f94279f0)), java.lang.Long.valueOf(f(this.f94294n)), java.lang.Long.valueOf(f(this.f94292m)), java.lang.Integer.valueOf(d().f389292d), d().f389297i, this.f94287j0, e(), java.lang.Integer.valueOf(this.f94295n0), java.lang.Long.valueOf(f(this.f94277e0)), java.lang.Integer.valueOf(this.U ? 1 : 0), java.lang.Long.valueOf(f(this.f94269a0)), java.lang.Long.valueOf(f(this.f94271b0)), java.lang.Long.valueOf(f(this.f94273c0)));
            kotlin.jvm.internal.l0 l0Var = new kotlin.jvm.internal.l0(19);
            l0Var.a(str);
            l0Var.a(java.lang.Integer.valueOf(this.f94295n0));
            l0Var.a(b17);
            l0Var.a(java.lang.Integer.valueOf(c()));
            l0Var.a(d().f389297i);
            l0Var.a(e());
            l0Var.a(this.f94287j0);
            l0Var.a(java.lang.Integer.valueOf(this.L ? 1 : 0));
            l0Var.a(java.lang.Integer.valueOf(!this.U ? 1 : 0));
            l0Var.a(java.lang.Integer.valueOf(!this.M ? 1 : 0));
            l0Var.a(java.lang.Integer.valueOf(this.V));
            l0Var.a(java.lang.Integer.valueOf(this.P ? 1 : 0));
            l0Var.a(java.lang.Integer.valueOf(this.N ? 1 : 0));
            l0Var.a(java.lang.Long.valueOf(this.Z));
            jz5.g gVar = this.f94297o0;
            l0Var.b((java.lang.Long[]) ((jz5.n) gVar).getValue());
            l0Var.a(this.f94270b);
            l0Var.a(java.lang.Integer.valueOf(this.Q ? 1 : 0));
            l0Var.a(java.lang.Integer.valueOf(this.S ? 1 : 0));
            l0Var.a(java.lang.Long.valueOf(this.B));
            g0Var.d(16874, l0Var.d(new java.lang.Object[l0Var.c()]));
            ax4.a.c(0);
            if (this.Q) {
                ax4.a.c(111);
                i17 = 1;
                ax4.a.b(d().f389300o, 232, 1, true);
            } else {
                i17 = 1;
            }
            if (this.S) {
                ax4.a.c(113);
            }
            ax4.a.d(i17, this.Z);
            ax4.a.d(2, this.f94290l);
            long j48 = this.f94304u - this.f94286j;
            if (this.U) {
                ax4.a.d(10, this.Z);
                ax4.a.d(11, this.f94290l);
                ax4.a.d(12, j48);
                ax4.a.d(13, 0L);
                ax4.a.d(14, this.A - this.f94309z);
                ax4.a.d(15, this.f94307x - this.f94306w);
            } else {
                ax4.a.d(20, this.Z);
                ax4.a.d(21, this.f94290l);
                ax4.a.d(22, j48);
                ax4.a.d(23, 0L);
                if (!this.L) {
                    ax4.a.d(24, this.f94302s - this.f94301r);
                    ax4.a.c(107);
                }
            }
            java.lang.String str4 = "[" + kz5.n0.g0(kz5.z.s0((java.lang.Long[]) ((jz5.n) gVar).getValue(), 20), null, null, null, 0, null, null, 63, null) + ']';
            jz5.l lVar = new jz5.l("section", "[debug]");
            jz5.l lVar2 = new jz5.l("info", (java.lang.String) ((jz5.n) this.f94276e).getValue());
            jz5.l lVar3 = new jz5.l("settings", h(""));
            jz5.l lVar4 = new jz5.l("section", "[process]");
            jz5.l lVar5 = new jz5.l("process", e());
            jz5.l lVar6 = new jz5.l("state", i());
            jz5.l lVar7 = new jz5.l("section", "[webview]");
            jz5.l lVar8 = new jz5.l("kind", this.f94287j0);
            jz5.l lVar9 = new jz5.l("state", k());
            jz5.l lVar10 = new jz5.l("section", "[tmpl]");
            jz5.l lVar11 = new jz5.l("uid", d().f389297i);
            jz5.l lVar12 = new jz5.l("tmplType", java.lang.String.valueOf(d().f389292d));
            jz5.l lVar13 = new jz5.l("version", java.lang.String.valueOf(d().f389293e));
            jz5.l lVar14 = new jz5.l("md5", d().f389296h);
            jz5.l lVar15 = new jz5.l("time", m(d().f389299n));
            jz5.l lVar16 = new jz5.l("state", j());
            jz5.l lVar17 = new jz5.l("section", "[data]");
            jz5.l lVar18 = new jz5.l("dataSize", b(c() / 1024.0f, 2) + "Kb");
            jz5.l lVar19 = new jz5.l("dataTime", java.lang.String.valueOf(this.f94275d0));
            jz5.l lVar20 = new jz5.l("cached", m(((java.lang.Number) ((jz5.n) this.f94280g).getValue()).longValue()));
            jz5.l lVar21 = new jz5.l("version", java.lang.String.valueOf(((java.lang.Number) ((jz5.n) this.f94282h).getValue()).intValue()));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(this.f94274d);
            sb6.append('s');
            data.invoke("['FirstScreen', 'BindMP', 'WebView', 'WebViewUI', null, 'BindMM', 'JsAPI', 'GetA8Key', 'GetData', 'InjectData']", str4, kz5.c0.i(lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9, lVar10, lVar11, lVar12, lVar13, lVar14, lVar15, lVar16, lVar17, lVar18, lVar19, lVar20, lVar21, new jz5.l("expire in", sb6.toString()), new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.String.valueOf(this.f94295n0)), new jz5.l("state", g())));
            com.tencent.mars.xlog.Log.i("MicroMsg.Preload.Kv15862", "terry performance report:" + this.f94286j + '\n' + kz5.z.d0((java.lang.Long[]) ((jz5.n) gVar).getValue(), null, null, null, 0, null, null, 63, null));
        }
    }

    public final java.lang.String m(long j17) {
        java.lang.String format = new java.text.SimpleDateFormat("MM/dd HH:mm:ss").format(new java.util.Date(j17));
        kotlin.jvm.internal.o.f(format, "format(...)");
        return format;
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.Math.max(0L, this.A);
        java.lang.Math.max(0L, this.A);
        kz5.z.d0((java.lang.Long[]) ((jz5.n) this.f94297o0).getValue(), null, null, null, 0, null, null, 63, null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("\n            [debug]\n            info: ");
        sb6.append((java.lang.String) ((jz5.n) this.f94276e).getValue());
        sb6.append("\n            settings: ");
        sb6.append(h("\n"));
        sb6.append("\n\n            [process]\n            process: ");
        sb6.append(e());
        sb6.append("\n            state: ");
        sb6.append(i());
        sb6.append("\n\n            [webview]\n            kind: ");
        sb6.append(this.f94287j0);
        sb6.append("\n            state: ");
        sb6.append(k());
        sb6.append("\n\n            [tmpl]\n            uid: ");
        sb6.append(d().f389297i);
        sb6.append("\n            tmplType: ");
        sb6.append(d().f389292d);
        sb6.append("\n            version: ");
        sb6.append(d().f389293e);
        sb6.append("\n            md5: ");
        sb6.append(d().f389296h);
        sb6.append("\n            time: ");
        sb6.append(m(d().f389299n));
        sb6.append("\n            state: ");
        sb6.append(j());
        sb6.append("\n\n            [data]\n            dataSize: ");
        sb6.append(b(c() / 1024.0f, 2));
        sb6.append("Kb\n            dataTime: ");
        sb6.append(this.f94275d0);
        sb6.append("\n            cached: ");
        sb6.append(m(((java.lang.Number) ((jz5.n) this.f94280g).getValue()).longValue()));
        sb6.append("\n            version: ");
        sb6.append(((java.lang.Number) ((jz5.n) this.f94282h).getValue()).intValue());
        sb6.append("\n            expire in: ");
        sb6.append(this.f94274d);
        sb6.append("s\n            scene: ");
        sb6.append(this.f94295n0);
        sb6.append("\n            state: ");
        sb6.append(g());
        sb6.append("\n\n            [performance](ms)\n            finishType: ");
        sb6.append(this.Y);
        sb6.append("\n            finishTime: ");
        sb6.append(this.Z);
        if (this.Z != java.lang.Math.max(this.f94281g0, this.f94285i0)) {
            str = "/" + n(this.f94285i0, this);
        } else {
            str = "";
        }
        sb6.append(str);
        sb6.append("\n            firstScreenFinish: ");
        sb6.append(n(this.f94290l, this));
        sb6.append('/');
        sb6.append(n(this.f94285i0, this));
        sb6.append("\n            a8keyFinish: ");
        sb6.append(this.f94281g0);
        sb6.append("\n\n            client:\n            TmplCostTime: ");
        sb6.append(this.A - this.f94309z);
        sb6.append("\n            WebViewUICostTime: 0\n            NotifyPageCostTime: ");
        sb6.append(this.B - this.f94307x);
        sb6.append("\n\n            1.bindWebViewCostTime: ");
        sb6.append(this.f94269a0);
        sb6.append("\n            2.createWebViewCostTime: ");
        sb6.append(this.f94271b0);
        sb6.append("\n            3.getPageDataCostTime: ");
        sb6.append(this.f94275d0);
        sb6.append("\n            4.injectCostTime: ");
        sb6.append(n(this.f94273c0, this));
        sb6.append("\n            eval cost: ");
        sb6.append(this.f94284i);
        sb6.append("\n\n            js:\n            4.1.onReceivePageData: ");
        sb6.append(this.f94308y - this.f94296o);
        sb6.append("\n            5.ctWebCompile: ");
        sb6.append(this.f94294n);
        sb6.append("\n            6.renderTime: ");
        sb6.append(this.f94292m);
        sb6.append("\n\n            [js]webReceivePageDataTime: ");
        sb6.append(this.f94279f0);
        sb6.append("\n            a8KeyFinishTime: ");
        sb6.append(this.f94281g0);
        sb6.append("\n            getA8KeyCostTime: ");
        sb6.append(this.f94283h0);
        sb6.append("\n        ");
        return r26.b0.b(sb6.toString());
    }
}
