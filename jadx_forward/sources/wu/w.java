package wu;

/* loaded from: classes8.dex */
public final class w implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wu.x f531169d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f531170e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hu.b f531171f;

    public w(wu.x xVar, android.widget.FrameLayout frameLayout, hu.b bVar) {
        this.f531169d = xVar;
        this.f531170e = frameLayout;
        this.f531171f = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/appmsg/ui/item/RecordDetailFileItemConvert$onBindContainerView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f531170e.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        this.f531169d.r(context, this.f531171f);
        yj0.a.h(this, "com/tencent/mm/feature/appmsg/ui/item/RecordDetailFileItemConvert$onBindContainerView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
