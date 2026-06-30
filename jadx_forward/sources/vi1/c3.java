package vi1;

/* loaded from: classes7.dex */
public final class c3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi1.k3 f518822d;

    public c3(vi1.k3 k3Var) {
        this.f518822d = k3Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        vi1.k3.a(this.f518822d, "fail");
    }
}
