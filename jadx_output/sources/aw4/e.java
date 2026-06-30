package aw4;

/* loaded from: classes.dex */
public final class e implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.coroutines.LifecycleScope f14860d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aw4.l f14861e;

    public e(com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope, aw4.l lVar) {
        this.f14860d = lifecycleScope;
        this.f14861e = lVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = this.f14860d;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(lifecycleScope, kotlinx.coroutines.internal.b0.f310484a, null, new aw4.d(this.f14861e, (java.lang.String) obj, null), 2, null);
        return jz5.f0.f302826a;
    }
}
