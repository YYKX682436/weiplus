package com.tencent.mm.modelcdntran;

/* loaded from: classes5.dex */
public final class c0 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f70896d;

    public c0(java.lang.ref.WeakReference weakReference) {
        this.f70896d = weakReference;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.modelcdntran.n1 n1Var = (com.tencent.mm.modelcdntran.n1) obj;
        com.tencent.mm.modelcdntran.q0 q0Var = (com.tencent.mm.modelcdntran.q0) this.f70896d.get();
        if (q0Var != null) {
            q0Var.a(n1Var);
        }
        return jz5.f0.f302826a;
    }
}
