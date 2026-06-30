package jx2;

/* loaded from: classes3.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jx2.h f383946d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f383947e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jx2.a f383948f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f383949g;

    public f(jx2.h hVar, android.view.View view, jx2.a aVar, boolean z17, android.content.Context context) {
        this.f383946d = hVar;
        this.f383947e = view;
        this.f383948f = aVar;
        this.f383949g = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/feedback/FinderAdFeedbackController$showSecondPage$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        jx2.h hVar = this.f383946d;
        hVar.getClass();
        android.view.View view2 = this.f383947e;
        int i17 = com.p314xaae8f345.mm.R.id.lks;
        android.widget.TextView textView = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.lks);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view2.findViewById(com.p314xaae8f345.mm.R.id.lkn);
        java.util.List list = hVar.f383962j;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 c21475x81dbaa18 = hVar.f383958f;
        android.content.Context context = this.f383949g;
        if (c21475x81dbaa18 != null) {
            int childCount = c21475x81dbaa18.getChildCount();
            int i18 = 0;
            while (i18 < childCount) {
                android.view.View childAt = c21475x81dbaa18.getChildAt(i18);
                if (childAt != null) {
                    android.widget.TextView textView2 = (android.widget.TextView) childAt.findViewById(i17);
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) childAt.findViewById(com.p314xaae8f345.mm.R.id.lkn);
                    if (textView2 != null) {
                        textView2.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
                    }
                    if (c22699x3dcdb3522 != null) {
                        c22699x3dcdb3522.m82040x7541828(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
                    }
                    childAt.setBackgroundDrawable(context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563061vn));
                }
                i18++;
                i17 = com.p314xaae8f345.mm.R.id.lks;
            }
        }
        java.util.ArrayList arrayList2 = (java.util.ArrayList) list;
        jx2.a aVar = this.f383948f;
        if (arrayList2.contains(aVar)) {
            arrayList2.clear();
        } else {
            arrayList2.clear();
            arrayList2.add(aVar);
            if (textView != null) {
                textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
            }
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.m82040x7541828(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
            }
            view2.setBackgroundDrawable(context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563062vo));
        }
        hVar.c(context);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/feedback/FinderAdFeedbackController$showSecondPage$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
