package ad3;

/* loaded from: classes7.dex */
public final class a extends com.tencent.mm.plugin.magicbrush.u4 implements bd3.a {

    /* renamed from: e, reason: collision with root package name */
    public bd3.b f3160e;

    /* renamed from: f, reason: collision with root package name */
    public ad3.c f3161f;

    /* renamed from: g, reason: collision with root package name */
    public ad3.c f3162g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.tencent.mm.plugin.magicbrush.i6 service) {
        super(service);
        kotlin.jvm.internal.o.g(service, "service");
        ad3.c cVar = ad3.c.f3163d;
        this.f3161f = cVar;
        this.f3162g = cVar;
    }

    @Override // com.tencent.mm.plugin.magicbrush.u4
    public void a() {
        if (this.f3160e == null) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            this.f3160e = new bd3.b(context, this, 0, 4, null);
        }
        bd3.b bVar = this.f3160e;
        if (bVar != null) {
            bVar.enable();
        }
    }

    @Override // com.tencent.mm.plugin.magicbrush.u4
    public void b() {
        bd3.b bVar = this.f3160e;
        if (bVar != null) {
            bVar.disable();
        }
        this.f3160e = null;
    }

    public void c(int i17) {
        if (i17 == 0) {
            this.f3162g = ad3.c.f3164e;
        } else if (i17 == 90) {
            this.f3162g = ad3.c.f3167h;
        } else if (i17 == 180) {
            this.f3162g = ad3.c.f3166g;
        } else if (i17 == 270) {
            this.f3162g = ad3.c.f3165f;
        }
        if (this.f3162g != this.f3161f) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("orientation", this.f3162g);
            com.tencent.mm.plugin.magicbrush.z4 z4Var = com.tencent.mm.plugin.magicbrush.z4.f148221f;
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            ((com.tencent.mm.plugin.magicbrush.i6) this.f148167d).Bi(z4Var, jSONObject2);
            com.tencent.mars.xlog.Log.i("MBOnOrientationChangeEventImpl", "send onOrientationsChange event, orientation:" + jSONObject);
        }
        this.f3161f = this.f3162g;
    }
}
