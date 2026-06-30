package vw3;

/* loaded from: classes.dex */
public final class q5 extends p012xc85e97e9.p016x746ad0e3.app.i0 {

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f522617f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f522618g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f522619h;

    /* renamed from: i, reason: collision with root package name */
    public final vw3.n f522620i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.EditText f522621m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.Button f522622n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(android.content.Context dialogContext, java.lang.String str, java.lang.String str2, vw3.n nVar) {
        super(dialogContext, com.p314xaae8f345.mm.R.C30868x68b1db1.f576035os);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dialogContext, "dialogContext");
        this.f522617f = dialogContext;
        this.f522618g = str;
        this.f522619h = str2;
        this.f522620i = nVar;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.i0, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        android.view.Window window2 = getWindow();
        if (window2 != null) {
            window2.addFlags(67108864);
        }
        android.view.Window window3 = getWindow();
        if (window3 != null) {
            window3.setDimAmount(0.5f);
        }
        android.view.View inflate = android.view.LayoutInflater.from(this.f522617f).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570948cg5, (android.view.ViewGroup) null, false);
        setContentView(inflate, new android.view.ViewGroup.LayoutParams(-1, -1));
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.odf)).setText(this.f522618g);
        this.f522621m = (android.widget.EditText) inflate.findViewById(com.p314xaae8f345.mm.R.id.owl);
        this.f522622n = (android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.khs);
        android.widget.EditText editText = this.f522621m;
        if (editText != null) {
            editText.requestFocus();
        }
        java.lang.String str = this.f522619h;
        if (str != null) {
            android.widget.EditText editText2 = this.f522621m;
            if (editText2 != null) {
                editText2.setText(str);
            }
            android.widget.EditText editText3 = this.f522621m;
            if (editText3 != null) {
                editText3.setSelection(str.length());
            }
        }
        inflate.findViewById(com.p314xaae8f345.mm.R.id.cz9).setOnTouchListener(new vw3.m5(this));
        setCancelable(true);
        ku5.u0 u0Var = ku5.t0.f394148d;
        vw3.n5 n5Var = new vw3.n5(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(n5Var, 128L, false);
        android.widget.Button button = this.f522622n;
        if (button != null) {
            button.setOnClickListener(new vw3.o5(this));
        }
        setOnDismissListener(new vw3.p5(this));
    }
}
