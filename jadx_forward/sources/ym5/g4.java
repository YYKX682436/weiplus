package ym5;

/* loaded from: classes10.dex */
public final class g4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f544875d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f544876e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00, int i17) {
        super(0);
        this.f544875d = c22801x87cbdc00;
        this.f544876e = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View findViewById;
        android.widget.TextView textView;
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = this.f544875d;
        android.view.View view = c22801x87cbdc00.f294968x;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/view/RefreshLoadMoreLayout$onFinishLoadMore$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/view/RefreshLoadMoreLayout$onFinishLoadMore$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = c22801x87cbdc00.f294968x;
        if (view2 != null && (textView = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.ili)) != null) {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572001vx);
        }
        android.view.View view3 = c22801x87cbdc00.f294968x;
        if (view3 != null && (findViewById = view3.findViewById(com.p314xaae8f345.mm.R.id.ilg)) != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/view/RefreshLoadMoreLayout$onFinishLoadMore$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/view/RefreshLoadMoreLayout$onFinishLoadMore$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        ym5.s3 s3Var = new ym5.s3(-1);
        s3Var.f545056h = this.f544876e;
        ym5.q3 actionCallback = c22801x87cbdc00.getActionCallback();
        if (actionCallback != null) {
            actionCallback.c(s3Var);
        }
        return jz5.f0.f384359a;
    }
}
