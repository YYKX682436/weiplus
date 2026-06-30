package io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb;

/* renamed from: io.flutter.plugin.common.PluginRegistry */
/* loaded from: classes15.dex */
public interface InterfaceC28690x6307ecb0 {

    /* renamed from: io.flutter.plugin.common.PluginRegistry$ActivityResultListener */
    /* loaded from: classes10.dex */
    public interface ActivityResultListener {
        /* renamed from: onActivityResult */
        boolean mo63506x9d4787cb(int i17, int i18, android.content.Intent intent);
    }

    /* renamed from: io.flutter.plugin.common.PluginRegistry$NewIntentListener */
    /* loaded from: classes15.dex */
    public interface NewIntentListener {
        /* renamed from: onNewIntent */
        boolean m138443xc944513d(android.content.Intent intent);
    }

    /* renamed from: io.flutter.plugin.common.PluginRegistry$RequestPermissionsResultListener */
    /* loaded from: classes10.dex */
    public interface RequestPermissionsResultListener {
        /* renamed from: onRequestPermissionsResult */
        boolean mo266x953457f1(int i17, java.lang.String[] strArr, int[] iArr);
    }

    /* renamed from: io.flutter.plugin.common.PluginRegistry$UserLeaveHintListener */
    /* loaded from: classes15.dex */
    public interface UserLeaveHintListener {
        /* renamed from: onUserLeaveHint */
        void m138444xb1e9ab4();
    }

    /* renamed from: io.flutter.plugin.common.PluginRegistry$WindowFocusChangedListener */
    /* loaded from: classes15.dex */
    public interface WindowFocusChangedListener {
        /* renamed from: onWindowFocusChanged */
        void m138445xa4ec7b0b(boolean z17);
    }
}
