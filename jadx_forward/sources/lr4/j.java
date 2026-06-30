package lr4;

/* loaded from: classes11.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lr4.k f402272d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f402273e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f402274f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(lr4.k kVar, java.util.List list, boolean z17) {
        super(0);
        this.f402272d = kVar;
        this.f402273e = list;
        this.f402274f = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        lr4.k kVar = this.f402272d;
        int mo1894x7e414b06 = kVar.mo1894x7e414b06();
        for (kr4.g gVar : this.f402273e) {
            java.util.HashMap hashMap = kVar.f402277g;
            if (!hashMap.containsKey(gVar.f69048xbed8694c)) {
                gVar.t0();
                java.lang.String field_sessionId = gVar.f69048xbed8694c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_sessionId, "field_sessionId");
                hashMap.put(field_sessionId, gVar);
                kVar.f402276f.add(gVar);
            }
        }
        if (this.f402274f) {
            kVar.f402280m.clear();
            kVar.m8146xced61ae5();
        } else {
            kVar.m8153xd399a4d9(mo1894x7e414b06, kVar.mo1894x7e414b06());
        }
        return jz5.f0.f384359a;
    }
}
