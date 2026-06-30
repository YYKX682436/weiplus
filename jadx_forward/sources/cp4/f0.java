package cp4;

/* loaded from: classes8.dex */
public final class f0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cp4.g1 f302532d;

    public f0(cp4.g1 g1Var) {
        this.f302532d = g1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.view.ViewGroup m122401xc91708fc;
        android.view.ViewGroup m122402xc11c1510;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        cp4.g1 g1Var = this.f302532d;
        m122401xc91708fc = g1Var.m122401xc91708fc();
        m122401xc91708fc.setVisibility(0);
        m122402xc11c1510 = g1Var.m122402xc11c1510();
        m122402xc11c1510.setVisibility(4);
        yz5.l m122409xc37c7030 = g1Var.m122409xc37c7030();
        if (m122409xc37c7030 != null) {
            m122409xc37c7030.mo146xb9724478(1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
