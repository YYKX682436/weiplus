package r2;

/* loaded from: classes14.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f450284d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.g1 f450285e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o1.e f450286f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f450287g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ w0.s f450288h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f450289i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ u1.y1 f450290m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(android.content.Context context, n0.g1 g1Var, o1.e eVar, yz5.l lVar, w0.s sVar, java.lang.String str, u1.y1 y1Var) {
        super(0);
        this.f450284d = context;
        this.f450285e = g1Var;
        this.f450286f = eVar;
        this.f450287g = lVar;
        this.f450288h = sVar;
        this.f450289i = str;
        this.f450290m = y1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View m161324x7cca4367;
        r2.h0 h0Var = new r2.h0(this.f450284d, this.f450285e, this.f450286f);
        h0Var.m161327x7029ba48(this.f450287g);
        w0.s sVar = this.f450288h;
        java.lang.Object c17 = sVar != null ? sVar.c(this.f450289i) : null;
        android.util.SparseArray<android.os.Parcelable> sparseArray = c17 instanceof android.util.SparseArray ? (android.util.SparseArray) c17 : null;
        if (sparseArray != null && (m161324x7cca4367 = h0Var.m161324x7cca4367()) != null) {
            m161324x7cca4367.restoreHierarchyState(sparseArray);
        }
        this.f450290m.f505257a = h0Var;
        return h0Var.m161332x29b3042();
    }
}
