package lu2;

/* loaded from: classes.dex */
public final class g implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.q f402905d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f402906e;

    public g(yz5.q qVar, android.widget.EditText editText) {
        this.f402905d = qVar;
        this.f402906e = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dialogInterface);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        android.text.Editable text = this.f402906e.getText();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(text, "getText(...)");
        this.f402905d.mo147xb9724478(dialogInterface, valueOf, text);
    }
}
