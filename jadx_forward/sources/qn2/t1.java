package qn2;

/* loaded from: classes3.dex */
public final class t1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn2.u1 f446690d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f446691e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(qn2.u1 u1Var, int i17) {
        super(0);
        this.f446690d = u1Var;
        this.f446691e = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        qn2.u1 u1Var = this.f446690d;
        android.view.View view = u1Var.f446704j;
        int i17 = this.f446691e;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardWinnerListWidget$setFooterTvVisibility$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardWinnerListWidget$setFooterTvVisibility$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView = u1Var.f446705k;
        if (textView != null) {
            textView.setVisibility(i17);
        }
        return jz5.f0.f384359a;
    }
}
