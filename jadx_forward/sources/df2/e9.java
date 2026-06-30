package df2;

/* loaded from: classes10.dex */
public final class e9 implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.k9 f311577d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f311578e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f311579f;

    public e9(df2.k9 k9Var, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f311577d = k9Var;
        this.f311578e = c0Var;
        this.f311579f = qVar;
    }

    @Override // ym5.w1
    public void a(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        df2.k9 k9Var = this.f311577d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k9Var.f312092m, "start hot comment animation, onAnimationCancel");
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f311578e;
        if (c0Var.f391645d) {
            return;
        }
        c0Var.f391645d = true;
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2 = k9Var.f312098s;
        if (c22789xd23e9a9b2 != null) {
            c22789xd23e9a9b2.i(this);
        }
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        this.f311579f.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a));
    }

    @Override // ym5.w1
    public void b(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
    }

    @Override // ym5.w1
    public void c(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        df2.k9 k9Var = this.f311577d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k9Var.f312092m, "start hot comment animation, onAnimationEnd");
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f311578e;
        if (c0Var.f391645d) {
            return;
        }
        c0Var.f391645d = true;
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2 = k9Var.f312098s;
        if (c22789xd23e9a9b2 != null) {
            c22789xd23e9a9b2.i(this);
        }
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        this.f311579f.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a));
    }

    @Override // ym5.w1
    public void e(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
    }
}
