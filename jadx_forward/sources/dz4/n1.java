package dz4;

/* loaded from: classes5.dex */
public final class n1 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz4.o1 f326888d;

    public n1(dz4.o1 o1Var) {
        this.f326888d = o1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        dz4.o1 o1Var = this.f326888d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = o1Var.f326895c;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        o1Var.f326895c = null;
    }
}
