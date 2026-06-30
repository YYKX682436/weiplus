package ap1;

/* loaded from: classes5.dex */
public final class d0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f12634d;

    /* renamed from: e, reason: collision with root package name */
    public int f12635e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ap1.i0 f12636f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f12637g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(ap1.i0 i0Var, com.tencent.mm.ui.widget.dialog.u3 u3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f12636f = i0Var;
        this.f12637g = u3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ap1.d0(this.f12636f, this.f12637g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ap1.d0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        j75.f fVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f12635e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ap1.i0 i0Var = this.f12636f;
            j75.f U6 = i0Var.U6();
            kotlin.jvm.internal.o.d(U6);
            boolean z17 = ((ap1.c2) U6.getState()).f12625f;
            i0Var.getClass();
            this.f12634d = U6;
            this.f12635e = 1;
            obj = i0Var.T6(this);
            if (obj == aVar) {
                return aVar;
            }
            fVar = U6;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar = (j75.f) this.f12634d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        fVar.B3(new ap1.a((java.util.List) obj, null, 2, null));
        pf5.e.launchUI$default(this.f12636f, null, null, new ap1.c0(this.f12637g, null), 3, null);
        return jz5.f0.f302826a;
    }
}
