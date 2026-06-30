package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be;

/* renamed from: androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk */
/* loaded from: classes13.dex */
public class C0375xa052f1be implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0740x4ac379e {
    /* renamed from: getMotoE5PlayExtraSupportedResolutions */
    private android.util.Size[] m3960x848919f2() {
        return new android.util.Size[]{new android.util.Size(1440, 1080), new android.util.Size(com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.f48865xd4605761, com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf)};
    }

    /* renamed from: isMotoE5Play */
    private static boolean m3961x49078e8b() {
        return "motorola".equalsIgnoreCase(android.os.Build.BRAND) && "moto e5 play".equalsIgnoreCase(android.os.Build.MODEL);
    }

    /* renamed from: load */
    public static boolean m3962x32c4e6() {
        return m3961x49078e8b();
    }

    /* renamed from: getExtraSupportedResolutions */
    public android.util.Size[] m3963xe4471533(int i17) {
        return (i17 == 34 && m3961x49078e8b()) ? m3960x848919f2() : new android.util.Size[0];
    }

    /* renamed from: getExtraSupportedResolutions */
    public <T> android.util.Size[] m3964xe4471533(java.lang.Class<T> cls) {
        return (android.hardware.camera2.params.StreamConfigurationMap.isOutputSupportedFor(cls) && m3961x49078e8b()) ? m3960x848919f2() : new android.util.Size[0];
    }
}
