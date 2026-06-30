package rv0;

/* loaded from: classes5.dex */
public final class s1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f481762d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xv0.g f481763e;

    public s1(rv0.n1 n1Var, xv0.g gVar) {
        this.f481762d = n1Var;
        this.f481763e = gVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        ex0.v vVar;
        java.util.List list;
        rv0.n1 n1Var = this.f481762d;
        ex0.a0 s76 = n1Var.s7();
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
                com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3 = c4190xd8dd3713 instanceof com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 ? (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3) c4190xd8dd3713 : null;
                if (c4181x2248e1a3 != null) {
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4181x2248e1a3.D();
                    if (D != null) {
                        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3.O0(c4181x2248e1a3, 0.0f, D);
                    }
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D2 = c4181x2248e1a3.D();
                    if (D2 != null) {
                        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3.R0(c4181x2248e1a3, 0.0f, D2);
                    }
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D3 = c4181x2248e1a3.D();
                    if (D3 != null) {
                        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3.S0(c4181x2248e1a3, 0.0f, D3);
                    }
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D4 = c4181x2248e1a3.D();
                    if (D4 != null) {
                        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3.j1(c4181x2248e1a3, 0.0f, D4);
                    }
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D5 = c4181x2248e1a3.D();
                    if (D5 != null) {
                        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3.l1(c4181x2248e1a3, 0.0f, D5);
                    }
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D6 = c4181x2248e1a3.D();
                    if (D6 != null) {
                        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3.N0(c4181x2248e1a3, 0.0f, D6);
                    }
                }
                i18 = i19;
            }
        }
        n1Var.p7().c7();
        xv0.g gVar = this.f481763e;
        java.util.List list2 = gVar.U;
        if (list2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("colorAdjItems");
            throw null;
        }
        java.util.Iterator it6 = ((java.util.ArrayList) list2).iterator();
        while (it6.hasNext()) {
            ((xv0.a) it6.next()).a(0.0f);
        }
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10956x6271c3cc c10956x6271c3cc = gVar.N;
        if (c10956x6271c3cc == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("seekbar");
            throw null;
        }
        c10956x6271c3cc.m47185x3ae760af(0.0f);
        gVar.L(0.0f);
    }
}
