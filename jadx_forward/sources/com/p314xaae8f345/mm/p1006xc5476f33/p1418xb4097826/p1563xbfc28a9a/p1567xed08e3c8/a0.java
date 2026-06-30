package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8;

/* loaded from: classes2.dex */
public final class a0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.c0 f202704d;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.c0 c0Var) {
        this.f202704d = c0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/member/preview/FinderMemberPreviewHeaderUIC$updateIntroHeight$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.c0 c0Var = this.f202704d;
        android.widget.TextView textView = c0Var.f202715i;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("previewIntro");
            throw null;
        }
        textView.setMaxLines(Integer.MAX_VALUE);
        android.widget.TextView textView2 = c0Var.f202717m;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("previewIntroExpend");
            throw null;
        }
        textView2.setVisibility(8);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/member/preview/FinderMemberPreviewHeaderUIC$updateIntroHeight$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
