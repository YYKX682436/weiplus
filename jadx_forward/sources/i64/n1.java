package i64;

/* loaded from: classes4.dex */
public enum n1 {
    PlayIcon(1),
    EnterFullScreen(2),
    EnterCompleteVideo(3),
    DetailInVideo(4),
    LeavelFullScreen(5),
    LeaveCompleteVideo(6),
    /* JADX INFO: Fake field, exist only in values array */
    SightLoaded(7),
    DetailTimeline(8);


    /* renamed from: d, reason: collision with root package name */
    public final int f370789d;

    static {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("$values", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic$EActionActionType");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("$values", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic$EActionActionType");
    }

    n1(int i17) {
        this.f370789d = 0;
        this.f370789d = i17;
    }

    /* renamed from: valueOf */
    public static i64.n1 m134842xdce0328(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("valueOf", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic$EActionActionType");
        i64.n1 n1Var = (i64.n1) java.lang.Enum.valueOf(i64.n1.class, str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("valueOf", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic$EActionActionType");
        return n1Var;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static i64.n1[] valuesCustom() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("values", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic$EActionActionType");
        i64.n1[] n1VarArr = (i64.n1[]) values().clone();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("values", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic$EActionActionType");
        return n1VarArr;
    }
}
