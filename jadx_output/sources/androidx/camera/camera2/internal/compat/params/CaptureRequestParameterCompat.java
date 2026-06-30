package androidx.camera.camera2.internal.compat.params;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Landroidx/camera/camera2/internal/compat/params/CaptureRequestParameterCompat;", "", "Landroidx/camera/camera2/impl/Camera2ImplConfig$Builder;", "options", "Landroidx/camera/core/impl/Config$OptionPriority;", com.tencent.tmassistantsdk.downloadservice.DownloadInfo.PRIORITY, "Ljz5/f0;", "setSettingsOverrideZoom", "<init>", "()V", "camera-camera2_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes14.dex */
public final class CaptureRequestParameterCompat {
    public static final androidx.camera.camera2.internal.compat.params.CaptureRequestParameterCompat INSTANCE = new androidx.camera.camera2.internal.compat.params.CaptureRequestParameterCompat();

    private CaptureRequestParameterCompat() {
    }

    public static final void setSettingsOverrideZoom(androidx.camera.camera2.impl.Camera2ImplConfig.Builder options, androidx.camera.core.impl.Config.OptionPriority priority) {
        kotlin.jvm.internal.o.g(options, "options");
        kotlin.jvm.internal.o.g(priority, "priority");
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            options.setCaptureRequestOptionWithPriority(android.hardware.camera2.CaptureRequest.CONTROL_SETTINGS_OVERRIDE, 1, priority);
        }
    }
}
