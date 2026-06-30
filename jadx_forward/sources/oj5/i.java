package oj5;

/* loaded from: classes14.dex */
public final class i extends oj5.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ oj5.o f427386b;

    public i(oj5.o oVar) {
        this.f427386b = oVar;
    }

    @Override // oj5.b
    public void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        java.util.HashMap hashMap = oj5.r.f427410h;
        java.util.HashMap hashMap2 = oj5.r.f427410h;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(adapter.hashCode());
        oj5.o oVar = this.f427386b;
        hashMap2.put(valueOf, oVar.f427395a);
        adapter.mo8163xed962dec(oVar.f427404j);
        if (oVar.f427399e) {
            if (!(adapter instanceof com.p314xaae8f345.mm.ui.p2730xe821e364.AbstractC22470xf90b5f7b)) {
                throw new java.lang.RuntimeException("If you select isSerialOnBind=true, your adapter need extend of SynchronizedAdapter.");
            }
            ((com.p314xaae8f345.mm.ui.p2730xe821e364.AbstractC22470xf90b5f7b) adapter).m80897xd4fab639(true);
        }
        oj5.o.a(oVar);
        oj5.o.b(this.f427386b, false, "setAdapter", 0L, 4, null);
    }
}
