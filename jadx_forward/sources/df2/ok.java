package df2;

/* loaded from: classes3.dex */
public final class ok extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.pk f312518d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f312519e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok(df2.pk pkVar, android.widget.EditText editText) {
        super(0);
        this.f312518d = pkVar;
        this.f312519e = editText;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        r45.na0 D0;
        r45.pa0 pa0Var;
        java.lang.String m75945x2fec8307;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1623xc84f4f2f.p1624x373aa5.C14940x2aae97e1 c14940x2aae97e1;
        android.text.Editable text;
        android.text.Editable text2;
        df2.pk pkVar = this.f312518d;
        android.view.View view = pkVar.D;
        android.widget.EditText editText = this.f312519e;
        if (view != null) {
            java.lang.String obj = (editText == null || (text2 = editText.getText()) == null) ? null : text2.toString();
            view.setEnabled(!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, pkVar.f312605J != null ? r6.A0() : null));
        }
        df2.pk.i7(editText, pkVar);
        if (editText == null || (text = editText.getText()) == null || (str = text.toString()) == null) {
            str = "";
        }
        ce2.i iVar = pkVar.f312605J;
        if (iVar != null && (D0 = iVar.D0()) != null && (pa0Var = (r45.pa0) D0.m75936x14adae67(1)) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pkVar.f312606m, "updateCustomTextEdit:".concat(str));
            if (pa0Var.m75933x41a8a7f2(0) && (m75945x2fec8307 = pa0Var.m75945x2fec8307(7)) != null && (c14940x2aae97e1 = pkVar.f312612s) != null) {
                c14940x2aae97e1.j(m75945x2fec8307, str);
            }
        }
        return jz5.f0.f384359a;
    }
}
