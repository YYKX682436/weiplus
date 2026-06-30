package qi2;

/* loaded from: classes10.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qi2.n f445101d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f445102e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(qi2.n nVar, android.content.Context context) {
        super(0);
        this.f445101d = nVar;
        this.f445102e = context;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        qi2.n nVar = this.f445101d;
        gk2.e g17 = nVar.f445110h.g();
        qi2.l lVar = new qi2.l(nVar);
        return new qi2.v(g17, nVar.f445110h, this.f445102e, lVar);
    }
}
