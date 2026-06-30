package c61;

/* loaded from: classes5.dex */
public final class ja implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f39073a;

    public ja(kotlinx.coroutines.q qVar) {
        this.f39073a = qVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        long j17 = fVar.f70616b;
        long j18 = fVar.f70615a;
        byte[] byteArray = ((r45.js5) fVar.f70618d).toByteArray();
        kotlin.jvm.internal.o.d(byteArray);
        com.tencent.pigeon.mm_foundation.FlutterCgiResponse flutterCgiResponse = new com.tencent.pigeon.mm_foundation.FlutterCgiResponse(j18, j17, byteArray);
        fVar.f70620f.dead();
        ((kotlinx.coroutines.r) this.f39073a).resumeWith(kotlin.Result.m521constructorimpl(flutterCgiResponse));
        return jz5.f0.f302826a;
    }
}
