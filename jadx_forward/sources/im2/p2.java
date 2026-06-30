package im2;

/* loaded from: classes3.dex */
public final class p2 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.d32 f374017d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f374018e;

    public p2(r45.d32 d32Var, im2.z3 z3Var, int i17, int i18) {
        this.f374017d = d32Var;
        this.f374018e = z3Var;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        r45.d32 d32Var = this.f374017d;
        im2.z3 z3Var = this.f374018e;
        if (d32Var != null) {
            db5.h4 h4Var = new db5.h4(z3Var.m80379x76847179(), 0, 0);
            h4Var.f309909t = com.p314xaae8f345.mm.R.C30867xcad56011.oxv;
            g4Var.v(h4Var);
        }
        db5.h4 h4Var2 = new db5.h4(z3Var.m80379x76847179(), 1, 0);
        int color = z3Var.m158354x19263085().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23);
        h4Var2.f309909t = com.p314xaae8f345.mm.R.C30867xcad56011.oxw;
        h4Var2.f309903n = color;
        g4Var.v(h4Var2);
    }
}
