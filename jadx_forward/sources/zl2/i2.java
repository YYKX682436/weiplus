package zl2;

/* loaded from: classes3.dex */
public final class i2 implements db5.s4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f555352a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f555353b;

    public i2(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2) {
        this.f555352a = h0Var;
        this.f555353b = h0Var2;
    }

    @Override // db5.s4
    public final void a(android.view.MenuItem menuItem, int i17) {
        java.lang.Object obj = this.f555352a.f391656d;
        mm2.c1 c1Var = (mm2.c1) dk2.ef.f314905a.i(mm2.c1.class);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = c1Var != null ? c1Var.f410379n : null;
        if (obj == null || c19792x256d2725 == null) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0) obj;
        o25.y1 y1Var = (o25.y1) this.f555353b.f391656d;
        if (y1Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(menuItem, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMMenuItem");
            ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) y1Var).bj(k0Var, (db5.h4) menuItem);
        }
    }
}
