package ym5;

/* loaded from: classes10.dex */
public final class m4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f544969d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f544970e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00, ym5.s3 s3Var) {
        super(0);
        this.f544969d = c22801x87cbdc00;
        this.f544970e = s3Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View findViewById;
        android.view.View findViewById2;
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = this.f544969d;
        c22801x87cbdc00.animate().cancel();
        ym5.s3 s3Var = this.f544970e;
        int a17 = com.p314xaae8f345.mm.p2776x373aa5.e.a(c22801x87cbdc00, s3Var);
        s3Var.f545057i = a17 > 0;
        if (s3Var.f545058j) {
            c22801x87cbdc00.setTranslationY(c22801x87cbdc00.getTranslationY() + a17);
            android.view.View view = c22801x87cbdc00.f294968x;
            if (view != null && view.getVisibility() == 0) {
                s3Var.f545059k = true;
            }
            android.view.View view2 = c22801x87cbdc00.f294968x;
            if (view2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(4);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/view/RefreshLoadMoreLayout$onFinishRefresh2$1$innerFunc$1", "invoke", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/view/RefreshLoadMoreLayout$onFinishRefresh2$1$innerFunc$1", "invoke", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        float f17 = -c22801x87cbdc00.A;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RLMoreLayout", "[onFinishRefresh2] targetY=" + f17 + " isSliceNoShowLoadingRefresh=" + s3Var.f545058j);
        if (!s3Var.f545058j) {
            c22801x87cbdc00.setTranslationY(f17);
        }
        android.view.View refreshHeader = c22801x87cbdc00.getRefreshHeader();
        if (refreshHeader != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(refreshHeader, arrayList2.toArray(), "com/tencent/mm/view/RefreshLoadMoreLayout$onFinishRefresh2$1$innerFunc$1", "invoke", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            refreshHeader.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(refreshHeader, "com/tencent/mm/view/RefreshLoadMoreLayout$onFinishRefresh2$1$innerFunc$1", "invoke", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View refreshHeader2 = c22801x87cbdc00.getRefreshHeader();
        if (refreshHeader2 != null && (findViewById2 = refreshHeader2.findViewById(com.p314xaae8f345.mm.R.id.m6l)) != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/view/RefreshLoadMoreLayout$onFinishRefresh2$1$innerFunc$1", "invoke", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/view/RefreshLoadMoreLayout$onFinishRefresh2$1$innerFunc$1", "invoke", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View refreshHeader3 = c22801x87cbdc00.getRefreshHeader();
        if (refreshHeader3 == null || (findViewById = refreshHeader3.findViewById(com.p314xaae8f345.mm.R.id.lr6)) == null) {
            return null;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(findViewById, arrayList4.toArray(), "com/tencent/mm/view/RefreshLoadMoreLayout$onFinishRefresh2$1$innerFunc$1", "invoke", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/view/RefreshLoadMoreLayout$onFinishRefresh2$1$innerFunc$1", "invoke", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return findViewById;
    }
}
