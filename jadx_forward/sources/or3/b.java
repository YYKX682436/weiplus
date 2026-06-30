package or3;

/* loaded from: classes11.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1960x9f5a7715.C16879x6e8fc134 f429220d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1960x9f5a7715.C16879x6e8fc134 c16879x6e8fc134) {
        this.f429220d = c16879x6e8fc134;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/mod/permission_view/PermissionView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1960x9f5a7715.C16879x6e8fc134 c16879x6e8fc134 = this.f429220d;
        if (!((c16879x6e8fc134.permission & 8) != 0)) {
            c16879x6e8fc134.m67652x522c30fa(true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/mod/permission_view/PermissionView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
