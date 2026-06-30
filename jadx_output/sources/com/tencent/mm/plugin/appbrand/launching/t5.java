package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class t5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f85158d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(yz5.l lVar) {
        super(1);
        this.f85158d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.me3[] items = (r45.me3[]) obj;
        kotlin.jvm.internal.o.g(items, "items");
        r45.kf kfVar = new r45.kf();
        for (r45.me3 me3Var : items) {
            if (me3Var != null) {
                kfVar.f378644d.add(me3Var);
            }
        }
        this.f85158d.invoke(kfVar);
        return jz5.f0.f302826a;
    }
}
