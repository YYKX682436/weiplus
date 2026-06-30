package com.tencent.maas.moviecomposing.segments;

/* loaded from: classes5.dex */
public class NarrationSegment extends com.tencent.maas.moviecomposing.segments.ClipSegment {
    public static java.lang.Object A1(com.tencent.maas.moviecomposing.segments.NarrationSegment narrationSegment, java.lang.String str, java.lang.String str2, com.tencent.maas.moviecomposing.Timeline timeline) {
        narrationSegment.nativeUpdateRoleID(timeline, narrationSegment.f48532a.value(), str, str2);
        return null;
    }

    public static java.lang.String B1(com.tencent.maas.moviecomposing.segments.NarrationSegment narrationSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        java.lang.String nativeGetNarrationFilePath = narrationSegment.nativeGetNarrationFilePath(timeline, narrationSegment.f48532a.value());
        return nativeGetNarrationFilePath == null ? "" : nativeGetNarrationFilePath;
    }

    public static java.lang.String C1(com.tencent.maas.moviecomposing.segments.NarrationSegment narrationSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        java.lang.String nativeGetCaptionStyleID = narrationSegment.nativeGetCaptionStyleID(timeline, narrationSegment.f48532a.value());
        return nativeGetCaptionStyleID == null ? "" : nativeGetCaptionStyleID;
    }

    public static java.lang.Boolean D1(com.tencent.maas.moviecomposing.segments.NarrationSegment narrationSegment, java.lang.String str, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Boolean.valueOf(narrationSegment.nativeUpdateCaptionStyle(timeline, narrationSegment.f48532a.value(), str));
    }

    public static java.lang.String E1(com.tencent.maas.moviecomposing.segments.NarrationSegment narrationSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        java.lang.String nativeGetAudioFileID = narrationSegment.nativeGetAudioFileID(timeline, narrationSegment.f48532a.value());
        return nativeGetAudioFileID == null ? "" : nativeGetAudioFileID;
    }

    public static java.lang.Boolean F1(com.tencent.maas.moviecomposing.segments.NarrationSegment narrationSegment, java.lang.String str, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Boolean.valueOf(narrationSegment.nativeUpdateCaptionFontName(timeline, narrationSegment.f48532a.value(), str));
    }

    public static java.lang.String G1(com.tencent.maas.moviecomposing.segments.NarrationSegment narrationSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        java.lang.String nativeGetCaptionColorStyleID = narrationSegment.nativeGetCaptionColorStyleID(timeline, narrationSegment.f48532a.value());
        return nativeGetCaptionColorStyleID == null ? "" : nativeGetCaptionColorStyleID;
    }

    public static java.lang.Boolean H1(com.tencent.maas.moviecomposing.segments.NarrationSegment narrationSegment, java.util.List list, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Boolean.valueOf(narrationSegment.nativeUpdateCaptionItems(timeline, narrationSegment.f48532a.value(), list));
    }

    public static com.tencent.maas.moviecomposing.segments.CaptionItem[] I1(com.tencent.maas.moviecomposing.segments.NarrationSegment narrationSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        java.lang.Object[] nativeGetDisplayingCaptionItems = narrationSegment.nativeGetDisplayingCaptionItems(timeline, narrationSegment.f48532a.value());
        if (nativeGetDisplayingCaptionItems == null) {
            return new com.tencent.maas.moviecomposing.segments.CaptionItem[0];
        }
        com.tencent.maas.moviecomposing.segments.CaptionItem[] captionItemArr = new com.tencent.maas.moviecomposing.segments.CaptionItem[nativeGetDisplayingCaptionItems.length];
        for (int i17 = 0; i17 < nativeGetDisplayingCaptionItems.length; i17++) {
            captionItemArr[i17] = (com.tencent.maas.moviecomposing.segments.CaptionItem) nativeGetDisplayingCaptionItems[i17];
        }
        return captionItemArr;
    }

    public static java.lang.Boolean J1(com.tencent.maas.moviecomposing.segments.NarrationSegment narrationSegment, java.lang.String str, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Boolean.valueOf(narrationSegment.nativeUpdateCaptionColorStyle(timeline, narrationSegment.f48532a.value(), str));
    }

