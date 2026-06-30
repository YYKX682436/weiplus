package a13;

/* loaded from: classes11.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f536d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a13.t f537e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f538f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z17, a13.t tVar, yz5.l lVar) {
        super(1);
        this.f536d = z17;
        this.f537e = tVar;
        this.f538f = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.app.Activity activity;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        if (this.f536d && (activity = this.f537e.f573f) != null) {
            activity.finish();
        }
        this.f538f.invoke(java.lang.Boolean.valueOf(booleanValue));
        return jz5.f0.f302826a;
    }
}
