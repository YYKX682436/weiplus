package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public class bn implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f280374d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6178x705b8fc4 f280375e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280376f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280377g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.C21675xd279843d f280378h;

    public bn(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.C21675xd279843d c21675xd279843d, int i17, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6178x705b8fc4 c6178x705b8fc4, java.lang.String str, java.lang.String str2) {
        this.f280378h = c21675xd279843d;
        this.f280374d = i17;
        this.f280375e = c6178x705b8fc4;
        this.f280376f = str;
        this.f280377g = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io ioVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io.NoTransform;
        java.lang.String str = this.f280376f;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.C21675xd279843d c21675xd279843d = this.f280378h;
        int i17 = this.f280374d;
        if (i17 != 0) {
            if (i17 == 3) {
                db5.e1.T(c21675xd279843d.f280102d.f280113d.g(), c21675xd279843d.f280102d.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b6n));
            } else if (i17 != 5) {
                db5.e1.T(c21675xd279843d.f280102d.f280113d.g(), c21675xd279843d.f280102d.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b6c));
            }
            c21675xd279843d.f280102d.m0(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(str), ioVar);
            c21675xd279843d.f280102d.f280113d.J();
            return;
        }
        am.kz kzVar = this.f280375e.f136438g;
        boolean equals = kzVar.f88727b.equals(kzVar.f88728c);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io ioVar2 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io.Transformed;
        final java.lang.String talker = this.f280377g;
        if (!equals) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ym ymVar = c21675xd279843d.f280102d;
            ymVar.f281872m++;
            ymVar.m0(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(str), ioVar2);
            long E1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(str);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ym ymVar2 = c21675xd279843d.f280102d;
            ymVar2.getClass();
            ymVar2.f281867e.a(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.an(ymVar2, talker, E1));
            return;
        }
        boolean n07 = c21675xd279843d.f280102d.n0(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(str));
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ym ymVar3 = c21675xd279843d.f280102d;
        if (!n07) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.TranslateComponent", "translateListener callback id: %s, original text equal translated text, auto translate, ", str);
            ymVar3.m0(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(str), ioVar);
            return;
        }
        java.util.regex.Pattern pattern = com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.l2.f236971h;
        if (!(j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C19983xefbc77b3()) == 1)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.TranslateComponent", "translateListener callback id: %s, same text long click translate, translateKeepOn switch off", str);
            ymVar3.f281872m++;
            ymVar3.m0(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(str), ioVar2);
            long E12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(str);
            ymVar3.getClass();
            ymVar3.f281867e.a(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.an(ymVar3, talker, E12));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.TranslateComponent", "translateListener callback id: %s, original text equal translated text, long click translate", str);
        android.app.Activity g17 = ymVar3.f280113d.g();
        final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f27 = pt0.f0.f2(talker, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(str));
        if (f27 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingUI.TranslateComponent", "translateListener callback id: %s, msg is null", str);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.TranslateComponent", "translateListener callback id: %s, hideTranslate", str);
        ymVar3.s0(f27);
        final java.lang.String langCode = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.c(g17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(langCode, "langCode");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("msgid", java.lang.String.valueOf(f27.m124847x74d37ac6()));
        hashMap.put("chat_username", talker);
        hashMap.put("current_language_code", langCode);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("same_language_popup", "view_exp", hashMap, 35268);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.TranslateComponent", "translateListener callback id: %s, show dialog", str);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(g17);
        u1Var.g(g17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n9d));
        u1Var.n(g17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lsg));
        u1Var.j(g17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.aq7));
        u1Var.l(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1() { // from class: com.tencent.mm.ui.chatting.component.bn$$a
            @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
            public final void a(boolean z17, java.lang.String str2) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.bn bnVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.bn.this;
                bnVar.getClass();
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = f27;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jn.a(f9Var, talker, langCode, 2);
                wd0.k2 k2Var = wd0.k2.SAME_LANGUAGE_WINDOW;
                com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10687xa533b04c c10687xa533b04c = new com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10687xa533b04c();
                c10687xa533b04c.f149354d = k2Var;
                c10687xa533b04c.f149355e = java.lang.String.valueOf(f9Var.m124847x74d37ac6());
                c10687xa533b04c.f149357g = 2;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.C21675xd279843d c21675xd279843d2 = bnVar.f280378h;
                c21675xd279843d2.f280102d.f281873n = c10687xa533b04c.m45295x5a5dd5d();
                java.lang.String Q0 = f9Var.Q0();
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ym ymVar4 = c21675xd279843d2.f280102d;
                ymVar4.f281874o = Q0;
                ((vd0.o3) ((wd0.z1) i95.n0.c(wd0.z1.class))).fj(ymVar4.f280113d.g(), c10687xa533b04c);
            }
        });
        u1Var.i(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1() { // from class: com.tencent.mm.ui.chatting.component.bn$$b
            @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
            public final void a(boolean z17, java.lang.String str2) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jn.a(com.p314xaae8f345.mm.p2621x8fb0427b.f9.this, talker, langCode, 1);
            }
        });
        u1Var.a(true);
        u1Var.q(true);
    }
}
