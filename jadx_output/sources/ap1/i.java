package ap1;

/* loaded from: classes5.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f12680d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ap1.w f12681e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ po1.d f12682f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.ui.widget.dialog.u3 u3Var, ap1.w wVar, po1.d dVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f12680d = u3Var;
        this.f12681e = wVar;
        this.f12682f = dVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ap1.i(this.f12680d, this.f12681e, this.f12682f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ap1.i iVar = (ap1.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        iVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f12680d.dismiss();
        fo1.p pVar = fo1.p.f264890a;
        ap1.w wVar = this.f12681e;
        androidx.appcompat.app.AppCompatActivity activity = wVar.getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        pVar.b((com.tencent.mm.ui.MMActivity) activity, this.f12682f, new ap1.h(wVar));
        return jz5.f0.f302826a;
    }
}
