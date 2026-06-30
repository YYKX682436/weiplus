package u20;

/* loaded from: classes9.dex */
public final class p extends u20.c {

    /* renamed from: d, reason: collision with root package name */
    public final u20.n f505451d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(org.json.JSONObject params, java.util.List list, com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.t callback) {
        super(list, callback);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        org.json.JSONObject optJSONObject = params.optJSONObject("shopParams");
        u20.n nVar = optJSONObject == null ? null : new u20.n(optJSONObject.optString("entranceGMsgID"), optJSONObject.optString("appUin"));
        if (nVar == null) {
            ((t00.m2) callback).a("model is null");
        }
        this.f505451d = nVar;
    }
}
