package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.zacd */
/* loaded from: classes13.dex */
public final class C1852x38edc8 implements com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2433x579e812c {
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1775x7d99476c zaa;
    private final int zab;
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1768x75462a05 zac;
    private final long zad;
    private final long zae;

    public C1852x38edc8(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1775x7d99476c c1775x7d99476c, int i17, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1768x75462a05 c1768x75462a05, long j17, long j18, java.lang.String str, java.lang.String str2) {
        this.zaa = c1775x7d99476c;
        this.zab = i17;
        this.zac = c1768x75462a05;
        this.zad = j17;
        this.zae = j18;
    }

    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1852x38edc8 zaa(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1775x7d99476c c1775x7d99476c, int i17, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1768x75462a05 c1768x75462a05) {
        boolean z17;
        if (!c1775x7d99476c.zaD()) {
            return null;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1927xe804295f m18226x1456a638 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1926x87b70a74.m18225x9cf0d20b().m18226x1456a638();
        if (m18226x1456a638 == null) {
            z17 = true;
        } else {
            if (!m18226x1456a638.m18230xfbf28b2f()) {
                return null;
            }
            z17 = m18226x1456a638.m18231x24718269();
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1839x38edb6 zai = c1775x7d99476c.zai(c1768x75462a05);
            if (zai != null) {
                if (!(zai.zaf() instanceof com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687)) {
                    return null;
                }
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687 abstractC1900x418ca687 = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687) zai.zaf();
                if (abstractC1900x418ca687.m18113xaacf81e6() && !abstractC1900x418ca687.m18115x532f7b82()) {
                    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1905x3d7caa5b zab = zab(zai, abstractC1900x418ca687, i17);
                    if (zab == null) {
                        return null;
                    }
                    zai.zaq();
                    z17 = zab.m18152x24718269();
                }
            }
        }
        return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1852x38edc8(c1775x7d99476c, i17, c1768x75462a05, z17 ? java.lang.System.currentTimeMillis() : 0L, z17 ? android.os.SystemClock.elapsedRealtime() : 0L, null, null);
    }

    private static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1905x3d7caa5b zab(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1839x38edb6 c1839x38edb6, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687 abstractC1900x418ca687, int i17) {
        int[] m18149xc9a63f70;
        int[] m18150xa7e1a1f0;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1905x3d7caa5b m18111x56d58cb3 = abstractC1900x418ca687.m18111x56d58cb3();
        if (m18111x56d58cb3 == null || !m18111x56d58cb3.m18151xfbf28b2f() || ((m18149xc9a63f70 = m18111x56d58cb3.m18149xc9a63f70()) != null ? !com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C1987x2e0019f8.m18511xde2d761f(m18149xc9a63f70, i17) : !((m18150xa7e1a1f0 = m18111x56d58cb3.m18150xa7e1a1f0()) == null || !com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C1987x2e0019f8.m18511xde2d761f(m18150xa7e1a1f0, i17))) || c1839x38edb6.zac() >= m18111x56d58cb3.m18148xd854e056()) {
            return null;
        }
        return m18111x56d58cb3;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.InterfaceC2433x579e812c
    /* renamed from: onComplete */
    public final void mo17960x815f5438(com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5 abstractC2439x27a9a5) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1839x38edb6 zai;
        int i17;
        int i18;
        int i19;
        int m17600x130a215f;
        long j17;
        long j18;
        int i27;
        if (this.zaa.zaD()) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1927xe804295f m18226x1456a638 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1926x87b70a74.m18225x9cf0d20b().m18226x1456a638();
            if ((m18226x1456a638 == null || m18226x1456a638.m18230xfbf28b2f()) && (zai = this.zaa.zai(this.zac)) != null && (zai.zaf() instanceof com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687)) {
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687 abstractC1900x418ca687 = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687) zai.zaf();
                int i28 = 0;
                boolean z17 = this.zad > 0;
                int m18101xabd5a5a0 = abstractC1900x418ca687.m18101xabd5a5a0();
                int i29 = 100;
                if (m18226x1456a638 != null) {
                    z17 &= m18226x1456a638.m18231x24718269();
                    int m18228x9e61930b = m18226x1456a638.m18228x9e61930b();
                    int m18229x8fd3b8c1 = m18226x1456a638.m18229x8fd3b8c1();
                    i17 = m18226x1456a638.m18232x52c258a2();
                    if (abstractC1900x418ca687.m18113xaacf81e6() && !abstractC1900x418ca687.m18115x532f7b82()) {
                        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1905x3d7caa5b zab = zab(zai, abstractC1900x418ca687, this.zab);
                        if (zab == null) {
                            return;
                        }
                        boolean z18 = zab.m18152x24718269() && this.zad > 0;
                        m18229x8fd3b8c1 = zab.m18148xd854e056();
                        z17 = z18;
                    }
                    i19 = m18228x9e61930b;
                    i18 = m18229x8fd3b8c1;
                } else {
                    i17 = 0;
                    i18 = 100;
                    i19 = 5000;
                }
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1775x7d99476c c1775x7d99476c = this.zaa;
                if (abstractC2439x27a9a5.mo19599x55b0a764()) {
                    m17600x130a215f = 0;
                } else {
                    if (!abstractC2439x27a9a5.mo19597xc9602be3()) {
                        java.lang.Exception mo19594x57bd4199 = abstractC2439x27a9a5.mo19594x57bd4199();
                        if (mo19594x57bd4199 instanceof com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1738x1a0a8775) {
                            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 m17724x2fe4f2e8 = ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1738x1a0a8775) mo19594x57bd4199).m17724x2fe4f2e8();
                            i29 = m17724x2fe4f2e8.m17849xfd0160f5();
                            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb m17847xd9207c11 = m17724x2fe4f2e8.m17847xd9207c11();
                            if (m17847xd9207c11 != null) {
                                m17600x130a215f = m17847xd9207c11.m17600x130a215f();
                                i28 = i29;
                            }
                        } else {
                            i28 = 101;
                            m17600x130a215f = -1;
                        }
                    }
                    i28 = i29;
                    m17600x130a215f = -1;
                }
                if (z17) {
                    long j19 = this.zad;
                    long j27 = this.zae;
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    i27 = (int) (android.os.SystemClock.elapsedRealtime() - j27);
                    j18 = currentTimeMillis;
                    j17 = j19;
                } else {
                    j17 = 0;
                    j18 = 0;
                    i27 = -1;
                }
                c1775x7d99476c.zaw(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1920xe7fb8471(this.zab, i28, m17600x130a215f, j17, j18, null, null, m18101xabd5a5a0, i27), i17, i19, i18);
            }
        }
    }
}
