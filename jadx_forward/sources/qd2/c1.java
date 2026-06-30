package qd2;

/* loaded from: classes10.dex */
public final class c1 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qd2.g1 f443242d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f443243e;

    public c1(qd2.g1 g1Var, java.lang.String str) {
        this.f443242d = g1Var;
        this.f443243e = str;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        qd2.g1 g1Var = this.f443242d;
        g1Var.getClass();
        g1Var.f443289j = null;
        if (g1Var.f443299t) {
            xm5.d.b(new qd2.b1(this.f443243e, g1Var));
        }
        g1Var.f443299t = false;
    }
}
