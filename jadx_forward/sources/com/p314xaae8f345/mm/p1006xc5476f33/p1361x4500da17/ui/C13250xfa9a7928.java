package com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui;

/* renamed from: com.tencent.mm.plugin.downloader_app.ui.TaskListView */
/* loaded from: classes8.dex */
public class C13250xfa9a7928 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12809xaf47a071 implements xn5.a0 {

    /* renamed from: s2, reason: collision with root package name */
    public static final /* synthetic */ int f178950s2 = 0;

    /* renamed from: f2, reason: collision with root package name */
    public r02.r0 f178951f2;

    /* renamed from: g2, reason: collision with root package name */
    public final java.util.Map f178952g2;

    /* renamed from: h2, reason: collision with root package name */
    public r02.w f178953h2;

    /* renamed from: i2, reason: collision with root package name */
    public r02.v f178954i2;

    /* renamed from: j2, reason: collision with root package name */
    public boolean f178955j2;

    /* renamed from: k2, reason: collision with root package name */
    public r02.m0 f178956k2;

    /* renamed from: l2, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.s f178957l2;

    /* renamed from: m2, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.p f178958m2;

    /* renamed from: n2, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.q f178959n2;

    /* renamed from: o2, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.v f178960o2;

    /* renamed from: p2, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.t f178961p2;

    /* renamed from: q2, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.w f178962q2;

    /* renamed from: r2, reason: collision with root package name */
    public boolean f178963r2;

    public C13250xfa9a7928(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f178952g2 = new java.util.HashMap();
        this.f178957l2 = new r02.t0(this);
        this.f178958m2 = new r02.u0(this);
        this.f178959n2 = new r02.v0(this);
        this.f178960o2 = new r02.w0(this);
        this.f178961p2 = new r02.x0(this);
        this.f178962q2 = new r02.y0(this);
        this.f178963r2 = true;
    }

    /* renamed from: getSize */
    public int m54727xfb854877() {
        return this.f178951f2.f449857d.size();
    }

    public void l1() {
        this.f178955j2 = false;
        r02.w wVar = this.f178953h2;
        if (wVar != null) {
            ((r02.m) wVar).a(false);
        }
        this.f178951f2.getClass();
        if (this.f178951f2.f449857d.size() <= 5) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.ActivityC13242xdf6880d5) getContext()).W6(true);
            return;
        }
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0 r0Var : ((java.util.HashMap) this.f178952g2).values()) {
            r0Var.f178845a = false;
            r0Var.f178846b = false;
        }
        r02.r0 r0Var2 = this.f178951f2;
        r0Var2.f449863m = true;
        r0Var2.m8146xced61ae5();
        this.f178963r2 = true;
    }

    public final void m1(com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0 r0Var) {
        r02.r0 r0Var2 = this.f178951f2;
        r0Var2.f449857d.remove(r0Var);
        m43.e eVar = r0Var2.f449857d;
        synchronized (eVar.f404990d) {
            boolean z17 = false;
            int i17 = 0;
            while (true) {
                try {
                    if (i17 >= eVar.size()) {
                        i17 = 0;
                        break;
                    }
                    if (java.lang.Integer.compare(r0Var.f178847c, java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0) ((m43.d) eVar.get(i17))).f178847c).intValue()) <= 0) {
                        z17 = true;
                        break;
                    }
                    i17++;
                } catch (java.lang.Throwable th6) {
                    throw th6;
                }
            }
            if (!z17) {
                i17 = eVar.size();
            }
            eVar.add(i17, r0Var);
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.w0.c(true, new r02.n0(r0Var2));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.s sVar = this.f178957l2;
        java.util.LinkedList linkedList = com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.x.f178870f;
        if (!linkedList.contains(sVar)) {
            linkedList.add(sVar);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.x.f178865a.add(this.f178958m2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.x.f178866b.add(this.f178959n2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.x.f178868d.add(this.f178960o2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.t tVar = this.f178961p2;
        java.util.LinkedList linkedList2 = com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.x.f178869e;
        if (!linkedList2.contains(tVar)) {
            linkedList2.add(tVar);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.w wVar = this.f178962q2;
        java.util.LinkedList linkedList3 = com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.x.f178871g;
        if (linkedList3.contains(wVar)) {
            return;
        }
        linkedList3.add(wVar);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.x.f178870f.remove(this.f178957l2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.x.f178865a.remove(this.f178958m2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.x.f178866b.remove(this.f178959n2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.x.f178868d.remove(this.f178960o2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.x.f178869e.remove(this.f178961p2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.x.f178871g.remove(this.f178962q2);
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(getContext()));
        r02.r0 r0Var = new r02.r0(getContext());
        this.f178951f2 = r0Var;
        r0Var.f449864n = this.f178956k2;
        mo7960x6cab2c8d(r0Var);
        N(new r02.z(getResources()));
        m53688x1c3e70c(new r02.z0(this));
        m53687xa1aeda28(new r02.a1(this));
    }

    /* renamed from: setData */
    public void m54728x76491f2c(java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0> linkedList) {
        java.util.Iterator<com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0> it = linkedList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0 next = it.next();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(next.f178850f)) {
                ((java.util.HashMap) this.f178952g2).put(next.f178850f, next);
            }
        }
        r02.r0 r0Var = this.f178951f2;
        m43.e eVar = r0Var.f449857d;
        eVar.clear();
        java.util.Iterator<com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0> it6 = linkedList.iterator();
        while (it6.hasNext()) {
            eVar.e(it6.next());
        }
        eVar.e(new com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0(1));
        eVar.e(new com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0(3));
        eVar.e(new com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0(5));
        eVar.e(new com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0(7));
        r0Var.m8146xced61ae5();
    }

    /* renamed from: setOnItemButtonClickListener */
    public void m54729x8f299b16(r02.m0 m0Var) {
        this.f178956k2 = m0Var;
        r02.r0 r0Var = this.f178951f2;
        if (r0Var != null) {
            r0Var.f449864n = m0Var;
        }
    }
}
