package df2;

/* loaded from: classes3.dex */
public final class zu extends if2.b implements mf2.q {

    /* renamed from: m, reason: collision with root package name */
    public boolean f313533m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f313534n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zu(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v20, types: [android.view.View] */
    @Override // mf2.q
    public void D3(java.lang.Object panelObject) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14409x611a9ea7 c14409x611a9ea7;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14409x611a9ea7 c14409x611a9ea72;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panelObject, "panelObject");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g gVar = panelObject instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g) panelObject : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.io ioVar = panelObject instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.io ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.io) panelObject : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14409x611a9ea7 c14409x611a9ea73 = panelObject instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14409x611a9ea7 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14409x611a9ea7) panelObject : null;
        if (O6().getResources().getConfiguration().orientation != 2) {
            return;
        }
        if (gVar != null) {
            z17 = gVar.f199917g.f526386t;
        } else if (ioVar != null) {
            z17 = ioVar.I;
        } else if (c14409x611a9ea73 == null) {
            return;
        } else {
            z17 = !c14409x611a9ea73.getUseCenterLandScapeStyle();
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVideoAdjustForPanelController", "Panel opened with newLandscapeStyle=true in landscape mode, adjust video layout");
            android.util.DisplayMetrics displayMetrics = O6().getResources().getDisplayMetrics();
            int i17 = displayMetrics.widthPixels;
            int i18 = displayMetrics.heightPixels;
            if (gVar != null) {
                c14409x611a9ea72 = gVar.f199917g.f526370d;
            } else {
                if (ioVar == null) {
                    if (c14409x611a9ea73 != null) {
                        c14409x611a9ea7 = c14409x611a9ea73;
                        c14409x611a9ea7.getViewTreeObserver().addOnGlobalLayoutListener(new df2.wu(c14409x611a9ea7, this, i17, i18, gVar, ioVar, c14409x611a9ea73, panelObject));
                    }
                    return;
                }
                c14409x611a9ea72 = ioVar.f293560f;
            }
            c14409x611a9ea7 = c14409x611a9ea72;
            c14409x611a9ea7.getViewTreeObserver().addOnGlobalLayoutListener(new df2.wu(c14409x611a9ea7, this, i17, i18, gVar, ioVar, c14409x611a9ea73, panelObject));
        }
    }

    @Override // mf2.q
    public void L1(java.lang.Object panelObject, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panelObject, "panelObject");
    }

    @Override // mf2.q
    public void P3(java.lang.Object panelObject) {
        jz5.f0 f0Var;
        android.view.Window b17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panelObject, "panelObject");
        if (!this.f313533m) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVideoAdjustForPanelController", "onPanelClose, no need to reset video layout");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVideoAdjustForPanelController", "onPanelClose, reset video layout");
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614 Z6 = Z6();
        if (Z6 == null) {
            return;
        }
        if (panelObject instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g) panelObject).f199917g.f526369c;
            if (y1Var != null && (b17 = y1Var.b()) != null) {
                b17.setDimAmount(0.5f);
            }
        } else if (panelObject instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.io) {
            android.view.Window b18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.io) panelObject).b();
            if (b18 != null) {
                b18.setDimAmount(0.5f);
            }
        } else if (panelObject instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14409x611a9ea7) {
            android.view.View view = this.f313534n;
            if (view != null) {
                view.setBackgroundColor(b3.l.m9702x7444d5ad(O6(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560852w5));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVideoAdjustForPanelController", "resetVideoLayout: FinderLiveViewBottomSheetPanel parent background restored to live_half_black_bg");
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVideoAdjustForPanelController", "resetVideoLayout: FinderLiveViewBottomSheetPanel no parent view to restore");
            }
        }
        Z6.animate().scaleX(1.0f).scaleY(1.0f).translationX(0.0f).setDuration(240L).setInterpolator(new android.view.animation.DecelerateInterpolator()).withStartAction(df2.xu.f313338d).withEndAction(new df2.yu(Z6, this)).start();
    }

    public final com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614 Z6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0 ob0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0) R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0.class);
        com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf C1 = ob0Var != null ? ob0Var.C1() : null;
        if (C1 instanceof com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614) {
            return (com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614) C1;
        }
        return null;
    }

    @Override // mf2.q
    public void q4(java.lang.Object panelObject, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panelObject, "panelObject");
    }
}
