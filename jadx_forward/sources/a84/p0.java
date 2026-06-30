package a84;

/* loaded from: classes4.dex */
public abstract class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Random f83880a = new java.util.Random();

    public static float a(float f17, float f18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRandom", "com.tencent.mm.plugin.sns.ad.utils.RandomUtils");
        float min = java.lang.Math.min(f17, f18);
        float max = java.lang.Math.max(f17, f18) - min;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRandom", "com.tencent.mm.plugin.sns.ad.utils.RandomUtils");
        float nextFloat = f83880a.nextFloat() * max;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRandom", "com.tencent.mm.plugin.sns.ad.utils.RandomUtils");
        float f19 = nextFloat + min;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRandom", "com.tencent.mm.plugin.sns.ad.utils.RandomUtils");
        return f19;
    }
}
