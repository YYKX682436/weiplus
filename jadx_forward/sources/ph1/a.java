package ph1;

/* loaded from: classes7.dex */
public class a implements fl1.b2 {

    /* renamed from: d, reason: collision with root package name */
    public fl1.g2 f435836d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f435837e;

    /* renamed from: f, reason: collision with root package name */
    public final int f435838f;

    public a(android.content.Context context, int i17) {
        this.f435838f = i17;
        android.view.View view = new android.view.View(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.d.a(context));
        this.f435837e = view;
        view.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        view.setBackgroundColor(i17);
    }

    @Override // fl1.b2
    public boolean a() {
        return false;
    }

    @Override // android.content.DialogInterface
    public void cancel() {
        dismiss();
    }

    @Override // fl1.b2
    public boolean d() {
        return false;
    }

    @Override // android.content.DialogInterface
    public void dismiss() {
        fl1.g2 g2Var = this.f435836d;
        if (g2Var != null) {
            g2Var.a(this);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.BlankBackgroundPlaceholderDialog", "onDismiss backgroundColor:%d", java.lang.Integer.valueOf(this.f435838f));
        }
    }

    @Override // fl1.b2
    /* renamed from: getContentView */
    public android.view.View mo81952xc2a54588() {
        return this.f435837e;
    }

    @Override // fl1.b2
    /* renamed from: getPosition */
    public int mo14604xa86cd69f() {
        return 2;
    }

    @Override // fl1.b2
    public boolean j() {
        return false;
    }

    @Override // fl1.b2
    public void m() {
    }

    @Override // fl1.b2
    public boolean n() {
        return false;
    }

    @Override // fl1.b2
    /* renamed from: onCancel */
    public void mo123830x3d6f0539() {
    }

    @Override // fl1.b2
    public boolean q() {
        return false;
    }

    @Override // fl1.b2
    public void v(fl1.g2 g2Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.BlankBackgroundPlaceholderDialog", "onShow backgroundColor:%d", java.lang.Integer.valueOf(this.f435838f));
        this.f435836d = g2Var;
    }

    @Override // fl1.b2
    public void y(int i17) {
    }
}
