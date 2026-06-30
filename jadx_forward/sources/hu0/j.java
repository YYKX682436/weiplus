package hu0;

/* loaded from: classes5.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f366568d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hu0.l f366569e;

    public j(boolean z17, hu0.l lVar) {
        this.f366568d = z17;
        this.f366569e = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/composing_creation/preview/uic/ComposingCreationControlUIC$onViewCreated$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = this.f366568d;
        hu0.l lVar = this.f366569e;
        if (z17) {
            hu0.l.O6(lVar, "effect_modify_complete_reedit");
        }
        yz5.a aVar = lVar.f366574h;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/composing_creation/preview/uic/ComposingCreationControlUIC$onViewCreated$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
