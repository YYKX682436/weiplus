package ym5;

/* loaded from: classes10.dex */
public final class q4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f545013d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f545014e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00, ym5.s3 s3Var) {
        super(0);
        this.f545013d = c22801x87cbdc00;
        this.f545014e = s3Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17;
        int[] iArr = new int[2];
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = this.f545013d;
        android.view.View view = c22801x87cbdc00.f294968x;
        if (view != null) {
            view.getLocationInWindow(iArr);
            int i18 = iArr[1];
            android.graphics.Rect rect = new android.graphics.Rect();
            i17 = c22801x87cbdc00.getGlobalVisibleRect(rect) ? (rect.bottom + c22801x87cbdc00.getParentTranslation()) - i18 : (int) (c22801x87cbdc00.getTranslationY() - (-c22801x87cbdc00.A));
        } else {
            i17 = 0;
        }
        float translationY = c22801x87cbdc00.getTranslationY() + i17;
        this.f545014e.f545057i = i17 > 0;
        if (c22801x87cbdc00.m82665x743f349d()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RLMoreLayout", "onPreFinishLoadMoreSmooth " + c22801x87cbdc00.getTranslationY() + " rectHeight:" + i17 + " targetY:" + translationY);
        }
        int i19 = c22801x87cbdc00.A;
        if (translationY >= (-i19)) {
            translationY = -i19;
        }
        c22801x87cbdc00.setTranslationY(translationY);
        c22801x87cbdc00.m82555x4905e9fa().scrollBy(0, i17);
        android.view.View view2 = c22801x87cbdc00.f294968x;
        if (view2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/view/RefreshLoadMoreLayout$onPreFinishLoadMoreSmooth$1$innerFunc$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/view/RefreshLoadMoreLayout$onPreFinishLoadMoreSmooth$1$innerFunc$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f384359a;
    }
}
