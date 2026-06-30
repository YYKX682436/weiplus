package kh;

/* loaded from: classes12.dex */
public final class g0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kh.h0 f389336d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.Choreographer.FrameData f389337e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(kh.h0 h0Var, android.view.Choreographer.FrameData frameData) {
        super(0);
        this.f389336d = h0Var;
        this.f389337e = frameData;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        this.f389336d.f389355a.onVsync(this.f389337e);
        return jz5.f0.f384359a;
    }
}
