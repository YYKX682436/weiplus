package com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.PickPoi */
/* loaded from: classes15.dex */
public class C16296x40c45249 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f226235d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.animation.Animation f226236e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f226237f;

    /* renamed from: g, reason: collision with root package name */
    public u60.f f226238g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.d0 f226239h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f226240i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.c0 f226241m;

    /* renamed from: n, reason: collision with root package name */
    public final u60.e f226242n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.v1 f226243o;

    public C16296x40c45249(android.content.Context context) {
        super(context);
        this.f226239h = new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.d0();
        this.f226240i = true;
        this.f226241m = null;
        this.f226242n = new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.a0(this);
        a(context);
    }

    public final void a(android.content.Context context) {
        this.f226235d = context;
        this.f226238g = ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).wi();
        this.f226236e = android.view.animation.AnimationUtils.loadAnimation(context, com.p314xaae8f345.mm.R.C30854x2dc211.f559443ey);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bsp, (android.view.ViewGroup) this, true);
        this.f226237f = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.in6);
        if (j65.e.b()) {
            this.f226237f.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c8k);
        }
        post(new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.z(this, inflate, context));
    }

    public void b(double d17, double d18, boolean z17, int i17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.d0 d0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.d0();
        this.f226239h = d0Var;
        d0Var.f226320m = 3;
        d0Var.f226308a = this.f226235d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggf);
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.d0 d0Var2 = this.f226239h;
        d0Var2.f226311d = d17;
        d0Var2.f226310c = d18;
        d0Var2.f226309b = "";
        d0Var2.f226322o = str;
        d0Var2.f226323p = str2;
        u60.f fVar = this.f226238g;
        u60.e eVar = this.f226242n;
        ((i11.g) fVar).c(eVar);
        u60.h hVar = new u60.h(d17, d18);
        hVar.f506404d = i17;
        hVar.f506405e = str2;
        hVar.f506403c = 2;
        hVar.f506407g = z17;
        ((i11.g) this.f226238g).b(hVar, eVar);
        this.f226240i = true;
    }

    /* renamed from: getPoi */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.d0 m65959xb5886314() {
        return this.f226239h;
    }

    /* renamed from: setAdapter */
    public void m65960x6cab2c8d(com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.c0 c0Var) {
        this.f226241m = c0Var;
    }

    /* renamed from: setLocationArrow */
    public void m65961xe3789012(int i17) {
        this.f226237f.setImageResource(i17);
    }

    /* renamed from: setOnCurPoiGet */
    public void m65962x5c1d7e2b(com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.v1 v1Var) {
        this.f226243o = v1Var;
    }

    public C16296x40c45249(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f226239h = new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.d0();
        this.f226240i = true;
        this.f226241m = null;
        this.f226242n = new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.a0(this);
        a(context);
    }

    public C16296x40c45249(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f226239h = new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.d0();
        this.f226240i = true;
        this.f226241m = null;
        this.f226242n = new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.a0(this);
        a(context);
    }
}
