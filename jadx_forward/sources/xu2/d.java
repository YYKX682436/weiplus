package xu2;

/* loaded from: classes8.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xu2.n f538734d;

    public d(xu2.n nVar) {
        this.f538734d = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xu2.n nVar = this.f538734d;
        android.view.ViewGroup viewGroup = nVar.f538749f;
        boolean z17 = false;
        if (viewGroup != null && viewGroup.getVisibility() == 0) {
            z17 = true;
        }
        if (!z17) {
            int[] iArr = new int[2];
            android.view.ViewGroup viewGroup2 = nVar.f538745b;
            viewGroup2.getLocationInWindow(iArr);
            int measuredHeight = iArr[1] + viewGroup2.getMeasuredHeight();
            android.view.ViewGroup viewGroup3 = nVar.f538752i;
            android.view.ViewGroup.LayoutParams layoutParams = viewGroup3 != null ? viewGroup3.getLayoutParams() : null;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin = measuredHeight;
            if (viewGroup3 != null) {
                viewGroup3.post(new xu2.m(nVar));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
