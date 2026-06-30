package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa;

/* renamed from: com.google.android.gms.common.data.DataBufferRef */
/* loaded from: classes13.dex */
public abstract class AbstractC1885xc7aea389 {

    /* renamed from: mDataHolder */
    protected final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.C1888xafe09e16 f5916x1540ba43;

    /* renamed from: mDataRow */
    protected int f5917xf41deca3;
    private int zaa;

    public AbstractC1885xc7aea389(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.C1888xafe09e16 c1888xafe09e16, int i17) {
        this.f5916x1540ba43 = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.C1888xafe09e16) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c1888xafe09e16);
        zaa(i17);
    }

    /* renamed from: copyToBuffer */
    public void m17998xfa4d5530(java.lang.String str, android.database.CharArrayBuffer charArrayBuffer) {
        this.f5916x1540ba43.zac(str, this.f5917xf41deca3, this.zaa, charArrayBuffer);
    }

    /* renamed from: equals */
    public boolean m17999xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.AbstractC1885xc7aea389) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.AbstractC1885xc7aea389 abstractC1885xc7aea389 = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.AbstractC1885xc7aea389) obj;
            if (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18189x5c46734(java.lang.Integer.valueOf(abstractC1885xc7aea389.f5917xf41deca3), java.lang.Integer.valueOf(this.f5917xf41deca3)) && com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18189x5c46734(java.lang.Integer.valueOf(abstractC1885xc7aea389.zaa), java.lang.Integer.valueOf(this.zaa)) && abstractC1885xc7aea389.f5916x1540ba43 == this.f5916x1540ba43) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: getBoolean */
    public boolean m18000x41a8a7f2(java.lang.String str) {
        return this.f5916x1540ba43.m18024x41a8a7f2(str, this.f5917xf41deca3, this.zaa);
    }

    /* renamed from: getByteArray */
    public byte[] m18001x8383f77b(java.lang.String str) {
        return this.f5916x1540ba43.m18025x8383f77b(str, this.f5917xf41deca3, this.zaa);
    }

    /* renamed from: getDataRow */
    public int m18002x93d2759a() {
        return this.f5917xf41deca3;
    }

    /* renamed from: getDouble */
    public double m18003x160e9ec7(java.lang.String str) {
        return this.f5916x1540ba43.zaa(str, this.f5917xf41deca3, this.zaa);
    }

    /* renamed from: getFloat */
    public float m18004x746dc8a6(java.lang.String str) {
        return this.f5916x1540ba43.zab(str, this.f5917xf41deca3, this.zaa);
    }

    /* renamed from: getInteger */
    public int m18005xb282bd08(java.lang.String str) {
        return this.f5916x1540ba43.m18027xb282bd08(str, this.f5917xf41deca3, this.zaa);
    }

    /* renamed from: getLong */
    public long m18006xfb822ef2(java.lang.String str) {
        return this.f5916x1540ba43.m18028xfb822ef2(str, this.f5917xf41deca3, this.zaa);
    }

    /* renamed from: getString */
    public java.lang.String m18007x2fec8307(java.lang.String str) {
        return this.f5916x1540ba43.m18031x2fec8307(str, this.f5917xf41deca3, this.zaa);
    }

    /* renamed from: hasColumn */
    public boolean m18008xd42f7690(java.lang.String str) {
        return this.f5916x1540ba43.m18033xd42f7690(str);
    }

    /* renamed from: hasNull */
    public boolean m18009x2987ef41(java.lang.String str) {
        return this.f5916x1540ba43.m18034x2987ef41(str, this.f5917xf41deca3, this.zaa);
    }

    /* renamed from: hashCode */
    public int m18010x8cdac1b() {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18190x8cdac1b(java.lang.Integer.valueOf(this.f5917xf41deca3), java.lang.Integer.valueOf(this.zaa), this.f5916x1540ba43);
    }

    /* renamed from: isDataValid */
    public boolean m18011x300d2c68() {
        return !this.f5916x1540ba43.m18035xd742d336();
    }

    /* renamed from: parseUri */
    public android.net.Uri m18012x46cc51b9(java.lang.String str) {
        java.lang.String m18031x2fec8307 = this.f5916x1540ba43.m18031x2fec8307(str, this.f5917xf41deca3, this.zaa);
        if (m18031x2fec8307 == null) {
            return null;
        }
        return android.net.Uri.parse(m18031x2fec8307);
    }

    public final void zaa(int i17) {
        boolean z17 = false;
        if (i17 >= 0 && i17 < this.f5916x1540ba43.m18026x7444f759()) {
            z17 = true;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18220xe071d469(z17);
        this.f5917xf41deca3 = i17;
        this.zaa = this.f5916x1540ba43.m18032x4abe998c(i17);
    }
}
