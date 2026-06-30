package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0003\u0007\b\tB\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/tencent/mm/plugin/finder/activity/poi/flutter/FinderFlutterPOIActivity;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lia2/o0;", "Lzy2/q9;", "Lgx2/b;", "<init>", "()V", "ia2/b", "ia2/e", "ia2/f", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity */
/* loaded from: classes2.dex */
public final class ActivityC13656x51707ca3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa implements ia2.o0, zy2.q9, gx2.b {
    public static final /* synthetic */ int H1 = 0;
    public boolean A;
    public double A1;
    public int B;
    public java.lang.String B1;
    public boolean C;
    public java.lang.String C1;
    public boolean D;
    public java.lang.String D1;
    public boolean E;
    public java.lang.Integer E1;
    public boolean F;
    public int G;
    public boolean G1;
    public long H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public gx2.q f183309J;
    public android.view.View K;
    public boolean L;
    public yz5.l M;
    public yz5.p N;
    public yz5.p P;
    public yz5.q Q;
    public yz5.a R;
    public yz5.a S;
    public yz5.a T;
    public yz5.a U;
    public boolean V;
    public boolean W;
    public boolean Y;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f183310l1;

    /* renamed from: p0, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.v90 f183311p0;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.ref.WeakReference f183313t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.ref.WeakReference f183314u;

    /* renamed from: v, reason: collision with root package name */
    public ia2.n0 f183315v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f183316w;

    /* renamed from: x, reason: collision with root package name */
    public r45.f96 f183317x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f183318x0;

    /* renamed from: x1, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f183319x1;

    /* renamed from: y, reason: collision with root package name */
    public r45.c35 f183320y;

    /* renamed from: y0, reason: collision with root package name */
    public android.view.ViewTreeObserver.OnGlobalLayoutListener f183321y0;

    /* renamed from: y1, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f183322y1;

    /* renamed from: z, reason: collision with root package name */
    public bw5.ah0 f183323z;

    /* renamed from: z1, reason: collision with root package name */
    public double f183324z1;
    public final ja2.c X = new ja2.c();
    public zy2.o9 Z = zy2.o9.f559051f;

