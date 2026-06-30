package kf3;

/* loaded from: classes5.dex */
public class r implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb f388953a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kf3.u f388954b;

    public r(kf3.u uVar, com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb) {
        this.f388954b = uVar;
        this.f388953a = interfaceC4987x84e327cb;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3
    public void a() {
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = this.f388953a;
        kf3.u uVar = this.f388954b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16488xbf7e6679 activityC16488xbf7e6679 = uVar.f388969a;
        try {
            r45.cj0 cj0Var = new r45.cj0();
            cj0Var.f453113d = interfaceC4987x84e327cb.mo42933xb5885648();
            cj0Var.f453115f = interfaceC4987x84e327cb.mo42935xfb854877();
            cj0Var.f453117h = interfaceC4987x84e327cb.mo42936xfb85f7b0();
            cj0Var.f453119m = interfaceC4987x84e327cb.j();
            cj0Var.f453114e = 0;
            cj0Var.f453123q = 0;
            cj0Var.f453116g = new r45.cu5();
            if3.y yVar = new if3.y();
            yVar.f372748h = interfaceC4987x84e327cb.mo42933xb5885648();
            yVar.f372750m = uVar.f388975g;
            yVar.f372751n = uVar.f388976h.size();
            byte[] mo14344x5f01b1f6 = cj0Var.mo14344x5f01b1f6();
            yVar.f372762y = mo14344x5f01b1f6;
            if (mo14344x5f01b1f6 == null) {
                mo14344x5f01b1f6 = new byte[0];
            }
            yVar.f372755r = mo14344x5f01b1f6.length;
            yVar.f372752o = 47;
            if3.g0 g0Var = new if3.g0(yVar, uVar.f388977i, 0);
            c01.d9.e().g(g0Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16488xbf7e6679 activityC16488xbf7e66792 = uVar.f388969a;
            uVar.f388974f = db5.e1.Q(activityC16488xbf7e66792, activityC16488xbf7e66792.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC16488xbf7e6679.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iin), true, true, new kf3.s(uVar, g0Var));
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MassSendFooterEventImpl", e17, "", new java.lang.Object[0]);
            dp.a.m125854x26a183b(activityC16488xbf7e6679, activityC16488xbf7e6679.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dbd), 0).show();
        }
    }
}
