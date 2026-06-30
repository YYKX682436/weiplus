package ov3;

/* loaded from: classes5.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ov3.b f430711d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f430712e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rv3.h f430713f;

    public a(ov3.b bVar, in5.s0 s0Var, rv3.h hVar) {
        this.f430711d = bVar;
        this.f430712e = s0Var;
        this.f430713f = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/ui/editor/music/finder/item/MusicPickerFeedItemConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ev3.b bVar = this.f430711d.f481918f;
        iv3.b bVar2 = bVar instanceof iv3.b ? (iv3.b) bVar : null;
        if (bVar2 != null) {
            in5.s0 s0Var = this.f430712e;
            android.view.View itemView = s0Var.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
            bVar2.Y(itemView, this.f430713f, s0Var.m8183xf806b362());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/ui/editor/music/finder/item/MusicPickerFeedItemConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
