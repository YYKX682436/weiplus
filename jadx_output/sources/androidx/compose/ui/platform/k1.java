package androidx.compose.ui.platform;

/* loaded from: classes10.dex */
public final class k1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.platform.m1 f10617d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.Choreographer.FrameCallback f10618e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(androidx.compose.ui.platform.m1 m1Var, android.view.Choreographer.FrameCallback frameCallback) {
        super(1);
        this.f10617d = m1Var;
        this.f10618e = frameCallback;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        this.f10617d.f10641d.removeFrameCallback(this.f10618e);
        return jz5.f0.f302826a;
    }
}
