package on2;

/* loaded from: classes3.dex */
public final class d3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f428410d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f428411e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f428412f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, android.widget.EditText editText, android.widget.TextView textView) {
        super(0);
        this.f428410d = h0Var;
        this.f428411e = editText;
        this.f428412f = textView;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String obj = this.f428411e.getText().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f428410d;
        h0Var.f391656d = obj;
        android.widget.TextView confirm = this.f428412f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(confirm, "$confirm");
        on2.l3.b(confirm, ((java.lang.CharSequence) h0Var.f391656d).length() > 0);
        return jz5.f0.f384359a;
    }
}
