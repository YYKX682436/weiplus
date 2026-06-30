package com.tencent.maas.model;

/* loaded from: classes5.dex */
public class MJMusicOptions {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.model.MJMusicOptions.SourceType f48282a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.maas.model.MJMusicInfo f48283b;

    /* loaded from: classes5.dex */
    public enum SourceType {
        None(0),
        TemplateBuiltin(1),
        Recommendation(2);


        /* renamed from: d, reason: collision with root package name */
        public final int f48288d;

        SourceType(int i17) {
            this.f48288d = i17;
        }

        public int getValue() {
            return this.f48288d;
        }
    }

    private MJMusicOptions(com.tencent.maas.model.MJMusicInfo mJMusicInfo, int i17) {
        com.tencent.maas.model.MJMusicOptions.SourceType sourceType;
        com.tencent.maas.model.MJMusicOptions.SourceType[] values = com.tencent.maas.model.MJMusicOptions.SourceType.values();
        int length = values.length;
        int i18 = 0;
        while (true) {
            if (i18 >= length) {
                sourceType = com.tencent.maas.model.MJMusicOptions.SourceType.None;
                break;
            }
            sourceType = values[i18];
            if (sourceType.getValue() == i17) {
                break;
            } else {
                i18++;
            }
        }
        this.f48282a = sourceType;
        this.f48283b = mJMusicInfo;
    }

    public com.tencent.maas.model.MJMusicInfo getMusicInfo() {
        return this.f48283b;
    }

    public com.tencent.maas.model.MJMusicOptions.SourceType getSourceType() {
        return this.f48282a;
    }
}
