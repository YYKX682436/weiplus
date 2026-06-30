package gp4;

/* loaded from: classes10.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ju3.d0 f355925d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ju3.d0 d0Var) {
        super(1);
        this.f355925d = d0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.KeyEvent.Callback callback = (android.view.View) obj;
        if (callback instanceof cw3.s) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("PARAM_DELETE_VIEW_TYPE_INT", ((cw3.s) callback).mo122949xfb85f7b0().ordinal());
            this.f355925d.w(ju3.c0.D1, bundle);
        }
        return jz5.f0.f384359a;
    }
}
