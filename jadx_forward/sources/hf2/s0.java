package hf2;

/* loaded from: classes10.dex */
public final class s0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf2.y0 f362696d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f362697e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(hf2.y0 y0Var, android.widget.EditText editText) {
        super(0);
        this.f362696d = y0Var;
        this.f362697e = editText;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        android.text.Editable text;
        android.text.Editable text2;
        hf2.y0 y0Var = this.f362696d;
        android.view.View view = y0Var.f362740h;
        android.widget.EditText editText = this.f362697e;
        if (view != null) {
            java.lang.String obj = (editText == null || (text2 = editText.getText()) == null) ? null : text2.toString();
            view.setEnabled(!(obj == null || obj.length() == 0));
        }
        hf2.y0.e(editText, y0Var);
        if (editText == null || (text = editText.getText()) == null || (str = text.toString()) == null) {
            str = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(y0Var.f362733a, null, null, new hf2.x0(y0Var, str, null), 3, null);
        return jz5.f0.f384359a;
    }
}
