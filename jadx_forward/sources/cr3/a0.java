package cr3;

/* loaded from: classes11.dex */
public class a0 implements com.p314xaae8f345.mm.p648x55baa833.ui.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cr3.d0 f303456a;

    public a0(cr3.d0 d0Var) {
        this.f303456a = d0Var;
    }

    @Override // com.p314xaae8f345.mm.p648x55baa833.ui.b1
    public void a(android.widget.CheckBox checkBox) {
        checkBox.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ndh);
    }

    @Override // com.p314xaae8f345.mm.p648x55baa833.ui.b1
    public void b(android.widget.CheckBox checkBox) {
        boolean isChecked = checkBox.isChecked();
        cr3.d0 d0Var = this.f303456a;
        d0Var.f303465e.d1();
        cr3.d0.b(d0Var, isChecked);
        if (d0Var.f303465e.m43619x2fa78b11() == 18) {
            d0Var.f303466f = 9;
        }
    }
}
