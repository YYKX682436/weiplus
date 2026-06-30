package a82;

/* loaded from: classes12.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f2202d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f2203e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f2204f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f2205g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f2206h;

    /* renamed from: i, reason: collision with root package name */
    public int f2207i;

    /* renamed from: m, reason: collision with root package name */
    public int f2208m;

    /* renamed from: n, reason: collision with root package name */
    public int f2209n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2210o;

    /* renamed from: p, reason: collision with root package name */
    public long f2211p;

    /* renamed from: q, reason: collision with root package name */
    public int f2212q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f2213r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a82.d0 f2214s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(a82.d0 d0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f2214s = d0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        a82.x xVar = new a82.x(this.f2214s, continuation);
        xVar.f2213r = obj;
        return xVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((a82.x) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:248|(1:250)|251|252|253|(1:255)(1:268)|256|257|258|259|260|(1:262)(1:264)|263) */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0d56, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0d5b, code lost:
    
        com.tencent.mars.xlog.Log.e(r7, "note upload new protocol serialize error: " + r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0d58, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0aa5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0d89  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0d8e  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0d9e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0872  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x090b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x091d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0938  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0968  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0a8e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0a8f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x091f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x08bd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x0a8f -> B:8:0x0a9d). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r48) {
        /*
            Method dump skipped, instructions count: 3616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a82.x.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
