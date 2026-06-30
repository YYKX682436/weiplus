package l41;

/* loaded from: classes15.dex */
public final class b1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l41.j1 f397317d;

    public b1(l41.j1 j1Var) {
        this.f397317d = j1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        l41.j1 j1Var = this.f397317d;
        l41.e2.c(j1Var.l(), j1Var.m(), false, 7, "contact is deleted");
        j1Var.g(7, "contact is deleted");
    }
}
