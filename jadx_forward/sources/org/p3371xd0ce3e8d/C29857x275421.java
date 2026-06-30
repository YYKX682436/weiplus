package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.Size */
/* loaded from: classes14.dex */
public class C29857x275421 {

    /* renamed from: height */
    public int f75949xb7389127;

    /* renamed from: width */
    public int f75950x6be2dc6;

    public C29857x275421(int i17, int i18) {
        this.f75950x6be2dc6 = i17;
        this.f75949xb7389127 = i18;
    }

    /* renamed from: equals */
    public boolean m156369xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof org.p3371xd0ce3e8d.C29857x275421)) {
            return false;
        }
        org.p3371xd0ce3e8d.C29857x275421 c29857x275421 = (org.p3371xd0ce3e8d.C29857x275421) obj;
        return this.f75950x6be2dc6 == c29857x275421.f75950x6be2dc6 && this.f75949xb7389127 == c29857x275421.f75949xb7389127;
    }

    /* renamed from: hashCode */
    public int m156370x8cdac1b() {
        return (this.f75950x6be2dc6 * 65537) + 1 + this.f75949xb7389127;
    }

    /* renamed from: toString */
    public java.lang.String m156371x9616526c() {
        return this.f75950x6be2dc6 + "x" + this.f75949xb7389127;
    }
}
