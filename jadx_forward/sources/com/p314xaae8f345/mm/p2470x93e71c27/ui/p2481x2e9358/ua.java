package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes15.dex */
public class ua implements com.p314xaae8f345.mm.p2470x93e71c27.ui.u3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ib f272220a;

    public ua(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ib ibVar) {
        this.f272220a = ibVar;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.u3
    public void a(java.lang.String[] strArr, java.util.List list) {
        if (strArr == null || strArr.length <= 0 || strArr[0].length() <= 0) {
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ib ibVar = this.f272220a;
        if (ibVar.H) {
            ibVar.H = false;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = ibVar.f271944n;
            if (c22621x7603e017 != null && c22621x7603e017.getText() != null && ibVar.f271944n.getText().length() > 0) {
                if (ibVar.I.equalsIgnoreCase("。") || ibVar.I.equalsIgnoreCase(".")) {
                    if (!ibVar.f271952u || ibVar.f271944n.getSelectionStart() >= ibVar.f271944n.getText().length()) {
                        ibVar.L.e(ibVar.f271944n, ibVar.I, true);
                        ibVar.L.c(ibVar.f271944n);
                    }
                    ibVar.I = "";
                }
                java.lang.String obj = ibVar.f271944n.getText().toString();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceInputPanel", "addPunctuation msg = %s,msg.length() = %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(obj), java.lang.Integer.valueOf(obj.length()));
            }
        }
        ibVar.L.e(ibVar.f271944n, strArr[0], true);
        if (ibVar.f271944n.getText().length() != 0) {
            ibVar.f271944n.setCursorVisible(true);
            ibVar.f271944n.requestFocus();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.t0(ibVar.f271936d);
        }
        if (!ibVar.B && strArr[0].length() != 0) {
            ibVar.B = true;
            ibVar.E = java.lang.System.currentTimeMillis();
            java.lang.System.currentTimeMillis();
            long j17 = ibVar.E;
            long j18 = ibVar.D;
        }
        ((java.util.ArrayList) ibVar.K).addAll(list);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.u3
    public void b() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ib ibVar = this.f272220a;
        ibVar.f271943m.c(false);
        ibVar.f271944n.setHint((java.lang.CharSequence) null);
        ibVar.f271940h.setVisibility((ibVar.T.size() < 2 || ibVar.f271944n.getText().length() > 0) ? 8 : 0);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6219xe6f3eb50 c6219xe6f3eb50 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6219xe6f3eb50();
        c6219xe6f3eb50.f136468g.f89034a = false;
        c6219xe6f3eb50.e();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.u3
    public void c() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ib ibVar = this.f272220a;
        ibVar.D = currentTimeMillis;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceInputPanel", "VoiceDetectListener onDetectStart time %s", java.lang.Long.valueOf(currentTimeMillis));
        ibVar.k(false);
        ibVar.B = false;
        ibVar.C = true;
        ibVar.H = true;
        ibVar.E = 0L;
        ibVar.o();
        ibVar.C = false;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.o3 o3Var = ibVar.L;
        o3Var.f272455h = 3;
        o3Var.c(ibVar.f271944n);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceInputPanel", "pauseMusic");
        ym1.f.f544667h.m();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = ibVar.f271944n;
        if (c22621x7603e017 != null) {
            if (c22621x7603e017.getText() != null && ibVar.f271944n.getText().length() > 0) {
                ibVar.f271944n.setCursorVisible(true);
            }
            ibVar.f271944n.requestFocus();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.t0(ibVar.f271936d);
        }
        android.content.Context context = ibVar.f271950s;
        if (context instanceof android.app.Activity) {
            ((android.app.Activity) context).getWindow().addFlags(128);
        }
        ibVar.f271939g.setVisibility(8);
        ibVar.f271937e.setVisibility(8);
        ibVar.f271938f.setVisibility(8);
        ibVar.f271944n.setHint(ibVar.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.k9b));
        ibVar.f271943m.c(true);
        ibVar.f271940h.setVisibility(8);
        ibVar.l(1);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6219xe6f3eb50 c6219xe6f3eb50 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6219xe6f3eb50();
        c6219xe6f3eb50.f136468g.f89034a = true;
        c6219xe6f3eb50.e();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.u3
    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceInputPanel", "VoiceDetectListener onStateReset time %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ib ibVar = this.f272220a;
        ibVar.L.d(ibVar.f271944n);
        ibVar.o();
        android.content.Context context = ibVar.f271950s;
        if (context instanceof android.app.Activity) {
            ((android.app.Activity) context).getWindow().clearFlags(128);
        }
        ibVar.g(3);
        ibVar.f271943m.c(false);
        ibVar.f271944n.setHint((java.lang.CharSequence) null);
        ibVar.k(true);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6219xe6f3eb50 c6219xe6f3eb50 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6219xe6f3eb50();
        c6219xe6f3eb50.f136468g.f89034a = false;
        c6219xe6f3eb50.e();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.u3
    public void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceInputPanel", "VoiceDetectListener onDetectFinish  time %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ib ibVar = this.f272220a;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ib.c(ibVar);
        ibVar.L.d(ibVar.f271944n);
        ibVar.o();
        android.content.Context context = ibVar.f271950s;
        if (context instanceof android.app.Activity) {
            ((android.app.Activity) context).getWindow().clearFlags(128);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17189xc14104a c17189xc14104a = new com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17189xc14104a();
        c17189xc14104a.f37850x2fd71e = 1;
        ibVar.i(c17189xc14104a);
        ibVar.g(1);
        ibVar.f271943m.c(false);
        ibVar.f271944n.setHint((java.lang.CharSequence) null);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6219xe6f3eb50 c6219xe6f3eb50 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6219xe6f3eb50();
        c6219xe6f3eb50.f136468g.f89034a = false;
        c6219xe6f3eb50.e();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.u3
    public void f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceInputPanel", "VoiceDetectListener onDetectCancel time " + java.lang.System.currentTimeMillis());
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ib ibVar = this.f272220a;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ib.c(ibVar);
        ibVar.L.d(ibVar.f271944n);
        ibVar.o();
        android.content.Context context = ibVar.f271950s;
        if (context instanceof android.app.Activity) {
            ((android.app.Activity) context).getWindow().clearFlags(128);
        }
        ibVar.g(2);
        ibVar.f271943m.c(false);
        ibVar.f271944n.setHint((java.lang.CharSequence) null);
        ibVar.f271940h.setVisibility((ibVar.T.size() < 2 || ibVar.f271944n.getText().length() > 0) ? 8 : 0);
        ibVar.k(true);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6219xe6f3eb50 c6219xe6f3eb50 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6219xe6f3eb50();
        c6219xe6f3eb50.f136468g.f89034a = false;
        c6219xe6f3eb50.e();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.u3
    public void g(int i17, int i18, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceInputPanel", "VoiceDetectListener onDetectError localerrorType = %s errorType = %s errCode = %s time %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ib ibVar = this.f272220a;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ib.c(ibVar);
        ibVar.L.d(ibVar.f271944n);
        ibVar.o();
        android.content.Context context = ibVar.f271950s;
        if (context instanceof android.app.Activity) {
            ((android.app.Activity) context).getWindow().clearFlags(128);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17189xc14104a c17189xc14104a = new com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17189xc14104a();
        c17189xc14104a.f37850x2fd71e = i17;
        ibVar.i(c17189xc14104a);
        ibVar.g(i17);
        if (i17 == 12) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ib.a(ibVar, com.p314xaae8f345.mm.R.C30867xcad56011.k9c);
        } else {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ib.a(ibVar, com.p314xaae8f345.mm.R.C30867xcad56011.f571924to);
        }
        ibVar.f271943m.c(false);
        ibVar.f271944n.setHint((java.lang.CharSequence) null);
        ibVar.k(true);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6219xe6f3eb50 c6219xe6f3eb50 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6219xe6f3eb50();
        c6219xe6f3eb50.f136468g.f89034a = false;
        c6219xe6f3eb50.e();
    }
}
