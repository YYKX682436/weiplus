package sg0;

/* loaded from: classes10.dex */
public final class t2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f489348d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(java.util.List list) {
        super(1);
        this.f489348d = list;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        org.json.JSONObject it = (org.json.JSONObject) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        bw5.q3 q3Var = new bw5.q3();
        q3Var.d(it.optString("key"));
        q3Var.e(it.optString("textValue"));
        q3Var.f113447e = it.optInt("uintValue");
        q3Var.f113449g[2] = true;
        this.f489348d.add(q3Var);
        return jz5.f0.f384359a;
    }
}
