package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class zr extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.as f192822d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zr(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.as asVar) {
        super(0);
        this.f192822d = asVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View view;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var = this.f192822d.f188690f;
        android.view.View findViewById = (a1Var == null || (view = a1Var.f187719s) == null) ? null : view.findViewById(com.p314xaae8f345.mm.R.id.ilh);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderRecommendReasonContract$Presenter$loadMoreData$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderRecommendReasonContract$Presenter$loadMoreData$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f384359a;
    }
}
