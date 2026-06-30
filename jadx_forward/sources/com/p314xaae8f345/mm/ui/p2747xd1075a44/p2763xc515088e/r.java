package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e;

/* loaded from: classes3.dex */
public class r implements v51.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 f293858a;

    public r(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var) {
        this.f293858a = c0Var;
    }

    @Override // v51.c
    public void a(int i17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var = this.f293858a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.b0 b0Var = c0Var.C;
        if (b0Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.hd) b0Var).a(i17);
        }
        if (c0Var.A) {
            return;
        }
        int m82064x754a37bb = c0Var.f293789q.m82064x754a37bb();
        int i18 = 0;
        for (int i19 = 0; i19 < m82064x754a37bb; i19++) {
            i18 += ((java.util.List) c0Var.f293787o.get(i19)).size();
        }
        c0Var.f293791s.m82070x203ffbdd(c0Var.c(i18 + i17));
    }
}
