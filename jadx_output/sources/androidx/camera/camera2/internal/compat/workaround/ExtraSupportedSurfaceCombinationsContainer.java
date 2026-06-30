package androidx.camera.camera2.internal.compat.workaround;

/* loaded from: classes13.dex */
public class ExtraSupportedSurfaceCombinationsContainer {
    private final androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk mQuirk = (androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk) androidx.camera.camera2.internal.compat.quirk.DeviceQuirks.get(androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.class);

    public java.util.List<androidx.camera.core.impl.SurfaceCombination> get(java.lang.String str) {
        androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk extraSupportedSurfaceCombinationsQuirk = this.mQuirk;
        return extraSupportedSurfaceCombinationsQuirk == null ? new java.util.ArrayList() : extraSupportedSurfaceCombinationsQuirk.getExtraSupportedSurfaceCombinations(str);
    }
}
