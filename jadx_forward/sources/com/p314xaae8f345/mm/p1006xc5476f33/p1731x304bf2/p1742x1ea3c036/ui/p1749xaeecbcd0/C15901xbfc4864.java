package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0;

/* renamed from: com.tencent.mm.plugin.game.luggage.ui.circle.AtSomeoneView */
/* loaded from: classes15.dex */
public class C15901xbfc4864 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12809xaf47a071 implements im5.b {

    /* renamed from: f2, reason: collision with root package name */
    public final im5.c f221506f2;

    /* renamed from: g2, reason: collision with root package name */
    public android.content.Context f221507g2;

    /* renamed from: h2, reason: collision with root package name */
    public f53.m f221508h2;

    /* renamed from: i2, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de f221509i2;

    /* renamed from: j2, reason: collision with root package name */
    public kk.j f221510j2;

    /* renamed from: k2, reason: collision with root package name */
    public final java.util.List f221511k2;

    /* renamed from: l2, reason: collision with root package name */
    public final java.util.List f221512l2;

    /* renamed from: m2, reason: collision with root package name */
    public final java.util.List f221513m2;

    /* renamed from: n2, reason: collision with root package name */
    public java.util.List f221514n2;

    /* renamed from: o2, reason: collision with root package name */
    public android.os.Bundle f221515o2;

    /* renamed from: p2, reason: collision with root package name */
    public int f221516p2;

    /* renamed from: q2, reason: collision with root package name */
    public boolean f221517q2;

    public C15901xbfc4864(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f221506f2 = new im5.c();
        this.f221511k2 = new java.util.LinkedList();
        this.f221512l2 = new java.util.LinkedList();
        this.f221513m2 = new java.util.LinkedList();
        this.f221514n2 = new java.util.LinkedList();
        this.f221516p2 = -1;
        this.f221517q2 = false;
        h1();
    }

    /* renamed from: getmAdapter */
    public f53.m m64587xd1852f78() {
        return this.f221508h2;
    }

    public final void h1() {
        this.f221507g2 = getContext();
        this.f221510j2 = new jt0.i(30, getClass());
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this.f221507g2);
        this.f221509i2 = c1162x665295de;
        c1162x665295de.Q(0);
        mo7967x900dcbe1(this.f221509i2);
        f53.m mVar = new f53.m(this);
        this.f221508h2 = mVar;
        mo7960x6cab2c8d(mVar);
    }

    @Override // im5.b
    /* renamed from: keep */
    public void mo46316x322b85(im5.a aVar) {
        this.f221506f2.mo46316x322b85(aVar);
    }

    public void l1(int i17) {
        android.view.View mo7935xa188593e = this.f221509i2.mo7935xa188593e(i17);
        if (mo7935xa188593e == null) {
            return;
        }
        android.view.View findViewById = mo7935xa188593e.findViewById(com.p314xaae8f345.mm.R.id.a5w);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneView", "cancelAt", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneView", "cancelAt", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void m1(f53.n nVar) {
        t43.a aVar = new t43.a(this.f221515o2);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            pq5.g l17 = aVar.l();
            l17.f(this);
            l17.h(new f53.g(this, nVar));
        } else {
            ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).Ai(aVar.f152179f, new f53.h(this, nVar), this);
        }
    }

    public void n1(java.lang.String str) {
        java.util.List list;
        if (java.util.Objects.equals(str, "")) {
            list = this.f221511k2;
            this.f221517q2 = false;
        } else {
            this.f221517q2 = true;
            this.f221516p2 = -1;
            java.util.LinkedList linkedList = new java.util.LinkedList();
            for (o33.f fVar : this.f221511k2) {
                if (fVar.f424271e.contains(str)) {
                    if (((java.util.LinkedList) this.f221512l2).contains(fVar)) {
                        this.f221516p2++;
                    }
                    linkedList.add(fVar);
                }
            }
            list = linkedList;
        }
        ((ku5.t0) ku5.t0.f394148d).B(new f53.j(this, list));
    }

    public void o1(java.util.List list, java.util.List list2) {
        boolean z17;
        ((java.util.LinkedList) this.f221511k2).clear();
        ((java.util.LinkedList) this.f221511k2).addAll(list);
        if (list.size() != 0) {
            this.f221516p2 = list.size() - 1;
        } else {
            this.f221516p2 = -1;
        }
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            o33.f fVar = (o33.f) it.next();
            java.util.Iterator it6 = list.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    z17 = true;
                    break;
                } else if (((o33.f) it6.next()).f424270d.equals(fVar.f424270d)) {
                    z17 = false;
                    break;
                }
            }
            if (z17) {
                ((java.util.LinkedList) this.f221511k2).add(fVar);
            }
        }
        ((ku5.t0) ku5.t0.f394148d).B(new f53.i(this));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        java.util.Iterator it = ((jt0.i) this.f221510j2).mo141379xcee59d22().iterator();
        while (it.hasNext()) {
            ((android.graphics.Bitmap) it.next()).recycle();
        }
        ((lt0.f) this.f221510j2).mo143584x5a5b64d();
        this.f221506f2.mo10668x2efc64();
    }

    /* renamed from: setSelectedDatas */
    public void m64588xa582aeec(java.util.List<java.lang.String> list) {
        this.f221514n2 = list;
    }

    public C15901xbfc4864(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f221506f2 = new im5.c();
        this.f221511k2 = new java.util.LinkedList();
        this.f221512l2 = new java.util.LinkedList();
        this.f221513m2 = new java.util.LinkedList();
        this.f221514n2 = new java.util.LinkedList();
        this.f221516p2 = -1;
        this.f221517q2 = false;
        h1();
    }
}
