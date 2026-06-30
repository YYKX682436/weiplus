package com.tencent.maas.moviecomposing.segments;

/* loaded from: classes16.dex */
public class FancyTextSegment extends com.tencent.maas.moviecomposing.segments.ElementSegment implements ug.d, ug.n {
    public static java.lang.Object A0(com.tencent.maas.moviecomposing.segments.FancyTextSegment fancyTextSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        fancyTextSegment.nativeClearSpeech(timeline, fancyTextSegment.f48532a.value());
        return null;
    }

    public static java.lang.Boolean B0(com.tencent.maas.moviecomposing.segments.FancyTextSegment fancyTextSegment, java.lang.String str, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Boolean.valueOf(fancyTextSegment.nativeReplaceSpeech(timeline, fancyTextSegment.f48532a.value(), str));
    }

    public static java.lang.String C0(com.tencent.maas.moviecomposing.segments.FancyTextSegment fancyTextSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        java.lang.String nativeGetAudioFilePath = fancyTextSegment.nativeGetAudioFilePath(timeline, fancyTextSegment.f48532a.value());
        return nativeGetAudioFilePath == null ? "" : nativeGetAudioFilePath;
    }

    public static java.lang.Object D0(com.tencent.maas.moviecomposing.segments.FancyTextSegment fancyTextSegment, java.lang.String str, java.lang.String str2, com.tencent.maas.moviecomposing.Timeline timeline) {
        fancyTextSegment.nativeUpdateRoleID(timeline, fancyTextSegment.f48532a.value(), str, str2);
        return null;
    }

    public static java.lang.String E0(com.tencent.maas.moviecomposing.segments.FancyTextSegment fancyTextSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        return fancyTextSegment.nativeGetRoleName(timeline, fancyTextSegment.f48532a.value());
    }

    public static java.lang.Object F0(com.tencent.maas.moviecomposing.segments.FancyTextSegment fancyTextSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        fancyTextSegment.nativeLeaveEditingState(timeline, fancyTextSegment.f48532a.value());
        return null;
    }

    public static java.lang.Boolean G0(com.tencent.maas.moviecomposing.segments.FancyTextSegment fancyTextSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Boolean.valueOf(fancyTextSegment.nativeIsEditingState(timeline, fancyTextSegment.f48532a.value()));
    }

    public static java.lang.Object H0(com.tencent.maas.moviecomposing.segments.FancyTextSegment fancyTextSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        fancyTextSegment.nativeResetRole(timeline, fancyTextSegment.f48532a.value());
        return null;
    }

    public static java.lang.Object I0(com.tencent.maas.moviecomposing.segments.FancyTextSegment fancyTextSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        fancyTextSegment.nativeEnterEditingState(timeline, fancyTextSegment.f48532a.value());
        return null;
    }

    public static java.lang.Boolean J0(com.tencent.maas.moviecomposing.segments.FancyTextSegment fancyTextSegment, java.lang.String str, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Boolean.valueOf(fancyTextSegment.nativeUpdateStyle(timeline, fancyTextSegment.f48532a.value(), str));
    }

    public static java.lang.String K0(com.tencent.maas.moviecomposing.segments.FancyTextSegment fancyTextSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        java.lang.String nativeGetSubtitle = fancyTextSegment.nativeGetSubtitle(timeline, fancyTextSegment.f48532a.value());
        return nativeGetSubtitle == null ? "" : nativeGetSubtitle;
    }

    public static java.lang.String L0(com.tencent.maas.moviecomposing.segments.FancyTextSegment fancyTextSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        java.lang.String nativeGetTitle = fancyTextSegment.nativeGetTitle(timeline, fancyTextSegment.f48532a.value());
        return nativeGetTitle == null ? "" : nativeGetTitle;
    }

    public static java.lang.String M0(com.tencent.maas.moviecomposing.segments.FancyTextSegment fancyTextSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        java.lang.String nativeGetPlaceholder = fancyTextSegment.nativeGetPlaceholder(timeline, fancyTextSegment.f48532a.value());
        return nativeGetPlaceholder == null ? "" : nativeGetPlaceholder;
    }

    private native boolean nativeBuildSpeech(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, java.lang.String str2);

