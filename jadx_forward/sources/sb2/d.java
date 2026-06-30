package sb2;

/* loaded from: classes3.dex */
public final class d implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f486941d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sb2.i f486942e;

    public d(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b, sb2.i iVar) {
        this.f486941d = c22789xd23e9a9b;
        this.f486942e = iVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/convertcontroller/FinderLiveSlideEnterLiveTipController$showAnimGuide$1$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue = ((java.lang.Integer) arrayList2.get(0)).intValue();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(java.lang.Integer.valueOf(intValue));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/convertcontroller/FinderLiveSlideEnterLiveTipController$showAnimGuide$1$1", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/convert/convertcontroller/FinderLiveSlideEnterLiveTipController$showAnimGuide$1$1", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(view, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f486941d;
        if (c22789xd23e9a9b != null) {
            c22789xd23e9a9b.h();
        }
        android.view.ViewGroup viewGroup = this.f486942e.f486949g;
        if (viewGroup != null) {
            pm0.v.B(viewGroup);
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/convert/convertcontroller/FinderLiveSlideEnterLiveTipController$showAnimGuide$1$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
