package cp2;

/* loaded from: classes2.dex */
public final class d1 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f302319d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cp2.q1 f302320e;

    public d1(java.util.ArrayList arrayList, cp2.q1 q1Var) {
        this.f302319d = arrayList;
        this.f302320e = q1Var;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        r45.s92 s92Var;
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        int a07 = ((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) adapter).a0();
        if (i17 < a07) {
            return;
        }
        int i18 = i17 - a07;
        java.lang.Object obj = this.f302319d.get(i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        so2.j5 j5Var = (so2.j5) obj;
        java.lang.String str = rq2.x.f480448b;
        cp2.q1 q1Var = this.f302320e;
        java.lang.String m75945x2fec8307 = q1Var.a().m75945x2fec8307(2);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        java.lang.String str2 = m75945x2fec8307;
        cq2.r rVar = cq2.r.f302977a;
        r45.fd1 fd1Var = cp2.b.f302308x;
        view.setTag(com.p314xaae8f345.mm.R.id.f567634k63, cq2.r.f(rVar, i18, j5Var, view, (fd1Var == null || (s92Var = (r45.s92) fd1Var.m75936x14adae67(11)) == null) ? 0 : s92Var.m75939xb282bd08(0), null, 0, q1Var.q() != 0, false, 48, null));
        cp2.u1 u1Var = q1Var.f302429u;
        java.util.ArrayList arrayList = this.f302319d;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 g17 = q1Var.g();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "access$getRecyclerView(...)");
        cp2.u1.d(u1Var, j5Var, i17, i18, view, arrayList, str, str2, g17, 0L, 256, null);
    }
}
