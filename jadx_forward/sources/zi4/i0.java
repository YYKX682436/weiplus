package zi4;

/* loaded from: classes11.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zi4.j0 f554759d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(zi4.j0 j0Var) {
        super(0);
        this.f554759d = j0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        zi4.j0 j0Var = this.f554759d;
        java.lang.ref.WeakReference weakReference = j0Var.f554714e;
        java.lang.Object obj = weakReference != null ? (android.content.Context) weakReference.get() : null;
        android.app.Activity activity = obj instanceof android.app.Activity ? (android.app.Activity) obj : null;
        if (activity != null) {
            activity.finish();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j0Var.f554761g, "handleRequest: " + activity);
        return jz5.f0.f384359a;
    }
}
