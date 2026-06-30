package z26;

/* loaded from: classes15.dex */
public class g extends z26.k {

    /* renamed from: a, reason: collision with root package name */
    public boolean f551364a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ me.p3333x31613f.p3334x38f758b.lib.C29141x858f5ab f551365b;

    public g(me.p3333x31613f.p3334x38f758b.lib.C29141x858f5ab c29141x858f5ab, z26.a aVar) {
        this.f551365b = c29141x858f5ab;
    }

    @Override // z26.k
    public void a(android.view.View view, int i17, int i18, int i19, int i27) {
        me.p3333x31613f.p3334x38f758b.lib.C29141x858f5ab c29141x858f5ab = this.f551365b;
        int i28 = c29141x858f5ab.f407435x;
        if ((i28 & 1) != 0) {
            c29141x858f5ab.f407423i = java.lang.Math.abs(i17 / (c29141x858f5ab.f407421g.getWidth() + c29141x858f5ab.f407428q.getIntrinsicWidth()));
        } else if ((i28 & 2) != 0) {
            c29141x858f5ab.f407423i = java.lang.Math.abs(i17 / (c29141x858f5ab.f407421g.getWidth() + c29141x858f5ab.f407429r.getIntrinsicWidth()));
        } else if ((i28 & 8) != 0) {
            c29141x858f5ab.f407423i = java.lang.Math.abs(i18 / (c29141x858f5ab.f407421g.getHeight() + c29141x858f5ab.f407430s.getIntrinsicHeight()));
        }
        c29141x858f5ab.f407424m = i17;
        c29141x858f5ab.f407425n = i18;
        c29141x858f5ab.invalidate();
        if (c29141x858f5ab.f407423i < c29141x858f5ab.f407419e && !this.f551364a) {
            this.f551364a = true;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = c29141x858f5ab.f407426o;
        if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
            java.util.Iterator it = c29141x858f5ab.f407426o.iterator();
            while (it.hasNext()) {
                ((z26.e) it.next()).d(c29141x858f5ab.f407422h.f551368a, c29141x858f5ab.f407423i);
            }
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = c29141x858f5ab.f407426o;
        if (copyOnWriteArrayList2 != null && !copyOnWriteArrayList2.isEmpty() && c29141x858f5ab.f407422h.f551368a == 1 && c29141x858f5ab.f407423i >= c29141x858f5ab.f407419e && this.f551364a) {
            this.f551364a = false;
            java.util.Iterator it6 = c29141x858f5ab.f407426o.iterator();
            while (it6.hasNext()) {
                ((z26.e) it6.next()).f();
            }
        }
        if (c29141x858f5ab.f407423i >= 1.0f) {
            if (c29141x858f5ab.f407436y == 1) {
                c29141x858f5ab.f407421g.setTranslationX(0.0f);
                c29141x858f5ab.f407421g.setTranslationY(0.0f);
            }
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList3 = c29141x858f5ab.f407426o;
            if (copyOnWriteArrayList3 != null && !copyOnWriteArrayList3.isEmpty()) {
                java.util.Iterator it7 = c29141x858f5ab.f407426o.iterator();
                while (it7.hasNext()) {
                    z26.e eVar = (z26.e) it7.next();
                    if (eVar instanceof z26.f) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.x1 x1Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.q1) ((z26.f) eVar)).f168554a;
                        x1Var.setVisibility(8);
                        x1Var.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p1(x1Var));
                    }
                }
            }
        }
        if (c29141x858f5ab.f407436y == 1) {
            c29141x858f5ab.C = -i17;
            c29141x858f5ab.D = (i17 * c29141x858f5ab.getHeight()) / c29141x858f5ab.getWidth();
        } else {
            c29141x858f5ab.C = 0.0f;
            c29141x858f5ab.D = 0.0f;
        }
        boolean z17 = android.os.SystemClock.uptimeMillis() < c29141x858f5ab.f407437z;
        if (z17) {
            c29141x858f5ab.f407421g.setTranslationX(-i17);
            c29141x858f5ab.f407421g.setTranslationY(-i18);
        } else {
            if (c29141x858f5ab.B != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SwipeBackLayout", "startFreezeResetAnim|onViewPositionChanged");
                me.p3333x31613f.p3334x38f758b.lib.C29141x858f5ab.b(c29141x858f5ab);
                c29141x858f5ab.h();
            }
            c29141x858f5ab.f407421g.setTranslationX(c29141x858f5ab.C);
            c29141x858f5ab.f407421g.setTranslationY(c29141x858f5ab.D);
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList4 = c29141x858f5ab.f407426o;
        if (copyOnWriteArrayList4 == null || copyOnWriteArrayList4.isEmpty()) {
            return;
        }
        java.util.Iterator it8 = c29141x858f5ab.f407426o.iterator();
        while (it8.hasNext()) {
            z26.e eVar2 = (z26.e) it8.next();
            if (z17) {
                eVar2.c(c29141x858f5ab.f407421g, 0, 0);
            } else {
                eVar2.c(c29141x858f5ab.f407421g, c29141x858f5ab.f407424m + ((int) c29141x858f5ab.C), c29141x858f5ab.f407425n + ((int) c29141x858f5ab.D));
            }
        }
    }
}
