package pn2;

/* loaded from: classes3.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pn2.s f438535d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(pn2.s sVar) {
        super(0);
        this.f438535d = sVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        pn2.b bVar;
        km2.z zVar;
        r45.cz1 cz1Var;
        pn2.s sVar = this.f438535d;
        sVar.f438558t--;
        java.lang.String str = sVar.f438550i;
        boolean z17 = str == null || str.length() == 0;
        gk2.e eVar = sVar.f438546e;
        if (!z17) {
            java.lang.String str2 = sVar.f438550i;
            km2.z zVar2 = ((on2.z2) eVar.a(on2.z2.class)).f428625m;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, (zVar2 == null || (cz1Var = zVar2.f390765d) == null) ? null : cz1Var.m75945x2fec8307(0)) && (zVar = ((on2.z2) eVar.a(on2.z2.class)).f428625m) != null) {
                zVar.f390763b = sVar.f438558t;
            }
        }
        int i17 = sVar.f438558t;
        if (i17 >= 0) {
            if (sVar.f438549h == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(sVar.f438548g, "viewCallback is empty!");
            }
            km2.z zVar3 = ((on2.z2) eVar.a(on2.z2.class)).f428625m;
            if ((zVar3 != null && zVar3.f390762a == 1) && (bVar = sVar.f438549h) != null) {
                java.lang.String a17 = no0.l.a(no0.m.f420263a, i17, ":", false, false, false, 24, null);
                pn2.c0 c0Var = (pn2.c0) bVar;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c0Var.f438510m, "updateCountDown remainTime:".concat(a17));
                android.widget.FrameLayout D = c0Var.D();
                if (D != null) {
                    D.post(new pn2.a0(c0Var));
                }
                android.widget.TextView B = c0Var.B();
                if (B != null) {
                    B.setVisibility(0);
                }
                android.widget.TextView B2 = c0Var.B();
                if (B2 != null) {
                    B2.setText(a17);
                }
            }
            qo0.c.a(sVar.f438547f, qo0.b.f446941r3, null, 2, null);
        }
        int i18 = sVar.f438558t;
        if (i18 <= 0) {
            sVar.q(i18);
        }
        return jz5.f0.f384359a;
    }
}
