package ay1;

/* loaded from: classes2.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y f15198d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ay1.l f15199e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(androidx.lifecycle.y yVar, ay1.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f15198d = yVar;
        this.f15199e = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ay1.a(this.f15198d, this.f15199e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ay1.a aVar = (ay1.a) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        aVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.lifecycle.o mo133getLifecycle;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        final androidx.lifecycle.y yVar = this.f15198d;
        if (yVar != null && (mo133getLifecycle = yVar.mo133getLifecycle()) != null) {
            if (!(mo133getLifecycle.b() != androidx.lifecycle.n.DESTROYED)) {
                mo133getLifecycle = null;
            }
            if (mo133getLifecycle != null) {
                final ay1.l lVar = this.f15199e;
                mo133getLifecycle.a(new androidx.lifecycle.x() { // from class: com.tencent.mm.plugin.datapreloader.FutureTask$1$2
                    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
                    public final void onDestroy() {
                        ay1.l lVar2 = ay1.l.this;
                        kotlinx.coroutines.z0.d(lVar2.d(), lVar2.f() + ", onDestroy", null, 2, null);
                        if (lVar2.f15226b != null) {
                            lVar2.b().b();
                        } else {
                            kotlinx.coroutines.l.d(lVar2.d(), null, null, new ay1.d(lVar2, null), 3, null);
                        }
                        yVar.mo133getLifecycle().c(this);
                    }
                });
            }
        }
        return jz5.f0.f302826a;
    }
}
