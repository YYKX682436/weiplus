package dz0;

/* loaded from: classes5.dex */
public final class u0 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f326553d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az0.e f326554e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f326555f;

    public u0(float f17, az0.e eVar, java.lang.String str) {
        this.f326553d = f17;
        this.f326554e = eVar;
        this.f326555f = str;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        az0.e eVar;
        float floatValue = ((java.lang.Number) obj).floatValue();
        if (floatValue >= this.f326553d && (eVar = this.f326554e) != null) {
            ((mz0.w1) eVar).a(this.f326555f, floatValue);
        }
        return jz5.f0.f384359a;
    }
}
