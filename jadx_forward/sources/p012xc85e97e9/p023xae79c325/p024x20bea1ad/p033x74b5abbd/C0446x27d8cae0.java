package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd;

/* renamed from: androidx.camera.camera2.interop.Camera2CameraInfo */
/* loaded from: classes14.dex */
public final class C0446x27d8cae0 {
    private static final java.lang.String TAG = "Camera2CameraInfo";

    /* renamed from: mCamera2CameraInfoImpl */
    private p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0160xa6db3120 f781xedcba6d3;

    /* renamed from: mCamera2PhysicalCameraInfo */
    private p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0201xc91cdcd7 f782xdcc34e4a;

    public C0446x27d8cae0(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0160xa6db3120 c0160xa6db3120) {
        this.f781xedcba6d3 = c0160xa6db3120;
    }

    /* renamed from: extractCameraCharacteristics */
    public static android.hardware.camera2.CameraCharacteristics m4150xb39d5652(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93 interfaceC0472xfede5d93) {
        if (interfaceC0472xfede5d93 instanceof p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0201xc91cdcd7) {
            return ((p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0201xc91cdcd7) interfaceC0472xfede5d93).m3280xc2a5207f().m3736xef410498();
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570 mo5286x52ed78a8 = ((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570) interfaceC0472xfede5d93).mo5286x52ed78a8();
        m3.h.e(mo5286x52ed78a8 instanceof p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0160xa6db3120, "CameraInfo does not contain any Camera2 information.");
        return ((p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0160xa6db3120) mo5286x52ed78a8).m3159xc2a5207f().m3736xef410498();
    }

    /* renamed from: from */
    public static p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0446x27d8cae0 m4151x3017aa(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93 interfaceC0472xfede5d93) {
        if (interfaceC0472xfede5d93 instanceof p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0201xc91cdcd7) {
            return ((p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0201xc91cdcd7) interfaceC0472xfede5d93).m3279x9049124a();
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570 mo5286x52ed78a8 = ((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570) interfaceC0472xfede5d93).mo5286x52ed78a8();
        m3.h.b(mo5286x52ed78a8 instanceof p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0160xa6db3120, "CameraInfo doesn't contain Camera2 implementation.");
        return ((p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0160xa6db3120) mo5286x52ed78a8).m3157x9049124a();
    }

    /* renamed from: getCameraCharacteristic */
    public <T> T m4152xd46e896(android.hardware.camera2.CameraCharacteristics.Key<T> key) {
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0201xc91cdcd7 c0201xc91cdcd7 = this.f782xdcc34e4a;
        return c0201xc91cdcd7 != null ? (T) c0201xc91cdcd7.m3280xc2a5207f().get(key) : (T) this.f781xedcba6d3.m3159xc2a5207f().get(key);
    }

    /* renamed from: getCameraCharacteristicsMap */
    public java.util.Map<java.lang.String, android.hardware.camera2.CameraCharacteristics> m4153xc80a217f() {
        return this.f782xdcc34e4a != null ? java.util.Collections.emptyMap() : this.f781xedcba6d3.m3160xc80a217f();
    }

    /* renamed from: getCameraId */
    public java.lang.String m4154x72efd496() {
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0201xc91cdcd7 c0201xc91cdcd7 = this.f782xdcc34e4a;
        return c0201xc91cdcd7 != null ? c0201xc91cdcd7.m3281x72efd496() : this.f781xedcba6d3.mo3161x72efd496();
    }

    public C0446x27d8cae0(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0201xc91cdcd7 c0201xc91cdcd7) {
        this.f782xdcc34e4a = c0201xc91cdcd7;
    }
}
