package ck1;

/* loaded from: classes4.dex */
public final class x implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ck1.k0 f42394d;

    public x(ck1.k0 k0Var) {
        this.f42394d = k0Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        ck1.k0 k0Var = this.f42394d;
        if (g4Var != null) {
            g4Var.add(0, 0, 0, k0Var.f42338d.getString(com.tencent.mm.R.string.a5g));
        } else {
            k0Var.getClass();
        }
    }
}
