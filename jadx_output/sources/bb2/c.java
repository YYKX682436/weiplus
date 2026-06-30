package bb2;

/* loaded from: classes5.dex */
public final class c extends bb2.v2 {
    public boolean K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(xp.d danmakuContext) {
        super(danmakuContext);
        kotlin.jvm.internal.o.g(danmakuContext, "danmakuContext");
    }

    @Override // wp.i, wp.a
    public void v() {
        this.K = false;
        super.v();
    }

    @Override // wp.a
    public void w(zp.h hVar) {
        if (hVar != null) {
            long j17 = hVar.f474913a;
            cq.k1.a();
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            this.f448334e = new zp.h(j17 / ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127946t6).getValue()).r()).floatValue());
        }
    }

    @Override // wp.f
    public float y(long j17) {
        long j18 = j17 - this.f448333d;
        float h17 = h();
        float f17 = this.f448338i + h17;
        cq.k1.a();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        long intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127964u6).getValue()).r()).intValue();
        cq.k1.a();
        float floatValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127982v6).getValue()).r()).floatValue();
        cq.k1.a();
        float floatValue2 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f128000w6).getValue()).r()).floatValue();
        float f18 = floatValue * h17;
        float f19 = h17 - f18;
        float f27 = f17 / ((float) this.f448334e.f474913a);
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
