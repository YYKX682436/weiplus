package vq4;

/* loaded from: classes12.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rh.c1 f520911d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f520912e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(rh.c1 c1Var, int i17) {
        super(1);
        this.f520911d = c1Var;
        this.f520912e = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        org.json.JSONObject subJson = (org.json.JSONObject) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subJson, "$this$subJson");
        int i17 = this.f520912e;
        rh.c1 c1Var = this.f520911d;
        c1Var.r(new vq4.q(i17, subJson, c1Var));
        return jz5.f0.f384359a;
    }
}
