package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class gc implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198, java.lang.Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public static final double f131096a = 2.003750834E7d;

    /* renamed from: b, reason: collision with root package name */
    public double f131097b = Double.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public double f131098c = Double.MIN_VALUE;

    public gc(double d17, double d18) {
        mo36732x35d036(d17);
        mo36733x35d037(d18);
    }

    private double a() {
        return this.f131097b;
    }

    private double b() {
        return this.f131098c;
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc c() {
        return new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc(this.f131098c, this.f131097b);
    }

    /* renamed from: clone */
    public final /* synthetic */ java.lang.Object m36743x5a5dd5d() {
        return new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc(this.f131098c, this.f131097b);
    }

    /* renamed from: equals */
    public final boolean m36744xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj.hashCode() != m36745x8cdac1b() || !(obj instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc)) {
            return false;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc gcVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc) obj;
        return java.lang.Double.doubleToLongBits(gcVar.f131098c) == java.lang.Double.doubleToLongBits(this.f131098c) && java.lang.Double.doubleToLongBits(gcVar.f131097b) == java.lang.Double.doubleToLongBits(this.f131097b);
    }

    /* renamed from: hashCode */
    public final int m36745x8cdac1b() {
        long doubleToLongBits = java.lang.Double.doubleToLongBits(this.f131098c);
        long doubleToLongBits2 = java.lang.Double.doubleToLongBits(this.f131097b);
        return ((((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32))) + 31) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198
    /* renamed from: setX */
    public final void mo36732x35d036(double d17) {
        this.f131098c = java.lang.Math.max(-2.003750834E7d, java.lang.Math.min(2.003750834E7d, d17));
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198
    /* renamed from: setY */
    public final void mo36733x35d037(double d17) {
        this.f131097b = java.lang.Math.max(-2.003750834E7d, java.lang.Math.min(2.003750834E7d, d17));
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198
    /* renamed from: setZ */
    public final void mo36734x35d038(double d17) {
    }

    /* renamed from: toString */
    public final java.lang.String m36746x9616526c() {
        return "x=" + this.f131098c + ",y=" + this.f131097b;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198
    public final double x() {
        return this.f131098c;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198
    public final double y() {
        return this.f131097b;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198
    public final double z() {
        return 0.0d;
    }
}
