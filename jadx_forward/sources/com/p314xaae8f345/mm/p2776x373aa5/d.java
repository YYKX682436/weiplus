package com.p314xaae8f345.mm.p2776x373aa5;

/* loaded from: classes10.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f295053d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f295054e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00, int i17) {
        super(0);
        this.f295053d = c22801x87cbdc00;
        this.f295054e = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View findViewById;
        android.view.View findViewById2;
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = this.f295053d;
        android.view.View refreshHeader = c22801x87cbdc00.getRefreshHeader();
        if (refreshHeader != null && (findViewById2 = refreshHeader.findViewById(com.p314xaae8f345.mm.R.id.m6l)) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/view/RefreshLoadMoreLayout$onFinishRefresh$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/view/RefreshLoadMoreLayout$onFinishRefresh$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View refreshHeader2 = c22801x87cbdc00.getRefreshHeader();
        if (refreshHeader2 != null && (findViewById = refreshHeader2.findViewById(com.p314xaae8f345.mm.R.id.lr6)) != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/view/RefreshLoadMoreLayout$onFinishRefresh$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/view/RefreshLoadMoreLayout$onFinishRefresh$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View refreshHeader3 = c22801x87cbdc00.getRefreshHeader();
        if (refreshHeader3 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(4);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(refreshHeader3, arrayList3.toArray(), "com/tencent/mm/view/RefreshLoadMoreLayout$onFinishRefresh$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            refreshHeader3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(refreshHeader3, "com/tencent/mm/view/RefreshLoadMoreLayout$onFinishRefresh$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        ym5.s3 s3Var = new ym5.s3(-1);
        s3Var.f545056h = this.f295054e;
        c22801x87cbdc00.Q = false;
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00.StickTopLoadingLayout stickTopLoadingLayout = c22801x87cbdc00.getStickTopLoadingLayout();
        if (stickTopLoadingLayout != null) {
            stickTopLoadingLayout.f294976f = false;
            stickTopLoadingLayout.b();
            ym5.q3 q3Var = stickTopLoadingLayout.actionCallback;
            if (q3Var != null) {
                q3Var.e(s3Var);
            }
        }
        ym5.q3 actionCallback = c22801x87cbdc00.getActionCallback();
        if (actionCallback != null) {
            actionCallback.e(s3Var);
        }
        ym5.q3 reportCallback = c22801x87cbdc00.getReportCallback();
        if (reportCallback != null) {
            reportCallback.e(s3Var);
        }
        return jz5.f0.f384359a;
    }
}
