package com.p314xaae8f345.mm.vfs;

/* loaded from: classes8.dex */
public final class j3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f294545d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(boolean z17) {
        super(1);
        this.f294545d = z17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.ref.WeakReference it = (java.lang.ref.WeakReference) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.vfs.k3 k3Var = (com.p314xaae8f345.mm.vfs.k3) it.get();
        if (k3Var == null) {
            return java.lang.Boolean.TRUE;
        }
        k3Var.f294561b = this.f294545d;
        return java.lang.Boolean.FALSE;
    }
}
