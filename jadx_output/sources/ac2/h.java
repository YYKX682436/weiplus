package ac2;

/* loaded from: classes2.dex */
public final class h implements cw2.ea {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ac2.t f3030d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f3031e;

    public h(ac2.t tVar, long j17) {
        this.f3030d = tVar;
        this.f3031e = j17;
    }

    @Override // cw2.ea
    public void onVideoPause() {
    }

    @Override // cw2.ea
    public void onVideoPlay() {
    }

    @Override // cw2.ea
    public void p4(long j17, long j18) {
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer<T> dataList;
        int i17;
        ac2.t tVar = this.f3030d;
        long j19 = tVar.P;
        long j27 = this.f3031e;
        if (j19 == j27 && j18 > 0) {
            long j28 = j18 - j17;
            tVar.getClass();
            float a17 = ((ey2.v2) pf5.u.f353936a.e(c61.l7.class).a(ey2.v2.class)).a(java.lang.Long.valueOf(tVar.f3057y), java.lang.Integer.valueOf(tVar.f106422e));
            if (a17 <= 0.0f) {
                a17 = 1.0f;
            }
            long j29 = ((float) 3000) * a17;
            if (j29 < 3000) {
                j29 = 3000;
            }
            if (!(1 <= j28 && j28 <= j29) || tVar.N == j27) {
                if (j17 <= j29 || j28 <= j29 || tVar.M == null) {
                    return;
                }
                tVar.i0("progress");
                tVar.P = j27;
                return;
            }
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = tVar.f106570t;
            if (baseFeedLoader == null || (dataList = baseFeedLoader.getDataList()) == 0) {
                return;
            }
            java.util.Iterator it = dataList.iterator();
            int i18 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i18 = -1;
                    break;
                } else {
                    if (((so2.j5) it.next()).getItemId() == j27) {
                        break;
                    } else {
                        i18++;
                    }
                }
            }
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = null;
            if (i18 >= 0 && (i17 = i18 + 1) < dataList.size()) {
                java.lang.Object obj = dataList.get(i17);
                if (obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                    baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj;
                }
            }
            if (baseFinderFeed == null || !baseFinderFeed.getFeedObject().isNativeDramaPromotionFeed()) {
                return;
            }
            tVar.N = j27;
            long itemId = baseFinderFeed.getItemId();
            com.tencent.mars.xlog.Log.i(tVar.B, "onProgress edge-trigger show showPromotionCountDownToast, remainMs=" + j28 + ", thresholdMs=" + j29 + ", speedRatio=" + a17 + ", nextFeedId=" + pm0.v.u(itemId));
            com.tencent.mm.ui.MMActivity mMActivity = tVar.f106421d;
            if (mMActivity.isDestroyed() || mMActivity.isFinishing()) {
                return;
            }
            com.tencent.mm.plugin.finder.view.w2 w2Var = tVar.M;
            if (w2Var != null && w2Var.isShowing()) {
                return;
            }
            com.tencent.mm.plugin.finder.view.w2 w2Var2 = new com.tencent.mm.plugin.finder.view.w2(mMActivity, com.tencent.mm.R.layout.f489048ed2);
            tVar.M = w2Var2;
            w2Var2.setOnKeyListener(ac2.n.f3044d);
            w2Var2.setCancelable(false);
            w2Var2.show();
            com.tencent.mm.plugin.finder.view.FinderCountDownTextView finderCountDownTextView = (com.tencent.mm.plugin.finder.view.FinderCountDownTextView) w2Var2.findViewById(com.tencent.mm.R.id.ukc);
            if (finderCountDownTextView != null) {
                finderCountDownTextView.setWording(mMActivity.getResources().getString(com.tencent.mm.R.string.p4p));
                finderCountDownTextView.setTotalCountDownMs(3000L);
                finderCountDownTextView.setFinishWordingResId(-1);
                finderCountDownTextView.setKeepFinish(false);
                finderCountDownTextView.setCountDownFinishCallback(new ac2.o(tVar, j27));
                finderCountDownTextView.b();
            }
        }
    }
}
