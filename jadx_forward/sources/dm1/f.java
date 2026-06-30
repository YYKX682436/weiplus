package dm1;

/* loaded from: classes5.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dm1.m f323168d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(dm1.m mVar) {
        super(0);
        this.f323168d = mVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        dm1.m mVar = this.f323168d;
        android.view.ViewManager viewManager = mVar.f323180b;
        if (viewManager != null) {
            viewManager.removeView(mVar.f323181c);
        }
        mVar.f323180b = null;
        mVar.f323184f = null;
        mVar.f323181c = null;
        return jz5.f0.f384359a;
    }
}
