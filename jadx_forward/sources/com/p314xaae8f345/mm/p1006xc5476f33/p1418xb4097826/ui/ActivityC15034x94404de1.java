package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderHomeAffinityUI;", "Lcom/tencent/mm/plugin/finder/ui/FinderHomeUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI */
/* loaded from: classes8.dex */
public final class ActivityC15034x94404de1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15036x1a33c799 {
    public static final /* synthetic */ int D = 0;
    public final jz5.g B = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.q6.f211255d);
    public final jz5.g C = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p6.f211154d);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa
    public void a7(int i17) {
        if (i17 == 1) {
            db5.f.c(this, null);
            m78735x28280f95().d(true);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15036x1a33c799
    public void l7() {
        if (t7() && ((java.lang.Boolean) ((jz5.n) this.C).mo141623x754a37bb()).booleanValue() && !u7()) {
            v7(1);
        } else {
            super.l7();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15036x1a33c799
    public void m7() {
        if (t7() && ((java.lang.Boolean) ((jz5.n) this.C).mo141623x754a37bb()).booleanValue() && !u7()) {
            v7(2);
        } else {
            super.m7();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15036x1a33c799, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1643x4b88b2d8.AbstractActivityC15139x91efb0f1, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15086x1d5b7f69, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.HomeUI", "onCreate: acc has not ready");
            finishAndRemoveTask();
            return;
        }
        super.onCreate(bundle);
        setTaskDescription(new android.app.ActivityManager.TaskDescription(mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cfj), m95.a.a(mo55332x76847179().getResources(), com.p314xaae8f345.mm.R.raw.f79738xec77053e, 3.0f), 0));
        U6();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderHomeAffinityUI);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Rj(this, iy1.a.Finder);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).dk(this, "FinderHomeAffinityUI");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this, be1.r0.f4232x366c91de, 24184);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.r6(this));
        int i17 = ra0.y.f475014g1;
        j75.f Ni = ((en3.v) ((ra0.v) i95.n0.c(ra0.v.class))).Ni();
        if (Ni != null) {
            Ni.B3(new sa0.m(1010));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: onCreateBeforeSetContentView */
    public void mo48758x6c4bab6() {
        if (t7()) {
            setTheme(com.p314xaae8f345.mm.R.C30868x68b1db1.f575742h3);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15036x1a33c799
    public void r7(boolean z17) {
        java.util.List<android.app.ActivityManager.RunningTaskInfo> runningTasks;
        java.lang.String className;
        if (t7() && ((java.lang.Boolean) ((jz5.n) this.C).mo141623x754a37bb()).booleanValue() && !u7()) {
            if (z17) {
                boolean z18 = false;
                try {
                    java.lang.Object systemService = mo55332x76847179().getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
                    java.lang.Object obj = null;
                    android.app.ActivityManager activityManager = systemService instanceof android.app.ActivityManager ? (android.app.ActivityManager) systemService : null;
                    if (activityManager != null && (runningTasks = activityManager.getRunningTasks(10)) != null) {
                        java.util.Iterator<T> it = runningTasks.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            java.lang.Object next = it.next();
                            android.content.ComponentName componentName = ((android.app.ActivityManager.RunningTaskInfo) next).baseActivity;
                            if ((componentName == null || (className = componentName.getClassName()) == null || !className.equals("com.tencent.mm.ui.LauncherUI")) ? false : true) {
                                obj = next;
                                break;
                            }
                        }
                        android.app.ActivityManager.RunningTaskInfo runningTaskInfo = (android.app.ActivityManager.RunningTaskInfo) obj;
                        if (runningTaskInfo != null) {
                            z18 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(runningTaskInfo.topActivity, runningTaskInfo.baseActivity);
                        }
                    }
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.HomeUI", "mainTaskTopIsLauncherUI: ams is dead", th6);
                }
                if (!z18) {
                    v7(-1);
                    return;
                }
            }
            moveTaskToBack(true);
        }
    }

    public final void s7(android.view.ViewGroup viewGroup) {
        int i17;
        android.view.ViewGroup viewGroup2;
        int i18;
        int childCount = viewGroup.getChildCount();
        int i19 = 0;
        while (i19 < childCount) {
            android.view.KeyEvent.Callback childAt = viewGroup.getChildAt(i19);
            if (childAt != null) {
                if (childAt instanceof cw2.da) {
                    ((cw2.da) childAt).p();
                    viewGroup2 = childAt instanceof android.view.ViewGroup ? (android.view.ViewGroup) childAt : null;
                    if (viewGroup2 != null) {
                        int childCount2 = viewGroup2.getChildCount();
                        int i27 = 0;
                        while (i27 < childCount2) {
                            android.view.View childAt2 = viewGroup2.getChildAt(i27);
                            if ((childAt2 instanceof android.view.TextureView) || (childAt2 instanceof android.view.SurfaceView)) {
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                                arrayList.add(4);
                                java.util.Collections.reverse(arrayList);
                                i18 = childCount;
                                yj0.a.d(childAt2, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderHomeAffinityUI", "captureAllRenderView", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                childAt2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                                yj0.a.f(childAt2, "com/tencent/mm/plugin/finder/ui/FinderHomeAffinityUI", "captureAllRenderView", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            } else {
                                i18 = childCount;
                            }
                            i27++;
                            childCount = i18;
                        }
                    }
                } else {
                    i17 = childCount;
                    viewGroup2 = childAt instanceof android.view.ViewGroup ? (android.view.ViewGroup) childAt : null;
                    if (viewGroup2 != null) {
                        s7(viewGroup2);
                    }
                    i19++;
                    childCount = i17;
                }
            }
            i17 = childCount;
            i19++;
            childCount = i17;
        }
    }

    public final boolean t7() {
        return ((java.lang.Boolean) ((jz5.n) this.B).mo141623x754a37bb()).booleanValue();
    }

    public final boolean u7() {
        return (com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A()) && com.p314xaae8f345.mm.ui.bk.v0() && (com.p314xaae8f345.mm.ui.bk.P(this) || (com.p314xaae8f345.mm.ui.bk.O(getContentResolver()) && !isInMultiWindowMode()));
    }

    public final void v7(int i17) {
        pf5.u uVar = pf5.u.f435469a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg ggVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg) uVar.c(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg.class);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "checkPauseFocusVideo: enterFeedId = ".concat(pm0.v.u(ggVar.f216044m)));
        if (ggVar.f216044m == 0) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nb0) uVar.e(zy2.b6.class).c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nb0.class))).c7(ggVar.m158354x19263085());
        }
        android.view.View m78513xc2a54588 = m78513xc2a54588();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m78513xc2a54588, "null cannot be cast to non-null type android.view.ViewGroup");
        s7((android.view.ViewGroup) m78513xc2a54588);
        pm0.v.V(0L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.s6(this, i17));
    }
}
