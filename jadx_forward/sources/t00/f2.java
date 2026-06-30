package t00;

/* loaded from: classes.dex */
public final class f2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c00.n3 f495813d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(c00.n3 n3Var) {
        super(1);
        this.f495813d = n3Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("result", booleanValue);
        this.f495813d.b(jSONObject);
        return jz5.f0.f384359a;
    }
}
