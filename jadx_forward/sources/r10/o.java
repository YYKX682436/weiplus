package r10;

/* loaded from: classes9.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f450118d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f450119e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(java.lang.String str, yz5.l lVar) {
        super(1);
        this.f450118d = str;
        this.f450119e = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        bw5.n8 res = (bw5.n8) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(res, "res");
        boolean z17 = res.f112076m;
        java.lang.String str = this.f450118d;
        if (z17) {
            z20.e eVar = z20.e.f551076e;
            z20.b bVar = new z20.b();
            bVar.f551070a = eVar;
            bw5.q9 q9Var = new bw5.q9();
            q9Var.f113532d = "ecso_open";
            q9Var.f113546u[1] = true;
            q9Var.c(java.lang.System.currentTimeMillis());
            q9Var.b(2);
            bVar.f551071b = q9Var;
            bVar.f(str);
            bVar.c("native_done");
            bVar.a();
        } else {
            z20.e eVar2 = z20.e.f551077f;
            z20.b bVar2 = new z20.b();
            bVar2.f551070a = eVar2;
            bw5.q9 q9Var2 = new bw5.q9();
            q9Var2.f113532d = "ecso_open";
            q9Var2.f113546u[1] = true;
            q9Var2.c(java.lang.System.currentTimeMillis());
            q9Var2.b(2);
            bVar2.f551071b = q9Var2;
            bVar2.f(str);
            bVar2.c("native_done");
            bVar2.a();
        }
        yz5.l lVar = this.f450119e;
        if (lVar != null) {
            lVar.mo146xb9724478(res);
        }
        return jz5.f0.f384359a;
    }
}
