package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes10.dex */
public abstract class a extends com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf {
    public final java.util.ArrayList I;

    /* renamed from: J, reason: collision with root package name */
    public final int f255238J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(in5.s itemConvertFactory, java.util.ArrayList data) {
        super(itemConvertFactory, data, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemConvertFactory, "itemConvertFactory");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.I = data;
        this.f255238J = 1;
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf, p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: D0 */
    public void mo8162x34789575(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.mo8162x34789575(holder);
        java.lang.Object obj = holder.f374657h;
        if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3) obj).c();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AbsMultipleStatusCardItemAdapter", "onViewRecycled pos:" + holder.m8183xf806b362());
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf, in5.n0
    /* renamed from: p0 */
    public void I(in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.util.ArrayList arrayList = this.I;
        if (arrayList.size() > this.f255238J) {
            i17 %= arrayList.size();
        }
        super.I(holder, i17);
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf, in5.n0
    /* renamed from: q0 */
    public void J(in5.s0 holder, int i17, java.util.List payloads) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        java.util.ArrayList arrayList = this.I;
        super.J(holder, arrayList.size() > this.f255238J ? i17 % arrayList.size() : i17, payloads);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AbsMultipleStatusCardItemAdapter", "_onBindViewHolder pos:" + i17);
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf, in5.n0
    /* renamed from: r0 */
    public in5.s0 M(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        in5.s0 M = super.M(parent, i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AbsMultipleStatusCardItemAdapter", "_onCreateViewHolder pos:" + M.m8183xf806b362());
        return M;
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf, in5.n0
    public int x() {
        if (this.I.size() > this.f255238J) {
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
        return 0;
    }
}
