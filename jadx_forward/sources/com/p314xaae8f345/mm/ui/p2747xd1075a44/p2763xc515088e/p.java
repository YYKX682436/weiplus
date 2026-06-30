package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e;

/* loaded from: classes3.dex */
public class p implements v51.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 f293841a;

    public p(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var) {
        this.f293841a = c0Var;
    }

    @Override // v51.c
    public void a(int i17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var = this.f293841a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.y yVar = c0Var.B;
        if (yVar != null) {
            yVar.a(i17);
        }
        if (c0Var.A) {
            return;
        }
        c0Var.f293790r.m82070x203ffbdd(c0Var.a(i17));
        if (c0Var.f293788p == null || c0Var.f293791s == null) {
            return;
        }
        int i18 = 0;
        for (int i19 = 0; i19 < i17; i19++) {
            i18 += ((java.util.List) c0Var.f293787o.get(i19)).size();
        }
        c0Var.f293791s.m82070x203ffbdd(c0Var.c(i18 + c0Var.f293790r.m82064x754a37bb()));
    }
}
