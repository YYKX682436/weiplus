package cj4;

/* loaded from: classes8.dex */
public final class r1 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f42030d;

    public r1(com.tencent.mm.modelbase.u0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        this.f42030d = new java.lang.ref.WeakReference(obj);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.modelbase.u0 u0Var = (com.tencent.mm.modelbase.u0) this.f42030d.get();
        if (u0Var != null) {
            u0Var.onSceneEnd(i17, i18, str, m1Var);
        }
    }
}
