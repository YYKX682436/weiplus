package lr1;

@j95.b
/* loaded from: classes5.dex */
public final class t extends i95.w implements ww.e {
    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BrandServiceTimelineResortService", "onAccountInitialized, uin: " + gm0.j1.b().h());
        if (wi().i("ReSortBizMsgMigrationCompleted", false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BrandServiceTimelineResortService", "Migration already completed, skip");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BrandServiceTimelineResortService", "Starting migration from old MMKV");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 R = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("brandService_accounts");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(R, "getSingleMMKV(...)");
        if (R.contains("ReSortBizMsgRedDotSample")) {
            boolean i17 = R.i("ReSortBizMsgRedDotSample", false);
            wi().G("ReSortBizMsgRedDotSample", i17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BrandServiceTimelineResortService", "Migrated ReSortBizMsgRedDotSample: " + i17);
            R.W("ReSortBizMsgRedDotSample");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BrandServiceTimelineResortService", "Removed ReSortBizMsgRedDotSample from old MMKV");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BrandServiceTimelineResortService", "No ReSortBizMsgRedDotSample found in old MMKV");
        }
        wi().G("ReSortBizMsgMigrationCompleted", true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BrandServiceTimelineResortService", "Migration completed");
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BrandServiceTimelineResortService", "onAccountReleased");
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BrandServiceTimelineResortService", "onCreate");
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 wi() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(gm0.j1.b().h() + "_brandService_accounts");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(M, "getMMKV(...)");
        return M;
    }
}
