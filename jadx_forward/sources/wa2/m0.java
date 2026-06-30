package wa2;

/* loaded from: classes3.dex */
public final class m0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f525682d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wa2.n0 f525683e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(android.content.Context context, wa2.n0 n0Var) {
        super(0);
        this.f525682d = context;
        this.f525683e = n0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        return new android.view.GestureDetector(this.f525682d, this.f525683e);
    }
}
