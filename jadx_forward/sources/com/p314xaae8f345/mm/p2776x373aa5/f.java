package com.p314xaae8f345.mm.p2776x373aa5;

/* loaded from: classes10.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f295121d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f295122e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f295123f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rn5.a f295124g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00, boolean z17, int i17, rn5.a aVar) {
        super(0);
        this.f295121d = c22801x87cbdc00;
        this.f295122e = z17;
        this.f295123f = i17;
        this.f295124g = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RLMoreLayout", "[onRequestRefresh]");
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = this.f295121d;
        c22801x87cbdc00.m82703x9365929(true);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c22801x87cbdc00.m82555x4905e9fa().mo7946xf939df19();
        if (mo7946xf939df19 != null) {
            mo7946xf939df19.mo1894x7e414b06();
        }
        android.view.View refreshHeader = c22801x87cbdc00.getRefreshHeader();
        if (refreshHeader != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(refreshHeader, arrayList.toArray(), "com/tencent/mm/view/RefreshLoadMoreLayout$onRequestRefresh$func$1", "invoke", "()Lkotlin/Unit;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            refreshHeader.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(refreshHeader, "com/tencent/mm/view/RefreshLoadMoreLayout$onRequestRefresh$func$1", "invoke", "()Lkotlin/Unit;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        c22801x87cbdc00.f294965u = false;
        c22801x87cbdc00.f294966v = false;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onRequestRefresh], stickTopLoadingLayout is null? ");
        sb6.append(c22801x87cbdc00.getStickTopLoadingLayout() == null);
        sb6.append(", hash:");
        ym5.q3 actionCallback = c22801x87cbdc00.getActionCallback();
        sb6.append(actionCallback != null ? java.lang.Integer.valueOf(actionCallback.hashCode()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RLMoreLayout", sb6.toString());
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00.StickTopLoadingLayout stickTopLoadingLayout = c22801x87cbdc00.getStickTopLoadingLayout();
        boolean z17 = this.f295122e;
        if (stickTopLoadingLayout != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e4 = stickTopLoadingLayout.progressBar;
            if (z17) {
                stickTopLoadingLayout.f294976f = true;
                c22627xa933f8e4.setVisibility(4);
                c22627xa933f8e4.e();
            } else {
                stickTopLoadingLayout.a(stickTopLoadingLayout.topLoadingOffsetLimit);
                stickTopLoadingLayout.f294976f = true;
                c22627xa933f8e4.setAlpha(1.0f);
                c22627xa933f8e4.setVisibility(0);
                c22627xa933f8e4.d();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RLMoreLayout", "onRefreshing isHideLoading = " + z17);
            ym5.q3 q3Var = stickTopLoadingLayout.actionCallback;
            if (q3Var != null) {
                q3Var.d(0, null, z17);
            }
        }
        ym5.q3 actionCallback2 = c22801x87cbdc00.getActionCallback();
        rn5.a aVar = this.f295124g;
        int i17 = this.f295123f;
        if (actionCallback2 != null) {
            actionCallback2.d(i17, aVar, z17);
        }
        ym5.q3 reportCallback = c22801x87cbdc00.getReportCallback();
        if (reportCallback == null) {
            return null;
        }
        reportCallback.d(i17, aVar, z17);
        return jz5.f0.f384359a;
    }
}
