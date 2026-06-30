package df2;

/* loaded from: classes3.dex */
public final class p3 extends if2.b implements mf2.q, mf2.c {

    /* renamed from: m, reason: collision with root package name */
    public rh0.d0 f312562m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f312563n;

    /* renamed from: o, reason: collision with root package name */
    public float f312564o;

    /* renamed from: p, reason: collision with root package name */
    public int f312565p;

    /* renamed from: q, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f312566q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f312563n = "";
    }

    public static final android.graphics.RectF[] Z6(df2.p3 p3Var, android.graphics.RectF[] rectFArr, int i17, int i18) {
        jz5.f0 f0Var;
        p3Var.getClass();
        android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        int i19 = b17.x;
        int i27 = b17.y;
        java.lang.System.nanoTime();
        boolean z17 = com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (!z17) {
            if (i27 >= i19) {
                i19 = i27;
            }
            i27 = i19;
        }
        float f17 = i27 / i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRenderController", "scaleRate: " + f17);
        if (rectFArr != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(rectFArr.length);
            for (android.graphics.RectF rectF : rectFArr) {
                if (rectF != null) {
                    rectF.left *= f17;
                    rectF.top *= f17;
                    rectF.bottom *= f17;
                    rectF.right *= f17;
                    f0Var = jz5.f0.f384359a;
                } else {
                    f0Var = null;
                }
                arrayList.add(f0Var);
            }
        }
        return rectFArr;
    }

    @Override // mf2.q
    public void D3(java.lang.Object panelClass) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panelClass, "panelClass");
        if (b7(panelClass)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRenderController", "onPanelOpen panelClass: " + panelClass);
            java.lang.String str = this.f312563n;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRenderController", "tryInitXLab facePath: " + str + " xLabEffect: " + this.f312562m);
            if (this.f312562m == null) {
                if (str.length() > 0) {
                    i95.m c17 = i95.n0.c(rh0.f0.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    rh0.z zVar = rh0.z.f477147h;
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                    linkedHashMap.put("FaceAlignmentCombined", "1");
                    linkedHashMap.put("Face3DLandmark", "0");
                    rh0.d0 u86 = rh0.f0.u8((rh0.f0) c17, 1, zVar, linkedHashMap, false, 8, null);
                    this.f312562m = u86;
                    ((p05.l4) u86).d(str);
                }
            }
            this.f312566q = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new df2.m3(panelClass, this, java.lang.System.currentTimeMillis(), null), 3, null);
        }
    }

    @Override // mf2.q
    public void L1(java.lang.Object panelClass, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panelClass, "panelClass");
        if (b7(panelClass)) {
            this.f312565p = i17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRenderController", "notifyPanelHeightChange panelClass: " + panelClass + " contentHeight: " + i17);
        }
    }

    @Override // mf2.c
    public void M2(xh2.b micInfoData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micInfoData, "micInfoData");
        if (micInfoData.f536063i.size() > 1) {
            if (this.f312564o == 0.0f) {
                return;
            }
            c7();
        }
    }

    @Override // mf2.q
    public void P3(java.lang.Object panelClass) {
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10845x833056b0 debugCanvasView;
        android.view.ViewPropertyAnimator translationY;
        android.view.ViewPropertyAnimator duration;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panelClass, "panelClass");
        if (b7(panelClass)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPanelClose panelClass: ");
            sb6.append(panelClass);
            sb6.append(" captureJob: ");
            p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f312566q;
            sb6.append(r2Var != null ? java.lang.Boolean.valueOf(((p3325xe03a0797.p3326xc267989b.a) r2Var).a()) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRenderController", sb6.toString());
            p3325xe03a0797.p3326xc267989b.r2 r2Var2 = this.f312566q;
            if (r2Var2 != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
            }
            android.view.View a76 = a7();
            if (a76 != null) {
                android.view.ViewPropertyAnimator animate = a76.animate();
                if (animate != null && (translationY = animate.translationY(0.0f)) != null && (duration = translationY.setDuration(240L)) != null) {
                    duration.start();
                }
                com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614 c10850xc00cf614 = a76 instanceof com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614 ? (com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614) a76 : null;
                if (c10850xc00cf614 != null && (debugCanvasView = c10850xc00cf614.getDebugCanvasView()) != null) {
                    debugCanvasView.m46519x47248b24(null);
                }
            }
            this.f312564o = 0.0f;
        }
    }

    public final android.view.View a7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0 ob0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0) R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0.class);
        if (ob0Var != null) {
            return ob0Var.C1();
        }
        return null;
    }

    public final boolean b7(java.lang.Object obj) {
        java.util.LinkedList linkedList;
        ae2.in inVar = ae2.in.f85221a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.Y).mo141623x754a37bb()).r()).intValue() != 1 || zl2.r4.f555483a.x1()) {
            return false;
        }
        tn0.w0 Q6 = Q6();
        if ((Q6 != null && Q6.X()) || ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).L9() || !((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).d7()) {
            return false;
        }
        xh2.c cVar = (xh2.c) ((mm2.o4) m56788xbba4bfc0(mm2.o4.class)).A.mo3195x754a37bb();
        if (((cVar == null || (linkedList = cVar.f536064a) == null) ? 0 : linkedList.size()) > 1) {
            return false;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.C14967xb77206cb) && !(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.x)) {
            if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14409x611a9ea7) {
                int id6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14409x611a9ea7) obj).getId();
                if (id6 != com.p314xaae8f345.mm.R.id.g2z && id6 != com.p314xaae8f345.mm.R.id.fpu && id6 != com.p314xaae8f345.mm.R.id.f1_ && id6 != com.p314xaae8f345.mm.R.id.f9h) {
                    return false;
                }
            } else if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.io) && (!(obj instanceof pk2.f7) || !(((pk2.f7) obj).f437279r2 instanceof pk2.o9))) {
                return false;
            }
        }
        return true;
    }

    public final void c7() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRenderController", "resetTranslationY");
        android.view.View a76 = a7();
        if (a76 != null) {
            a76.setTranslationY(0.0f);
        }
        this.f312565p = 0;
        this.f312564o = 0.0f;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f312566q;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveDeactivate */
    public void mo14860x9606ce3f() {
        super.mo14860x9606ce3f();
        try {
            rh0.d0 d0Var = this.f312562m;
            if (d0Var != null) {
                ((p05.l4) d0Var).o();
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveRenderController", "onLiveDeactivate", th6);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStart */
    public void mo14863x39a513b7(r45.hc1 hc1Var) {
        super.mo14863x39a513b7(hc1Var);
        ae2.in inVar = ae2.in.f85221a;
        boolean z17 = true;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.Y).mo141623x754a37bb()).r()).intValue() != 1) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(this, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new df2.k3(this, null), 2, null);
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85465z).mo141623x754a37bb()).r()).intValue() == 1) {
            android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            int i17 = b17.x;
            int i18 = b17.y;
            java.lang.System.nanoTime();
            if (!com.p314xaae8f345.mm.ui.bk.y() && !com.p314xaae8f345.mm.ui.bk.Q() && !com.p314xaae8f345.mm.ui.bk.A()) {
                z17 = false;
            }
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            if (!z17) {
                if (i18 >= i17) {
                    i17 = i18;
                }
                i18 = i17;
            }
            float f17 = i18 * (((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).f410412s2 / ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).f410418t2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0 ob0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0) R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0.class);
            com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf C1 = ob0Var != null ? ob0Var.C1() : null;
            com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614 c10850xc00cf614 = C1 instanceof com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614 ? (com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614) C1 : null;
            if (c10850xc00cf614 != null) {
                c10850xc00cf614.removeView(c10850xc00cf614.debugCanvasView);
                com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10845x833056b0 c10845x833056b0 = c10850xc00cf614.debugCanvasView;
                android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 17;
                c10850xc00cf614.addView(c10845x833056b0, layoutParams);
                com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10845x833056b0 debugCanvasView = c10850xc00cf614.getDebugCanvasView();
                if (debugCanvasView != null) {
                    android.view.ViewGroup.LayoutParams layoutParams2 = debugCanvasView.getLayoutParams();
                    android.widget.FrameLayout.LayoutParams layoutParams3 = layoutParams2 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams2 : null;
                    if (layoutParams3 == null) {
                        return;
                    }
                    layoutParams3.width = (int) f17;
                }
            }
        }
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        c7();
    }

    @Override // mf2.q
    public void q4(java.lang.Object panelObject, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panelObject, "panelObject");
        if (b7(panelObject)) {
            if (this.f312564o == 0.0f) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRenderController", "onPanelAnimChange panelObject: " + panelObject + " rate: " + f17 + " animTranslationY: " + this.f312564o);
            android.view.View a76 = a7();
            if (a76 != null) {
                a76.setTranslationY(f17 * this.f312564o);
            }
        }
    }
}
