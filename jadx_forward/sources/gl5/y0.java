package gl5;

/* loaded from: classes5.dex */
public final class y0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gl5.d1 f354652d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(gl5.d1 d1Var) {
        super(0);
        this.f354652d = d1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object systemService = this.f354652d.f354457a.getSystemService("input_method");
        if (systemService instanceof android.view.inputmethod.InputMethodManager) {
            return (android.view.inputmethod.InputMethodManager) systemService;
        }
        return null;
    }
}
