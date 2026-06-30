package vq4;

/* loaded from: classes12.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rh.o2 f520849d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(rh.o2 o2Var) {
        super(1);
        this.f520849d = o2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        org.json.JSONObject subJson = (org.json.JSONObject) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subJson, "$this$subJson");
        rh.o2 o2Var = this.f520849d;
        subJson.put("currCount", ((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc) o2Var.f477018b).f134096i);
        subJson.put("deadCount", ((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc) o2Var.f477019c).f134097j.f477093a.size());
        return jz5.f0.f384359a;
    }
}
