package uj3;

/* loaded from: classes14.dex */
public final class p0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uj3.v0 f509869d;

    public p0(uj3.v0 v0Var) {
        this.f509869d = v0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        uj3.v0.u(this.f509869d, false, 1, null);
        dialogInterface.dismiss();
    }
}
