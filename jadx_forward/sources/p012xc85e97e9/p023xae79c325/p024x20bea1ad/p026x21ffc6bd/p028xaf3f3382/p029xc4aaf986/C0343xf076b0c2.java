package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Landroidx/camera/camera2/internal/compat/params/CaptureRequestParameterCompat;", "", "Landroidx/camera/camera2/impl/Camera2ImplConfig$Builder;", "options", "Landroidx/camera/core/impl/Config$OptionPriority;", com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56088xe92e69a4, "Ljz5/f0;", "setSettingsOverrideZoom", "<init>", "()V", "camera-camera2_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: androidx.camera.camera2.internal.compat.params.CaptureRequestParameterCompat */
/* loaded from: classes14.dex */
public final class C0343xf076b0c2 {

    /* renamed from: INSTANCE */
    public static final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0343xf076b0c2 f646x4fbc8495 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0343xf076b0c2();

    private C0343xf076b0c2() {
    }

    /* renamed from: setSettingsOverrideZoom */
    public static final void m3794x2d13cd04(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef.Builder options, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.OptionPriority priority) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(options, "options");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(priority, "priority");
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            options.m2893x3c7bf26a(android.hardware.camera2.CaptureRequest.CONTROL_SETTINGS_OVERRIDE, 1, priority);
        }
    }
}
