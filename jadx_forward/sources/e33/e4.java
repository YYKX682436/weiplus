package e33;

/* loaded from: classes10.dex */
public class e4 implements p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561 f328744d;

    public e4(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561 activityC15656x6f26b561) {
        this.f328744d = activityC15656x6f26b561;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrollStateChanged */
    public void mo8331xcb2941fe(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561 activityC15656x6f26b561 = this.f328744d;
        e33.v2 v2Var = activityC15656x6f26b561.f220112e;
        if (v2Var != null) {
            e33.l3 l3Var = v2Var.B;
            l3Var.f328856f = i17;
            if (i17 == 0) {
                android.util.SparseArray sparseArray = l3Var.f328855e;
                int size = sparseArray.size();
                int[] iArr = new int[size];
                for (int i18 = 0; i18 < size; i18++) {
                    iArr[i18] = sparseArray.keyAt(i18);
                }
                for (int i19 = 0; i19 < size; i19++) {
                    int i27 = iArr[i19];
                    l3Var.a(i27, (android.graphics.Bitmap) sparseArray.get(i27));
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 a76 = activityC15656x6f26b561.a7();
        if (a76 != null && a76.mo63659xfb85f7b0() == 6 && i17 == 1) {
            activityC15656x6f26b561.T1.f369821d.m81477xae17c85(true);
        }
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrolled */
    public void mo8332xf210c75a(int i17, float f17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 a76;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561 activityC15656x6f26b561 = this.f328744d;
        if (activityC15656x6f26b561.T1.f369821d.m81464xb7cf71c7() <= 1.0f || (a76 = activityC15656x6f26b561.a7()) == null || a76.mo63659xfb85f7b0() != 6) {
            return;
        }
        if (i18 > 20) {
            activityC15656x6f26b561.T1.f369821d.m81477xae17c85(false);
        } else {
            activityC15656x6f26b561.T1.f369821d.m81477xae17c85(true);
        }
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageSelected */
    public void mo8333x510f45c9(int i17) {
        android.content.res.Resources resources;
        int i18;
        t23.p0.j().f496769h.put(java.lang.Integer.valueOf(i17), java.lang.Boolean.TRUE);
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561 activityC15656x6f26b561 = this.f328744d;
        java.lang.String i19 = activityC15656x6f26b561.f220112e.i(i17);
        if (i19 != null) {
            e33.h5 h5Var = (e33.h5) activityC15656x6f26b561.f220114f.mo7946xf939df19();
            if (activityC15656x6f26b561.f220127p) {
                int indexOf = activityC15656x6f26b561.f220124m.contains(i19) ? activityC15656x6f26b561.f220124m.indexOf(i19) : -1;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImagePreviewUI", "[notifyRecycleViewWhenPageSelected] :%s indexInBar:%s %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(indexOf), java.lang.Boolean.valueOf(activityC15656x6f26b561.f220127p));
                h5Var.f328801s = indexOf;
                h5Var.f328800r = i17;
                h5Var.m8146xced61ae5();
                if (indexOf != -1) {
                    activityC15656x6f26b561.f220114f.postDelayed(new e33.r4(activityC15656x6f26b561, indexOf), 66L);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImagePreviewUI", "[notifyRecycleViewWhenPageSelected] :%s %s", java.lang.Integer.valueOf(i17), activityC15656x6f26b561.f220126o);
                h5Var.f328801s = i17;
                h5Var.f328800r = i17;
                h5Var.m8148xed6e4d18(activityC15656x6f26b561.f220126o.intValue(), new java.lang.Object());
                h5Var.m8148xed6e4d18(i17, new java.lang.Object());
                activityC15656x6f26b561.f220114f.postDelayed(new e33.q4(activityC15656x6f26b561, i17), 66L);
            }
        }
        boolean contains = activityC15656x6f26b561.f220124m.contains(i19);
        activityC15656x6f26b561.f220126o = java.lang.Integer.valueOf(i17);
        activityC15656x6f26b561.D.setImageResource(contains ? activityC15656x6f26b561.Z6() : com.p314xaae8f345.mm.R.raw.f80936xc6307b2b);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = activityC15656x6f26b561.D;
        if (contains) {
            resources = activityC15656x6f26b561.getResources();
            i18 = com.p314xaae8f345.mm.R.C30867xcad56011.fhj;
        } else {
            resources = activityC15656x6f26b561.getResources();
            i18 = com.p314xaae8f345.mm.R.C30867xcad56011.fhl;
        }
        c22699x3dcdb352.setContentDescription(resources.getString(i18));
        e33.v2 v2Var = activityC15656x6f26b561.f220112e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageAdapter", "onPageSelect >> position: %d, currentPosition: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(v2Var.f329044v));
        int i27 = v2Var.f329044v;
        if (i27 != -1) {
            y51.c j17 = v2Var.j(i27);
            if (j17 != null) {
                ((y51.b) j17).b();
            }
            y51.c j18 = v2Var.j(i17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 k17 = v2Var.k(i17);
            if (k17 != null && k17.mo63659xfb85f7b0() == 6) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0 c15632xfc4fd0d0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0) k17;
                if (c15632xfc4fd0d0.H == 1 && c15632xfc4fd0d0.A != 2 && j18 != null) {
                    ((y51.b) j18).c();
                    v2Var.p(c15632xfc4fd0d0, 4);
                }
            }
            v2Var.m(i17);
        }
        v2Var.f329044v = i17;
        if (activityC15656x6f26b561.f220130q) {
            activityC15656x6f26b561.F7(true);
        } else {
            activityC15656x6f26b561.F7(false);
        }
        if (activityC15656x6f26b561.f220133t) {
            activityC15656x6f26b561.f220135v.setImageResource(com.p314xaae8f345.mm.R.raw.f80934x4cd0ef61);
        }
        activityC15656x6f26b561.f220135v.setEnabled(!activityC15656x6f26b561.f220133t);
        activityC15656x6f26b561.f220136w.setEnabled(!activityC15656x6f26b561.f220133t);
        activityC15656x6f26b561.mo54450xbf7c1df6((i17 + 1) + "/" + activityC15656x6f26b561.f220112e.mo8338x7444f759());
        e33.m3 m3Var = activityC15656x6f26b561.f220112e.A;
        int i28 = m3Var.f328891a;
        if (i28 == -1) {
            int i29 = 0;
            while (true) {
                if (i29 != 0) {
                    int i37 = i17 + i29;
                    int i38 = i17 + 3;
                    if (i37 > i38 && i17 - i29 < java.lang.Math.max(i17 - 3, 0)) {
                        break;
                    }
                    if (i37 <= i38) {
                        m3Var.a(i37);
                    }
                    int i39 = i17 - i29;
                    if (i39 >= java.lang.Math.max(i17 - 3, 0)) {
                        m3Var.a(i39);
                    }
                } else {
                    m3Var.a(i17);
                }
                i29++;
            }
        } else if (i28 > i17) {
            m3Var.a(java.lang.Math.max(i17 - 3, 0));
        } else if (i28 < i17) {
            m3Var.a(i17 + 3);
        }
        m3Var.f328891a = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 e17 = t23.p0.e(i19);
        if (activityC15656x6f26b561.G.getVisibility() == 0 || activityC15656x6f26b561.H.getVisibility() == 0) {
            activityC15656x6f26b561.y7(i19, e17);
            activityC15656x6f26b561.U6(false);
            activityC15656x6f26b561.K7(e17);
        }
        if (e17 != null) {
            boolean z17 = e17.mo63659xfb85f7b0() == 6;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.ScaleGestureDetectorOnScaleGestureListenerC22653x4730490d scaleGestureDetectorOnScaleGestureListenerC22653x4730490d = activityC15656x6f26b561.T1.f369821d;
            if (scaleGestureDetectorOnScaleGestureListenerC22653x4730490d.getAddTouchView()) {
                scaleGestureDetectorOnScaleGestureListenerC22653x4730490d.f();
            }
            scaleGestureDetectorOnScaleGestureListenerC22653x4730490d.m81477xae17c85(z17);
            if (z17) {
                activityC15656x6f26b561.T1.f369821d.m81479xe15240b9(new e33.d4(this));
            } else {
                activityC15656x6f26b561.T1.f369821d.m81479xe15240b9(null);
            }
        }
        activityC15656x6f26b561.u7(e17);
        activityC15656x6f26b561.f220112e.r();
        activityC15656x6f26b561.D7(false);
        activityC15656x6f26b561.n7(i17, i19, e17);
    }
}
