package a13;

/* loaded from: classes11.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f547d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a13.t f548e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f549f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(boolean z17, a13.t tVar, yz5.l lVar) {
        super(1);
        this.f547d = z17;
        this.f548e = tVar;
        this.f549f = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.app.Activity activity;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        if (this.f547d && (activity = this.f548e.f573f) != null) {
            activity.finish();
        }
        this.f549f.invoke(java.lang.Boolean.valueOf(booleanValue));
        return jz5.f0.f302826a;
    }
}
