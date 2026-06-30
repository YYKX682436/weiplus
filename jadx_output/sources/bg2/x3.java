package bg2;

/* loaded from: classes2.dex */
public final class x3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f20641d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f20642e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f20643f;

    /* renamed from: g, reason: collision with root package name */
    public int f20644g;

    /* renamed from: h, reason: collision with root package name */
    public long f20645h;

    /* renamed from: i, reason: collision with root package name */
    public int f20646i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ bg2.z3 f20647m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(bg2.z3 z3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f20647m = z3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bg2.x3(this.f20647m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bg2.x3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x012b, code lost:
    
        if (r4 == null) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0188  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.x3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
