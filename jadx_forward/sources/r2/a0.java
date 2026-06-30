package r2;

/* loaded from: classes14.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w0.s f450224d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f450225e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u1.y1 f450226f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(w0.s sVar, java.lang.String str, u1.y1 y1Var) {
        super(1);
        this.f450224d = sVar;
        this.f450225e = str;
        this.f450226f = y1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        n0.b2 DisposableEffect = (n0.b2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(DisposableEffect, "$this$DisposableEffect");
        return new r2.y(this.f450224d.d(this.f450225e, new r2.z(this.f450226f)));
    }
}
