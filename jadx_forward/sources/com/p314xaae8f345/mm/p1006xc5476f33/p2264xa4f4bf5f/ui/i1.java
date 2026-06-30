package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes10.dex */
public final class i1 extends com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.a {
    public int K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(in5.s itemConvertFactory, java.util.ArrayList data) {
        super(itemConvertFactory, data);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemConvertFactory, "itemConvertFactory");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf, p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: B0 */
    public void mo8160xd8bfd53(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.mo8160xd8bfd53(holder);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onViewAttachedToWindow count:");
        int i17 = this.K + 1;
        this.K = i17;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RecyclerViewAdapterEx", sb6.toString());
        java.lang.Object obj = holder.f374657h;
        if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3 q3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3) obj;
            q3Var.getClass();
            try {
                q3Var.u(q3Var.A);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(q3Var.f255723e, th6, "update handleThirdBack failed", new java.lang.Object[0]);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf, in5.n0, p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: C0 */
    public void mo8161x38c82990(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.mo8161x38c82990(holder);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onViewDetachedFromWindow count:");
        int i17 = this.K - 1;
        this.K = i17;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RecyclerViewAdapterEx", sb6.toString());
        java.lang.Object obj = holder.f374657h;
        if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3) obj).z();
        }
    }
}
