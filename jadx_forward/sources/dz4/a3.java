package dz4;

/* loaded from: classes12.dex */
public final class a3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz4.b3 f326695d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f326696e;

    public a3(dz4.b3 b3Var, java.lang.String str) {
        this.f326695d = b3Var;
        this.f326696e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dz4.b3 b3Var = this.f326695d;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.h hVar = b3Var.f326708b;
        if (hVar != null) {
            java.lang.String str = hVar.f298323s[12] ? hVar.f298322r : "";
            dz4.i3 c17 = ((ez4.u) b3Var.f326707a).c();
            java.lang.String path = this.f326696e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(path, "$path");
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.j a17 = c17.a(path);
            dz4.m0 m0Var = b3Var.f326709c;
            if (m0Var != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                ((dz4.a0) m0Var).a(str, a17);
            }
        }
    }
}
