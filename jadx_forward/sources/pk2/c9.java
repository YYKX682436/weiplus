package pk2;

/* loaded from: classes3.dex */
public final class c9 implements db5.s4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f437168a;

    public c9(pk2.o9 o9Var) {
        this.f437168a = o9Var;
    }

    @Override // db5.s4
    public final void a(android.view.MenuItem menuItem, int i17) {
        o25.y1 y1Var;
        pk2.o9 o9Var = this.f437168a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        pk2.d9 d9Var = o9Var.f437615f;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = d9Var != null ? d9Var.f437193c : null;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = ((mm2.c1) o9Var.c(mm2.c1.class)).f410379n;
        if (k0Var == null || c19792x256d2725 == null || d9Var == null || (y1Var = d9Var.f437199i) == null) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(menuItem, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMMenuItem");
        ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) y1Var).bj(k0Var, (db5.h4) menuItem);
    }
}
