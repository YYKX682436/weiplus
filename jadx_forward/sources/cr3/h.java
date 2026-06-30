package cr3;

/* loaded from: classes11.dex */
public class h extends np.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cr3.p f303483d;

    public h(cr3.p pVar) {
        this.f303483d = pVar;
    }

    @Override // c01.g1
    public void a(int i17, int i18, java.lang.String str, c01.g1 g1Var) {
        cr3.p pVar = this.f303483d;
        cr3.d0 d0Var = pVar.f303494e;
        if (d0Var.f303465e.m43619x2fa78b11() == 18) {
            d0Var.f303466f = 9;
            android.widget.CheckBox checkBox = pVar.f303493d;
            if (checkBox == null || !checkBox.isChecked()) {
                return;
            }
            d0Var.i();
        }
    }
}
