package d55;

/* loaded from: classes12.dex */
public class d0 extends d55.b0 {

    /* renamed from: r, reason: collision with root package name */
    public final long f308111r;

    /* renamed from: s, reason: collision with root package name */
    public d55.g0 f308112s;

    /* renamed from: t, reason: collision with root package name */
    public d55.j0 f308113t;

    public d0(android.content.Context context) {
        super(context);
        this.f308111r = java.lang.System.currentTimeMillis();
    }

    @Override // d55.b0
    public int d() {
        d55.j0 j0Var = this.f308113t;
        if (j0Var != null) {
            return j0Var.d();
        }
        d55.g0 g0Var = this.f308112s;
        if (g0Var != null) {
            return g0Var.d();
        }
        return -1;
    }

    public void j() {
        this.f308103m = java.lang.System.currentTimeMillis();
        synchronized (this) {
            if (this.f308112s == null && this.f308113t == null) {
                d55.c0 c0Var = new d55.c0(this, this);
                this.f308112s = c0Var;
                c0Var.j();
            } else {
                if (this.f308113t == null) {
                    this.f308113t = k();
                }
                d55.j0 j0Var = this.f308113t;
                if (j0Var != null) {
                    j0Var.j(2);
                }
            }
        }
    }

    public final d55.j0 k() {
        d55.b0 b0Var = this.f308112s;
        if (b0Var == null) {
            b0Var = this;
        }
        d55.j0 j0Var = new d55.j0(b0Var);
        d55.h0 h0Var = new d55.h0("signal_acc");
        d55.w wVar = new d55.w(this.f308097d, "signal_acc");
        wVar.e();
        h0Var.f308120b = wVar;
        h0Var.f308119a = wVar.mo123525xb58848b9("acc_total", 0);
        j0Var.f308127t = this.f308111r;
        j0Var.f308126s = h0Var;
        return j0Var;
    }
}
