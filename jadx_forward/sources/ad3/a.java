package ad3;

/* loaded from: classes7.dex */
public final class a extends com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.u4 implements bd3.a {

    /* renamed from: e, reason: collision with root package name */
    public bd3.b f84693e;

    /* renamed from: f, reason: collision with root package name */
    public ad3.c f84694f;

    /* renamed from: g, reason: collision with root package name */
    public ad3.c f84695g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.i6 service) {
        super(service);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        ad3.c cVar = ad3.c.f84696d;
        this.f84694f = cVar;
        this.f84695g = cVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.u4
    public void a() {
        if (this.f84693e == null) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            this.f84693e = new bd3.b(context, this, 0, 4, null);
        }
        bd3.b bVar = this.f84693e;
        if (bVar != null) {
            bVar.enable();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.u4
    public void b() {
        bd3.b bVar = this.f84693e;
        if (bVar != null) {
            bVar.disable();
        }
        this.f84693e = null;
    }

    public void c(int i17) {
        if (i17 == 0) {
            this.f84695g = ad3.c.f84697e;
        } else if (i17 == 90) {
            this.f84695g = ad3.c.f84700h;
        } else if (i17 == 180) {
            this.f84695g = ad3.c.f84699g;
        } else if (i17 == 270) {
            this.f84695g = ad3.c.f84698f;
        }
        if (this.f84695g != this.f84694f) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("orientation", this.f84695g);
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.z4 z4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.z4.f229754f;
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.i6) this.f229700d).Bi(z4Var, jSONObject2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBOnOrientationChangeEventImpl", "send onOrientationsChange event, orientation:" + jSONObject);
        }
        this.f84694f = this.f84695g;
    }
}
