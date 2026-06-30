package m90;

/* loaded from: classes4.dex */
public class x1 extends tg3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f406463e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f406464f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f406465g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f406466h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f406467i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f406468m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(m90.y1 y1Var, int i17, r35.m3 m3Var, java.util.Map map, java.lang.String str, android.os.Bundle bundle, java.lang.ref.WeakReference weakReference, java.lang.String str2, java.lang.ref.WeakReference weakReference2) {
        super(i17, m3Var);
        this.f406463e = map;
        this.f406464f = str;
        this.f406465g = bundle;
        this.f406466h = weakReference;
        this.f406467i = str2;
        this.f406468m = weakReference2;
    }

    @Override // tg3.a
    public void a(android.view.View view) {
        ((sg3.r) i95.n0.c(sg3.r.class)).hj(this.f406463e, this.f406464f, this.f406465g, this.f406466h, this.f406467i, true);
        ((ih3.e) ((tg3.k1) i95.n0.c(tg3.k1.class))).Di("link_succeed_contact", this.f406463e, this.f406465g, this.f406466h, this.f406468m);
    }
}
