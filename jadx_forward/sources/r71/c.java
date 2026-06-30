package r71;

/* loaded from: classes12.dex */
public class c implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f474657d;

    /* renamed from: e, reason: collision with root package name */
    public r71.a f474658e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashSet f474659f = new java.util.HashSet();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashSet f474660g = new java.util.HashSet();

    /* renamed from: h, reason: collision with root package name */
    public android.app.Dialog f474661h = null;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Set f474662i = new java.util.HashSet();

    public c(android.content.Context context, r71.a aVar) {
        this.f474658e = null;
        this.f474657d = context;
        this.f474658e = aVar;
    }

    public void a(int i17) {
        ((java.util.HashSet) this.f474662i).add(java.lang.Integer.valueOf(i17));
        c01.d9.e().a(i17, this);
    }

    public void b(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, boolean z17) {
        android.app.Dialog dialog;
        this.f474660g.add(m1Var);
        if (z17 && ((dialog = this.f474661h) == null || (dialog != null && !dialog.isShowing()))) {
            android.app.Dialog dialog2 = this.f474661h;
            if (dialog2 != null) {
                dialog2.dismiss();
            }
            this.f474661h = db5.e1.Q(this.f474657d, "", "", true, true, new r71.b(this));
        }
        c01.d9.e().g(m1Var);
    }

    public void c(int i17) {
        c01.d9.e().q(i17, this);
        java.util.Set set = this.f474662i;
        ((java.util.HashSet) set).remove(java.lang.Integer.valueOf(i17));
        if (((java.util.HashSet) set).isEmpty()) {
            android.app.Dialog dialog = this.f474661h;
            if (dialog != null) {
                dialog.dismiss();
                this.f474661h = null;
            }
            java.util.HashSet hashSet = this.f474659f;
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                c01.d9.e().d((com.p314xaae8f345.mm.p944x882e457a.m1) it.next());
            }
            java.util.HashSet hashSet2 = this.f474660g;
            java.util.Iterator it6 = hashSet2.iterator();
            while (it6.hasNext()) {
                c01.d9.e().d((com.p314xaae8f345.mm.p944x882e457a.m1) it6.next());
            }
            hashSet.clear();
            hashSet2.clear();
            this.f474658e = null;
            this.f474657d = null;
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        boolean z17;
        r71.a aVar;
        android.app.Dialog dialog;
        java.util.HashSet hashSet = this.f474660g;
        boolean contains = hashSet.contains(m1Var);
        java.util.HashSet hashSet2 = this.f474659f;
        boolean z18 = false;
        if (contains) {
            hashSet.remove(m1Var);
        } else {
            if (!hashSet2.contains(m1Var)) {
                z17 = false;
                if (hashSet.isEmpty() && hashSet2.isEmpty() && (dialog = this.f474661h) != null) {
                    dialog.dismiss();
                    this.f474661h = null;
                }
                if (z17 || (aVar = this.f474658e) == null) {
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11497x3bc191a activityC11497x3bc191a = (com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11497x3bc191a) aVar;
                activityC11497x3bc191a.f156027m.mo815x76e0bfae(i17, i18, str, m1Var);
                if (i17 != 0 || i18 != 0) {
                    if (m1Var.mo808xfb85f7b0() == 419 && i18 == -3103) {
                        db5.e1.K(activityC11497x3bc191a, true, str, "", activityC11497x3bc191a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571397dv), activityC11497x3bc191a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.s2(activityC11497x3bc191a), new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.t2(activityC11497x3bc191a));
                        return;
                    }
                    return;
                }
                if (m1Var.mo808xfb85f7b0() == 417) {
                    if (((q71.o) m1Var).f441890f) {
                        android.view.View findViewById = activityC11497x3bc191a.m78513xc2a54588().findViewById(com.p314xaae8f345.mm.R.id.f564267me);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(0);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(findViewById, "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        activityC11497x3bc191a.V6();
                        if (activityC11497x3bc191a.f156032r && ((java.util.LinkedList) activityC11497x3bc191a.f156021d).size() == 0) {
                            android.content.Intent intent = new android.content.Intent();
                            intent.setClass(activityC11497x3bc191a, com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11495xd59e7ca0.class);
                            activityC11497x3bc191a.startActivityForResult(intent, 1);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (m1Var.mo808xfb85f7b0() == 416) {
                    o71.l.wi();
                    s71.b a17 = o71.l.Bi().a(((q71.p) m1Var).f441893f);
                    if (a17 != null) {
                        o71.l.wi();
                        q71.f0 Bi = o71.l.Bi();
                        if (Bi.f441872a == null) {
                            Bi.f441872a = new s71.a();
                        }
                        int i19 = 0;
                        while (true) {
                            if (i19 >= Bi.f441872a.f485502d.size()) {
                                break;
                            }
                            if (((s71.b) Bi.f441872a.f485502d.get(i19)).f485503d == a17.f485503d) {
                                Bi.f441872a.f485502d.remove(i19);
                                z18 = true;
                                break;
                            }
                            i19++;
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSelectAddrUI", "delte addr " + z18);
                    }
                    activityC11497x3bc191a.V6();
                    return;
                }
                if (m1Var.mo808xfb85f7b0() == 419) {
                    s71.b bVar = activityC11497x3bc191a.f156024g;
                    if (bVar != null) {
                        activityC11497x3bc191a.setResult(-1, t71.a.a(bVar));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSelectAddrUI", "[setResult] OK, address selected");
                        activityC11497x3bc191a.finish();
                        return;
                    }
                    return;
                }
                if (m1Var.mo808xfb85f7b0() == 582) {
                    java.lang.String string = activityC11497x3bc191a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571472g2);
                    int i27 = ((q71.n) m1Var).f441885d;
                    if (i27 == 0) {
                        c01.d9.b().p().w(196657, java.lang.Boolean.TRUE);
                        activityC11497x3bc191a.f156029o.setVisibility(8);
                        activityC11497x3bc191a.V6();
                        android.view.View m78513xc2a54588 = activityC11497x3bc191a.m78513xc2a54588();
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                        arrayList2.add(0);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(m78513xc2a54588, arrayList2.toArray(), "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        m78513xc2a54588.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(m78513xc2a54588, "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        java.lang.String string2 = activityC11497x3bc191a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571474g4);
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = activityC11497x3bc191a.f156037w;
                        if (j0Var != null) {
                            j0Var.dismiss();
                        }
                        activityC11497x3bc191a.f156037w = db5.e1.G(activityC11497x3bc191a, string2, null, true, null);
                        return;
                    }
                    if (i27 == 1 || i27 == 2) {
                        c01.d9.b().p().w(196657, java.lang.Boolean.TRUE);
                        activityC11497x3bc191a.f156029o.setVisibility(8);
                        java.lang.String string3 = activityC11497x3bc191a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571473g3);
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var2 = activityC11497x3bc191a.f156037w;
                        if (j0Var2 != null) {
                            j0Var2.dismiss();
                        }
                        activityC11497x3bc191a.f156037w = db5.e1.G(activityC11497x3bc191a, string3, null, true, null);
                        return;
                    }
                    if (i27 != 3) {
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var3 = activityC11497x3bc191a.f156037w;
                        if (j0Var3 != null) {
                            j0Var3.dismiss();
                        }
                        activityC11497x3bc191a.f156037w = db5.e1.G(activityC11497x3bc191a, string, null, true, null);
                        return;
                    }
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5728x615a84ab c5728x615a84ab = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5728x615a84ab();
                    am.ok okVar = c5728x615a84ab.f136050g;
                    okVar.f89086a = activityC11497x3bc191a;
                    okVar.f89087b = new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.r2(activityC11497x3bc191a, c5728x615a84ab);
                    c5728x615a84ab.b(android.os.Looper.myLooper());
                    return;
                }
                return;
            }
            hashSet2.remove(m1Var);
        }
        z17 = true;
        if (hashSet.isEmpty()) {
            dialog.dismiss();
            this.f474661h = null;
        }
        if (z17) {
        }
    }
}
