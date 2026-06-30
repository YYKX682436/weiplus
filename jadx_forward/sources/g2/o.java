package g2;

/* loaded from: classes3.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f349258d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(android.content.Context context) {
        super(0);
        this.f349258d = context;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object systemService = this.f349258d.getSystemService("input_method");
        if (systemService != null) {
            return (android.view.inputmethod.InputMethodManager) systemService;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }
}
