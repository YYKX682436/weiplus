package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class y2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5560x6f070be f201937d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h3 f201938e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5560x6f070be c5560x6f070be, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h3 h3Var) {
        super(0);
        this.f201937d = c5560x6f070be;
        this.f201938e = h3Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5560x6f070be c5560x6f070be = this.f201937d;
        java.lang.String str = c5560x6f070be.f135879g.f90084a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h3 h3Var = this.f201938e;
        r45.cw1 cw1Var = h3Var.f200048d;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, cw1Var != null ? cw1Var.m75945x2fec8307(0) : null);
        am.zd zdVar = c5560x6f070be.f135879g;
        if (b17) {
            int i17 = zdVar.f90085b;
            boolean z17 = i17 == 4 || i17 == 1;
            android.view.View view = h3Var.f200052h;
            if (z17) {
                r45.cw1 cw1Var2 = h3Var.f200048d;
                if (cw1Var2 != null && cw1Var2.m75933x41a8a7f2(4)) {
                    r5 = true;
                }
                if (!r5) {
                    r45.cw1 cw1Var3 = h3Var.f200048d;
                    if (cw1Var3 != null) {
                        cw1Var3.set(4, java.lang.Boolean.TRUE);
                    }
                    h3Var.a(view != null ? view.findViewById(com.p314xaae8f345.mm.R.id.i_f) : null, h3Var.f200048d);
                }
            } else {
                if (i17 == 5 || i17 == 2) {
                    r45.cw1 cw1Var4 = h3Var.f200048d;
                    if (cw1Var4 != null && !cw1Var4.m75933x41a8a7f2(4)) {
                        r5 = true;
                    }
                    if (!r5) {
                        r45.cw1 cw1Var5 = h3Var.f200048d;
                        if (cw1Var5 != null) {
                            cw1Var5.set(4, java.lang.Boolean.FALSE);
                        }
                        h3Var.a(view != null ? view.findViewById(com.p314xaae8f345.mm.R.id.i_f) : null, h3Var.f200048d);
                    }
                }
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.u2 u2Var = h3Var.f200050f;
            java.util.Iterator it = u2Var.f201462d.iterator();
            int i18 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i18 = -1;
                    break;
                }
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.cw1) it.next()).m75945x2fec8307(0), zdVar.f90084a)) {
                    break;
                }
                i18++;
            }
            if (i18 != -1) {
                int i19 = zdVar.f90085b;
                if (!(i19 == 4 || i19 == 1)) {
                    if ((i19 == 5 || i19 == 2) && ((r45.cw1) u2Var.f201462d.get(i18)).m75933x41a8a7f2(4)) {
                        ((r45.cw1) u2Var.f201462d.get(i18)).set(4, java.lang.Boolean.FALSE);
                        u2Var.m8147xed6e4d18(i18);
                    }
                } else if (!((r45.cw1) u2Var.f201462d.get(i18)).m75933x41a8a7f2(4)) {
                    ((r45.cw1) u2Var.f201462d.get(i18)).set(4, java.lang.Boolean.TRUE);
                    u2Var.m8147xed6e4d18(i18);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
