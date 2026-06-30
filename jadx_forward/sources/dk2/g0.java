package dk2;

/* loaded from: classes3.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final gk2.e f315001a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 f315002b;

    /* renamed from: c, reason: collision with root package name */
    public int f315003c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f315004d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f315005e;

    /* renamed from: f, reason: collision with root package name */
    public int f315006f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f315007g;

    /* renamed from: h, reason: collision with root package name */
    public int f315008h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f315009i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f315010j;

    /* renamed from: k, reason: collision with root package name */
    public int f315011k;

    /* renamed from: l, reason: collision with root package name */
    public int f315012l;

    /* renamed from: m, reason: collision with root package name */
    public final yz5.l f315013m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f315014n;

    /* renamed from: o, reason: collision with root package name */
    public final gm2.k f315015o;

    public g0(gk2.e curLiveContext, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(curLiveContext, "curLiveContext");
        this.f315001a = curLiveContext;
        this.f315002b = k0Var;
        this.f315013m = new dk2.w(this);
        this.f315014n = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4("FinderLiveAnchorVerifyManager::Timer", (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new dk2.v(this), true);
        this.f315015o = new gm2.k(ym5.x.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 22.0f));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (r0.e() == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(dk2.g0 r2, int r3) {
        /*
            com.tencent.mm.sdk.platformtools.b4 r0 = r2.f315014n
            if (r0 == 0) goto Lc
            boolean r0 = r0.e()
            r1 = 1
            if (r0 != r1) goto Lc
            goto Ld
        Lc:
            r1 = 0
        Ld:
            if (r1 == 0) goto L1b
            r2.f315006f = r3
            com.tencent.mm.sdk.platformtools.b4 r2 = r2.f315014n
            if (r2 == 0) goto L21
            r0 = 1000(0x3e8, double:4.94E-321)
            r2.c(r0, r0)
            goto L21
        L1b:
            int r0 = r2.f315006f
            if (r3 >= r0) goto L21
            r2.f315006f = r3
        L21:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.g0.a(dk2.g0, int):void");
    }

    public static final java.lang.CharSequence b(dk2.g0 g0Var, java.lang.String str, int i17) {
        g0Var.getClass();
        if (str == null || i17 < 0) {
            return null;
        }
        int L = r26.n0.L(str, "@", 0, false, 6, null);
        if (L < 0) {
            return str;
        }
        java.lang.String valueOf = java.lang.String.valueOf(i17);
        int length = valueOf.length() + L;
        android.text.SpannableString spannableString = new android.text.SpannableString(r26.i0.t(str, "@", valueOf, false));
        spannableString.setSpan(g0Var.f315015o, L, length, 17);
        return spannableString;
    }

    public static final void c(dk2.g0 g0Var, boolean z17) {
        int i17;
        int i18;
        g0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveAnchorVerifyManager", "postVerifyRequest: success:" + z17 + ", currentVerifyMode:" + g0Var.f315003c + ", verification_id:" + g0Var.f315004d);
        int i19 = g0Var.f315003c;
        if (i19 != 1) {
            if (i19 == 2) {
                i18 = z17 ? 11 : 12;
            } else if (i19 == 3) {
                i18 = z17 ? 21 : 22;
            } else if (i19 == 4) {
                i18 = 23;
            } else if (i19 != 5) {
                i17 = 0;
            } else {
                i18 = z17 ? 32 : 33;
            }
            i17 = i18;
        } else {
            i17 = z17 ? 1 : 2;
        }
        dk2.a0 a0Var = (i19 == 3 || i19 == 4) ? new dk2.a0(z17, g0Var) : null;
        gk2.e eVar = g0Var.f315001a;
        long m75942xfb822ef2 = ((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
        long j17 = ((mm2.e1) eVar.a(mm2.e1.class)).f410516m;
        java.lang.String str = g0Var.f315004d;
        if (str == null) {
            str = "";
        }
        new ek2.m2(m75942xfb822ef2, j17, i17, str, a0Var).l();
        int i27 = g0Var.f315003c;
        if (i27 == 1) {
            if (z17) {
                pm0.v.X(new dk2.b0(g0Var));
                return;
            }
            return;
        }
        if (i27 != 2) {
            if (i27 == 3) {
                pm0.v.X(new dk2.y(g0Var));
                return;
            }
            if (i27 == 4) {
                pm0.v.X(new dk2.z(g0Var));
                return;
            }
            if (i27 == 5 && z17) {
                pm0.v.X(new dk2.b0(g0Var));
                if (((mm2.t2) eVar.a(mm2.t2.class)).f410963i) {
                    ((mm2.t2) eVar.a(mm2.t2.class)).f410963i = false;
                    ((mm2.t2) eVar.a(mm2.t2.class)).f410961g = false;
                    return;
                }
                return;
            }
            return;
        }
        if (!z17) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            jz2.x0 x0Var = jz2.x0.f384287a;
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ((jz5.n) jz2.x0.f384291e).mo141623x754a37bb());
            intent.addFlags(872415232);
            android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/model/FinderLiveAnchorVerifyManager", "postVerifyRequest", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context2, "com/tencent/mm/plugin/finder/live/model/FinderLiveAnchorVerifyManager", "postVerifyRequest", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveAnchorVerifyManager", "gotoVerificationH5: verificationUrl:" + g0Var.f315005e);
        if (g0Var.f315005e == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = g0Var.f315002b;
        android.content.Context context3 = k0Var != null ? k0Var.getContext() : null;
        android.app.Activity activity = context3 instanceof android.app.Activity ? (android.app.Activity) context3 : null;
        if (activity == null) {
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("KEY_URL", g0Var.f315005e);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ((c61.ub) i95.n0.c(c61.ub.class))).getClass();
        intent2.setClass(activity, (java.lang.Class) ((jz5.n) jz2.x0.H).mo141623x754a37bb());
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent2);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activity, arrayList2.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderAnchorVerifyWebviewUI", "(Landroid/app/Activity;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activity, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderAnchorVerifyWebviewUI", "(Landroid/app/Activity;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void d(boolean z17) {
        gk2.e liveData = this.f315001a;
        if (z17 && ((mm2.t2) liveData.a(mm2.t2.class)).f410961g) {
            return;
        }
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e3j);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e3n);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        java.lang.String str = z17 ? string : string2;
        int i17 = this.f315003c;
        if (i17 == 1 || i17 == 2 || i17 == 3 || i17 == 5) {
            if (!((mm2.x4) ((mm2.c1) liveData.a(mm2.c1.class)).m147920xbba4bfc0(mm2.x4.class)).N6(str, kz5.c0.i(string, string2), "addSystemMsg")) {
                zl2.r4 r4Var = zl2.r4.f555483a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
                r45.t12 t12Var = new r45.t12();
                t12Var.set(3, 10001);
                t12Var.set(2, str);
                ((mm2.x4) ((mm2.c1) liveData.a(mm2.c1.class)).m147920xbba4bfc0(mm2.x4.class)).f411061f.add(new dk2.mf(t12Var));
                no0.h.f420253a.a();
            }
            if (z17) {
                dk2.ef efVar = dk2.ef.f314905a;
                tn0.w0 w0Var = dk2.ef.f314911d;
                if (w0Var != null) {
                    w0Var.y(2);
                    return;
                }
                return;
            }
            dk2.ef efVar2 = dk2.ef.f314905a;
            tn0.w0 w0Var2 = dk2.ef.f314911d;
            if (w0Var2 != null) {
                w0Var2.n0(2);
            }
        }
    }

    public final void e(boolean z17) {
        r45.iy1 iy1Var;
        tn0.w0 f17;
        kn0.p pVar;
        kn0.p pVar2;
        in0.q e17;
        kn0.p pVar3;
        gk2.e eVar = this.f315001a;
        if (!((mm2.c1) eVar.a(mm2.c1.class)).a8() || (iy1Var = ((mm2.t2) eVar.a(mm2.t2.class)).f410960f) == null) {
            return;
        }
        boolean z18 = false;
        if (android.text.TextUtils.equals(this.f315004d, iy1Var.m75945x2fec8307(2)) && this.f315003c == iy1Var.m75939xb282bd08(0) && !z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveAnchorVerifyManager", "checkAnchorVerify: same id and mode, ignore. currentVerifyMode:" + this.f315003c + ", currentVerifyId:" + this.f315004d);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveAnchorVerifyManager", "updateVerifyInfo: verify_mode:" + iy1Var.m75939xb282bd08(0) + ", verification_id:" + iy1Var.m75945x2fec8307(2) + ", remaining_seconds:" + iy1Var.m75939xb282bd08(3));
        this.f315003c = iy1Var.m75939xb282bd08(0);
        this.f315004d = iy1Var.m75945x2fec8307(2);
        this.f315005e = iy1Var.m75945x2fec8307(4);
        pm0.v.X(new dk2.f0(iy1Var, this));
        d(true);
        ((mm2.t2) eVar.a(mm2.t2.class)).f410961g = true;
        dk2.ef efVar = dk2.ef.f314905a;
        in0.q e18 = efVar.e();
        if (((e18 == null || (pVar3 = e18.D) == null || pVar3.f391121h) ? false : true) && (e17 = efVar.e()) != null) {
            e17.k0();
        }
        if (((mm2.c1) eVar.a(mm2.c1.class)).Y4) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("miniGame start anchor verify live status is pausing:");
            in0.q e19 = efVar.e();
            sb6.append((e19 == null || (pVar2 = e19.D) == null) ? null : java.lang.Boolean.valueOf(pVar2.f391121h));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveAnchorVerifyManager", sb6.toString());
            tn0.w0 f18 = efVar.f();
            if (f18 != null && (pVar = f18.D) != null && !pVar.f391121h) {
                z18 = true;
            }
            if (!z18 || (f17 = efVar.f()) == null) {
                return;
            }
            f17.k0();
        }
    }

    public final void f() {
        tn0.w0 f17;
        kn0.p pVar;
        int i17 = ((mm2.c1) this.f315001a.a(mm2.c1.class)).Z4;
        dk2.ef efVar = dk2.ef.f314905a;
        tn0.w0 f18 = efVar.f();
        java.lang.Boolean valueOf = (f18 == null || (pVar = f18.D) == null) ? null : java.lang.Boolean.valueOf(pVar.f391121h);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveAnchorVerifyManager", "miniGame finish anchor verify live status is pausing:" + valueOf + " captureVolume:" + i17);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, java.lang.Boolean.TRUE) && (f17 = efVar.f()) != null) {
            f17.r0();
        }
        tn0.w0 f19 = efVar.f();
        if (f19 != null) {
            f19.B0(i17);
        }
    }

    public final void g() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveAnchorVerifyManager", "mockForceRectify");
        gk2.e eVar = this.f315001a;
        ((mm2.t2) eVar.a(mm2.t2.class)).f410963i = true;
        r45.iy1 iy1Var = new r45.iy1();
        iy1Var.set(0, 5);
        iy1Var.set(6, "直播安全警告");
        iy1Var.set(1, "直播存在违规行为，请及时调整并在15分钟内完成整改，否则将被平台中断直播");
        iy1Var.set(5, "整改完成");
        iy1Var.set(8, "@秒后可操作");
        iy1Var.set(12, 30);
        iy1Var.set(11, 900);
        iy1Var.set(10, "直播将在@秒后中断");
        iy1Var.set(9, 60);
        iy1Var.set(2, "mock_verify_" + java.lang.System.currentTimeMillis());
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add("长文本长文本长文本长文本长文本长文本长文本长文本长文本长文本长文本长文本长文本长文本长文本长文本长文本长文本长文本长文本长文本长文本长文本");
        linkedList.add("昵称涉及低俗色情");
        linkedList.add("直播主题涉及利用学生名义博眼球");
        linkedList.add("直播可能存在剧情演绎，请注意甄别后下单");
        linkedList.add("直播间售卖商品价值较高，请注意甄别后下单");
        linkedList.add("当前直播间的店铺体验分低，请注意甄别");
        linkedList.add("请勿轻信升值赚钱、高价回收等虚假宣传，谨慎辨别，理性消费");
        iy1Var.set(15, linkedList);
        iy1Var.set(17, "http://dldir1v6.qq.com/weixin/checkresupdate/ExclamationMarkCircle_dbb5b04f1ec04a4993d3c8ebf6912f07.png");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862();
        c19786x6a1e2862.m76570xc2385d6("去申诉");
        iy1Var.set(16, c19786x6a1e2862);
        ((mm2.t2) eVar.a(mm2.t2.class)).f410960f = iy1Var;
        e(true);
    }

    public final void h() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveAnchorVerifyManager", "reset");
        this.f315003c = 0;
        this.f315004d = null;
        this.f315005e = null;
        this.f315006f = 0;
        this.f315007g = null;
        this.f315008h = 0;
        this.f315009i = null;
        this.f315010j = null;
        this.f315011k = 0;
        this.f315012l = 0;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f315014n;
        if (b4Var != null) {
            b4Var.d();
        }
        ((mm2.t2) this.f315001a.a(mm2.t2.class)).f410963i = false;
    }
}
