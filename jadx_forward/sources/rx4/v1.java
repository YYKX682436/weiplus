package rx4;

/* loaded from: classes.dex */
public final class v1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx4.h2 f482844d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(rx4.h2 h2Var) {
        super(0);
        this.f482844d = h2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View mo144222x4ff8c0f0 = this.f482844d.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.vbs);
        if (mo144222x4ff8c0f0 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(mo144222x4ff8c0f0, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSTeachViewUIC$setTeachViewVisibility$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo144222x4ff8c0f0.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(mo144222x4ff8c0f0, "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSTeachViewUIC$setTeachViewVisibility$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f384359a;
    }
}
