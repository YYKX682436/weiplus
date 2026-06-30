package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986;

/* renamed from: androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat */
/* loaded from: classes14.dex */
public final class C0355x6096c1c2 {

    /* renamed from: SESSION_HIGH_SPEED */
    public static final int f685xac62c0b3 = 1;

    /* renamed from: SESSION_REGULAR */
    public static final int f686xd2d68ab3 = 0;

    /* renamed from: mImpl */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0355x6096c1c2.SessionConfigurationCompatImpl f687x622d82d;

    /* renamed from: androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat$SessionConfigurationCompatBaseImpl */
    /* loaded from: classes14.dex */
    public static final class SessionConfigurationCompatBaseImpl implements p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0355x6096c1c2.SessionConfigurationCompatImpl {

        /* renamed from: mExecutor */
        private final java.util.concurrent.Executor f690x9ec3a060;

        /* renamed from: mOutputConfigurations */
        private final java.util.List<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937> f692xb9f475ab;

        /* renamed from: mSessionType */
        private final int f694xa8b65c43;

        /* renamed from: mStateCallback */
        private final android.hardware.camera2.CameraCaptureSession.StateCallback f695x90ee3089;

        /* renamed from: mInputConfig */
        private p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0348x3be1e00e f691x7c3a58ff = null;

        /* renamed from: mSessionParameters */
        private android.hardware.camera2.CaptureRequest f693x6221e433 = null;

        public SessionConfigurationCompatBaseImpl(int i17, java.util.List<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937> list, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.StateCallback stateCallback) {
            this.f694xa8b65c43 = i17;
            this.f692xb9f475ab = java.util.Collections.unmodifiableList(new java.util.ArrayList(list));
            this.f695x90ee3089 = stateCallback;
            this.f690x9ec3a060 = executor;
        }

