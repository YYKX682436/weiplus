package y20;

/* loaded from: classes.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f540543d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qq.g f540544e;

    public l(yz5.p pVar, qq.g gVar) {
        this.f540543d = pVar;
        this.f540544e = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/ecs/test/EcsTestAdapter$SwitchViewHolder$bind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        this.f540543d.mo149xb9724478(this.f540544e, context);
        yj0.a.h(this, "com/tencent/mm/feature/ecs/test/EcsTestAdapter$SwitchViewHolder$bind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
