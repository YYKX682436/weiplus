package androidx.camera.camera2.internal.compat.workaround;

/* loaded from: classes13.dex */
public class ResolutionCorrector {
    private final androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk mExtraCroppingQuirk;

    public ResolutionCorrector() {
        this((androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk) androidx.camera.camera2.internal.compat.quirk.DeviceQuirks.get(androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk.class));
    }

    public java.util.List<android.util.Size> insertOrPrioritize(androidx.camera.core.impl.SurfaceConfig.ConfigType configType, java.util.List<android.util.Size> list) {
        android.util.Size verifiedResolution;
        androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk extraCroppingQuirk = this.mExtraCroppingQuirk;
        if (extraCroppingQuirk == null || (verifiedResolution = extraCroppingQuirk.getVerifiedResolution(configType)) == null) {
            return list;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(verifiedResolution);
        for (android.util.Size size : list) {
            if (!size.equals(verifiedResolution)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    public ResolutionCorrector(androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk extraCroppingQuirk) {
        this.mExtraCroppingQuirk = extraCroppingQuirk;
    }
}
