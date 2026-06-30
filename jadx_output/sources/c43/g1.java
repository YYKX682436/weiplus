package c43;

/* loaded from: classes15.dex */
public final class g1 extends com.tencent.mm.plugin.game.chatroom.view.n1 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c43.b1 f38427f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f38428g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f38429h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c43.f1 f38430i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(c43.b1 b1Var, boolean z17, android.content.Context context, c43.f1 f1Var) {
        super(1, b1Var);
        this.f38427f = b1Var;
        this.f38428g = z17;
        this.f38429h = context;
        this.f38430i = f1Var;
    }

    @Override // tg3.a
    public void a(android.view.View widget) {
        long j17;
        kotlin.jvm.internal.o.g(widget, "widget");
        if (this.f38428g) {
            return;
        }
        int h17 = s33.y.h(this.f38429h, this.f38427f.f38397c);
        if (h17 == 1) {
            j17 = 6;
        } else if (h17 == 2) {
            j17 = 7;
        } else if (h17 != 3) {
            return;
        } else {
            j17 = 28;
        }
        c43.f1 f1Var = this.f38430i;
        if (f1Var != null) {
            f1Var.b(j17);
        }
    }
}
