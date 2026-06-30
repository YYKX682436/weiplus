package tw2;

/* loaded from: classes2.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy2.u6 f503995d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f503996e;

    public d(zy2.u6 u6Var, int i17) {
        this.f503995d = u6Var;
        this.f503996e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/adapter/FinderFeedAlbumAdapter$onBindView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        this.f503995d.a(this.f503996e, view);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/adapter/FinderFeedAlbumAdapter$onBindView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
