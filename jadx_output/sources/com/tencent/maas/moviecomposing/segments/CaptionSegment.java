package com.tencent.maas.moviecomposing.segments;

/* loaded from: classes5.dex */
public class CaptionSegment extends com.tencent.maas.moviecomposing.segments.ElementSegment implements ug.d {
    public static java.lang.String A0(com.tencent.maas.moviecomposing.segments.CaptionSegment captionSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        return captionSegment.nativeGetSecondaryCaptionFontName(timeline, captionSegment.f48532a.value());
    }

    public static java.lang.String B0(com.tencent.maas.moviecomposing.segments.CaptionSegment captionSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        return captionSegment.nativeGetSecondaryCaptionLanguage(timeline, captionSegment.f48532a.value());
    }

    public static java.lang.Boolean C0(com.tencent.maas.moviecomposing.segments.CaptionSegment captionSegment, java.lang.String str, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Boolean.valueOf(captionSegment.nativeUpdateColorStyle(timeline, captionSegment.f48532a.value(), str));
    }

    public static com.tencent.maas.moviecomposing.segments.CaptionItem[] D0(com.tencent.maas.moviecomposing.segments.CaptionSegment captionSegment, java.lang.String str, com.tencent.maas.moviecomposing.Timeline timeline) {
        java.lang.Object[] nativeGetCaptionItems = captionSegment.nativeGetCaptionItems(timeline, captionSegment.f48532a.value(), str);
        if (nativeGetCaptionItems == null) {
            return new com.tencent.maas.moviecomposing.segments.CaptionItem[0];
        }
        com.tencent.maas.moviecomposing.segments.CaptionItem[] captionItemArr = new com.tencent.maas.moviecomposing.segments.CaptionItem[nativeGetCaptionItems.length];
        for (int i17 = 0; i17 < nativeGetCaptionItems.length; i17++) {
            captionItemArr[i17] = (com.tencent.maas.moviecomposing.segments.CaptionItem) nativeGetCaptionItems[i17];
        }
        return captionItemArr;
    }

    public static java.lang.Boolean E0(com.tencent.maas.moviecomposing.segments.CaptionSegment captionSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Boolean.valueOf(captionSegment.nativeIsEditingState(timeline, captionSegment.f48532a.value()));
    }

    public static java.lang.String F0(com.tencent.maas.moviecomposing.segments.CaptionSegment captionSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        return captionSegment.nativeGetMainCaptionLanguage(timeline, captionSegment.f48532a.value());
    }

    public static java.lang.Boolean G0(com.tencent.maas.moviecomposing.segments.CaptionSegment captionSegment, java.util.List list, java.lang.String str, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Boolean.valueOf(captionSegment.nativeUpdateCaptionItems(timeline, captionSegment.f48532a.value(), list, str));
    }

    public static java.lang.Object H0(com.tencent.maas.moviecomposing.segments.CaptionSegment captionSegment, java.lang.String str, com.tencent.maas.moviecomposing.Timeline timeline) {
        captionSegment.nativeSetSecondaryCaptionLanguage(timeline, captionSegment.f48532a.value(), str);
        return null;
    }

    public static java.lang.Boolean I0(com.tencent.maas.moviecomposing.segments.CaptionSegment captionSegment, java.lang.String str, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Boolean.valueOf(captionSegment.nativeUpdateAllCaptionsFontName(timeline, captionSegment.f48532a.value(), str));
    }

    public static java.lang.Object J0(com.tencent.maas.moviecomposing.segments.CaptionSegment captionSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        captionSegment.nativeEnterEditingState(timeline, captionSegment.f48532a.value());
        return null;
    }

    public static java.lang.String K0(com.tencent.maas.moviecomposing.segments.CaptionSegment captionSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        java.lang.String nativeGetMaterialID = captionSegment.nativeGetMaterialID(timeline, captionSegment.f48532a.value());
        return nativeGetMaterialID == null ? "" : nativeGetMaterialID;
    }

