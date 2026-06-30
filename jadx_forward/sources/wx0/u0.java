package wx0;

/* loaded from: classes5.dex */
public final class u0 implements android.widget.RadioGroup.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wx0.v0 f532085a;

    public u0(wx0.v0 v0Var) {
        this.f532085a = v0Var;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.RadioGroup radioGroup, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(radioGroup, "radioGroup");
        radioGroup.performHapticFeedback(6);
        jg.d dVar = jg.d.Auto;
        if (i17 != com.p314xaae8f345.mm.R.id.rpa) {
            if (i17 == com.p314xaae8f345.mm.R.id.f568313s46) {
                dVar = jg.d.Woman;
            } else if (i17 == com.p314xaae8f345.mm.R.id.s8e) {
                dVar = jg.d.Man;
            }
        }
        yx0.b8 b8Var = this.f532085a.f532087g;
        b8Var.getClass();
        p3325xe03a0797.p3326xc267989b.l.d(b8Var.M, null, null, new yx0.k5(b8Var, dVar, null), 3, null);
        int ordinal = dVar.ordinal();
        java.lang.String str = "Auto";
        if (ordinal != 0) {
            if (ordinal == 1) {
                str = "Man";
            } else if (ordinal == 2) {
                str = "Woman";
            }
        }
        yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
        m7Var.getClass();
        p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.w6(m7Var, str, null), 3, null);
    }
}
