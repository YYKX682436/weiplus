package eb2;

/* loaded from: classes10.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eb2.p f332245d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f332246e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f332247f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(eb2.p pVar, java.lang.String str, yz5.l lVar) {
        super(1);
        this.f332245d = pVar;
        this.f332246e = str;
        this.f332247f = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.List resultList = (java.util.List) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resultList, "resultList");
        this.f332245d.f332371a.remove(this.f332246e);
        this.f332247f.mo146xb9724478(kz5.n0.X(resultList));
        return jz5.f0.f384359a;
    }
}
