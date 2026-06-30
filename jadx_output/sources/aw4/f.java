package aw4;

/* loaded from: classes10.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f14867d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f14868e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f14869f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.coroutines.LifecycleScope f14870g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ aw4.l f14871h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.content.Context context, org.json.JSONObject jSONObject, com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope, aw4.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f14868e = context;
        this.f14869f = jSONObject;
        this.f14870g = lifecycleScope;
        this.f14871h = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new aw4.f(this.f14868e, this.f14869f, this.f14870g, this.f14871h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((aw4.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:10|(3:11|12|(1:14)(1:40))|(12:16|17|18|19|(1:21)|(1:23)(1:35)|24|25|(1:27)(1:33)|(1:29)|30|(1:32))|39|17|18|19|(0)|(0)(0)|24|25|(0)(0)|(0)|30|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0088, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0089, code lost:
    
        com.tencent.mm.sdk.platformtools.Log.a("safeGetString", "", r0);
        r15 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0080 A[Catch: Exception -> 0x0088, TRY_LEAVE, TryCatch #0 {Exception -> 0x0088, blocks: (B:19:0x0077, B:23:0x0080), top: B:18:0x0077 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0119 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0085  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r47) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aw4.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
