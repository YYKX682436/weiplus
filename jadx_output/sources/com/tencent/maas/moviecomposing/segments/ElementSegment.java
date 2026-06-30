package com.tencent.maas.moviecomposing.segments;

/* loaded from: classes5.dex */
public class ElementSegment extends com.tencent.maas.moviecomposing.segments.Segment {

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.maas.model.time.MJTime f48524c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.maas.model.time.MJTime f48525d;

    public ElementSegment(java.lang.String str, com.tencent.maas.moviecomposing.Timeline timeline) {
        super(str, timeline);
        this.f48524c = timeline.f48416c;
        this.f48525d = timeline.f48415b;
    }

    public static android.graphics.PointF E(com.tencent.maas.moviecomposing.segments.ElementSegment elementSegment, android.graphics.PointF pointF, com.tencent.maas.moviecomposing.Timeline timeline) {
        com.tencent.maas.base.Vec2 nativeGetLayerNormalizedPosition = elementSegment.nativeGetLayerNormalizedPosition(timeline, elementSegment.f48532a.value());
        return nativeGetLayerNormalizedPosition == null ? pointF : new android.graphics.PointF(nativeGetLayerNormalizedPosition.f47799x, nativeGetLayerNormalizedPosition.f47800y);
    }

    public static android.graphics.PointF F(com.tencent.maas.moviecomposing.segments.ElementSegment elementSegment, android.graphics.PointF pointF, com.tencent.maas.moviecomposing.Timeline timeline) {
        com.tencent.maas.base.Vec2 nativeGetLayerPosition = elementSegment.nativeGetLayerPosition(timeline, elementSegment.f48532a.value());
        return nativeGetLayerPosition == null ? pointF : new android.graphics.PointF(nativeGetLayerPosition.f47799x, nativeGetLayerPosition.f47800y);
    }

    public static java.lang.Boolean G(com.tencent.maas.moviecomposing.segments.ElementSegment elementSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Boolean.valueOf(elementSegment.nativeGetIsTailExpandable(timeline, elementSegment.f48532a.value()));
    }

    public static java.lang.Boolean H(com.tencent.maas.moviecomposing.segments.ElementSegment elementSegment, com.tencent.maas.model.time.MJTime mJTime, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Boolean.valueOf(elementSegment.nativeSetStartTimeKeepingDuration(timeline, elementSegment.f48532a.value(), mJTime));
    }

    public static java.lang.Boolean I(com.tencent.maas.moviecomposing.segments.ElementSegment elementSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Boolean.valueOf(elementSegment.nativeIsLayerSpatialAdjustable(timeline, elementSegment.f48532a.value()));
    }

    public static java.lang.Object J(com.tencent.maas.moviecomposing.segments.ElementSegment elementSegment, float f17, com.tencent.maas.moviecomposing.Timeline timeline) {
        elementSegment.nativeSetLayerRotation(timeline, elementSegment.f48532a.value(), f17);
        return null;
    }

    public static com.tencent.maas.model.time.MJTime K(com.tencent.maas.moviecomposing.segments.ElementSegment elementSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        com.tencent.maas.model.time.MJTime nativeGetTotalDurationIncludingExpandable = elementSegment.nativeGetTotalDurationIncludingExpandable(timeline, elementSegment.f48532a.value());
        return nativeGetTotalDurationIncludingExpandable == null ? com.tencent.maas.model.time.MJTime.ZeroTime : nativeGetTotalDurationIncludingExpandable;
    }

    public static android.graphics.PointF L(com.tencent.maas.moviecomposing.segments.ElementSegment elementSegment, android.graphics.PointF pointF, com.tencent.maas.moviecomposing.Timeline timeline) {
        com.tencent.maas.base.Vec2 nativeGetLayerScale = elementSegment.nativeGetLayerScale(timeline, elementSegment.f48532a.value());
        return nativeGetLayerScale == null ? pointF : new android.graphics.PointF(nativeGetLayerScale.f47799x, nativeGetLayerScale.f47800y);
    }

