package xu;

/* loaded from: classes9.dex */
public final class k extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.text.SimpleDateFormat f538713d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f538713d = new java.text.SimpleDateFormat(com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.f47897xee1ddd9f);
    }

    public final void T6() {
        l15.c cVar;
        jz5.f0 f0Var;
        j75.f Q6;
        java.lang.String m75945x2fec8307;
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("params");
        if (stringExtra == null) {
            m158354x19263085().finish();
            return;
        }
        hu.f fVar = new hu.f();
        fVar.m126727xb579bd1f(stringExtra);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = pt0.f0.f439742b1.k(fVar.q(), fVar.n());
        java.lang.String str = "";
        jz5.f0 f0Var2 = null;
        if (k17 != null) {
            cVar = new l15.c();
            java.lang.String U1 = k17.U1();
            if (U1 == null) {
                U1 = "";
            }
            cVar.m126728xdc93280d(U1);
        } else {
            cVar = null;
        }
        s15.w wVar = new s15.w();
        hu.f fVar2 = r26.n0.N(fVar.r()) ^ true ? fVar : null;
        jz5.f0 f0Var3 = jz5.f0.f384359a;
        if (fVar2 != null) {
            wVar.m126728xdc93280d(fVar2.r());
            f0Var = f0Var3;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            if (cVar != null) {
                v05.b k18 = cVar.k();
                if (k18 != null && (m75945x2fec8307 = k18.m75945x2fec8307(k18.f513848e + 44)) != null) {
                    str = m75945x2fec8307;
                }
                wVar.m126728xdc93280d(str);
                f0Var2 = f0Var3;
            }
            if (f0Var2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordDetailDataUIC", "invalid input");
                m158354x19263085().finish();
                return;
            }
        }
        j75.f Q62 = Q6();
        if (Q62 == null || ((hu.e) Q62.mo140437x75286adb()) == null || (Q6 = Q6()) == null) {
            return;
        }
        Q6.B3(new hu.a(fVar, wVar));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.z3(m158354x19263085(), new xu.h(this));
        }
        j75.f Q62 = Q6();
        if (Q62 != null) {
            Q62.L2(m158354x19263085(), new xu.i(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a O6 = O6();
        if (O6 != null) {
            v65.i.b(O6, null, new xu.j(this, null), 1, null);
        }
    }
}
