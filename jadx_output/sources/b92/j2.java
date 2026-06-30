package b92;

/* loaded from: classes.dex */
public final class j2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f18445d;

    /* renamed from: e, reason: collision with root package name */
    public int f18446e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f18447f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b92.m2 f18448g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(b92.m2 m2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f18448g = m2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        b92.j2 j2Var = new b92.j2(this.f18448g, continuation);
        j2Var.f18447f = obj;
        return j2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((b92.j2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0193 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0194  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0194 -> B:8:0x0067). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b92.j2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
