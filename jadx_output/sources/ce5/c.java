package ce5;

/* loaded from: classes4.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f40804d;

    /* renamed from: e, reason: collision with root package name */
    public int f40805e;

    /* renamed from: f, reason: collision with root package name */
    public int f40806f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f40807g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f40808h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ce5.d f40809i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f40810m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ aq.c f40811n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.lang.String str, ce5.d dVar, java.lang.String str2, aq.c cVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f40808h = str;
        this.f40809i = dVar;
        this.f40810m = str2;
        this.f40811n = cVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        ce5.c cVar = new ce5.c(this.f40808h, this.f40809i, this.f40810m, this.f40811n, continuation);
        cVar.f40807g = obj;
        return cVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ce5.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x01bb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x01a4 -> B:7:0x01a7). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ce5.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
