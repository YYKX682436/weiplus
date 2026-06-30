package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.CameraMode */
/* loaded from: classes6.dex */
public final class C0678xfee03288 {

    /* renamed from: CONCURRENT_CAMERA */
    public static final int f1570xc20cd6ad = 1;

    /* renamed from: DEFAULT */
    public static final int f1571x86df6221 = 0;

    /* renamed from: ULTRA_HIGH_RESOLUTION_CAMERA */
    public static final int f1572xbe9bd2ce = 2;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.core.impl.CameraMode$Mode */
    /* loaded from: classes6.dex */
    public @interface Mode {
    }

    private C0678xfee03288() {
    }

    /* renamed from: toLabelString */
    public static java.lang.String m5296xd08312aa(int i17) {
        return i17 != 1 ? i17 != 2 ? com.p176xb6135e39.p177xcca8366f.gms.p238x68ac49f.p240x4e139522.C2426x7e760204.f7429x859b4284 : "ULTRA_HIGH_RESOLUTION_CAMERA" : "CONCURRENT_CAMERA";
    }
}
