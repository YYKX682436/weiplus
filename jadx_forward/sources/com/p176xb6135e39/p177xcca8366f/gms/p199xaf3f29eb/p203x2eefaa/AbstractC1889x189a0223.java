package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa;

/* renamed from: com.google.android.gms.common.data.EntityBuffer */
/* loaded from: classes13.dex */
public abstract class AbstractC1889x189a0223<T> extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.AbstractC1879xe1b6ce6c<T> {
    private boolean zaa;
    private java.util.ArrayList zab;

    public AbstractC1889x189a0223(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.C1888xafe09e16 c1888xafe09e16) {
        super(c1888xafe09e16);
        this.zaa = false;
    }

    private final void zab() {
        synchronized (this) {
            if (!this.zaa) {
                int m18026x7444f759 = ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.C1888xafe09e16) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(this.f5913x1540ba43)).m18026x7444f759();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                this.zab = arrayList;
                if (m18026x7444f759 > 0) {
                    arrayList.add(0);
                    java.lang.String mo18041xbd224ae6 = mo18041xbd224ae6();
                    java.lang.String m18031x2fec8307 = this.f5913x1540ba43.m18031x2fec8307(mo18041xbd224ae6, 0, this.f5913x1540ba43.m18032x4abe998c(0));
                    for (int i17 = 1; i17 < m18026x7444f759; i17++) {
                        int m18032x4abe998c = this.f5913x1540ba43.m18032x4abe998c(i17);
                        java.lang.String m18031x2fec83072 = this.f5913x1540ba43.m18031x2fec8307(mo18041xbd224ae6, i17, m18032x4abe998c);
                        if (m18031x2fec83072 == null) {
                            throw new java.lang.NullPointerException("Missing value for markerColumn: " + mo18041xbd224ae6 + ", at row: " + i17 + ", for window: " + m18032x4abe998c);
                        }
                        if (!m18031x2fec83072.equals(m18031x2fec8307)) {
                            this.zab.add(java.lang.Integer.valueOf(i17));
                            m18031x2fec8307 = m18031x2fec83072;
                        }
                    }
                }
                this.zaa = true;
            }
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.AbstractC1879xe1b6ce6c, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.InterfaceC1881xa5f564aa
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final T get(int i17) {
        int intValue;
        int intValue2;
        zab();
        int zaa = zaa(i17);
        int i18 = 0;
        if (i17 >= 0 && i17 != this.zab.size()) {
            if (i17 == this.zab.size() - 1) {
                intValue = ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.C1888xafe09e16) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(this.f5913x1540ba43)).m18026x7444f759();
                intValue2 = ((java.lang.Integer) this.zab.get(i17)).intValue();
            } else {
                intValue = ((java.lang.Integer) this.zab.get(i17 + 1)).intValue();
                intValue2 = ((java.lang.Integer) this.zab.get(i17)).intValue();
            }
            int i19 = intValue - intValue2;
            if (i19 == 1) {
                int zaa2 = zaa(i17);
                int m18032x4abe998c = ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.C1888xafe09e16) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(this.f5913x1540ba43)).m18032x4abe998c(zaa2);
                java.lang.String m18039xfdc72880 = m18039xfdc72880();
                if (m18039xfdc72880 == null || this.f5913x1540ba43.m18031x2fec8307(m18039xfdc72880, zaa2, m18032x4abe998c) != null) {
                    i18 = 1;
                }
            } else {
                i18 = i19;
            }
        }
        return mo18040x7460aebc(zaa, i18);
    }

    /* renamed from: getChildDataMarkerColumn */
    public java.lang.String m18039xfdc72880() {
        return null;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.AbstractC1879xe1b6ce6c, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.InterfaceC1881xa5f564aa
    /* renamed from: getCount */
    public int mo17736x7444f759() {
        zab();
        return this.zab.size();
    }

    /* renamed from: getEntry */
    public abstract T mo18040x7460aebc(int i17, int i18);

    /* renamed from: getPrimaryDataMarkerColumn */
    public abstract java.lang.String mo18041xbd224ae6();

    public final int zaa(int i17) {
        if (i17 >= 0 && i17 < this.zab.size()) {
            return ((java.lang.Integer) this.zab.get(i17)).intValue();
        }
        throw new java.lang.IllegalArgumentException("Position " + i17 + " is out of bounds for this buffer");
    }
}
