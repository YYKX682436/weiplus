package com.tencent.matrix.lifecycle.owners;

/* loaded from: classes12.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f52768d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(android.app.Activity activity) {
        super(1);
        this.f52768d = activity;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.WeakHashMap receiver = (java.util.WeakHashMap) obj;
        kotlin.jvm.internal.o.g(receiver, "$receiver");
        return receiver.put(this.f52768d, com.tencent.matrix.lifecycle.owners.f0.f52724f);
    }
}
