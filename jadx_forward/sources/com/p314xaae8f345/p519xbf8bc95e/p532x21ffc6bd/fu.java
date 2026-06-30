package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class fu implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198 {

    /* renamed from: a, reason: collision with root package name */
    public double f131000a;

    /* renamed from: b, reason: collision with root package name */
    public double f131001b;

    public fu() {
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu b(double d17, double d18) {
        return new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu(this.f131000a + d17, this.f131001b + d18);
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu c(double d17, double d18) {
        return new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu(this.f131000a - d17, this.f131001b - d18);
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu d(double d17, double d18) {
        return new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu(this.f131000a * d17, this.f131001b * d18);
    }

    private static boolean e(double d17, double d18) {
        return java.lang.Double.compare(d17, d18) != 0 && java.lang.Math.abs(d17 - d18) > 1.0E-6d;
    }

    public final void a(double d17, double d18) {
        this.f131000a = d17;
        this.f131001b = d18;
    }

    /* renamed from: equals */
    public final boolean m36731xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu fuVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu) obj;
            if (!e(this.f131000a, fuVar.f131000a) && !e(this.f131001b, fuVar.f131001b)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198
    /* renamed from: setX */
    public final void mo36732x35d036(double d17) {
        this.f131000a = d17;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198
    /* renamed from: setY */
    public final void mo36733x35d037(double d17) {
        this.f131001b = d17;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198
    /* renamed from: setZ */
    public final void mo36734x35d038(double d17) {
    }

    /* renamed from: toString */
    public final java.lang.String m36735x9616526c() {
        return this.f131000a + "," + this.f131001b;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198
    public final double x() {
        return this.f131000a;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198
    public final double y() {
        return this.f131001b;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198
    public final double z() {
        return 0.0d;
    }

    public fu(double d17, double d18) {
        this.f131000a = d17;
        this.f131001b = d18;
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu fuVar) {
        return new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu(this.f131000a - fuVar.f131000a, this.f131001b - fuVar.f131001b);
    }

    private float c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu fuVar) {
        return fuVar.b(this).b();
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu d() {
        double b17 = 1.0d / b();
        return new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu(this.f131000a * b17, this.f131001b * b17);
    }

    private boolean a() {
        double d17 = this.f131000a;
        if (d17 < 0.0d || d17 > 1.0d) {
            return false;
        }
        double d18 = this.f131001b;
        return d18 >= 0.0d && d18 <= 1.0d;
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu c() {
        double b17 = 1.0d / b();
        return new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu(this.f131000a * b17, this.f131001b * b17);
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu fuVar) {
        return new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu(this.f131000a + fuVar.f131000a, this.f131001b + fuVar.f131001b);
    }

    private float b() {
        return (float) java.lang.Math.hypot(this.f131000a, this.f131001b);
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu a(double d17) {
        return new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu(this.f131000a * d17, this.f131001b * d17);
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu a(int i17) {
        double d17 = this.f131000a;
        double d18 = this.f131001b;
        int i18 = 0;
        while (i18 < i17) {
            double d19 = -d17;
            i18++;
            d17 = d18;
            d18 = d19;
        }
        return new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu(d17, d18);
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu a(float f17) {
        double d17 = f17;
        return new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu((float) ((java.lang.Math.cos(d17) * this.f131000a) - (java.lang.Math.sin(d17) * this.f131001b)), (float) ((java.lang.Math.sin(d17) * this.f131000a) + (java.lang.Math.cos(d17) * this.f131001b)));
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu fuVar, float f17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu b17 = b(fuVar);
        double d17 = f17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu fuVar2 = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu((float) ((java.lang.Math.cos(d17) * b17.f131000a) - (java.lang.Math.sin(d17) * b17.f131001b)), (float) ((java.lang.Math.sin(d17) * b17.f131000a) + (java.lang.Math.cos(d17) * b17.f131001b)));
        return new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu(fuVar2.f131000a + fuVar.f131000a, fuVar2.f131001b + fuVar.f131001b);
    }
}
