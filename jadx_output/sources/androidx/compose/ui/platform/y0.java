package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class y0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f10817d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.platform.z0 f10818e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(android.content.Context context, androidx.compose.ui.platform.z0 z0Var) {
        super(1);
        this.f10817d = context;
        this.f10818e = z0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        n0.b2 DisposableEffect = (n0.b2) obj;
        kotlin.jvm.internal.o.g(DisposableEffect, "$this$DisposableEffect");
        android.content.Context context = this.f10817d;
        android.content.Context applicationContext = context.getApplicationContext();
        androidx.compose.ui.platform.z0 z0Var = this.f10818e;
        applicationContext.registerComponentCallbacks(z0Var);
        return new androidx.compose.ui.platform.x0(context, z0Var);
    }
}
