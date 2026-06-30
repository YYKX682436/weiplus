package cz2;

/* loaded from: classes4.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f306521d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f306522e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jz5.l f306523f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.lang.String str, int i17, jz5.l lVar) {
        super(0);
        this.f306521d = str;
        this.f306522e = i17;
        this.f306523f = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("uri:");
        sb6.append(this.f306521d);
        sb6.append(",errCode:");
        sb6.append(this.f306522e);
        sb6.append(",size:");
        cz2.b bVar = (cz2.b) this.f306523f.f384367e;
        sb6.append(bVar != null ? java.lang.Integer.valueOf(bVar.f306516a) : null);
        return sb6.toString();
    }
}
