package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ktv.p1504x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/ktv/view/KTVInteractiveWidget;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.ktv.view.KTVInteractiveWidget */
/* loaded from: classes10.dex */
public final class C14229xb3dcfb39 extends android.widget.FrameLayout {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f193195p = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.FrameLayout f193196d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f193197e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f193198f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.FrameLayout f193199g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f193200h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.FrameLayout f193201i;

    /* renamed from: m, reason: collision with root package name */
    public lj2.v0 f193202m;

    /* renamed from: n, reason: collision with root package name */
    public ah2.f f193203n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f193204o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14229xb3dcfb39(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ktv.p1504x373aa5.C14229xb3dcfb39 c14229xb3dcfb39, mh2.o oVar) {
        c14229xb3dcfb39.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("element", oVar.f407964d);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        if (zl2.r4.f555483a.x1()) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.f409908r2, jSONObject2, null, 4, null);
        } else {
            i95.m c18 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            ml2.r0.hj((ml2.r0) c18, ml2.b4.W2, jSONObject2, 0L, null, null, null, null, null, 252, null);
        }
    }

    public final void b(r45.yx1 yx1Var) {
        lj2.v0 v0Var = this.f193202m;
        zi2.w wVar = v0Var instanceof zi2.w ? (zi2.w) v0Var : null;
        if (wVar == null) {
            return;
        }
        boolean z17 = yx1Var.f472998n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f193200h;
        if (c22699x3dcdb352 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pauseResumeBtn");
            throw null;
        }
        c22699x3dcdb352.setImageResource(z17 ? com.p314xaae8f345.mm.R.raw.f80867xcfdedccd : com.p314xaae8f345.mm.R.raw.f80820x59fe03cb);
        android.widget.FrameLayout frameLayout = this.f193199g;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(new mh2.u(this, wVar, yx1Var));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pauseResumeBtnContainer");
            throw null;
        }
    }

    public final void c() {
        lj2.v0 v0Var = this.f193202m;
        zi2.w wVar = v0Var instanceof zi2.w ? (zi2.w) v0Var : null;
        if (wVar == null) {
            return;
        }
        boolean booleanValue = ((java.lang.Boolean) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((om2.e) wVar.P0(om2.e.class)).f427823f).mo144003x754a37bb()).booleanValue();
        android.widget.ImageView imageView = this.f193198f;
        if (imageView != null) {
            imageView.setImageResource(booleanValue ? com.p314xaae8f345.mm.R.raw.f79256xc9406fb0 : com.p314xaae8f345.mm.R.raw.f79255x5ecd85be);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("originalToggleBtn");
            throw null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f193202m = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14229xb3dcfb39(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e_y, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f568938vh0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.view.ViewParent parent = ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById).getParent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.widget.FrameLayout");
        this.f193196d = (android.widget.FrameLayout) parent;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.unp);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById2;
        this.f193198f = imageView;
        android.view.ViewParent parent2 = imageView.getParent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent2, "null cannot be cast to non-null type android.widget.FrameLayout");
        this.f193197e = (android.widget.FrameLayout) parent2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.upb);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById3;
        this.f193200h = c22699x3dcdb352;
        android.view.ViewParent parent3 = c22699x3dcdb352.getParent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent3, "null cannot be cast to non-null type android.widget.FrameLayout");
        this.f193199g = (android.widget.FrameLayout) parent3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.twj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        android.view.ViewParent parent4 = ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById4).getParent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent4, "null cannot be cast to non-null type android.widget.FrameLayout");
        this.f193201i = (android.widget.FrameLayout) parent4;
    }
}
