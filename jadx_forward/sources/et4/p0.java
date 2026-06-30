package et4;

/* loaded from: classes9.dex */
public class p0 implements nz2.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ et4.q0 f338184a;

    public p0(et4.q0 q0Var) {
        this.f338184a = q0Var;
    }

    @Override // nz2.d
    /* renamed from: onFail */
    public void mo14631xc399519d(nz2.e eVar) {
        et4.q0 q0Var;
        int i17 = eVar.f423083b;
        et4.q0 q0Var2 = this.f338184a;
        q0Var2.f338189d = i17;
        re4.n.f(2);
        int i18 = eVar.f423084c.f423076a;
        if (i18 == 2005 || i18 == 2007) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1104, 36);
        }
        q0Var2.f338190e.dismiss();
        et4.r0 r0Var = q0Var2.f338190e.f261761m;
        if (r0Var != null) {
            boolean z17 = eVar.f423085d;
            et4.u uVar = (et4.u) r0Var;
            uVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayCashierDialog", "verify failed");
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.DialogC19129x966bbd2f.f261731y0;
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.DialogC19129x966bbd2f dialogC19129x966bbd2f = uVar.f338195a;
            dialogC19129x966bbd2f.F(true);
            dialogC19129x966bbd2f.f261745r.setText(com.p314xaae8f345.mm.R.C30867xcad56011.klu);
            dialogC19129x966bbd2f.f261745r.setVisibility(0);
            com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = dialogC19129x966bbd2f.L;
            c19760x34448d56.f273658x = 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.DialogC19130xf6f7b105 dialogC19130xf6f7b105 = dialogC19129x966bbd2f.E;
            c19760x34448d56.D = (dialogC19130xf6f7b105 == null || (q0Var = dialogC19130xf6f7b105.f261760i) == null) ? 0 : q0Var.f338189d;
            c19760x34448d56.f273660z = z17 | c19760x34448d56.f273660z;
            dialogC19129x966bbd2f.f261733d.setVisibility(0);
            dialogC19129x966bbd2f.E = null;
            com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d562 = dialogC19129x966bbd2f.L;
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.a2.a(c19760x34448d562 == null ? 0 : c19760x34448d562.f273642e, c19760x34448d562 == null ? "" : c19760x34448d562.f273647m, 23, "");
            com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d563 = dialogC19129x966bbd2f.L;
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.a2.a(c19760x34448d563 != null ? c19760x34448d563.f273642e : 0, c19760x34448d563 == null ? "" : c19760x34448d563.f273647m, 25, "");
            q0Var2.f338190e.f261761m = null;
        }
    }

    @Override // nz2.d
    /* renamed from: onRetry */
    public void mo14632xb03bf809(nz2.e eVar) {
        et4.q0 q0Var = this.f338184a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.DialogC19130xf6f7b105 dialogC19130xf6f7b105 = q0Var.f338190e;
        dialogC19130xf6f7b105.f261758g.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(dialogC19130xf6f7b105.getContext(), com.p314xaae8f345.mm.R.raw.f80246x9a2437a5, dialogC19130xf6f7b105.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac)));
        dialogC19130xf6f7b105.f261759h.setTextColor(dialogC19130xf6f7b105.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac));
        dialogC19130xf6f7b105.f261757f.setVisibility(0);
        dialogC19130xf6f7b105.f261757f.setOnClickListener(new et4.n0(dialogC19130xf6f7b105));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new et4.o0(dialogC19130xf6f7b105), 500L);
        q0Var.f338189d = eVar.f423083b;
        re4.n.f(1);
    }

    @Override // nz2.d
    /* renamed from: onSuccess */
    public void mo14633xe05b4124(nz2.e eVar) {
        et4.q0 q0Var = this.f338184a;
        q0Var.f338190e.e();
        q0Var.f338189d = eVar.f423083b;
        q0Var.f338190e.dismiss();
        et4.r0 r0Var = q0Var.f338190e.f261761m;
        if (r0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.DialogC19129x966bbd2f dialogC19129x966bbd2f = ((et4.u) r0Var).f338195a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayCashierDialog", "verify succeeded: %s", java.lang.Boolean.valueOf(dialogC19129x966bbd2f.Q));
            if (!dialogC19129x966bbd2f.Q) {
                com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = dialogC19129x966bbd2f.L;
                com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.a2.a(c19760x34448d56 == null ? 0 : c19760x34448d56.f273642e, c19760x34448d56 == null ? "" : c19760x34448d56.f273647m, 22, "");
                com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d562 = dialogC19129x966bbd2f.L;
                c19760x34448d562.f273658x = 1;
                nz2.c cVar = eVar.f423084c;
                c19760x34448d562.A = cVar.f423078c;
                c19760x34448d562.B = cVar.f423079d;
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("json", eVar.f423084c.f423080e);
                    jSONObject.put("signature", eVar.f423084c.f423081f);
                    jSONObject.put("soter_type", ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().G());
                    dialogC19129x966bbd2f.L.G = jSONObject.toString();
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WcPayCashierDialog", e17, "", new java.lang.Object[0]);
                }
                com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d563 = dialogC19129x966bbd2f.L;
                c19760x34448d563.C = eVar.f423084c.f423077b;
                c19760x34448d563.D = eVar.f423083b;
                dialogC19129x966bbd2f.f261733d.setVisibility(0);
                dialogC19129x966bbd2f.E = null;
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.DialogC19129x966bbd2f.e(dialogC19129x966bbd2f, "", dialogC19129x966bbd2f.L, dialogC19129x966bbd2f.N);
            }
            q0Var.f338190e.f261761m = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1104, 37);
        re4.n.f(0);
    }
}
