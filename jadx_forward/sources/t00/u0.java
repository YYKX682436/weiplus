package t00;

/* loaded from: classes9.dex */
public final class u0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c00.n3 f495890d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(c00.n3 n3Var) {
        super(1);
        this.f495890d = n3Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        bw5.n8 n8Var = (bw5.n8) obj;
        boolean z17 = n8Var != null && n8Var.f112072f == 0;
        c00.n3 n3Var = this.f495890d;
        if (z17) {
            n3Var.b(null);
        } else {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("result", n8Var != null ? n8Var.m12558x17ec12d2() : null);
            n3Var.d(jSONObject);
        }
        return jz5.f0.f384359a;
    }
}
