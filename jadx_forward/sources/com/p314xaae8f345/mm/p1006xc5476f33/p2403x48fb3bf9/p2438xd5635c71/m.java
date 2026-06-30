package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71;

/* loaded from: classes7.dex */
public final class m implements com.p314xaae8f345.mm.vfs.t6 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.m f269393a = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.m();

    @Override // com.p314xaae8f345.mm.vfs.t6
    /* renamed from: accept */
    public final boolean mo40607xab27b508(com.p314xaae8f345.mm.vfs.r6 filter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filter, "filter");
        if (!filter.A()) {
            return false;
        }
        java.lang.String m82467xfb82e301 = filter.m82467xfb82e301();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m82467xfb82e301, "getName(...)");
        if (!r26.i0.n(m82467xfb82e301, ".js", false)) {
            java.lang.String m82467xfb82e3012 = filter.m82467xfb82e301();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m82467xfb82e3012, "getName(...)");
            if (!r26.i0.n(m82467xfb82e3012, ".json", false)) {
                return false;
            }
        }
        return true;
    }
}
