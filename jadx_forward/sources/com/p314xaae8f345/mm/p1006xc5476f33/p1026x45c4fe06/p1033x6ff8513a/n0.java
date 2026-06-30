package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a;

/* loaded from: classes7.dex */
public final class n0 implements com.p314xaae8f345.mm.vfs.t6 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n0 f157807a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n0();

    @Override // com.p314xaae8f345.mm.vfs.t6
    /* renamed from: accept */
    public final boolean mo40607xab27b508(com.p314xaae8f345.mm.vfs.r6 pathname) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pathname, "pathname");
        java.lang.String m82467xfb82e301 = pathname.m82467xfb82e301();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m82467xfb82e301, "getName(...)");
        if (r26.i0.n(m82467xfb82e301, ".data", false)) {
            return false;
        }
        java.lang.String m82467xfb82e3012 = pathname.m82467xfb82e301();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m82467xfb82e3012, "getName(...)");
        if (r26.i0.y(m82467xfb82e3012, "store_", false)) {
            return false;
        }
        java.lang.String m82467xfb82e3013 = pathname.m82467xfb82e301();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m82467xfb82e3013, "getName(...)");
        return !r26.i0.n(m82467xfb82e3013, ".nomedia", false);
    }
}
