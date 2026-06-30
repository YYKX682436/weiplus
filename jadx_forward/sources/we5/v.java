package we5;

/* loaded from: classes9.dex */
public class v extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.gn implements we5.b {

    /* renamed from: x, reason: collision with root package name */
    public static final we5.e f526926x = new we5.e(null);

    @Override // we5.b
    public rd5.d b(we5.a params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        return new we5.p0(params);
    }

    @Override // we5.b
    public boolean c() {
        return true;
    }

    @Override // we5.b
    public void e(yb5.d ui6, rd5.d msgData, java.lang.String str, we5.y0 uiBlocks) {
        int i17;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.c cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var;
        boolean z17;
        android.text.SpannableString t17;
        android.text.SpannableString t18;
        int t19;
        java.lang.Object m143895xf1229813;
        java.lang.String str2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiBlocks, "uiBlocks");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = msgData.f475787d.f526833b;
        this.f285588s = ui6;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var2.f391656d = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.bo.b(f9Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var3 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var3.f391656d = ui6.x();
        int h17 = i65.a.h(ui6.g(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia);
        uiBlocks.d(new we5.p(this, ui6, f9Var, msgData));
        if (j65.e.b() && j65.e.f()) {
            uiBlocks.d(new we5.q(f9Var, ui6));
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var4 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var5 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var5.f391656d = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io.NoTransform;
        boolean a17 = com.p314xaae8f345.mm.app.p622xc5476f33.k.a();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.c cVar2 = ui6.f542241c;
        if (a17) {
            if (f9Var.i2() && f9Var.b2()) {
                h0Var4.f391656d = f9Var.W0();
            }
            h0Var5.f391656d = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ym) ((sb5.l2) cVar2.a(sb5.l2.class))).v0(f9Var);
        }
        if (!ui6.D() || ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) cVar2.a(sb5.f.class))).f280286r || (t19 = c01.w9.t((java.lang.String) h0Var2.f391656d)) == -1) {
            i17 = h17;
            cVar = cVar2;
            h0Var = h0Var5;
        } else {
            java.lang.Object element = h0Var2.f391656d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(element, "element");
            java.lang.String substring = ((java.lang.String) element).substring(0, t19);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
            cVar = cVar2;
            h0Var = h0Var5;
            int length = substring.length() - 1;
            int i18 = 0;
            boolean z18 = false;
            while (true) {
                i17 = h17;
                if (i18 > length) {
                    break;
                }
                boolean z19 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(substring.charAt(!z18 ? i18 : length), 32) <= 0;
                if (z18) {
                    if (!z19) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z19) {
                    i18++;
                } else {
                    h17 = i17;
                    z18 = true;
                }
                h17 = i17;
            }
            java.lang.String obj = substring.subSequence(i18, length + 1).toString();
            if (obj != null && obj.length() > 0) {
                h0Var3.f391656d = obj;
            }
            java.lang.Object element2 = h0Var2.f391656d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(element2, "element");
            int i19 = t19 + 1;
            java.lang.String substring2 = ((java.lang.String) element2).substring(i19);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
            int length2 = substring2.length() - 1;
            boolean z27 = false;
            int i27 = 0;
            while (i27 <= length2) {
                boolean z28 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(substring2.charAt(!z27 ? i27 : length2), 32) <= 0;
                if (z27) {
                    if (!z28) {
                        break;
                    } else {
                        length2--;
                    }
                } else if (z28) {
                    i27++;
                } else {
                    z27 = true;
                }
            }
            h0Var2.f391656d = substring2.subSequence(i27, length2 + 1).toString();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) h0Var4.f391656d)) {
                try {
                    p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    java.lang.String str3 = (java.lang.String) h0Var4.f391656d;
                    if (str3 != null) {
                        java.lang.String substring3 = str3.substring(i19);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring3, "substring(...)");
                        int length3 = substring3.length() - 1;
                        boolean z29 = false;
                        int i28 = 0;
                        while (i28 <= length3) {
                            boolean z37 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(substring3.charAt(!z29 ? i28 : length3), 32) <= 0;
                            if (z29) {
                                if (!z37) {
                                    break;
                                } else {
                                    length3--;
                                }
                            } else if (z37) {
                                i28++;
                            } else {
                                z29 = true;
                            }
                        }
                        str2 = substring3.subSequence(i28, length3 + 1).toString();
                    } else {
                        str2 = null;
                    }
                    h0Var4.f391656d = str2;
                    m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
                } catch (java.lang.Throwable th6) {
                    p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
                }
                java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
                if (m143898xd4a2fc34 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemTextFrom", "substring error!");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChattingItemTextFrom", m143898xd4a2fc34, "substring error", new java.lang.Object[0]);
                }
            }
        }
        uiBlocks.d(new we5.r(this, ui6, f9Var, h0Var3));
        uiBlocks.d(new we5.s(this, ui6, h0Var3, f9Var));
        boolean z38 = f9Var.G != null && (f9Var.r2() || f9Var.y2());
        uiBlocks.d(new we5.t(f9Var, ui6, h0Var3));
        boolean D = ui6.D();
        int a18 = k01.d.a(f9Var.Q0());
        android.os.Bundle a19 = (D ? com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.l1.f272786g : com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.l1.f272785f).a(a18);
        a19.putInt("key_wxa_short_link_launch_chat_type", a18);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.t.f262519a.a(a19, f9Var);
        android.os.Bundle c17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.bo.c(f9Var, ui6, (java.lang.String) h0Var3.f391656d);
        c17.putAll(a19);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var6 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        boolean z39 = !c01.ia.D(f9Var);
        boolean z47 = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.h2) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6.class))).Ai() && c01.ia.d(f9Var);
        if (z38) {
            int i29 = i17;
            if (z38) {
                c17.putInt("geta8key_scene", 31);
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4((java.lang.String) h0Var3.f391656d)) {
                    android.app.Activity g17 = ui6.g();
                    java.lang.String i37 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.bo.i(ui6.g(), (java.lang.String) h0Var2.f391656d, f9Var);
                    java.lang.String d07 = d0(f9Var);
                    le0.r rVar = le0.x.P0;
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.j1 w17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.w(g17, z39, 1, c17, d07);
                    w17.f272759e = false;
                    ((le0.v) rVar).a(g17, w17);
                    t17 = w17.e(i37, i29, true);
                } else {
                    le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                    android.app.Activity g18 = ui6.g();
                    java.lang.String i38 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.bo.i(ui6.g(), (java.lang.String) h0Var2.f391656d, f9Var);
                    java.lang.String d08 = d0(f9Var);
                    le0.r rVar2 = le0.x.P0;
                    ((ke0.e) xVar).getClass();
                    t17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.t(g18, i38, i29, 1, c17, d08, 0, rVar2, z39, z47);
                }
                h0Var6.f391656d = t17;
            }
            z17 = true;
        } else {
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4((java.lang.String) h0Var3.f391656d)) {
                android.app.Activity g19 = ui6.g();
                java.lang.CharSequence charSequence = (java.lang.CharSequence) h0Var2.f391656d;
                java.lang.String d09 = d0(f9Var);
                le0.r rVar3 = le0.x.P0;
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.j1 w18 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.w(g19, z39, 1, c17, d09);
                w18.f272759e = false;
                ((le0.v) rVar3).a(g19, w18);
                t18 = w18.e(charSequence, i17, true);
            } else {
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                android.app.Activity g27 = ui6.g();
                java.lang.CharSequence charSequence2 = (java.lang.CharSequence) h0Var2.f391656d;
                java.lang.String d010 = d0(f9Var);
                le0.r rVar4 = le0.x.P0;
                ((ke0.e) xVar2).getClass();
                t18 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.t(g27, charSequence2, i17, 1, c17, d010, 0, rVar4, z39, z47);
            }
            h0Var6.f391656d = t18;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jk jkVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jk) ((sb5.u1) cVar.a(sb5.u1.class));
            if (jkVar.m0(f9Var.m124847x74d37ac6())) {
                java.util.ArrayList arrayList = jkVar.f280833n;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrayList, "getHighlightKeywordList(...)");
                java.lang.CharSequence charSequence3 = (java.lang.CharSequence) h0Var6.f391656d;
                p13.g gVar = p13.g.Background;
                int i39 = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.c.f219557b;
                p13.i a27 = p13.i.a(charSequence3, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList, " "), false, false);
                a27.f432630e = gVar;
                a27.f432631f = i39;
                uiBlocks.d(new we5.u(o13.q.e(a27)));
                z17 = false;
            } else {
                z17 = true;
            }
            android.text.SpannableString spannableString = (android.text.SpannableString) h0Var6.f391656d;
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0[] z0VarArr = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0[]) spannableString.getSpans(0, spannableString.length(), com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(z0VarArr);
            int length4 = z0VarArr.length;
            int i47 = 0;
            while (true) {
                if (i47 >= length4) {
                    break;
                }
                if (z0VarArr[i47].m75731xfb85f7b0() == 44) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12809, 7, "");
                    break;
                }
                i47++;
            }
        }
        java.lang.Object obj2 = h0Var6.f391656d;
        if (obj2 != null) {
            android.text.SpannableString spannableString2 = (android.text.SpannableString) obj2;
            uiBlocks.d(new we5.f((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0[]) spannableString2.getSpans(0, spannableString2.length(), com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0.class), h0Var6, h0Var2));
        }
        if (z17) {
            uiBlocks.d(new we5.g(ui6, f9Var, h0Var6));
        }
        if (x63.g.G(f9Var)) {
            uiBlocks.d(new we5.i(ui6));
        } else {
            uiBlocks.d(we5.j.f526877d);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var7 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        if (f9Var.r2() || f9Var.y2()) {
            h0Var7.f391656d = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(f9Var.Q0(), true);
        }
        uiBlocks.d(new we5.k(f9Var, h0Var7, ui6));
        uiBlocks.d(we5.l.f526885d);
        uiBlocks.d(new we5.m(this, f9Var));
        uiBlocks.d(new we5.n(ui6, c01.ia.j(f9Var), h0Var6, z39));
        uiBlocks.d(new we5.o(ui6, f9Var, this, c01.ia.A(f9Var), c01.ia.y(f9Var), c01.ia.x(f9Var), msgData, c17, h0Var4, h0Var));
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public void l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 tag, yb5.d ui6, rd5.d msgData, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        e(ui6, msgData, str, new we5.y0(new we5.u0((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ao) tag)));
    }
}
