package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public final class e0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f242501a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f242502b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.i0 f242503c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f242504d;

    public e0(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.i0 i0Var, yz5.a aVar) {
        this.f242501a = h0Var;
        this.f242502b = str;
        this.f242503c = i0Var;
        this.f242504d = aVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.w
    public void a(java.io.OutputStream outputStream) {
        if (outputStream != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f242501a;
            java.lang.String str = this.f242502b;
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.i0 i0Var = this.f242503c;
            yz5.a aVar = this.f242504d;
            try {
                outputStream.write((byte[]) h0Var.f391656d);
                ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.d0(aVar));
                vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
                android.app.Activity m80379x76847179 = i0Var.m80379x76847179();
                ((ub0.r) oVar).getClass();
                q75.c.f(str, m80379x76847179);
                vz5.b.a(outputStream, null);
            } catch (java.lang.Throwable th6) {
                try {
                    throw th6;
                } catch (java.lang.Throwable th7) {
                    vz5.b.a(outputStream, th6);
                    throw th7;
                }
            }
        }
    }
}
