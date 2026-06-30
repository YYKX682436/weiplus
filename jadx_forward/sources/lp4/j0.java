package lp4;

/* loaded from: classes5.dex */
public final class j0 extends yt3.a implements android.view.View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f401896f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2334x43cb00ee.p2337x373aa5.GestureDetectorOnGestureListenerC18820x40894c4b f401897g;

    /* renamed from: h, reason: collision with root package name */
    public final android.content.Context f401898h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f401899i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.RectF f401900m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.RectF f401901n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(android.view.ViewGroup parent, ju3.d0 status) {
        super(status, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        android.view.View findViewById = parent.findViewById(com.p314xaae8f345.mm.R.id.gws);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f401896f = findViewById;
        android.view.View findViewById2 = parent.findViewById(com.p314xaae8f345.mm.R.id.cmy);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2334x43cb00ee.p2337x373aa5.GestureDetectorOnGestureListenerC18820x40894c4b gestureDetectorOnGestureListenerC18820x40894c4b = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2334x43cb00ee.p2337x373aa5.GestureDetectorOnGestureListenerC18820x40894c4b) findViewById2;
        this.f401897g = gestureDetectorOnGestureListenerC18820x40894c4b;
        this.f401898h = parent.getContext();
        android.view.View findViewById3 = parent.findViewById(com.p314xaae8f345.mm.R.id.gwk);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f401899i = findViewById3;
        this.f401900m = new android.graphics.RectF(0.0f, 0.0f, i65.a.B(r3) * 1.0f, i65.a.k(r3) * 1.0f);
        this.f401901n = new android.graphics.RectF(0.0f, 0.0f, 0.0f, 0.0f);
        findViewById.setOnClickListener(this);
        android.view.View findViewById4 = gestureDetectorOnGestureListenerC18820x40894c4b.findViewById(com.p314xaae8f345.mm.R.id.o86);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        new yt3.q((android.widget.ImageView) findViewById4, status).f546866e = "HalfScreenBack";
        gestureDetectorOnGestureListenerC18820x40894c4b.findViewById(com.p314xaae8f345.mm.R.id.d8o).setOnClickListener(new lp4.h0(this));
        findViewById3.setOnClickListener(new lp4.i0(status));
    }

    @Override // yt3.r2
    /* renamed from: onBackPress */
    public boolean mo9064x4ceae47d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2334x43cb00ee.p2337x373aa5.GestureDetectorOnGestureListenerC18820x40894c4b gestureDetectorOnGestureListenerC18820x40894c4b = this.f401897g;
        if (gestureDetectorOnGestureListenerC18820x40894c4b.getVisibility() != 0 || this.f401899i.getVisibility() != 0) {
            return false;
        }
        gestureDetectorOnGestureListenerC18820x40894c4b.setVisibility(4);
        android.view.View view = this.f401896f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/timelineeditor/TimelineEditorHalfScreenPlugin", "onBackPress", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/vlog/ui/timelineeditor/TimelineEditorHalfScreenPlugin", "onBackPress", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ju3.d0.k(this.f546865d, ju3.c0.C2, null, 2, null);
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/timelineeditor/TimelineEditorHalfScreenPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.gws) {
            ju3.d0.k(this.f546865d, ju3.c0.B2, null, 2, null);
            android.view.View view2 = this.f401896f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/vlog/ui/timelineeditor/TimelineEditorHalfScreenPlugin", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/vlog/ui/timelineeditor/TimelineEditorHalfScreenPlugin", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f401897g.setVisibility(0);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/timelineeditor/TimelineEditorHalfScreenPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
