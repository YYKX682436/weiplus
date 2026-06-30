package ab2;

/* loaded from: classes2.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f2752d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.biz.FinderBizProfileLoader f2753e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f2754f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.tencent.mm.plugin.finder.biz.FinderBizProfileLoader finderBizProfileLoader, kotlin.jvm.internal.f0 f0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f2753e = finderBizProfileLoader;
        this.f2754f = f0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ab2.b0(this.f2753e, this.f2754f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ab2.b0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0080 A[Catch: Exception -> 0x00bd, TryCatch #0 {Exception -> 0x00bd, blocks: (B:11:0x007c, B:13:0x0080, B:16:0x0097, B:19:0x00b2, B:21:0x0022, B:23:0x0028, B:25:0x0032, B:27:0x003c, B:28:0x0043, B:30:0x0056, B:31:0x005c), top: B:10:0x007c }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0028 A[Catch: Exception -> 0x00bd, TryCatch #0 {Exception -> 0x00bd, blocks: (B:11:0x007c, B:13:0x0080, B:16:0x0097, B:19:0x00b2, B:21:0x0022, B:23:0x0028, B:25:0x0032, B:27:0x003c, B:28:0x0043, B:30:0x0056, B:31:0x005c), top: B:10:0x007c }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0079 -> B:10:0x007c). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ab2.b0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