    /* renamed from: p1, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f183312p1 = p3325xe03a0797.p3326xc267989b.z0.b();
    public final int F1 = 2000;

    public static final void c7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3 activityC13656x51707ca3) {
        r45.f96 f96Var = activityC13656x51707ca3.f183317x;
        if (f96Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderFlutterPOIActivity", "skip requesting poi stream since location is empty");
            return;
        }
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(activityC13656x51707ca3);
        int intExtra = activityC13656x51707ca3.getIntent().getIntExtra("KEY_ENTER_MEDIA_TAB_TYPE", 0);
        java.lang.String stringExtra = activityC13656x51707ca3.getIntent().getStringExtra("key_bypass_buffer");
        if (stringExtra == null) {
            stringExtra = "";
        }
        java.lang.String str = stringExtra;
        ia2.n0 n0Var = activityC13656x51707ca3.f183315v;
        if (n0Var != null) {
            n0Var.h(f96Var, activityC13656x51707ca3.Z, activityC13656x51707ca3.H, java.lang.Integer.valueOf(activityC13656x51707ca3.I), intExtra, str, new ia2.h(weakReference), new ia2.i(weakReference));
        }
    }

    public static final boolean d7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3 activityC13656x51707ca3) {
        yz5.a aVar = activityC13656x51707ca3.U;
        if (aVar != null) {
            return ((java.lang.Boolean) aVar.mo152xb9724478()).booleanValue();
        }
        return false;
    }

    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 e7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3 activityC13656x51707ca3) {
        yz5.a aVar = activityC13656x51707ca3.T;
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 c16279x64cea23 = aVar != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23) aVar.mo152xb9724478() : null;
        if (c16279x64cea23 == null) {
            r45.f96 f96Var = activityC13656x51707ca3.f183317x;
            return f96Var != null ? ia2.e0.b(f96Var, false, 1, null) : null;
        }
        if (c16279x64cea23.f226127p != null) {
            return c16279x64cea23;
        }
        r45.f96 f96Var2 = activityC13656x51707ca3.f183317x;
        if ((f96Var2 != null ? f96Var2.m75945x2fec8307(5) : null) == null) {
            return c16279x64cea23;
        }
        r45.f96 f96Var3 = activityC13656x51707ca3.f183317x;
        c16279x64cea23.f226127p = f96Var3 != null ? f96Var3.m75945x2fec8307(5) : null;
        return c16279x64cea23;
    }

    public static final void f7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3 activityC13656x51707ca3) {
        ia2.n0 n0Var;
        com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.C23922xf4e16628 c23922xf4e16628;
        ia2.n0 n0Var2;
        com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.C23922xf4e16628 c23922xf4e166282;
        byte[] p76 = activityC13656x51707ca3.p7();
        if (p76 != null && (n0Var2 = activityC13656x51707ca3.f183315v) != null && (c23922xf4e166282 = n0Var2.f371488f) != null) {
            c23922xf4e166282.m88603x6a6340cd(p76, ia2.q0.a("reloadHeadWithInfo"));
        }
        bw5.ah0 ah0Var = activityC13656x51707ca3.f183323z;
        byte[] mo14344x5f01b1f6 = ah0Var != null ? ah0Var.mo14344x5f01b1f6() : null;
        if (mo14344x5f01b1f6 == null || (n0Var = activityC13656x51707ca3.f183315v) == null || (c23922xf4e16628 = n0Var.f371488f) == null) {
            return;
        }
        c23922xf4e16628.m88604x908d5004(mo14344x5f01b1f6, ia2.q0.a("reloadHeadWithServiceInfo"));
    }

    public static final java.lang.Object g7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3 activityC13656x51707ca3, android.content.Context context, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        yz5.a aVar = activityC13656x51707ca3.S;
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 c16279x64cea23 = aVar != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23) aVar.mo152xb9724478() : null;
        if (c16279x64cea23 != null) {
            if (!c16279x64cea23.a()) {
                c16279x64cea23 = null;
            }
            if (c16279x64cea23 != null) {
                return c16279x64cea23;
            }
        }
        return p3325xe03a0797.p3326xc267989b.a4.c(1000L, new ia2.a0(context, null), interfaceC29045xdcb5ca57);
    }

    public static final void h7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3 activityC13656x51707ca3, float f17, boolean z17, boolean z18) {
        ia2.n0 n0Var;
        com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.C23922xf4e16628 c23922xf4e16628;
        if (activityC13656x51707ca3.L && z17) {
            activityC13656x51707ca3.L = false;
        }
        if (activityC13656x51707ca3.D || activityC13656x51707ca3.L) {
            f17 = 1.0f;
        }
        if (z18 || (n0Var = activityC13656x51707ca3.f183315v) == null || (c23922xf4e16628 = n0Var.f371488f) == null) {
            return;
        }
        c23922xf4e16628.m88609x36846d3b(f17, ia2.q0.a("updateScrollState"));
    }

    public static void m7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3 activityC13656x51707ca3, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f, com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e83, gx2.q qVar, android.view.ViewGroup viewGroup, java.lang.Integer num, java.lang.Integer num2, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 4) != 0) {
            qVar = null;
        }
        if ((i18 & 8) != 0) {
            viewGroup = null;
        }
        if ((i18 & 16) != 0) {
            num = null;
        }
        if ((i18 & 32) != 0) {
            num2 = 0;
        }
        if ((i18 & 64) != 0) {
            i17 = 0;
        }
        activityC13656x51707ca3.getClass();
        activityC13656x51707ca3.f183313t = new java.lang.ref.WeakReference(c22584xf7d97e83);
        activityC13656x51707ca3.f183314u = new java.lang.ref.WeakReference(activityC1102x9ee2d9f);
        activityC13656x51707ca3.D1 = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        activityC13656x51707ca3.E1 = num2;
        activityC13656x51707ca3.G = i17;
        if (activityC1102x9ee2d9f instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activityC1102x9ee2d9f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) pf5.z.f435481a.a(activity).c(zy2.ra.class))).V6();
            activityC13656x51707ca3.B1 = V6.m75945x2fec8307(1);
            activityC13656x51707ca3.C1 = V6.m75945x2fec8307(2);
        }
        if (qVar != null) {
            activityC13656x51707ca3.f183309J = qVar;
        } else if (viewGroup != null && num != null) {
            float j76 = activityC13656x51707ca3.j7(activityC1102x9ee2d9f);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderFlutterPOIActivity", "expand :" + j76);
            gx2.a aVar = new gx2.a();
            aVar.f358870c = j76;
            aVar.f358869b = true;
            aVar.f358872e = new hx2.c(viewGroup);
            android.view.View findViewById = activityC1102x9ee2d9f.findViewById(num.intValue());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
            activityC13656x51707ca3.f183309J = aVar.b((android.view.ViewGroup) findViewById);
        }
        gx2.q qVar2 = activityC13656x51707ca3.f183309J;
        if (qVar2 != null) {
            ((java.util.ArrayList) qVar2.U).add(activityC13656x51707ca3);
        }
        gx2.q qVar3 = activityC13656x51707ca3.f183309J;
        if (qVar3 != null) {
            qVar3.m132478xc4d6542e(new hx2.g(activityC1102x9ee2d9f, com.p314xaae8f345.mm.R.C30859x5a72f63.f560027f, com.p314xaae8f345.mm.R.C30859x5a72f63.f77698x3cb0744, com.p314xaae8f345.mm.R.C30861xcebc809e.aar, false, true));
        }
        gx2.q qVar4 = activityC13656x51707ca3.f183309J;
        if (qVar4 != null) {
            qVar4.m132470x8c9f77ad(new ia2.b(activityC13656x51707ca3, activityC1102x9ee2d9f));
        }
        gx2.q qVar5 = activityC13656x51707ca3.f183309J;
        if (qVar5 != null) {
            ia2.f fVar = new ia2.f(activityC13656x51707ca3);
            fVar.f367189a = qVar5;
            ((java.util.HashSet) qVar5.R).add(fVar);
        }
        gx2.q qVar6 = activityC13656x51707ca3.f183309J;
        if (qVar6 != null) {
            qVar6.m132474x77f391b9(new ia2.o(activityC13656x51707ca3));
        }
        gx2.q qVar7 = activityC13656x51707ca3.f183309J;
        if (qVar7 == null) {
            return;
        }
        qVar7.m132487x21d1be0e(new ia2.p(activityC13656x51707ca3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r0.f371490h == true) goto L8;
     */
    @Override // gx2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Rect G6(gx2.q r5) {
        /*
            r4 = this;
            java.lang.String r0 = "drawer"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r0)
            ia2.n0 r0 = r4.f183315v
            r1 = 0
            if (r0 == 0) goto L10
            boolean r0 = r0.f371490h
            r2 = 1
            if (r0 != r2) goto L10
            goto L11
        L10:
            r2 = r1
        L11:
            if (r2 == 0) goto L2a
            androidx.appcompat.app.AppCompatActivity r0 = r4.mo55332x76847179()
            com.tencent.mm.ui.ah r0 = com.p314xaae8f345.mm.ui.bh.a(r0)
            android.graphics.Rect r2 = new android.graphics.Rect
            float r5 = r5.m62637x6c20397b()
            int r5 = (int) r5
            int r3 = r0.f278668a
            int r0 = r0.f278669b
            r2.<init>(r1, r5, r3, r0)
            return r2
        L2a:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3.G6(gx2.q):android.graphics.Rect");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa
    /* renamed from: W6 */
    public int getD() {
        android.content.Intent intent = getIntent();
        java.io.Serializable serializableExtra = intent != null ? intent.getSerializableExtra("key_from_type") : null;
        zy2.o9 o9Var = serializableExtra instanceof zy2.o9 ? (zy2.o9) serializableExtra : null;
        java.io.Serializable serializableExtra2 = intent != null ? intent.getSerializableExtra("key_half_screen_mode") : null;
        la2.a aVar = serializableExtra2 instanceof la2.a ? (la2.a) serializableExtra2 : null;
        if (o9Var == zy2.o9.f559049d) {
            return 81;
        }
        return aVar == la2.a.f399034e ? 303 : 26;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dqk;
    }

