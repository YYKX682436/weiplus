package r35;

/* loaded from: classes11.dex */
public class z3 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r35.e4 f450866d;

    public z3(r35.e4 e4Var) {
        this.f450866d = e4Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        r35.e4 e4Var = this.f450866d;
        e4Var.e();
        ns.h hVar = e4Var.f450619f;
        if (hVar != null) {
            hVar.a(false);
        }
    }
}
