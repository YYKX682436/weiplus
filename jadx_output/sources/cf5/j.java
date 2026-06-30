package cf5;

/* loaded from: classes11.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedHashMap f40985d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(java.util.LinkedHashMap linkedHashMap, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f40985d = linkedHashMap;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new cf5.j(this.f40985d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        cf5.j jVar = (cf5.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        jVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        cf5.l.a(cf5.l.f40987a, "markdown_preview_session", this.f40985d);
        return jz5.f0.f302826a;
    }
}
