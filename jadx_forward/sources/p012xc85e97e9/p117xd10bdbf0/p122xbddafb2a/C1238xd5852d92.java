package p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u001c\u0010\b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\tH\u0002J(\u0010\n\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bH\u0002J\u001a\u0010\f\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\rJ\u0018\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0011\u001a\u00020\u0006J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u0006\u0010\u0014\u001a\u00020\u0006¨\u0006\u0016"}, d2 = {"Landroidx/window/layout/SidecarAdapter;", "", "()V", "isEqualSidecarDeviceState", "", "first", "Landroidx/window/sidecar/SidecarDeviceState;", "second", "isEqualSidecarDisplayFeature", "Landroidx/window/sidecar/SidecarDisplayFeature;", "isEqualSidecarDisplayFeatures", "", "isEqualSidecarWindowLayoutInfo", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "translate", "Landroidx/window/layout/WindowLayoutInfo;", "extensionInfo", "state", "Landroidx/window/layout/DisplayFeature;", "sidecarDisplayFeatures", "deviceState", "Companion", "window_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: androidx.window.layout.SidecarAdapter */
/* loaded from: classes13.dex */
public final class C1238xd5852d92 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1238xd5852d92.Companion INSTANCE = new p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1238xd5852d92.Companion(null);
    private static final java.lang.String TAG = "SidecarAdapter";

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0007J\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\fH\u0007J!\u0010\u0018\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001b\u001a\n \u001a*\u0004\u0018\u00010\u00190\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Landroidx/window/layout/SidecarAdapter$Companion;", "", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "info", "", "Landroidx/window/sidecar/SidecarDisplayFeature;", "getSidecarDisplayFeatures", "displayFeatures", "Ljz5/f0;", "setSidecarDisplayFeatures", "Landroidx/window/sidecar/SidecarDeviceState;", "sidecarDeviceState", "", "getSidecarDevicePosture$window_release", "(Landroidx/window/sidecar/SidecarDeviceState;)I", "getSidecarDevicePosture", "getRawSidecarDevicePosture", "posture", "setSidecarDevicePosture", "feature", "deviceState", "Landroidx/window/layout/DisplayFeature;", "translate$window_release", "(Landroidx/window/sidecar/SidecarDisplayFeature;Landroidx/window/sidecar/SidecarDeviceState;)Landroidx/window/layout/DisplayFeature;", "translate", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "<init>", "()V", "window_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: androidx.window.layout.SidecarAdapter$Companion, reason: from kotlin metadata */
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
            this();
        }

        /* renamed from: getRawSidecarDevicePosture */
        public final int m8579x702abd87(androidx.window.sidecar.SidecarDeviceState sidecarDeviceState) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sidecarDeviceState, "sidecarDeviceState");
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

        /* renamed from: getSidecarDevicePosture$window_release */
        public final int m8580x12db6e91(androidx.window.sidecar.SidecarDeviceState sidecarDeviceState) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sidecarDeviceState, "sidecarDeviceState");
            int m8579x702abd87 = m8579x702abd87(sidecarDeviceState);
            if (m8579x702abd87 < 0 || m8579x702abd87 > 4) {
                return 0;
            }
            return m8579x702abd87;
        }

        /* renamed from: getSidecarDisplayFeatures */
        public final java.util.List<androidx.window.sidecar.SidecarDisplayFeature> m8581x15cde138(androidx.window.sidecar.SidecarWindowLayoutInfo info) {
            kz5.p0 p0Var = kz5.p0.f395529d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
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

        /* renamed from: setSidecarDevicePosture */
        public final void m8582xdea7f8f7(androidx.window.sidecar.SidecarDeviceState sidecarDeviceState, int i17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sidecarDeviceState, "sidecarDeviceState");
            try {
                try {
                    sidecarDeviceState.posture = i17;
                } catch (java.lang.NoSuchFieldError unused) {
                    androidx.window.sidecar.SidecarDeviceState.class.getMethod("setPosture", java.lang.Integer.TYPE).invoke(sidecarDeviceState, java.lang.Integer.valueOf(i17));
                }
            } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused2) {
            }
        }

        /* renamed from: setSidecarDisplayFeatures */
        public final void m8583x48117d44(androidx.window.sidecar.SidecarWindowLayoutInfo info, java.util.List<androidx.window.sidecar.SidecarDisplayFeature> displayFeatures) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(displayFeatures, "displayFeatures");
            try {
                try {
                    info.displayFeatures = displayFeatures;
                } catch (java.lang.NoSuchFieldError unused) {
                    androidx.window.sidecar.SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", java.util.List.class).invoke(info, displayFeatures);
                }
            } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused2) {
            }
        }

        /* renamed from: translate$window_release */
        public final p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1231xeab5c7f4 m8584x72534ce(androidx.window.sidecar.SidecarDisplayFeature feature, androidx.window.sidecar.SidecarDeviceState deviceState) {
            p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1237x609bdf9d.Type m8569xfb7ef857;
            p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1236x71b7c395.State state;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feature, "feature");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceState, "deviceState");
            android.graphics.Rect rect = feature.getRect();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(rect, "feature.rect");
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
                m8569xfb7ef857 = p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1237x609bdf9d.Type.INSTANCE.m8569xfb7ef857();
            } else {
                if (type != 2) {
                    return null;
                }
                m8569xfb7ef857 = p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1237x609bdf9d.Type.INSTANCE.m8570x74798f75();
            }
            int m8580x12db6e91 = m8580x12db6e91(deviceState);
            if (m8580x12db6e91 != 0 && m8580x12db6e91 != 1) {
                if (m8580x12db6e91 == 2) {
                    state = p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1236x71b7c395.State.f3882x7fa1f1f5;
                } else if (m8580x12db6e91 == 3) {
                    state = p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1236x71b7c395.State.f3881x20f779;
                } else if (m8580x12db6e91 != 4) {
                    state = p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1236x71b7c395.State.f3881x20f779;
                }
                android.graphics.Rect rect2 = feature.getRect();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(rect2, "feature.rect");
                return new p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1237x609bdf9d(new p012xc85e97e9.p117xd10bdbf0.p118x2eaf9f.C1195x76f2e2d5(rect2), m8569xfb7ef857, state);
            }
            return null;
        }
    }

    /* renamed from: isEqualSidecarDisplayFeature */
    private final boolean m8573xfb6dfa47(androidx.window.sidecar.SidecarDisplayFeature first, androidx.window.sidecar.SidecarDisplayFeature second) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(first, second)) {
            return true;
        }
        if (first == null || second == null || first.getType() != second.getType()) {
            return false;
        }
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(first.getRect(), second.getRect());
    }

    /* renamed from: isEqualSidecarDisplayFeatures */
    private final boolean m8574x72514f0c(java.util.List<androidx.window.sidecar.SidecarDisplayFeature> first, java.util.List<androidx.window.sidecar.SidecarDisplayFeature> second) {
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
                if (!m8573xfb6dfa47(first.get(i17), second.get(i17))) {
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

    /* renamed from: isEqualSidecarDeviceState */
    public final boolean m8575xa4d80a48(androidx.window.sidecar.SidecarDeviceState first, androidx.window.sidecar.SidecarDeviceState second) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(first, second)) {
            return true;
        }
        if (first == null || second == null) {
            return false;
        }
        p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1238xd5852d92.Companion companion = INSTANCE;
        return companion.m8580x12db6e91(first) == companion.m8580x12db6e91(second);
    }

    /* renamed from: isEqualSidecarWindowLayoutInfo */
    public final boolean m8576x9700e8bb(androidx.window.sidecar.SidecarWindowLayoutInfo first, androidx.window.sidecar.SidecarWindowLayoutInfo second) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(first, second)) {
            return true;
        }
        if (first == null || second == null) {
            return false;
        }
        p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1238xd5852d92.Companion companion = INSTANCE;
        return m8574x72514f0c(companion.m8581x15cde138(first), companion.m8581x15cde138(second));
    }

    /* renamed from: translate */
    public final p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1249xd38bff28 m8577x3ec0f14e(androidx.window.sidecar.SidecarWindowLayoutInfo extensionInfo, androidx.window.sidecar.SidecarDeviceState state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        if (extensionInfo == null) {
            return new p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1249xd38bff28(kz5.p0.f395529d);
        }
        androidx.window.sidecar.SidecarDeviceState sidecarDeviceState = new androidx.window.sidecar.SidecarDeviceState();
        p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1238xd5852d92.Companion companion = INSTANCE;
        companion.m8582xdea7f8f7(sidecarDeviceState, companion.m8580x12db6e91(state));
        return new p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1249xd38bff28(m8578x3ec0f14e(companion.m8581x15cde138(extensionInfo), sidecarDeviceState));
    }

    /* renamed from: translate */
    public final java.util.List<p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1231xeab5c7f4> m8578x3ec0f14e(java.util.List<androidx.window.sidecar.SidecarDisplayFeature> sidecarDisplayFeatures, androidx.window.sidecar.SidecarDeviceState deviceState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sidecarDisplayFeatures, "sidecarDisplayFeatures");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceState, "deviceState");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = sidecarDisplayFeatures.iterator();
        while (it.hasNext()) {
            p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1231xeab5c7f4 m8584x72534ce = INSTANCE.m8584x72534ce((androidx.window.sidecar.SidecarDisplayFeature) it.next(), deviceState);
            if (m8584x72534ce != null) {
                arrayList.add(m8584x72534ce);
            }
        }
        return arrayList;
    }
}
