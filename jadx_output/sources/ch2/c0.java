package ch2;

/* loaded from: classes10.dex */
public final class c0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f41296d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f41297e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f41298f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f41299g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(xg2.h hVar, kotlin.coroutines.Continuation continuation, java.lang.String str, ch2.o2 o2Var, kotlin.jvm.internal.h0 h0Var) {
        super(2, continuation);
        this.f41296d = hVar;
        this.f41297e = str;
        this.f41298f = o2Var;
        this.f41299g = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ch2.c0(this.f41296d, continuation, this.f41297e, this.f41298f, this.f41299g);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ch2.c0 c0Var = (ch2.c0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        c0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("FinderLiveKTVSingController", "getSongPlayDetailInfo fail songUniqueId: " + this.f41297e + " error: " + ((xg2.a) ((xg2.b) this.f41296d).f454381b));
        if (zl2.q4.f473933a.E()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getSongPlayDetailInfo fail cookie: ");
            byte[] bArr = this.f41298f.i7().f328985o;
            if (bArr == null) {
                bArr = "".getBytes(r26.c.f368865a);
                kotlin.jvm.internal.o.f(bArr, "getBytes(...)");
            }
            sb6.append(android.util.Base64.encodeToString(bArr, 2));
            com.tencent.mars.xlog.Log.i("FinderLiveKTVSingController", sb6.toString());
        }
        this.f41299g.f310123d = null;
        return jz5.f0.f302826a;
    }
}
