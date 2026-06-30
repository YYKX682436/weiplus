package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class d80 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.i80 f193771a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cm2.f0 f193772b;

    public d80(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.i80 i80Var, cm2.f0 f0Var) {
        this.f193771a = i80Var;
        this.f193772b = f0Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.i80 i80Var = this.f193771a;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = i80Var.f194478o;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = i80Var.f194477n;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        int i17 = fVar.f152148a;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0 && fVar.f152149b == 0) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = ((r45.zs1) fVar.f152151d).m75934xbce7f2f(1);
            if (m75934xbce7f2f == null) {
                return null;
            }
            r45.e52 e52Var = new r45.e52();
            e52Var.mo11468x92b714fd(m75934xbce7f2f.g());
            cm2.f0 f0Var2 = this.f193772b;
            f0Var2.getClass();
            f0Var2.f124875v = e52Var;
            ((mm2.f6) i80Var.f194471e.a(mm2.f6.class)).c7(f0Var2);
            java.util.LinkedList m75941xfb821914 = e52Var.m75941xfb821914(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getInfos(...)");
            r45.wd5 wd5Var = (r45.wd5) kz5.n0.Z(m75941xfb821914);
            if (wd5Var == null) {
                return null;
            }
            i80Var.b(wd5Var.m75945x2fec8307(4));
        } else {
            android.content.Context context = i80Var.f194470d;
            db5.t7.g(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.e9p));
        }
        return f0Var;
    }
}
