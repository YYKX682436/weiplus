package com.tencent.mm.plugin.finder.highlight;

/* loaded from: classes2.dex */
public final class b implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.highlight.a f111424d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f111425e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f111426f;

    public b(com.tencent.mm.plugin.finder.highlight.a aVar, in5.s0 s0Var, int i17) {
        this.f111424d = aVar;
        this.f111425e = s0Var;
        this.f111426f = i17;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.highlight.c.b((java.util.Set) obj, this.f111424d, this.f111425e, this.f111426f);
    }
}
