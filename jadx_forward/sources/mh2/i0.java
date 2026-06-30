package mh2;

/* loaded from: classes10.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mh2.k0 f407903d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f407904e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(mh2.k0 k0Var, android.content.Context context) {
        super(0);
        this.f407903d = k0Var;
        this.f407904e = context;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        mh2.k0 k0Var = this.f407903d;
        boolean z17 = k0Var.f407918f;
        ah2.f fVar = k0Var.f407916d;
        android.content.Context context = this.f407904e;
        return z17 ? new mh2.m1(context, k0Var, fVar) : new mh2.f1(context, k0Var, fVar, k0Var.m147307x3a33aac1());
    }
}