    public static java.lang.String L0(com.tencent.maas.moviecomposing.segments.CaptionSegment captionSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        java.lang.String nativeGetMainCaptionFontName = captionSegment.nativeGetMainCaptionFontName(timeline, captionSegment.f48532a.value());
        return nativeGetMainCaptionFontName == null ? "" : nativeGetMainCaptionFontName;
    }

    public static java.lang.String M0(com.tencent.maas.moviecomposing.segments.CaptionSegment captionSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        java.lang.String nativeGetColorStyleID = captionSegment.nativeGetColorStyleID(timeline, captionSegment.f48532a.value());
        return nativeGetColorStyleID == null ? "" : nativeGetColorStyleID;
    }

    private native void nativeEnterEditingState(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.Object[] nativeGetCaptionItems(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, java.lang.String str2);

    private native java.lang.String nativeGetColorStyleID(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetMainCaptionFontName(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetMainCaptionFontNameInMaterial(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetMainCaptionLanguage(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetMaterialID(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetSecondaryCaptionFontName(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetSecondaryCaptionFontNameInMaterial(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetSecondaryCaptionLanguage(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native boolean nativeIsEditingState(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native void nativeLeaveEditingState(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native void nativeSetMainCaptionLanguage(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, java.lang.String str2);

    private native void nativeSetSecondaryCaptionLanguage(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, java.lang.String str2);

    private native boolean nativeUpdateAllCaptionsFontName(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, java.lang.String str2);

    private native boolean nativeUpdateCaptionItems(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, java.util.List<com.tencent.maas.moviecomposing.segments.CaptionItem> list, java.lang.String str2);

    private native boolean nativeUpdateColorStyle(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, java.lang.String str2);

    private native boolean nativeUpdateMainCaptionFontName(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, java.lang.String str2);

    private native boolean nativeUpdateSecondaryCaptionFontName(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, java.lang.String str2);

    private native boolean nativeUpdateStyle(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, java.lang.String str2);

    public static java.lang.Boolean v0(com.tencent.maas.moviecomposing.segments.CaptionSegment captionSegment, java.lang.String str, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Boolean.valueOf(captionSegment.nativeUpdateMainCaptionFontName(timeline, captionSegment.f48532a.value(), str));
    }

    public static java.lang.Boolean w0(com.tencent.maas.moviecomposing.segments.CaptionSegment captionSegment, java.lang.String str, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Boolean.valueOf(captionSegment.nativeUpdateSecondaryCaptionFontName(timeline, captionSegment.f48532a.value(), str));
    }

    public static java.lang.Object x0(com.tencent.maas.moviecomposing.segments.CaptionSegment captionSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        captionSegment.nativeLeaveEditingState(timeline, captionSegment.f48532a.value());
        return null;
    }

    public static java.lang.Object y0(com.tencent.maas.moviecomposing.segments.CaptionSegment captionSegment, java.lang.String str, com.tencent.maas.moviecomposing.Timeline timeline) {
        captionSegment.nativeSetMainCaptionLanguage(timeline, captionSegment.f48532a.value(), str);
        return null;
    }

    public static java.lang.Boolean z0(com.tencent.maas.moviecomposing.segments.CaptionSegment captionSegment, java.lang.String str, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Boolean.valueOf(captionSegment.nativeUpdateStyle(timeline, captionSegment.f48532a.value(), str));
    }

    @Override // ug.d
    public void a() {
        u(null, new r.a() { // from class: ug.a$$c
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                com.tencent.maas.moviecomposing.segments.CaptionSegment.J0(com.tencent.maas.moviecomposing.segments.CaptionSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
                return null;
            }
        });
    }

    @Override // ug.d
    public void j() {
        u(null, new r.a() { // from class: ug.a$$a
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                com.tencent.maas.moviecomposing.segments.CaptionSegment.x0(com.tencent.maas.moviecomposing.segments.CaptionSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
                return null;
            }
        });
    }

    @Override // ug.d
    public boolean l() {
        return ((java.lang.Boolean) u(java.lang.Boolean.FALSE, new r.a() { // from class: ug.a$$b
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.CaptionSegment.E0(com.tencent.maas.moviecomposing.segments.CaptionSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        })).booleanValue();
    }
}