        /* renamed from: equals */
        public boolean m3912xb2c87fbf(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0355x6096c1c2.SessionConfigurationCompatBaseImpl) {
                p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0355x6096c1c2.SessionConfigurationCompatBaseImpl sessionConfigurationCompatBaseImpl = (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0355x6096c1c2.SessionConfigurationCompatBaseImpl) obj;
                if (java.util.Objects.equals(this.f691x7c3a58ff, sessionConfigurationCompatBaseImpl.f691x7c3a58ff) && this.f694xa8b65c43 == sessionConfigurationCompatBaseImpl.f694xa8b65c43 && this.f692xb9f475ab.size() == sessionConfigurationCompatBaseImpl.f692xb9f475ab.size()) {
                    for (int i17 = 0; i17 < this.f692xb9f475ab.size(); i17++) {
                        if (!this.f692xb9f475ab.get(i17).m3835xb2c87fbf(sessionConfigurationCompatBaseImpl.f692xb9f475ab.get(i17))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0355x6096c1c2.SessionConfigurationCompatImpl
        /* renamed from: getExecutor */
        public java.util.concurrent.Executor mo3902xf5a03649() {
            return this.f690x9ec3a060;
        }

        @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0355x6096c1c2.SessionConfigurationCompatImpl
        /* renamed from: getInputConfiguration */
        public p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0348x3be1e00e mo3903x189a2742() {
            return this.f691x7c3a58ff;
        }

        @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0355x6096c1c2.SessionConfigurationCompatImpl
        /* renamed from: getOutputConfigurations */
        public java.util.List<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937> mo3904xfeda7614() {
            return this.f692xb9f475ab;
        }

        @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0355x6096c1c2.SessionConfigurationCompatImpl
        /* renamed from: getSessionConfiguration */
        public java.lang.Object mo3905x94a54276() {
            return null;
        }

        @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0355x6096c1c2.SessionConfigurationCompatImpl
        /* renamed from: getSessionParameters */
        public android.hardware.camera2.CaptureRequest mo3906x1874e46a() {
            return this.f693x6221e433;
        }

        @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0355x6096c1c2.SessionConfigurationCompatImpl
        /* renamed from: getSessionType */
        public int mo3907xd87f91ba() {
            return this.f694xa8b65c43;
        }

        @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0355x6096c1c2.SessionConfigurationCompatImpl
        /* renamed from: getStateCallback */
        public android.hardware.camera2.CameraCaptureSession.StateCallback mo3908xf33fe440() {
            return this.f695x90ee3089;
        }

        /* renamed from: hashCode */
        public int m3913x8cdac1b() {
            int hashCode = this.f692xb9f475ab.hashCode() ^ 31;
            int i17 = (hashCode << 5) - hashCode;
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0348x3be1e00e c0348x3be1e00e = this.f691x7c3a58ff;
            int m3817x8cdac1b = (c0348x3be1e00e == null ? 0 : c0348x3be1e00e.m3817x8cdac1b()) ^ i17;
            return this.f694xa8b65c43 ^ ((m3817x8cdac1b << 5) - m3817x8cdac1b);
        }

        @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0355x6096c1c2.SessionConfigurationCompatImpl
        /* renamed from: setInputConfiguration */
        public void mo3910xafc5a94e(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0348x3be1e00e c0348x3be1e00e) {
            if (this.f694xa8b65c43 == 1) {
                throw new java.lang.UnsupportedOperationException("Method not supported for high speed session types");
            }
            this.f691x7c3a58ff = c0348x3be1e00e;
        }

        @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0355x6096c1c2.SessionConfigurationCompatImpl
        /* renamed from: setSessionParameters */
        public void mo3911xf40af0de(android.hardware.camera2.CaptureRequest captureRequest) {
            this.f693x6221e433 = captureRequest;
        }
    }

    /* renamed from: androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat$SessionConfigurationCompatImpl */
    /* loaded from: classes14.dex */
    public interface SessionConfigurationCompatImpl {
        /* renamed from: getExecutor */
        java.util.concurrent.Executor mo3902xf5a03649();

        /* renamed from: getInputConfiguration */
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0348x3be1e00e mo3903x189a2742();

        /* renamed from: getOutputConfigurations */
        java.util.List<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937> mo3904xfeda7614();

        /* renamed from: getSessionConfiguration */
        java.lang.Object mo3905x94a54276();

        /* renamed from: getSessionParameters */
        android.hardware.camera2.CaptureRequest mo3906x1874e46a();

        /* renamed from: getSessionType */
        int mo3907xd87f91ba();

        /* renamed from: getStateCallback */
        android.hardware.camera2.CameraCaptureSession.StateCallback mo3908xf33fe440();

        /* renamed from: setInputConfiguration */
        void mo3910xafc5a94e(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0348x3be1e00e c0348x3be1e00e);

        /* renamed from: setSessionParameters */
        void mo3911xf40af0de(android.hardware.camera2.CaptureRequest captureRequest);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat$SessionMode */
    /* loaded from: classes6.dex */
    public @interface SessionMode {
    }

    public C0355x6096c1c2(int i17, java.util.List<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937> list, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.StateCallback stateCallback) {
        if (android.os.Build.VERSION.SDK_INT < 28) {
            this.f687x622d82d = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0355x6096c1c2.SessionConfigurationCompatBaseImpl(i17, list, executor, stateCallback);
        } else {
            this.f687x622d82d = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0355x6096c1c2.SessionConfigurationCompatApi28Impl(i17, list, executor, stateCallback);
        }
    }

    /* renamed from: transformFromCompat */
    public static java.util.List<android.hardware.camera2.params.OutputConfiguration> m3887xac4c4058(java.util.List<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((android.hardware.camera2.params.OutputConfiguration) it.next().m3850xcdecea63());
        }
        return arrayList;
    }

    /* renamed from: transformToCompat */
    public static java.util.List<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937> m3888x465cc969(java.util.List<android.hardware.camera2.params.OutputConfiguration> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator<android.hardware.camera2.params.OutputConfiguration> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937.m3832x37d04a(it.next()));
        }
        return arrayList;
    }

    /* renamed from: wrap */
    public static p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0355x6096c1c2 m3889x37d04a(java.lang.Object obj) {
        if (obj != null && android.os.Build.VERSION.SDK_INT >= 28) {
            return new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0355x6096c1c2(new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0355x6096c1c2.SessionConfigurationCompatApi28Impl(obj));
        }
        return null;
    }

    /* renamed from: equals */
    public boolean m3890xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0355x6096c1c2) {
            return this.f687x622d82d.equals(((p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0355x6096c1c2) obj).f687x622d82d);
        }
        return false;
    }

    /* renamed from: getExecutor */
    public java.util.concurrent.Executor m3891xf5a03649() {
        return this.f687x622d82d.mo3902xf5a03649();
    }

    /* renamed from: getInputConfiguration */
    public p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0348x3be1e00e m3892x189a2742() {
        return this.f687x622d82d.mo3903x189a2742();
    }

    /* renamed from: getOutputConfigurations */
    public java.util.List<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937> m3893xfeda7614() {
        return this.f687x622d82d.mo3904xfeda7614();
    }

    /* renamed from: getSessionParameters */
    public android.hardware.camera2.CaptureRequest m3894x1874e46a() {
        return this.f687x622d82d.mo3906x1874e46a();
    }

    /* renamed from: getSessionType */
    public int m3895xd87f91ba() {
        return this.f687x622d82d.mo3907xd87f91ba();
    }

    /* renamed from: getStateCallback */
    public android.hardware.camera2.CameraCaptureSession.StateCallback m3896xf33fe440() {
        return this.f687x622d82d.mo3908xf33fe440();
    }

    /* renamed from: hashCode */
    public int m3897x8cdac1b() {
        return this.f687x622d82d.hashCode();
    }

    /* renamed from: setInputConfiguration */
    public void m3898xafc5a94e(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0348x3be1e00e c0348x3be1e00e) {
        this.f687x622d82d.mo3910xafc5a94e(c0348x3be1e00e);
    }

