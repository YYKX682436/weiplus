package df2;

/* loaded from: classes3.dex */
public final class bh extends if2.b implements android.view.GestureDetector.OnGestureListener, android.view.GestureDetector.OnDoubleTapListener {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f311337m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.FrameLayout f311338n;

    /* renamed from: o, reason: collision with root package name */
    public final u26.w f311339o;

    /* renamed from: p, reason: collision with root package name */
    public final long f311340p;

    /* renamed from: q, reason: collision with root package name */
    public long f311341q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f311342r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.GestureDetector f311343s;

    /* renamed from: t, reason: collision with root package name */
    public if2.d0 f311344t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f311337m = "Live.LiveDoubleClickLikeController";
        this.f311339o = u26.z.a(Integer.MAX_VALUE, null, null, 6, null);
        this.f311340p = 600L;
        this.f311342r = new java.util.LinkedList();
        jz5.h.b(new df2.vg(this));
    }

    public final void Z6(int i17, int i18) {
        boolean z17 = ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).F;
        java.lang.String str = this.f311337m;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[sendXy] live room can not like");
            return;
        }
        df2.hh hhVar = (df2.hh) m56789x25fe639c(df2.hh.class);
        if (hhVar != null && !hhVar.f311860n) {
            p3325xe03a0797.p3326xc267989b.r2 r2Var = hhVar.f311861o;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            hhVar.f311860n = true;
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_DOUBLE_CLICK_GUIDE_SHOWN_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        }
        int i19 = i17 - 50;
        if (i19 < 0) {
            i19 = 0;
        }
        int dimension = (i18 - 100) - ((int) O6().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
        int i27 = dimension >= 0 ? dimension : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[sendXy] clickX = " + i19 + ", clickY = " + i27);
        this.f311341q = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new df2.ah(this, i19, i27, null), 3, null);
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent e17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LiveDoubleClickLikeController", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/live/controller/LiveDoubleClickLikeController", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(android.view.MotionEvent e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        java.lang.String str = this.f311337m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onDown");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[checkIsLegalInterval] now = " + currentTimeMillis + ", lastClickTimeStamp = " + this.f311341q + ", interval = " + (currentTimeMillis - this.f311341q));
        if (currentTimeMillis - this.f311341q < this.f311340p) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onDown, legal interval");
            Z6((int) e17.getX(), (int) e17.getY());
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onDown, not legal interval");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x80 x80Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x80) R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x80.class);
            if (x80Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x80.A1(x80Var, null, e17, 1, null);
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent e27, float f17, float f18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e27, "e2");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent e17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LiveDoubleClickLikeController", "android/view/GestureDetector$OnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/LiveDoubleClickLikeController", "android/view/GestureDetector$OnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent e27, float f17, float f18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e27, "e2");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(android.view.MotionEvent e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(android.view.MotionEvent e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent e17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LiveDoubleClickLikeController", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/live/controller/LiveDoubleClickLikeController", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) S6(com.p314xaae8f345.mm.R.id.ti7);
        this.f311338n = frameLayout;
        if (frameLayout != null) {
            frameLayout.setClickable(true);
        }
        android.widget.FrameLayout frameLayout2 = this.f311338n;
        if (frameLayout2 != null) {
            frameLayout2.setFocusable(true);
        }
        android.widget.FrameLayout frameLayout3 = this.f311338n;
        if (frameLayout3 != null) {
            frameLayout3.removeAllViews();
        }
        android.widget.FrameLayout frameLayout4 = this.f311338n;
        if (frameLayout4 != null) {
            frameLayout4.setVisibility(8);
        }
        if (this.f311343s == null) {
            android.view.GestureDetector gestureDetector = new android.view.GestureDetector(O6(), this);
            this.f311343s = gestureDetector;
            gestureDetector.setOnDoubleTapListener(this);
            android.widget.FrameLayout frameLayout5 = this.f311338n;
            if (frameLayout5 != null) {
                frameLayout5.setOnTouchListener(new df2.xg(this));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new df2.zg(this, null), 3, null);
        android.widget.FrameLayout frameLayout6 = this.f311338n;
        if (frameLayout6 != null) {
            if2.d0 d0Var = new if2.d0(frameLayout6, this);
            this.f311344t = d0Var;
            this.f372636i = new df2.wg(d0Var);
        }
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        this.f311338n = null;
        this.f311343s = null;
        this.f311342r.clear();
        this.f311344t = null;
    }
}
