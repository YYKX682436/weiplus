package os3;

/* loaded from: classes11.dex */
public class h1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f429626d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f429627e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f429628f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f429629g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ os3.j1 f429630h;

    public h1(os3.j1 j1Var, android.widget.EditText editText, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f429630h = j1Var;
        this.f429626d = editText;
        this.f429627e = str;
        this.f429628f = str2;
        this.f429629g = str3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.widget.EditText editText = this.f429626d;
        if (editText.getText() == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(editText.getText())) {
            return;
        }
        os3.j1.a(this.f429630h, this.f429627e, this.f429628f, this.f429629g, editText.getText().toString());
    }
}
