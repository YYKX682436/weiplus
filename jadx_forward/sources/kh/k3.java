package kh;

/* loaded from: classes12.dex */
public final class k3 extends kh.o3 {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f389375c;

    /* renamed from: d, reason: collision with root package name */
    public final kh.i3 f389376d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k3(java.lang.String r1, kh.i3 r2, int r3, p3321xbce91901.jvm.p3324x21ffc6bd.i r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L6
            kh.h3 r2 = kh.h3.f389357a
        L6:
            java.lang.String r3 = "pattern"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r1, r3)
            r0.<init>(r2)
            r0.f389375c = r1
            r0.f389376d = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kh.k3.<init>(java.lang.String, kh.i3, int, kotlin.jvm.internal.i):void");
    }

    @Override // kh.o3
    public java.lang.String a(java.lang.String name, int i17) {
        kh.i3 i3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        if (!r26.i0.n(name, this.f389375c, false) || (i3Var = this.f389376d) == null) {
            return null;
        }
        return i3Var.a(this, name);
    }
}
