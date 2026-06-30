package r35;

/* loaded from: classes11.dex */
public class w3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r35.e4 f450852d;

    public w3(r35.e4 e4Var) {
        this.f450852d = e4Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        r35.e4 e4Var = this.f450852d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = e4Var.f450618e;
        if (j0Var != null) {
            j0Var.dismiss();
            e4Var.f450618e = null;
        }
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new r35.v3(this), false).c(500L, 500L);
    }
}
