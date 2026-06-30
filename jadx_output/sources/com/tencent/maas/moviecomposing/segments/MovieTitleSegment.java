package com.tencent.maas.moviecomposing.segments;

/* loaded from: classes16.dex */
public class MovieTitleSegment extends com.tencent.maas.moviecomposing.segments.ElementSegment implements ug.d, ug.n {
    public static java.lang.Object A0(com.tencent.maas.moviecomposing.segments.MovieTitleSegment movieTitleSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        movieTitleSegment.nativeLeaveEditingState(timeline, movieTitleSegment.f48532a.value());
        return null;
    }

    public static java.lang.Boolean B0(com.tencent.maas.moviecomposing.segments.MovieTitleSegment movieTitleSegment, java.lang.String str, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Boolean.valueOf(movieTitleSegment.nativeUpdateTitleFontName(timeline, movieTitleSegment.f48532a.value(), str));
    }

    public static java.lang.Object C0(com.tencent.maas.moviecomposing.segments.MovieTitleSegment movieTitleSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        movieTitleSegment.nativeResetRole(timeline, movieTitleSegment.f48532a.value());
        return null;
    }

    public static java.lang.Boolean D0(com.tencent.maas.moviecomposing.segments.MovieTitleSegment movieTitleSegment, java.lang.String str, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Boolean.valueOf(movieTitleSegment.nativeUpdateColorStyle(timeline, movieTitleSegment.f48532a.value(), str));
    }

    public static java.lang.Boolean E0(com.tencent.maas.moviecomposing.segments.MovieTitleSegment movieTitleSegment, java.lang.String str, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Boolean.valueOf(movieTitleSegment.nativeBuildSpeech(timeline, movieTitleSegment.f48532a.value(), str));
    }

    public static java.lang.String F0(com.tencent.maas.moviecomposing.segments.MovieTitleSegment movieTitleSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        java.lang.String nativeGetAudioFilePath = movieTitleSegment.nativeGetAudioFilePath(timeline, movieTitleSegment.f48532a.value());
        return nativeGetAudioFilePath == null ? "" : nativeGetAudioFilePath;
    }

    public static java.lang.Boolean G0(com.tencent.maas.moviecomposing.segments.MovieTitleSegment movieTitleSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Boolean.valueOf(movieTitleSegment.nativeIsEditingState(timeline, movieTitleSegment.f48532a.value()));
    }

    public static java.lang.String H0(com.tencent.maas.moviecomposing.segments.MovieTitleSegment movieTitleSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        java.lang.String nativeGetTitle = movieTitleSegment.nativeGetTitle(timeline, movieTitleSegment.f48532a.value());
        return nativeGetTitle == null ? "" : nativeGetTitle;
    }

    public static java.lang.Boolean I0(com.tencent.maas.moviecomposing.segments.MovieTitleSegment movieTitleSegment, java.lang.String str, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Boolean.valueOf(movieTitleSegment.nativeUpdateTitle(timeline, movieTitleSegment.f48532a.value(), str));
    }

    public static java.lang.Boolean J0(com.tencent.maas.moviecomposing.segments.MovieTitleSegment movieTitleSegment, java.lang.String str, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Boolean.valueOf(movieTitleSegment.nativeReplaceSpeech(timeline, movieTitleSegment.f48532a.value(), str));
    }

    public static java.lang.String K0(com.tencent.maas.moviecomposing.segments.MovieTitleSegment movieTitleSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        java.lang.String nativeGetMaterialID = movieTitleSegment.nativeGetMaterialID(timeline, movieTitleSegment.f48532a.value());
        return nativeGetMaterialID == null ? "" : nativeGetMaterialID;
    }

    public static java.lang.String L0(com.tencent.maas.moviecomposing.segments.MovieTitleSegment movieTitleSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        return movieTitleSegment.nativeGetRoleID(timeline, movieTitleSegment.f48532a.value());
    }

    public static java.lang.String M0(com.tencent.maas.moviecomposing.segments.MovieTitleSegment movieTitleSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        java.lang.String nativeGetTitleFontName = movieTitleSegment.nativeGetTitleFontName(timeline, movieTitleSegment.f48532a.value());
        return nativeGetTitleFontName == null ? "" : nativeGetTitleFontName;
    }

    public static java.lang.Object N0(com.tencent.maas.moviecomposing.segments.MovieTitleSegment movieTitleSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        movieTitleSegment.nativeClearSpeech(timeline, movieTitleSegment.f48532a.value());
        return null;
    }

    public static java.lang.Boolean O0(com.tencent.maas.moviecomposing.segments.MovieTitleSegment movieTitleSegment, java.lang.String str, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Boolean.valueOf(movieTitleSegment.nativeUpdateStyle(timeline, movieTitleSegment.f48532a.value(), str));
    }

    private native boolean nativeBuildSpeech(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, java.lang.String str2);

