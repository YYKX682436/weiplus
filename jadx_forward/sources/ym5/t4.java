package ym5;

/* loaded from: classes10.dex */
public final class t4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f545071d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f545072e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(int i17, com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00) {
        super(0);
        this.f545071d = i17;
        this.f545072e = c22801x87cbdc00;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onRequestLoadMore] loadMoreType:");
        int i17 = this.f545071d;
        sb6.append(i17);
        sb6.append(" isShowLoadMoreLoading:");
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = this.f545072e;
        sb6.append(c22801x87cbdc00.isShowLoadMoreLoading);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RLMoreLayout", sb6.toString());
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c22801x87cbdc00.m82555x4905e9fa().mo7946xf939df19();
        if (mo7946xf939df19 != null) {
            mo7946xf939df19.mo1894x7e414b06();
        }
        if (c22801x87cbdc00.isShowLoadMoreLoading) {
            android.view.View view = c22801x87cbdc00.f294968x;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/view/RefreshLoadMoreLayout$onRequestLoadMore$func$1", "invoke", "()Lkotlin/Unit;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/view/RefreshLoadMoreLayout$onRequestLoadMore$func$1", "invoke", "()Lkotlin/Unit;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            android.view.View view2 = c22801x87cbdc00.f294968x;
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(4);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/view/RefreshLoadMoreLayout$onRequestLoadMore$func$1", "invoke", "()Lkotlin/Unit;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/view/RefreshLoadMoreLayout$onRequestLoadMore$func$1", "invoke", "()Lkotlin/Unit;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        c22801x87cbdc00.f294965u = false;
        c22801x87cbdc00.f294966v = false;
        ym5.q3 actionCallback = c22801x87cbdc00.getActionCallback();
        if (actionCallback == null) {
            return null;
        }
        actionCallback.b(i17);
        return jz5.f0.f384359a;
    }
}
