package av4;

/* loaded from: classes.dex */
public final class h0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f95822d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f95823e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(android.app.Activity activity, java.lang.String str) {
        super(0);
        this.f95822d = activity;
        this.f95823e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.app.Activity activity = this.f95822d;
        activity.getIntent().putExtra("isExitForReport", true);
        activity.getIntent().putExtra("docInfoForReport", this.f95823e);
        activity.finish();
        return jz5.f0.f384359a;
    }
}
