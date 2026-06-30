package com.tencent.mm.mj_publisher.finder.shoot_composing.beautify;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0011B'\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0014\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u000e\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/shoot_composing/beautify/BeautifyPanel;", "Landroid/widget/FrameLayout;", "Lkotlin/Function0;", "Ljz5/f0;", "onDismiss", "setOnDismissListener", "", "onlyBeauty", "setBeautyOnlyMode", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "nx0/g", "plugin-vlog-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class BeautifyPanel extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public yz5.a f69567d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f69568e;

    /* renamed from: f, reason: collision with root package name */
    public final uu3.u f69569f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f69570g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f69571h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f69572i;

    /* renamed from: m, reason: collision with root package name */
    public nx0.g f69573m;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BeautifyPanel(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final void a() {
        setVisibility(0);
        setEnabled(false);
        uu3.u uVar = this.f69569f;
        uVar.l(-uVar.edgeAttached, false);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (isEnabled()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    public final void setBeautyOnlyMode(boolean z17) {
        int i17 = z17 ? 8 : 0;
        android.view.View view = this.f69570g;
        if (view == null) {
            kotlin.jvm.internal.o.o("makeupBtn");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/beautify/BeautifyPanel", "setBeautyOnlyMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/shoot_composing/beautify/BeautifyPanel", "setBeautyOnlyMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f69571h;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("filterBtn");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/beautify/BeautifyPanel", "setBeautyOnlyMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/shoot_composing/beautify/BeautifyPanel", "setBeautyOnlyMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f69572i;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("faceEffectBtn");
            throw null;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/beautify/BeautifyPanel", "setBeautyOnlyMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/mj_publisher/finder/shoot_composing/beautify/BeautifyPanel", "setBeautyOnlyMode", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void setOnDismissListener(yz5.a onDismiss) {
        kotlin.jvm.internal.o.g(onDismiss, "onDismiss");
        this.f69567d = onDismiss;
    }

    public /* synthetic */ BeautifyPanel(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeautifyPanel(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f69567d = nx0.m.f341161d;
        this.f69573m = nx0.g.f341108d;
        float b17 = i65.a.b(context, 232);
        vu3.h hVar = new vu3.h(context, 0, 0, 0, false, 30, null);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.dwh, linearLayout);
        vu3.d dVar = new vu3.d(linearLayout);
        nx0.l lVar = new nx0.l(this);
        uu3.f fVar = new uu3.f();
        fVar.f431276a = b17;
        fVar.f431277b = hVar;
        fVar.f431278c = dVar;
        fVar.a(lVar);
        ((java.util.ArrayList) fVar.f431282g).add(new nx0.a(hVar));
        this.f69569f = fVar.b(this);
        setOnClickListener(new nx0.b(this));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f483359rd5);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        findViewById.setOnClickListener(new nx0.c(this));
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.rd8);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f69570g = findViewById2;
        findViewById2.setOnClickListener(new nx0.d(this));
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.rd7);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f69571h = findViewById3;
        findViewById3.setOnClickListener(new nx0.e(this));
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.rd6);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f69572i = findViewById4;
        findViewById4.setOnClickListener(new nx0.f(this));
    }
}
