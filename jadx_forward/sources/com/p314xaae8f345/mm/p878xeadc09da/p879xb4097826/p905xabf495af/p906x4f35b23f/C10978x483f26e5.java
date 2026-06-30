package com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p906x4f35b23f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0011B'\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0014\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u000e\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/shoot_composing/beautify/BeautifyPanel;", "Landroid/widget/FrameLayout;", "Lkotlin/Function0;", "Ljz5/f0;", "onDismiss", "setOnDismissListener", "", "onlyBeauty", "setBeautyOnlyMode", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "nx0/g", "plugin-vlog-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.BeautifyPanel */
/* loaded from: classes5.dex */
public final class C10978x483f26e5 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public yz5.a f151100d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f151101e;

    /* renamed from: f, reason: collision with root package name */
    public final uu3.u f151102f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f151103g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f151104h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f151105i;

    /* renamed from: m, reason: collision with root package name */
    public nx0.g f151106m;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10978x483f26e5(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final void a() {
        setVisibility(0);
        setEnabled(false);
        uu3.u uVar = this.f151102f;
        uVar.l(-uVar.edgeAttached, false);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (isEnabled()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    /* renamed from: setBeautyOnlyMode */
    public final void m47336x8c1f850d(boolean z17) {
        int i17 = z17 ? 8 : 0;
        android.view.View view = this.f151103g;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("makeupBtn");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/beautify/BeautifyPanel", "setBeautyOnlyMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/shoot_composing/beautify/BeautifyPanel", "setBeautyOnlyMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f151104h;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("filterBtn");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/beautify/BeautifyPanel", "setBeautyOnlyMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/shoot_composing/beautify/BeautifyPanel", "setBeautyOnlyMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f151105i;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("faceEffectBtn");
            throw null;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/beautify/BeautifyPanel", "setBeautyOnlyMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/mj_publisher/finder/shoot_composing/beautify/BeautifyPanel", "setBeautyOnlyMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: setOnDismissListener */
    public final void m47337xc07e953d(yz5.a onDismiss) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onDismiss, "onDismiss");
        this.f151100d = onDismiss;
    }

    public /* synthetic */ C10978x483f26e5(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10978x483f26e5(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f151100d = nx0.m.f422694d;
        this.f151106m = nx0.g.f422641d;
        float b17 = i65.a.b(context, 232);
        vu3.h hVar = new vu3.h(context, 0, 0, 0, false, 30, null);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dwh, linearLayout);
        vu3.d dVar = new vu3.d(linearLayout);
        nx0.l lVar = new nx0.l(this);
        uu3.f fVar = new uu3.f();
        fVar.f512809a = b17;
        fVar.f512810b = hVar;
        fVar.f512811c = dVar;
        fVar.a(lVar);
        ((java.util.ArrayList) fVar.f512815g).add(new nx0.a(hVar));
        this.f151102f = fVar.b(this);
        setOnClickListener(new nx0.b(this));
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f564892rd5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        findViewById.setOnClickListener(new nx0.c(this));
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.rd8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f151103g = findViewById2;
        findViewById2.setOnClickListener(new nx0.d(this));
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.rd7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f151104h = findViewById3;
        findViewById3.setOnClickListener(new nx0.e(this));
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.rd6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f151105i = findViewById4;
        findViewById4.setOnClickListener(new nx0.f(this));
    }
}
