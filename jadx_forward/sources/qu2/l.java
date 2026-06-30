package qu2;

/* loaded from: classes12.dex */
public final class l implements ts5.d {

    /* renamed from: a, reason: collision with root package name */
    public final ts5.a f448326a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f448327b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f448328c;

    /* renamed from: d, reason: collision with root package name */
    public float f448329d;

    public l(ts5.a collectWhat) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(collectWhat, "collectWhat");
        this.f448326a = collectWhat;
    }

    @Override // ts5.d
    public void a(java.util.Map map) {
        if (this.f448327b && !this.f448328c) {
            this.f448328c = true;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.c2) ((ob0.h3) i95.n0.c(ob0.h3.class))).getClass();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("startMemory", java.lang.Float.valueOf(this.f448329d));
            jSONObject.put("stopMemory", java.lang.Float.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.b0.B.g().f425501y / 1024.0f));
            ((nu2.i) ((ts5.n) i95.n0.c(ts5.n.class))).Ai(this.f448326a, jSONObject);
        }
    }

    @Override // ts5.d
    /* renamed from: cancel */
    public void mo149995xae7a2e7a() {
        this.f448328c = true;
    }

    @Override // ts5.d
    /* renamed from: start */
    public void mo149996x68ac462() {
        if (this.f448327b) {
            return;
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.c2) ((ob0.h3) i95.n0.c(ob0.h3.class))).getClass();
        this.f448329d = com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.b0.B.g().f425501y / 1024.0f;
        this.f448327b = true;
    }
}
