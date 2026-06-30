package p3325xe03a0797.p3326xc267989b;

/* loaded from: classes14.dex */
public final class c4 extends p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.h0 {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.ThreadLocal f391683g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c4(oz5.l r3, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r4) {
        /*
            r2 = this;
            kotlinx.coroutines.d4 r0 = p3325xe03a0797.p3326xc267989b.d4.f391701d
            oz5.i r1 = r3.get(r0)
            if (r1 != 0) goto Ld
            oz5.l r0 = r3.mo7096x348d9a(r0)
            goto Le
        Ld:
            r0 = r3
        Le:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f391683g = r0
            oz5.l r4 = r4.mo48699x76847179()
            oz5.e r1 = oz5.e.f431860d
            oz5.i r4 = r4.get(r1)
            boolean r4 = r4 instanceof p3325xe03a0797.p3326xc267989b.p0
            if (r4 != 0) goto L36
            r4 = 0
            java.lang.Object r4 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.r0.c(r3, r4)
            p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.r0.a(r3, r4)
            jz5.l r1 = new jz5.l
            r1.<init>(r3, r4)
            r0.set(r1)
        L36:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p3325xe03a0797.p3326xc267989b.c4.<init>(oz5.l, kotlin.coroutines.Continuation):void");
    }

    public final boolean k0() {
        java.lang.ThreadLocal threadLocal = this.f391683g;
        if (threadLocal.get() == null) {
            return false;
        }
        threadLocal.set(null);
        return true;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.h0, p3325xe03a0797.p3326xc267989b.c3
    public void v(java.lang.Object obj) {
        java.lang.ThreadLocal threadLocal = this.f391683g;
        jz5.l lVar = (jz5.l) threadLocal.get();
        if (lVar != null) {
            p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.r0.a((oz5.l) lVar.f384366d, lVar.f384367e);
            threadLocal.set(null);
        }
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this.f392030f;
        java.lang.Object a17 = p3325xe03a0797.p3326xc267989b.i0.a(obj, interfaceC29045xdcb5ca57);
        oz5.l mo48699x76847179 = interfaceC29045xdcb5ca57.mo48699x76847179();
        java.lang.Object c17 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.r0.c(mo48699x76847179, null);
        p3325xe03a0797.p3326xc267989b.c4 c18 = c17 != p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.r0.f392056a ? p3325xe03a0797.p3326xc267989b.m0.c(interfaceC29045xdcb5ca57, mo48699x76847179, c17) : null;
        try {
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(a17);
        } finally {
            if (c18 == null || c18.k0()) {
                p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.r0.a(mo48699x76847179, c17);
            }
        }
    }
}
