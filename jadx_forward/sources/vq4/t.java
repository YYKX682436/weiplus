package vq4;

/* loaded from: classes12.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rh.c1 f520915d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(rh.c1 c1Var) {
        super(1);
        this.f520915d = c1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        org.json.JSONObject subJson = (org.json.JSONObject) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subJson, "$this$subJson");
        qh.b bVar = this.f520915d.f476863l;
        subJson.put("fg", bVar != null ? java.lang.Integer.valueOf(bVar.f444841a) : null);
        return jz5.f0.f384359a;
    }
}
