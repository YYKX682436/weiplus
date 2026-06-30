package com.tencent.maas.moviecomposing.segments;

/* loaded from: classes16.dex */
public class ContentDescSegment extends com.tencent.maas.moviecomposing.segments.ElementSegment implements ug.d, ug.n {
    public static java.lang.Boolean A0(com.tencent.maas.moviecomposing.segments.ContentDescSegment contentDescSegment, java.lang.String str, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Boolean.valueOf(contentDescSegment.nativeReplaceSpeech(timeline, contentDescSegment.f48532a.value(), str));
    }

    public static java.lang.Boolean B0(com.tencent.maas.moviecomposing.segments.ContentDescSegment contentDescSegment, java.lang.String str, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Boolean.valueOf(contentDescSegment.nativeUpdateColorStyle(timeline, contentDescSegment.f48532a.value(), str));
    }

    public static java.lang.Object C0(com.tencent.maas.moviecomposing.segments.ContentDescSegment contentDescSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        contentDescSegment.nativeResetRole(timeline, contentDescSegment.f48532a.value());
        return null;
    }

    public static java.lang.Object D0(com.tencent.maas.moviecomposing.segments.ContentDescSegment contentDescSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        contentDescSegment.nativeEnterEditingState(timeline, contentDescSegment.f48532a.value());
        return null;
    }

    public static java.lang.Boolean E0(com.tencent.maas.moviecomposing.segments.ContentDescSegment contentDescSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Boolean.valueOf(contentDescSegment.nativeIsEditingState(timeline, contentDescSegment.f48532a.value()));
    }

    public static java.lang.String F0(com.tencent.maas.moviecomposing.segments.ContentDescSegment contentDescSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        java.lang.String nativeGetColorStyleID = contentDescSegment.nativeGetColorStyleID(timeline, contentDescSegment.f48532a.value());
        return nativeGetColorStyleID == null ? "" : nativeGetColorStyleID;
    }

    public static java.lang.Boolean G0(com.tencent.maas.moviecomposing.segments.ContentDescSegment contentDescSegment, java.lang.String str, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Boolean.valueOf(contentDescSegment.nativeBuildSpeech(timeline, contentDescSegment.f48532a.value(), str));
    }

    public static java.lang.String H0(com.tencent.maas.moviecomposing.segments.ContentDescSegment contentDescSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        return contentDescSegment.nativeGetRoleName(timeline, contentDescSegment.f48532a.value());
    }

    public static java.lang.String I0(com.tencent.maas.moviecomposing.segments.ContentDescSegment contentDescSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        java.lang.String nativeGetMaterialID = contentDescSegment.nativeGetMaterialID(timeline, contentDescSegment.f48532a.value());
        return nativeGetMaterialID == null ? "" : nativeGetMaterialID;
    }

    public static java.lang.String J0(com.tencent.maas.moviecomposing.segments.ContentDescSegment contentDescSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        return contentDescSegment.nativeGetRoleID(timeline, contentDescSegment.f48532a.value());
    }

    public static java.lang.String K0(com.tencent.maas.moviecomposing.segments.ContentDescSegment contentDescSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        java.lang.String nativeGetText = contentDescSegment.nativeGetText(timeline, contentDescSegment.f48532a.value());
        return nativeGetText == null ? "" : nativeGetText;
    }

    public static java.lang.String L0(com.tencent.maas.moviecomposing.segments.ContentDescSegment contentDescSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        java.lang.String nativeGetAudioFilePath = contentDescSegment.nativeGetAudioFilePath(timeline, contentDescSegment.f48532a.value());
        return nativeGetAudioFilePath == null ? "" : nativeGetAudioFilePath;
    }

    public static java.lang.Boolean M0(com.tencent.maas.moviecomposing.segments.ContentDescSegment contentDescSegment, java.lang.String str, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Boolean.valueOf(contentDescSegment.nativeUpdateText(timeline, contentDescSegment.f48532a.value(), str));
    }

    public static java.lang.Boolean N0(com.tencent.maas.moviecomposing.segments.ContentDescSegment contentDescSegment, java.lang.String str, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Boolean.valueOf(contentDescSegment.nativeUpdateStyle(timeline, contentDescSegment.f48532a.value(), str));
    }

    public static java.lang.Boolean O0(com.tencent.maas.moviecomposing.segments.ContentDescSegment contentDescSegment, java.lang.String str, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Boolean.valueOf(contentDescSegment.nativeUpdateTextFontName(timeline, contentDescSegment.f48532a.value(), str));
    }

    private native boolean nativeBuildSpeech(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, java.lang.String str2);

