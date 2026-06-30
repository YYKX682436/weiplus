package df2;

/* loaded from: classes10.dex */
public final class fn implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.ln f311685d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f311686e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f311687f;

    public fn(df2.ln lnVar, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        this.f311685d = lnVar;
        this.f311686e = c0Var;
        this.f311687f = interfaceC29045xdcb5ca57;
    }

    @Override // ym5.w1
    public void a(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        df2.ln lnVar = this.f311685d;
        android.widget.FrameLayout frameLayout = lnVar.f312215s;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2 = lnVar.f312216t;
        if (c22789xd23e9a9b2 != null) {
            c22789xd23e9a9b2.i(this);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f311686e;
        if (c0Var.f391645d) {
            return;
        }
        c0Var.f391645d = true;
        this.f311687f.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE));
    }

    @Override // ym5.w1
    public void b(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        android.widget.FrameLayout frameLayout = this.f311685d.f312215s;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setVisibility(0);
    }

    @Override // ym5.w1
    public void c(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        df2.ln lnVar = this.f311685d;
        android.widget.FrameLayout frameLayout = lnVar.f312215s;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2 = lnVar.f312216t;
        if (c22789xd23e9a9b2 != null) {
            c22789xd23e9a9b2.i(this);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f311686e;
        if (c0Var.f391645d) {
            return;
        }
        c0Var.f391645d = true;
        this.f311687f.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.TRUE));
    }

    @Override // ym5.w1
    public void e(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
    }
}
