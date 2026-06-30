package eb2;

/* loaded from: classes2.dex */
public final class z implements db2.u3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eb2.b0 f332402d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eb2.a0 f332403e;

    public z(eb2.b0 b0Var, eb2.a0 a0Var) {
        this.f332402d = b0Var;
        this.f332403e = a0Var;
    }

    @Override // db2.u3
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.d info, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        this.f332402d.f332252n = info.f189302g > 0;
        this.f332402d.f332254p = info.f189302g == 1;
        boolean z17 = info.f189305j;
        boolean z18 = info.f189304i;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLbsFeedFetcher", "[getStream] tabType=" + this.f332402d.f332248g + " isGetHistory=" + this.f332402d.f332252n + " isShowHistoryTip=" + this.f332402d.f332254p + " ret_flag=" + info.f189302g + " pullType=" + i17 + " isNeedClear=" + z18 + " isFetchHistoryNow=" + info.f189305j + " size=" + info.f189300e.size() + " errorType=" + info.f189296a + " errorCode=" + info.f189297b);
        eb2.b0 b0Var = this.f332402d;
        boolean z19 = info.f189304i;
        int size = info.f189300e.size();
        int i18 = info.f189302g;
        b0Var.getClass();
        if (z19 && size <= 0 && i18 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderLbsFeedFetcher", "isNeedClear && incrementSize <= 0 && retFlag == 0");
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        } else if (!z19 && size > 0 && i17 != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderLbsFeedFetcher", "!isNeedClear && incrementSize > 0 pullType=" + i17);
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        }
        if (info.f189296a == 0 && info.f189297b == 0 && this.f332402d.f332252n && z17) {
            eb2.b0 b0Var2 = this.f332402d;
            b0Var2.f332253o = true;
            b0Var2.f332250i.f332390a = 3;
            eb2.b0.E0(b0Var2, this.f332403e, true, i17, info.f189301f, z18, b0Var2.f332254p, null, 64, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLbsFeedFetcher", "get history to fill... tabType=" + this.f332402d.f332248g + " pullType=" + i17 + " isHistoryFirstPage=" + this.f332402d.f332253o);
            this.f332402d.f332253o = false;
            return;
        }
        if (info.f189296a == 0 && info.f189297b == 0) {
            jx3.f.INSTANCE.mo68477x336bdfd8(1279L, 1L, 1L, false);
            if (info.f189300e.isEmpty() && !this.f332402d.f332252n) {
                info.f189303h = 1;
                eb2.b0 b0Var3 = this.f332402d;
                java.lang.String str3 = "[finderstream]tabType=" + this.f332402d.f332248g + " server error[list=0:ret_flag=0]";
                b0Var3.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderLbsFeedFetcher", str3);
                java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            } else if (!info.f189300e.isEmpty()) {
                info.f189303h = 1;
            } else {
                info.f189303h = 1;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLbsFeedFetcher", "tabType=" + this.f332402d.f332248g + " this time get finderstream return list=" + info.f189300e.size() + " continue_flag=" + info.f189303h + " pullType=" + i17);
        } else {
            jx3.f.INSTANCE.mo68477x336bdfd8(1279L, 2L, 1L, false);
            info.f189303h = 1;
        }
        this.f332403e.a(info, i17);
    }
}
