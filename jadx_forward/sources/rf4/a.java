package rf4;

/* loaded from: classes4.dex */
public final class a extends p012xc85e97e9.p016x746ad0e3.app.i0 {

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18481x2b6a00e5 f476548f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.ViewGroup.LayoutParams f476549g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.content.Context context) {
        super(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f575663f1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f476548f = new com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18481x2b6a00e5(context, null);
        this.f476549g = new android.view.ViewGroup.LayoutParams(-1, -1);
        C(1);
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.f476548f.getClass();
        super.onBackPressed();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.i0, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        setContentView(this.f476548f, this.f476549g);
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        if (window != null) {
            window.addFlags(67108864);
            window.setLayout(-1, -1);
            window.setSoftInputMode(36);
        }
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        this.f476548f.requestFocus();
    }
}
