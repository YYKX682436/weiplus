package b53;

/* loaded from: classes8.dex */
public class d implements tx4.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b53.f f18083a;

    public d(b53.f fVar) {
        this.f18083a = fVar;
    }

    @Override // tx4.e
    public void onCreateMMMenu(db5.g4 g4Var) {
        b53.f fVar = this.f18083a;
        com.tencent.mm.plugin.game.luggage.page.x0 x0Var = fVar.f18085a;
        android.content.Context context = x0Var.f406610d;
        b53.c cVar = fVar.f18086b;
        for (r45.rk4 rk4Var : cVar.f18081a) {
            if (rk4Var == null) {
                g4Var.f(-1, "");
            } else {
                b53.a aVar = (b53.a) ((java.util.HashMap) cVar.f18082b).get(java.lang.Integer.valueOf(rk4Var.f384967g));
                if (aVar != null) {
                    aVar.a(context, x0Var, g4Var, rk4Var);
                }
            }
        }
    }
}
