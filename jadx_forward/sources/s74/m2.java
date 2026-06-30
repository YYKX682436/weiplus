package s74;

/* loaded from: classes4.dex */
public final class m2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy2.dc f485955d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s74.o2 f485956e;

    public m2(zy2.dc dcVar, s74.o2 o2Var) {
        this.f485955d = dcVar;
        this.f485956e = o2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$updateAddFinderBtnInfo$1$1");
        s74.o2 o2Var = this.f485956e;
        zy2.dc dcVar = this.f485955d;
        if (dcVar != null) {
            int i17 = ((ya2.b2) dcVar).f69313xcad4ef95;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o2Var.j(), "getFinderContact, followFlg=" + i17 + ", userName=" + ((ya2.b2) dcVar).D0());
            o2Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateAddFinderBtnText", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
            if (i17 == 0) {
                android.widget.Button T = o2Var.T();
                if (T != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4.AdCardActionBtnInfo U = o2Var.U();
                    T.setText(U != null ? U.f38286x7d0c4d5c : null);
                }
            } else {
                android.widget.Button T2 = o2Var.T();
                if (T2 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4.AdCardActionBtnInfo U2 = o2Var.U();
                    if (U2 != null && (c17702x544f64e9 = U2.f38287xf7a0a3ac) != null) {
                        r6 = c17702x544f64e9.f244121j0;
                    }
                    T2.setText(r6);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateAddFinderBtnText", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(o2Var.j(), "getFinderContact, iLocalFinderContact==null");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$updateAddFinderBtnInfo$1$1");
    }
}
