package to1;

/* loaded from: classes15.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ to1.r f502465d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f502466e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(to1.r rVar, java.lang.String str) {
        super(0);
        this.f502465d = rVar;
        this.f502466e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.net.Uri a17 = this.f502465d.a(this.f502466e);
        to1.n nVar = to1.r.f502467d;
        to1.r rVar = a17.getPath() != null ? (to1.r) to1.r.f502468e.get(a17.getPath()) : null;
        if (rVar == null && (rVar = nVar.b(a17)) != null && a17.getPath() != null) {
            to1.r.f502468e.put(a17.getPath(), rVar);
        }
        return rVar;
    }
}
