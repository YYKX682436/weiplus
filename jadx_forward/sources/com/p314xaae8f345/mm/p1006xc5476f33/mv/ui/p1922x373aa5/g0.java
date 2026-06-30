package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

/* loaded from: classes10.dex */
public final class g0 implements com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.o3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16687xe732929a f233362a;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16687xe732929a c16687xe732929a) {
        this.f233362a = c16687xe732929a;
    }

    public void a(int i17, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.t3 data, int i18, android.view.View itemView, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        int i27 = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16687xe732929a.B1;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16687xe732929a c16687xe732929a = this.f233362a;
        if (!c16687xe732929a.h()) {
            boolean z17 = c16687xe732929a.f233177y1;
            p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
            p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
            if (!z17) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = recyclerView.getLayoutManager();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(layoutManager);
                int m8016xfbd72d54 = layoutManager.m8016xfbd72d54(itemView) - layoutManager.m8031xf39fff7a();
                int computeVerticalScrollRange = recyclerView.computeVerticalScrollRange();
                int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                int height = recyclerView.getHeight();
                itemView.getHeight();
                f0Var.f391649d = java.lang.Math.max(0, java.lang.Math.min(m8016xfbd72d54, ((computeVerticalScrollRange - computeVerticalScrollOffset) - height) + (c16687xe732929a.f233164p1 - c16687xe732929a.f233158l1)));
            }
            c16687xe732929a.i(true, new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.e0(f0Var, f0Var2, recyclerView), new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.f0(itemView, c16687xe732929a, data));
            return;
        }
        r45.oc5 oc5Var = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16648x604060db.f232392d;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16648x604060db.f232392d = c16687xe732929a.f(pm0.v.u(data.f233484a), java.lang.String.valueOf(i19));
        android.content.Intent intent = new android.content.Intent(c16687xe732929a.getContext(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16648x604060db.class);
        if (c16687xe732929a.getContext() instanceof android.app.Activity) {
            android.content.Context context = c16687xe732929a.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            android.app.Activity activity = (android.app.Activity) context;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(10041);
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/view/MusicMVCardChooseView$fragmentItemClickedListener$1", "onItemClicked", "(ILcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsItemData;ILandroid/view/View;Landroidx/recyclerview/widget/RecyclerView;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        }
    }
}
