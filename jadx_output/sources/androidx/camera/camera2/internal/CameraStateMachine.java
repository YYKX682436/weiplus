package androidx.camera.camera2.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public class CameraStateMachine {
    private static final java.lang.String TAG = "CameraStateMachine";
    private final androidx.camera.core.impl.CameraStateRegistry mCameraStateRegistry;
    private final androidx.lifecycle.j0 mCameraStates;

    /* renamed from: androidx.camera.camera2.internal.CameraStateMachine$1, reason: invalid class name */
    /* loaded from: classes14.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$core$impl$CameraInternal$State;

        static {
            int[] iArr = new int[androidx.camera.core.impl.CameraInternal.State.values().length];
            $SwitchMap$androidx$camera$core$impl$CameraInternal$State = iArr;
            try {
                iArr[androidx.camera.core.impl.CameraInternal.State.PENDING_OPEN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$camera$core$impl$CameraInternal$State[androidx.camera.core.impl.CameraInternal.State.OPENING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$camera$core$impl$CameraInternal$State[androidx.camera.core.impl.CameraInternal.State.OPEN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$camera$core$impl$CameraInternal$State[androidx.camera.core.impl.CameraInternal.State.CONFIGURED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$camera$core$impl$CameraInternal$State[androidx.camera.core.impl.CameraInternal.State.CLOSING.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$androidx$camera$core$impl$CameraInternal$State[androidx.camera.core.impl.CameraInternal.State.RELEASING.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$androidx$camera$core$impl$CameraInternal$State[androidx.camera.core.impl.CameraInternal.State.CLOSED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$androidx$camera$core$impl$CameraInternal$State[androidx.camera.core.impl.CameraInternal.State.RELEASED.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
        }
    }

    public CameraStateMachine(androidx.camera.core.impl.CameraStateRegistry cameraStateRegistry) {
        this.mCameraStateRegistry = cameraStateRegistry;
        androidx.lifecycle.j0 j0Var = new androidx.lifecycle.j0();
        this.mCameraStates = j0Var;
        j0Var.postValue(androidx.camera.core.CameraState.create(androidx.camera.core.CameraState.Type.CLOSED));
    }

    private androidx.camera.core.CameraState onCameraPendingOpen() {
        return this.mCameraStateRegistry.isCameraClosing() ? androidx.camera.core.CameraState.create(androidx.camera.core.CameraState.Type.OPENING) : androidx.camera.core.CameraState.create(androidx.camera.core.CameraState.Type.PENDING_OPEN);
    }

    public androidx.lifecycle.g0 getStateLiveData() {
        return this.mCameraStates;
    }

    public void updateState(androidx.camera.core.impl.CameraInternal.State state, androidx.camera.core.CameraState.StateError stateError) {
        androidx.camera.core.CameraState onCameraPendingOpen;
        switch (androidx.camera.camera2.internal.CameraStateMachine.AnonymousClass1.$SwitchMap$androidx$camera$core$impl$CameraInternal$State[state.ordinal()]) {
            case 1:
                onCameraPendingOpen = onCameraPendingOpen();
                break;
            case 2:
                onCameraPendingOpen = androidx.camera.core.CameraState.create(androidx.camera.core.CameraState.Type.OPENING, stateError);
                break;
            case 3:
            case 4:
                onCameraPendingOpen = androidx.camera.core.CameraState.create(androidx.camera.core.CameraState.Type.OPEN, stateError);
                break;
            case 5:
            case 6:
                onCameraPendingOpen = androidx.camera.core.CameraState.create(androidx.camera.core.CameraState.Type.CLOSING, stateError);
                break;
            case 7:
            case 8:
                onCameraPendingOpen = androidx.camera.core.CameraState.create(androidx.camera.core.CameraState.Type.CLOSED, stateError);
                break;
            default:
                throw new java.lang.IllegalStateException("Unknown internal camera state: " + state);
        }
        androidx.camera.core.Logger.d(TAG, "New public camera state " + onCameraPendingOpen + " from " + state + " and " + stateError);
        if (java.util.Objects.equals((androidx.camera.core.CameraState) this.mCameraStates.getValue(), onCameraPendingOpen)) {
            return;
        }
        androidx.camera.core.Logger.d(TAG, "Publishing new public camera state " + onCameraPendingOpen);
        this.mCameraStates.postValue(onCameraPendingOpen);
    }
}
