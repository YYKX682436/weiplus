package com.tencent.matrix.lifecycle.supervisor;

/* loaded from: classes12.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f52856d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f52857e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f52858f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(java.lang.String str, java.lang.String str2, boolean z17) {
        super(1);
        this.f52856d = str;
        this.f52857e = str2;
        this.f52858f = z17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.Map.Entry it = (java.util.Map.Entry) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.String a17 = com.tencent.matrix.lifecycle.supervisor.v.a(com.tencent.matrix.lifecycle.supervisor.v.f52883f);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("safe dispatchState -> ");
        sb6.append(((com.tencent.matrix.lifecycle.supervisor.ProcessToken) it.getKey()).f52792e);
        sb6.append('-');
        sb6.append(((com.tencent.matrix.lifecycle.supervisor.ProcessToken) it.getKey()).f52793f);
        sb6.append(": ");
        java.lang.String str = this.f52856d;
        sb6.append(str);
        sb6.append(", ");
        java.lang.String str2 = this.f52857e;
        sb6.append(str2);
        sb6.append(", ");
        boolean z17 = this.f52858f;
        sb6.append(z17);
        oj.j.c(a17, sb6.toString(), new java.lang.Object[0]);
        ((com.tencent.matrix.lifecycle.supervisor.g) it.getValue()).c5(str, str2, z17);
        return jz5.f0.f302826a;
    }
}
