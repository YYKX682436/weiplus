package vq4;

/* loaded from: classes12.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rh.c1 f520916d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(rh.c1 c1Var) {
        super(1);
        this.f520916d = c1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        org.json.JSONObject subJson = (org.json.JSONObject) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subJson, "$this$subJson");
        rh.c1 c1Var = this.f520916d;
        qh.b bVar = c1Var.f476863l;
        subJson.put("top1", bVar != null ? bVar.f444849i : null);
        qh.b bVar2 = c1Var.f476863l;
        subJson.put("ratio1", bVar2 != null ? java.lang.Integer.valueOf(bVar2.f444850j) : null);
        qh.b bVar3 = c1Var.f476863l;
        subJson.put("top2", bVar3 != null ? bVar3.f444851k : null);
        qh.b bVar4 = c1Var.f476863l;
        subJson.put("ratio2", bVar4 != null ? java.lang.Integer.valueOf(bVar4.f444852l) : null);
        return jz5.f0.f384359a;
    }
}
