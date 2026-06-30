package hr3;

/* loaded from: classes11.dex */
public class y9 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckBox f365740d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hr3.z9 f365741e;

    public y9(hr3.z9 z9Var, android.widget.CheckBox checkBox) {
        this.f365741e = z9Var;
        this.f365740d = checkBox;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        hr3.z9 z9Var = this.f365741e;
        z9Var.f365771d.f365229d.c();
        if (z9Var.f365771d.f365229d.f365642e.L.m43619x2fa78b11() == 18) {
            z9Var.f365771d.f365229d.f365642e.N = 9;
            if (this.f365740d.isChecked()) {
                hr3.va.b(z9Var.f365771d.f365229d);
            }
        }
    }
}
