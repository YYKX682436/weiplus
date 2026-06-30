package rg1;

/* loaded from: classes7.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f476765d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rg1.o f476766e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(java.lang.String str, rg1.o oVar) {
        super(1);
        this.f476765d = str;
        this.f476766e = oVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p971x6de15a2e.j2 connection = (com.p314xaae8f345.mm.p971x6de15a2e.j2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(connection, "connection");
        connection.f153578k = false;
        connection.f153576i = "GET";
        connection.f153580m = true;
        connection.f153587t = true;
        connection.f153582o = 2;
        connection.f153579l = this.f476765d;
        rg1.o oVar = this.f476766e;
        ((rg1.p) oVar).getClass();
        connection.f153581n = new rg1.q(oVar, connection);
        connection.a();
        return jz5.f0.f384359a;
    }
}
