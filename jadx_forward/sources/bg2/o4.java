package bg2;

/* loaded from: classes2.dex */
public final class o4 extends tc2.c implements tc2.h {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f101884e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewGroup f101885f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.FrameLayout f101886g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f101887h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f101888i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f101889m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f101890n;

    /* renamed from: o, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f101891o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.List f101892p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f101893q;

    /* renamed from: r, reason: collision with root package name */
    public long f101894r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(tc2.g store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f101884e = "Finder.LiveConvertTemplateInfoController";
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Hk();
        this.f101888i = true;
        this.f101892p = kz5.p0.f395529d;
    }

    @Override // tc2.h
    public void H0(r45.r71 resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        r45.nw1 nw1Var = (r45.nw1) resp.m75936x14adae67(3);
        Y6(nw1Var != null ? (r45.o52) nw1Var.m75936x14adae67(28) : null);
        c7(resp.m75941xfb821914(15), false);
    }

    @Override // tc2.c
    public void P6() {
        java.util.LinkedList m75941xfb821914;
        java.lang.Object obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        tc2.g gVar = this.f498674d;
        in5.s0 s0Var = gVar.f498682i;
        this.f101885f = s0Var != null ? (android.view.ViewGroup) s0Var.p(com.p314xaae8f345.mm.R.id.r9w) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = gVar.f498681h;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 m59240x7c94657b = (abstractC14490x69736cb5 == null || (feedObject = abstractC14490x69736cb5.getFeedObject()) == null) ? null : feedObject.m59240x7c94657b();
        r45.kr0 d17 = m59240x7c94657b != null ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.d(m59240x7c94657b) : null;
        if (!(m59240x7c94657b != null && com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.f(m59240x7c94657b))) {
            android.view.ViewGroup viewGroup = this.f101885f;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
        } else if (d17 != null && (m75941xfb821914 = d17.m75941xfb821914(12)) != null) {
            java.util.Iterator it = m75941xfb821914.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                r45.kz3 kz3Var = (r45.kz3) obj;
                if (kz3Var.m75939xb282bd08(0) == 8 && ((r45.xf6) kz3Var.m75936x14adae67(3)) != null) {
                    break;
                }
            }
            r45.kz3 kz3Var2 = (r45.kz3) obj;
            if (kz3Var2 != null) {
                r45.xf6 xf6Var = (r45.xf6) kz3Var2.m75936x14adae67(3);
                java.util.List m75941xfb8219142 = xf6Var != null ? xf6Var.m75941xfb821914(0) : null;
                if (m75941xfb8219142 == null) {
                    m75941xfb8219142 = kz5.p0.f395529d;
                }
                this.f101892p = m75941xfb8219142;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("allow lottery type list ");
        sb6.append(this.f101892p);
        sb6.append(" feed ");
        sb6.append(m59240x7c94657b != null ? m59240x7c94657b.m76801x8010e5e4() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f101884e, sb6.toString());
        if (!this.f101892p.isEmpty()) {
            in5.s0 s0Var2 = gVar.f498682i;
            this.f101886g = s0Var2 != null ? (android.widget.FrameLayout) s0Var2.p(com.p314xaae8f345.mm.R.id.r7v) : null;
            android.view.ViewGroup viewGroup2 = this.f101885f;
            if (viewGroup2 != null) {
                viewGroup2.setOnClickListener(new bg2.l4(this));
            }
            Z6();
        }
    }

    @Override // tc2.c
    public void U6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f101884e, "onUnFocusFeedCenter");
        a7();
    }

    public final void Y6(r45.o52 o52Var) {
        boolean z17;
        boolean z18 = false;
        if (o52Var != null) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(o52Var.m75939xb282bd08(0));
            java.lang.Integer[] numArr = {2, 8, 16};
            int i17 = 0;
            while (true) {
                if (i17 >= 3) {
                    z17 = false;
                    break;
                } else {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(numArr[i17], valueOf)) {
                        z17 = true;
                        break;
                    }
                    i17++;
                }
            }
            if (z17) {
                z18 = true;
            }
        }
        this.f101893q = z18;
    }

    public final void Z6() {
        android.content.Context context;
        if (this.f101888i) {
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f101887h;
            tc2.g gVar = this.f498674d;
            java.lang.String str = this.f101884e;
            if (c22789xd23e9a9b == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "initSmallAnim create smallAnim!");
                in5.s0 s0Var = gVar.f498682i;
                if (s0Var == null || (context = s0Var.f374654e) == null) {
                    context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
                this.f101887h = new com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b(context);
                ym5.l2 l2Var = ym5.l2.f544957a;
                ym5.j2[] j2VarArr = ym5.j2.f544925d;
                com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2 = this.f101887h;
                if (c22789xd23e9a9b2 != null) {
                    c22789xd23e9a9b2.o(ae2.in.f85221a.a(ym5.f6.Z1));
                }
            }
            android.widget.FrameLayout frameLayout = this.f101886g;
            boolean z17 = false;
            if (frameLayout != null && frameLayout.indexOfChild(this.f101887h) == -1) {
                z17 = true;
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "initSmallAnim add smallAnim!");
                com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b3 = this.f101887h;
                android.view.ViewParent parent = c22789xd23e9a9b3 != null ? c22789xd23e9a9b3.getParent() : null;
                android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(this.f101887h);
                }
                android.widget.FrameLayout frameLayout2 = this.f101886g;
                if (frameLayout2 != null) {
                    frameLayout2.removeAllViews();
                }
                com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b4 = this.f101887h;
                if (c22789xd23e9a9b4 != null) {
                    c22789xd23e9a9b4.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
                }
                p3325xe03a0797.p3326xc267989b.y0 y0Var = gVar.f498680g;
                if (y0Var != null) {
                    p3325xe03a0797.p3326xc267989b.l.d(y0Var, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new bg2.j4(this, null), 2, null);
                }
            }
            android.widget.FrameLayout frameLayout3 = this.f101886g;
            if (frameLayout3 != null) {
                ym5.a1.h(frameLayout3, new bg2.k4(this));
            }
        }
    }

    public final void a7() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f101891o;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f101887h = null;
        android.widget.FrameLayout frameLayout = this.f101886g;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        android.view.ViewGroup viewGroup = this.f101885f;
        if (viewGroup != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(viewGroup, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertTemplateInfoController", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            viewGroup.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(viewGroup, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertTemplateInfoController", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f101889m = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x012d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0122 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b7(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r19) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.o4.b7(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c7(java.util.LinkedList r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 653
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.o4.c7(java.util.LinkedList, boolean):void");
    }

    @Override // tc2.h
    public void d4(r45.hc1 resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        r45.nw1 nw1Var = (r45.nw1) resp.m75936x14adae67(3);
        Y6(nw1Var != null ? (r45.o52) nw1Var.m75936x14adae67(28) : null);
        c7(resp.m75941xfb821914(9), true);
    }
}
