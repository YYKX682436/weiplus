package b53;

/* loaded from: classes8.dex */
public class e implements tx4.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b53.f f18084a;

    public e(b53.f fVar) {
        this.f18084a = fVar;
    }

    @Override // tx4.f
    public void a(android.view.MenuItem menuItem) {
        r45.rk4 rk4Var;
        b53.f fVar = this.f18084a;
        com.tencent.mm.plugin.game.luggage.page.x0 x0Var = fVar.f18085a;
        android.content.Context context = x0Var.f406610d;
        b53.c cVar = fVar.f18086b;
        b53.a aVar = (b53.a) ((java.util.HashMap) cVar.f18082b).get(java.lang.Integer.valueOf(menuItem.getItemId()));
        java.util.Iterator it = cVar.f18081a.iterator();
        while (true) {
            if (!it.hasNext()) {
                rk4Var = null;
                break;
            }
            rk4Var = (r45.rk4) it.next();
            if (rk4Var != null && rk4Var.f384967g == menuItem.getItemId()) {
                break;
            }
        }
        if (aVar != null && rk4Var != null) {
            aVar.b(context, x0Var, rk4Var);
        }
        fVar.f18087c.b();
    }
}
