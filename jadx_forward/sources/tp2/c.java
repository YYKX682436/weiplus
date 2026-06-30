package tp2;

/* loaded from: classes2.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f502665d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tp2.f f502666e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f502667f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.content.Intent intent, tp2.f fVar, so2.j5 j5Var) {
        super(1);
        this.f502665d = intent;
        this.f502666e = fVar;
        this.f502667f = j5Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("enter_page_type", "live_replay_card");
        jSONObject.put("is_lrfeed", "1");
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        android.content.Intent intent = this.f502665d;
        intent.putExtra("key_extra_info", t17);
        intent.putExtra("KEY_CHECK_FEED_VALID", true);
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        s40.w0.ba((s40.w0) c17, this.f502666e.f502672b, ((vp2.u) this.f502667f).getFeedObject().getFeedObject(), false, this.f502665d, 4, null);
        return jz5.f0.f384359a;
    }
}
