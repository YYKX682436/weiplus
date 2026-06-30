package df2;

/* loaded from: classes3.dex */
public final class t2 extends if2.b implements mf2.c, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.s6 {

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.r6 f312929m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f312930n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f312931o;

    /* renamed from: p, reason: collision with root package name */
    public if2.d0 f312932p;

    /* renamed from: q, reason: collision with root package name */
    public df2.a3 f312933q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f312934r;

    /* renamed from: s, reason: collision with root package name */
    public df2.l2 f312935s;

    /* renamed from: t, reason: collision with root package name */
    public df2.m2 f312936t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.Boolean f312937u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f312938v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f312935s = df2.l2.f312155d;
        this.f312936t = df2.m2.f312278d;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0132 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void g7(df2.t2 r8, java.util.List r9, boolean r10, int r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.t2.g7(df2.t2, java.util.List, boolean, int, java.lang.Object):void");
    }

    @Override // mf2.c
    public void M2(xh2.b micInfoData) {
        df2.m2 m2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micInfoData, "micInfoData");
        if (e7()) {
            m2Var = df2.m2.f312280f;
        } else {
            m2Var = ((mm2.o4) m56788xbba4bfc0(mm2.o4.class)).E7() || ((mm2.o4) m56788xbba4bfc0(mm2.o4.class)).F7() ? df2.m2.f312279e : df2.m2.f312278d;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicCenterController", "onMicInfoChanged, oldState=" + this.f312936t + ", newState=" + m2Var);
        if (m2Var == this.f312936t) {
            return;
        }
        this.f312936t = m2Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicCenterController", "onMicInfoChanged, currentMicState=" + this.f312936t);
        int ordinal = this.f312936t.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            Z6(true);
        } else {
            if (ordinal != 2) {
                return;
            }
            a7(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z6(boolean r26) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.t2.Z6(boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x017a, code lost:
    
        if (r5 == null) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x024d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a7(boolean r28) {
        /*
            Method dump skipped, instructions count: 894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.t2.a7(boolean):void");
    }

    public final void b7() {
        android.view.View view;
        if2.d0 d0Var = this.f312932p;
        if (d0Var != null) {
            d0Var.a(8);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.r6 r6Var = this.f312929m;
        if (r6Var != null && (view = r6Var.f198164a) != null) {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = -2;
            view.setLayoutParams(layoutParams);
        }
        f7();
        android.view.View view2 = this.f312930n;
        if (view2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/FinderLiveMicCenterController", "finalizeDismiss", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/controller/FinderLiveMicCenterController", "finalizeDismiss", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view3 = this.f312931o;
        if (view3 == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/FinderLiveMicCenterController", "finalizeDismiss", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/controller/FinderLiveMicCenterController", "finalizeDismiss", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final km2.q c7() {
        java.lang.Object obj;
        java.util.List list = ((mm2.o4) m56788xbba4bfc0(mm2.o4.class)).f410860v;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-audienceLinkMicUserList>(...)");
        synchronized (list) {
            java.util.Iterator it = list.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                km2.q qVar = (km2.q) next;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(qVar != null ? qVar.f390703a : null, ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).m8())) {
                    obj = next;
                    break;
                }
            }
        }
        return (km2.q) obj;
    }

    public final int d7() {
        km2.q c76 = c7();
        if (c76 != null) {
            return c76.f390724v;
        }
        return 0;
    }

    public final boolean e7() {
        return ((mm2.o4) m56788xbba4bfc0(mm2.o4.class)).G7() && c7() != null;
    }

    public final void f7() {
        android.view.ViewGroup viewGroup;
        if (this.f312934r && (viewGroup = (android.view.ViewGroup) S6(com.p314xaae8f345.mm.R.id.tp9)) != null) {
            android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            layoutParams.height = -2;
            viewGroup.setLayoutParams(layoutParams);
            this.f312934r = false;
        }
    }

    @Override // mf2.c
    public void j2() {
        if (!e7()) {
            this.f312938v = false;
            return;
        }
        boolean z17 = pm0.v.z(d7(), 16);
        if (this.f312938v != z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicCenterController", "notifyOtherMicUserVolumeChange, mute by anchor changed: " + this.f312938v + " -> " + z17);
            this.f312938v = z17;
            g7(this, kz5.b0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.n6.f198049d), false, 2, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicCenterController", "onViewMount");
        this.f312930n = S6(com.p314xaae8f345.mm.R.id.fox);
        this.f312931o = S6(com.p314xaae8f345.mm.R.id.fow);
        this.f372636i = new df2.p2(this);
        ((mm2.o4) m56788xbba4bfc0(mm2.o4.class)).A.mo7806x9d92d11c((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) pluginLayout, new df2.q2(this));
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicCenterController", "onViewUnmount");
        df2.a3 a3Var = this.f312933q;
        if (a3Var != null) {
            a3Var.b();
        }
        this.f312935s = df2.l2.f312155d;
        f7();
        Z6(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.r6 r6Var = this.f312929m;
        if (r6Var != null) {
            android.animation.ValueAnimator valueAnimator = r6Var.f198179p;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            r6Var.f198179p = null;
            android.animation.ValueAnimator valueAnimator2 = r6Var.f198180q;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            r6Var.f198180q = null;
            android.animation.ValueAnimator valueAnimator3 = r6Var.f198181r;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
            }
            r6Var.f198181r = null;
            android.animation.ValueAnimator valueAnimator4 = r6Var.f198182s;
            if (valueAnimator4 != null) {
                valueAnimator4.cancel();
            }
            r6Var.f198182s = null;
            android.animation.ValueAnimator valueAnimator5 = r6Var.f198183t;
            if (valueAnimator5 != null) {
                valueAnimator5.cancel();
            }
            r6Var.f198183t = null;
        }
        this.f312929m = null;
        this.f312932p = null;
        this.f312933q = null;
        this.f312930n = null;
        this.f312931o = null;
    }
}
