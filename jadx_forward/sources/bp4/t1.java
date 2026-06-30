package bp4;

/* loaded from: classes10.dex */
public final class t1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bp4.c2 f104914d;

    public t1(bp4.c2 c2Var) {
        this.f104914d = c2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bp4.c2 c2Var = this.f104914d;
        c2Var.C();
        ((y9.i) ((jz5.n) c2Var.A).mo141623x754a37bb()).show();
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
