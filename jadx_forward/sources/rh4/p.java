package rh4;

/* loaded from: classes3.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lh4.b f477312d;

    public p(lh4.b bVar) {
        this.f477312d = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionSearchView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3) this.f477312d).s1();
        yj0.a.h(this, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionSearchView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
