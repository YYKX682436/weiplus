package bg2;

/* loaded from: classes2.dex */
public final class o4 extends tc2.c implements tc2.h {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f20351e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewGroup f20352f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.FrameLayout f20353g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.view.MMPAGView f20354h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f20355i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f20356m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f20357n;

    /* renamed from: o, reason: collision with root package name */
    public kotlinx.coroutines.r2 f20358o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.List f20359p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f20360q;

    /* renamed from: r, reason: collision with root package name */
    public long f20361r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(tc2.g store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f20351e = "Finder.LiveConvertTemplateInfoController";
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Hk();
        this.f20355i = true;
        this.f20359p = kz5.p0.f313996d;
    }

    @Override // tc2.h
    public void H0(r45.r71 resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        r45.nw1 nw1Var = (r45.nw1) resp.getCustom(3);
        Y6(nw1Var != null ? (r45.o52) nw1Var.getCustom(28) : null);
        c7(resp.getList(15), false);
    }

    @Override // tc2.c
    public void P6() {
        java.util.LinkedList list;
        java.lang.Object obj;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        tc2.g gVar = this.f417141d;
        in5.s0 s0Var = gVar.f417149i;
        this.f20352f = s0Var != null ? (android.view.ViewGroup) s0Var.p(com.tencent.mm.R.id.r9w) : null;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = gVar.f417148h;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null) ? null : feedObject.getFinderObject();
        r45.kr0 d17 = finderObject != null ? com.tencent.mm.plugin.finder.storage.FinderItem.Companion.d(finderObject) : null;
        if (!(finderObject != null && com.tencent.mm.plugin.finder.storage.FinderItem.Companion.f(finderObject))) {
            android.view.ViewGroup viewGroup = this.f20352f;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
        } else if (d17 != null && (list = d17.getList(12)) != null) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                r45.kz3 kz3Var = (r45.kz3) obj;
                if (kz3Var.getInteger(0) == 8 && ((r45.xf6) kz3Var.getCustom(3)) != null) {
                    break;
                }
            }
            r45.kz3 kz3Var2 = (r45.kz3) obj;
            if (kz3Var2 != null) {
                r45.xf6 xf6Var = (r45.xf6) kz3Var2.getCustom(3);
                java.util.List list2 = xf6Var != null ? xf6Var.getList(0) : null;
                if (list2 == null) {
                    list2 = kz5.p0.f313996d;
                }
                this.f20359p = list2;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("allow lottery type list ");
        sb6.append(this.f20359p);
        sb6.append(" feed ");
        sb6.append(finderObject != null ? finderObject.getNickname() : null);
        com.tencent.mars.xlog.Log.i(this.f20351e, sb6.toString());
        if (!this.f20359p.isEmpty()) {
            in5.s0 s0Var2 = gVar.f417149i;
            this.f20353g = s0Var2 != null ? (android.widget.FrameLayout) s0Var2.p(com.tencent.mm.R.id.r7v) : null;
            android.view.ViewGroup viewGroup2 = this.f20352f;
            if (viewGroup2 != null) {
                viewGroup2.setOnClickListener(new bg2.l4(this));
            }
            Z6();
        }
    }

    @Override // tc2.c
    public void U6() {
        com.tencent.mars.xlog.Log.i(this.f20351e, "onUnFocusFeedCenter");
        a7();
    }

    public final void Y6(r45.o52 o52Var) {
        boolean z17;
        boolean z18 = false;
        if (o52Var != null) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(o52Var.getInteger(0));
            java.lang.Integer[] numArr = {2, 8, 16};
            int i17 = 0;
            while (true) {
                if (i17 >= 3) {
                    z17 = false;
                    break;
                } else {
                    if (kotlin.jvm.internal.o.b(numArr[i17], valueOf)) {
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
        this.f20360q = z18;
    }

    public final void Z6() {
        android.content.Context context;
        if (this.f20355i) {
            com.tencent.mm.view.MMPAGView mMPAGView = this.f20354h;
            tc2.g gVar = this.f417141d;
            java.lang.String str = this.f20351e;
            if (mMPAGView == null) {
                com.tencent.mars.xlog.Log.i(str, "initSmallAnim create smallAnim!");
                in5.s0 s0Var = gVar.f417149i;
                if (s0Var == null || (context = s0Var.f293121e) == null) {
                    context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                }
                kotlin.jvm.internal.o.d(context);
                this.f20354h = new com.tencent.mm.view.MMPAGView(context);
                ym5.l2 l2Var = ym5.l2.f463424a;
                ym5.j2[] j2VarArr = ym5.j2.f463392d;
                com.tencent.mm.view.MMPAGView mMPAGView2 = this.f20354h;
                if (mMPAGView2 != null) {
                    mMPAGView2.o(ae2.in.f3688a.a(ym5.f6.Z1));
                }
            }
            android.widget.FrameLayout frameLayout = this.f20353g;
            boolean z17 = false;
            if (frameLayout != null && frameLayout.indexOfChild(this.f20354h) == -1) {
                z17 = true;
            }
            if (z17) {
                com.tencent.mars.xlog.Log.i(str, "initSmallAnim add smallAnim!");
                com.tencent.mm.view.MMPAGView mMPAGView3 = this.f20354h;
                android.view.ViewParent parent = mMPAGView3 != null ? mMPAGView3.getParent() : null;
                android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(this.f20354h);
                }
                android.widget.FrameLayout frameLayout2 = this.f20353g;
                if (frameLayout2 != null) {
                    frameLayout2.removeAllViews();
                }
                com.tencent.mm.view.MMPAGView mMPAGView4 = this.f20354h;
                if (mMPAGView4 != null) {
                    mMPAGView4.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
                }
                kotlinx.coroutines.y0 y0Var = gVar.f417147g;
                if (y0Var != null) {
                    kotlinx.coroutines.l.d(y0Var, kotlinx.coroutines.q1.f310570c, null, new bg2.j4(this, null), 2, null);
                }
            }
            android.widget.FrameLayout frameLayout3 = this.f20353g;
            if (frameLayout3 != null) {
                ym5.a1.h(frameLayout3, new bg2.k4(this));
            }
        }
    }

    public final void a7() {
        kotlinx.coroutines.r2 r2Var = this.f20358o;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f20354h = null;
        android.widget.FrameLayout frameLayout = this.f20353g;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        android.view.ViewGroup viewGroup = this.f20352f;
        if (viewGroup != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(viewGroup, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertTemplateInfoController", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            viewGroup.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(viewGroup, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertTemplateInfoController", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f20356m = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x012d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0122 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b7(kotlin.coroutines.Continuation r19) {
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
        kotlin.jvm.internal.o.g(resp, "resp");
        r45.nw1 nw1Var = (r45.nw1) resp.getCustom(3);
        Y6(nw1Var != null ? (r45.o52) nw1Var.getCustom(28) : null);
        c7(resp.getList(9), true);
    }
}
