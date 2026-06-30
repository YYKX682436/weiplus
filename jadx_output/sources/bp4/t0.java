package bp4;

/* loaded from: classes10.dex */
public final class t0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bp4.b1 f23380d;

    public t0(bp4.b1 b1Var) {
        this.f23380d = b1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        ro4.b bVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/plugin/MagicTimeEditPlugin$checkInit$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bp4.b1 b1Var = this.f23380d;
        long j17 = b1Var.f23106o;
        b1Var.f23108q = j17;
        long j18 = b1Var.f23107p;
        b1Var.f23109r = j18;
        bp4.q0 q0Var = b1Var.f23110s;
        if (q0Var != null && (bVar = ((bp4.h1) q0Var).f23186a.f23268s) != null) {
            bVar.f398120d = j17;
            bVar.f398121e = j18;
            uq5.y yVar = bVar.f398119c;
            if (yVar != null) {
                yVar.b(j17, j18);
            }
        }
        bp4.q0 q0Var2 = b1Var.f23110s;
        if (q0Var2 != null) {
            ((bp4.h1) q0Var2).b();
        }
        b1Var.f23098d.setShow(false);
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/plugin/MagicTimeEditPlugin$checkInit$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
