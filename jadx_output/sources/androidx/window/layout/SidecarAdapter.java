package androidx.window.layout;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u001c\u0010\b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\tH\u0002J(\u0010\n\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bH\u0002J\u001a\u0010\f\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\rJ\u0018\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0011\u001a\u00020\u0006J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u0006\u0010\u0014\u001a\u00020\u0006¨\u0006\u0016"}, d2 = {"Landroidx/window/layout/SidecarAdapter;", "", "()V", "isEqualSidecarDeviceState", "", "first", "Landroidx/window/sidecar/SidecarDeviceState;", "second", "isEqualSidecarDisplayFeature", "Landroidx/window/sidecar/SidecarDisplayFeature;", "isEqualSidecarDisplayFeatures", "", "isEqualSidecarWindowLayoutInfo", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "translate", "Landroidx/window/layout/WindowLayoutInfo;", "extensionInfo", "state", "Landroidx/window/layout/DisplayFeature;", "sidecarDisplayFeatures", "deviceState", "Companion", "window_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes13.dex */
public final class SidecarAdapter {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.window.layout.SidecarAdapter.Companion INSTANCE = new androidx.window.layout.SidecarAdapter.Companion(null);
    private static final java.lang.String TAG = "SidecarAdapter";

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0007J\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\fH\u0007J!\u0010\u0018\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001b\u001a\n \u001a*\u0004\u0018\u00010\u00190\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Landroidx/window/layout/SidecarAdapter$Companion;", "", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "info", "", "Landroidx/window/sidecar/SidecarDisplayFeature;", "getSidecarDisplayFeatures", "displayFeatures", "Ljz5/f0;", "setSidecarDisplayFeatures", "Landroidx/window/sidecar/SidecarDeviceState;", "sidecarDeviceState", "", "getSidecarDevicePosture$window_release", "(Landroidx/window/sidecar/SidecarDeviceState;)I", "getSidecarDevicePosture", "getRawSidecarDevicePosture", "posture", "setSidecarDevicePosture", "feature", "deviceState", "Landroidx/window/layout/DisplayFeature;", "translate$window_release", "(Landroidx/window/sidecar/SidecarDisplayFeature;Landroidx/window/sidecar/SidecarDeviceState;)Landroidx/window/layout/DisplayFeature;", "translate", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "<init>", "()V", "window_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final int getRawSidecarDevicePosture(androidx.window.sidecar.SidecarDeviceState sidecarDeviceState) {
            kotlin.jvm.internal.o.g(sidecarDeviceState, "sidecarDeviceState");
            try {
                return sidecarDeviceState.posture;
            } catch (java.lang.NoSuchFieldError unused) {
                try {
                    java.lang.Object invoke = androidx.window.sidecar.SidecarDeviceState.class.getMethod("getPosture", new java.lang.Class[0]).invoke(sidecarDeviceState, new java.lang.Object[0]);
                    if (invoke != null) {
                        return ((java.lang.Integer) invoke).intValue();
                    }
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Int");
                } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused2) {
                    return 0;
                }
            }
        }

        public final int getSidecarDevicePosture$window_release(androidx.window.sidecar.SidecarDeviceState sidecarDeviceState) {
            kotlin.jvm.internal.o.g(sidecarDeviceState, "sidecarDeviceState");
            int rawSidecarDevicePosture = getRawSidecarDevicePosture(sidecarDeviceState);
            if (rawSidecarDevicePosture < 0 || rawSidecarDevicePosture > 4) {
                return 0;
            }
            return rawSidecarDevicePosture;
        }

        public final java.util.List<androidx.window.sidecar.SidecarDisplayFeature> getSidecarDisplayFeatures(androidx.window.sidecar.SidecarWindowLayoutInfo info) {
            kz5.p0 p0Var = kz5.p0.f313996d;
            kotlin.jvm.internal.o.g(info, "info");
            try {
                try {
                    java.util.List<androidx.window.sidecar.SidecarDisplayFeature> list = info.displayFeatures;
                    return list == null ? p0Var : list;
                } catch (java.lang.NoSuchFieldError unused) {
                    java.lang.Object invoke = androidx.window.sidecar.SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new java.lang.Class[0]).invoke(info, new java.lang.Object[0]);
                    if (invoke != null) {
                        return (java.util.List) invoke;
                    }
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                }
            } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused2) {
                return p0Var;
            }
        }

        public final void setSidecarDevicePosture(androidx.window.sidecar.SidecarDeviceState sidecarDeviceState, int i17) {
            kotlin.jvm.internal.o.g(sidecarDeviceState, "sidecarDeviceState");
            try {
                try {
                    sidecarDeviceState.posture = i17;
                } catch (java.lang.NoSuchFieldError unused) {
                    androidx.window.sidecar.SidecarDeviceState.class.getMethod("setPosture", java.lang.Integer.TYPE).invoke(sidecarDeviceState, java.lang.Integer.valueOf(i17));
                }
            } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused2) {
            }
        }

        public final void setSidecarDisplayFeatures(androidx.window.sidecar.SidecarWindowLayoutInfo info, java.util.List<androidx.window.sidecar.SidecarDisplayFeature> displayFeatures) {
            kotlin.jvm.internal.o.g(info, "info");
            kotlin.jvm.internal.o.g(displayFeatures, "displayFeatures");
            try {
                try {
                    info.displayFeatures = displayFeatures;
                } catch (java.lang.NoSuchFieldError unused) {
                    androidx.window.sidecar.SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", java.util.List.class).invoke(info, displayFeatures);
                }
            } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused2) {
            }
        }

        public final androidx.window.layout.DisplayFeature translate$window_release(androidx.window.sidecar.SidecarDisplayFeature feature, androidx.window.sidecar.SidecarDeviceState deviceState) {
            androidx.window.layout.HardwareFoldingFeature.Type fold;
            androidx.window.layout.FoldingFeature.State state;
            kotlin.jvm.internal.o.g(feature, "feature");
            kotlin.jvm.internal.o.g(deviceState, "deviceState");
            android.graphics.Rect rect = feature.getRect();
            kotlin.jvm.internal.o.f(rect, "feature.rect");
            if (rect.width() == 0 && rect.height() == 0) {
                return null;
            }
            if (feature.getType() == 1 && rect.width() != 0 && rect.height() != 0) {
                return null;
            }
            if ((feature.getType() == 2 || feature.getType() == 1) && rect.left != 0 && rect.top != 0) {
                return null;
            }
            int type = feature.getType();
            if (type == 1) {
                fold = androidx.window.layout.HardwareFoldingFeature.Type.INSTANCE.getFOLD();
            } else {
                if (type != 2) {
                    return null;
                }
                fold = androidx.window.layout.HardwareFoldingFeature.Type.INSTANCE.getHINGE();
            }
            int sidecarDevicePosture$window_release = getSidecarDevicePosture$window_release(deviceState);
            if (sidecarDevicePosture$window_release != 0 && sidecarDevicePosture$window_release != 1) {
                if (sidecarDevicePosture$window_release == 2) {
                    state = androidx.window.layout.FoldingFeature.State.HALF_OPENED;
                } else if (sidecarDevicePosture$window_release == 3) {
                    state = androidx.window.layout.FoldingFeature.State.FLAT;
                } else if (sidecarDevicePosture$window_release != 4) {
                    state = androidx.window.layout.FoldingFeature.State.FLAT;
                }
                android.graphics.Rect rect2 = feature.getRect();
                kotlin.jvm.internal.o.f(rect2, "feature.rect");
                return new androidx.window.layout.HardwareFoldingFeature(new androidx.window.core.Bounds(rect2), fold, state);
            }
            return null;
        }
    }

    private final boolean isEqualSidecarDisplayFeature(androidx.window.sidecar.SidecarDisplayFeature first, androidx.window.sidecar.SidecarDisplayFeature second) {
        if (kotlin.jvm.internal.o.b(first, second)) {
            return true;
        }
        if (first == null || second == null || first.getType() != second.getType()) {
            return false;
        }
        return kotlin.jvm.internal.o.b(first.getRect(), second.getRect());
    }

    private final boolean isEqualSidecarDisplayFeatures(java.util.List<androidx.window.sidecar.SidecarDisplayFeature> first, java.util.List<androidx.window.sidecar.SidecarDisplayFeature> second) {
        if (first == second) {
            return true;
        }
        if (first == null || second == null || first.size() != second.size()) {
            return false;
        }
        int size = first.size() - 1;
        if (size >= 0) {
            int i17 = 0;
            while (true) {
                int i18 = i17 + 1;
                if (!isEqualSidecarDisplayFeature(first.get(i17), second.get(i17))) {
                    return false;
                }
                if (i18 > size) {
                    break;
                }
                i17 = i18;
            }
        }
        return true;
    }

    public final boolean isEqualSidecarDeviceState(androidx.window.sidecar.SidecarDeviceState first, androidx.window.sidecar.SidecarDeviceState second) {
        if (kotlin.jvm.internal.o.b(first, second)) {
            return true;
        }
        if (first == null || second == null) {
            return false;
        }
        androidx.window.layout.SidecarAdapter.Companion companion = INSTANCE;
        return companion.getSidecarDevicePosture$window_release(first) == companion.getSidecarDevicePosture$window_release(second);
    }

    public final boolean isEqualSidecarWindowLayoutInfo(androidx.window.sidecar.SidecarWindowLayoutInfo first, androidx.window.sidecar.SidecarWindowLayoutInfo second) {
        if (kotlin.jvm.internal.o.b(first, second)) {
            return true;
        }
        if (first == null || second == null) {
            return false;
        }
        androidx.window.layout.SidecarAdapter.Companion companion = INSTANCE;
        return isEqualSidecarDisplayFeatures(companion.getSidecarDisplayFeatures(first), companion.getSidecarDisplayFeatures(second));
    }

    public final androidx.window.layout.WindowLayoutInfo translate(androidx.window.sidecar.SidecarWindowLayoutInfo extensionInfo, androidx.window.sidecar.SidecarDeviceState state) {
        kotlin.jvm.internal.o.g(state, "state");
        if (extensionInfo == null) {
            return new androidx.window.layout.WindowLayoutInfo(kz5.p0.f313996d);
        }
        androidx.window.sidecar.SidecarDeviceState sidecarDeviceState = new androidx.window.sidecar.SidecarDeviceState();
        androidx.window.layout.SidecarAdapter.Companion companion = INSTANCE;
        companion.setSidecarDevicePosture(sidecarDeviceState, companion.getSidecarDevicePosture$window_release(state));
        return new androidx.window.layout.WindowLayoutInfo(translate(companion.getSidecarDisplayFeatures(extensionInfo), sidecarDeviceState));
    }

    public final java.util.List<androidx.window.layout.DisplayFeature> translate(java.util.List<androidx.window.sidecar.SidecarDisplayFeature> sidecarDisplayFeatures, androidx.window.sidecar.SidecarDeviceState deviceState) {
        kotlin.jvm.internal.o.g(sidecarDisplayFeatures, "sidecarDisplayFeatures");
        kotlin.jvm.internal.o.g(deviceState, "deviceState");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = sidecarDisplayFeatures.iterator();
        while (it.hasNext()) {
            androidx.window.layout.DisplayFeature translate$window_release = INSTANCE.translate$window_release((androidx.window.sidecar.SidecarDisplayFeature) it.next(), deviceState);
            if (translate$window_release != null) {
                arrayList.add(translate$window_release);
            }
        }
        return arrayList;
    }
}
