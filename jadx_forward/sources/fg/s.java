package fg;

/* loaded from: classes7.dex */
public final class s implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.k2 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f343340d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fg.b0 f343341e;

    public s(fg.b0 b0Var) {
        this.f343341e = b0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.k2
    public void a(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t a17;
        android.view.View mo51310xc2a54588;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t a18;
        fg.b0 b0Var = this.f343341e;
        if (b0Var.e(b0Var.f343273q)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(b0Var.f343257a, "is keyboard showing: " + b0Var.f343266j + ", state change: " + z17);
            return;
        }
        this.f343340d = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.oa oaVar = b0Var.f343260d;
        if (((oaVar == null || (a18 = oaVar.a()) == null) ? null : a18.mo51310xc2a54588()) == null || sf.c.f488472a.b()) {
            b(z17);
            return;
        }
        if (b0Var.f343270n) {
            return;
        }
        b0Var.f343270n = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.oa oaVar2 = b0Var.f343260d;
        if (oaVar2 == null || (a17 = oaVar2.a()) == null || (mo51310xc2a54588 = a17.mo51310xc2a54588()) == null) {
            return;
        }
        mo51310xc2a54588.postDelayed(new fg.q(b0Var, this), b0Var.f343258b);
    }

    public final void b(boolean z17) {
        fg.b0 b0Var = this.f343341e;
        fg.g b17 = b0Var.b(null);
        if (b17 != null) {
            android.widget.EditText editText = b0Var.f343263g;
            if (editText != null) {
                if (z17) {
                    b17.h(editText);
                } else {
                    b17.e(editText);
                }
            }
            b17.d(z17 ? b0Var.f343265i : 0);
        }
        sf.c cVar = sf.c.f488472a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.oa oaVar = b0Var.f343260d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(oaVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t a17 = oaVar.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.oa oaVar2 = b0Var.f343260d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(oaVar2);
        cVar.a(a17, oaVar2.b(), new sf.b(z17 ? b0Var.f343265i : 0, b0Var.d(b0Var.f343265i), b0Var.f343268l, new fg.p(b0Var, z17)));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.k2
    public void d(int i17) {
        int i18;
        fg.b0 b0Var = this.f343341e;
        boolean z17 = (i17 == 0 || (i18 = b0Var.f343265i) == 0 || i17 == i18) ? false : true;
        b0Var.f343265i = i17;
        if (z17) {
            sf.c cVar = sf.c.f488472a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.oa oaVar = b0Var.f343260d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(oaVar);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t a17 = oaVar.a();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.oa oaVar2 = b0Var.f343260d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(oaVar2);
            cVar.a(a17, oaVar2.b(), new sf.b(i17, b0Var.d(i17), b0Var.f343268l, new fg.r(b0Var, i17)));
        }
        fg.g b17 = b0Var.b(null);
        if (b17 != null) {
            b17.d(i17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.k2
    /* renamed from: getHeight */
    public int mo53489x1c4fb41d() {
        return this.f343341e.f343265i;
    }
}
