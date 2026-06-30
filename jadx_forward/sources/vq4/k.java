package vq4;

/* loaded from: classes5.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f520854d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f520855e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f520856f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(java.lang.String str, int i17, float f17) {
        super(1);
        this.f520854d = str;
        this.f520855e = i17;
        this.f520856f = f17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        org.json.JSONObject subJson = (org.json.JSONObject) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subJson, "$this$subJson");
        subJson.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, this.f520854d);
        subJson.put("tid", this.f520855e);
        subJson.put("cpuLoad", java.lang.Float.valueOf(this.f520856f));
        return jz5.f0.f384359a;
    }
}
