package az0;

/* loaded from: classes5.dex */
public final class w5 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.e0 f97547d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.k f97548e;

    public w5(p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var, p3325xe03a0797.p3326xc267989b.p3328x30012e.k kVar) {
        this.f97547d = e0Var;
        this.f97548e = kVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        this.f97547d.f391648d = floatValue;
        java.lang.Object mo771x2f8fd3 = this.f97548e.mo771x2f8fd3(new java.lang.Float(floatValue), interfaceC29045xdcb5ca57);
        return mo771x2f8fd3 == pz5.a.f440719d ? mo771x2f8fd3 : jz5.f0.f384359a;
    }
}
