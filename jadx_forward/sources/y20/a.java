package y20;

/* loaded from: classes.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f540520d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qq.c f540521e;

    public a(yz5.l lVar, qq.c cVar) {
        this.f540520d = lVar;
        this.f540521e = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/ecs/test/EcsSettingDialog$OptionsAdapter$OptionViewHolder$bind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f540520d.mo146xb9724478(this.f540521e);
        yj0.a.h(this, "com/tencent/mm/feature/ecs/test/EcsSettingDialog$OptionsAdapter$OptionViewHolder$bind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
