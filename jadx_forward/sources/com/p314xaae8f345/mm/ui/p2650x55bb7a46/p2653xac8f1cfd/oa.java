package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public final class oa extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f281165d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ta f281166e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa(java.util.List list, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ta taVar) {
        super(0);
        this.f281165d = list;
        this.f281166e = taVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        for (com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var : this.f281165d) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ta taVar = this.f281166e;
            java.lang.Integer num = (java.lang.Integer) taVar.f281512n.get(java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
            if (num == null) {
                num = 0;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
            int intValue = num.intValue();
            int b17 = taVar.f281511m.b(f9Var, intValue);
            if (b17 >= intValue) {
                taVar.f281512n.put(java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), java.lang.Integer.valueOf(b17));
            }
        }
        return jz5.f0.f384359a;
    }
}