    public final java.lang.String i7(boolean z17) {
        java.lang.String m75945x2fec8307;
        int i17;
        int d17 = getD();
        cl0.g gVar = new cl0.g();
        long j17 = this.H;
        java.lang.String str = "";
        gVar.h("source_feedid", j17 != 0 ? pm0.v.u(j17) : "");
        if (!z17 || (i17 = this.I) == 0) {
            gVar.o("comment_scene", d17);
        } else {
            gVar.o("comment_scene", i17);
        }
        gVar.o("ref_commentscene", this.I);
        r45.f96 f96Var = this.f183317x;
        if (f96Var != null && (m75945x2fec8307 = f96Var.m75945x2fec8307(5)) != null) {
            str = m75945x2fec8307;
        }
        gVar.h("poiid", str);
        gVar.o("is_pre_load", this.f183318x0 ? 1 : 0);
        java.lang.String ek6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).ek(this.H, null, this.I);
        if (this.B1 == null || this.C1 == null) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
            r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) pf5.z.f435481a.a(mo55332x76847179).c(zy2.ra.class))).V6();
            java.lang.String str2 = this.B1;
            if (str2 == null) {
                str2 = V6.m75945x2fec8307(1);
            }
            this.B1 = str2;
            java.lang.String str3 = this.C1;
            if (str3 == null) {
                str3 = V6.m75945x2fec8307(2);
            }
            this.C1 = str3;
        }
        gVar.h("finder_context_id", this.B1);
        gVar.h("finder_tab_context_id", this.C1);
        gVar.h("source_session_buffer", ek6);
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        return gVar2;
    }

    @Override // android.app.Activity
    public boolean isDestroyed() {
        return this.f183316w;
    }

    public final float j7(android.content.Context context) {
        int i17;
        if (!this.C) {
            double d17 = this.A1;
            return d17 <= 0.0d ? ym5.x.a(context, 233.0f) : ((float) d17) + ym5.x.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 28.0f);
        }
        int h17 = com.p314xaae8f345.mm.ui.bl.h(context);
        int c17 = com.p314xaae8f345.mm.ui.bl.c(context == null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a : context);
        android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        int i18 = b17.x;
        int i19 = b17.y;
        java.lang.System.nanoTime();
        boolean z17 = com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (z17) {
            i17 = i19 - c17;
        } else {
            if (i19 >= i18) {
                i18 = i19;
            }
            i17 = i18 - c17;
        }
        float f17 = i17;
        float a17 = (f17 - h17) - ym5.x.a(context, 44.0f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderFlutterPOIActivity", "expandContentHeightPx=" + a17 + " realHeight " + f17 + " statusBarSize " + h17);
        return a17;
    }

    public final java.lang.String k7() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("favpoi_");
        r45.f96 f96Var = this.f183317x;
        sb6.append(f96Var != null ? f96Var.m75945x2fec8307(5) : null);
        java.lang.String sb7 = sb6.toString();
        r45.f96 f96Var2 = this.f183317x;
        java.lang.String m75945x2fec8307 = f96Var2 != null ? f96Var2.m75945x2fec8307(5) : null;
        if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0)) {
            return sb7;
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        sb8.append(sb7);
        r45.f96 f96Var3 = this.f183317x;
        if (f96Var3 == null || (str = f96Var3.m75945x2fec8307(3)) == null) {
            str = "";
        }
        sb8.append(str);
        java.lang.String sb9 = sb8.toString();
        java.lang.String stringExtra = getIntent().getStringExtra("kRemark");
        if (stringExtra == null) {
            return sb9;
        }
        return sb9 + stringExtra;
    }

    public final void l7() {
        if (this.f183315v == null) {
            return;
        }
        if (this.D) {
            q7(true);
            return;
        }
        com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.C23936xb436cdb0 o76 = o7();
        if (o76 != null) {
            o76.m88616xf24304a0(ia2.q0.a("onScreenAppear"));
        }
    }

    public void n7(java.lang.String eventId, java.util.Map paramMap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventId, "eventId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paramMap, "paramMap");
        cl0.g gVar = new cl0.g();
        for (java.util.Map.Entry entry : paramMap.entrySet()) {
            gVar.h((java.lang.String) entry.getKey(), entry.getValue());
        }
        com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.C23936xb436cdb0 o76 = o7();
        if (o76 != null) {
            java.lang.String gVar2 = gVar.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
            o76.m88618xd2372033(eventId, gVar2, ia2.s.f371510d);
        }
    }

    public final com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.C23936xb436cdb0 o7() {
        ia2.n0 n0Var = this.f183315v;
        com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.C23936xb436cdb0 c23936xb436cdb0 = n0Var != null ? n0Var.f371489g : null;
        if (c23936xb436cdb0 == null) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            if (z65.c.a()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FinderFlutterPOIActivity", "requireDataReportAPI: null");
                throw new java.lang.RuntimeException("requireDataReportAPI: null");
            }
        }
        return c23936xb436cdb0;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x031a  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r28) {
        /*
            Method dump skipped, instructions count: 1010
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3.onCreate(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        android.view.ViewTreeObserver viewTreeObserver;
        super.onDestroy();
        ia2.n0 n0Var = this.f183315v;
        if (n0Var != null) {
            java.util.Iterator it = ((java.util.LinkedHashMap) n0Var.f371495p).entrySet().iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13879x1453fa95) ((java.util.Map.Entry) it.next()).getValue()).m56132x100e954(n0Var.f371501v);
            }
        }
        this.f183309J = null;
        ((y80.y0) ((z80.k0) i95.n0.c(z80.k0.class))).wi(false);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.rl7);
        if (viewGroup != null && (viewTreeObserver = viewGroup.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.f183321y0);
        }
        this.f183321y0 = null;
        this.f183316w = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.f183315v == null) {
            return;
        }
        if (this.D) {
            q7(false);
            return;
        }
        com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.C23936xb436cdb0 o76 = o7();
        if (o76 != null) {
            o76.m88617xc34f98b8(ia2.q0.a("onScreenDisappear"));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        l7();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity
    public void onStart() {
        android.view.ViewTreeObserver viewTreeObserver;
        super.onStart();
        if (this.f183321y0 == null) {
            this.f183321y0 = new ia2.n(this);
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.rl7);
            if (viewGroup == null || (viewTreeObserver = viewGroup.getViewTreeObserver()) == null) {
                return;
            }
            viewTreeObserver.addOnGlobalLayoutListener(this.f183321y0);
        }
    }

    public final byte[] p7() {
        java.lang.String str;
        r45.c35 c35Var = this.f183320y;
        if (c35Var != null) {
            r45.f96 f96Var = this.f183317x;
            if (f96Var == null || (str = f96Var.m75945x2fec8307(5)) == null) {
                str = "";
            }
            c35Var.set(0, str);
        }
        r45.c35 c35Var2 = this.f183320y;
        if (c35Var2 != null) {
            r45.f96 f96Var2 = this.f183317x;
            c35Var2.set(11, java.lang.Float.valueOf(f96Var2 != null ? f96Var2.m75938x746dc8a6(1) : 0.0f));
        }
        r45.c35 c35Var3 = this.f183320y;
        if (c35Var3 != null) {
            r45.f96 f96Var3 = this.f183317x;
            c35Var3.set(12, java.lang.Float.valueOf(f96Var3 != null ? f96Var3.m75938x746dc8a6(0) : 0.0f));
        }
        r45.c35 c35Var4 = this.f183320y;
        if (c35Var4 != null) {
            return c35Var4.mo14344x5f01b1f6();
        }
        return null;
    }

    public final void q7(boolean z17) {
        if (this.Y == z17) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderFlutterPOIActivity", "setIsExpand: " + z17);
        this.Y = z17;
        com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.C23936xb436cdb0 o76 = o7();
        if (o76 != null) {
            o76.m88620x79885a05(z17, ia2.q0.a("setIsExpand"));
        }
    }
}
