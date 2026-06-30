package az0;

/* loaded from: classes5.dex */
public final class x5 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.e0 f97579d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.k f97580e;

    public x5(p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var, p3325xe03a0797.p3326xc267989b.p3328x30012e.k kVar) {
        this.f97579d = e0Var;
        this.f97580e = kVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        float f17 = this.f97579d.f391648d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (floatValue <= f17) {
            return f0Var;
        }
        java.lang.Object mo771x2f8fd3 = this.f97580e.mo771x2f8fd3(new java.lang.Float(floatValue), interfaceC29045xdcb5ca57);
        return mo771x2f8fd3 == pz5.a.f440719d ? mo771x2f8fd3 : f0Var;
    }
}
