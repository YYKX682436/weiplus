package ox2;

/* loaded from: classes.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1669x49fc1889.C15408x626e05e f431190d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f431191e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1669x49fc1889.C15408x626e05e c15408x626e05e, android.view.View view) {
        super(0);
        this.f431190d = c15408x626e05e;
        this.f431191e = view;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1669x49fc1889.C15408x626e05e c15408x626e05e = this.f431190d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15276x168ec665 c15276x168ec665 = c15408x626e05e.f213906h;
        if (c15276x168ec665 != null) {
            c15276x168ec665.setAlpha(0.0f);
        }
        android.widget.TextView textView = c15408x626e05e.f213905g;
        if (textView != null) {
            textView.setAlpha(0.0f);
        }
        android.view.View view = this.f431191e;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/interactioneasteregg/CenterInteractionEasterEgg$hideAnimation$1$onComplete$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/view/interactioneasteregg/CenterInteractionEasterEgg$hideAnimation$1$onComplete$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (view != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/interactioneasteregg/CenterInteractionEasterEgg$hideAnimation$1$onComplete$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/view/interactioneasteregg/CenterInteractionEasterEgg$hideAnimation$1$onComplete$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        return jz5.f0.f384359a;
    }
}
