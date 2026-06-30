package a24;

/* loaded from: classes.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a24.i f878d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f879e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f880f;

    public f(a24.i iVar, in5.s0 s0Var, int i17) {
        this.f878d = iVar;
        this.f879e = s0Var;
        this.f880f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting_new/base/BaseSettingConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        in5.s0 s0Var = this.f879e;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.view.View itemView = s0Var.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        this.f878d.r7(context, itemView, this.f880f);
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting_new/base/BaseSettingConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
