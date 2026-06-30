package com.tencent.matrix.lifecycle.owners;

/* loaded from: classes12.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f52707d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(android.app.Activity activity) {
        super(1);
        this.f52707d = activity;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.WeakHashMap receiver = (java.util.WeakHashMap) obj;
        kotlin.jvm.internal.o.g(receiver, "$receiver");
        receiver.remove(this.f52707d);
        if (receiver.isEmpty()) {
            com.tencent.matrix.lifecycle.IForegroundStatefulOwner iForegroundStatefulOwner = com.tencent.matrix.lifecycle.owners.f0.f52731m;
            if (iForegroundStatefulOwner == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner.AsyncOwner");
            }
            ((com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner$AsyncOwner) iForegroundStatefulOwner).turnOffAsync();
        }
        return jz5.f0.f302826a;
    }
}
