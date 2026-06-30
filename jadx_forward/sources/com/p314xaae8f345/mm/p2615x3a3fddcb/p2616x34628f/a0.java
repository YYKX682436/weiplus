package com.p314xaae8f345.mm.p2615x3a3fddcb.p2616x34628f;

/* loaded from: classes14.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f274960d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(java.lang.String str) {
        super(2);
        this.f274960d = str;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        n0.o oVar = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f384359a;
            }
        }
        java.lang.Object obj3 = n0.e1.f415025a;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        long b17 = rz0.a.b(com.p314xaae8f345.mm.R.C30859x5a72f63.f77654xad7ef30, context);
        float f17 = 8;
        long z17 = ((p2.f) ((n0.y0) oVar).i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92179e)).z(((float) 2.5d) * f17);
        int i17 = z0.t.f550455q1;
        tz0.x.b(this.f274960d, d0.a2.g(z0.p.f550454d, ((float) 1.5d) * f17, 3 * f17), b17, z17, null, null, null, 0L, null, null, 0L, 2, false, 2, null, null, oVar, com.p314xaae8f345.mm.p639x2e3af2.C7183xce2ad330.f21567x85be6914, com.p314xaae8f345.mm.p639x2e3af2.C7183xce2ad330.f21567x85be6914, 55280);
        return jz5.f0.f384359a;
    }
}
