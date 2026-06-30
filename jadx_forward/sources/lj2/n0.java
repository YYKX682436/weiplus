package lj2;

/* loaded from: classes3.dex */
public final class n0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lj2.o0 f400430d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(lj2.o0 o0Var) {
        super(0);
        this.f400430d = o0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        lj2.o0 o0Var = this.f400430d;
        android.view.View view = o0Var.f400434a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/FinderLivePayMicLinkWidget$showStatePanel$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/widget/FinderLivePayMicLinkWidget$showStatePanel$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        lj2.m0 m0Var = lj2.m0.f400423d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14313x19517c77 c14313x19517c77 = o0Var.f400436c;
        c14313x19517c77.animate().translationX(0.0f).setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.u4(c14313x19517c77, m0Var)).setDuration(500L).start();
        return jz5.f0.f384359a;
    }
}
