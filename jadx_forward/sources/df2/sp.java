package df2;

/* loaded from: classes3.dex */
public final class sp extends if2.b implements if2.e {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f312886m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f312887n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f312888o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f312889p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ImageView f312890q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f312891r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f312892s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.FrameLayout f312893t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f312894u;

    /* renamed from: v, reason: collision with root package name */
    public int f312895v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f312896w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f312897x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sp(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f312886m = "LivePkgGiftBubbleGuideViewController";
        this.f312895v = 8;
        this.f312896w = jz5.h.b(new df2.jp(this));
        this.f312897x = jz5.h.b(new df2.kp(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean Z6(df2.sp r13, r45.o35 r14) {
        /*
            Method dump skipped, instructions count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.sp.Z6(df2.sp, r45.o35):boolean");
    }

    public static final void a7(df2.sp spVar) {
        df2.ip ipVar;
        p012xc85e97e9.p093xedfae76a.j0 j0Var;
        p012xc85e97e9.p093xedfae76a.j0 j0Var2;
        df2.ip ipVar2 = (df2.ip) spVar.m56789x25fe639c(df2.ip.class);
        if (ipVar2 != null && (j0Var2 = ipVar2.f311953o) != null) {
            j0Var2.mo7808x76db6cb1(null);
        }
        df2.ip ipVar3 = (df2.ip) spVar.m56789x25fe639c(df2.ip.class);
        if (ipVar3 != null && (j0Var = ipVar3.f311954p) != null) {
            j0Var.mo7808x76db6cb1(null);
        }
        android.view.View view = spVar.f312887n;
        java.lang.Object tag = view != null ? view.getTag() : null;
        r45.o35 o35Var = tag instanceof r45.o35 ? (r45.o35) tag : null;
        if (o35Var == null || (ipVar = (df2.ip) spVar.m56789x25fe639c(df2.ip.class)) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ipVar.f311951m, "[onBubbleTouchDismiss] info:" + pm0.b0.g(o35Var));
        ipVar.Z6();
    }

    public final boolean b7(android.view.View view) {
        android.view.View view2 = this.f312887n;
        if (view2 == null) {
            return false;
        }
        android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        int i17 = b17.y;
        int i18 = b17.x;
        int i19 = (!U6() || com.p314xaae8f345.mm.ui.bk.d0()) ? i17 : i18;
        int i27 = (!U6() || com.p314xaae8f345.mm.ui.bk.d0()) ? i18 : i17;
        int[] t17 = pm0.v.t(view);
        int i28 = t17[0];
        if (i28 <= 0 || t17[1] <= 0) {
            return false;
        }
        int width = i28 + view.getWidth();
        int i29 = t17[1];
        float dimension = view2.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        float dimension2 = view2.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        float f17 = (i19 - i29) - dimension;
        float dimension3 = (i27 - width) - view2.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn);
        if (dimension3 >= dimension2) {
            dimension2 = dimension3;
        }
        view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), (int) dimension2, (int) f17);
        android.view.View view3 = this.f312887n;
        android.widget.LinearLayout linearLayout = view3 instanceof android.widget.LinearLayout ? (android.widget.LinearLayout) view3 : null;
        if (linearLayout != null) {
            linearLayout.setGravity(85);
        }
        float width2 = ((i27 - dimension2) - width) + ((view.getWidth() / 2) - (view2.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn) / 2));
        android.view.View view4 = this.f312888o;
        java.lang.Object layoutParams = view4 != null ? view4.getLayoutParams() : null;
        android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.rightMargin = (int) width2;
            android.view.View view5 = this.f312888o;
            if (view5 != null) {
                view5.setLayoutParams(layoutParams2);
            }
        }
        if (zl2.q4.f555466a.E()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f312886m, "targetView = " + view + ",targetViewLoc-x = " + t17[0] + ", screenHeightHardWare = " + i17 + ", screenWidthHardWare = " + i18 + ", targetViewRight = " + width + ", targetViewTop = " + i29 + ", paddingBottom = " + f17 + ", paddingEnd = " + dimension2 + ", ");
        }
        return true;
    }

    public final void c7(java.lang.String str, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f312886m, "[dismiss] scene = " + str);
        android.view.View view = this.f312887n;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/LivePkgGiftBubbleGuideViewController", "dismiss", "(Ljava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/LivePkgGiftBubbleGuideViewController", "dismiss", "(Ljava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (z17) {
            this.f312895v = 8;
        }
    }

    public final int d7(r45.o35 o35Var) {
        java.lang.Object obj;
        int e17 = c01.id.e();
        java.util.LinkedList m75941xfb821914 = o35Var.m75941xfb821914(3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getBatch_list(...)");
        java.util.Iterator it = m75941xfb821914.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            r45.ht3 ht3Var = (r45.ht3) obj;
            if (ht3Var.m75942xfb822ef2(1) > 0 && ht3Var.m75939xb282bd08(2) - e17 > 0) {
                break;
            }
        }
        r45.ht3 ht3Var2 = (r45.ht3) obj;
        if (ht3Var2 == null) {
            return -1;
        }
        int m75939xb282bd08 = (((ht3Var2.m75939xb282bd08(2) - e17) / 60) / 60) / 24;
        if (m75939xb282bd08 < 1) {
            return 1;
        }
        return m75939xb282bd08;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveMsg */
    public void mo14867x5aa1c816(r45.r71 r71Var) {
        android.view.ViewGroup J1;
        android.view.View view;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 c14227x4262fb44;
        super.mo14867x5aa1c816(r71Var);
        if (this.f312895v == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0 ag0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0) R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0.class);
            jz5.f0 f0Var = null;
            if (ag0Var != null && (J1 = ag0Var.J1()) != null) {
                if (!J1.isShown()) {
                    J1 = null;
                }
                if (J1 != null) {
                    if (b7(J1)) {
                        android.view.View view2 = this.f312887n;
                        if (!(view2 != null && view2.getVisibility() == 0)) {
                            df2.a9 a9Var = (df2.a9) m56789x25fe639c(df2.a9.class);
                            if (!((a9Var == null || (c14227x4262fb44 = a9Var.A) == null) ? false : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c14227x4262fb44.mo3195x754a37bb(), java.lang.Boolean.TRUE)) && (view = this.f312887n) != null) {
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                                arrayList.add(0);
                                java.util.Collections.reverse(arrayList);
                                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/LivePkgGiftBubbleGuideViewController", "onLiveMsg", "(Lcom/tencent/mm/protocal/protobuf/FinderGetLiveMsgResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/LivePkgGiftBubbleGuideViewController", "onLiveMsg", "(Lcom/tencent/mm/protocal/protobuf/FinderGetLiveMsgResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                        }
                    } else {
                        c7("onLiveMsg", false);
                    }
                    f0Var = jz5.f0.f384359a;
                }
            }
            if (f0Var == null) {
                c7("onLiveMsg", true);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 c14227x4262fb44;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 c14227x4262fb442;
        p012xc85e97e9.p093xedfae76a.j0 j0Var;
        p012xc85e97e9.p093xedfae76a.j0 j0Var2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f312886m, "[onViewMount]");
        df2.ip ipVar = (df2.ip) m56789x25fe639c(df2.ip.class);
        if (ipVar != null && (j0Var2 = ipVar.f311953o) != null) {
            j0Var2.mo7806x9d92d11c((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) pluginLayout, new df2.mp(this));
        }
        df2.ip ipVar2 = (df2.ip) m56789x25fe639c(df2.ip.class);
        if (ipVar2 != null && (j0Var = ipVar2.f311954p) != null) {
            j0Var.mo7806x9d92d11c((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) pluginLayout, new df2.np(this));
        }
        df2.a9 a9Var = (df2.a9) m56789x25fe639c(df2.a9.class);
        if (a9Var != null && (c14227x4262fb442 = a9Var.A) != null) {
            c14227x4262fb442.f193193d = true;
            c14227x4262fb442.mo7806x9d92d11c((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) pluginLayout, new df2.op(this));
        }
        jf2.k0 k0Var = (jf2.k0) m56789x25fe639c(jf2.k0.class);
        if (k0Var == null || (c14227x4262fb44 = k0Var.f380920v) == null) {
            return;
        }
        c14227x4262fb44.f193193d = true;
        c14227x4262fb44.mo7806x9d92d11c((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) pluginLayout, new df2.pp(this));
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f312887n = null;
        this.f312888o = null;
        this.f312890q = null;
        this.f312889p = null;
        this.f312891r = null;
        this.f312892s = null;
        this.f312893t = null;
        this.f312894u = null;
    }
}