    /* renamed from: setSessionParameters */
    public void m3899xf40af0de(android.hardware.camera2.CaptureRequest captureRequest) {
        this.f687x622d82d.mo3911xf40af0de(captureRequest);
    }

    /* renamed from: unwrap */
    public java.lang.Object m3900xcdecea63() {
        return this.f687x622d82d.mo3905x94a54276();
    }

    /* renamed from: androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat$SessionConfigurationCompatApi28Impl */
    /* loaded from: classes14.dex */
    public static final class SessionConfigurationCompatApi28Impl implements p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0355x6096c1c2.SessionConfigurationCompatImpl {

        /* renamed from: mObject */
        private final android.hardware.camera2.params.SessionConfiguration f688x126cca0c;

        /* renamed from: mOutputConfigurations */
        private final java.util.List<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937> f689xb9f475ab;

        public SessionConfigurationCompatApi28Impl(java.lang.Object obj) {
            android.hardware.camera2.params.SessionConfiguration sessionConfiguration = (android.hardware.camera2.params.SessionConfiguration) obj;
            this.f688x126cca0c = sessionConfiguration;
            this.f689xb9f475ab = java.util.Collections.unmodifiableList(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0355x6096c1c2.m3888x465cc969(sessionConfiguration.getOutputConfigurations()));
        }

        /* renamed from: equals */
        public boolean m3901xb2c87fbf(java.lang.Object obj) {
            if (obj instanceof p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0355x6096c1c2.SessionConfigurationCompatApi28Impl) {
                return java.util.Objects.equals(this.f688x126cca0c, ((p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0355x6096c1c2.SessionConfigurationCompatApi28Impl) obj).f688x126cca0c);
            }
            return false;
        }

        @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0355x6096c1c2.SessionConfigurationCompatImpl
        /* renamed from: getExecutor */
        public java.util.concurrent.Executor mo3902xf5a03649() {
            return this.f688x126cca0c.getExecutor();
        }

        @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0355x6096c1c2.SessionConfigurationCompatImpl
        /* renamed from: getInputConfiguration */
        public p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0348x3be1e00e mo3903x189a2742() {
            return p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0348x3be1e00e.m3812x37d04a(this.f688x126cca0c.getInputConfiguration());
        }

        @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0355x6096c1c2.SessionConfigurationCompatImpl
        /* renamed from: getOutputConfigurations */
        public java.util.List<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937> mo3904xfeda7614() {
            return this.f689xb9f475ab;
        }

        @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0355x6096c1c2.SessionConfigurationCompatImpl
        /* renamed from: getSessionConfiguration */
        public java.lang.Object mo3905x94a54276() {
            return this.f688x126cca0c;
        }

        @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0355x6096c1c2.SessionConfigurationCompatImpl
        /* renamed from: getSessionParameters */
        public android.hardware.camera2.CaptureRequest mo3906x1874e46a() {
            return this.f688x126cca0c.getSessionParameters();
        }

        @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0355x6096c1c2.SessionConfigurationCompatImpl
        /* renamed from: getSessionType */
        public int mo3907xd87f91ba() {
            return this.f688x126cca0c.getSessionType();
        }

        @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0355x6096c1c2.SessionConfigurationCompatImpl
        /* renamed from: getStateCallback */
        public android.hardware.camera2.CameraCaptureSession.StateCallback mo3908xf33fe440() {
            return this.f688x126cca0c.getStateCallback();
        }

        /* renamed from: hashCode */
        public int m3909x8cdac1b() {
            return this.f688x126cca0c.hashCode();
        }

        @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0355x6096c1c2.SessionConfigurationCompatImpl
        /* renamed from: setInputConfiguration */
        public void mo3910xafc5a94e(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0348x3be1e00e c0348x3be1e00e) {
            this.f688x126cca0c.setInputConfiguration((android.hardware.camera2.params.InputConfiguration) c0348x3be1e00e.m3820xcdecea63());
        }

        @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0355x6096c1c2.SessionConfigurationCompatImpl
        /* renamed from: setSessionParameters */
        public void mo3911xf40af0de(android.hardware.camera2.CaptureRequest captureRequest) {
            this.f688x126cca0c.setSessionParameters(captureRequest);
        }

        public SessionConfigurationCompatApi28Impl(int i17, java.util.List<p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0349x1437c937> list, java.util.concurrent.Executor executor, android.hardware.camera2.CameraCaptureSession.StateCallback stateCallback) {
            this(new android.hardware.camera2.params.SessionConfiguration(i17, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0355x6096c1c2.m3887xac4c4058(list), executor, stateCallback));
        }
    }

    private C0355x6096c1c2(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0355x6096c1c2.SessionConfigurationCompatImpl sessionConfigurationCompatImpl) {
        this.f687x622d82d = sessionConfigurationCompatImpl;
    }
}
