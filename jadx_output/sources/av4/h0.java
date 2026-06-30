package av4;

/* loaded from: classes.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f14289d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f14290e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(android.app.Activity activity, java.lang.String str) {
        super(0);
        this.f14289d = activity;
        this.f14290e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.app.Activity activity = this.f14289d;
        activity.getIntent().putExtra("isExitForReport", true);
        activity.getIntent().putExtra("docInfoForReport", this.f14290e);
        activity.finish();
        return jz5.f0.f302826a;
    }
}
