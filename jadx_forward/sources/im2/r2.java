package im2;

/* loaded from: classes3.dex */
public final class r2 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f374049d;

    public r2(im2.z3 z3Var) {
        this.f374049d = z3Var;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        im2.z3 z3Var = this.f374049d;
        for (r45.d32 d32Var : z3Var.E1) {
            int i17 = d32Var.f453565d;
            java.lang.String str = null;
            java.lang.String string = i17 != 1 ? i17 != 2 ? null : z3Var.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.oxx) : z3Var.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.oxs);
            if (d32Var.f453565d == 1) {
                str = z3Var.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.oxt);
            }
            db5.h4 h4Var = new db5.h4(z3Var.m80379x76847179(), d32Var.f453565d, 0);
            h4Var.f309901i = string;
            h4Var.f309906q = str;
            g4Var.v(h4Var);
        }
    }
}
