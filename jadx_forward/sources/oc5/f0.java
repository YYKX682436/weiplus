package oc5;

/* loaded from: classes12.dex */
public final class f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oc5.t f425943d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oc5.g0 f425944e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f425945f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f425946g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f425947h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ oc5.n f425948i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(oc5.t tVar, oc5.g0 g0Var, android.view.View view, android.graphics.Point point, android.graphics.Bitmap bitmap, oc5.n nVar) {
        super(0);
        this.f425943d = tVar;
        this.f425944e = g0Var;
        this.f425945f = view;
        this.f425946g = point;
        this.f425947h = bitmap;
        this.f425948i = nVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        db5.f0 f0Var = (db5.f0) this.f425945f;
        android.graphics.Point point = this.f425946g;
        oc5.g0 g0Var = this.f425944e;
        oc5.t tVar = this.f425943d;
        tVar.f426009d = g0Var.d(tVar, f0Var, null, point);
        tVar.f426015j = !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r0, this.f425947h);
        android.graphics.Bitmap bitmap = tVar.f426009d;
        if (bitmap != null) {
            bitmap.isRecycled();
        }
        g0Var.c(tVar, this.f425948i);
        return jz5.f0.f384359a;
    }
}
