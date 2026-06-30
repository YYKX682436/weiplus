package com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899;

/* renamed from: com.tencent.map.sdk.comps.offlinemap.OfflineItem */
/* loaded from: classes13.dex */
public class C4265xa1eefb76 {

    /* renamed from: name */
    private java.lang.String f16671x337a8b;

    /* renamed from: percentage */
    private int f16672xc90df29a;

    /* renamed from: pinyin */
    private java.lang.String f16673xc51a3da9;

    /* renamed from: size */
    private long f16674x35e001;

    /* renamed from: upgrade */
    private boolean f16675xf2389a1c = true;

    /* renamed from: equals */
    public boolean m35498xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.C4265xa1eefb76)) {
            return false;
        }
        com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.C4265xa1eefb76 c4265xa1eefb76 = (com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.C4265xa1eefb76) obj;
        java.lang.String str = this.f16671x337a8b;
        if (str == null ? c4265xa1eefb76.f16671x337a8b != null : !str.equals(c4265xa1eefb76.f16671x337a8b)) {
            return false;
        }
        java.lang.String str2 = this.f16673xc51a3da9;
        java.lang.String str3 = c4265xa1eefb76.f16673xc51a3da9;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    /* renamed from: getName */
    public java.lang.String m35499xfb82e301() {
        return this.f16671x337a8b;
    }

    /* renamed from: getPercentage */
    public int m35500xb74eaa90() {
        return this.f16672xc90df29a;
    }

    /* renamed from: getPinyin */
    public java.lang.String m35501x2a31609f() {
        return this.f16673xc51a3da9;
    }

    /* renamed from: getSize */
    public long m35502xfb854877() {
        return this.f16674x35e001;
    }

    /* renamed from: hashCode */
    public int m35503x8cdac1b() {
        java.lang.String str = this.f16671x337a8b;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        java.lang.String str2 = this.f16673xc51a3da9;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    /* renamed from: isUpgrade */
    public boolean m35504xcfa9e192() {
        return this.f16675xf2389a1c;
    }

    /* renamed from: setName */
    public void m35505x764daa0d(java.lang.String str) {
        this.f16671x337a8b = str;
    }

    /* renamed from: setPercentage */
    public void m35506xe572f89c(int i17) {
        this.f16672xc90df29a = i17;
    }

    /* renamed from: setPinyin */
    public void m35507x1d6694ab(java.lang.String str) {
        this.f16673xc51a3da9 = str;
    }

    /* renamed from: setSize */
    public void m35508x76500f83(long j17) {
        this.f16674x35e001 = j17;
    }

    /* renamed from: setUpgrade */
    public void m35509xa377235a(boolean z17) {
        this.f16675xf2389a1c = z17;
    }

    /* renamed from: toString */
    public java.lang.String m35510x9616526c() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("OfflineItem{name='");
        stringBuffer.append(this.f16671x337a8b);
        stringBuffer.append("', pinyin='");
        stringBuffer.append(this.f16673xc51a3da9);
        stringBuffer.append("', size=");
        stringBuffer.append(this.f16674x35e001);
        stringBuffer.append(", upgrade=");
        stringBuffer.append(this.f16675xf2389a1c);
        stringBuffer.append(", percentage=");
        stringBuffer.append(this.f16672xc90df29a);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
