package a50;

/* loaded from: classes11.dex */
public final class h0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.mm.biz.a1 f1490d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.tencent.wechat.mm.biz.a1 a1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f1490d = a1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new a50.h0(this.f1490d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        a50.h0 h0Var = (a50.h0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        h0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        a50.j0 j0Var = a50.j0.f1496a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init finder live dot mode: ");
        com.tencent.wechat.mm.biz.a1 a1Var = this.f1490d;
        sb6.append(a1Var.c().name());
        com.tencent.mars.xlog.Log.i("Finder.BoxBizFlutterDigestHelper", sb6.toString());
        boolean l17 = com.tencent.mm.pluginsdk.model.b0.f189197a.l(a1Var);
        com.tencent.mm.pluginsdk.model.b0.f189202f = a1Var;
        if (l17) {
            com.tencent.mars.xlog.Log.i("Finder.BoxBizFlutterDigestHelper", "update main session by finder info change");
            a50.j0.f1496a.a(a50.a.f1447m, null);
        }
        return jz5.f0.f302826a;
    }
}
