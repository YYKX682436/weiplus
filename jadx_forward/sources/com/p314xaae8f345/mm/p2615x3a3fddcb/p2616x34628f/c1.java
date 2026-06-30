package com.p314xaae8f345.mm.p2615x3a3fddcb.p2616x34628f;

/* loaded from: classes5.dex */
public final class c1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f274976d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f274977e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(java.lang.String str, n0.v2 v2Var) {
        super(3);
        this.f274976d = str;
        this.f274977e = v2Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        e0.g item = (e0.g) obj;
        n0.o oVar = (n0.o) obj2;
        int intValue = ((java.lang.Number) obj3).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "$this$item");
        if ((intValue & 81) == 16) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f384359a;
            }
        }
        java.lang.Object obj4 = n0.e1.f415025a;
        java.lang.String title = this.f274976d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(title, "$title");
        com.p314xaae8f345.mm.p2615x3a3fddcb.p2616x34628f.j1.b(title, this.f274977e, oVar, 48);
        return jz5.f0.f384359a;
    }
}
