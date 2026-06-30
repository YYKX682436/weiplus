package sc2;

/* loaded from: classes2.dex */
public final class v3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487836d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487837e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487838f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(android.view.View view, android.view.View view2, android.view.View view3) {
        super(0);
        this.f487836d = view;
        this.f487837e = view2;
        this.f487838f = view3;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View view = this.f487836d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperCombinationLayoutObserver$handleExpand$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/component/FeedJumperCombinationLayoutObserver$handleExpand$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f487837e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperCombinationLayoutObserver$handleExpand$1$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/component/FeedJumperCombinationLayoutObserver$handleExpand$1$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view3 = this.f487838f;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperCombinationLayoutObserver$handleExpand$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/feed/component/FeedJumperCombinationLayoutObserver$handleExpand$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view4 = this.f487837e;
        if (view4 instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view4;
            int childCount = viewGroup.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = viewGroup.getChildAt(i17);
                if (childAt != null) {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(java.lang.Float.valueOf(0.0f));
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(childAt, arrayList4.toArray(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperCombinationLayoutObserver$handleExpand$1$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    childAt.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
                    yj0.a.f(childAt, "com/tencent/mm/plugin/finder/feed/component/FeedJumperCombinationLayoutObserver$handleExpand$1$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    childAt.animate().alpha(1.0f).setDuration(250L).start();
                }
            }
        }
        android.view.View view5 = this.f487838f;
        if (view5 instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) view5;
            int childCount2 = viewGroup2.getChildCount();
            for (int i18 = 0; i18 < childCount2; i18++) {
                android.view.View childAt2 = viewGroup2.getChildAt(i18);
                if (childAt2 != null) {
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    arrayList5.add(java.lang.Float.valueOf(1.0f));
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(childAt2, arrayList5.toArray(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperCombinationLayoutObserver$handleExpand$1$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    childAt2.setAlpha(((java.lang.Float) arrayList5.get(0)).floatValue());
                    yj0.a.f(childAt2, "com/tencent/mm/plugin/finder/feed/component/FeedJumperCombinationLayoutObserver$handleExpand$1$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
