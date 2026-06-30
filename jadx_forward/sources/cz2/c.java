package cz2;

/* loaded from: classes4.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f306518d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f306519e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jz5.l f306520f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.lang.String str, int i17, jz5.l lVar) {
        super(0);
        this.f306518d = str;
        this.f306519e = i17;
        this.f306520f = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("uri:");
        sb6.append(this.f306518d);
        sb6.append(",errCode:");
        sb6.append(this.f306519e);
        sb6.append(",size:");
        cz2.b bVar = (cz2.b) this.f306520f.f384367e;
        sb6.append(bVar != null ? java.lang.Integer.valueOf(bVar.f306516a) : null);
        return sb6.toString();
    }
}
