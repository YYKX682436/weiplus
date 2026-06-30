package com.tencent.matrix.lifecycle.supervisor;

/* loaded from: classes12.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f52847d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f52848e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f52849f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f52850g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(java.lang.String str, java.lang.String str2, int i17, boolean z17) {
        super(1);
        this.f52847d = str;
        this.f52848e = str2;
        this.f52849f = i17;
        this.f52850g = z17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.Map.Entry it = (java.util.Map.Entry) obj;
        kotlin.jvm.internal.o.g(it, "it");
        ((com.tencent.matrix.lifecycle.supervisor.g) it.getValue()).J8(this.f52847d, this.f52848e, this.f52849f, this.f52850g);
        return jz5.f0.f302826a;
    }
}