    public static java.lang.Object M(com.tencent.maas.moviecomposing.segments.ElementSegment elementSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        elementSegment.nativeEnableBuiltinAnim(timeline, elementSegment.f48532a.value());
        return null;
    }

    public static com.tencent.maas.base.MJID N(com.tencent.maas.moviecomposing.segments.ElementSegment elementSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        return com.tencent.maas.base.MJID.of(elementSegment.nativeGetContentDescSegmentID(timeline, elementSegment.f48532a.value()));
    }

    public static java.lang.Object O(com.tencent.maas.moviecomposing.segments.ElementSegment elementSegment, android.graphics.PointF pointF, com.tencent.maas.moviecomposing.Timeline timeline) {
        elementSegment.nativeSetLayerScale(timeline, elementSegment.f48532a.value(), new com.tencent.maas.base.Vec2(pointF.x, pointF.y));
        return null;
    }

    public static java.lang.Object P(com.tencent.maas.moviecomposing.segments.ElementSegment elementSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        elementSegment.nativeClearCompoAnim(timeline, elementSegment.f48532a.value());
        return null;
    }

    public static com.tencent.maas.model.time.MJTime Q(com.tencent.maas.moviecomposing.segments.ElementSegment elementSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        com.tencent.maas.model.time.MJTime nativeGetTransInDuration = elementSegment.nativeGetTransInDuration(timeline, elementSegment.f48532a.value());
        return nativeGetTransInDuration == null ? com.tencent.maas.model.time.MJTime.ZeroTime : nativeGetTransInDuration;
    }

    public static java.lang.String R(com.tencent.maas.moviecomposing.segments.ElementSegment elementSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        return elementSegment.nativeGetAnimPresetID(timeline, elementSegment.f48532a.value());
    }

    public static java.lang.Object S(com.tencent.maas.moviecomposing.segments.ElementSegment elementSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        elementSegment.nativeDisableBuiltinAnim(timeline, elementSegment.f48532a.value());
        return null;
    }

    public static com.tencent.maas.model.time.MJTime T(com.tencent.maas.moviecomposing.segments.ElementSegment elementSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        com.tencent.maas.model.time.MJTime nativeGetMainPartDuration = elementSegment.nativeGetMainPartDuration(timeline, elementSegment.f48532a.value());
        return nativeGetMainPartDuration == null ? com.tencent.maas.model.time.MJTime.ZeroTime : nativeGetMainPartDuration;
    }

    public static java.lang.Object U(com.tencent.maas.moviecomposing.segments.ElementSegment elementSegment, com.tencent.maas.model.time.MJTime mJTime, com.tencent.maas.moviecomposing.Timeline timeline) {
        elementSegment.getClass();
        com.tencent.maas.model.time.MJTime max = com.tencent.maas.model.time.MJTime.max(mJTime, (com.tencent.maas.model.time.MJTime) elementSegment.u(elementSegment.f48524c, new ug.e$$g(elementSegment)));
        if (max.equalsTo(elementSegment.w())) {
            return null;
        }
        elementSegment.nativeSetDurationByChangingStartTime(timeline, elementSegment.f48532a.value(), max);
        return null;
    }

    public static com.tencent.maas.model.time.MJTimeRange V(com.tencent.maas.moviecomposing.segments.ElementSegment elementSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        com.tencent.maas.model.time.MJTimeRange nativeGetMainPartTimeRange = elementSegment.nativeGetMainPartTimeRange(timeline, elementSegment.f48532a.value());
        return nativeGetMainPartTimeRange == null ? com.tencent.maas.model.time.MJTimeRange.ZeroTimeRange : nativeGetMainPartTimeRange;
    }

