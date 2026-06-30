package e1;

/* loaded from: classes12.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f327813a;

    /* renamed from: equals */
    public boolean m126660xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof e1.m) {
            return this.f327813a == ((e1.m) obj).f327813a;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m126661x8cdac1b() {
        return java.lang.Integer.hashCode(this.f327813a);
    }

    /* renamed from: toString */
    public java.lang.String m126662x9616526c() {
        int i17 = this.f327813a;
        if (i17 == 0) {
            return "Clear";
        }
        if (i17 == 1) {
            return "Src";
        }
        if (i17 == 2) {
            return "Dst";
        }
        if (i17 == 3) {
            return "SrcOver";
        }
        if (i17 == 4) {
            return "DstOver";
        }
        if (i17 == 5) {
            return "SrcIn";
        }
        if (i17 == 6) {
            return "DstIn";
        }
        if (i17 == 7) {
            return "SrcOut";
        }
        if (i17 == 8) {
            return "DstOut";
        }
        if (i17 == 9) {
            return "SrcAtop";
        }
        if (i17 == 10) {
            return "DstAtop";
        }
        if (i17 == 11) {
            return "Xor";
        }
        if (i17 == 12) {
            return "Plus";
        }
        if (i17 == 13) {
            return "Modulate";
        }
        if (i17 == 14) {
            return "Screen";
        }
        if (i17 == 15) {
            return "Overlay";
        }
        if (i17 == 16) {
            return "Darken";
        }
        if (i17 == 17) {
            return "Lighten";
        }
        if (i17 == 18) {
            return "ColorDodge";
        }
        if (i17 == 19) {
            return "ColorBurn";
        }
        if (i17 == 20) {
            return "HardLight";
        }
        if (i17 == 21) {
            return "Softlight";
        }
        if (i17 == 22) {
            return "Difference";
        }
        if (i17 == 23) {
            return "Exclusion";
        }
        if (i17 == 24) {
            return "Multiply";
        }
        if (i17 == 25) {
            return "Hue";
        }
        if (i17 == 26) {
            return p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3284x1e5ae9b7;
        }
        if (i17 == 27) {
            return "Color";
        }
        return i17 == 28 ? "Luminosity" : "Unknown";
    }
}
