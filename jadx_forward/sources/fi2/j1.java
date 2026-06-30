package fi2;

/* loaded from: classes10.dex */
public final class j1 extends fi2.a {

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 f344381c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f344382d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f344383e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f344384f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f344385g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f344386h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f344387i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f344388j;

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f344389k;

    /* renamed from: l, reason: collision with root package name */
    public final jz5.g f344390l;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f344391m;

    /* renamed from: n, reason: collision with root package name */
    public int f344392n;

    /* renamed from: o, reason: collision with root package name */
    public int f344393o;

    /* renamed from: p, reason: collision with root package name */
    public int f344394p;

    /* renamed from: q, reason: collision with root package name */
    public int f344395q;

    /* renamed from: r, reason: collision with root package name */
    public int f344396r;

    /* renamed from: s, reason: collision with root package name */
    public int f344397s;

    /* renamed from: t, reason: collision with root package name */
    public int f344398t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f344399u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f344400v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f344401w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(zi2.w plugin) {
        super(plugin);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(plugin, "plugin");
        this.f344383e = jz5.h.b(new fi2.i1(plugin));
        this.f344384f = jz5.h.b(new fi2.h1(plugin));
        this.f344385g = jz5.h.b(new fi2.g1(plugin));
        this.f344386h = jz5.h.b(new fi2.a1(plugin));
        this.f344387i = jz5.h.b(new fi2.b1(plugin));
        this.f344388j = jz5.h.b(new fi2.f1(plugin));
        this.f344389k = jz5.h.b(new fi2.d1(plugin));
        this.f344390l = jz5.h.b(new fi2.c1(plugin));
        this.f344391m = jz5.h.b(new fi2.e1(this));
        this.f344395q = -1;
        this.f344396r = -1;
        this.f344397s = -1;
        this.f344398t = -1;
        pm0.v.X(new fi2.z0(this, plugin));
    }

    public final fi2.w B() {
        return (fi2.w) ((jz5.n) this.f344390l).mo141623x754a37bb();
    }

    public final void C() {
        android.view.View findViewById;
        zi2.w wVar = this.f344334a;
        qo0.c cVar = wVar.f554686p;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = cVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) cVar : null;
        android.view.View findViewById2 = k0Var != null ? k0Var.findViewById(com.p314xaae8f345.mm.R.id.qs9) : null;
        if (findViewById2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/core/VoiceRoomCoverLogicCore", "initVoiceRoom", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/mic/core/VoiceRoomCoverLogicCore", "initVoiceRoom", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        c50.s0 s0Var = (c50.s0) i95.n0.c(c50.s0.class);
        qo0.c cVar2 = wVar.f554686p;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var2 = cVar2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) cVar2 : null;
        if (k0Var2 != null && (findViewById = k0Var2.findViewById(com.p314xaae8f345.mm.R.id.fh8)) != null) {
            if (((pg2.j0) s0Var).wh()) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(java.lang.Float.valueOf(0.0f));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/core/VoiceRoomCoverLogicCore", "initVoiceRoom", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                findViewById.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/mic/core/VoiceRoomCoverLogicCore", "initVoiceRoom", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            } else {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/mic/core/VoiceRoomCoverLogicCore", "initVoiceRoom", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/mic/core/VoiceRoomCoverLogicCore", "initVoiceRoom", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        A(0);
    }

    public final boolean D() {
        int i17 = this.f344393o;
        return (i17 == 0 && this.f344392n == 4) || (i17 == 2 && this.f344394p == 16);
    }

    @Override // fi2.m
    public android.view.View a() {
        return this.f344382d;
    }

