package hw4;

/* loaded from: classes7.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f367123d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hw4.a f367124e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.lang.String str, hw4.a aVar) {
        super(1);
        this.f367123d = str;
        this.f367124e = aVar;
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
        connection.f153579l = this.f367123d;
        hw4.a aVar = this.f367124e;
        aVar.d(connection);
        connection.f153581n = new hw4.b(aVar, connection);
        connection.a();
        return jz5.f0.f384359a;
    }
}
