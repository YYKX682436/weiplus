package u20;

/* loaded from: classes9.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u20.y f505470d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f505471e;

    public t(u20.y yVar, android.content.Context context) {
        this.f505470d = yVar;
        this.f505471e = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u20.y yVar = this.f505470d;
        u20.q qVar = yVar.f505486d;
        yVar.getClass();
        nb5.a aVar = new nb5.a();
        java.lang.String str = qVar.f505460i;
        if (str == null) {
            str = "";
        }
        aVar.n(str);
        aVar.l(qVar.a());
        java.util.List list = yVar.f505390a;
        boolean z17 = list == null || list.isEmpty();
        android.content.Context context = this.f505471e;
        if (!z17) {
            ((java.util.ArrayList) yVar.f505488f).addAll(yVar.f505390a);
            n13.x xVar = yVar.f505489g;
            n13.t tVar = new n13.t();
            tVar.f415667b = xVar;
            n13.a0.V0.getClass();
            tVar.f415668c = n13.y.f415674a;
            ((dk5.y) ((n13.a0) i95.n0.c(n13.a0.class))).Ai(context, aVar, yVar.f505488f, tVar);
            return;
        }
        n13.r rVar = new n13.r();
        rVar.f415651b = 101;
        rVar.f415654e = false;
        if (yVar.f505486d.f505462k == 1) {
            rVar.f415655f = false;
            rVar.f415656g = false;
            rVar.f415657h = false;
        }
        rVar.f415652c = yVar.f505490h;
        ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(context, aVar, rVar);
    }
}
