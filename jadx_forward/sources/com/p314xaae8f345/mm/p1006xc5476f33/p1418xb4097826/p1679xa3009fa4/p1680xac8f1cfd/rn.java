package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes8.dex */
public final class rn implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.mw1 f217343d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Long f217344e;

    /* renamed from: f, reason: collision with root package name */
    public r45.ma7 f217345f;

    /* renamed from: g, reason: collision with root package name */
    public r45.kj5 f217346g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f217347h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Long f217348i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f217349m;

    /* renamed from: n, reason: collision with root package name */
    public int f217350n;

    public rn(r45.mw1 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        this.f217343d = item;
    }

    public final java.lang.String a() {
        r45.k74 m76504xa819f0c7;
        r45.k74 m76504xa819f0c72;
        r45.k74 m76504xa819f0c73;
        r45.k74 m76504xa819f0c74;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("appid:");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = this.f217349m;
        java.lang.String str = null;
        sb6.append((c19786x6a1e2862 == null || (m76504xa819f0c74 = c19786x6a1e2862.m76504xa819f0c7()) == null) ? null : m76504xa819f0c74.m75945x2fec8307(0));
        sb6.append(", query:");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28622 = this.f217349m;
        sb6.append((c19786x6a1e28622 == null || (m76504xa819f0c73 = c19786x6a1e28622.m76504xa819f0c7()) == null) ? null : m76504xa819f0c73.m75945x2fec8307(2));
        sb6.append(", path:");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28623 = this.f217349m;
        sb6.append((c19786x6a1e28623 == null || (m76504xa819f0c72 = c19786x6a1e28623.m76504xa819f0c7()) == null) ? null : m76504xa819f0c72.m75945x2fec8307(1));
        sb6.append(", default_url:");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28624 = this.f217349m;
        if (c19786x6a1e28624 != null && (m76504xa819f0c7 = c19786x6a1e28624.m76504xa819f0c7()) != null) {
            str = m76504xa819f0c7.m75945x2fec8307(3);
        }
        sb6.append(str);
        sb6.append(", ");
        return sb6.toString();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.rn rnVar = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.rn ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.rn) obj : null;
        return (rnVar == null || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.B0(rnVar.mo2128x1ed62e84(), mo2128x1ed62e84())) ? -1 : 0;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        r45.mw1 mw1Var = this.f217343d;
        sb6.append(mw1Var.m75939xb282bd08(2));
        sb6.append('_');
        sb6.append(mw1Var.m75945x2fec8307(5));
        sb6.append('_');
        sb6.append(mw1Var.m75939xb282bd08(1));
        return sb6.toString().hashCode();
    }

    @Override // in5.c
    public int h() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.rn.class.hashCode();
    }
}
