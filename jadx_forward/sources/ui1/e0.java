package ui1;

/* loaded from: classes7.dex */
public class e0 implements fl1.b2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f509578d;

    /* renamed from: e, reason: collision with root package name */
    public fl1.g2 f509579e;

    public e0(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569682ij, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f509578d = inflate;
        inflate.findViewById(com.p314xaae8f345.mm.R.id.khs).setOnClickListener(new ui1.c0(this));
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.agv);
        nf.y yVar = nf.x.f418149b;
        imageView.setBackgroundResource(yVar != null ? yVar.mo53144x387a9983() : false ? com.p314xaae8f345.mm.R.raw.f78524x95f97f11 : com.p314xaae8f345.mm.R.raw.f78525x29aa98db);
    }

    @Override // fl1.b2
    public boolean a() {
        return false;
    }

    @Override // android.content.DialogInterface
    public void cancel() {
        fl1.g2 g2Var = this.f509579e;
        if (g2Var != null) {
            g2Var.a(this);
        }
    }

    @Override // fl1.b2
    public boolean d() {
        return false;
    }

    @Override // android.content.DialogInterface
    public void dismiss() {
        fl1.g2 g2Var = this.f509579e;
        if (g2Var != null) {
            g2Var.d(new ui1.d0(this));
        }
        fl1.g2 g2Var2 = this.f509579e;
        if (g2Var2 != null) {
            g2Var2.a(this);
        }
    }

    @Override // fl1.b2
    /* renamed from: getContentView */
    public android.view.View mo81952xc2a54588() {
        return this.f509578d;
    }

    @Override // fl1.b2
    /* renamed from: getPosition */
    public int mo14604xa86cd69f() {
        return 2;
    }

    @Override // fl1.b2
    public boolean j() {
        return true;
    }

    @Override // fl1.b2
    public void m() {
    }

    @Override // fl1.b2
    /* renamed from: onCancel */
    public void mo123830x3d6f0539() {
        fl1.g2 g2Var = this.f509579e;
        if (g2Var != null) {
            g2Var.a(this);
        }
    }

    @Override // fl1.b2
    public void v(fl1.g2 g2Var) {
        this.f509579e = g2Var;
    }

    @Override // fl1.b2
    public void y(int i17) {
    }
}
