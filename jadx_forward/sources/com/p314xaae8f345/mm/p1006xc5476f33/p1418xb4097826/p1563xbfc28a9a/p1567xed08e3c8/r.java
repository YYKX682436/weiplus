package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8;

/* loaded from: classes2.dex */
public final class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.c0 f202805d;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.c0 c0Var) {
        this.f202805d = c0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/member/preview/FinderMemberPreviewHeaderUIC$onError$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.c0 c0Var = this.f202805d;
        c0Var.S6();
        android.view.ViewGroup viewGroup = c0Var.H;
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emptyView");
            throw null;
        }
        viewGroup.setVisibility(0);
        android.widget.TextView textView = c0Var.I;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("retryView");
            throw null;
        }
        textView.setVisibility(8);
        android.widget.ProgressBar progressBar = c0Var.f202710J;
        if (progressBar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("progressView");
            throw null;
        }
        progressBar.setVisibility(0);
        android.view.ViewGroup viewGroup2 = c0Var.H;
        if (viewGroup2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emptyView");
            throw null;
        }
        viewGroup2.setOnClickListener(null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/member/preview/FinderMemberPreviewHeaderUIC$onError$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
