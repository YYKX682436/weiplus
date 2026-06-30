package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29;

/* renamed from: com.tencent.tencentmap.mapsdk.maps.model.Language */
/* loaded from: classes13.dex */
public enum EnumC26040xa3acf778 implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26029xeb309ec1 {
    zh(1),
    zh_TW(2),
    en(3);


    /* renamed from: thisLanguageType */
    private final int f49498xd2bd070;

    EnumC26040xa3acf778(int i17) {
        this.f49498xd2bd070 = i17;
    }

    /* renamed from: wrap */
    public static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26040xa3acf778 m99498x37d04a(int i17) {
        for (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26040xa3acf778 enumC26040xa3acf778 : m99497xcee59d22()) {
            if (enumC26040xa3acf778.m99499xe443bd28() == i17) {
                return enumC26040xa3acf778;
            }
        }
        return zh;
    }

    /* renamed from: getLanguageType */
    public final int m99499xe443bd28() {
        return this.f49498xd2bd070;
    }
}
