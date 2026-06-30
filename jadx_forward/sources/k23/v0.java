package k23;

/* loaded from: classes12.dex */
public final class v0 {
    public boolean A;

    /* renamed from: a */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f385239a;

    /* renamed from: b */
    public k23.d0 f385240b;

    /* renamed from: c */
    public z21.e f385241c;

    /* renamed from: d */
    public java.lang.String f385242d;

    /* renamed from: e */
    public java.lang.String f385243e;

    /* renamed from: f */
    public boolean f385244f;

    /* renamed from: g */
    public long f385245g;

    /* renamed from: h */
    public java.lang.Boolean f385246h;

    /* renamed from: i */
    public k23.i1 f385247i;

    /* renamed from: j */
    public k23.x f385248j;

    /* renamed from: k */
    public boolean f385249k;

    /* renamed from: l */
    public boolean f385250l;

    /* renamed from: m */
    public boolean f385251m;

    /* renamed from: n */
    public k23.g0 f385252n;

    /* renamed from: o */
    public final k23.u0 f385253o;

    /* renamed from: p */
    public final java.lang.Runnable f385254p;

    /* renamed from: q */
    public boolean f385255q;

    /* renamed from: r */
    public boolean f385256r;

    /* renamed from: s */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f385257s;

    /* renamed from: t */
    public boolean f385258t;

    /* renamed from: u */
    public boolean f385259u;

    /* renamed from: v */
    public int f385260v;

    /* renamed from: w */
    public final jz5.g f385261w;

    /* renamed from: x */
    public boolean f385262x;

    /* renamed from: y */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f385263y;

    /* renamed from: z */
    public k23.k1 f385264z;

