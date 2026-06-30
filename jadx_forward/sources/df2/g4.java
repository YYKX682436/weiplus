package df2;

/* loaded from: classes3.dex */
public final class g4 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f311719d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.l4 f311720e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f311721f;

    public g4(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b, df2.l4 l4Var, android.view.View view) {
        this.f311719d = c22789xd23e9a9b;
        this.f311720e = l4Var;
        this.f311721f = view;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/FinderLiveSlideToCloseGuideController$showAnimGuide$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/FinderLiveSlideToCloseGuideController$showAnimGuide$2", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/FinderLiveSlideToCloseGuideController$showAnimGuide$2", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f311719d;
        if (c22789xd23e9a9b != null) {
            c22789xd23e9a9b.h();
        }
        this.f311720e.f312167r = true;
        boolean z17 = this.f311721f.getVisibility() == 0;
        yj0.a.i(z17, this, "com/tencent/mm/plugin/finder/live/controller/FinderLiveSlideToCloseGuideController$showAnimGuide$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z17;
    }
}
