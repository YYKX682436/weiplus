package qo4;

/* loaded from: classes10.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f447192d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f447193e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i17, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(1);
        this.f447192d = i17;
        this.f447193e = h0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        org.json.JSONObject it = (org.json.JSONObject) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        qo4.c cVar = qo4.c.f447194a;
        if (it.optInt("key", -1) == this.f447192d) {
            this.f447193e.f391656d = it;
        }
        return jz5.f0.f384359a;
    }
}
