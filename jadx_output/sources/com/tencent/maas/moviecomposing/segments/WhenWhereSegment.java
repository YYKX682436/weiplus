package com.tencent.maas.moviecomposing.segments;

/* loaded from: classes5.dex */
public class WhenWhereSegment extends com.tencent.maas.moviecomposing.segments.ElementSegment implements ug.d {
    public static java.lang.Long A0(com.tencent.maas.moviecomposing.segments.WhenWhereSegment whenWhereSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Long.valueOf(whenWhereSegment.nativeGetTimeStamp(timeline, whenWhereSegment.f48532a.value()));
    }

    public static java.lang.Boolean B0(com.tencent.maas.moviecomposing.segments.WhenWhereSegment whenWhereSegment, com.tencent.maas.moviecomposing.segments.GeographicInfo geographicInfo, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Boolean.valueOf(whenWhereSegment.nativeUpdateLocation(timeline, whenWhereSegment.f48532a.value(), geographicInfo));
    }

    public static com.tencent.maas.moviecomposing.segments.GeographicInfo C0(com.tencent.maas.moviecomposing.segments.WhenWhereSegment whenWhereSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        return whenWhereSegment.nativeGetGeographicInfo(timeline, whenWhereSegment.f48532a.value());
    }

    public static java.lang.Boolean D0(com.tencent.maas.moviecomposing.segments.WhenWhereSegment whenWhereSegment, long j17, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Boolean.valueOf(whenWhereSegment.nativeUpdateTimestamp(timeline, whenWhereSegment.f48532a.value(), j17));
    }

    public static java.lang.Boolean E0(com.tencent.maas.moviecomposing.segments.WhenWhereSegment whenWhereSegment, java.lang.String str, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Boolean.valueOf(whenWhereSegment.nativeUpdateStyle(timeline, whenWhereSegment.f48532a.value(), str));
    }

    public static com.tencent.maas.moviecomposing.e F0(com.tencent.maas.moviecomposing.segments.WhenWhereSegment whenWhereSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        int nativeGetDateTimeDisplayOptions = whenWhereSegment.nativeGetDateTimeDisplayOptions(timeline, whenWhereSegment.f48532a.value());
        return new com.tencent.maas.moviecomposing.e((nativeGetDateTimeDisplayOptions & 1) != 0, (nativeGetDateTimeDisplayOptions & 2) != 0, (nativeGetDateTimeDisplayOptions & 4) != 0, (nativeGetDateTimeDisplayOptions & 8) != 0, (nativeGetDateTimeDisplayOptions & 16) != 0, (nativeGetDateTimeDisplayOptions & 32) != 0);
    }

    public static java.lang.String G0(com.tencent.maas.moviecomposing.segments.WhenWhereSegment whenWhereSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        java.lang.String nativeGetMaterialID = whenWhereSegment.nativeGetMaterialID(timeline, whenWhereSegment.f48532a.value());
        return nativeGetMaterialID == null ? "" : nativeGetMaterialID;
    }

    private native void nativeEnterEditingState(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native int nativeGetDateTimeDisplayOptions(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native com.tencent.maas.moviecomposing.segments.GeographicInfo nativeGetGeographicInfo(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetMaterialID(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native long nativeGetTimeStamp(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native boolean nativeIsDisplayingDateTime(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native boolean nativeIsDisplayingLocation(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native boolean nativeIsEditingState(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native void nativeLeaveEditingState(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native boolean nativeUpdateLocation(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, com.tencent.maas.moviecomposing.segments.GeographicInfo geographicInfo);

    private native boolean nativeUpdateStyle(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, java.lang.String str2);

    private native boolean nativeUpdateTimestamp(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, long j17);

    public static java.lang.Boolean v0(com.tencent.maas.moviecomposing.segments.WhenWhereSegment whenWhereSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Boolean.valueOf(whenWhereSegment.nativeIsDisplayingDateTime(timeline, whenWhereSegment.f48532a.value()));
    }

    public static java.lang.Object w0(com.tencent.maas.moviecomposing.segments.WhenWhereSegment whenWhereSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        whenWhereSegment.nativeLeaveEditingState(timeline, whenWhereSegment.f48532a.value());
        return null;
    }

    public static java.lang.Object x0(com.tencent.maas.moviecomposing.segments.WhenWhereSegment whenWhereSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        whenWhereSegment.nativeEnterEditingState(timeline, whenWhereSegment.f48532a.value());
        return null;
    }

    public static java.lang.Boolean y0(com.tencent.maas.moviecomposing.segments.WhenWhereSegment whenWhereSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Boolean.valueOf(whenWhereSegment.nativeIsEditingState(timeline, whenWhereSegment.f48532a.value()));
    }

    public static java.lang.Boolean z0(com.tencent.maas.moviecomposing.segments.WhenWhereSegment whenWhereSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Boolean.valueOf(whenWhereSegment.nativeIsDisplayingLocation(timeline, whenWhereSegment.f48532a.value()));
    }

    public com.tencent.maas.moviecomposing.segments.GeographicInfo H0() {
        return (com.tencent.maas.moviecomposing.segments.GeographicInfo) u(null, new r.a() { // from class: ug.q$$c
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.WhenWhereSegment.C0(com.tencent.maas.moviecomposing.segments.WhenWhereSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        });
    }

    public long I0() {
        return ((java.lang.Long) u(0L, new r.a() { // from class: ug.q$$b
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.WhenWhereSegment.A0(com.tencent.maas.moviecomposing.segments.WhenWhereSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        })).longValue();
    }

    @Override // ug.d
    public void a() {
        u(null, new r.a() { // from class: ug.q$$e
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                com.tencent.maas.moviecomposing.segments.WhenWhereSegment.x0(com.tencent.maas.moviecomposing.segments.WhenWhereSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
                return null;
            }
        });
    }

    @Override // ug.d
    public void j() {
        u(null, new r.a() { // from class: ug.q$$d
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                com.tencent.maas.moviecomposing.segments.WhenWhereSegment.w0(com.tencent.maas.moviecomposing.segments.WhenWhereSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
                return null;
            }
        });
    }

    @Override // ug.d
    public boolean l() {
        return ((java.lang.Boolean) u(java.lang.Boolean.FALSE, new r.a() { // from class: ug.q$$a
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.WhenWhereSegment.y0(com.tencent.maas.moviecomposing.segments.WhenWhereSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        })).booleanValue();
    }
}
