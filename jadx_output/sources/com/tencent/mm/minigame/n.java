package com.tencent.mm.minigame;

/* loaded from: classes7.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f69113d;

    /* renamed from: e, reason: collision with root package name */
    public int f69114e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f69115f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f69116g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.minigame.y f69117h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f69118i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f69119m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17, com.tencent.mm.minigame.y yVar, java.lang.String str, java.util.Map map, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f69115f = c0Var;
        this.f69116g = i17;
        this.f69117h = yVar;
        this.f69118i = str;
        this.f69119m = map;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.minigame.n(this.f69115f, this.f69116g, this.f69117h, this.f69118i, this.f69119m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.minigame.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|2|(2:4|(2:6|(2:8|(2:10|(15:12|13|14|15|16|17|(1:19)(1:36)|(1:21)(1:35)|22|23|24|25|26|27|28)(2:46|47))(3:48|49|(1:51)(14:52|14|15|16|17|(0)(0)|(0)(0)|22|23|24|25|26|27|28)))(5:53|54|(1:56)|49|(0)(0)))(2:57|(8:59|(1:61)(1:72)|(1:63)|64|65|66|67|68)))(1:79)|73|74|75|76|(1:78)|54|(0)|49|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f6, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f7, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b2 A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.minigame.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
