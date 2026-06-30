package b12;

/* loaded from: classes4.dex */
public final class b implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f17039a;

    public b(kotlinx.coroutines.q qVar) {
        this.f17039a = qVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.protobuf.f fVar;
        com.tencent.mm.modelbase.f fVar2 = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar2.f70615a;
        kotlinx.coroutines.q qVar = this.f17039a;
        if (i17 == 0 && fVar2.f70616b == 0 && (fVar = fVar2.f70618d) != null) {
            ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(fVar));
        } else {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new b12.a(fVar2.f70615a, fVar2.f70616b, "", fVar2.f70618d))));
        }
        return jz5.f0.f302826a;
    }
}
