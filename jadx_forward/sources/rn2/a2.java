package rn2;

/* loaded from: classes15.dex */
public final class a2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn2.t2 f479175d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(rn2.t2 t2Var) {
        super(0);
        this.f479175d = t2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        android.text.Editable text;
        rn2.t2 t2Var = this.f479175d;
        rn2.f fVar = t2Var.f479387f;
        if (fVar != null) {
            android.widget.EditText editText = t2Var.F;
            if (editText == null || (text = editText.getText()) == null || (str = text.toString()) == null) {
                str = "";
            }
            rn2.c1 c1Var = (rn2.c1) fVar;
            c1Var.f479205o = str;
            c1Var.g(c1Var.f479201h, false);
        }
        return jz5.f0.f384359a;
    }
}
