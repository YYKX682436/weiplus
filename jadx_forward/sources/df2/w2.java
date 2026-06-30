package df2;

/* loaded from: classes3.dex */
public final class w2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.a3 f313185d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f313186e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(df2.a3 a3Var, yz5.a aVar) {
        super(0);
        this.f313185d = a3Var;
        this.f313186e = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        df2.a3 a3Var = this.f313185d;
        android.view.View view = a3Var.f311194a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/FinderLiveMicCenterFadingAnimator$animateOut$2", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/FinderLiveMicCenterFadingAnimator$animateOut$2", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        a3Var.f311194a.setClipToOutline(false);
        for (android.view.View view2 : a3Var.f311197d) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/FinderLiveMicCenterFadingAnimator$animateOut$2", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/controller/FinderLiveMicCenterFadingAnimator$animateOut$2", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        yz5.a aVar = this.f313186e;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        return jz5.f0.f384359a;
    }
}
