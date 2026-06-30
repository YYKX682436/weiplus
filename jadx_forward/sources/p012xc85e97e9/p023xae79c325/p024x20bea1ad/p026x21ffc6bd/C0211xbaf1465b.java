package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.CameraStateMachine */
/* loaded from: classes14.dex */
public class C0211xbaf1465b {
    private static final java.lang.String TAG = "CameraStateMachine";

    /* renamed from: mCameraStateRegistry */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0684x851c70a9 f357x2504b71c;

    /* renamed from: mCameraStates */
    private final p012xc85e97e9.p093xedfae76a.j0 f358x5fe9e694;

    /* renamed from: androidx.camera.camera2.internal.CameraStateMachine$1, reason: invalid class name */
    /* loaded from: classes14.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: $SwitchMap$androidx$camera$core$impl$CameraInternal$State */
        static final /* synthetic */ int[] f359xe3120572;

        static {
            int[] iArr = new int[p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522.State.m5294xcee59d22().length];
            f359xe3120572 = iArr;
            try {
                iArr[p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522.State.PENDING_OPEN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f359xe3120572[p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522.State.OPENING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f359xe3120572[p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522.State.OPEN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f359xe3120572[p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522.State.CONFIGURED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f359xe3120572[p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522.State.CLOSING.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                f359xe3120572[p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522.State.RELEASING.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                f359xe3120572[p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522.State.CLOSED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                f359xe3120572[p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522.State.RELEASED.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
        }
    }

    public C0211xbaf1465b(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0684x851c70a9 c0684x851c70a9) {
        this.f357x2504b71c = c0684x851c70a9;
        p012xc85e97e9.p093xedfae76a.j0 j0Var = new p012xc85e97e9.p093xedfae76a.j0();
        this.f358x5fe9e694 = j0Var;
        j0Var.mo7808x76db6cb1(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c.m4290xaf65a0fc(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c.Type.CLOSED));
    }

    /* renamed from: onCameraPendingOpen */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c m3312x5da237fd() {
        return this.f357x2504b71c.m5311x683ea4c6() ? p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c.m4290xaf65a0fc(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c.Type.OPENING) : p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c.m4290xaf65a0fc(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c.Type.PENDING_OPEN);
    }

    /* renamed from: getStateLiveData */
    public p012xc85e97e9.p093xedfae76a.g0 m3313x51fc82b1() {
        return this.f358x5fe9e694;
    }

    /* renamed from: updateState */
    public void m3314xdd28b148(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522.State state, p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c.StateError stateError) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c m3312x5da237fd;
        switch (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0211xbaf1465b.AnonymousClass1.f359xe3120572[state.ordinal()]) {
            case 1:
                m3312x5da237fd = m3312x5da237fd();
                break;
            case 2:
                m3312x5da237fd = p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c.m4291xaf65a0fc(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c.Type.OPENING, stateError);
                break;
            case 3:
            case 4:
                m3312x5da237fd = p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c.m4291xaf65a0fc(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c.Type.OPEN, stateError);
                break;
            case 5:
            case 6:
                m3312x5da237fd = p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c.m4291xaf65a0fc(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c.Type.CLOSING, stateError);
                break;
            case 7:
            case 8:
                m3312x5da237fd = p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c.m4291xaf65a0fc(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c.Type.CLOSED, stateError);
                break;
            default:
                throw new java.lang.IllegalStateException("Unknown internal camera state: " + state);
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "New public camera state " + m3312x5da237fd + " from " + state + " and " + stateError);
        if (java.util.Objects.equals((p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0476xdd7ce84c) this.f358x5fe9e694.mo3195x754a37bb(), m3312x5da237fd)) {
            return;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "Publishing new public camera state " + m3312x5da237fd);
        this.f358x5fe9e694.mo7808x76db6cb1(m3312x5da237fd);
    }
}
