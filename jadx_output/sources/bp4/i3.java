package bp4;

/* loaded from: classes10.dex */
public final class i3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bp4.o3 f23198d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(bp4.o3 o3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f23198d = o3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bp4.i3(this.f23198d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        bp4.i3 i3Var = (bp4.i3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        i3Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        bp4.o3 o3Var = this.f23198d;
        o3Var.f23315i = 3;
        o3Var.f23312f.setVisibility(8);
        com.tencent.mm.ui.widget.dialog.u3 u3Var = o3Var.f23314h;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        o3Var.f23314h = null;
        return jz5.f0.f302826a;
    }
}
