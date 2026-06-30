package wi4;

/* loaded from: classes5.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f527805d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wi4.c f527806e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.widget.EditText editText, wi4.c cVar) {
        super(0);
        this.f527805d = editText;
        this.f527806e = cVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        this.f527805d.removeTextChangedListener(this.f527806e);
        return jz5.f0.f384359a;
    }
}
