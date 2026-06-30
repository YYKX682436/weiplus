package com.p314xaae8f345.p457x3304c6.p477x633fb29;

/* renamed from: com.tencent.maas.model.MJMusicOptions */
/* loaded from: classes5.dex */
public class C4117x106cc6f6 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p477x633fb29.C4117x106cc6f6.SourceType f129815a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356 f129816b;

    /* renamed from: com.tencent.maas.model.MJMusicOptions$SourceType */
    /* loaded from: classes5.dex */
    public enum SourceType {
        None(0),
        TemplateBuiltin(1),
        Recommendation(2);


        /* renamed from: d, reason: collision with root package name */
        public final int f129821d;

        SourceType(int i17) {
            this.f129821d = i17;
        }

        /* renamed from: getValue */
        public int m33867x754a37bb() {
            return this.f129821d;
        }
    }

    private C4117x106cc6f6(com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356 c4116xf4b2c356, int i17) {
        com.p314xaae8f345.p457x3304c6.p477x633fb29.C4117x106cc6f6.SourceType sourceType;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.C4117x106cc6f6.SourceType[] m33866xcee59d22 = com.p314xaae8f345.p457x3304c6.p477x633fb29.C4117x106cc6f6.SourceType.m33866xcee59d22();
        int length = m33866xcee59d22.length;
        int i18 = 0;
        while (true) {
            if (i18 >= length) {
                sourceType = com.p314xaae8f345.p457x3304c6.p477x633fb29.C4117x106cc6f6.SourceType.None;
                break;
            }
            sourceType = m33866xcee59d22[i18];
            if (sourceType.m33867x754a37bb() == i17) {
                break;
            } else {
                i18++;
            }
        }
        this.f129815a = sourceType;
        this.f129816b = c4116xf4b2c356;
    }

    /* renamed from: getMusicInfo */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356 m33862x16a99dbd() {
        return this.f129816b;
    }

    /* renamed from: getSourceType */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.C4117x106cc6f6.SourceType m33863xac019deb() {
        return this.f129815a;
    }
}
