package r35;

/* loaded from: classes11.dex */
public class x3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r35.e4 f450858d;

    public x3(r35.e4 e4Var) {
        this.f450858d = e4Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        r35.e4 e4Var = this.f450858d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = e4Var.f450618e;
        if (j0Var != null) {
            j0Var.dismiss();
            e4Var.f450618e = null;
        }
        e4Var.e();
        ns.h hVar = e4Var.f450619f;
        if (hVar != null) {
            hVar.a(false);
        }
    }
}
