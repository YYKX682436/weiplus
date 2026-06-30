package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes.dex */
public final class m3 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.n3 f84779d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(com.tencent.mm.plugin.appbrand.launching.n3 n3Var) {
        super(3);
        this.f84779d = n3Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        java.lang.String str = (java.lang.String) obj3;
        java.util.Collection values = this.f84779d.f84801e.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            ((yz5.q) ((jz5.l) it.next()).f302834e).invoke(java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(intValue2), str);
        }
        return jz5.f0.f302826a;
    }
}
