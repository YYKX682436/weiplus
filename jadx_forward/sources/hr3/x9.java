package hr3;

/* loaded from: classes11.dex */
public class x9 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckBox f365709d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hr3.z9 f365710e;

    public x9(hr3.z9 z9Var, android.widget.CheckBox checkBox) {
        this.f365710e = z9Var;
        this.f365709d = checkBox;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        hr3.z9 z9Var = this.f365710e;
        hr3.va vaVar = z9Var.f365771d.f365229d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16861xdcf09668 c16861xdcf09668 = vaVar.f365642e;
        c01.e2.k0(c16861xdcf09668.L);
        c16861xdcf09668.L.E2();
        if (c16861xdcf09668.X) {
            c16861xdcf09668.H1.setVisibility(0);
            vaVar.f();
        }
        hr3.ja jaVar = z9Var.f365771d;
        if (jaVar.f365229d.f365642e.L.m43619x2fa78b11() == 18) {
            jaVar.f365229d.f365642e.N = 9;
            if (this.f365709d.isChecked()) {
                hr3.va.b(jaVar.f365229d);
            }
        }
    }
}
