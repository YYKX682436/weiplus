package m31;

/* loaded from: classes9.dex */
public class c0 implements fl1.b2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f404658d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f404659e;

    /* renamed from: f, reason: collision with root package name */
    public fl1.g2 f404660f;

    /* renamed from: g, reason: collision with root package name */
    public m31.a0 f404661g;

    public c0(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f404658d = context;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cx6, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f404659e = inflate;
        inflate.findViewById(com.p314xaae8f345.mm.R.id.khs).setOnClickListener(new m31.z(this));
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.agv);
        nf.y yVar = nf.x.f418149b;
        imageView.setBackgroundResource(yVar != null ? yVar.mo53144x387a9983() : false ? com.p314xaae8f345.mm.R.C30861xcebc809e.cft : com.p314xaae8f345.mm.R.C30861xcebc809e.cfu);
    }

    @Override // fl1.b2
    public boolean a() {
        return false;
    }

    @Override // android.content.DialogInterface
    public void cancel() {
        fl1.g2 g2Var = this.f404660f;
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
        fl1.g2 g2Var = this.f404660f;
        if (g2Var == null) {
            m31.a0 a0Var = this.f404661g;
            if (a0Var != null) {
                a0Var.mo51138xb349b3ab();
                return;
            }
            return;
        }
        g2Var.d(new m31.b0(this));
        fl1.g2 g2Var2 = this.f404660f;
        if (g2Var2 != null) {
            g2Var2.a(this);
        }
    }

    @Override // fl1.b2
    /* renamed from: getContentView */
    public android.view.View mo81952xc2a54588() {
        return this.f404659e;
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
        fl1.g2 g2Var = this.f404660f;
        if (g2Var != null) {
            g2Var.a(this);
        }
    }

    @Override // fl1.b2
    public void v(fl1.g2 g2Var) {
        this.f404660f = g2Var;
        m31.v vVar = m31.w.f404757a;
        java.lang.Object systemService = this.f404658d.getSystemService("window");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        vVar.a(((android.view.WindowManager) systemService).getDefaultDisplay().getRotation(), this.f404659e);
    }

    @Override // fl1.b2
    public void y(int i17) {
        m31.w.f404757a.a(i17, this.f404659e);
    }
}
