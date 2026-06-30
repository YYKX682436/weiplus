package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class x0 implements n0.a2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f10807a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.platform.z0 f10808b;

    public x0(android.content.Context context, androidx.compose.ui.platform.z0 z0Var) {
        this.f10807a = context;
        this.f10808b = z0Var;
    }

    @Override // n0.a2
    public void dispose() {
        this.f10807a.getApplicationContext().unregisterComponentCallbacks(this.f10808b);
    }
}
