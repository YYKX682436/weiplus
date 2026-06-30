package vq4;

/* loaded from: classes12.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rh.c1 f520913d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f520914e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(rh.c1 c1Var, boolean z17) {
        super(1);
        this.f520913d = c1Var;
        this.f520914e = z17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        org.json.JSONObject subJson = (org.json.JSONObject) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subJson, "$this$subJson");
        rh.c1 c1Var = this.f520913d;
        qh.b bVar = c1Var.f476863l;
        subJson.put("charge", bVar != null ? java.lang.Integer.valueOf(bVar.f444845e) : null);
        if (this.f520914e) {
            qh.b bVar2 = c1Var.f476863l;
            subJson.put("screenOff", bVar2 != null ? java.lang.Integer.valueOf(bVar2.f444847g) : null);
        }
        return jz5.f0.f384359a;
    }
}