    public static java.lang.Object W(com.tencent.maas.moviecomposing.segments.ElementSegment elementSegment, com.tencent.maas.model.time.MJTime mJTime, com.tencent.maas.moviecomposing.Timeline timeline) {
        elementSegment.getClass();
        com.tencent.maas.model.time.MJTime max = com.tencent.maas.model.time.MJTime.max(mJTime, (com.tencent.maas.model.time.MJTime) elementSegment.u(elementSegment.f48524c, new ug.e$$g(elementSegment)));
        if (max.equalsTo(elementSegment.w())) {
            return null;
        }
        elementSegment.nativeSetDurationByChangingEndTime(timeline, elementSegment.f48532a.value(), max);
        return null;
    }

    public static com.tencent.maas.model.time.MJTime X(com.tencent.maas.moviecomposing.segments.ElementSegment elementSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        com.tencent.maas.model.time.MJTime nativeGetTailExpandableDuration = elementSegment.nativeGetTailExpandableDuration(timeline, elementSegment.f48532a.value());
        return nativeGetTailExpandableDuration == null ? com.tencent.maas.model.time.MJTime.ZeroTime : nativeGetTailExpandableDuration;
    }

    public static java.lang.Boolean Y(com.tencent.maas.moviecomposing.segments.ElementSegment elementSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Boolean.valueOf(elementSegment.nativeHasContentDescSegment(timeline, elementSegment.f48532a.value()));
    }

    public static java.lang.Object Z(com.tencent.maas.moviecomposing.segments.ElementSegment elementSegment, android.graphics.PointF pointF, com.tencent.maas.moviecomposing.Timeline timeline) {
        elementSegment.nativeSetLayerPosition(timeline, elementSegment.f48532a.value(), new com.tencent.maas.base.Vec2(pointF.x, pointF.y));
        return null;
    }

    public static java.lang.Boolean a0(com.tencent.maas.moviecomposing.segments.ElementSegment elementSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Boolean.valueOf(elementSegment.nativeIsBuiltinAnimEnabled(timeline, elementSegment.f48532a.value()));
    }

    public static com.tencent.maas.model.time.MJTime b0(com.tencent.maas.moviecomposing.segments.ElementSegment elementSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        com.tencent.maas.model.time.MJTime nativeGetTransOutDuration = elementSegment.nativeGetTransOutDuration(timeline, elementSegment.f48532a.value());
        return nativeGetTransOutDuration == null ? com.tencent.maas.model.time.MJTime.ZeroTime : nativeGetTransOutDuration;
    }

    public static java.lang.Object c0(com.tencent.maas.moviecomposing.segments.ElementSegment elementSegment, java.lang.String str, com.tencent.maas.moviecomposing.Timeline timeline) {
        elementSegment.nativeSetAnimPresetID(timeline, elementSegment.f48532a.value(), str);
        return null;
    }

    public static java.lang.Float d0(com.tencent.maas.moviecomposing.segments.ElementSegment elementSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Float.valueOf(elementSegment.nativeGetLayerRotation(timeline, elementSegment.f48532a.value()));
    }

    public static java.lang.Boolean e0(com.tencent.maas.moviecomposing.segments.ElementSegment elementSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Boolean.valueOf(elementSegment.nativeGetIsHeadExpandable(timeline, elementSegment.f48532a.value()));
    }

    public static com.tencent.maas.model.time.MJTime f0(com.tencent.maas.moviecomposing.segments.ElementSegment elementSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        com.tencent.maas.model.time.MJTime nativeGetHeadExpandableDuration = elementSegment.nativeGetHeadExpandableDuration(timeline, elementSegment.f48532a.value());
        return nativeGetHeadExpandableDuration == null ? com.tencent.maas.model.time.MJTime.ZeroTime : nativeGetHeadExpandableDuration;
    }

