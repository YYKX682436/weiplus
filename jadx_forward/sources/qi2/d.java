package qi2;

/* loaded from: classes10.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f445045d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qi2.n f445046e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Context context, qi2.n nVar) {
        super(0);
        this.f445045d = context;
        this.f445046e = nVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        qi2.n nVar = this.f445046e;
        zh2.c cVar = nVar.f445110h;
        android.content.Context context = this.f445045d;
        return new ni2.x(context, cVar, new qi2.c(nVar, context));
    }
}
