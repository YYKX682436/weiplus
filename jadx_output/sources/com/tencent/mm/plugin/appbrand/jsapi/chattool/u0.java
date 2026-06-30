package com.tencent.mm.plugin.appbrand.jsapi.chattool;

/* loaded from: classes7.dex */
public final class u0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f80464d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f80465e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.chattool.v0 f80466f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f80467g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f80468h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f80469i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f80470m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f80471n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f80472o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(kotlin.jvm.internal.c0 c0Var, com.tencent.mm.plugin.appbrand.jsapi.chattool.v0 v0Var, android.content.Context context, int i17, kotlin.jvm.internal.h0 h0Var, java.lang.String str, com.tencent.mm.plugin.appbrand.e9 e9Var, int i18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f80465e = c0Var;
        this.f80466f = v0Var;
        this.f80467g = context;
        this.f80468h = i17;
        this.f80469i = h0Var;
        this.f80470m = str;
        this.f80471n = e9Var;
        this.f80472o = i18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.appbrand.jsapi.chattool.u0(this.f80465e, this.f80466f, this.f80467g, this.f80468h, this.f80469i, this.f80470m, this.f80471n, this.f80472o, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.appbrand.jsapi.chattool.u0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(1:2)|(2:4|(2:6|(5:8|9|10|11|(2:13|(6:15|(2:18|16)|19|20|21|22)(4:39|40|41|42))(2:47|48))(2:63|64))(2:65|66))(3:78|79|(9:84|85|86|87|88|89|90|91|(1:93))(11:81|82|83|68|(1:70)(1:77)|(1:72)(1:76)|73|(1:75)|10|11|(0)(0)))|67|68|(0)(0)|(0)(0)|73|(0)|10|11|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01f2, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01f0, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0231, code lost:
    
        r4 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0235, code lost:
    
        r4 = "";
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0154 A[Catch: Exception -> 0x00b7, f -> 0x00bb, d -> 0x01f4, TRY_LEAVE, TryCatch #4 {d -> 0x01f4, blocks: (B:10:0x014e, B:13:0x0154, B:39:0x01ab, B:68:0x0122, B:73:0x0136, B:76:0x0132, B:83:0x010d), top: B:82:0x010d }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01e2 A[Catch: f -> 0x00bb, Exception -> 0x01f0, d -> 0x01f2, TryCatch #10 {f -> 0x00bb, blocks: (B:10:0x014e, B:13:0x0154, B:15:0x0158, B:16:0x0163, B:18:0x0169, B:20:0x0175, B:39:0x01ab, B:41:0x01db, B:42:0x01e1, B:47:0x01e2, B:48:0x01ef, B:67:0x00b3, B:68:0x0122, B:70:0x0126, B:73:0x0136, B:76:0x0132, B:91:0x00ac, B:83:0x010d), top: B:2:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0126 A[Catch: Exception -> 0x00b7, f -> 0x00bb, d -> 0x00c0, TRY_ENTER, TRY_LEAVE, TryCatch #5 {Exception -> 0x00b7, blocks: (B:10:0x014e, B:13:0x0154, B:15:0x0158, B:16:0x0163, B:18:0x0169, B:20:0x0175, B:39:0x01ab, B:67:0x00b3, B:68:0x0122, B:70:0x0126, B:73:0x0136, B:76:0x0132, B:91:0x00ac, B:83:0x010d), top: B:2:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0132 A[Catch: Exception -> 0x00b7, f -> 0x00bb, d -> 0x01f4, TRY_ENTER, TryCatch #4 {d -> 0x01f4, blocks: (B:10:0x014e, B:13:0x0154, B:39:0x01ab, B:68:0x0122, B:73:0x0136, B:76:0x0132, B:83:0x010d), top: B:82:0x010d }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012b  */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.tencent.mm.plugin.appbrand.jsapi.chattool.v0, java.lang.Object, com.tencent.mm.plugin.appbrand.jsapi.k0] */
    /* JADX WARN: Type inference failed for: r1v4, types: [org.json.JSONObject, java.lang.String] */
    /* JADX WARN: Type inference failed for: r25v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v10 */
    /* JADX WARN: Type inference failed for: r25v11 */
    /* JADX WARN: Type inference failed for: r25v13 */
    /* JADX WARN: Type inference failed for: r25v14 */
    /* JADX WARN: Type inference failed for: r25v17 */
    /* JADX WARN: Type inference failed for: r25v18 */
    /* JADX WARN: Type inference failed for: r25v19 */
    /* JADX WARN: Type inference failed for: r25v20 */
    /* JADX WARN: Type inference failed for: r25v21 */
    /* JADX WARN: Type inference failed for: r25v23 */
    /* JADX WARN: Type inference failed for: r25v26 */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r25v6, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r25v7 */
    /* JADX WARN: Type inference failed for: r25v8 */
    /* JADX WARN: Type inference failed for: r25v9 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.String] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.chattool.u0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
