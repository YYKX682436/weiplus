package bb2;

/* loaded from: classes5.dex */
public final class c extends bb2.v2 {
    public boolean K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(xp.d danmakuContext) {
        super(danmakuContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(danmakuContext, "danmakuContext");
    }

    @Override // wp.i, wp.a
    public void v() {
        this.K = false;
        super.v();
    }

    @Override // wp.a
    public void w(zp.h hVar) {
        if (hVar != null) {
            long j17 = hVar.f556446a;
            cq.k1.a();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            this.f529867e = new zp.h(j17 / ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209479t6).mo141623x754a37bb()).r()).floatValue());
        }
    }

    @Override // wp.f
    public float y(long j17) {
        long j18 = j17 - this.f529866d;
        float h17 = h();
        float f17 = this.f529871i + h17;
        cq.k1.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        long intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209497u6).mo141623x754a37bb()).r()).intValue();
        cq.k1.a();
        float floatValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209515v6).mo141623x754a37bb()).r()).floatValue();
        cq.k1.a();
        float floatValue2 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209533w6).mo141623x754a37bb()).r()).floatValue();
        float f18 = floatValue * h17;
        float f19 = h17 - f18;
        float f27 = f17 / ((float) this.f529867e.f556446a);
        if (j18 >= intValue) {
            return f18 - (f27 * ((float) (j18 - intValue)));
        }
        float f28 = (float) intValue;
        float f29 = ((float) j18) / f28;
        float f37 = (f27 * f28) / f19;
        float max = java.lang.Math.max(floatValue2 * f37, 1.2f);
        return h17 - (f19 * (((((((max + f37) - 2.0f) * f29) * f29) * f29) + ((((3.0f - (2.0f * max)) - f37) * f29) * f29)) + (max * f29)));
    }
}
