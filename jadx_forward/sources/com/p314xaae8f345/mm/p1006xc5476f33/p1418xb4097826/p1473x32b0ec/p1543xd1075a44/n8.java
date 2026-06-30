package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public abstract class n8 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final float f200699d;

    /* renamed from: e, reason: collision with root package name */
    public final float f200700e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f200701f;

    /* renamed from: g, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.y0 f200702g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n8(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f200699d = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y;
        this.f200700e = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).x;
        this.f200702g = p3325xe03a0797.p3326xc267989b.i2.f392010d;
        setOnClickListener(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m8.f200585d);
    }

    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l basePlugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePlugin, "basePlugin");
        this.f200701f = basePlugin;
        this.f200702g = basePlugin.R0().m57691xa0fa63f9();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: getBasePlugin */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l m58104xb7f4f95a() {
        return this.f200701f;
    }

    /* renamed from: getHEIGHT */
    public final float m58105x1a7dbbfd() {
        return this.f200699d;
    }

    /* renamed from: getScope */
    public final p3325xe03a0797.p3326xc267989b.y0 m58106x7520e49e() {
        return this.f200702g;
    }

    /* renamed from: getWIDTH */
    public final float m58107x754ccc10() {
        return this.f200700e;
    }

    /* renamed from: setBasePlugin */
    public final void m58108xe6194766(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar) {
        this.f200701f = lVar;
    }

    /* renamed from: setScope */
    public final void m58109x53aeff12(p3325xe03a0797.p3326xc267989b.y0 y0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(y0Var, "<set-?>");
        this.f200702g = y0Var;
    }

    /* renamed from: setTextBold */
    public final void m58110x3ab833d4(android.widget.TextView tv6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tv6, "tv");
        com.p314xaae8f345.mm.ui.bk.r0(tv6.getPaint(), 0.8f);
    }
}
