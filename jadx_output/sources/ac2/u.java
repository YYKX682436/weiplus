package ac2;

/* loaded from: classes2.dex */
public final class u extends androidx.recyclerview.widget.d3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f3059d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f3060e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ac2.y f3061f;

    public u(kotlin.jvm.internal.e0 e0Var, kotlin.jvm.internal.c0 c0Var, ac2.y yVar) {
        this.f3059d = e0Var;
        this.f3060e = c0Var;
        this.f3061f = yVar;
    }

    @Override // androidx.recyclerview.widget.v2
    public boolean b(androidx.recyclerview.widget.RecyclerView rv6, android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(rv6, "rv");
        kotlin.jvm.internal.o.g(e17, "e");
        int action = e17.getAction();
        kotlin.jvm.internal.e0 e0Var = this.f3059d;
        ac2.y yVar = this.f3061f;
        kotlin.jvm.internal.c0 c0Var = this.f3060e;
        if (action == 0) {
            e0Var.f310115d = e17.getY();
            c0Var.f310112d = yVar.f3069u != null;
        } else if (action == 2 && c0Var.f310112d) {
            float y17 = e0Var.f310115d - e17.getY();
            if (y17 > 0.0f && y17 >= i65.a.b(yVar.f106968d, 32)) {
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = yVar.f3069u;
                if (baseFinderFeed != null) {
                    yVar.f3066r.D0(baseFinderFeed);
                }
                c0Var.f310112d = false;
            }
        }
        return false;
    }
}
