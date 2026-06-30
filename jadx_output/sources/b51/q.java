package b51;

/* loaded from: classes5.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f18053d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b51.u f18054e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f18055f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f18056g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(android.view.View view, b51.u uVar, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f18053d = view;
        this.f18054e = uVar;
        this.f18055f = str;
        this.f18056g = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new b51.q(this.f18053d, this.f18054e, this.f18055f, this.f18056g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        b51.q qVar = (b51.q) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        qVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        org.libpag.PAGView pAGView = (org.libpag.PAGView) this.f18053d;
        if (pAGView.getVisibility() != 0) {
            pAGView.setVisibility(0);
        }
        this.f18054e.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[playPag-real] start tag = ");
        java.lang.String str = this.f18055f;
        sb6.append(str);
        sb6.append(" path:");
        java.lang.String str2 = this.f18056g;
        sb6.append(str2);
        sb6.append(' ');
        com.tencent.mars.xlog.Log.i("Micro.PagTargetDispatcher", sb6.toString());
        pAGView.play();
        com.tencent.mars.xlog.Log.i("Micro.PagTargetDispatcher", "[playPag-real] end tag = " + str + " path:" + str2 + ' ');
        return jz5.f0.f302826a;
    }
}
