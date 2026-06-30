package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class g4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.platform.AbstractComposeView f10567d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.platform.h4 f10568e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s3.b f10569f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(androidx.compose.ui.platform.AbstractComposeView abstractComposeView, androidx.compose.ui.platform.h4 h4Var, s3.b bVar) {
        super(0);
        this.f10567d = abstractComposeView;
        this.f10568e = h4Var;
        this.f10569f = bVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.compose.ui.platform.AbstractComposeView abstractComposeView = this.f10567d;
        abstractComposeView.removeOnAttachStateChangeListener(this.f10568e);
        s3.b listener = this.f10569f;
        kotlin.jvm.internal.o.g(listener, "listener");
        s3.a.b(abstractComposeView).f402380a.remove(listener);
        return jz5.f0.f302826a;
    }
}
