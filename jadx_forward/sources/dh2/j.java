package dh2;

/* loaded from: classes10.dex */
public final class j implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dh2.x f313980d;

    public j(dh2.x xVar) {
        this.f313980d = xVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        int intValue = ((java.lang.Number) obj).intValue();
        ah2.c cVar = this.f313980d.f314006m;
        if (cVar != null) {
            float f17 = intValue;
            dh2.b0 b0Var = (dh2.b0) cVar;
            b0Var.f313964k.a(f17 / 12.0f);
            jh2.c cVar2 = b0Var.f313959f;
            if (cVar2 != null) {
                cVar2.mo140935x93c29fe5((int) f17);
            }
        }
        return jz5.f0.f384359a;
    }
}
