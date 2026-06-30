package sc2;

/* loaded from: classes2.dex */
public final class z1 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sc2.f2 f487940a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487941b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f487942c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f487943d;

    public z1(sc2.f2 f2Var, android.view.View view, boolean z17, yz5.l lVar) {
        this.f487940a = f2Var;
        this.f487941b = view;
        this.f487942c = z17;
        this.f487943d = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        boolean z17 = bitmap != null;
        sc2.f2 f2Var = this.f487940a;
        f2Var.getClass();
        android.view.View iconLayout = this.f487941b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconLayout, "iconLayout");
        pm0.v.X(new sc2.x1(z17, iconLayout));
        if (bitmap == null || !this.f487942c) {
            return;
        }
        ff0.t tVar = (ff0.t) i95.n0.c(ff0.t.class);
        java.lang.String str = aVar instanceof java.lang.String ? (java.lang.String) aVar : null;
        if (str == null) {
            str = "";
        }
        ((dl4.m0) tVar).cj(str, bitmap, new sc2.y1(f2Var, this.f487943d));
        iconLayout.getParent();
    }
}
