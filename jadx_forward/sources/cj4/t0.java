package cj4;

/* loaded from: classes11.dex */
public final class t0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ej4.a f123569d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cj4.i1 f123570e;

    public t0(ej4.a aVar, cj4.i1 i1Var) {
        this.f123569d = aVar;
        this.f123570e = i1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f123569d);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f123570e.S;
        if (u3Var != null) {
            u3Var.dismiss();
        }
    }
}
