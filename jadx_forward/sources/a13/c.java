package a13;

/* loaded from: classes11.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f82069d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a13.t f82070e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f82071f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z17, a13.t tVar, yz5.l lVar) {
        super(1);
        this.f82069d = z17;
        this.f82070e = tVar;
        this.f82071f = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.app.Activity activity;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        if (this.f82069d && (activity = this.f82070e.f82106f) != null) {
            activity.finish();
        }
        this.f82071f.mo146xb9724478(java.lang.Boolean.valueOf(booleanValue));
        return jz5.f0.f384359a;
    }
}
