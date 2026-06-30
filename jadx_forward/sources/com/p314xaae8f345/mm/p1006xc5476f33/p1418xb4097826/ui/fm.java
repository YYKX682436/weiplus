package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes2.dex */
public final class fm extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.bh {
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15092xf036eed8 A1;

    /* renamed from: z1, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.qm f210779z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fm(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.qm qmVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15092xf036eed8 c15092xf036eed8, cw2.f8 f8Var, boolean z17, int i17) {
        super(f8Var, qmVar, z17, i17, false, 16, null);
        this.f210779z1 = qmVar;
        this.A1 = c15092xf036eed8;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe
    public void D0(in5.s0 holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, boolean z17, long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var, int i17, int i18, boolean z18, long j18, int i19, int i27) {
        so2.u1 item = (so2.u1) abstractC14490x69736cb5;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.D0(holder, item, z17, j17, yj0Var, i17, i18, z18, j18, i19, i27);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = this.f210779z1.f187954d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        qt2.b0 b0Var = (qt2.b0) pf5.z.f435481a.a(activity).e(qt2.b0.class);
        if (b0Var != null) {
            b0Var.b7();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.bh, in5.r
    /* renamed from: P1 */
    public void h(in5.s0 holder, so2.u1 item, int i17, int i18, boolean z17, java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.qm qmVar = this.f210779z1;
        if (qmVar.f211280p0) {
            bd2.s.f100819a.a(holder);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15092xf036eed8 c15092xf036eed8 = this.A1;
        c15092xf036eed8.m60902x162a7075(holder, i17);
        r45.nv2 nv2Var = qmVar.X;
        if (nv2Var != null) {
            c15092xf036eed8.m60903x111401c8(holder, item, nv2Var);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe
    public void n0(in5.s0 holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, android.view.View it, int i17) {
        so2.u1 item = (so2.u1) abstractC14490x69736cb5;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        super.n0(holder, item, it, i17);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = this.f210779z1.f187954d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        qt2.b0 b0Var = (qt2.b0) pf5.z.f435481a.a(activity).e(qt2.b0.class);
        if (b0Var != null) {
            b0Var.b7();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe
    public boolean y(int i17) {
        boolean z17;
        r45.nv2 nv2Var = this.f210779z1.X;
        boolean z18 = false;
        java.lang.String m75945x2fec8307 = nv2Var != null ? nv2Var.m75945x2fec8307(0) : null;
        java.lang.String r17 = c01.z1.r();
        if (i17 == 0) {
            if (m75945x2fec8307 != null) {
                if (m75945x2fec8307.length() > 0) {
                    z17 = true;
                    if (z17 && !m75945x2fec8307.equals(r17)) {
                        z18 = true;
                    }
                }
            }
            z17 = false;
            if (z17) {
                z18 = true;
            }
        }
        return !z18;
    }
}
