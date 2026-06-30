package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes.dex */
public final class s1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f2 f217383d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f2 f2Var) {
        super(0);
        this.f217383d = f2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 R6 = this.f217383d.R6();
        if (R6 != null) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = R6.getLayoutManager();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager");
            int w17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8) layoutManager).w() + 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderAddHistoryUIC", "[smoothScrollToNextPosition] nextPosition=" + w17);
            R6.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.e2(R6, w17));
        }
        return jz5.f0.f384359a;
    }
}
