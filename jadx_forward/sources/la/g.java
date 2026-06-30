package la;

/* loaded from: classes15.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public float f398985a;

    /* renamed from: b, reason: collision with root package name */
    public float f398986b;

    /* renamed from: c, reason: collision with root package name */
    public float f398987c;

    /* renamed from: d, reason: collision with root package name */
    public float f398988d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f398989e;

    public g() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f398989e = arrayList;
        this.f398985a = 0.0f;
        this.f398986b = 0.0f;
        this.f398987c = 0.0f;
        this.f398988d = 0.0f;
        arrayList.clear();
    }

    public void a(float f17, float f18, float f19, float f27, float f28, float f29) {
        la.d dVar = new la.d(f17, f18, f19, f27);
        dVar.f398980f = f28;
        dVar.f398981g = f29;
        ((java.util.ArrayList) this.f398989e).add(dVar);
        double d17 = f28 + f29;
        this.f398987c = ((f17 + f19) * 0.5f) + (((f19 - f17) / 2.0f) * ((float) java.lang.Math.cos(java.lang.Math.toRadians(d17))));
        this.f398988d = ((f18 + f27) * 0.5f) + (((f27 - f18) / 2.0f) * ((float) java.lang.Math.sin(java.lang.Math.toRadians(d17))));
    }

    public void b(float f17, float f18) {
        la.e eVar = new la.e();
        eVar.f398982b = f17;
        eVar.f398983c = f18;
        ((java.util.ArrayList) this.f398989e).add(eVar);
        this.f398987c = f17;
        this.f398988d = f18;
    }
}
