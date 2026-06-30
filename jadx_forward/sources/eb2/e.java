package eb2;

/* loaded from: classes10.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eb2.p f332265d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f332266e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f332267f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(eb2.p pVar, java.lang.String str, yz5.l lVar) {
        super(1);
        this.f332265d = pVar;
        this.f332266e = str;
        this.f332267f = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.List resultList = (java.util.List) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resultList, "resultList");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f332265d.f332371a;
        p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(concurrentHashMap).remove(this.f332266e);
        java.lang.Object obj2 = (zy2.dc) kz5.n0.Z(resultList);
        if (obj2 == null) {
            obj2 = new ya2.b2();
        }
        this.f332267f.mo146xb9724478(obj2);
        return jz5.f0.f384359a;
    }
}
