package df2;

/* loaded from: classes10.dex */
public final class ks extends com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf {
    public final /* synthetic */ df2.lt I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks(df2.lt ltVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.C14192x9acdf7ae c14192x9acdf7ae, java.util.ArrayList arrayList) {
        super(c14192x9acdf7ae, arrayList, false);
        this.I = ltVar;
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf, in5.n0
    /* renamed from: p0 */
    public void I(in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        df2.lt ltVar = this.I;
        if (ltVar.f312250y.size() > 0) {
            i17 %= ltVar.f312250y.size();
        }
        super.I(holder, i17);
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf, in5.n0
    /* renamed from: q0 */
    public void J(in5.s0 holder, int i17, java.util.List payloads) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        df2.lt ltVar = this.I;
        if (ltVar.f312250y.size() > 0) {
            i17 %= ltVar.f312250y.size();
        }
        super.J(holder, i17, payloads);
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf, in5.n0
    public int x() {
        if (this.I.f312250y.size() > 0) {
            return Integer.MAX_VALUE;
        }
        return super.x();
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf, in5.n0
    public long y(int i17) {
        return 0L;
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf, in5.n0
    public int z(int i17) {
        return 1;
    }
}
