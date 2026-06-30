package bg2;

/* loaded from: classes10.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f20070d;

    /* renamed from: e, reason: collision with root package name */
    public int f20071e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bg2.k f20072f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f20073g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(bg2.k kVar, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f20072f = kVar;
        this.f20073g = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bg2.f(this.f20072f, this.f20073g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bg2.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f20071e;
        bg2.k kVar = this.f20072f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            dk2.u4 f76 = kVar.f7();
            java.lang.String str2 = f76 != null ? f76.f234154a : null;
            this.f20070d = str2;
            this.f20071e = 1;
            if (kotlinx.coroutines.k1.b(this.f20073g, this) == aVar) {
                return aVar;
            }
            str = str2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) this.f20070d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        dk2.u4 f77 = kVar.f7();
        if (kotlin.jvm.internal.o.b(str, f77 != null ? f77.f234154a : null)) {
            dk2.u4 f78 = kVar.f7();
            boolean z17 = false;
            if (f78 != null) {
                if (f78.f234158e == 4) {
                    z17 = true;
                }
            }
            if (z17) {
                dk2.u4 f79 = kVar.f7();
                if (f79 != null) {
                    f79.f234158e = 2;
                }
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = kVar.f417141d.f417148h;
                kVar.Z6(!kotlin.jvm.internal.o.b(str, (baseFinderFeed instanceof so2.h1 ? (so2.h1) baseFinderFeed : null) != null ? r8.f410379f : null));
            }
        }
        return jz5.f0.f302826a;
    }
}
