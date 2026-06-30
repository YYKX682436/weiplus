package com.tencent.mm.feature.chatrecordstts;

/* loaded from: classes8.dex */
public final class l2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.chatrecordstts.SupervisedLifecycleScope f65501d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(com.tencent.mm.feature.chatrecordstts.SupervisedLifecycleScope supervisedLifecycleScope) {
        super(0);
        this.f65501d = supervisedLifecycleScope;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.feature.chatrecordstts.SupervisedLifecycleScope supervisedLifecycleScope = this.f65501d;
        if (supervisedLifecycleScope.f65330e.mo133getLifecycle().b() != androidx.lifecycle.n.DESTROYED) {
            supervisedLifecycleScope.f65330e.mo133getLifecycle().a(supervisedLifecycleScope);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatRecordsTts.LifecycleScope", "leak this scope, because lifecycle is already destroy");
        }
        return jz5.f0.f302826a;
    }
}
