package uf;

/* loaded from: classes7.dex */
public final class z1 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf.c2 f508666d;

    public z1(uf.c2 c2Var) {
        this.f508666d = c2Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        uf.c2 c2Var = this.f508666d;
        uf.c2.b(c2Var, null, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = c2Var.f508527d;
        if (c11510xdd90c2f2 != null) {
            c11510xdd90c2f2.B1(c2Var.f508545y);
        }
    }
}
