package cl4;

/* loaded from: classes11.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f124468d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124469e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(org.json.JSONObject jSONObject, java.lang.String str) {
        super(1);
        this.f124468d = jSONObject;
        this.f124469e = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        bw5.zq0 context = (bw5.zq0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        bw5.zq0 zq0Var = new bw5.zq0();
        zq0Var.mo11468x92b714fd(context.m75960xfb7e5820());
        java.lang.String jSONObject = this.f124468d.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
        zq0Var.M1 = r26.i0.u(jSONObject, ',', ';', false, 4, null);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        android.util.ArrayMap arrayMap = zq0Var.f117674g2;
        arrayMap.put(807, bool);
        zq0Var.D = this.f124469e;
        arrayMap.put(311, bool);
        return zq0Var;
    }
}
