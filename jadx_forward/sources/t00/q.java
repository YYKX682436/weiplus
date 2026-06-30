package t00;

/* loaded from: classes9.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z20.b f495884d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(z20.b bVar) {
        super(1);
        this.f495884d = bVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.Map it = (java.util.Map) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        bw5.q9 q9Var = this.f495884d.f551071b;
        q9Var.f113541p = new org.json.JSONObject(it).toString();
        q9Var.f113546u[11] = true;
        return jz5.f0.f384359a;
    }
}
