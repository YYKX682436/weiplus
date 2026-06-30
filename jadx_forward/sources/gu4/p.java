package gu4;

/* loaded from: classes9.dex */
public class p implements com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f357490a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2388xadfce8e4.ui.ActivityC19200x9865b13c f357491b;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2388xadfce8e4.ui.ActivityC19200x9865b13c activityC19200x9865b13c, com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2388xadfce8e4.ui.ActivityC19200x9865b13c activityC19200x9865b13c2) {
        this.f357491b = activityC19200x9865b13c;
        this.f357490a = null;
        this.f357490a = new java.lang.ref.WeakReference(activityC19200x9865b13c2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.f
    public void a() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2388xadfce8e4.ui.ActivityC19200x9865b13c.C;
        com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2388xadfce8e4.ui.ActivityC19200x9865b13c activityC19200x9865b13c = this.f357491b;
        activityC19200x9865b13c.W6();
        activityC19200x9865b13c.d7();
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2388xadfce8e4.ui.ActivityC19200x9865b13c b() {
        java.lang.ref.WeakReference weakReference = this.f357490a;
        if (weakReference != null) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2388xadfce8e4.ui.ActivityC19200x9865b13c) weakReference.get();
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.f
    /* renamed from: onResult */
    public void mo11328x57429edc(int i17, java.lang.String str) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2388xadfce8e4.ui.ActivityC19200x9865b13c activityC19200x9865b13c = this.f357491b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerprintWalletLockUI", "onResult result: %d, errMsg: %s, isCancelled: %b", valueOf, str, java.lang.Boolean.valueOf(activityC19200x9865b13c.f262839y));
        java.lang.String str2 = activityC19200x9865b13c.f262826i;
        if (str2 != null && str2.equals("action.switch_on_pattern")) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7053xf3ca9650 c7053xf3ca9650 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7053xf3ca9650();
            c7053xf3ca9650.f143649d = 3L;
            c7053xf3ca9650.f143650e = 1L;
            c7053xf3ca9650.k();
        }
        java.lang.String str3 = activityC19200x9865b13c.f262826i;
        if (str3 != null && str3.equals("action.verify_pattern")) {
            int i18 = activityC19200x9865b13c.B;
            if (i18 == 1) {
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7053xf3ca9650 c7053xf3ca96502 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7053xf3ca9650();
                c7053xf3ca96502.f143649d = 7L;
                c7053xf3ca96502.f143650e = 1L;
                c7053xf3ca96502.k();
            } else if (i18 == 2) {
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7053xf3ca9650 c7053xf3ca96503 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7053xf3ca9650();
                c7053xf3ca96503.f143649d = 9L;
                c7053xf3ca96503.f143650e = 1L;
                c7053xf3ca96503.k();
            }
        }
        if (activityC19200x9865b13c.f262839y) {
            return;
        }
        if (i17 != 0) {
            if (i17 == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerprintWalletLockUI", "identify ERR_NO_MATCH");
                if (b() != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2388xadfce8e4.ui.ActivityC19200x9865b13c.T6(b(), i17, activityC19200x9865b13c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.knx));
                    return;
                }
                return;
            }
            if (i17 == 2) {
                if (b() != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2388xadfce8e4.ui.ActivityC19200x9865b13c.U6(b(), i17, activityC19200x9865b13c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.knq));
                    return;
                }
                return;
            }
            if (i17 == 3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerprintWalletLockUI", "on error: %d", java.lang.Integer.valueOf(i17));
                if (b() != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2388xadfce8e4.ui.ActivityC19200x9865b13c.U6(b(), i17, activityC19200x9865b13c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.knw));
                    return;
                }
                return;
            }
            if (i17 == 4) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerprintWalletLockUI", "user cancel");
                return;
            }
            if (i17 != 5) {
                if (i17 == 8 && b() != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2388xadfce8e4.ui.ActivityC19200x9865b13c.U6(b(), i17, activityC19200x9865b13c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575084ko5));
                    return;
                }
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerprintWalletLockUI", "identify TIMEOUT");
            if (b() != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2388xadfce8e4.ui.ActivityC19200x9865b13c.T6(b(), i17, activityC19200x9865b13c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.knx));
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerprintWalletLockUI", "identify success");
        if (b() != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2388xadfce8e4.ui.ActivityC19200x9865b13c b17 = b();
            com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.m.c(b17.B, 2, 0);
            zt5.s sVar = com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.l.instance.f262904e;
            if (sVar != null) {
                b17.f262833s = sVar.f557154b;
                if (b17.f262828n.equals("action.switch_on_pattern")) {
                    b17.f262828n = b17.f262827m;
                    b17.a7();
                } else if (b17.f262828n.equals("action.verify_pattern")) {
                    if (fu4.a.d(b17.f262833s)) {
                        b17.f262828n = b17.f262827m;
                        b17.a7();
                    } else {
                        b17.f7(2);
                    }
                }
            }
        }
        java.lang.String str4 = activityC19200x9865b13c.f262826i;
        if (str4 != null && str4.equals("action.switch_on_pattern")) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7053xf3ca9650 c7053xf3ca96504 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7053xf3ca9650();
            c7053xf3ca96504.f143649d = 3L;
            c7053xf3ca96504.f143650e = 2L;
            c7053xf3ca96504.k();
        }
        java.lang.String str5 = activityC19200x9865b13c.f262826i;
        if (str5 == null || !str5.equals("action.verify_pattern")) {
            return;
        }
        int i19 = activityC19200x9865b13c.B;
        if (i19 == 1) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7053xf3ca9650 c7053xf3ca96505 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7053xf3ca9650();
            c7053xf3ca96505.f143649d = 7L;
            c7053xf3ca96505.f143650e = 2L;
            c7053xf3ca96505.k();
            return;
        }
        if (i19 == 2) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7053xf3ca9650 c7053xf3ca96506 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7053xf3ca9650();
            c7053xf3ca96506.f143649d = 9L;
            c7053xf3ca96506.f143650e = 2L;
            c7053xf3ca96506.k();
        }
    }
}
