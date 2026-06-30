package rv0;

/* loaded from: classes5.dex */
public final class q1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f481727d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 f481728e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xv0.g f481729f;

    public q1(rv0.n1 n1Var, com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3, xv0.g gVar) {
        this.f481727d = n1Var;
        this.f481728e = c4181x2248e1a3;
        this.f481729f = gVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        ex0.v vVar;
        java.util.List list;
        rv0.n1 n1Var = this.f481727d;
        ex0.a0 s76 = n1Var.s7();
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3 = this.f481728e;
        if (s76 != null && (vVar = s76.f338630g) != null && (list = vVar.f338710e) != null) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            int i18 = 0;
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713 = ((ex0.r) next).f338700a;
                com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a32 = c4190xd8dd3713 instanceof com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 ? (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3) c4190xd8dd3713 : null;
                if (c4181x2248e1a32 != null) {
                    float p17 = c4181x2248e1a3.p1();
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4181x2248e1a32.D();
                    if (D != null) {
                        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3.O0(c4181x2248e1a32, p17, D);
                    }
                    float r17 = c4181x2248e1a3.r1();
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D2 = c4181x2248e1a32.D();
                    if (D2 != null) {
                        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3.R0(c4181x2248e1a32, r17, D2);
                    }
                    float t17 = c4181x2248e1a3.t1();
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D3 = c4181x2248e1a32.D();
                    if (D3 != null) {
                        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3.S0(c4181x2248e1a32, t17, D3);
                    }
                    float w17 = c4181x2248e1a3.w1();
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D4 = c4181x2248e1a32.D();
                    if (D4 != null) {
                        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3.j1(c4181x2248e1a32, w17, D4);
                    }
                    float y17 = c4181x2248e1a3.y1();
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D5 = c4181x2248e1a32.D();
                    if (D5 != null) {
                        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3.l1(c4181x2248e1a32, y17, D5);
                    }
                    float u17 = c4181x2248e1a3.u1();
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D6 = c4181x2248e1a32.D();
                    if (D6 != null) {
                        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3.N0(c4181x2248e1a32, u17, D6);
                    }
                }
                i18 = i19;
            }
        }
        n1Var.p7().c7();
        n1Var.R6().T6(c4181x2248e1a3.p1(), c4181x2248e1a3.r1(), c4181x2248e1a3.t1(), c4181x2248e1a3.w1(), c4181x2248e1a3.y1(), c4181x2248e1a3.u1());
        gx0.kh q76 = n1Var.q7();
        xv0.g gVar = this.f481729f;
        java.lang.String string = gVar.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m1q);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        q76.r7(string, null);
        gVar.D = false;
        gVar.e(true, true);
    }
}
