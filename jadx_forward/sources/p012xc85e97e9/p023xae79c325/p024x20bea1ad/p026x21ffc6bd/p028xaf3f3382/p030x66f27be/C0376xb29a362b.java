package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be;

/* renamed from: androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk */
/* loaded from: classes13.dex */
public class C0376xb29a362b implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0740x4ac379e {

    /* renamed from: FULL_LEVEL_YUV_PRIV_YUV_CONFIGURATION */
    private static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 f705x8bbc2311 = m3966x3cdd90da();

    /* renamed from: LEVEL_3_LEVEL_PRIV_PRIV_YUV_SUBSET_CONFIGURATION */
    private static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 f706x4dfe4ee0 = m3967xa7f7c683();

    /* renamed from: SUPPORT_EXTRA_LEVEL_3_CONFIGURATIONS_GOOGLE_MODELS */
    private static final java.util.Set<java.lang.String> f707x4bfa82f4 = new java.util.HashSet(java.util.Arrays.asList("PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO"));

    /* renamed from: SUPPORT_EXTRA_LEVEL_3_CONFIGURATIONS_SAMSUNG_MODELS */
    private static final java.util.Set<java.lang.String> f708x6f27a32b = new java.util.HashSet(java.util.Arrays.asList("SM-S921", "SC-51E", "SCG25", "SM-S926", "SM-S928", "SC-52E", "SCG26"));
    private static final java.lang.String TAG = "ExtraSupportedSurfaceCombinationsQuirk";

    /* renamed from: createFullYuvPrivYuvConfiguration */
    private static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 m3966x3cdd90da() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f402 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType configType = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType.YUV;
        c0757xf0d4f402.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize.VGA));
        c0757xf0d4f402.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType.PRIV, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize.PREVIEW));
        c0757xf0d4f402.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize.MAXIMUM));
        return c0757xf0d4f402;
    }

    /* renamed from: createLevel3PrivPrivYuvSubsetConfiguration */
    private static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 m3967xa7f7c683() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402 c0757xf0d4f402 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType configType = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType.PRIV;
        c0757xf0d4f402.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize.PREVIEW));
        c0757xf0d4f402.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(configType, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize.VGA));
        c0757xf0d4f402.m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.m5680xaf65a0fc(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType.YUV, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize.MAXIMUM));
        return c0757xf0d4f402;
    }

    /* renamed from: getSamsungS7ExtraCombinations */
    private java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402> m3968x6c183b8c(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (str.equals("1")) {
            arrayList.add(f705x8bbc2311);
        }
        return arrayList;
    }

    /* renamed from: isSamsungS7 */
    private static boolean m3969x8e35f5b4() {
        java.lang.String str = android.os.Build.DEVICE;
        return "heroqltevzw".equalsIgnoreCase(str) || "heroqltetmo".equalsIgnoreCase(str);
    }

    /* renamed from: load */
    public static boolean m3970x32c4e6() {
        return m3969x8e35f5b4() || m3971x902fd6fc() || m3972x61734b83();
    }

    /* renamed from: supportExtraLevel3ConfigurationsGoogleDevice */
    private static boolean m3971x902fd6fc() {
        if (!"google".equalsIgnoreCase(android.os.Build.BRAND)) {
            return false;
        }
        return f707x4bfa82f4.contains(android.os.Build.MODEL.toUpperCase(java.util.Locale.US));
    }

    /* renamed from: supportExtraLevel3ConfigurationsSamsungDevice */
    private static boolean m3972x61734b83() {
        if (!"samsung".equalsIgnoreCase(android.os.Build.BRAND)) {
            return false;
        }
        java.lang.String upperCase = android.os.Build.MODEL.toUpperCase(java.util.Locale.US);
        java.util.Iterator<java.lang.String> it = f708x6f27a32b.iterator();
        while (it.hasNext()) {
            if (upperCase.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: getExtraSupportedSurfaceCombinations */
    public java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0757xf0d4f402> m3973x57e90bd(java.lang.String str) {
        return m3969x8e35f5b4() ? m3968x6c183b8c(str) : (m3971x902fd6fc() || m3972x61734b83()) ? java.util.Collections.singletonList(f706x4dfe4ee0) : java.util.Collections.emptyList();
    }
}
