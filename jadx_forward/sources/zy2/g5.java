package zy2;

/* loaded from: classes2.dex */
public interface g5 {
    static /* synthetic */ boolean u(zy2.g5 g5Var, java.lang.Integer num, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startOrPlay");
        }
        if ((i17 & 1) != 0) {
            num = null;
        }
        return g5Var.J(num);
    }

    boolean J(java.lang.Integer num);

    boolean a(double d17, boolean z17);

    void b();

    void d();

    /* renamed from: getCurrentPlayMs */
    long mo56685x3d7f3f1d();

    /* renamed from: getCurrentPlaySecond */
    int mo56686xe906e26b();

    /* renamed from: getCurrentStartPlayMs */
    long mo56687x6ff74db9();

    /* renamed from: getVideoDuration */
    int mo56694x36bbd779();

    /* renamed from: getVideoDurationMs */
    long mo56695x7723e6ff();

    /* renamed from: getVideoView */
    android.view.View mo56698x4ee17f0a();

    /* renamed from: getVideoViewFocused */
    boolean mo56699x6015850d();

    /* renamed from: isPlaying */
    boolean mo58787xc00617a4();

    default boolean l() {
        return mo58787xc00617a4();
    }

    /* renamed from: pause */
    boolean mo58788x65825f6();

    /* renamed from: play */
    boolean mo58789x348b34();

    boolean r(double d17, boolean z17, int i17);

    /* renamed from: setCustomSurface */
    void mo56701x1e648aba(android.view.Surface surface);

    /* renamed from: setCustomSurfaceTexture */
    void mo56702x939d3d01(android.graphics.SurfaceTexture surfaceTexture);

    /* renamed from: setIMMVideoViewCallback */
    void mo56704x526554de(zy2.ub ubVar);

    /* renamed from: setLoop */
    void mo56708x764cf626(boolean z17);

    /* renamed from: setMute */
    void mo56709x764d819b(boolean z17);

    /* renamed from: setVideoViewFocused */
    void mo56716x4121a19(boolean z17);

    /* renamed from: stop */
    void mo58801x360802();

    boolean t();
}
