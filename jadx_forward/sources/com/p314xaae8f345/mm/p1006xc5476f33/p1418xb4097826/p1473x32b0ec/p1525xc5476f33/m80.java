package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class m80 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x80 f195004d;

    public m80(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x80 x80Var) {
        this.f195004d = x80Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveScreenClearPlugin$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        java.lang.Integer valueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getAction()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            this.f195004d.B = (int) motionEvent.getX();
            this.f195004d.C = (int) motionEvent.getY();
            this.f195004d.f196585s = android.os.SystemClock.elapsedRealtime();
        } else if (valueOf != null && valueOf.intValue() == 1) {
            if (this.f195004d.f196585s > 0) {
                int x17 = (int) motionEvent.getX();
                int y17 = (int) motionEvent.getY();
                int scaledTouchSlop = android.view.ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
                if (java.lang.Math.abs(x17 - this.f195004d.B) > scaledTouchSlop || java.lang.Math.abs(y17 - this.f195004d.C) > scaledTouchSlop) {
                    p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f195004d.E;
                    if (r2Var != null) {
                        p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
                    }
                } else {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[ACTION_UP] doubleClickJob = ");
                    sb6.append(this.f195004d.E);
                    sb6.append(", isActive = ");
                    p3325xe03a0797.p3326xc267989b.r2 r2Var2 = this.f195004d.E;
                    sb6.append(r2Var2 != null ? java.lang.Boolean.valueOf(r2Var2.a()) : null);
                    sb6.append(", screenClear = ");
                    sb6.append(((mm2.c1) this.f195004d.P0(mm2.c1.class)).N1);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveScreenClearPlugin", sb6.toString());
                    if (!((mm2.c1) this.f195004d.P0(mm2.c1.class)).N1 && !((mm2.c1) this.f195004d.P0(mm2.c1.class)).T) {
                        boolean z17 = false;
                        if (!(((mm2.n0) this.f195004d.P0(mm2.n0.class)).f410806r)) {
                            p3325xe03a0797.p3326xc267989b.r2 r2Var3 = this.f195004d.E;
                            if (r2Var3 != null && r2Var3.a()) {
                                z17 = true;
                            }
                            if (z17) {
                                p3325xe03a0797.p3326xc267989b.r2 r2Var4 = this.f195004d.E;
                                if (r2Var4 != null) {
                                    p3325xe03a0797.p3326xc267989b.p2.a(r2Var4, null, 1, null);
                                }
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x80 x80Var = this.f195004d;
                                x80Var.getClass();
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveScreenClearPlugin", "screenDoubleClickLogic");
                                df2.bh bhVar = (df2.bh) x80Var.U0(df2.bh.class);
                                if (bhVar != null) {
                                    bhVar.Z6(x17, y17);
                                }
                            } else {
                                p3325xe03a0797.p3326xc267989b.r2 r2Var5 = this.f195004d.E;
                                if (r2Var5 != null) {
                                    p3325xe03a0797.p3326xc267989b.p2.a(r2Var5, null, 1, null);
                                }
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x80 x80Var2 = this.f195004d;
                                p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                                x80Var2.E = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(x80Var2, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l80(x80Var2, motionEvent, null), 2, null);
                            }
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x80.A1(this.f195004d, null, motionEvent, 1, null);
                }
            }
            this.f195004d.f196585s = -1L;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x80.t1(this.f195004d, motionEvent);
        java.util.LinkedList linkedList = this.f195004d.f196586t;
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((android.view.View.OnTouchListener) it.next()).onTouch(view, motionEvent);
            }
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveScreenClearPlugin$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
