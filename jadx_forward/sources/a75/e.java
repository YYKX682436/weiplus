package a75;

/* loaded from: classes11.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2600x5c6729a.p2601xd7508997.C20985x9d84be29 f83474d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.p314xaae8f345.mm.sdk.p2600x5c6729a.p2601xd7508997.C20985x9d84be29 c20985x9d84be29) {
        super(0);
        this.f83474d = c20985x9d84be29;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.p2601xd7508997.C20985x9d84be29 c20985x9d84be29 = this.f83474d;
        a75.d dVar = new a75.d(c20985x9d84be29);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c20985x9d84be29.f273917e, e75.g.f69659x9393ed43)) {
            return new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(xu5.b.b(), dVar);
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = xu5.b.f538833e;
        java.lang.String str = c20985x9d84be29.f273917e;
        xu5.b bVar = (xu5.b) concurrentHashMap.get(str);
        if (bVar == null) {
            bVar = xu5.b.a(str);
        }
        return new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(bVar, dVar);
    }
}
