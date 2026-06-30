package com.tencent.mm.modelcdntran;

/* loaded from: classes9.dex */
public final class l0 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f71038d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f71039e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f71040f;

    public l0(java.lang.ref.WeakReference weakReference, kotlinx.coroutines.y0 y0Var, kotlinx.coroutines.q qVar) {
        this.f71038d = weakReference;
        this.f71039e = y0Var;
        this.f71040f = qVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.modelcdntran.v2 v2Var;
        com.tencent.mm.modelcdntran.v2 v2Var2;
        com.tencent.mm.modelcdntran.v2 v2Var3;
        com.tencent.mm.modelcdntran.n1 n1Var = (com.tencent.mm.modelcdntran.n1) obj;
        int ordinal = n1Var.f71103a.ordinal();
        java.lang.ref.WeakReference weakReference = this.f71038d;
        if (ordinal != 5) {
            if (ordinal != 15) {
                if (weakReference != null && (v2Var3 = (com.tencent.mm.modelcdntran.v2) weakReference.get()) != null) {
                    v2Var3.a(n1Var);
                }
                kotlinx.coroutines.z0.e(this.f71039e, null, 1, null);
                ((kotlinx.coroutines.r) this.f71040f).resumeWith(kotlin.Result.m521constructorimpl(n1Var));
            } else if (weakReference != null && (v2Var2 = (com.tencent.mm.modelcdntran.v2) weakReference.get()) != null) {
                v2Var2.c(n1Var);
            }
        } else if (weakReference != null && (v2Var = (com.tencent.mm.modelcdntran.v2) weakReference.get()) != null) {
            v2Var.b(n1Var);
        }
        return jz5.f0.f302826a;
    }
}
