package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002;

/* loaded from: classes3.dex */
public final class s implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.t f197202d;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.t tVar) {
        this.f197202d = tVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        mm2.e1 e1Var;
        r45.nw1 nw1Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/util/ContinuousClickManager$touchListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        byte[] bArr = null;
        java.lang.Integer valueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getActionMasked()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            this.f197202d.f197221j = false;
            int ordinal = this.f197202d.f197216e.ordinal();
            if (ordinal == 0) {
                long j17 = 0;
                if (this.f197202d.f197217f.f314999a <= 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.t tVar = this.f197202d;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
                    if (k0Var != null && (e1Var = (mm2.e1) k0Var.m57635xbba4bfc0(mm2.e1.class)) != null && (nw1Var = e1Var.f410521r) != null) {
                        j17 = nw1Var.m75942xfb822ef2(0);
                    }
                    tVar.f197217f = new dk2.g(j17);
                }
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                dk2.g gVar = this.f197202d.f197217f;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.lang.String r17 = c01.z1.r();
                if (r17 != null) {
                    bArr = r17.getBytes(r26.c.f450398a);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bArr, "getBytes(...)");
                }
                sb6.append(kk.k.g(bArr));
                sb6.append('_');
                sb6.append(java.util.UUID.randomUUID());
                java.lang.String sb7 = sb6.toString();
                gVar.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sb7, "<set-?>");
                gVar.f315000b = sb7;
                this.f197202d.e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n.f197165e);
            } else if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.t tVar2 = this.f197202d;
                if (!tVar2.f197221j || java.lang.System.currentTimeMillis() - tVar2.f197220i < 3000) {
                    this.f197202d.e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n.f197166f);
                } else {
                    this.f197202d.e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n.f197165e);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.t tVar3 = this.f197202d;
            pm0.v.U(tVar3.f197214c, tVar3.f197228q);
        } else if (valueOf != null && valueOf.intValue() == 2) {
            this.f197202d.f197221j = false;
        } else {
            if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 3)) {
                r2 = true;
            }
            if (r2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.t.a(this.f197202d);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ContinuousClickManager", "on ACTION_UP or ACTION_CANCEL: " + motionEvent);
                this.f197202d.f197221j = true;
                this.f197202d.f197220i = java.lang.System.currentTimeMillis();
                if (this.f197202d.f197229r.e()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.t.a(this.f197202d);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ContinuousClickManager", "single click start timer");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.t tVar4 = this.f197202d;
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = tVar4.f197229r;
                    long j18 = tVar4.f197213b;
                    b4Var.c(j18, j18);
                }
                this.f197202d.b();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m mVar = this.f197202d.f197223l;
                if (mVar != null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(motionEvent);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dq dqVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep) mVar).f193976a;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14322xa80b0cb2 c14322xa80b0cb2 = dqVar.M;
                    pm0.v.U(c14322xa80b0cb2.f197482e, c14322xa80b0cb2.singleClickPagTask);
                    ((je2.t) dqVar.P0(je2.t.class)).f380804q.mo7808x76db6cb1(java.lang.Boolean.TRUE);
                }
            }
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/live/util/ContinuousClickManager$touchListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
