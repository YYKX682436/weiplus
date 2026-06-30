package sc2;

/* loaded from: classes2.dex */
public final class c2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487333d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487334e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f487335f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487336g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(android.view.View view, android.view.View view2, android.view.ViewGroup viewGroup, android.view.View view3) {
        super(0);
        this.f487333d = view;
        this.f487334e = view2;
        this.f487335f = viewGroup;
        this.f487336g = view3;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View view = this.f487333d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver$originalExpandAnimate$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver$originalExpandAnimate$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f487333d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver$originalExpandAnimate$1$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver$originalExpandAnimate$1$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view3 = this.f487334e;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver$originalExpandAnimate$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver$originalExpandAnimate$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f487335f.animate().setDuration(300L).alpha(1.0f);
        android.view.View view4 = this.f487336g;
        if (view4.getVisibility() == 0) {
            view4.animate().setDuration(300L).alpha(1.0f);
        }
        return jz5.f0.f384359a;
    }
}
