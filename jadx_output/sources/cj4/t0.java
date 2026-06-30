package cj4;

/* loaded from: classes11.dex */
public final class t0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ej4.a f42036d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cj4.i1 f42037e;

    public t0(ej4.a aVar, cj4.i1 i1Var) {
        this.f42036d = aVar;
        this.f42037e = i1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f42036d);
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f42037e.S;
        if (u3Var != null) {
            u3Var.dismiss();
        }
    }
}
