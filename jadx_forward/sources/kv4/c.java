package kv4;

/* loaded from: classes.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f394222d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.view.View view) {
        super(0);
        this.f394222d = view;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View findViewById = this.f394222d.findViewById(com.p314xaae8f345.mm.R.id.f566613tz4);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/websearch/teach/base/box/FTSGlobalTeachHotSearchTitleViewHolder$refreshBtn$2", "invoke", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/websearch/teach/base/box/FTSGlobalTeachHotSearchTitleViewHolder$refreshBtn$2", "invoke", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById2 = findViewById.findViewById(com.p314xaae8f345.mm.R.id.uxs);
        if (findViewById2 != null) {
            pv4.b.d(findViewById2, 18.0f);
        }
        if (findViewById2 != null) {
            pv4.b.c(findViewById2, 18.0f);
        }
        return findViewById;
    }
}
