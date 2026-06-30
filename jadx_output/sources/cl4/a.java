package cl4;

/* loaded from: classes11.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f42935d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f42936e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(org.json.JSONObject jSONObject, java.lang.String str) {
        super(1);
        this.f42935d = jSONObject;
        this.f42936e = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        bw5.zq0 context = (bw5.zq0) obj;
        kotlin.jvm.internal.o.g(context, "context");
        bw5.zq0 zq0Var = new bw5.zq0();
        zq0Var.parseFrom(context.getData());
        java.lang.String jSONObject = this.f42935d.toString();
        kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
        zq0Var.M1 = r26.i0.u(jSONObject, ',', ';', false, 4, null);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        android.util.ArrayMap arrayMap = zq0Var.f36141g2;
        arrayMap.put(807, bool);
        zq0Var.D = this.f42936e;
        arrayMap.put(311, bool);
        return zq0Var;
    }
}
