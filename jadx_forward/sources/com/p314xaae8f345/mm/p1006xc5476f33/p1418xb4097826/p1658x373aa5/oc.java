package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class oc {

    /* renamed from: b, reason: collision with root package name */
    public static rl5.r f214315b;

    /* renamed from: c, reason: collision with root package name */
    public static db5.d5 f214316c;

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.oc f214314a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.oc();

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f214317d = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ic.f213832d);

    public final boolean a() {
        rl5.r rVar = f214315b;
        boolean z17 = true;
        if (rVar != null && rVar.d()) {
            rl5.r rVar2 = f214315b;
            if (rVar2 != null) {
                rVar2.a();
            }
            db5.d5 d5Var = f214316c;
            if (d5Var != null) {
                d5Var.dismiss();
            }
        } else {
            z17 = false;
        }
        f214315b = null;
        return z17;
    }

    public final boolean b() {
        rl5.r rVar = f214315b;
        return rVar != null && rVar.d();
    }

    public final void c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ec ecVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.fc fcVar, dk2.zf zfVar) {
        ml2.g5 g5Var;
        ml2.b5 b5Var;
        int i17 = fcVar.f213634i == 2 ? 2 : 1;
        if (zl2.r4.f555483a.w1()) {
            int ordinal = ecVar.ordinal();
            if (ordinal == 0) {
                b5Var = ml2.b5.f408819e;
            } else if (ordinal == 1) {
                b5Var = ml2.b5.f408820f;
            } else {
                if (ordinal != 2) {
                    throw new jz5.j();
                }
                b5Var = ml2.b5.f408821g;
            }
            ml2.b5 b5Var2 = b5Var;
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ml2.j0.Dj((ml2.j0) c17, b5Var2, zfVar, null, 4, null);
            return;
        }
        int ordinal2 = ecVar.ordinal();
        boolean z17 = fcVar.f213629d;
        if (ordinal2 == 0) {
            g5Var = z17 ? ml2.g5.I : ml2.g5.f409014e;
        } else if (ordinal2 == 1) {
            g5Var = ml2.g5.f409015f;
        } else {
            if (ordinal2 != 2) {
                throw new jz5.j();
            }
            g5Var = z17 ? ml2.g5.f409021o : ml2.g5.f409016g;
        }
        if (fcVar.f213631f) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).vj(g5Var, 1, fcVar.f213632g, fcVar.f213633h);
        } else {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).Aj(g5Var, zfVar, i17);
        }
    }

    public final void d(int i17, int i18) {
        cl0.g gVar = new cl0.g();
        gVar.o("type", i17);
        gVar.o(ya.b.f77502x92235c1b, 1);
        gVar.o("identity", i18);
        dk2.ef efVar = dk2.ef.f314905a;
        gk2.e eVar = dk2.ef.I;
        int i19 = 0;
        if (eVar != null && ((mm2.c1) eVar.a(mm2.c1.class)).R6()) {
            i19 = 1;
        }
        gVar.o("display_type", i19 ^ 1);
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        if (zl2.r4.f555483a.w1()) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.f409880d2, gVar2, null, 4, null);
        } else {
            i95.m c18 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            ml2.r0.hj((ml2.r0) c18, ml2.b4.F2, gVar2, 0L, null, null, null, null, null, 252, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:206:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x041a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(db5.n4 r36, db5.t4 r37, android.widget.PopupWindow.OnDismissListener r38, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.fc r39, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.dc r40, dk2.zf r41) {
        /*
            Method dump skipped, instructions count: 1473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.oc.e(db5.n4, db5.t4, android.widget.PopupWindow$OnDismissListener, com.tencent.mm.plugin.finder.view.fc, com.tencent.mm.plugin.finder.view.dc, dk2.zf):void");
    }
}
