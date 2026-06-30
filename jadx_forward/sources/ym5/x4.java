package ym5;

/* loaded from: classes2.dex */
public final class x4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f545105d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00) {
        super(0);
        this.f545105d = c22801x87cbdc00;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View findViewById;
        android.view.View findViewById2;
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = this.f545105d;
        android.view.View refreshHeader = c22801x87cbdc00.getRefreshHeader();
        if (refreshHeader != null && (findViewById2 = refreshHeader.findViewById(com.p314xaae8f345.mm.R.id.m6l)) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/view/RefreshLoadMoreLayout$setHasTopMoreDelay$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/view/RefreshLoadMoreLayout$setHasTopMoreDelay$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View refreshHeader2 = c22801x87cbdc00.getRefreshHeader();
        if (refreshHeader2 != null && (findViewById = refreshHeader2.findViewById(com.p314xaae8f345.mm.R.id.lr6)) != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/view/RefreshLoadMoreLayout$setHasTopMoreDelay$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/view/RefreshLoadMoreLayout$setHasTopMoreDelay$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View refreshHeader3 = c22801x87cbdc00.getRefreshHeader();
        if (refreshHeader3 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(4);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(refreshHeader3, arrayList3.toArray(), "com/tencent/mm/view/RefreshLoadMoreLayout$setHasTopMoreDelay$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            refreshHeader3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(refreshHeader3, "com/tencent/mm/view/RefreshLoadMoreLayout$setHasTopMoreDelay$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        c22801x87cbdc00.m82694x51948852(true);
        return jz5.f0.f384359a;
    }
}
