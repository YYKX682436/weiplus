package rn2;

/* loaded from: classes15.dex */
public final class w1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn2.t2 f479439d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(rn2.t2 t2Var) {
        super(0);
        this.f479439d = t2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        android.text.Editable text;
        rn2.t2 t2Var = this.f479439d;
        android.widget.EditText editText = t2Var.f479404w;
        if (editText == null || (text = editText.getText()) == null || (str = text.toString()) == null) {
            str = "";
        }
        rn2.f fVar = t2Var.f479387f;
        if (fVar != null) {
            rn2.c1 c1Var = (rn2.c1) fVar;
            c1Var.f479206p = hc2.l.b(str);
            c1Var.g(c1Var.f479201h, false);
        }
        return jz5.f0.f384359a;
    }
}
