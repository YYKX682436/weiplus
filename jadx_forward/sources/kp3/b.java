package kp3;

/* loaded from: classes11.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kp3.f f392497d;

    public b(kp3.f fVar) {
        this.f392497d = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/palm/ui/PalmGuideDialog$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f392497d.E("closeBtn");
        yj0.a.h(this, "com/tencent/mm/plugin/palm/ui/PalmGuideDialog$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
