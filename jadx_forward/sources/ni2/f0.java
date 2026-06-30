package ni2;

/* loaded from: classes10.dex */
public final class f0 implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ni2.h0 f418823a;

    public f0(ni2.h0 h0Var) {
        this.f418823a = h0Var;
    }

    @Override // al5.c2
    /* renamed from: onStatusChange */
    public final void mo2289xd6191dc1(boolean z17) {
        boolean z18;
        int i17;
        int i18 = 2;
        ni2.h0 h0Var = this.f418823a;
        if (!z17) {
            h0Var.g(new java.util.ArrayList());
            h0Var.f418850s.setVisibility(0);
            if (h0Var.f418855x == 2) {
                h0Var.b(false);
                i17 = 3;
            } else {
                h0Var.d(false);
                i17 = 1;
            }
            h0Var.f418854w = i17;
            h0Var.k(h0Var.f418839e.g());
            h0Var.e(h0Var.f418854w != h0Var.f418853v);
            return;
        }
        if (h0Var.f()) {
            int i19 = h0Var.f418855x;
            zh2.c cVar = h0Var.f418839e;
            if (i19 == 2 || ((mm2.o4) cVar.g().a(mm2.o4.class)).f410860v.size() < 4) {
                z18 = true;
            } else {
                android.content.Context context = h0Var.f418841g;
                db5.t7.m(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573126dm4));
                z18 = false;
            }
            if (z18) {
                if (h0Var.f418855x == 2) {
                    h0Var.l(4, h0Var.a());
                    i18 = 4;
                } else {
                    h0Var.l(2, h0Var.c());
                }
                h0Var.f418854w = i18;
                h0Var.k(cVar.g());
                h0Var.e(h0Var.f418854w != h0Var.f418853v);
                return;
            }
        }
        h0Var.f418849r.m81392x52cfa5c6(false);
    }
}
