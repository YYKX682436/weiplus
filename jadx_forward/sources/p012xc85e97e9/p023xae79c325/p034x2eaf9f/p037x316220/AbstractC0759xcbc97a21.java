package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.SurfaceSizeDefinition */
/* loaded from: classes13.dex */
public abstract class AbstractC0759xcbc97a21 {
    /* renamed from: create */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0759xcbc97a21 m5694xaf65a0fc(android.util.Size size, java.util.Map<java.lang.Integer, android.util.Size> map, android.util.Size size2, java.util.Map<java.lang.Integer, android.util.Size> map2, android.util.Size size3, java.util.Map<java.lang.Integer, android.util.Size> map3, java.util.Map<java.lang.Integer, android.util.Size> map4) {
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0658xa3811e84(size, map, size2, map2, size3, map3, map4);
    }

    /* renamed from: getAnalysisSize */
    public abstract android.util.Size mo5209xf8bd4b73();

    /* renamed from: getMaximumSize */
    public android.util.Size m5695x3e4f410b(int i17) {
        return mo5210x8e34c51().get(java.lang.Integer.valueOf(i17));
    }

    /* renamed from: getMaximumSizeMap */
    public abstract java.util.Map<java.lang.Integer, android.util.Size> mo5210x8e34c51();

    /* renamed from: getPreviewSize */
    public abstract android.util.Size mo5211x8cdf5ab3();

    /* renamed from: getRecordSize */
    public abstract android.util.Size mo5212x1a0de7e8();

    /* renamed from: getS1440pSize */
    public android.util.Size m5696x3d1328f5(int i17) {
        return mo5213x58ac6427().get(java.lang.Integer.valueOf(i17));
    }

    /* renamed from: getS1440pSizeMap */
    public abstract java.util.Map<java.lang.Integer, android.util.Size> mo5213x58ac6427();

    /* renamed from: getS720pSize */
    public android.util.Size m5697x98bdbfb9(int i17) {
        return mo5214xa94b26e3().get(java.lang.Integer.valueOf(i17));
    }

    /* renamed from: getS720pSizeMap */
    public abstract java.util.Map<java.lang.Integer, android.util.Size> mo5214xa94b26e3();

    /* renamed from: getUltraMaximumSize */
    public android.util.Size m5698xe91e2e6b(int i17) {
        return mo5215x2f3ce2f1().get(java.lang.Integer.valueOf(i17));
    }

    /* renamed from: getUltraMaximumSizeMap */
    public abstract java.util.Map<java.lang.Integer, android.util.Size> mo5215x2f3ce2f1();
}
