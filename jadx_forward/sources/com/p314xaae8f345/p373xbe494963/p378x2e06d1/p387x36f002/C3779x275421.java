package com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav")
/* renamed from: com.tencent.liteav.base.util.Size */
/* loaded from: classes14.dex */
public class C3779x275421 {

    /* renamed from: height */
    public int f14763xb7389127;

    /* renamed from: width */
    public int f14764x6be2dc6;

    public C3779x275421() {
        this.f14764x6be2dc6 = 0;
        this.f14763xb7389127 = 0;
    }

    /* renamed from: aspectRatio */
    public double m29554x41194293() {
        return (this.f14764x6be2dc6 * 1.0d) / this.f14763xb7389127;
    }

    /* renamed from: equals */
    public boolean m29555xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421)) {
            return false;
        }
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421 c3779x275421 = (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421) obj;
        return c3779x275421.f14764x6be2dc6 == this.f14764x6be2dc6 && c3779x275421.f14763xb7389127 == this.f14763xb7389127;
    }

    /* renamed from: getArea */
    public int m29556xfb7d3903() {
        if (m29560x7b953cf2()) {
            return this.f14764x6be2dc6 * this.f14763xb7389127;
        }
        return 0;
    }

    /* renamed from: getHeight */
    public int m29557x1c4fb41d() {
        return this.f14763xb7389127;
    }

    /* renamed from: getWidth */
    public int m29558x755bd410() {
        return this.f14764x6be2dc6;
    }

    /* renamed from: hashCode */
    public int m29559x8cdac1b() {
        return (this.f14764x6be2dc6 * 32713) + this.f14763xb7389127;
    }

    /* renamed from: isValid */
    public boolean m29560x7b953cf2() {
        return this.f14764x6be2dc6 > 0 && this.f14763xb7389127 > 0;
    }

    public void set(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421 c3779x275421) {
        if (c3779x275421 != null) {
            this.f14764x6be2dc6 = c3779x275421.f14764x6be2dc6;
            this.f14763xb7389127 = c3779x275421.f14763xb7389127;
        } else {
            this.f14764x6be2dc6 = 0;
            this.f14763xb7389127 = 0;
        }
    }

    /* renamed from: swap */
    public void m29561x361193() {
        int i17 = this.f14764x6be2dc6;
        this.f14764x6be2dc6 = this.f14763xb7389127;
        this.f14763xb7389127 = i17;
    }

    /* renamed from: toString */
    public java.lang.String m29562x9616526c() {
        return "Size(" + this.f14764x6be2dc6 + ", " + this.f14763xb7389127 + ")";
    }

    public C3779x275421(int i17, int i18) {
        this.f14764x6be2dc6 = i17;
        this.f14763xb7389127 = i18;
    }

    public void set(int i17, int i18) {
        this.f14764x6be2dc6 = i17;
        this.f14763xb7389127 = i18;
    }

    public C3779x275421(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421 c3779x275421) {
        this.f14764x6be2dc6 = 0;
        this.f14763xb7389127 = 0;
        set(c3779x275421);
    }
}