    public static java.lang.String K1(com.tencent.maas.moviecomposing.segments.NarrationSegment narrationSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        java.lang.String nativeGetCaptionFontName = narrationSegment.nativeGetCaptionFontName(timeline, narrationSegment.f48532a.value());
        return nativeGetCaptionFontName == null ? "" : nativeGetCaptionFontName;
    }

    public static java.lang.String L1(com.tencent.maas.moviecomposing.segments.NarrationSegment narrationSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        java.lang.String nativeGetOriginNarrationFilePath = narrationSegment.nativeGetOriginNarrationFilePath(timeline, narrationSegment.f48532a.value());
        return nativeGetOriginNarrationFilePath == null ? "" : nativeGetOriginNarrationFilePath;
    }

    public static com.tencent.maas.moviecomposing.segments.CaptionItem[] M1(com.tencent.maas.moviecomposing.segments.NarrationSegment narrationSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        java.lang.Object[] nativeGetCaptionItems = narrationSegment.nativeGetCaptionItems(timeline, narrationSegment.f48532a.value());
        if (nativeGetCaptionItems == null) {
            return new com.tencent.maas.moviecomposing.segments.CaptionItem[0];
        }
        com.tencent.maas.moviecomposing.segments.CaptionItem[] captionItemArr = new com.tencent.maas.moviecomposing.segments.CaptionItem[nativeGetCaptionItems.length];
        for (int i17 = 0; i17 < nativeGetCaptionItems.length; i17++) {
            captionItemArr[i17] = (com.tencent.maas.moviecomposing.segments.CaptionItem) nativeGetCaptionItems[i17];
        }
        return captionItemArr;
    }

    public static java.lang.String N1(com.tencent.maas.moviecomposing.segments.NarrationSegment narrationSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        return narrationSegment.nativeGetRoleID(timeline, narrationSegment.f48532a.value());
    }

    public static java.lang.Boolean O1(com.tencent.maas.moviecomposing.segments.NarrationSegment narrationSegment, java.lang.String str, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Boolean.valueOf(narrationSegment.nativeReplaceNarrationSpeech(timeline, narrationSegment.f48532a.value(), str));
    }

    private native java.lang.String nativeGetAudioFileID(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetCaptionColorStyleID(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetCaptionFontName(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetCaptionFontNameInMaterial(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.Object[] nativeGetCaptionItems(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetCaptionStyleID(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.Object[] nativeGetDisplayingCaptionItems(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetNarrationFilePath(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetOriginNarrationFilePath(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetRoleID(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetRoleName(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native void nativeHideCaptions(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native boolean nativeIsCaptionEnabled(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native boolean nativeReplaceNarration(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List<com.tencent.maas.moviecomposing.segments.CaptionItem> list, java.lang.String str5);

    private native boolean nativeReplaceNarrationSpeech(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, java.lang.String str2);

    private native void nativeResetRole(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native boolean nativeShowCaptions(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native boolean nativeUpdateCaptionColorStyle(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, java.lang.String str2);

    private native boolean nativeUpdateCaptionFontName(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, java.lang.String str2);

    private native boolean nativeUpdateCaptionItems(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, java.util.List<com.tencent.maas.moviecomposing.segments.CaptionItem> list);

    private native boolean nativeUpdateCaptionStyle(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, java.lang.String str2);

    private native void nativeUpdateRoleID(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, java.lang.String str2, java.lang.String str3);

    public static java.lang.String z1(com.tencent.maas.moviecomposing.segments.NarrationSegment narrationSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        return narrationSegment.nativeGetRoleName(timeline, narrationSegment.f48532a.value());
    }

    public com.tencent.maas.moviecomposing.segments.CaptionItem[] P1() {
        return (com.tencent.maas.moviecomposing.segments.CaptionItem[]) u(new com.tencent.maas.moviecomposing.segments.CaptionItem[0], new r.a() { // from class: ug.i$$b
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.NarrationSegment.M1(com.tencent.maas.moviecomposing.segments.NarrationSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        });
    }

    public java.lang.String Q1() {
        return (java.lang.String) u("", new r.a() { // from class: ug.i$$a
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.NarrationSegment.L1(com.tencent.maas.moviecomposing.segments.NarrationSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        });
    }
}