    public v0(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f385239a = activity;
        this.f385242d = "";
        this.f385243e = "";
        this.f385253o = new k23.u0(this, android.os.Looper.getMainLooper());
        this.f385254p = new k23.n0(this);
        this.f385255q = true;
        this.f385259u = true;
        this.f385261w = jz5.h.b(new k23.q0(this));
        this.f385262x = true;
        this.f385263y = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new k23.i0(this), true);
    }

    public static final void a(k23.v0 v0Var) {
        v0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "onBtnCancelRecognize");
        v0Var.f385251m = false;
        k23.g0 g0Var = v0Var.f385252n;
        if (g0Var != null) {
            g0Var.f385108b = true;
        }
        v0Var.f385263y.d();
        k23.d0 d0Var = v0Var.f385240b;
        if (d0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("params");
            throw null;
        }
        k23.v2 v2Var = d0Var.f385079c;
        if (v2Var != null) {
            v2Var.mo63604x3d6f0539();
        }
        vu4.b n17 = v0Var.n();
        k23.d0 d0Var2 = v0Var.f385240b;
        if (d0Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("params");
            throw null;
        }
        int i17 = d0Var2.f385081e == k23.w0.f385270g ? 238 : d0Var2.f385083g;
        org.json.JSONObject o17 = v0Var.o();
        java.lang.String p17 = v0Var.p();
        z50.d dVar = z50.e.f551696a;
        vu4.a aVar = vu4.a.f521789z;
        k23.d0 d0Var3 = v0Var.f385240b;
        if (d0Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("params");
            throw null;
        }
        dVar.a(aVar, n17, i17, d0Var3.f385082f, o17, p17);
        x(v0Var, 5, "{\"voiceId\":\"" + v0Var.f385243e + "\"}", null, 4, null);
        x(v0Var, 7, "{\"errorCode\": \"-3\"; \"voiceId\":\"\"; \"errorMsg\": \"user cancel\"}", null, 4, null);
        v0Var.s();
        v0Var.z();
    }

    public static final void b(k23.v0 v0Var) {
        z21.j0 j0Var;
        v0Var.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis() - v0Var.f385245g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBtnFinishRecognize, scene=");
        k23.d0 d0Var = v0Var.f385240b;
        if (d0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("params");
            throw null;
        }
        sb6.append(d0Var.f385081e);
        sb6.append(", duration=");
        sb6.append(currentTimeMillis);
        sb6.append("ms, recognizingText='");
        sb6.append(v0Var.f385242d);
        sb6.append('\'');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", sb6.toString());
        k23.g0 g0Var = v0Var.f385252n;
        if (g0Var != null) {
            g0Var.f385108b = true;
        }
        v0Var.f385263y.d();
        x(v0Var, 4, null, null, 6, null);
        if (currentTimeMillis < 500) {
            if (v0Var.f385242d.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "Recording too short and no result, hide immediately");
                v0Var.f385251m = false;
                v0Var.s();
                x(v0Var, 7, "{\"errorCode\":-1;\"errMsg\":\"recording not started when gesture end\";\"voiceId\":\"\"}", null, 4, null);
                v0Var.z();
                return;
            }
        }
        v0Var.f385253o.sendEmptyMessageDelayed(101, 3000L);
        z21.e eVar = v0Var.f385241c;
        if (eVar != null) {
            ((z21.w) eVar).mo48299x360802(true);
        }
        z21.e eVar2 = v0Var.f385241c;
        if (eVar2 != null) {
            z21.w wVar = (z21.w) eVar2;
            if (!wVar.C || (j0Var = wVar.A) == null) {
                return;
            }
            j0Var.f551173w = true;
        }
    }

    public static final void c(k23.v0 v0Var) {
        k23.q2 q2Var;
        v0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "onBtnStartRecognize");
        boolean z17 = true;
        v0Var.f385251m = true;
        v0Var.g("interrupted by new session", -4);
        long timeInMillis = java.util.Calendar.getInstance().getTimeInMillis();
        java.util.Random random = new java.util.Random();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(10);
        for (int i17 = 0; i17 < 10; i17++) {
            sb6.append(random.nextInt(10));
        }
        java.lang.String format = java.lang.String.format("vs-%d-%s", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(timeInMillis), sb6}, 2));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        v0Var.f385252n = new k23.g0(format);
        v0Var.f385245g = java.lang.System.currentTimeMillis();
        v0Var.f385255q = true;
        k23.d0 d0Var = v0Var.f385240b;
        if (d0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("params");
            throw null;
        }
        k23.v2 v2Var = d0Var.f385079c;
        if (v2Var != null) {
            v2Var.a();
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = v0Var.f385239a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (iq.b.C(context) || iq.b.v(context) || iq.b.e(context) || iq.b.z(context)) {
            q2Var = k23.q2.f385204f;
        } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(context)) {
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            boolean d17 = j35.u.d(context, "android.permission.RECORD_AUDIO", true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTSVoicePermission", "summerper checkPermission checkMicrophone[%s]", java.lang.Boolean.valueOf(d17));
            if (d17) {
                q2Var = k23.q2.f385203e;
            } else {
                ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                j35.u.i(context, "android.permission.RECORD_AUDIO", 80);
                q2Var = k23.q2.f385206h;
            }
        } else {
            q2Var = k23.q2.f385205g;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "checkPermission -> " + q2Var.f385208d);
        int ordinal = q2Var.ordinal();
        if (ordinal != 0) {
            if (ordinal != 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "do nothing");
            } else {
                v0Var.D(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fh9));
            }
            z17 = false;
        }
        v0Var.f385255q = z17;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FTSFloatingVoiceInputViewModel", "something wrong with recognizing");
            return;
        }
        v0Var.z();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "showRecognizingPanel");
        k23.x xVar = v0Var.f385248j;
        if (xVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recognizingPanel");
            throw null;
        }
        xVar.setVisibility(0);
        k23.x xVar2 = v0Var.f385248j;
        if (xVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recognizingPanel");
            throw null;
        }
        if (xVar2.getParent() == null) {
            k23.d0 d0Var2 = v0Var.f385240b;
            if (d0Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("params");
                throw null;
            }
            android.view.ViewGroup viewGroup = d0Var2.f385077a;
            if (viewGroup != null) {
                k23.x xVar3 = v0Var.f385248j;
                if (xVar3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recognizingPanel");
                    throw null;
                }
                viewGroup.addView(xVar3, d0Var2.f385078b);
            }
        }
        v0Var.H();
        k23.x xVar4 = v0Var.f385248j;
        if (xVar4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recognizingPanel");
            throw null;
        }
        xVar4.g();
        int h17 = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df);
        java.lang.Integer mo141805xa625e1cc = v0Var.q().mo141805xa625e1cc();
        int intValue = h17 + (mo141805xa625e1cc != null ? mo141805xa625e1cc.intValue() : pm0.v.S(90));
        k23.x xVar5 = v0Var.f385248j;
        if (xVar5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recognizingPanel");
            throw null;
        }
        xVar5.m141839x650f6d08(intValue);
        y50.m mVar = y50.m.f540993a;
        y50.m.f540994b.f540980c = null;
        y50.m.f540995c.f540980c = null;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = v0Var.f385239a;
        k23.x xVar6 = v0Var.f385248j;
        if (xVar6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recognizingPanel");
            throw null;
        }
        y50.m.a(mVar, abstractActivityC21394xb3d2c0cf, xVar6.m141858x53a819e6(), 300L, v0Var.q().m141806x53a819e6(), null, 16, null);
        k23.x xVar7 = v0Var.f385248j;
        if (xVar7 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recognizingPanel");
            throw null;
        }
        xVar7.d();
        ((x90.o) ((y90.i) i95.n0.c(y90.i.class))).getClass();
        z21.w wVar = new z21.w();
        v0Var.f385241c = wVar;
        wVar.mo48284x316510(false, false, 1, 23, new k23.s0(v0Var));
        z21.e eVar = v0Var.f385241c;
        if (eVar != null) {
            ((z21.w) eVar).f(v0Var.f385250l, v0Var.f385249k, new k23.t0(v0Var));
        }
        z21.e eVar2 = v0Var.f385241c;
        if (eVar2 != null) {
            ((z21.w) eVar2).mo48296x68ac462();
        }
        v0Var.f385263y.c(50L, 50L);
        vu4.b n17 = v0Var.n();
        org.json.JSONObject o17 = v0Var.o();
        java.lang.String p17 = v0Var.p();
        z50.d dVar = z50.e.f551696a;
        vu4.a aVar = vu4.a.E;
        k23.d0 d0Var3 = v0Var.f385240b;
        if (d0Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("params");
            throw null;
        }
        dVar.a(aVar, n17, d0Var3.f385083g, d0Var3.f385082f, o17, p17);
        x(v0Var, 1, "{\"transferType\":" + (v0Var.f385250l ? 1 : 0) + ";\"encodeType\":" + (v0Var.f385249k ? 1 : 0) + ";\"exptArg\":" + j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2567xc9fa65a8.C20693x8caf9c71()) + ";}", null, 4, null);
    }

    public static /* synthetic */ void x(k23.v0 v0Var, int i17, java.lang.String str, java.lang.String str2, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            str = "";
        }
        if ((i18 & 4) != 0) {
            str2 = v0Var.f385242d;
        }
        v0Var.w(i17, str, str2);
    }

    public final int A(int i17) {
        if (i17 <= 0) {
            return i17;
        }
        try {
            k23.d0 d0Var = this.f385240b;
            if (d0Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("params");
                throw null;
            }
            android.view.ViewGroup viewGroup = d0Var.f385080d;
            if (viewGroup == null) {
                if (d0Var == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("params");
                    throw null;
                }
                viewGroup = d0Var.f385077a;
                if (viewGroup == null) {
                    return i17;
                }
            }
            android.view.View rootView = viewGroup.getRootView();
            if (rootView == null) {
                return i17;
            }
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.g3 a17 = n3.b1.a(rootView);
            if (a17 == null) {
                return i17;
            }
            int i18 = a17.a(8).f328580d;
            int i19 = a17.a(2).f328580d;
            if (i18 > 0 && i19 > 0) {
                boolean z17 = true;
                int i27 = i18 - i17;
                if (!(1 <= i27 && i27 <= i19 + 1)) {
                    return i17;
                }
                int[] iArr = new int[2];
                viewGroup.getLocationInWindow(iArr);
                if (rootView.getHeight() - (iArr[1] + viewGroup.getHeight()) > 1) {
                    z17 = false;
                }
                return z17 ? i18 : i17;
            }
            return i17;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FTSFloatingVoiceInputViewModel", "resolveEffectiveKeyboardHeight err: " + th6);
            return i17;
        }
    }

    public final void B(boolean z17) {
        if (this.f385262x == z17) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setGloballyEnabledByUser: ");
        sb6.append(z17);
        sb6.append(" (scene=");
        k23.d0 d0Var = this.f385240b;
        if (d0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("params");
            throw null;
        }
        sb6.append(d0Var.f385081e);
        sb6.append(')');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", sb6.toString());
        this.f385262x = z17;
        if (z17) {
            return;
        }
        r();
        k23.x xVar = this.f385248j;
        if (xVar != null) {
            xVar.setVisibility(8);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recognizingPanel");
            throw null;
        }
    }

    public final void C() {
        if (!e()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "showButtonIfNeeded skipped: not allowed by global switch");
            return;
        }
        if (q().getVisibility() == 0 && this.f385244f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "showButtonIfNeeded, already show");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "showButtonIfNeeded");
        q().setVisibility(0);
        y50.m.a(y50.m.f540993a, this.f385239a, q().m141806x53a819e6(), 0L, null, null, 24, null);
        this.f385244f = true;
    }

    public final void D(java.lang.String str) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        u1Var.g(str);
        u1Var.a(true);
        u1Var.c(null, null);
        u1Var.q(false);
    }

    public final void E() {
        k23.d0 d0Var = this.f385240b;
        if (d0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("params");
            throw null;
        }
        java.lang.String buttonTitle = d0Var.f385084h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buttonTitle, "buttonTitle");
        q().m141807x31c3fd81(buttonTitle);
        C();
    }

    public final void F(float f17) {
        k23.d0 d0Var = this.f385240b;
        if (d0Var != null) {
            d0Var.f385088l = f17;
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("params");
            throw null;
        }
    }

    public final void G(boolean z17) {
        boolean z18 = z17 && e();
        q().setVisibility(z18 ? 0 : 8);
        k23.x xVar = this.f385248j;
        if (xVar != null) {
            xVar.setVisibility(z18 ? 0 : 8);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recognizingPanel");
            throw null;
        }
    }

    public final void H() {
        java.lang.Object systemService = this.f385239a.getSystemService("vibrator");
        android.os.Vibrator vibrator = systemService instanceof android.os.Vibrator ? (android.os.Vibrator) systemService : null;
        if (vibrator == null) {
            return;
        }
        vibrator.vibrate(30L);
    }

    public final void d(int i17) {
        k23.i1 q17 = q();
        k23.p2 p2Var = q17 instanceof k23.p2 ? (k23.p2) q17 : null;
        if (p2Var == null) {
            return;
        }
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(p2Var.m141826x3abcee57(), i17);
        ofInt.setDuration(200L);
        android.view.animation.PathInterpolator pathInterpolator = k23.i1.f385117m;
        ofInt.setInterpolator(k23.i1.f385117m);
        ofInt.addUpdateListener(new k23.j0(p2Var, ofInt));
        ofInt.start();
    }

    public final boolean e() {
        k23.d0 d0Var = this.f385240b;
        if (d0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("params");
            throw null;
        }
        if (!(d0Var.f385081e == k23.w0.f385267d) || this.f385262x) {
            return true;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("canShowButton=false: globally disabled by user (scene=");
        k23.d0 d0Var2 = this.f385240b;
        if (d0Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("params");
            throw null;
        }
        sb6.append(d0Var2.f385081e);
        sb6.append(')');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", sb6.toString());
        return false;
    }

    public final void f() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.f385257s;
        if (f5Var != null) {
            f5Var.f291933e = null;
            f5Var.d();
            this.f385257s = null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "cleanupKeyboardBinding");
        }
    }

    public final void g(java.lang.String str, int i17) {
        java.lang.String str2;
        k23.g0 g0Var = this.f385252n;
        if (g0Var == null) {
            return;
        }
        if (g0Var == null || !g0Var.f385108b) {
            java.lang.String str3 = "{\"errorCode\": " + i17 + "; \"errMsg\": " + str + "; \"voiceId\":\"" + this.f385243e + "\"}";
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("floating VI closeSession[");
            k23.g0 g0Var2 = this.f385252n;
            if (g0Var2 == null || (str2 = g0Var2.f385107a) == null) {
                str2 = "";
            }
            sb6.append(str2);
            sb6.append("], reason:");
            sb6.append(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", sb6.toString());
            x(this, 7, str3, null, 4, null);
            k23.g0 g0Var3 = this.f385252n;
            if (g0Var3 == null) {
                return;
            }
            g0Var3.f385108b = true;
        }
    }

    public final void h() {
        if (this.f385256r) {
            this.f385256r = false;
            f();
            int j17 = j();
            k23.i1 q17 = q();
            k23.p2 p2Var = q17 instanceof k23.p2 ? (k23.p2) q17 : null;
            if (p2Var != null) {
                p2Var.m141828x2b35663(j17);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "disableKeyboardBinding, reset margin to default: " + j17);
        }
    }

    public final void i() {
        this.f385256r = true;
        f();
        this.f385258t = false;
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.f5(this.f385239a);
        f5Var.f291933e = new k23.l0(this);
        this.f385239a.getWindow().getDecorView().post(new k23.m0(f5Var));
        this.f385257s = f5Var;
        this.f385239a.mo273xed6858b4().a(new p012xc85e97e9.p093xedfae76a.f() { // from class: com.tencent.mm.plugin.fts.ui.voice.FTSFloatingVoiceInputViewModel$enableKeyboardBindingWithAutoProvider$3
            @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
            /* renamed from: onDestroy */
            public void mo7795xac79a11b(p012xc85e97e9.p093xedfae76a.y owner) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
                k23.v0.this.f();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "lifecycle onDestroy, auto cleanup keyboardHeightProvider");
            }
        });
    }

    public final int j() {
        k23.d0 d0Var = this.f385240b;
        if (d0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("params");
            throw null;
        }
        int i17 = k23.h0.f385112a[d0Var.f385081e.ordinal()];
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f385239a;
        return i17 == 1 ? i65.a.h(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.R.C30860x5b28f31.ali) : i65.a.h(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.R.C30860x5b28f31.f561257dg);
    }

    public final int k() {
        k23.i1 q17 = q();
        k23.p2 p2Var = q17 instanceof k23.p2 ? (k23.p2) q17 : null;
        if (p2Var != null) {
            return j() + p2Var.m141803xca568c10().getHeight();
        }
        java.lang.Integer mo141805xa625e1cc = q().mo141805xa625e1cc();
        if (mo141805xa625e1cc != null) {
            return mo141805xa625e1cc.intValue();
        }
        return 0;
    }

    public final int l() {
        return ((java.lang.Number) ((jz5.n) this.f385261w).mo141623x754a37bb()).intValue();
    }

    public final k23.j2 m() {
        k23.i1 q17 = q();
        if (q17 instanceof k23.j2) {
            return (k23.j2) q17;
        }
        return null;
    }

    public final vu4.b n() {
        k23.d0 d0Var = this.f385240b;
        if (d0Var != null) {
            int ordinal = d0Var.f385081e.ordinal();
            return (ordinal == 1 || ordinal == 2) ? vu4.b.D : vu4.b.C;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("params");
        throw null;
    }

    public final org.json.JSONObject o() {
        k23.d0 d0Var = this.f385240b;
        if (d0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("params");
            throw null;
        }
        int ordinal = d0Var.f385081e.ordinal();
        if (ordinal == 3 || ordinal == 4) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("isFromVoice", 1);
            if (!(this.f385243e.length() > 0)) {
                return jSONObject;
            }
            jSONObject.put("voiceId", this.f385243e);
            return jSONObject;
        }
        try {
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = this.f385239a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(context).a(z13.f.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            return ((z13.f) a17).a7();
        } catch (java.lang.Exception unused) {
            return new org.json.JSONObject();
        }
    }

    public final java.lang.String p() {
        k23.d0 d0Var = this.f385240b;
        if (d0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("params");
            throw null;
        }
        int ordinal = d0Var.f385081e.ordinal();
        if (ordinal == 3 || ordinal == 4) {
            return "";
        }
        try {
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = this.f385239a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(context).a(z13.f.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            return ((z13.f) a17).f550934g;
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public final k23.i1 q() {
        k23.i1 i1Var = this.f385247i;
        if (i1Var != null) {
            return i1Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("startRecognizeBtn");
        throw null;
    }

    public final void r() {
        if (q().getVisibility() == 8) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "hideFloatingButton, already hide");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "hideFloatingButton");
        q().setVisibility(8);
        this.f385244f = false;
    }

    public final void s() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "hideRecognizingPanel: clearing text");
        k23.x xVar = this.f385248j;
        if (xVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recognizingPanel");
            throw null;
        }
        if (this.f385239a.isFinishing()) {
            xVar.c();
            return;
        }
        y50.m mVar = y50.m.f540993a;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f385239a;
        java.lang.Integer[] m141806x53a819e6 = q().m141806x53a819e6();
        k23.x xVar2 = this.f385248j;
        if (xVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recognizingPanel");
            throw null;
        }
        y50.m.a(mVar, abstractActivityC21394xb3d2c0cf, m141806x53a819e6, 150L, xVar2.m141858x53a819e6(), null, 16, null);
        xVar.e(new k23.o0(xVar));
    }

    public final void t(k23.d0 params) {
        k23.i1 j1Var;
        android.view.ViewGroup.LayoutParams layoutParams;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "init, parmags: " + params);
        this.f385240b = params;
        int ordinal = params.f385081e.ordinal();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f385239a;
        if (ordinal == 0) {
            k23.d0 d0Var = this.f385240b;
            if (d0Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("params");
                throw null;
            }
            j1Var = new k23.j1(abstractActivityC21394xb3d2c0cf, d0Var);
        } else if (ordinal == 3) {
            k23.d0 d0Var2 = this.f385240b;
            if (d0Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("params");
                throw null;
            }
            j1Var = new k23.l2(abstractActivityC21394xb3d2c0cf, d0Var2);
        } else if (ordinal != 4) {
            k23.d0 d0Var3 = this.f385240b;
            if (d0Var3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("params");
                throw null;
            }
            j1Var = new k23.k2(abstractActivityC21394xb3d2c0cf, d0Var3);
        } else {
            k23.d0 d0Var4 = this.f385240b;
            if (d0Var4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("params");
                throw null;
            }
            j1Var = new k23.j2(abstractActivityC21394xb3d2c0cf, d0Var4);
        }
        this.f385247i = j1Var;
        if (q().getParent() != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("hitest addStartRecognizeBtnInContainerIfNeeded: already has parent=");
            android.view.ViewParent parent = q().getParent();
            sb6.append(parent != null ? parent.getClass().getSimpleName() : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", sb6.toString());
        } else {
            k23.d0 d0Var5 = this.f385240b;
            if (d0Var5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("params");
                throw null;
            }
            android.view.ViewGroup viewGroup = d0Var5.f385080d;
            if (viewGroup == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "hitest addStartRecognizeBtnInContainerIfNeeded: btnContainerView is null!");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "hitest addStartRecognizeBtnInContainerIfNeeded: container=" + viewGroup.getClass().getSimpleName() + ", containerId=" + viewGroup.getId() + ", containerChildCount=" + viewGroup.getChildCount());
                if (viewGroup instanceof android.widget.RelativeLayout) {
                    android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
                    layoutParams2.addRule(12);
                    layoutParams2.addRule(14);
                    layoutParams = layoutParams2;
                } else if (viewGroup instanceof android.widget.FrameLayout) {
                    android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(-1, -2);
                    layoutParams3.gravity = 81;
                    layoutParams = layoutParams3;
                } else {
                    layoutParams = new android.view.ViewGroup.LayoutParams(-1, -2);
                }
                viewGroup.addView(q(), layoutParams);
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("hitest addStartRecognizeBtnInContainerIfNeeded: added! containerChildCount=");
                sb7.append(viewGroup.getChildCount());
                sb7.append(", btnParent=");
                android.view.ViewParent parent2 = q().getParent();
                sb7.append(parent2 != null ? parent2.getClass().getSimpleName() : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", sb7.toString());
            }
        }
        q().m141809xc6cf6336(new k23.p0(this));
        k23.d0 d0Var6 = this.f385240b;
        if (d0Var6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("params");
            throw null;
        }
        this.f385248j = new k23.x(d0Var6, abstractActivityC21394xb3d2c0cf);
        boolean z17 = false;
        this.f385249k = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2567xc9fa65a8.C20695x7c400ff1()) == 1 && j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C20065x13676e33()) == 1;
        if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2567xc9fa65a8.C20694xb5cd691()) == 1 && j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C20060x592fcc6f()) == 1) {
            z17 = true;
        }
        this.f385250l = z17;
    }

    public final void u(boolean z17) {
        this.f385259u = z17;
        if (this.f385256r) {
            k23.d0 d0Var = this.f385240b;
            if (d0Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("params");
                throw null;
            }
            if (d0Var.f385081e != k23.w0.f385267d) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "onQueryStateChanged: queryEmpty=" + z17 + ", lastKeyboardHeight=" + this.f385260v);
            if (!z17) {
                G(false);
                return;
            }
            E();
            if (this.f385260v > 0) {
                F(0.8f);
                d(l() + A(this.f385260v));
            } else {
                F(0.6f);
                d(j());
            }
        }
    }

    public final void v() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "onViewDisappear");
        this.f385251m = false;
        k23.g0 g0Var = this.f385252n;
        if (g0Var != null) {
            g0Var.f385108b = true;
        }
        this.f385263y.d();
        x(this, 7, "{\"errorCode\":-5;\"errMsg\":\"interrupted\";\"voiceId\":\"" + this.f385243e + "\"}", null, 4, null);
        g("resign active", -5);
        s();
        z();
    }

    public final void w(int i17, java.lang.String extInfo, java.lang.String query) {
        java.lang.String str;
        java.lang.String str2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extInfo, "extInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f385239a;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2 activityC15607x502bbbb2 = abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2 ? (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2) abstractActivityC21394xb3d2c0cf : null;
        if (activityC15607x502bbbb2 == null) {
            su4.b1 b1Var = ((s50.l1) ((su4.c1) i95.n0.c(su4.c1.class))).f484620n;
            k23.g0 g0Var = this.f385252n;
            if (g0Var == null || (str = g0Var.f385107a) == null) {
                str = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.x2.g(i17, 3, 6, extInfo, query, str, b1Var.f494349a, b1Var.f494350b);
            return;
        }
        g23.k kVar = activityC15607x502bbbb2.L1.f219686r;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(kVar, "getFtsSearchStaticsObj(...)");
        k23.g0 g0Var2 = this.f385252n;
        if (g0Var2 == null || (str2 = g0Var2.f385107a) == null) {
            str2 = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.x2.g(i17, 3, 6, extInfo, query, str2, o13.p.f423783c, kVar.B);
        su4.c1 c1Var = (su4.c1) i95.n0.c(su4.c1.class);
        long j17 = o13.p.f423783c;
        long j18 = kVar.B;
        su4.b1 b1Var2 = ((s50.l1) c1Var).f484620n;
        b1Var2.f494349a = j17;
        b1Var2.f494350b = j18;
    }

    public final void y() {
        if (this.f385251m) {
            x(this, 7, "{\"errorCode\":-5;\"errMsg\":\"interrupted\";\"voiceId\":\"" + this.f385243e + "\"}", null, 4, null);
        }
    }

    public final void z() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "resetRecognizing");
        z21.e eVar = this.f385241c;
        if (eVar != null) {
            eVar.mo48278xae7a2e7a(true);
        }
        this.f385241c = null;
        this.f385242d = "";
        this.f385243e = "";
        this.f385253o.removeMessages(101);
    }
}
