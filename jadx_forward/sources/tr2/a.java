package tr2;

/* loaded from: classes5.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f502907d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tr2.l f502908e;

    public a(yz5.l lVar, tr2.l lVar2) {
        this.f502907d = lVar;
        this.f502908e = lVar2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/post/interactioneasteregg/InteractionEasterEggAddHalfScreen$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        tr2.l lVar = this.f502908e;
        this.f502907d.mo146xb9724478(lVar.f502934m);
        lVar.f502922a.q();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/post/interactioneasteregg/InteractionEasterEggAddHalfScreen$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
