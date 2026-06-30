package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public final class n3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n3 f226993a = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n3();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f226994b = com.p314xaae8f345.mm.vfs.q7.c("luckymoney_resource") + "/dynamicPagResource/";

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f226995c = "bubble/";

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f226996d = "crop/";

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f226997e = "cover/";

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f226998f = "detail/";

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f226999g = "bubble_atmosphere/";

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String f227000h = "cover_atmosphere/";

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String f227001i = "detail_atmosphere/";

    /* renamed from: j, reason: collision with root package name */
    public static final java.lang.String f227002j = "full_atmosphere/";

    /* renamed from: k, reason: collision with root package name */
    public static final java.lang.String f227003k = ".pag";

    public final void a(java.lang.String str, java.lang.String str2, p3325xe03a0797.p3326xc267989b.y0 y0Var, com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y1 y1Var) {
        if (!(str == null || str.length() == 0)) {
            if (!(str2 == null || str2.length() == 0)) {
                if (com.p314xaae8f345.mm.vfs.w6.j(str2)) {
                    if (y1Var != null) {
                        y1Var.a(new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.r1(str2));
                        return;
                    }
                    return;
                } else {
                    if (y0Var != null) {
                        p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.d3(str, str2, y1Var, null), 3, null);
                        return;
                    }
                    return;
                }
            }
        }
        if (y1Var != null) {
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z1 z1Var = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z1.f295574a;
            y1Var.a(new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.q1(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54056xf1449bd6));
        }
    }

    public final void b(r45.wv3 wv3Var, int i17, p3325xe03a0797.p3326xc267989b.y0 y0Var, com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y1 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (wv3Var == null) {
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z1 z1Var = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z1.f295574a;
            callback.a(new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.q1(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54056xf1449bd6));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopePagLogic", "[get luckymoney pag resource] type : %s, subtype：%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(wv3Var.f471032e));
        int i18 = wv3Var.f471032e;
        if (i18 <= 0) {
            e(wv3Var, i17, y0Var, callback);
            return;
        }
        java.lang.String d17 = d(i18, i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopePagLogic", "[luckymoney pag resource] get local result-path is：%s", d17);
        if (!(d17.length() == 0)) {
            callback.a(new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.r1(d17));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopePagLogic", "[luckymoney pag resource] use local failed，try use net");
        java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.d4.f226760d;
        ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).wi(58);
        e(wv3Var, i17, y0Var, callback);
    }

    public final java.lang.String c(java.lang.String str, java.lang.String str2) {
        if (str == null || str.length() == 0) {
            return "";
        }
        if (str2 == null || str2.length() == 0) {
            return "";
        }
        java.lang.String str3 = f226994b;
        if (!com.p314xaae8f345.mm.vfs.w6.j(str3)) {
            com.p314xaae8f345.mm.vfs.w6.u(str3);
        }
        if (!com.p314xaae8f345.mm.vfs.w6.j(str3 + str2)) {
            com.p314xaae8f345.mm.vfs.w6.u(str3 + str2);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str3);
        sb6.append(str2);
        sb6.append("MMPag_LuckyMoney_");
        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str.getBytes()));
        sb6.append(f227003k);
        return sb6.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String d(int r7, int r8) {
        /*
            r6 = this;
            java.lang.String r0 = "MicroMsg.LuckyMoneyEnvelopePagLogic"
            java.lang.String r1 = ""
            if (r7 != 0) goto Lc
            java.lang.String r7 = "[getPagBySubType] subtype == 0, return"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r7)
            return r1
        Lc:
            java.lang.String r2 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.d4.b(r7)
            com.tencent.mm.plugin.luckymoney.model.f4 r3 = new com.tencent.mm.plugin.luckymoney.model.f4
            r3.<init>()
            r3.f68763x541db35 = r7
            hb3.o r7 = hb3.o.Ni()
            pq5.i r7 = r7.f361670m
            java.lang.Object r7 = r7.a()
            com.tencent.mm.plugin.luckymoney.model.g4 r7 = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.g4) r7
            r4 = 0
            java.lang.String[] r5 = new java.lang.String[r4]
            boolean r7 = r7.get(r3, r5)
            r3 = 1
            if (r7 == 0) goto Ld1
            if (r8 == 0) goto Lbf
            if (r8 == r3) goto Lad
            r7 = 2
            if (r8 == r7) goto L9b
            r7 = 3
            if (r8 == r7) goto L89
            r7 = 13
            if (r8 == r7) goto L77
            switch(r8) {
                case 9: goto L65;
                case 10: goto L53;
                case 11: goto L40;
                default: goto L3e;
            }
        L3e:
            goto Ld1
        L40:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r2)
            java.lang.String r8 = "detail_atmosphere.pag"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            goto Ld2
        L53:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r2)
            java.lang.String r8 = "cover_atmosphere.pag"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            goto Ld2
        L65:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r2)
            java.lang.String r8 = "bubble_atmosphere.pag"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            goto Ld2
        L77:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r2)
            java.lang.String r8 = "full_atmosphere.pag"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            goto Ld2
        L89:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r2)
            java.lang.String r8 = "minilogo.pag"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            goto Ld2
        L9b:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r2)
            java.lang.String r8 = "detail.pag"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            goto Ld2
        Lad:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r2)
            java.lang.String r8 = "cover.pag"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            goto Ld2
        Lbf:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r2)
            java.lang.String r8 = "bubble.pag"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            goto Ld2
        Ld1:
            r7 = r1
        Ld2:
            int r8 = r7.length()
            if (r8 != 0) goto Ld9
            r4 = r3
        Ld9:
            if (r4 != 0) goto Leb
            boolean r8 = com.p314xaae8f345.mm.vfs.w6.j(r7)
            if (r8 == 0) goto Leb
            java.lang.String r8 = "[getPagBySubType] get local res success, path ："
            java.lang.String r8 = r8.concat(r7)
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r8)
            return r7
        Leb:
            java.lang.String r7 = "[getPagBySubType] get res failed"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n3.d(int, int):java.lang.String");
    }

    public final void e(r45.wv3 hbEnvelopSource, int i17, p3325xe03a0797.p3326xc267989b.y0 y0Var, com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y1 y1Var) {
        java.lang.String str;
        java.lang.String c17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hbEnvelopSource, "hbEnvelopSource");
        r45.xv3 xv3Var = hbEnvelopSource.f471034g;
        if (xv3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyEnvelopePagLogic", "hbEnvelopSource.sourceObject == null");
            if (y1Var != null) {
                com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z1 z1Var = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z1.f295574a;
                y1Var.a(new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.q1(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54056xf1449bd6));
                return;
            }
            return;
        }
        if (i17 == 0) {
            str = xv3Var.f472026w;
            c17 = c(str, f226995c);
        } else if (i17 == 1) {
            str = xv3Var.f472027x;
            c17 = c(str, f226997e);
        } else if (i17 == 2) {
            str = xv3Var.f472028y;
            c17 = c(str, f226998f);
        } else if (i17 == 3) {
            str = xv3Var.f472025v;
            c17 = c(str, f226996d);
        } else if (i17 != 13) {
            switch (i17) {
                case 9:
                    str = xv3Var.E;
                    c17 = c(str, f226999g);
                    break;
                case 10:
                    str = xv3Var.F;
                    c17 = c(str, f227000h);
                    break;
                case 11:
                    str = xv3Var.G;
                    c17 = c(str, f227001i);
                    break;
                default:
                    str = null;
                    c17 = null;
                    break;
            }
        } else {
            str = xv3Var.M;
            c17 = c(str, f227002j);
        }
        a(str, c17, y0Var, y1Var);
    }

    public final void f(int i17, java.lang.String str, com.p314xaae8f345.mm.p653x55bb7a46.p655xac8f1cfd.C10389xffc30b0 pagView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pagView, "pagView");
        g(i17, str, pagView, true);
    }

    public final void g(int i17, java.lang.String str, com.p314xaae8f345.mm.p653x55bb7a46.p655xac8f1cfd.C10389xffc30b0 pagView, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pagView, "pagView");
        if (str == null || str.length() == 0) {
            return;
        }
        pagView.n();
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.l3(i17, pagView, str, z17));
    }

    public final void h(int i17, java.lang.String str, com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        if (c22789xd23e9a9b != null) {
            if (str == null || str.length() == 0) {
                return;
            }
            c22789xd23e9a9b.n();
            ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.i3(i17, c22789xd23e9a9b, str, true));
        }
    }

    public final void i(com.p314xaae8f345.mm.p653x55bb7a46.p655xac8f1cfd.C10389xffc30b0 pagView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pagView, "pagView");
        pagView.n();
        pagView.m82582x3ae760af(0.0d);
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.f3(pagView));
    }

    public final void j(com.p314xaae8f345.mm.p653x55bb7a46.p655xac8f1cfd.C10389xffc30b0 pagView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pagView, "pagView");
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m3(pagView));
    }
}
