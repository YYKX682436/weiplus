package com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806;

/* loaded from: classes12.dex */
public final class p0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.l0 {

    /* renamed from: c, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.p0 f234644c = new com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.p0();

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.o0
    public java.lang.String c() {
        return "pss";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.o0
    public int d() {
        return 301;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.l0
    public boolean i(com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4720x9bbc2403 c4720x9bbc2403) {
        com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4723x52a73b7e c4723x52a73b7e;
        return ((c4720x9bbc2403 == null || (c4723x52a73b7e = c4720x9bbc2403.f134636n) == null) ? 0L : (long) c4723x52a73b7e.f134647d) > 2147483648L;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.l0
    public boolean j(ob0.s3 info) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        java.util.Map map = info.f425479c;
        return ((map == null || (str = (java.lang.String) map.get("summary.total-pss")) == null) ? 0L : java.lang.Long.parseLong(str)) > 2147483648L;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.l0
    public void k(com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4720x9bbc2403 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        g(info.f134636n != null ? r3.f134647d : 0L);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.l0
    public void l(ob0.s3 info) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        java.util.Map map = info.f425479c;
        g((map == null || (str = (java.lang.String) map.get("summary.total-pss")) == null) ? 0L : java.lang.Long.parseLong(str));
    }
}
