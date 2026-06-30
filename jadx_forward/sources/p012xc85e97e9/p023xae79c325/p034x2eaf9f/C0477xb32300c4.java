package p012xc85e97e9.p023xae79c325.p034x2eaf9f;

/* renamed from: androidx.camera.core.CameraUnavailableException */
/* loaded from: classes14.dex */
public class C0477xb32300c4 extends java.lang.Exception {

    /* renamed from: CAMERA_DISABLED */
    public static final int f882xaa1fde56 = 1;

    /* renamed from: CAMERA_DISCONNECTED */
    public static final int f883xa80acd15 = 2;

    /* renamed from: CAMERA_ERROR */
    public static final int f884x9cbd444e = 3;

    /* renamed from: CAMERA_IN_USE */
    public static final int f885x18c49a7 = 4;

    /* renamed from: CAMERA_MAX_IN_USE */
    public static final int f886xdc8e2c02 = 5;

    /* renamed from: CAMERA_UNAVAILABLE_DO_NOT_DISTURB */
    public static final int f887xe5af47e8 = 6;

    /* renamed from: CAMERA_UNKNOWN_ERROR */
    public static final int f888x1e0d1f9 = 0;

    /* renamed from: mReason */
    private final int f889x17b1b911;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.core.CameraUnavailableException$Reason */
    /* loaded from: classes6.dex */
    public @interface Reason {
    }

    public C0477xb32300c4(int i17) {
        this.f889x17b1b911 = i17;
    }

    /* renamed from: getReason */
    public int m4303x2d5cb53a() {
        return this.f889x17b1b911;
    }

    public C0477xb32300c4(int i17, java.lang.String str) {
        super(str);
        this.f889x17b1b911 = i17;
    }

    public C0477xb32300c4(int i17, java.lang.String str, java.lang.Throwable th6) {
        super(str, th6);
        this.f889x17b1b911 = i17;
    }

    public C0477xb32300c4(int i17, java.lang.Throwable th6) {
        super(th6);
        this.f889x17b1b911 = i17;
    }
}
