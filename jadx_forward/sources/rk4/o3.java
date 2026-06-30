package rk4;

/* loaded from: classes11.dex */
public final class o3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rk4.q3 f478410d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f478411e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f478412f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f478413g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(rk4.q3 q3Var, java.lang.String str, java.lang.String str2, yz5.l lVar) {
        super(1);
        this.f478410d = q3Var;
        this.f478411e = str;
        this.f478412f = str2;
        this.f478413g = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        pm0.v.X(new rk4.n3((ll4.c) obj, this.f478410d, this.f478411e, this.f478412f, this.f478413g));
        return jz5.f0.f384359a;
    }
}
