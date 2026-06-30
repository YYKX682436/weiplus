package a13;

/* loaded from: classes11.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f82080d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a13.t f82081e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f82082f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(boolean z17, a13.t tVar, yz5.l lVar) {
        super(1);
        this.f82080d = z17;
        this.f82081e = tVar;
        this.f82082f = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.app.Activity activity;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        if (this.f82080d && (activity = this.f82081e.f82106f) != null) {
            activity.finish();
        }
        this.f82082f.mo146xb9724478(java.lang.Boolean.valueOf(booleanValue));
        return jz5.f0.f384359a;
    }
}
