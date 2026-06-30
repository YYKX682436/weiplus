package xu2;

/* loaded from: classes8.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xu2.n f538738d;

    public h(xu2.n nVar) {
        this.f538738d = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xu2.n nVar = this.f538738d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(nVar.f538748e, "click reason 2");
        android.view.ViewGroup viewGroup = nVar.f538749f;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        android.view.View view2 = nVar.f538750g;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget", "showFeedBackFrameTwo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget", "showFeedBackFrameTwo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view3 = nVar.f538751h;
        if (view3 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget", "showFeedBackFrameTwo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget", "showFeedBackFrameTwo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        nVar.f538753j = -1;
        android.view.View findViewById = view3 != null ? view3.findViewById(com.p314xaae8f345.mm.R.id.dz6) : null;
        if (findViewById != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            android.view.View view4 = findViewById;
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget", "showFeedBackFrameTwo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget", "showFeedBackFrameTwo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.util.Iterator it = nVar.f538754k.iterator();
        while (it.hasNext()) {
            jz5.l lVar = (jz5.l) it.next();
            android.widget.TextView textView = (android.widget.TextView) lVar.f384366d;
            if (textView != null) {
                textView.setTextColor(nVar.f538744a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96));
            }
            android.view.View view5 = (android.view.View) lVar.f384367e;
            if (view5 != null) {
                view5.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563210zt);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
