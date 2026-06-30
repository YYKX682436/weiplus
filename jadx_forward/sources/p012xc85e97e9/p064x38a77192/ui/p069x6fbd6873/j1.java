package p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873;

/* loaded from: classes14.dex */
public final class j1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.i1 f92144d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.Choreographer.FrameCallback f92145e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.i1 i1Var, android.view.Choreographer.FrameCallback frameCallback) {
        super(1);
        this.f92144d = i1Var;
        this.f92145e = frameCallback;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.i1 i1Var = this.f92144d;
        android.view.Choreographer.FrameCallback callback = this.f92145e;
        i1Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        synchronized (i1Var.f92124g) {
            i1Var.f92126i.remove(callback);
        }
        return jz5.f0.f384359a;
    }
}
