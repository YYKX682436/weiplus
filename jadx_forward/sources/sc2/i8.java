package sc2;

/* loaded from: classes2.dex */
public final class i8 extends com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf {
    public final /* synthetic */ java.util.ArrayList I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8(java.util.ArrayList arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1455xac8f1cfd.C13829xc824f4b9 c13829xc824f4b9) {
        super(c13829xc824f4b9, arrayList, false);
        this.I = arrayList;
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf, in5.n0
    /* renamed from: p0 */
    public void I(in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.I(holder, i17 % this.I.size());
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf, in5.n0
    /* renamed from: q0 */
    public void J(in5.s0 holder, int i17, java.util.List payloads) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        super.J(holder, i17 % this.I.size(), payloads);
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf, in5.n0
    public int x() {
        return 214748;
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf, in5.n0
    public long y(int i17) {
        java.util.ArrayList arrayList = this.I;
        return ((sc2.v8) arrayList.get(i17 % arrayList.size())).hashCode();
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf, in5.n0
    public int z(int i17) {
        java.util.ArrayList arrayList = this.I;
        return ((sc2.v8) arrayList.get(i17 % arrayList.size())).h();
    }
}
