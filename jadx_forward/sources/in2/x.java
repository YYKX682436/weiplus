package in2;

/* loaded from: classes10.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f374461d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in2.f0 f374462e;

    public x(android.widget.EditText editText, in2.f0 f0Var) {
        this.f374461d = editText;
        this.f374462e = f0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f374461d.clearFocus();
        in2.f0 f0Var = this.f374462e;
        int i17 = f0Var.f374365q;
        f0Var.m8148xed6e4d18(i17, java.lang.Integer.valueOf(i17));
    }
}
