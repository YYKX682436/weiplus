package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes12.dex */
public class t8 implements com.p314xaae8f345.mm.ui.p2740x696c9db.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.c9 f292307a;

    public t8(com.p314xaae8f345.mm.ui.p2740x696c9db.c9 c9Var) {
        this.f292307a = c9Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.p
    public void a() {
        android.view.ViewGroup viewGroup;
        com.p314xaae8f345.mm.ui.p2740x696c9db.c9 c9Var = this.f292307a;
        if (!c9Var.f291850b) {
            com.p314xaae8f345.mm.ui.p2740x696c9db.z8 z8Var = c9Var.f291865q;
            if (z8Var != null) {
                z8Var.mo81132x16c42d88();
                return;
            }
            return;
        }
        if (c9Var.f291854f != null) {
            try {
                if (u75.b.c() && com.p314xaae8f345.mm.ui.bk.v0() && (viewGroup = (android.view.ViewGroup) c9Var.f291854f.getActionView().getParent()) != null) {
                    viewGroup.removeView(viewGroup.findViewById(com.p314xaae8f345.mm.R.id.cob));
                }
            } catch (java.lang.Exception unused) {
            }
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.z8 z8Var2 = c9Var.f291865q;
        if (z8Var2 != null) {
            z8Var2.mo81132x16c42d88();
        }
    }
}
