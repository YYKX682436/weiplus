package lr1;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final lr1.f f402190a = new lr1.f();

    /* renamed from: b, reason: collision with root package name */
    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f402191b;

    public final void a(java.lang.String url, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        if (b(url)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPayLogic", "appMsgPaySuccess url=" + url + ", itemShowType=" + i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.f175968a.l(url);
        e(url, true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.b(url, i17, 90, "", new java.lang.Object[0]);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5173xdad2a7f8 c5173xdad2a7f8 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5173xdad2a7f8();
        c5173xdad2a7f8.f135522g.getClass();
        c5173xdad2a7f8.b(android.os.Looper.getMainLooper());
    }

    public final boolean b(java.lang.String str) {
        return str != null && d().o(lr1.c0.f402176a.b(str), 0) == 1;
    }

    public final void c(java.util.Map values) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        java.lang.String str = (java.lang.String) values.get(".sysmsg.MMBizPaySubscribePayNotify.AppmsgUrl");
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) values.get(".sysmsg.MMBizPaySubscribePayNotify.ItemShowType"), -1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPayLogic", "onPaySuccessNotify url=" + str + ", itemShowType=" + P);
        if (str == null || P <= -1) {
            return;
        }
        a(str, P);
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 d() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f402191b;
        if (o4Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(o4Var, "null cannot be cast to non-null type com.tencent.mm.sdk.platformtools.MultiProcessMMKV");
            return o4Var;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 N = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.N("appMsgPay_" + (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() ? gm0.j1.b().h() : gm0.m.i()), 2, null);
        f402191b = N;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(N, "null cannot be cast to non-null type com.tencent.mm.sdk.platformtools.MultiProcessMMKV");
        return N;
    }

    public final void e(java.lang.String url, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        java.lang.String b17 = lr1.c0.f402176a.b(url);
        if (z17) {
            d().A(b17, 1);
        } else {
            d().remove(b17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.lang.CharSequence r11, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 r12, boolean r13, java.lang.String r14, int r15) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lr1.f.f(java.lang.CharSequence, com.tencent.mm.ui.widget.MMNeat7extView, boolean, java.lang.String, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r11.I == 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(java.lang.String r9, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 r10, ot0.s0 r11, int r12) {
        /*
            r8 = this;
            java.lang.String r0 = "text"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r9, r0)
            java.lang.String r0 = "titleTv"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r10, r0)
            java.lang.String r0 = "item"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r11, r0)
            int r0 = r11.f430303o
            if (r0 != 0) goto L1b
            int r0 = r11.I
            r1 = 1
            if (r0 != r1) goto L1b
            goto L1c
        L1b:
            r1 = 0
        L1c:
            java.lang.Class<le0.x> r0 = le0.x.class
            i95.m r0 = i95.n0.c(r0)
            le0.x r0 = (le0.x) r0
            android.content.Context r2 = r10.getContext()
            ke0.e r0 = (ke0.e) r0
            r0.getClass()
            android.text.SpannableString r3 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(r2, r9)
            java.lang.String r6 = r11.f430295e
            r2 = r8
            r4 = r10
            r5 = r1
            r7 = r12
            r2.f(r3, r4, r5, r6, r7)
            r9 = 2131298580(0x7f090914, float:1.8215137E38)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r1)
            r10.setTag(r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lr1.f.g(java.lang.String, com.tencent.mm.ui.widget.MMNeat7extView, ot0.s0, int):void");
    }
}
