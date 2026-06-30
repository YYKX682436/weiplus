package yn2;

/* loaded from: classes2.dex */
public final class h implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yn2.m f545514d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f545515e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zn2.a f545516f;

    public h(yn2.m mVar, in5.s0 s0Var, zn2.a aVar) {
        this.f545514d = mVar;
        this.f545515e = s0Var;
        this.f545516f = aVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/megavideo/topstory/flow/convert/MegaVideoCardConvert$onBindViewHolder$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        yn2.m.n(this.f545514d, this.f545515e, view, this.f545516f, null);
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/megavideo/topstory/flow/convert/MegaVideoCardConvert$onBindViewHolder$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
