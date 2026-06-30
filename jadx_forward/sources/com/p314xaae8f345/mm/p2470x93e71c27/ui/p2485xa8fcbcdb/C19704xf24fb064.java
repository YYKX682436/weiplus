package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb;

/* renamed from: com.tencent.mm.pluginsdk.ui.preference.FMessageListView */
/* loaded from: classes11.dex */
public class C19704xf24fb064 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final l75.q0 f272594d;

    /* renamed from: e, reason: collision with root package name */
    public final l75.q0 f272595e;

    /* renamed from: f, reason: collision with root package name */
    public final l75.q0 f272596f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f272597g;

    /* renamed from: h, reason: collision with root package name */
    public y35.j f272598h;

    /* renamed from: i, reason: collision with root package name */
    public y35.q f272599i;

    /* renamed from: m, reason: collision with root package name */
    public y35.d f272600m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f272601n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f272602o;

    /* renamed from: p, reason: collision with root package name */
    public y35.k f272603p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f272604q;

    public C19704xf24fb064(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(y35.r r15) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19704xf24fb064.a(y35.r):void");
    }

    public void b() {
        com.p314xaae8f345.mm.p2621x8fb0427b.q7 Ai = r21.w.Ai();
        l75.q0 q0Var = this.f272595e;
        Ai.mo49775xc84af884(q0Var);
        r21.w.Bi().mo49775xc84af884(q0Var);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Zi().mo49775xc84af884(this.f272594d);
        r21.w.Di().mo49775xc84af884(this.f272596f);
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = getChildAt(i17);
            if (childAt instanceof y35.d) {
                ((y35.d) childAt).c();
            }
        }
        this.f272599i = null;
        this.f272600m = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.p314xaae8f345.mm.p2621x8fb0427b.q7 Ai = r21.w.Ai();
        l75.q0 q0Var = this.f272595e;
        Ai.add(q0Var);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Zi().add(this.f272594d);
        r21.w.Bi().add(q0Var);
        r21.w.Di().add(this.f272596f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    /* renamed from: setFMessageArgs */
    public void m75602xd75a02c0(y35.j jVar) {
        this.f272598h = jVar;
        y35.d.m176453xd75a02c0(jVar);
    }

    /* renamed from: setForceHideReply */
    public void m75603x2bd9211f(boolean z17) {
        this.f272604q = z17;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FMessageListView", "setForceHideReply = %s, stack = ", valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
    }

    /* renamed from: setGotoSayHiCallBack */
    public void m75604x351d3dec(y35.k kVar) {
        this.f272603p = kVar;
    }

    /* renamed from: setHide */
    public void m75605x764b0cc4(boolean z17) {
        this.f272602o = z17;
    }

    /* renamed from: setReplyBtnVisible */
    public void m75606x7f88a83e(boolean z17) {
        int childCount = getChildCount();
        if (childCount <= 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FMessageListView", "setReplyBtnVisible fail, childCount invalid = " + childCount);
            return;
        }
        y35.q qVar = this.f272599i;
        if (qVar != null) {
            qVar.setVisibility(z17 ? 0 : 8);
        }
        y35.d dVar = this.f272600m;
        if (dVar != null) {
            dVar.setVisibility(z17 ? 0 : 8);
        }
    }

    public C19704xf24fb064(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        this.f272594d = new y35.l(this);
        this.f272595e = new y35.m(this);
        this.f272596f = new y35.n(this);
        this.f272602o = false;
        this.f272604q = false;
        this.f272597g = context;
    }
}
