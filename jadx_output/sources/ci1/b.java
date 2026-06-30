package ci1;

/* loaded from: classes7.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f41661d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f41662e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f41663f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f41664g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bi1.f f41665h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f41666i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f41667m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ci1.c f41668n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(boolean z17, boolean z18, java.lang.String str, bi1.f fVar, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17, ci1.c cVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f41662e = z17;
        this.f41663f = z18;
        this.f41664g = str;
        this.f41665h = fVar;
        this.f41666i = e9Var;
        this.f41667m = i17;
        this.f41668n = cVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ci1.b(this.f41662e, this.f41663f, this.f41664g, this.f41665h, this.f41666i, this.f41667m, this.f41668n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ci1.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0267  */
    /* JADX WARN: Type inference failed for: r4v9, types: [com.tencent.mm.ipcinvoker.wx_extension.c, com.tencent.mm.plugin.appbrand.jsapi.chattool.b] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 647
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ci1.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
