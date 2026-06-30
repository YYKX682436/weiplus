package uy3;

/* loaded from: classes8.dex */
public final class v0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.box.C17272xd6a1a6fd f513531d;

    public v0(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.box.C17272xd6a1a6fd c17272xd6a1a6fd) {
        this.f513531d = c17272xd6a1a6fd;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/scanner/box/ScanOCRDialogBackgroundOpView$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        uy3.p pVar = this.f513531d.f240245d;
        if (pVar != null) {
            ((kz3.g) pVar).mo144661xaf6b9ae9(view);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/scanner/box/ScanOCRDialogBackgroundOpView$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
