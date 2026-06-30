package ec3;

/* loaded from: classes.dex */
public final class q1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f332616d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f332617e;

    public q1(android.view.View view, yz5.a aVar) {
        this.f332616d = view;
        this.f332617e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f332616d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/recommend/LuckyMoneyRecommendUtil$doTranslateAnimation$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/recommend/LuckyMoneyRecommendUtil$doTranslateAnimation$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yz5.a aVar = this.f332617e;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }
}
