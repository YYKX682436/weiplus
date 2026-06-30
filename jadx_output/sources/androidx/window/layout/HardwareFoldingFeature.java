package androidx.window.layout;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000 #2\u00020\u0001:\u0002#$B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0013\u0010\u001c\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\"H\u0016R\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006%"}, d2 = {"Landroidx/window/layout/HardwareFoldingFeature;", "Landroidx/window/layout/FoldingFeature;", "featureBounds", "Landroidx/window/core/Bounds;", "type", "Landroidx/window/layout/HardwareFoldingFeature$Type;", "state", "Landroidx/window/layout/FoldingFeature$State;", "(Landroidx/window/core/Bounds;Landroidx/window/layout/HardwareFoldingFeature$Type;Landroidx/window/layout/FoldingFeature$State;)V", "bounds", "Landroid/graphics/Rect;", "getBounds", "()Landroid/graphics/Rect;", "isSeparating", "", "()Z", "occlusionType", "Landroidx/window/layout/FoldingFeature$OcclusionType;", "getOcclusionType", "()Landroidx/window/layout/FoldingFeature$OcclusionType;", "orientation", "Landroidx/window/layout/FoldingFeature$Orientation;", "getOrientation", "()Landroidx/window/layout/FoldingFeature$Orientation;", "getState", "()Landroidx/window/layout/FoldingFeature$State;", "getType$window_release", "()Landroidx/window/layout/HardwareFoldingFeature$Type;", "equals", "other", "", "hashCode", "", "toString", "", "Companion", "Type", "window_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes13.dex */
public final class HardwareFoldingFeature implements androidx.window.layout.FoldingFeature {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.window.layout.HardwareFoldingFeature.Companion INSTANCE = new androidx.window.layout.HardwareFoldingFeature.Companion(null);
    private final androidx.window.core.Bounds featureBounds;
    private final androidx.window.layout.FoldingFeature.State state;
    private final androidx.window.layout.HardwareFoldingFeature.Type type;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/window/layout/HardwareFoldingFeature$Companion;", "", "Landroidx/window/core/Bounds;", "bounds", "Ljz5/f0;", "validateFeatureBounds$window_release", "(Landroidx/window/core/Bounds;)V", "validateFeatureBounds", "<init>", "()V", "window_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final void validateFeatureBounds$window_release(androidx.window.core.Bounds bounds) {
            kotlin.jvm.internal.o.g(bounds, "bounds");
            if (!((bounds.getWidth() == 0 && bounds.getHeight() == 0) ? false : true)) {
                throw new java.lang.IllegalArgumentException("Bounds must be non zero".toString());
            }
            if (!(bounds.getLeft() == 0 || bounds.getTop() == 0)) {
                throw new java.lang.IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features".toString());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Landroidx/window/layout/HardwareFoldingFeature$Type;", "", "description", "", "(Ljava/lang/String;)V", "toString", "Companion", "window_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Type {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.window.layout.HardwareFoldingFeature.Type.Companion INSTANCE = new androidx.window.layout.HardwareFoldingFeature.Type.Companion(null);
        private static final androidx.window.layout.HardwareFoldingFeature.Type FOLD = new androidx.window.layout.HardwareFoldingFeature.Type("FOLD");
        private static final androidx.window.layout.HardwareFoldingFeature.Type HINGE = new androidx.window.layout.HardwareFoldingFeature.Type("HINGE");
        private final java.lang.String description;

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/window/layout/HardwareFoldingFeature$Type$Companion;", "", "()V", "FOLD", "Landroidx/window/layout/HardwareFoldingFeature$Type;", "getFOLD", "()Landroidx/window/layout/HardwareFoldingFeature$Type;", "HINGE", "getHINGE", "window_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* loaded from: classes13.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
                this();
            }

            public final androidx.window.layout.HardwareFoldingFeature.Type getFOLD() {
                return androidx.window.layout.HardwareFoldingFeature.Type.FOLD;
            }

            public final androidx.window.layout.HardwareFoldingFeature.Type getHINGE() {
                return androidx.window.layout.HardwareFoldingFeature.Type.HINGE;
            }
        }

        private Type(java.lang.String str) {
            this.description = str;
        }

        /* renamed from: toString, reason: from getter */
        public java.lang.String getDescription() {
            return this.description;
        }
    }

    public HardwareFoldingFeature(androidx.window.core.Bounds featureBounds, androidx.window.layout.HardwareFoldingFeature.Type type, androidx.window.layout.FoldingFeature.State state) {
        kotlin.jvm.internal.o.g(featureBounds, "featureBounds");
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(state, "state");
        this.featureBounds = featureBounds;
        this.type = type;
        this.state = state;
        INSTANCE.validateFeatureBounds$window_release(featureBounds);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.o.b(androidx.window.layout.HardwareFoldingFeature.class, other == null ? null : other.getClass())) {
            return false;
        }
        if (other == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        }
        androidx.window.layout.HardwareFoldingFeature hardwareFoldingFeature = (androidx.window.layout.HardwareFoldingFeature) other;
        return kotlin.jvm.internal.o.b(this.featureBounds, hardwareFoldingFeature.featureBounds) && kotlin.jvm.internal.o.b(this.type, hardwareFoldingFeature.type) && kotlin.jvm.internal.o.b(getState(), hardwareFoldingFeature.getState());
    }

    @Override // androidx.window.layout.DisplayFeature
    public android.graphics.Rect getBounds() {
        return this.featureBounds.toRect();
    }

    @Override // androidx.window.layout.FoldingFeature
    public androidx.window.layout.FoldingFeature.OcclusionType getOcclusionType() {
        return (this.featureBounds.getWidth() == 0 || this.featureBounds.getHeight() == 0) ? androidx.window.layout.FoldingFeature.OcclusionType.NONE : androidx.window.layout.FoldingFeature.OcclusionType.FULL;
    }

    @Override // androidx.window.layout.FoldingFeature
    public androidx.window.layout.FoldingFeature.Orientation getOrientation() {
        return this.featureBounds.getWidth() > this.featureBounds.getHeight() ? androidx.window.layout.FoldingFeature.Orientation.HORIZONTAL : androidx.window.layout.FoldingFeature.Orientation.VERTICAL;
    }

    @Override // androidx.window.layout.FoldingFeature
    public androidx.window.layout.FoldingFeature.State getState() {
        return this.state;
    }

    /* renamed from: getType$window_release, reason: from getter */
    public final androidx.window.layout.HardwareFoldingFeature.Type getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.featureBounds.hashCode() * 31) + this.type.hashCode()) * 31) + getState().hashCode();
    }

    @Override // androidx.window.layout.FoldingFeature
    public boolean isSeparating() {
        androidx.window.layout.HardwareFoldingFeature.Type type = this.type;
        androidx.window.layout.HardwareFoldingFeature.Type.Companion companion = androidx.window.layout.HardwareFoldingFeature.Type.INSTANCE;
        if (kotlin.jvm.internal.o.b(type, companion.getHINGE())) {
            return true;
        }
        return kotlin.jvm.internal.o.b(this.type, companion.getFOLD()) && kotlin.jvm.internal.o.b(getState(), androidx.window.layout.FoldingFeature.State.HALF_OPENED);
    }

    public java.lang.String toString() {
        return "HardwareFoldingFeature { " + this.featureBounds + ", type=" + this.type + ", state=" + getState() + " }";
    }
}
