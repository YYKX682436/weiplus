package lj2;

/* loaded from: classes3.dex */
public final class k0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lj2.o0 f400419d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(lj2.o0 o0Var) {
        super(0);
        this.f400419d = o0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        lj2.o0 o0Var = this.f400419d;
        o0Var.f400440g = 0;
        android.view.View view = o0Var.f400434a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/FinderLivePayMicLinkWidget$hideStatePanel$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/widget/FinderLivePayMicLinkWidget$hideStatePanel$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return jz5.f0.f384359a;
    }
}