    private native void nativeClearCompoAnim(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native void nativeDisableBuiltinAnim(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native void nativeEnableBuiltinAnim(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetAnimPresetID(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetContentDescSegmentID(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native com.tencent.maas.model.time.MJTime nativeGetHeadExpandableDuration(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native boolean nativeGetIsHeadExpandable(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native boolean nativeGetIsTailExpandable(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native com.tencent.maas.base.Vec2 nativeGetLayerAnchorPoint(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native com.tencent.maas.base.Vec2 nativeGetLayerNormalizedPosition(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native com.tencent.maas.base.Vec2 nativeGetLayerPosition(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native float nativeGetLayerRotation(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native com.tencent.maas.base.Vec2 nativeGetLayerScale(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native com.tencent.maas.model.time.MJTime nativeGetMainPartDuration(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native com.tencent.maas.model.time.MJTime nativeGetMainPartStartTime(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native com.tencent.maas.model.time.MJTimeRange nativeGetMainPartTimeRange(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native com.tencent.maas.model.time.MJTime nativeGetTailExpandableDuration(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native com.tencent.maas.model.time.MJTime nativeGetTotalDurationIncludingExpandable(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native com.tencent.maas.model.time.MJTime nativeGetTransInDuration(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native com.tencent.maas.model.time.MJTime nativeGetTransOutDuration(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native boolean nativeHasContentDescSegment(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native boolean nativeIsBuiltinAnimEnabled(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native boolean nativeIsLayerSpatialAdjustable(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native void nativeSetAnimPresetID(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, java.lang.String str2);

    private native void nativeSetDurationByChangingEndTime(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, com.tencent.maas.model.time.MJTime mJTime);

    private native void nativeSetDurationByChangingStartTime(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, com.tencent.maas.model.time.MJTime mJTime);

    private native void nativeSetLayerAnchorPoint(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, com.tencent.maas.base.Vec2 vec2);

    private native void nativeSetLayerNormalizedPosition(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, com.tencent.maas.base.Vec2 vec2);

    private native void nativeSetLayerPosition(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, com.tencent.maas.base.Vec2 vec2);

    private native void nativeSetLayerRotation(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, float f17);

    private native void nativeSetLayerScale(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, com.tencent.maas.base.Vec2 vec2);

    private native boolean nativeSetStartTimeKeepingDuration(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, com.tencent.maas.model.time.MJTime mJTime);

    public java.lang.String g0() {
        return (java.lang.String) u(null, new r.a() { // from class: ug.e$$p
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.ElementSegment.R(com.tencent.maas.moviecomposing.segments.ElementSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        });
    }

    public com.tencent.maas.moviecomposing.segments.ContentDescSegment h0() {
        return (com.tencent.maas.moviecomposing.segments.ContentDescSegment) u(null, new r.a() { // from class: ug.e$$a
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                com.tencent.maas.moviecomposing.Timeline timeline = (com.tencent.maas.moviecomposing.Timeline) obj;
                com.tencent.maas.moviecomposing.segments.ElementSegment elementSegment = com.tencent.maas.moviecomposing.segments.ElementSegment.this;
                elementSegment.getClass();
                com.tencent.maas.moviecomposing.Timeline D = elementSegment.D();
                return (com.tencent.maas.moviecomposing.segments.ContentDescSegment) timeline.m(D != null ? com.tencent.maas.moviecomposing.segments.ElementSegment.N(elementSegment, D) : null);
            }
        });
    }

    public com.tencent.maas.model.time.MJTime i0() {
        return (com.tencent.maas.model.time.MJTime) u(com.tencent.maas.model.time.MJTime.ZeroTime, new r.a() { // from class: ug.e$$i
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.ElementSegment.f0(com.tencent.maas.moviecomposing.segments.ElementSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        });
    }

    public boolean j0() {
        return ((java.lang.Boolean) u(java.lang.Boolean.FALSE, new r.a() { // from class: ug.e$$b
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.ElementSegment.e0(com.tencent.maas.moviecomposing.segments.ElementSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        })).booleanValue();
    }

    public boolean k0() {
        return ((java.lang.Boolean) u(java.lang.Boolean.FALSE, new r.a() { // from class: ug.e$$n
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.ElementSegment.G(com.tencent.maas.moviecomposing.segments.ElementSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        })).booleanValue();
    }

    public android.graphics.PointF l0() {
        final android.graphics.PointF pointF = new android.graphics.PointF(0.0f, 0.0f);
        return (android.graphics.PointF) u(pointF, new r.a() { // from class: ug.e$$e
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.ElementSegment.E(com.tencent.maas.moviecomposing.segments.ElementSegment.this, pointF, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        });
    }

    public android.graphics.PointF m0() {
        final android.graphics.PointF pointF = new android.graphics.PointF(0.0f, 0.0f);
        return (android.graphics.PointF) u(pointF, new r.a() { // from class: ug.e$$o
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.ElementSegment.F(com.tencent.maas.moviecomposing.segments.ElementSegment.this, pointF, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        });
    }

    public float n0() {
        return ((java.lang.Float) u(java.lang.Float.valueOf(0.0f), new r.a() { // from class: ug.e$$k
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.ElementSegment.d0(com.tencent.maas.moviecomposing.segments.ElementSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        })).floatValue();
    }

    public android.graphics.PointF o0() {
        final android.graphics.PointF pointF = new android.graphics.PointF(0.0f, 0.0f);
        return (android.graphics.PointF) u(pointF, new r.a() { // from class: ug.e$$m
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.ElementSegment.L(com.tencent.maas.moviecomposing.segments.ElementSegment.this, pointF, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        });
    }

    public com.tencent.maas.model.time.MJTime p0() {
        return (com.tencent.maas.model.time.MJTime) u(com.tencent.maas.model.time.MJTime.ZeroTime, new r.a() { // from class: ug.e$$l
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.ElementSegment.K(com.tencent.maas.moviecomposing.segments.ElementSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        });
    }

    public boolean q0() {
        return ((java.lang.Boolean) u(java.lang.Boolean.FALSE, new r.a() { // from class: ug.e$$h
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.ElementSegment.I(com.tencent.maas.moviecomposing.segments.ElementSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        })).booleanValue();
    }

    public void r0(final com.tencent.maas.model.time.MJTime mJTime) {
        if (mJTime.isNumeric()) {
            u(null, new r.a() { // from class: ug.e$$c
                @Override // r.a
                public final java.lang.Object apply(java.lang.Object obj) {
                    com.tencent.maas.moviecomposing.segments.ElementSegment.W(com.tencent.maas.moviecomposing.segments.ElementSegment.this, mJTime, (com.tencent.maas.moviecomposing.Timeline) obj);
                    return null;
                }
            });
        }
    }

    public void s0(final com.tencent.maas.model.time.MJTime mJTime) {
        if (mJTime.isNumeric()) {
            u(null, new r.a() { // from class: ug.e$$f
                @Override // r.a
                public final java.lang.Object apply(java.lang.Object obj) {
                    com.tencent.maas.moviecomposing.segments.ElementSegment.U(com.tencent.maas.moviecomposing.segments.ElementSegment.this, mJTime, (com.tencent.maas.moviecomposing.Timeline) obj);
                    return null;
                }
            });
        }
    }

    public void t0(final android.graphics.PointF pointF) {
        u(null, new r.a() { // from class: ug.e$$d
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                com.tencent.maas.moviecomposing.segments.ElementSegment.O(com.tencent.maas.moviecomposing.segments.ElementSegment.this, pointF, (com.tencent.maas.moviecomposing.Timeline) obj);
                return null;
            }
        });
    }

    public boolean u0(final com.tencent.maas.model.time.MJTime mJTime) {
        if (mJTime.isNumeric()) {
            return ((java.lang.Boolean) u(java.lang.Boolean.FALSE, new r.a() { // from class: ug.e$$j
                @Override // r.a
                public final java.lang.Object apply(java.lang.Object obj) {
                    return com.tencent.maas.moviecomposing.segments.ElementSegment.H(com.tencent.maas.moviecomposing.segments.ElementSegment.this, mJTime, (com.tencent.maas.moviecomposing.Timeline) obj);
                }
            })).booleanValue();
        }
        return false;
    }
}
