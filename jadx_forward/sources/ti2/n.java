package ti2;

/* loaded from: classes.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f501103d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f501104e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f501105f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f501106g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(android.view.View view, android.widget.TextView textView, android.view.View view2, android.view.View view3) {
        super(0);
        this.f501103d = view;
        this.f501104e = textView;
        this.f501105f = view2;
        this.f501106g = view3;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View view = this.f501103d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/convert/MicVisitorLinkUserConvert$onBindViewHolder$1$loadingBlock$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/pk/convert/MicVisitorLinkUserConvert$onBindViewHolder$1$loadingBlock$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f501104e.setVisibility(4);
        android.view.View view2 = this.f501105f;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/convert/MicVisitorLinkUserConvert$onBindViewHolder$1$loadingBlock$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/pk/convert/MicVisitorLinkUserConvert$onBindViewHolder$1$loadingBlock$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view3 = this.f501106g;
        if (view3 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(4);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/convert/MicVisitorLinkUserConvert$onBindViewHolder$1$loadingBlock$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/mic/pk/convert/MicVisitorLinkUserConvert$onBindViewHolder$1$loadingBlock$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f384359a;
    }
}
