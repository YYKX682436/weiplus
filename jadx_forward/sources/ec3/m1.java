package ec3;

/* loaded from: classes.dex */
public final class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f332590d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f332591e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f332592f;

    public m1(float f17, android.view.View view, yz5.a aVar) {
        this.f332590d = f17;
        this.f332591e = view;
        this.f332592f = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f332590d == 0.0f) {
            android.view.View view = this.f332591e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/recommend/LuckyMoneyRecommendUtil$doAlphaAnimation$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/recommend/LuckyMoneyRecommendUtil$doAlphaAnimation$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        yz5.a aVar = this.f332592f;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }
}
