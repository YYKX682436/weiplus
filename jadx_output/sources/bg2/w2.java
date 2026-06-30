package bg2;

/* loaded from: classes3.dex */
public final class w2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.x2 f20598d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderJumpInfo f20599e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(bg2.x2 x2Var, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f20598d = x2Var;
        this.f20599e = finderJumpInfo;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bg2.w2(this.f20598d, this.f20599e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        bg2.w2 w2Var = (bg2.w2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        w2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:(5:23|24|25|26|(1:28)(1:56))|(12:30|31|32|33|(1:35)(1:51)|(5:37|38|39|(1:47)(1:45)|46)|50|38|39|(1:41)|47|46)|55|31|32|33|(0)(0)|(0)|50|38|39|(0)|47|46) */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ed, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ee, code lost:
    
        com.tencent.mm.sdk.platformtools.Log.a("safeGetString", "", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e8 A[Catch: Exception -> 0x00ed, TRY_LEAVE, TryCatch #0 {Exception -> 0x00ed, blocks: (B:33:0x00dd, B:37:0x00e8), top: B:32:0x00dd, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e5  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.w2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
