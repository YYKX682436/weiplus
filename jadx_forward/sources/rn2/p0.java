package rn2;

/* loaded from: classes5.dex */
public final class p0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f479349d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rn2.c1 f479350e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(int i17, rn2.c1 c1Var) {
        super(0);
        this.f479349d = i17;
        this.f479350e = c1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = this.f479349d;
        java.lang.String string = i17 == 1 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lis) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.liq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        rn2.g gVar = this.f479350e.f479200g;
        if (gVar != null) {
            boolean z17 = i17 == 1;
            rn2.t2 t2Var = (rn2.t2) gVar;
            android.widget.TextView textView = t2Var.f479396p0;
            if (textView != null) {
                textView.setText(string);
            }
            android.view.View view = t2Var.A1;
            if (view != null) {
                int i18 = z17 ? 0 : 8;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(i18));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "prefillGiftDistribute", "(Ljava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "prefillGiftDistribute", "(Ljava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        return jz5.f0.f384359a;
    }
}
