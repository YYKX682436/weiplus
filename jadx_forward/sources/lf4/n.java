package lf4;

/* loaded from: classes4.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf4.m f399977d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lf4.m f399978e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lf4.b0 f399979f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(lf4.m mVar, lf4.m mVar2, lf4.b0 b0Var) {
        super(0);
        this.f399977d = mVar;
        this.f399978e = mVar2;
        this.f399979f = b0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        lf4.b0 b0Var = this.f399979f;
        lf4.m mVar = this.f399977d;
        if (mVar != null) {
            b0Var.p(mVar);
        }
        lf4.m mVar2 = this.f399978e;
        if (mVar2 != null) {
            b0Var.f399895o.add(mVar2);
        }
        b0Var.n();
        return jz5.f0.f384359a;
    }
}