    private native void nativeClearSpeech(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native void nativeEnterEditingState(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetAudioFilePath(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetColorStyleID(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetDisplayingSubtitle(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetDisplayingTitle(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetMaterialID(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetPlaceholder(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetRoleID(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetRoleName(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetSpeechText(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetSubtitle(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetSubtitleFontName(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetSubtitleFontNameInMaterial(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetTitle(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetTitleFontName(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetTitleFontNameInMaterial(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native boolean nativeHasSubtitle(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native boolean nativeHasTitle(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native boolean nativeIsEditingState(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native void nativeLeaveEditingState(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native boolean nativeReplaceSpeech(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, java.lang.String str2);

    private native void nativeResetRole(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native boolean nativeUpdateColorStyle(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, java.lang.String str2);

    private native void nativeUpdateRoleID(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, java.lang.String str2, java.lang.String str3);

    private native boolean nativeUpdateStyle(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, java.lang.String str2);

    private native boolean nativeUpdateSubtitle(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, java.lang.String str2);

    private native boolean nativeUpdateSubtitleFontName(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, java.lang.String str2);

    private native boolean nativeUpdateTitle(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, java.lang.String str2);

    private native boolean nativeUpdateTitleFontName(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, java.lang.String str2);

    public static java.lang.Boolean v0(com.tencent.maas.moviecomposing.segments.FancyTextSegment fancyTextSegment, java.lang.String str, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Boolean.valueOf(fancyTextSegment.nativeBuildSpeech(timeline, fancyTextSegment.f48532a.value(), str));
    }

    public static java.lang.String w0(com.tencent.maas.moviecomposing.segments.FancyTextSegment fancyTextSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        return fancyTextSegment.nativeGetRoleID(timeline, fancyTextSegment.f48532a.value());
    }

    public static java.lang.Boolean x0(com.tencent.maas.moviecomposing.segments.FancyTextSegment fancyTextSegment, java.lang.String str, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Boolean.valueOf(fancyTextSegment.nativeUpdateTitle(timeline, fancyTextSegment.f48532a.value(), str));
    }

    public static java.lang.String y0(com.tencent.maas.moviecomposing.segments.FancyTextSegment fancyTextSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        java.lang.String nativeGetMaterialID = fancyTextSegment.nativeGetMaterialID(timeline, fancyTextSegment.f48532a.value());
        return nativeGetMaterialID == null ? "" : nativeGetMaterialID;
    }

    public static java.lang.String z0(com.tencent.maas.moviecomposing.segments.FancyTextSegment fancyTextSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        java.lang.String nativeGetSpeechText = fancyTextSegment.nativeGetSpeechText(timeline, fancyTextSegment.f48532a.value());
        return nativeGetSpeechText == null ? "" : nativeGetSpeechText;
    }

    public java.lang.String N0() {
        return (java.lang.String) u("", new r.a() { // from class: ug.f$$f
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.FancyTextSegment.L0(com.tencent.maas.moviecomposing.segments.FancyTextSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        });
    }

    @Override // ug.d
    public void a() {
        u(null, new r.a() { // from class: ug.f$$c
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                com.tencent.maas.moviecomposing.segments.FancyTextSegment.I0(com.tencent.maas.moviecomposing.segments.FancyTextSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
                return null;
            }
        });
    }

    @Override // ug.n
    public java.lang.String b() {
        return (java.lang.String) u("", new r.a() { // from class: ug.f$$m
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.FancyTextSegment.z0(com.tencent.maas.moviecomposing.segments.FancyTextSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        });
    }

    @Override // ug.n
    public java.lang.String c() {
        return (java.lang.String) u(null, new r.a() { // from class: ug.f$$a
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.FancyTextSegment.w0(com.tencent.maas.moviecomposing.segments.FancyTextSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        });
    }

    @Override // ug.n
    public void d() {
        u(null, new r.a() { // from class: ug.f$$d
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                com.tencent.maas.moviecomposing.segments.FancyTextSegment.A0(com.tencent.maas.moviecomposing.segments.FancyTextSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
                return null;
            }
        });
    }

    @Override // ug.n
    public java.lang.String e() {
        return (java.lang.String) u("", new r.a() { // from class: ug.f$$l
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.FancyTextSegment.C0(com.tencent.maas.moviecomposing.segments.FancyTextSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        });
    }

    @Override // ug.n
    public void f() {
        u(null, new r.a() { // from class: ug.f$$e
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                com.tencent.maas.moviecomposing.segments.FancyTextSegment.H0(com.tencent.maas.moviecomposing.segments.FancyTextSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
                return null;
            }
        });
    }

    @Override // ug.n
    public java.lang.String g() {
        return (java.lang.String) u(null, new r.a() { // from class: ug.f$$j
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.FancyTextSegment.E0(com.tencent.maas.moviecomposing.segments.FancyTextSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        });
    }

    @Override // ug.n
    public boolean h(final java.lang.String str) {
        return ((java.lang.Boolean) u(java.lang.Boolean.FALSE, new r.a() { // from class: ug.f$$i
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.FancyTextSegment.B0(com.tencent.maas.moviecomposing.segments.FancyTextSegment.this, str, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        })).booleanValue();
    }

    @Override // ug.n
    public boolean i(final java.lang.String str) {
        return ((java.lang.Boolean) u(java.lang.Boolean.FALSE, new r.a() { // from class: ug.f$$h
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.FancyTextSegment.v0(com.tencent.maas.moviecomposing.segments.FancyTextSegment.this, str, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        })).booleanValue();
    }

    @Override // ug.d
    public void j() {
        u(null, new r.a() { // from class: ug.f$$b
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                com.tencent.maas.moviecomposing.segments.FancyTextSegment.F0(com.tencent.maas.moviecomposing.segments.FancyTextSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
                return null;
            }
        });
    }

    @Override // ug.n
    public void k(final java.lang.String str, final java.lang.String str2) {
        u(null, new r.a() { // from class: ug.f$$g
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                com.tencent.maas.moviecomposing.segments.FancyTextSegment.D0(com.tencent.maas.moviecomposing.segments.FancyTextSegment.this, str, str2, (com.tencent.maas.moviecomposing.Timeline) obj);
                return null;
            }
        });
    }

    @Override // ug.d
    public boolean l() {
        return ((java.lang.Boolean) u(java.lang.Boolean.FALSE, new r.a() { // from class: ug.f$$k
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.FancyTextSegment.G0(com.tencent.maas.moviecomposing.segments.FancyTextSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        })).booleanValue();
    }
}
