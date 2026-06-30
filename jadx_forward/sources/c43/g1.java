package c43;

/* loaded from: classes15.dex */
public final class g1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.n1 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c43.b1 f119960f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f119961g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f119962h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c43.f1 f119963i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(c43.b1 b1Var, boolean z17, android.content.Context context, c43.f1 f1Var) {
        super(1, b1Var);
        this.f119960f = b1Var;
        this.f119961g = z17;
        this.f119962h = context;
        this.f119963i = f1Var;
    }

    @Override // tg3.a
    public void a(android.view.View widget) {
        long j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        if (this.f119961g) {
            return;
        }
        int h17 = s33.y.h(this.f119962h, this.f119960f.f119930c);
        if (h17 == 1) {
            j17 = 6;
        } else if (h17 == 2) {
            j17 = 7;
        } else if (h17 != 3) {
            return;
        } else {
            j17 = 28;
        }
        c43.f1 f1Var = this.f119963i;
        if (f1Var != null) {
            f1Var.b(j17);
        }
    }
}
