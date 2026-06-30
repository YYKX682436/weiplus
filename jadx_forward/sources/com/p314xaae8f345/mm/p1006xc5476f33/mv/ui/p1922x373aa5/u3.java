package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

/* loaded from: classes10.dex */
public final class u3 extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.AbstractC16697x9da72997 f233494a;

    public u3(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.AbstractC16697x9da72997 abstractC16697x9da72997) {
        this.f233494a = abstractC16697x9da72997;
    }

    @Override // ym5.q3
    public void a(int i17) {
    }

    @Override // ym5.q3
    public void b(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Music.MusicMvTabFragment", "onLoadMoreBegin");
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.AbstractC16697x9da72997 abstractC16697x9da72997 = this.f233494a;
        if (abstractC16697x9da72997.getHasMore()) {
            abstractC16697x9da72997.c(abstractC16697x9da72997.getMusic(), abstractC16697x9da72997.getKeyword());
        } else {
            abstractC16697x9da72997.m67356x96811f7a().N(0);
        }
    }

    @Override // ym5.q3
    public void c(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.AbstractC16697x9da72997 abstractC16697x9da72997 = this.f233494a;
        if (abstractC16697x9da72997.getHasMore()) {
            return;
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00.I(abstractC16697x9da72997.m67356x96811f7a(), null, 1, null);
    }
}
