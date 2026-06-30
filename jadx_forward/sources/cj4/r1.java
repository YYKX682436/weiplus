package cj4;

/* loaded from: classes8.dex */
public final class r1 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f123563d;

    public r1(com.p314xaae8f345.mm.p944x882e457a.u0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        this.f123563d = new java.lang.ref.WeakReference(obj);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = (com.p314xaae8f345.mm.p944x882e457a.u0) this.f123563d.get();
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i17, i18, str, m1Var);
        }
    }
}
