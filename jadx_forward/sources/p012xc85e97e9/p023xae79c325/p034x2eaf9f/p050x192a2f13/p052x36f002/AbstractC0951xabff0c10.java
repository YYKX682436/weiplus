package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002;

/* renamed from: androidx.camera.core.processing.util.OutConfig */
/* loaded from: classes14.dex */
public abstract class AbstractC0951xabff0c10 {
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0951xabff0c10 of(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea c0905xfc457ea) {
        return of(c0905xfc457ea.m6341xe21cfccc(), c0905xfc457ea.m6337x19771aed(), c0905xfc457ea.m6334xfa2ffe0a(), p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0801x6002c4c5.m5953x492f0cd4(c0905xfc457ea.m6334xfa2ffe0a(), c0905xfc457ea.m6338x2a7ffb93()), c0905xfc457ea.m6338x2a7ffb93(), c0905xfc457ea.m6346x5a1c61b9());
    }

    /* renamed from: getCropRect */
    public abstract android.graphics.Rect mo6437xfa2ffe0a();

    /* renamed from: getFormat */
    public abstract int mo6438x19771aed();

    /* renamed from: getRotationDegrees */
    public abstract int mo6439x2a7ffb93();

    /* renamed from: getSize */
    public abstract android.util.Size mo6440xfb854877();

    /* renamed from: getTargets */
    public abstract int mo6441xe21cfccc();

    /* renamed from: getUuid */
    public abstract java.util.UUID mo6442xfb865c31();

    /* renamed from: isMirroring */
    public abstract boolean mo6444x5a1c61b9();

    /* renamed from: shouldRespectInputCropRect */
    public abstract boolean mo6445x33146cab();

    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0951xabff0c10 of(int i17, int i18, android.graphics.Rect rect, android.util.Size size, int i19, boolean z17) {
        return of(i17, i18, rect, size, i19, z17, false);
    }

    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0951xabff0c10 of(int i17, int i18, android.graphics.Rect rect, android.util.Size size, int i19, boolean z17, boolean z18) {
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0947x63d7ecf3(java.util.UUID.randomUUID(), i17, i18, rect, size, i19, z17, z18);
    }
}