    @Override // fi2.m
    public void b(boolean z17) {
        android.widget.LinearLayout chatContentLayout;
        android.widget.LinearLayout contentLayout;
        int i17 = 0;
        if (this.f344393o == 2 && this.f344394p == 8) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 c14245x86828950 = this.f344381c;
            if (c14245x86828950 != null && (contentLayout = c14245x86828950.getContentLayout()) != null) {
                int childCount = contentLayout.getChildCount();
                int i18 = 0;
                while (true) {
                    if (i18 >= childCount) {
                        break;
                    }
                    android.view.View childAt = contentLayout.getChildAt(i18);
                    oj2.c cVar = childAt instanceof oj2.c ? (oj2.c) childAt : null;
                    if (cVar != null) {
                        cVar.a0(z17);
                        break;
                    }
                    i18++;
                }
            }
            mh2.n0 f17 = B().f();
            if (f17 != null) {
                int childCount2 = f17.getChildCount();
                while (i17 < childCount2) {
                    android.view.View childAt2 = f17.getChildAt(i17);
                    qh2.d dVar = childAt2 instanceof qh2.d ? (qh2.d) childAt2 : null;
                    if (dVar != null) {
                        dVar.a0(z17);
                    }
                    i17++;
                }
                return;
            }
            return;
        }
        if (!D()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 c14245x868289502 = this.f344381c;
            if (c14245x868289502 != null) {
                int childCount3 = c14245x868289502.getChildCount();
                while (i17 < childCount3) {
                    android.view.View childAt3 = c14245x868289502.getChildAt(i17);
                    oj2.c cVar2 = childAt3 instanceof oj2.c ? (oj2.c) childAt3 : null;
                    if (cVar2 != null) {
                        cVar2.a0(z17);
                        return;
                    }
                    i17++;
                }
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 c14245x868289503 = this.f344381c;
        if (c14245x868289503 == null || (chatContentLayout = c14245x868289503.getChatContentLayout()) == null) {
            return;
        }
        int childCount4 = chatContentLayout.getChildCount();
        while (i17 < childCount4) {
            android.view.View childAt4 = chatContentLayout.getChildAt(i17);
            oj2.c cVar3 = childAt4 instanceof oj2.c ? (oj2.c) childAt4 : null;
            if (cVar3 != null) {
                cVar3.a0(z17);
                return;
            }
            i17++;
        }
    }

    @Override // fi2.m
    public void e(xh2.a micCoverData) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micCoverData, "micCoverData");
        ni2.k2 k2Var = (ni2.k2) ((jz5.n) this.f344383e).mo141623x754a37bb();
        k2Var.getClass();
        fj2.s sVar = fj2.s.f344716a;
        ml2.w4 w4Var = ml2.w4.f409721f;
        km2.q qVar = micCoverData.f536053a;
        if (qVar == null || (str = qVar.f390705c) == null) {
            str = "";
        }
        fj2.s.h(sVar, w4Var, str, 0, 0, 12, null);
        k2Var.f418895d = micCoverData;
        gk2.e eVar = k2Var.f418893b;
        k2Var.f418896e = ((mm2.y2) eVar.a(mm2.y2.class)).R6(micCoverData.f536054b.f536086e);
        if (((mm2.e1) eVar.a(mm2.e1.class)).b7() || ((mm2.e1) eVar.a(mm2.e1.class)).Z6()) {
            k2Var.a();
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = k2Var.f418897f;
        k0Var.q(k2Var.f418892a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lzj, java.lang.Integer.valueOf(micCoverData.f536054b.f536086e)), 17);
        k0Var.v();
    }

    @Override // fi2.m
    public void f(java.lang.String str) {
    }

    @Override // fi2.a, fi2.m
    public void g(java.lang.String str, boolean z17, int i17, int i18) {
        android.graphics.PointF pointF;
        android.view.View findViewById;
        java.lang.String str2 = this.f344335b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "showKtvSelfSendFlower: giftThumbUrl=" + str + ", isLongClick=" + z17 + ", startX=" + i17 + ", startY=" + i18);
        if (this.f344381c != null) {
            zi2.w wVar = this.f344334a;
            int b17 = i65.a.b(wVar.f446856d.getContext(), 32);
            android.widget.ImageView imageView = new android.widget.ImageView(wVar.f446856d.getContext());
            imageView.setLayoutParams(new android.view.ViewGroup.LayoutParams(b17, b17));
            ((wo0.b) new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb()).a(new mn2.q3(str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f))).c(imageView);
            android.graphics.PointF pointF2 = new android.graphics.PointF(i17, i18);
            fi2.w B = B();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 c14245x86828950 = this.f344381c;
            B.getClass();
            if (c14245x86828950 == null || (findViewById = c14245x86828950.findViewById(com.p314xaae8f345.mm.R.id.qrn)) == null) {
                pointF = null;
            } else {
                findViewById.getLocationOnScreen(new int[2]);
                pointF = new android.graphics.PointF((r12[0] + (findViewById.getWidth() / 2.0f)) - (b17 / 2.0f), r12[1] + (findViewById.getHeight() / 2.0f));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "showKtvSelfSendFlower: startPoint=" + pointF2 + ", endPoint=" + pointF);
            long j17 = z17 ? 500L : 1650L;
            if (pointF != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "showKtvSelfSendFlower: starting animation from " + pointF2 + " to " + pointF + ", duration=" + j17);
                ((tg2.g) ((jz5.n) this.f344391m).mo141623x754a37bb()).d(imageView, pointF2, pointF, j17);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0029, code lost:
    
        if (((p3325xe03a0797.p3326xc267989b.a) r1).a() == true) goto L8;
     */
    @Override // fi2.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h() {
        /*
            r9 = this;
            r9.C()
            fi2.w r0 = r9.B()
            jz5.g r1 = r0.f344452e
            jz5.n r1 = (jz5.n) r1
            java.lang.Object r1 = r1.mo141623x754a37bb()
            mh2.k r1 = (mh2.k) r1
            r1.c()
            mh2.k0 r1 = r0.m()
            r1.g()
            r0.o()
            kotlinx.coroutines.r2 r1 = r0.f344454g
            if (r1 == 0) goto L2c
            kotlinx.coroutines.a r1 = (p3325xe03a0797.p3326xc267989b.a) r1
            boolean r1 = r1.a()
            r2 = 1
            if (r1 != r2) goto L2c
            goto L2d
        L2c:
            r2 = 0
        L2d:
            if (r2 == 0) goto L30
            goto L44
        L30:
            kotlinx.coroutines.y0 r3 = r0.a()
            r4 = 0
            r5 = 0
            fi2.o r6 = new fi2.o
            r1 = 0
            r6.<init>(r0, r1)
            r7 = 3
            r8 = 0
            kotlinx.coroutines.r2 r1 = p3325xe03a0797.p3326xc267989b.l.d(r3, r4, r5, r6, r7, r8)
            r0.f344454g = r1
        L44:
            jz5.g r0 = r9.f344387i
            jz5.n r0 = (jz5.n) r0
            java.lang.Object r0 = r0.mo141623x754a37bb()
            fi2.d r0 = (fi2.d) r0
            zi2.w r1 = r0.f344344a
            java.lang.Class<mm2.y2> r2 = mm2.y2.class
            androidx.lifecycle.c1 r3 = r1.P0(r2)
            mm2.y2 r3 = (mm2.y2) r3
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData r3 = r3.B
            fi2.c r4 = new fi2.c
            r4.<init>(r0)
            r3.mo7806x9d92d11c(r1, r4)
            androidx.lifecycle.c1 r1 = r1.P0(r2)
            mm2.y2 r1 = (mm2.y2) r1
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData r1 = r1.B
            java.lang.Object r1 = r1.mo3195x754a37bb()
            xh2.e r1 = (xh2.e) r1
            if (r1 == 0) goto L79
            ci2.d r0 = r0.d()
            r0.b(r1)
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fi2.j1.h():void");
    }

    @Override // fi2.m
    public void i(java.lang.String userId, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userId, "userId");
    }

    @Override // fi2.m
    public android.view.View j() {
        return this.f344400v;
    }

    @Override // fi2.m
    public android.view.View k() {
        return this.f344381c;
    }

    @Override // fi2.m
    public android.view.View m() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 c14245x86828950 = this.f344381c;
        if (c14245x86828950 != null) {
            return c14245x86828950.getBottomLinkSpace();
        }
        return null;
    }

    @Override // fi2.m
    public void n(boolean z17, boolean z18) {
    }

    @Override // fi2.m
    public android.widget.ImageView o() {
        android.widget.ImageView imageView;
        android.view.View view = this.f344382d;
        if (view == null || (imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.f567544qv3)) == null) {
            return null;
        }
        imageView.setTranslationY(i65.a.b(imageView.getContext(), 402) - (com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y / 2.0f));
        return imageView;
    }

    @Override // fi2.m
    public android.view.ViewGroup p() {
        return this.f344381c;
    }

    @Override // fi2.a, fi2.m
    public void q(int i17, java.lang.String str) {
        android.graphics.PointF pointF;
        android.view.View findViewById;
        android.view.View findViewById2;
        android.widget.LinearLayout contentLayout;
        android.view.View childAt;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f344335b, "notifyKtvSendFlower fromUserIndex: " + i17);
        if (this.f344381c != null) {
            zi2.w wVar = this.f344334a;
            int b17 = i65.a.b(wVar.f446856d.getContext(), 32);
            android.widget.ImageView imageView = new android.widget.ImageView(wVar.f446856d.getContext());
            imageView.setLayoutParams(new android.view.ViewGroup.LayoutParams(b17, b17));
            ((wo0.b) new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb()).a(new mn2.q3(str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f))).c(imageView);
            fi2.w B = B();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 c14245x86828950 = this.f344381c;
            B.getClass();
            android.graphics.PointF pointF2 = null;
            if (c14245x86828950 != null && (contentLayout = c14245x86828950.getContentLayout()) != null && (childAt = contentLayout.getChildAt(i17)) != null) {
                childAt.getLocationOnScreen(new int[2]);
                pointF = new android.graphics.PointF(r0[0] + (childAt.getWidth() / 2.0f), r0[1]);
            } else if (c14245x86828950 == null || (findViewById = c14245x86828950.findViewById(com.p314xaae8f345.mm.R.id.qrn)) == null) {
                pointF = null;
            } else {
                findViewById.getLocationOnScreen(new int[2]);
                pointF = new android.graphics.PointF(c14245x86828950.getWidth(), r9[1] + i65.a.f(c14245x86828950.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561254yt));
            }
            fi2.w B2 = B();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 c14245x868289502 = this.f344381c;
            B2.getClass();
            if (c14245x868289502 != null && (findViewById2 = c14245x868289502.findViewById(com.p314xaae8f345.mm.R.id.qrn)) != null) {
                findViewById2.getLocationOnScreen(new int[2]);
                pointF2 = new android.graphics.PointF(r4[0] + findViewById2.getWidth(), (r4[1] + (findViewById2.getHeight() / 2.0f)) - (b17 / 2.0f));
            }
            if (pointF == null || pointF2 == null) {
                return;
            }
            jz5.g gVar = this.f344391m;
            if (i17 != -1) {
                tg2.g gVar2 = (tg2.g) ((jz5.n) gVar).mo141623x754a37bb();
                android.view.animation.PathInterpolator pathInterpolator = tg2.g.f500706b;
                gVar2.d(imageView, pointF, pointF2, 1650L);
            } else {
                tg2.g gVar3 = (tg2.g) ((jz5.n) gVar).mo141623x754a37bb();
                gVar3.getClass();
                gVar3.b(imageView, pointF, new tg2.e(imageView, pointF, gVar3, pointF2));
            }
        }
    }

    @Override // fi2.m
    public void r() {
    }

    @Override // fi2.m
    public android.view.View s() {
        android.view.View findViewById;
        android.view.View view = this.f344382d;
        if (view == null || (findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.ewf)) == null) {
            return null;
        }
        findViewById.setTranslationY(i65.a.b(findViewById.getContext(), 402) - (com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y / 2.0f));
        return findViewById;
    }

    @Override // fi2.m
    /* renamed from: statusChange */
    public void mo129590x60d69242(qo0.b status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
    }

    @Override // fi2.a, fi2.m
    public java.util.ArrayList t() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 c14245x86828950;
        android.widget.LinearLayout chatContentLayout;
        android.widget.LinearLayout contentLayout;
        java.util.ArrayList t17 = super.t();
        int i17 = 0;
        if (this.f344393o == 2 && this.f344394p == 8) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 c14245x868289502 = this.f344381c;
            if (c14245x868289502 != null && (contentLayout = c14245x868289502.getContentLayout()) != null) {
                int childCount = contentLayout.getChildCount();
                for (int i18 = 0; i18 < childCount; i18++) {
                    android.view.View childAt = contentLayout.getChildAt(i18);
                    if (childAt instanceof wj2.w) {
                        t17.add(childAt);
                    }
                }
            }
            mh2.n0 f17 = B().f();
            if (f17 != null) {
                int childCount2 = f17.getChildCount();
                while (i17 < childCount2) {
                    android.view.View childAt2 = f17.getChildAt(i17);
                    if (childAt2 instanceof wj2.w) {
                        t17.add(childAt2);
                    }
                    i17++;
                }
            }
        } else if (D() && (c14245x86828950 = this.f344381c) != null && (chatContentLayout = c14245x86828950.getChatContentLayout()) != null) {
            int childCount3 = chatContentLayout.getChildCount();
            while (i17 < childCount3) {
                android.view.View childAt3 = chatContentLayout.getChildAt(i17);
                if (childAt3 instanceof wj2.w) {
                    t17.add(childAt3);
                }
                i17++;
            }
        }
        return t17;
    }

    @Override // fi2.m
    public void u(r45.xn1 contact) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
    }

    @Override // fi2.m
    public android.view.View v() {
        android.view.View view = this.f344382d;
        if (view != null) {
            return view.findViewById(com.p314xaae8f345.mm.R.id.r1o);
        }
        return null;
    }

    @Override // fi2.m
    public void w(java.util.LinkedHashMap linkedHashMap, xh2.b bVar) {
        java.util.LinkedList linkedList;
        this.f344392n = bVar != null ? bVar.f536059e : 0;
        this.f344393o = bVar != null ? bVar.f536060f : 0;
        this.f344394p = bVar != null ? bVar.f536061g : 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onMicUserChanged liveMode: ");
        sb6.append(this.f344393o);
        sb6.append(" liveSubMode: ");
        sb6.append(this.f344394p);
        sb6.append(" voiceMode: ");
        sb6.append(this.f344392n);
        sb6.append(" size: ");
        sb6.append((bVar == null || (linkedList = bVar.f536063i) == null) ? null : java.lang.Integer.valueOf(linkedList.size()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f344335b, sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 c14245x86828950 = this.f344381c;
        if (bVar != null && c14245x86828950 != null && (this.f344392n != 0 || this.f344393o != 0)) {
            gi2.e eVar = this.f344393o == 2 && this.f344394p == 8 ? (gi2.e) ((jz5.n) this.f344389k).mo141623x754a37bb() : D() ? (gi2.e) ((jz5.n) this.f344386h).mo141623x754a37bb() : (this.f344392n == 2 || this.f344394p == 2) ? (gi2.e) ((jz5.n) this.f344385g).mo141623x754a37bb() : (gi2.e) ((jz5.n) this.f344384f).mo141623x754a37bb();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 c14245x868289502 = this.f344381c;
            if (c14245x868289502 != null) {
                c14245x868289502.m56838x6cab2c8d(eVar);
            }
            eVar.j(bVar.f536063i, bVar.f536057c);
            A(0);
        }
        if (bVar != null && this.f344398t == bVar.f536059e) {
            if ((bVar != null && this.f344397s == bVar.f536058d) && this.f344395q == this.f344393o && this.f344396r == this.f344394p) {
                return;
            }
        }
        this.f344397s = bVar != null ? bVar.f536058d : 0;
        this.f344398t = bVar != null ? bVar.f536059e : 0;
        this.f344395q = this.f344393o;
        this.f344396r = this.f344394p;
        zi2.w wVar = this.f344334a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 c14245x868289503 = this.f344381c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l.b1(wVar, c14245x868289503 != null ? c14245x868289503.getBottomLinkSpace() : null, this.f344335b, false, 4, null);
    }

    @Override // fi2.m
    public void x(java.lang.String userName) {
        java.util.LinkedList linkedList;
        java.lang.Object obj;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        xh2.b bVar = ((mm2.y2) this.f344334a.P0(mm2.y2.class)).f411098r;
        if (bVar == null || (linkedList = bVar.f536063i) == null) {
            return;
        }
        synchronized (linkedList) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                km2.q qVar = ((xh2.a) next).f536053a;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(qVar != null ? qVar.f390705c : null, userName)) {
                    obj = next;
                    break;
                }
            }
        }
        xh2.a aVar = (xh2.a) obj;
        if (aVar != null) {
            ni2.p2 p2Var = (ni2.p2) ((jz5.n) this.f344388j).mo141623x754a37bb();
            p2Var.getClass();
            p2Var.f418951d = aVar;
            p2Var.f418952e = ((mm2.y2) p2Var.f418949b.a(mm2.y2.class)).R6(aVar.f536054b.f536086e);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = p2Var.f418953f;
            k0Var.q(p2Var.f418948a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lzk, java.lang.Integer.valueOf(aVar.f536054b.f536086e)), 17);
            k0Var.v();
            fj2.s sVar = fj2.s.f344716a;
            ml2.w4 w4Var = ml2.w4.f409721f;
            km2.q qVar2 = aVar.f536053a;
            if (qVar2 == null || (str = qVar2.f390705c) == null) {
                str = "";
            }
            fj2.s.h(sVar, w4Var, str, 0, 0, 12, null);
        }
    }

    @Override // fi2.a
    public java.lang.String z() {
        return "VoiceRoomCoverLogicCore: " + hashCode();
    }
}
