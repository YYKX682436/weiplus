package com.tencent.matrix.lifecycle.supervisor;

/* loaded from: classes12.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f52859d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(java.util.ArrayList arrayList) {
        super(1);
        this.f52859d = arrayList;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.Map.Entry it = (java.util.Map.Entry) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.matrix.util.MemInfo y57 = ((com.tencent.matrix.lifecycle.supervisor.g) it.getValue()).y5();
        if (y57 != null) {
            this.f52859d.add(y57);
        }
        return jz5.f0.f302826a;
    }
}
