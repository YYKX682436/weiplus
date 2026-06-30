package co2;

/* loaded from: classes2.dex */
public final class i extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mj {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ co2.k f125323e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(co2.k kVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f c15343x638a173f) {
        super(c15343x638a173f);
        this.f125323e = kVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c15343x638a173f);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mj
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f125323e.f125325d, "updateState");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mj, ym5.p1
    /* renamed from: onPreFinishLoadMore */
    public void mo15403x2053b072(ym5.s3 reason) {
        android.view.View view;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        super.mo15403x2053b072(reason);
        if (reason.f545056h > 0 || reason.f545049a != 2) {
            return;
        }
        co2.k kVar = this.f125323e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(kVar.f125325d, "no more loadMore data!");
        on5.c m82923x19404fcc = kVar.P6().m82923x19404fcc();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e4 = (m82923x19404fcc == null || (view = m82923x19404fcc.getView()) == null) ? null : (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4) view.findViewById(com.p314xaae8f345.mm.R.id.ilh);
        if (c22627xa933f8e4 == null) {
            return;
        }
        c22627xa933f8e4.setVisibility(8);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mj, ym5.p1
    /* renamed from: onPreFinishRefresh */
    public void mo15404x8041b4e4(ym5.s3 reason) {
        android.view.View view;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        super.mo15404x8041b4e4(reason);
        if (reason.f545056h <= 0) {
            co2.k kVar = this.f125323e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(kVar.f125325d, "no more refresh data!");
            on5.d m82929x3feb4d92 = kVar.P6().m82929x3feb4d92();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e4 = (m82929x3feb4d92 == null || (view = m82929x3feb4d92.getView()) == null) ? null : (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4) view.findViewById(com.p314xaae8f345.mm.R.id.f568121lr5);
            if (c22627xa933f8e4 == null) {
                return;
            }
            c22627xa933f8e4.setVisibility(8);
        }
    }
}
