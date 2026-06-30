package bg2;

/* loaded from: classes10.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f20043d;

    /* renamed from: e, reason: collision with root package name */
    public int f20044e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bg2.k f20045f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f20046g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(bg2.k kVar, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f20045f = kVar;
        this.f20046g = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bg2.e(this.f20045f, this.f20046g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bg2.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f20044e;
        bg2.k kVar = this.f20045f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            dk2.u4 f76 = kVar.f7();
            java.lang.String str2 = f76 != null ? f76.f234154a : null;
            this.f20043d = str2;
            this.f20044e = 1;
            if (kotlinx.coroutines.k1.b(this.f20046g, this) == aVar) {
                return aVar;
            }
            str = str2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) this.f20043d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        dk2.u4 f77 = kVar.f7();
        if (kotlin.jvm.internal.o.b(str, f77 != null ? f77.f234154a : null)) {
            kVar.h7();
            bg2.d dVar = (bg2.d) kVar.N6(bg2.d.class);
            if (dVar != null) {
                dVar.f19996h = null;
            }
        }
        return jz5.f0.f302826a;
    }
}
