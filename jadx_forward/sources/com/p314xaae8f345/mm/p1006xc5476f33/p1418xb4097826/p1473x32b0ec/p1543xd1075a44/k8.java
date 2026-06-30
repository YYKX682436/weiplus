package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class k8 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.t1 implements android.view.View.OnClickListener {
    public final qf2.z3 N;
    public fg2.h P;
    public boolean Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8(android.content.Context context, qf2.z3 controller) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
        this.N = controller;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int A() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dqv;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public android.view.View E(zl2.u4 uiMode) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiMode, "uiMode");
        return android.view.LayoutInflater.from(this.f199716e).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dqv, (android.view.ViewGroup) z(), false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int J() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void N(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        int i17 = com.p314xaae8f345.mm.R.id.f564553uh;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f564553uh);
        if (frameLayout != null) {
            i17 = com.p314xaae8f345.mm.R.id.che;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 c22645x24069159 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.che);
            if (c22645x24069159 != null) {
                i17 = com.p314xaae8f345.mm.R.id.rix;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c0 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.rix);
                if (c22661xa3a2b3c0 != null) {
                    i17 = com.p314xaae8f345.mm.R.id.qrl;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.C22644xc8fbf3b2 c22644xc8fbf3b2 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22644xc8fbf3b2) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.qrl);
                    if (c22644xc8fbf3b2 != null) {
                        i17 = com.p314xaae8f345.mm.R.id.in7;
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.in7);
                        if (c22699x3dcdb352 != null) {
                            i17 = com.p314xaae8f345.mm.R.id.rvy;
                            android.widget.TextView textView = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.rvy);
                            if (textView != null) {
                                i17 = com.p314xaae8f345.mm.R.id.mvb;
                                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c02 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.mvb);
                                if (c22661xa3a2b3c02 != null) {
                                    i17 = com.p314xaae8f345.mm.R.id.o3b;
                                    android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.o3b);
                                    if (textView2 != null) {
                                        this.P = new fg2.h((android.widget.RelativeLayout) rootView, frameLayout, c22645x24069159, c22661xa3a2b3c0, c22644xc8fbf3b2, c22699x3dcdb352, textView, c22661xa3a2b3c02, textView2);
                                        c22661xa3a2b3c02.setOnClickListener(this);
                                        fg2.h hVar = this.P;
                                        if (hVar == null) {
                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                            throw null;
                                        }
                                        hVar.f343592b.setOnClickListener(this);
                                        fg2.h hVar2 = this.P;
                                        if (hVar2 == null) {
                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                            throw null;
                                        }
                                        android.widget.TextView text = hVar2.f343594d;
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(text, "text");
                                        com.p314xaae8f345.mm.ui.fk.a(text);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i17)));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public boolean Q() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.t1, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void S() {
        super.S();
        if (this.Q) {
            i95.m c17 = i95.n0.c(zy2.zb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.z4 z4Var = ml2.z4.f409878b2;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("result", k0() ? 1 : 0);
            jSONObject.put("type", 2);
            zy2.zb.y6(zbVar, z4Var, jSONObject.toString(), null, 4, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.t1, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void V(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 e0Var, boolean z17, int i17) {
        super.V(e0Var, z17, i17);
        this.Q = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.t1
    public void l0(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0(), "mmPermissionCallback hadPermission: " + z17);
        i95.m c17 = i95.n0.c(zy2.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.z4 z4Var = ml2.z4.f409877a2;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("result", z17 ? 1 : 2);
        jSONObject.put("element", 3);
        zy2.zb.y6(zbVar, z4Var, jSONObject.toString(), null, 4, null);
        if (z17) {
            h0(true);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.W(this, null, false, 0, 7, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.t1
    public void m0(r45.ze2 location) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(location, "location");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.t(this, false, 1, null);
        java.lang.String str = this.H;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onGetLocationDone start set cmd");
        qf2.z3 z3Var = this.N;
        if (z3Var != null) {
            java.lang.String m75945x2fec8307 = location.m75945x2fec8307(2);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            z3Var.b7(m75945x2fec8307, str);
        }
        if (z3Var != null) {
            z3Var.a7(134217728, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.j8(this));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.t1
    public void n0(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0(), "systemPermissionCallback hadPermission: " + z17);
        i95.m c17 = i95.n0.c(zy2.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.z4 z4Var = ml2.z4.f409877a2;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("result", z17 ? 1 : 2);
        jSONObject.put("element", 2);
        zy2.zb.y6(zbVar, z4Var, jSONObject.toString(), null, 4, null);
        if (z17) {
            h0(true);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.W(this, null, false, 0, 7, null);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorVoiceLBSGuidePanel", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        fg2.h hVar = this.P;
        if (hVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        int id6 = hVar.f343593c.getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            i95.m c17 = i95.n0.c(zy2.zb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.z4 z4Var = ml2.z4.f409877a2;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", 1);
            jSONObject.put("element", 1);
            zy2.zb.y6(zbVar, z4Var, jSONObject.toString(), null, 4, null);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.n2.a()) {
                int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                android.content.Context context = this.f199716e;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
                e4Var.f293309c = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mlf);
                e4Var.c();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.H, "isGpsEnable false");
                yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorVoiceLBSGuidePanel", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            if (!k0()) {
                this.K = false;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.t(this, false, 1, null);
            }
            h0(true);
        } else {
            fg2.h hVar2 = this.P;
            if (hVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            int id7 = hVar2.f343592b.getId();
            if (valueOf != null && valueOf.intValue() == id7) {
                qf2.z3 z3Var = this.N;
                if (z3Var != null) {
                    z3Var.b7("", "DisableShow");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.t(this, false, 1, null);
                i95.m c18 = i95.n0.c(zy2.zb.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                zy2.zb zbVar2 = (zy2.zb) c18;
                ml2.z4 z4Var2 = ml2.z4.f409877a2;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("type", 2);
                jSONObject2.put("element", 1);
                zy2.zb.y6(zbVar2, z4Var2, jSONObject2.toString(), null, 4, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorVoiceLBSGuidePanel", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
