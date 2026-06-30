package com.tencent.matrix.lifecycle.supervisor;

/* loaded from: classes12.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f52852d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f52853e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f52854f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(java.lang.String str, java.lang.String str2, int i17) {
        super(1);
        this.f52852d = str;
        this.f52853e = str2;
        this.f52854f = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.Map.Entry it = (java.util.Map.Entry) obj;
        kotlin.jvm.internal.o.g(it, "it");
        ((com.tencent.matrix.lifecycle.supervisor.g) it.getValue()).E2(this.f52852d, this.f52853e, this.f52854f);
        return jz5.f0.f302826a;
    }
}
