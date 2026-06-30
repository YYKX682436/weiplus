package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public class i0 extends com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.m implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.o B = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.o(null);
    public static final jz5.g C;
    public static final java.util.List D;
    public static final java.util.Map E;
    public static final java.util.Map F;
    public static final java.util.List G;
    public com.p314xaae8f345.mm.p944x882e457a.m1 A;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f242656f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f242657g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f242658h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f242659i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f242660m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f242661n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.ViewGroup f242662o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.ViewGroup f242663p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f242664q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f242665r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f242666s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.h f242667t;

    /* renamed from: u, reason: collision with root package name */
    public final yz5.a f242668u;

    /* renamed from: v, reason: collision with root package name */
    public int f242669v;

    /* renamed from: w, reason: collision with root package name */
    public yz5.a f242670w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.k f242671x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.Map f242672y;

    /* renamed from: z, reason: collision with root package name */
    public int f242673z;

    static {
        int g17 = bm5.o1.f104252a.g(bm5.h0.RepairerConfig_Global_ColorfulQRHardcodeStyle16_Int, 0);
        if (g17 != 0) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_QRCODE_NOW_SORT_INDEX_INT, 0);
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_QRCODE_HAS_SET_INT, 0);
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_QRCODE_OLD_STYLE_INT, java.lang.Integer.valueOf(g17));
            gm0.j1.u().c().w(66561, java.lang.Integer.valueOf(g17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Setting.ColorSelfQRCodeGradientFgWhiteBgUIC", "repairerCode set");
        }
        C = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.n.f242874d);
        D = kz5.c0.i(java.lang.Integer.valueOf(md1.f1.f72850x366c91de), 995, 996, 997, 800, java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.r0.f34827x366c91de), 802, 803, 804, 805);
        E = new java.util.LinkedHashMap();
        F = new java.util.LinkedHashMap();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p[] pVarArr = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p[10];
        pVarArr[0] = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p(0, 997, 0, 0, 0, null, null, 0, 0, 504, null);
        pVarArr[1] = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p(1, 997, 0, 0, 0, null, null, 0, 0, 504, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p pVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p(2, 995, 0, 0, 0, null, null, 0, 0, 504, null);
        int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("qrcode").getInt("color1", 0);
        int i18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("qrcode").getInt("color2", 0);
        if (i17 != 0 && i18 != 0) {
            pVar.f242944f = kz5.c0.k(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            pVar.f242943e = 2;
        }
        pVarArr[2] = pVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p pVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p(3, 996, 1, 0, 0, null, null, 0, 0, 504, null);
        int i19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("qrcode").getInt("color1", 0);
        int i27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("qrcode").getInt("color2", 0);
        if (i19 != 0 && i27 != 0) {
            pVar2.f242944f = kz5.c0.k(java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
            pVar2.f242943e = 2;
        }
        pVarArr[3] = pVar2;
        pVarArr[4] = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p(4, 800, 0, 0, 0, null, null, android.graphics.Color.parseColor("#FF00A361"), android.graphics.Color.parseColor("#FF00A361"), 120, null);
        pVarArr[5] = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p(5, 803, 0, 0, 0, null, null, android.graphics.Color.parseColor("#FFCE5247"), android.graphics.Color.parseColor("#FF8D5EC7"), 120, null);
        pVarArr[6] = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p(6, 802, 0, 0, 0, null, null, android.graphics.Color.parseColor("#FFDB7E00"), android.graphics.Color.parseColor("#FFCE5247"), 120, null);
        pVarArr[7] = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p(7, 804, 0, 0, 0, null, null, android.graphics.Color.parseColor("#FF8D5EC7"), android.graphics.Color.parseColor("#FF4372D4"), 120, null);
        pVarArr[8] = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p(8, 805, 0, 0, 0, null, null, android.graphics.Color.parseColor("#FF4372D4"), android.graphics.Color.parseColor("#FF2394C5"), 120, null);
        pVarArr[9] = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p(9, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.r0.f34827x366c91de, 0, 0, 0, null, null, android.graphics.Color.parseColor("#FF00A361"), android.graphics.Color.parseColor("#FF7AAE34"), 120, null);
        G = kz5.c0.i(pVarArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        v24.g gVar = v24.g.f514451a;
        jz5.g gVar2 = v24.g.f514452b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ColorfulQRConfig", "checkLocalGenFlag clientVersion last: %x, current: %x", java.lang.Integer.valueOf(((java.lang.Number) ((jz5.n) gVar2).mo141623x754a37bb()).intValue()), java.lang.Integer.valueOf(o45.wf.f424562g));
        if (((java.lang.Number) ((jz5.n) gVar2).mo141623x754a37bb()).intValue() != o45.wf.f424562g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ColorfulQRConfig", "clientVersion changed and remove MMKV_Key_LocalGenFinishSuccess");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("LocalGenFinishSuccess");
            M.remove("LocalGenFinishSuccess".concat(gVar.a()));
            M.putInt("LocalGenClientVersion", o45.wf.f424562g);
        }
        this.f242664q = "";
        this.f242666s = true;
        this.f242668u = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.c0.f242427d;
        this.f242672y = kz5.c1.k(new jz5.l(1, 0), new jz5.l(2, 1), new jz5.l(3, 1), new jz5.l(4, 10), new jz5.l(5, 11), new jz5.l(6, 12), new jz5.l(7, 13), new jz5.l(8, 14), new jz5.l(9, 15), new jz5.l(0, 9));
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0079, code lost:
    
        r10 = "s=".concat(r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String P6(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.i0 r10, java.lang.String r11, int r12) {
        /*
            r10.getClass()
            java.lang.String r10 = "s="
            java.lang.String r0 = "&s="
            jz5.g r1 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.i0.C
            jz5.n r1 = (jz5.n) r1
            java.lang.Object r1 = r1.mo141623x754a37bb()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L19
            goto Lbd
        L19:
            jz5.g r1 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.m.f242838e
            jz5.n r1 = (jz5.n) r1
            java.lang.Object r1 = r1.mo141623x754a37bb()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L2b
            goto Lbd
        L2b:
            java.lang.String r1 = ""
            switch(r12) {
                case 800: goto L38;
                case 801: goto L35;
                case 802: goto L35;
                case 803: goto L35;
                case 804: goto L35;
                case 805: goto L35;
                default: goto L30;
            }
        L30:
            switch(r12) {
                case 995: goto L41;
                case 996: goto L3e;
                case 997: goto L3b;
                default: goto L33;
            }
        L33:
            r12 = r1
            goto L43
        L35:
            java.lang.String r12 = "4"
            goto L43
        L38:
            java.lang.String r12 = "3"
            goto L43
        L3b:
            java.lang.String r12 = "2"
            goto L43
        L3e:
            java.lang.String r12 = "1"
            goto L43
        L41:
            java.lang.String r12 = "0"
        L43:
            r2 = 1
            r3 = 0
            if (r11 == 0) goto L50
            int r4 = r11.length()
            if (r4 != 0) goto L4e
            goto L50
        L4e:
            r4 = r3
            goto L51
        L50:
            r4 = r2
        L51:
            if (r4 == 0) goto L58
            if (r11 != 0) goto Lbd
            r11 = r1
            goto Lbd
        L58:
            int r1 = r12.length()
            if (r1 != 0) goto L60
            r1 = r2
            goto L61
        L60:
            r1 = r3
        L61:
            if (r1 == 0) goto L64
            goto Lbd
        L64:
            java.net.URI r1 = new java.net.URI     // Catch: java.lang.Exception -> Lb3
            r1.<init>(r11)     // Catch: java.lang.Exception -> Lb3
            java.lang.String r4 = r1.getQuery()     // Catch: java.lang.Exception -> Lb3
            if (r4 == 0) goto L77
            int r5 = r4.length()     // Catch: java.lang.Exception -> Lb3
            if (r5 != 0) goto L76
            goto L77
        L76:
            r2 = r3
        L77:
            if (r2 == 0) goto L7f
            java.lang.String r10 = r10.concat(r12)     // Catch: java.lang.Exception -> Lb3
        L7d:
            r8 = r10
            goto L92
        L7f:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lb3
            r10.<init>()     // Catch: java.lang.Exception -> Lb3
            r10.append(r4)     // Catch: java.lang.Exception -> Lb3
            r10.append(r0)     // Catch: java.lang.Exception -> Lb3
            r10.append(r12)     // Catch: java.lang.Exception -> Lb3
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Exception -> Lb3
            goto L7d
        L92:
            java.net.URI r10 = new java.net.URI     // Catch: java.lang.Exception -> Lb3
            java.lang.String r5 = r1.getScheme()     // Catch: java.lang.Exception -> Lb3
            java.lang.String r6 = r1.getAuthority()     // Catch: java.lang.Exception -> Lb3
            java.lang.String r7 = r1.getPath()     // Catch: java.lang.Exception -> Lb3
            java.lang.String r9 = r1.getFragment()     // Catch: java.lang.Exception -> Lb3
            r4 = r10
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> Lb3
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Exception -> Lb3
            java.lang.String r12 = "toString(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r10, r12)     // Catch: java.lang.Exception -> Lb3
            r11 = r10
            goto Lbd
        Lb3:
            r10 = move-exception
            java.lang.Object[] r12 = new java.lang.Object[r3]
            java.lang.String r0 = "MicroMsg.Setting.ColorSelfQRCodeGradientFgWhiteBgUIC"
            java.lang.String r1 = "addParameterToUrl exception"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r0, r10, r1, r12)
        Lbd:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.i0.P6(com.tencent.mm.plugin.setting.ui.setting.i0, java.lang.String, int):java.lang.String");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.m
    public void O6(boolean z17) {
        int U6 = U6("doChangeStyle errorExit: " + z17) + 1;
        if (U6 == 3) {
            U6++;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Setting.ColorSelfQRCodeGradientFgWhiteBgUIC", "doChangeStyle: newIdx: " + U6);
        }
        java.util.List list = G;
        boolean z18 = false;
        if (!(U6 >= 0 && U6 < list.size())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Setting.ColorSelfQRCodeGradientFgWhiteBgUIC", "doChangeStyle: newIdx: 1");
            U6 = 1;
        }
        if (U6 >= 0 && U6 < list.size()) {
            z18 = true;
        }
        int i17 = !z18 ? 1 : U6;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Setting.ColorSelfQRCodeGradientFgWhiteBgUIC", "saveLastIndex: index: " + U6 + ", willSaveIndex: " + i17);
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_QRCODE_NOW_SORT_INDEX_INT, java.lang.Integer.valueOf(i17));
        Z6(z17, 1);
    }

    public final android.graphics.Bitmap Q6() {
        yz5.a aVar = this.f242670w;
        if (aVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar);
            return (android.graphics.Bitmap) aVar.mo152xb9724478();
        }
        android.view.ViewGroup viewGroup = this.f242662o;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup);
        android.graphics.Bitmap b07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.b0(null);
        viewGroup.setBackground(new android.graphics.drawable.BitmapDrawable(m158361x893a2f6f(), b07));
        android.graphics.Bitmap b08 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.b0(viewGroup);
        viewGroup.setBackgroundColor(0);
        b07.recycle();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b08);
        return b08;
    }

    public void R6() {
        ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).Ni(m80379x76847179(), new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.x(this), new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.y(this));
    }

    public final void S6(com.p314xaae8f345.mm.p944x882e457a.m1 scene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        this.f242673z++;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Setting.ColorSelfQRCodeGradientFgWhiteBgUIC", "[" + hashCode() + "] doScene %d ", java.lang.Integer.valueOf(this.f242673z));
        gm0.j1.d().g(scene);
        this.A = scene;
    }

    public void T6(boolean z17) {
        java.util.Set e17 = kz5.p1.e(997);
        java.lang.Object l17 = gm0.j1.u().c().l(66561, null);
        java.lang.Integer num = l17 instanceof java.lang.Integer ? (java.lang.Integer) l17 : null;
        int intValue = num != null ? num.intValue() : 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fetchQRCode useLocalGenQR: ");
        jz5.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.m.f242838e;
        sb6.append(((java.lang.Boolean) ((jz5.n) gVar).mo141623x754a37bb()).booleanValue());
        sb6.append(", curStyle: ");
        sb6.append(intValue);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Setting.ColorSelfQRCodeGradientFgWhiteBgUIC", sb6.toString());
        if (((java.lang.Boolean) ((jz5.n) gVar).mo141623x754a37bb()).booleanValue()) {
            kd0.x2 x2Var = (kd0.x2) i95.n0.c(kd0.x2.class);
            java.lang.String str = this.f242664q;
            ((jd0.q2) x2Var).getClass();
            S6(new g21.a(str, md1.f1.f72850x366c91de, 1));
        } else {
            java.util.Iterator it = e17.iterator();
            while (it.hasNext()) {
                int intValue2 = ((java.lang.Number) it.next()).intValue();
                kd0.x2 x2Var2 = (kd0.x2) i95.n0.c(kd0.x2.class);
                java.lang.String str2 = this.f242664q;
                java.lang.String f17 = v24.v.f514490a.f(intValue2);
                ((jd0.q2) x2Var2).getClass();
                S6(new g21.a(str2, intValue2, 1, f17));
            }
        }
        if (z17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f242665r;
            if ((u3Var != null && u3Var.isShowing()) || !this.f242666s) {
                return;
            }
            this.f242665r = db5.e1.Q(m80379x76847179(), m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f574282hq2), true, true, null);
        }
    }

    public final int U6(java.lang.String str) {
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_QRCODE_NOW_SORT_INDEX_INT, null);
        java.lang.Integer num = m17 instanceof java.lang.Integer ? (java.lang.Integer) m17 : null;
        int intValue = num != null ? num.intValue() : 1;
        if (intValue == 0) {
            intValue = 1;
        }
        if (intValue == 3) {
            intValue = 2;
        }
        int i17 = intValue >= 0 && intValue < G.size() ? intValue : 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Setting.ColorSelfQRCodeGradientFgWhiteBgUIC", "[" + hashCode() + "] getLastIndex:" + i17 + " for " + str);
        return i17;
    }

    public int V6() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getLastStyle(): ");
        int U6 = U6("getLastStyle");
        java.util.List list = G;
        sb6.append(((com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p) list.get(U6)).f242940b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Setting.ColorSelfQRCodeGradientFgWhiteBgUIC", sb6.toString());
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p) list.get(U6("getLastStyle"))).f242940b;
    }

    public int W6() {
        java.lang.Integer num = (java.lang.Integer) this.f242672y.get(java.lang.Integer.valueOf(U6("index2pattern")));
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }

    public final void X6(boolean z17, boolean z18) {
        java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        this.f242673z--;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Setting.ColorSelfQRCodeGradientFgWhiteBgUIC", "[" + hashCode() + "] onSceneEnd %d, needUpdate: " + z17, java.lang.Integer.valueOf(this.f242673z));
        if (this.f242673z <= 0) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f242665r;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            this.f242665r = null;
            Y6(false);
            if (z17) {
                Z6(true, z18 ? 3 : 2);
            }
        }
    }

    public final void Y6(boolean z17) {
        android.view.View m68938xcc04d8cb;
        android.view.View view = this.f242661n;
        if (view != null) {
            int i17 = z17 ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/ColorSelfQRCodeGradientFgWhiteBgUIC", "showLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/setting/ui/setting/ColorSelfQRCodeGradientFgWhiteBgUIC", "showLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.k kVar = this.f242671x;
            if (kVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2054xc748c38e.C17366x88027ff c17366x88027ff = ((p14.r) kVar).f432778a;
                wd0.u1 u1Var = c17366x88027ff.D;
                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2054xc748c38e.C17366x88027ff.k(c17366x88027ff);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.k kVar2 = this.f242671x;
        if (kVar2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2054xc748c38e.C17366x88027ff c17366x88027ff2 = ((p14.r) kVar2).f432778a;
            wd0.u1 u1Var2 = c17366x88027ff2.D;
            m68938xcc04d8cb = c17366x88027ff2.m68938xcc04d8cb();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(m68938xcc04d8cb, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/qrcode/SelfQrCodeView$onQRCodeEventListener$2$1", "onDismissLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m68938xcc04d8cb.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(m68938xcc04d8cb, "com/tencent/mm/plugin/setting/ui/qrcode/SelfQrCodeView$onQRCodeEventListener$2$1", "onDismissLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z6(boolean r27, int r28) {
        /*
            Method dump skipped, instructions count: 1032
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.i0.Z6(boolean, int):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        gm0.j1.d().a(be1.r0.f4232x366c91de, this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        java.lang.String r17 = c01.z1.r();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getUsernameFromUserInfo(...)");
        this.f242664q = r17;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(this.f242656f, c01.z1.r(), null);
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.Object l17 = gm0.j1.u().c().l(2, null);
        java.lang.String str = l17 instanceof java.lang.String ? (java.lang.String) l17 : null;
        if (str == null) {
            str = "";
        }
        ((sg3.a) v0Var).getClass();
        java.lang.String b17 = c01.a2.b(str);
        android.widget.TextView textView = this.f242659i;
        if (textView != null) {
            textView.setText(((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(m158354x19263085(), b17, i65.a.h(m80379x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561386h2)));
        }
        android.widget.TextView textView2 = this.f242659i;
        com.p314xaae8f345.mm.ui.bk.s0(textView2 != null ? textView2.getPaint() : null);
        c01.fb a17 = c01.fb.a();
        java.lang.String d17 = a17.d();
        if (d17 == null) {
            d17 = "";
        }
        java.lang.String c17 = a17.c();
        java.lang.String str2 = ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).Di(d17) + ' ' + (c17 != null ? c17 : "");
        android.widget.TextView textView3 = this.f242660m;
        if (textView3 != null) {
            textView3.setText(str2);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Setting.ColorSelfQRCodeGradientFgWhiteBgUIC", "onCreateAfter bitmap == null, try fetchQRCode");
        T6(false);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        this.f242656f = null;
        this.f242657g = null;
        this.f242658h = null;
        this.f242659i = null;
        this.f242660m = null;
        this.f242661n = null;
        this.f242663p = null;
        gm0.j1.d().q(be1.r0.f4232x366c91de, this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Setting.ColorSelfQRCodeGradientFgWhiteBgUIC", "onResume");
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        android.widget.TextView textView;
        if ((m1Var instanceof kd0.j2) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m1Var, this.A)) {
            kd0.j2 j2Var = (kd0.j2) m1Var;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
            sb6.append(hashCode());
            sb6.append("] onGetQRSceneEnd() called with: errType = ");
            sb6.append(i17);
            sb6.append(", errCode = ");
            sb6.append(i18);
            sb6.append(", errMsg = ");
            sb6.append(str);
            sb6.append(", respStyle = ");
            g21.a aVar = (g21.a) j2Var;
            sb6.append(aVar.f349322i);
            sb6.append('.');
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Setting.ColorSelfQRCodeGradientFgWhiteBgUIC", sb6.toString());
            o25.s1 a17 = f14.g.a();
            android.app.Activity m80379x76847179 = m80379x76847179();
            ((com.p314xaae8f345.mm.app.o7) a17).getClass();
            if (com.p314xaae8f345.mm.ui.pc.a(m80379x76847179, i17, i18, str, 7)) {
                X6(true, true);
                return;
            }
            if (i17 != 0 || i18 != 0) {
                X6(true, true);
                return;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f349319f) && (textView = this.f242658h) != null) {
                textView.setText(aVar.f349319f);
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(aVar.f349325o, "getQRUrl(...)");
            p3325xe03a0797.p3326xc267989b.l.d(mo144225x95f74600(), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.b0(j2Var, this, null), 3, null);
        }
    }
}
