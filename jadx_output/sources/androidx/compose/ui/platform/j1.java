package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class j1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.platform.i1 f10611d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.Choreographer.FrameCallback f10612e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(androidx.compose.ui.platform.i1 i1Var, android.view.Choreographer.FrameCallback frameCallback) {
        super(1);
        this.f10611d = i1Var;
        this.f10612e = frameCallback;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        androidx.compose.ui.platform.i1 i1Var = this.f10611d;
        android.view.Choreographer.FrameCallback callback = this.f10612e;
        i1Var.getClass();
        kotlin.jvm.internal.o.g(callback, "callback");
        synchronized (i1Var.f10591g) {
            i1Var.f10593i.remove(callback);
        }
        return jz5.f0.f302826a;
    }
}
