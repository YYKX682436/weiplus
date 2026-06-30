package mh2;

/* loaded from: classes10.dex */
public final class h0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mh2.k0 f407897d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f407898e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(mh2.k0 k0Var, android.content.Context context) {
        super(0);
        this.f407897d = k0Var;
        this.f407898e = context;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        mh2.k0 k0Var = this.f407897d;
        boolean z17 = k0Var.f407918f;
        android.content.Context context = this.f407898e;
        return z17 ? new mh2.j1(context, k0Var) : new mh2.v1(context, k0Var);
    }
}
