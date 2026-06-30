package androidx.window.layout;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001:\u0001\fJ\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¨\u0006\r"}, d2 = {"Landroidx/window/layout/ExtensionInterfaceCompat;", "", "", "validateExtensionInterface", "Landroidx/window/layout/ExtensionInterfaceCompat$ExtensionCallbackInterface;", "extensionCallback", "Ljz5/f0;", "setExtensionCallback", "Landroid/app/Activity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "onWindowLayoutChangeListenerAdded", "onWindowLayoutChangeListenerRemoved", "ExtensionCallbackInterface", "window_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes13.dex */
public interface ExtensionInterfaceCompat {

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Landroidx/window/layout/ExtensionInterfaceCompat$ExtensionCallbackInterface;", "", "Landroid/app/Activity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "Landroidx/window/layout/WindowLayoutInfo;", "newLayout", "Ljz5/f0;", "onWindowLayoutChanged", "window_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes13.dex */
    public interface ExtensionCallbackInterface {
        void onWindowLayoutChanged(android.app.Activity activity, androidx.window.layout.WindowLayoutInfo windowLayoutInfo);
    }

    void onWindowLayoutChangeListenerAdded(android.app.Activity activity);

    void onWindowLayoutChangeListenerRemoved(android.app.Activity activity);

    void setExtensionCallback(androidx.window.layout.ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface);

    boolean validateExtensionInterface();
}
