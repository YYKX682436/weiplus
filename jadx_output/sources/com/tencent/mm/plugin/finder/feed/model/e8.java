package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class e8 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v65.n f107827a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.h8 f107828b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f107829c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.a71 f107830d;

    public e8(v65.n nVar, com.tencent.mm.plugin.finder.feed.model.h8 h8Var, int i17, r45.a71 a71Var) {
        this.f107827a = nVar;
        this.f107828b = h8Var;
        this.f107829c = i17;
        this.f107830d = a71Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        kotlin.jvm.internal.o.d(fVar);
        this.f107827a.a(this.f107828b.d(this.f107829c, this.f107830d, fVar));
        return jz5.f0.f302826a;
    }
}
