package ei4;

/* loaded from: classes11.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ei4.h f334746d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f334747e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ei4.h hVar, java.util.List list) {
        super(0);
        this.f334746d = hVar;
        this.f334747e = list;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ei4.h hVar = this.f334746d;
        int mo1894x7e414b06 = hVar.mo1894x7e414b06();
        java.util.List<hi4.a> list = this.f334747e;
        for (hi4.a aVar : list) {
            java.util.HashMap hashMap = hVar.f334749f;
            java.lang.String field_sessionId = aVar.f76582xbed8694c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_sessionId, "field_sessionId");
            hashMap.put(field_sessionId, aVar);
        }
        hVar.f334748e.addAll(list);
        hVar.m8153xd399a4d9(mo1894x7e414b06, list.size());
        return jz5.f0.f384359a;
    }
}