    private native void nativeClearSpeech(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native void nativeEnterEditingState(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetAudioFilePath(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetBelongingSegmentID(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetColorStyleID(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetDisplayingText(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetMaterialID(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetRoleID(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetRoleName(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetSpeechText(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetText(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetTextFontName(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetTextFontNameInMaterial(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native boolean nativeIsEditingState(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native void nativeLeaveEditingState(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native boolean nativeReplaceSpeech(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, java.lang.String str2);

    private native void nativeResetRole(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native boolean nativeUpdateColorStyle(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, java.lang.String str2);

    private native void nativeUpdateRoleID(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, java.lang.String str2, java.lang.String str3);

    private native boolean nativeUpdateStyle(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, java.lang.String str2);

    private native boolean nativeUpdateText(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, java.lang.String str2);

    private native boolean nativeUpdateTextFontName(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, java.lang.String str2);

    public static java.lang.String v0(com.tencent.maas.moviecomposing.segments.ContentDescSegment contentDescSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        java.lang.String nativeGetSpeechText = contentDescSegment.nativeGetSpeechText(timeline, contentDescSegment.f48532a.value());
        return nativeGetSpeechText == null ? "" : nativeGetSpeechText;
    }

    public static java.lang.Object w0(com.tencent.maas.moviecomposing.segments.ContentDescSegment contentDescSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        contentDescSegment.nativeClearSpeech(timeline, contentDescSegment.f48532a.value());
        return null;
    }

    public static java.lang.Object x0(com.tencent.maas.moviecomposing.segments.ContentDescSegment contentDescSegment, java.lang.String str, java.lang.String str2, com.tencent.maas.moviecomposing.Timeline timeline) {
        contentDescSegment.nativeUpdateRoleID(timeline, contentDescSegment.f48532a.value(), str, str2);
        return null;
    }

    public static java.lang.Object y0(com.tencent.maas.moviecomposing.segments.ContentDescSegment contentDescSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        contentDescSegment.nativeLeaveEditingState(timeline, contentDescSegment.f48532a.value());
        return null;
    }

    public static java.lang.String z0(com.tencent.maas.moviecomposing.segments.ContentDescSegment contentDescSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        java.lang.String nativeGetTextFontName = contentDescSegment.nativeGetTextFontName(timeline, contentDescSegment.f48532a.value());
        return nativeGetTextFontName == null ? "" : nativeGetTextFontName;
    }

    public java.lang.String P0() {
        return (java.lang.String) u("", new r.a() { // from class: ug.c$$e
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.ContentDescSegment.K0(com.tencent.maas.moviecomposing.segments.ContentDescSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        });
    }

    @Override // ug.d
    public void a() {
        u(null, new r.a() { // from class: ug.c$$d
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                com.tencent.maas.moviecomposing.segments.ContentDescSegment.D0(com.tencent.maas.moviecomposing.segments.ContentDescSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
                return null;
            }
        });
    }

    @Override // ug.n
    public java.lang.String b() {
        return (java.lang.String) u("", new r.a() { // from class: ug.c$$k
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.ContentDescSegment.v0(com.tencent.maas.moviecomposing.segments.ContentDescSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        });
    }

    @Override // ug.n
    public java.lang.String c() {
        return (java.lang.String) u(null, new r.a() { // from class: ug.c$$i
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.ContentDescSegment.J0(com.tencent.maas.moviecomposing.segments.ContentDescSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        });
    }

    @Override // ug.n
    public void d() {
        u(null, new r.a() { // from class: ug.c$$f
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                com.tencent.maas.moviecomposing.segments.ContentDescSegment.w0(com.tencent.maas.moviecomposing.segments.ContentDescSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
                return null;
            }
        });
    }

    @Override // ug.n
    public java.lang.String e() {
        return (java.lang.String) u("", new r.a() { // from class: ug.c$$j
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.ContentDescSegment.L0(com.tencent.maas.moviecomposing.segments.ContentDescSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        });
    }

    @Override // ug.n
    public void f() {
        u(null, new r.a() { // from class: ug.c$$m
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                com.tencent.maas.moviecomposing.segments.ContentDescSegment.C0(com.tencent.maas.moviecomposing.segments.ContentDescSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
                return null;
            }
        });
    }

    @Override // ug.n
    public java.lang.String g() {
        return (java.lang.String) u(null, new r.a() { // from class: ug.c$$l
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.ContentDescSegment.H0(com.tencent.maas.moviecomposing.segments.ContentDescSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        });
    }

    @Override // ug.n
    public boolean h(final java.lang.String str) {
        return ((java.lang.Boolean) u(java.lang.Boolean.FALSE, new r.a() { // from class: ug.c$$g
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.ContentDescSegment.A0(com.tencent.maas.moviecomposing.segments.ContentDescSegment.this, str, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        })).booleanValue();
    }

    @Override // ug.n
    public boolean i(final java.lang.String str) {
        return ((java.lang.Boolean) u(java.lang.Boolean.FALSE, new r.a() { // from class: ug.c$$h
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.ContentDescSegment.G0(com.tencent.maas.moviecomposing.segments.ContentDescSegment.this, str, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        })).booleanValue();
    }

    @Override // ug.d
    public void j() {
        u(null, new r.a() { // from class: ug.c$$a
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                com.tencent.maas.moviecomposing.segments.ContentDescSegment.y0(com.tencent.maas.moviecomposing.segments.ContentDescSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
                return null;
            }
        });
    }

    @Override // ug.n
    public void k(final java.lang.String str, final java.lang.String str2) {
        u(null, new r.a() { // from class: ug.c$$b
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                com.tencent.maas.moviecomposing.segments.ContentDescSegment.x0(com.tencent.maas.moviecomposing.segments.ContentDescSegment.this, str, str2, (com.tencent.maas.moviecomposing.Timeline) obj);
                return null;
            }
        });
    }

    @Override // ug.d
    public boolean l() {
        return ((java.lang.Boolean) u(java.lang.Boolean.FALSE, new r.a() { // from class: ug.c$$c
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.ContentDescSegment.E0(com.tencent.maas.moviecomposing.segments.ContentDescSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        })).booleanValue();
    }
}