    private native void nativeClearSpeech(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native void nativeEnterEditingState(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetAudioFilePath(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetColorStyleID(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetDisplayingTitle(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetMaterialID(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetRoleID(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetRoleName(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetSpeechText(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetTitle(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetTitleFontName(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetTitleFontNameInMaterial(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native boolean nativeIsEditingState(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native void nativeLeaveEditingState(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native boolean nativeReplaceSpeech(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, java.lang.String str2);

    private native void nativeResetRole(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native boolean nativeUpdateColorStyle(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, java.lang.String str2);

    private native void nativeUpdateRoleID(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, java.lang.String str2, java.lang.String str3);

    private native boolean nativeUpdateStyle(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, java.lang.String str2);

    private native boolean nativeUpdateTitle(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, java.lang.String str2);

    private native boolean nativeUpdateTitleFontName(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, java.lang.String str2);

    public static java.lang.String v0(com.tencent.maas.moviecomposing.segments.MovieTitleSegment movieTitleSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        java.lang.String nativeGetSpeechText = movieTitleSegment.nativeGetSpeechText(timeline, movieTitleSegment.f48532a.value());
        return nativeGetSpeechText == null ? "" : nativeGetSpeechText;
    }

    public static java.lang.String w0(com.tencent.maas.moviecomposing.segments.MovieTitleSegment movieTitleSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        java.lang.String nativeGetColorStyleID = movieTitleSegment.nativeGetColorStyleID(timeline, movieTitleSegment.f48532a.value());
        return nativeGetColorStyleID == null ? "" : nativeGetColorStyleID;
    }

    public static java.lang.String x0(com.tencent.maas.moviecomposing.segments.MovieTitleSegment movieTitleSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        return movieTitleSegment.nativeGetRoleName(timeline, movieTitleSegment.f48532a.value());
    }

    public static java.lang.Object y0(com.tencent.maas.moviecomposing.segments.MovieTitleSegment movieTitleSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        movieTitleSegment.nativeEnterEditingState(timeline, movieTitleSegment.f48532a.value());
        return null;
    }

    public static java.lang.Object z0(com.tencent.maas.moviecomposing.segments.MovieTitleSegment movieTitleSegment, java.lang.String str, java.lang.String str2, com.tencent.maas.moviecomposing.Timeline timeline) {
        movieTitleSegment.nativeUpdateRoleID(timeline, movieTitleSegment.f48532a.value(), str, str2);
        return null;
    }

    public java.lang.String P0() {
        return (java.lang.String) u("", new r.a() { // from class: ug.g$$c
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.MovieTitleSegment.H0(com.tencent.maas.moviecomposing.segments.MovieTitleSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        });
    }

    @Override // ug.d
    public void a() {
        u(null, new r.a() { // from class: ug.g$$j
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                com.tencent.maas.moviecomposing.segments.MovieTitleSegment.y0(com.tencent.maas.moviecomposing.segments.MovieTitleSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
                return null;
            }
        });
    }

    @Override // ug.n
    public java.lang.String b() {
        return (java.lang.String) u("", new r.a() { // from class: ug.g$$f
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.MovieTitleSegment.v0(com.tencent.maas.moviecomposing.segments.MovieTitleSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        });
    }

    @Override // ug.n
    public java.lang.String c() {
        return (java.lang.String) u(null, new r.a() { // from class: ug.g$$b
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.MovieTitleSegment.L0(com.tencent.maas.moviecomposing.segments.MovieTitleSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        });
    }

    @Override // ug.n
    public void d() {
        u(null, new r.a() { // from class: ug.g$$a
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                com.tencent.maas.moviecomposing.segments.MovieTitleSegment.N0(com.tencent.maas.moviecomposing.segments.MovieTitleSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
                return null;
            }
        });
    }

    @Override // ug.n
    public java.lang.String e() {
        return (java.lang.String) u("", new r.a() { // from class: ug.g$$e
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.MovieTitleSegment.F0(com.tencent.maas.moviecomposing.segments.MovieTitleSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        });
    }

    @Override // ug.n
    public void f() {
        u(null, new r.a() { // from class: ug.g$$g
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                com.tencent.maas.moviecomposing.segments.MovieTitleSegment.C0(com.tencent.maas.moviecomposing.segments.MovieTitleSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
                return null;
            }
        });
    }

    @Override // ug.n
    public java.lang.String g() {
        return (java.lang.String) u(null, new r.a() { // from class: ug.g$$h
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.MovieTitleSegment.x0(com.tencent.maas.moviecomposing.segments.MovieTitleSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        });
    }

    @Override // ug.n
    public boolean h(final java.lang.String str) {
        return ((java.lang.Boolean) u(java.lang.Boolean.FALSE, new r.a() { // from class: ug.g$$m
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.MovieTitleSegment.J0(com.tencent.maas.moviecomposing.segments.MovieTitleSegment.this, str, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        })).booleanValue();
    }

    @Override // ug.n
    public boolean i(final java.lang.String str) {
        return ((java.lang.Boolean) u(java.lang.Boolean.FALSE, new r.a() { // from class: ug.g$$l
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.MovieTitleSegment.E0(com.tencent.maas.moviecomposing.segments.MovieTitleSegment.this, str, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        })).booleanValue();
    }

    @Override // ug.d
    public void j() {
        u(null, new r.a() { // from class: ug.g$$i
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                com.tencent.maas.moviecomposing.segments.MovieTitleSegment.A0(com.tencent.maas.moviecomposing.segments.MovieTitleSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
                return null;
            }
        });
    }

    @Override // ug.n
    public void k(final java.lang.String str, final java.lang.String str2) {
        u(null, new r.a() { // from class: ug.g$$d
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                com.tencent.maas.moviecomposing.segments.MovieTitleSegment.z0(com.tencent.maas.moviecomposing.segments.MovieTitleSegment.this, str, str2, (com.tencent.maas.moviecomposing.Timeline) obj);
                return null;
            }
        });
    }

    @Override // ug.d
    public boolean l() {
        return ((java.lang.Boolean) u(java.lang.Boolean.FALSE, new r.a() { // from class: ug.g$$k
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.MovieTitleSegment.G0(com.tencent.maas.moviecomposing.segments.MovieTitleSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        })).booleanValue();
    }
}
