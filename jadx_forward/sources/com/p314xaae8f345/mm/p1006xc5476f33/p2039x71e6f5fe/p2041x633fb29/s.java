package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29;

/* loaded from: classes12.dex */
public class s extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.String f240544i;

    /* renamed from: m, reason: collision with root package name */
    public static android.app.Activity f240545m;

    /* renamed from: n, reason: collision with root package name */
    public static e04.p f240546n;

    /* renamed from: d, reason: collision with root package name */
    public e04.f f240547d;

    /* renamed from: e, reason: collision with root package name */
    public final rz3.e f240548e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f240549f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f240550g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f240551h;

    public s() {
        super(0);
        this.f240548e = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.r(this);
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f240549f = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5292x67f91197>(a0Var) { // from class: com.tencent.mm.plugin.scanner.model.ExternRequestDealQBarStrHandler$2
            {
                this.f39173x3fe91575 = 1907055527;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5292x67f91197 c5292x67f91197) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5292x67f91197 c5292x67f911972 = c5292x67f91197;
                if (c5292x67f911972 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.s.b();
                    am.r3 r3Var = c5292x67f911972.f135612g;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.s.f240544i = r3Var.f89313a;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.s.f240545m = r3Var.f89314b;
                    com.p314xaae8f345.p2891x34da02.C25309x51dbc9ab c25309x51dbc9ab = new com.p314xaae8f345.p2891x34da02.C25309x51dbc9ab(r3Var.f89325m, r3Var.f89326n, r3Var.f89327o);
                    if (r3Var.f89324l == null) {
                        r3Var.f89324l = new android.os.Bundle();
                    }
                    r3Var.f89324l.putInt("result_image_height", r3Var.f89331s);
                    r3Var.f89324l.putInt("result_image_width", r3Var.f89330r);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17258x2152d807 c17258x2152d807 = r3Var.f89329q;
                    if (c17258x2152d807 != null) {
                        r3Var.f89324l.putParcelable("result_normalize_rect", c17258x2152d807);
                        c25309x51dbc9ab.b(r3Var.f89329q, r3Var.f89330r, r3Var.f89331s);
                    } else {
                        r3Var.f89324l.putParcelable("result_normalize_rect", new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17258x2152d807(0.0f, 0.0f, 1.0f, 1.0f));
                        c25309x51dbc9ab.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17258x2152d807(0.0f, 0.0f, 1.0f, 1.0f), r3Var.f89330r, r3Var.f89331s);
                    }
                    r3Var.f89324l.putString("result_image_path", r3Var.f89325m);
                    r3Var.f89324l.putInt("result_image_source", 2);
                    android.app.Activity activity = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.s.f240545m;
                    if (activity instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
                        ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activity).mo273xed6858b4().a(new p012xc85e97e9.p093xedfae76a.x(this) { // from class: com.tencent.mm.plugin.scanner.model.ExternRequestDealQBarStrHandler$2.1
                            @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
                            /* renamed from: onDestroy */
                            public void m68559xac79a11b() {
                                android.app.Activity activity2 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.s.f240545m;
                                if (activity2 == null) {
                                    return;
                                }
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExternRequestDealQBarStrHandler", "auto release for %s", activity2.getClass().getName());
                                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5899x1c237e c5899x1c237e = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5899x1c237e();
                                c5899x1c237e.f136205g.f88979a = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.s.f240545m;
                                c5899x1c237e.e();
                            }
                        });
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExternRequestDealQBarStrHandler", "request deal qbar, activity:%s, str:%s, codeType %d, codeVersion: %s, from : %d", com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.s.f240545m, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.s.f240544i, java.lang.Integer.valueOf(r3Var.f89315c), java.lang.Integer.valueOf(r3Var.f89316d), java.lang.Integer.valueOf(r3Var.f89319g));
                    boolean b17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.j1.b(r3Var.f89315c);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.s sVar = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.s.this;
                    if (b17) {
                        e04.p pVar = new e04.p();
                        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.s.f240546n = pVar;
                        pVar.A = r3Var.f89317e;
                        pVar.B = r3Var.f89322j;
                        pVar.C = r3Var.f89323k;
                        java.lang.String str = r3Var.f89318f;
                        android.os.Bundle bundle = r3Var.f89324l;
                        if (bundle != null && bundle.getString("stat_send_msg_user") != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.s.f240546n.F = r3Var.f89324l.getString("stat_send_msg_user");
                        }
                        int i17 = r3Var.f89319g;
                        if (i17 < 0) {
                            i17 = 2;
                        }
                        int i18 = r3Var.f89321i;
                        if (i18 > 0) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.s.f240546n.E = i18;
                        }
                        if (i17 == 3) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.s.f240546n.D = r3Var.f89320h;
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.s.f240546n.g(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.s.f240545m, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.s.f240544i, 0, i17, i18, "", r3Var.f89315c, r3Var.f89316d, sVar.f240548e, null, r3Var.f89324l, false, -1, false, c25309x51dbc9ab, r3Var.f89328p);
                    } else {
                        e04.f fVar = new e04.f(c25309x51dbc9ab);
                        sVar.f240547d = fVar;
                        android.app.Activity activity2 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.s.f240545m;
                        rz3.e eVar = sVar.f240548e;
                        int i19 = r3Var.f89315c;
                        java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.s.f240544i;
                        int i27 = r3Var.f89316d;
                        android.os.Bundle bundle2 = r3Var.f89324l;
                        r45.db0 db0Var = r3Var.f89328p;
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                            fVar.f327431e = activity2;
                            fVar.f327432f = bundle2;
                            fVar.f327442s = eVar;
                            fVar.f327440q = false;
                            nz3.c.a(new oz3.e(0, 0, str2, i19, 0, db0Var != null ? db0Var.f453815e : null, c25309x51dbc9ab, oz3.f.f431798e));
                            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.f0 f0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.f0(i19, str2, i27, 2, 0, (r45.im) null);
                            gm0.j1.d().a(1061, fVar);
                            gm0.j1.d().g(f0Var);
                            fVar.d(activity2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hq_), new e04.c(fVar, f0Var));
                        }
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExternRequestDealQBarStrHandler", "event is null or not a DealQBarStrEvent instance");
                }
                return false;
            }
        };
        this.f240550g = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5225x893b831>(this, a0Var) { // from class: com.tencent.mm.plugin.scanner.model.ExternRequestDealQBarStrHandler$3
            {
                this.f39173x3fe91575 = 1615476289;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5225x893b831 c5225x893b831) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5225x893b831 c5225x893b8312 = c5225x893b831;
                if (c5225x893b8312 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExternRequestDealQBarStrHandler", "event is null or not a CancelDealQBarStrEvent instance");
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExternRequestDealQBarStrHandler", "cancel deal qbar, activity:%s, str:%s", com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.s.f240545m, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.s.f240544i);
                am.p1 p1Var = c5225x893b8312.f135558g;
                if (p1Var.f89127b == com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.s.f240545m && p1Var.f89126a.equals(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.s.f240544i)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.s.b();
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExternRequestDealQBarStrHandler", "not same as string that are dealing");
                return false;
            }
        };
        this.f240551h = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5899x1c237e>(a0Var) { // from class: com.tencent.mm.plugin.scanner.model.ExternRequestDealQBarStrHandler$4
            {
                this.f39173x3fe91575 = -1623890066;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5899x1c237e c5899x1c237e) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5899x1c237e c5899x1c237e2 = c5899x1c237e;
                if (c5899x1c237e2 == null) {
                    return false;
                }
                am.nq nqVar = c5899x1c237e2.f136205g;
                if (nqVar.f88979a != com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.s.f240545m) {
                    return false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.s.f240545m = null;
                e04.p pVar = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.s.f240546n;
                if (pVar != null && pVar.j() == nqVar.f88979a) {
                    e04.p pVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.s.f240546n;
                    java.lang.ref.WeakReference weakReference = pVar2.f327576d;
                    if (weakReference != null) {
                        weakReference.clear();
                        pVar2.f327576d = null;
                    }
                    android.app.ProgressDialog progressDialog = pVar2.f327591v;
                    if (progressDialog != null) {
                        progressDialog.dismiss();
                    }
                    pVar2.f327591v = null;
                }
                e04.f fVar = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.s.this.f240547d;
                if (fVar == null || fVar.f327431e != nqVar.f88979a) {
                    return false;
                }
                fVar.f327431e = null;
                android.app.ProgressDialog progressDialog2 = fVar.f327430d;
                if (progressDialog2 != null) {
                    progressDialog2.dismiss();
                }
                fVar.f327430d = null;
                return false;
            }
        };
    }

    public static void b() {
        e04.p pVar = f240546n;
        if (pVar != null) {
            pVar.d();
            f240546n = null;
        }
        f240545m = null;
        f240544i = null;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        if (abstractC20979x809547d1 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5292x67f91197) {
            return this.f240549f.mo1xf5bc2045((com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5292x67f91197) abstractC20979x809547d1);
        }
        if (abstractC20979x809547d1 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5225x893b831) {
            return this.f240550g.mo1xf5bc2045((com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5225x893b831) abstractC20979x809547d1);
        }
        if (abstractC20979x809547d1 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5899x1c237e) {
            return this.f240551h.mo1xf5bc2045((com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5899x1c237e) abstractC20979x809547d1);
        }
        return false;
    }
}
