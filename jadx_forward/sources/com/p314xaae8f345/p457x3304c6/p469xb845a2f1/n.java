package com.p314xaae8f345.p457x3304c6.p469xb845a2f1;

/* loaded from: classes5.dex */
public class n extends com.p314xaae8f345.p457x3304c6.p469xb845a2f1.AbstractC4064x9d675c3d {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p469xb845a2f1.j f129634a;

    public n(com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4063x855a1ef8 c4063x855a1ef8, com.p314xaae8f345.p457x3304c6.p469xb845a2f1.j jVar, boolean z17) {
        super(c4063x855a1ef8, z17);
        this.f129634a = jVar;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p469xb845a2f1.AbstractC4064x9d675c3d
    /* renamed from: onInvoke */
    public void mo33152x48671b37(com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4063x855a1ef8 c4063x855a1ef8, java.lang.Object obj) {
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4065x844a6f32.ProgressArg progressArg = (com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4065x844a6f32.ProgressArg) obj;
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.j jVar = this.f129634a;
        if (jVar == null || progressArg == null) {
            return;
        }
        float f17 = progressArg.f15938xc454c22d;
        nu0.b4 b4Var = ((nu0.q3) ((nu0.h0) jVar).f421480a).f421616a;
        hx0.e eVar = b4Var.T;
        eVar.getClass();
        eVar.a(hx0.c.f367141h);
        nu0.z3 z3Var = new nu0.z3(b4Var, (int) (f17 * 100), null);
        p3325xe03a0797.p3326xc267989b.y0 m158345xefc66565 = b4Var.m158345xefc66565();
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new nu0.l2(z3Var, null), 2, null);
    }
}
