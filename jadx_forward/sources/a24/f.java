package a24;

/* loaded from: classes.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a24.i f82411d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f82412e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f82413f;

    public f(a24.i iVar, in5.s0 s0Var, int i17) {
        this.f82411d = iVar;
        this.f82412e = s0Var;
        this.f82413f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting_new/base/BaseSettingConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        in5.s0 s0Var = this.f82412e;
        android.content.Context context = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        android.view.View itemView = s0Var.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        this.f82411d.r7(context, itemView, this.f82413f);
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting_new/base/BaseSettingConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
