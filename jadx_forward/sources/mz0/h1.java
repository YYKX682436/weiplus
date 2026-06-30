package mz0;

/* loaded from: classes3.dex */
public final class h1 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f414499d;

    public h1(mz0.b2 b2Var) {
        this.f414499d = b2Var;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        mz0.b2 b2Var = this.f414499d;
        py0.f0 f76 = b2Var.f7();
        java.lang.String string = b2Var.m158361x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gvo, new java.lang.Integer(a06.d.b(floatValue * 100)));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        f76.c(string);
        return jz5.f0.f384359a;
    }
}
