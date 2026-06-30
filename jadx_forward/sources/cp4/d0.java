package cp4;

/* loaded from: classes8.dex */
public final class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cp4.g1 f302526d;

    public d0(cp4.g1 g1Var) {
        this.f302526d = g1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.widget.LinearLayout m122393x9cf1d94d;
        android.widget.LinearLayout m122394x1360c5a1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        cp4.g1 g1Var = this.f302526d;
        m122393x9cf1d94d = g1Var.m122393x9cf1d94d();
        m122393x9cf1d94d.setVisibility(0);
        m122394x1360c5a1 = g1Var.m122394x1360c5a1();
        m122394x1360c5a1.setVisibility(4);
        yz5.l m122409xc37c7030 = g1Var.m122409xc37c7030();
        if (m122409xc37c7030 != null) {
            m122409xc37c7030.mo146xb9724478(0);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
