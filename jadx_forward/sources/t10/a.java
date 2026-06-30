package t10;

/* loaded from: classes9.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f496080d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f496081e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(yz5.l lVar, java.lang.String str) {
        super(1);
        this.f496080d = lVar;
        this.f496081e = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        bw5.n8 res = (bw5.n8) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(res, "res");
        yz5.l lVar = this.f496080d;
        if (lVar != null) {
            z20.e eVar = z20.e.f551076e;
            z20.b bVar = new z20.b();
            bVar.f551070a = eVar;
            bw5.q9 q9Var = new bw5.q9();
            q9Var.f113532d = "ecso_open";
            q9Var.f113546u[1] = true;
            q9Var.c(java.lang.System.currentTimeMillis());
            q9Var.b(2);
            bVar.f551071b = q9Var;
            bVar.f(this.f496081e);
            bVar.c("native_handler_done");
            bVar.f551071b.f113545t.add("native_handler");
            bVar.a();
            lVar.mo146xb9724478(res);
        }
        return jz5.f0.f384359a;
    }
}
