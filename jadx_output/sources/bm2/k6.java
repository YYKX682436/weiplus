package bm2;

/* loaded from: classes10.dex */
public final class k6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.o6 f22036d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.i6 f22037e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hn2.d f22038f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(bm2.o6 o6Var, bm2.i6 i6Var, hn2.d dVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f22036d = o6Var;
        this.f22037e = i6Var;
        this.f22038f = dVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bm2.k6(this.f22036d, this.f22037e, this.f22038f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        bm2.k6 k6Var = (bm2.k6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        k6Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        bm2.i6 i6Var = this.f22037e;
        com.tencent.mm.ui.widget.MMProcessBar mMProcessBar = i6Var.f21981g;
        kotlin.jvm.internal.o.f(mMProcessBar, "<get-btnProgress>(...)");
        bm2.o6 o6Var = this.f22036d;
        o6Var.K(mMProcessBar, false);
        com.tencent.mm.ui.widget.button.WeButton weButton = i6Var.f21980f;
        kotlin.jvm.internal.o.f(weButton, "<get-btnRequestSong>(...)");
        hn2.d dVar = this.f22038f;
        o6Var.K(weButton, !dVar.c());
        android.widget.TextView textView = i6Var.f21982h;
        kotlin.jvm.internal.o.f(textView, "<get-tvHasReqeusted>(...)");
        o6Var.K(textView, dVar.c());
        return jz5.f0.f302826a;
    }
}
