package fx2;

/* loaded from: classes8.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fx2.f f348655d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f348656e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(fx2.f fVar, android.graphics.Bitmap bitmap) {
        super(0);
        this.f348655d = fVar;
        this.f348656e = bitmap;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        fx2.f fVar = this.f348655d;
        java.lang.String str = fVar.f348661c;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loaded match, view:");
        java.lang.ref.WeakReference weakReference = fVar.f348662d;
        android.view.View view = (android.view.View) weakReference.get();
        sb6.append(view != null ? java.lang.Integer.valueOf(view.hashCode()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        fVar.f348663e = this.f348656e;
        android.view.View view2 = (android.view.View) weakReference.get();
        if (view2 != null) {
            view2.invalidate();
        }
        return jz5.f0.f384359a;
    }
}
