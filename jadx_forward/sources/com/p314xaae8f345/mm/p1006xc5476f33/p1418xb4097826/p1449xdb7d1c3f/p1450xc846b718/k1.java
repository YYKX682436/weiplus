package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes8.dex */
public final class k1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f187155d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var) {
        super(0);
        this.f187155d = f0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f187155d;
        if (f0Var.f391649d < 0) {
            java.util.Iterator it = c01.h2.f(3).entrySet().iterator();
            int i17 = 0;
            while (it.hasNext()) {
                if (c01.h2.a((java.lang.String) ((java.util.Map.Entry) it.next()).getKey(), "") == 1) {
                    i17++;
                }
            }
            f0Var.f391649d = i17;
        }
        return java.lang.Integer.valueOf(f0Var.f391649d);
    }
}
