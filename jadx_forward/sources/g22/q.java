package g22;

/* loaded from: classes15.dex */
public final class q implements i22.p0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.AbstractC13361x415b318 f349388a;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.AbstractC13361x415b318 abstractC13361x415b318) {
        this.f349388a = abstractC13361x415b318;
    }

    @Override // i22.o0
    public void a(i22.m holder, int i17, i22.n0 n0Var) {
        byte[] bArr;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (n0Var == null) {
            return;
        }
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.AbstractC13361x415b318.C;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.AbstractC13361x415b318 abstractC13361x415b318 = this.f349388a;
        abstractC13361x415b318.m0().getClass();
        int mo134661xfb85f7b0 = n0Var.mo134661xfb85f7b0();
        if (mo134661xfb85f7b0 == 1) {
            i22.m0 m0Var = n0Var instanceof i22.m0 ? (i22.m0) n0Var : null;
            j12.i iVar = m0Var != null ? m0Var.f369537a : null;
            if (iVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(abstractC13361x415b318.f179945d, "click Failed, type:1");
                return;
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6419xd51df726 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.b();
            i22.q x17 = abstractC13361x415b318.m0().x(i17);
            if (x17 != null) {
                b17.p(java.lang.String.valueOf(i17 - x17.f369543a));
                b17.f137609j = x17.f369545c;
            }
            b17.f137603d = j22.a.f378782a;
            b17.f137604e = 1;
            b17.f137605f = 3;
            b17.u(iVar.f378700b.f473661d);
            b17.q(iVar.f378700b.f473663f);
            b17.r(java.lang.String.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.l(iVar.f378700b.D)));
            b17.t(java.lang.String.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.n(iVar.f378700b.D)));
            b17.s(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.m(iVar.f378700b.D));
            b17.v(iVar.f378709k);
            b17.k();
            y12.m.c(abstractC13361x415b318.mo7438x76847179(), iVar.f378700b, false, 1, iVar.f378704f, iVar.f378703e, abstractC13361x415b318.f179959u, 5, b17, false);
            return;
        }
        if (mo134661xfb85f7b0 != 6) {
            if (mo134661xfb85f7b0 == 3) {
                i22.a1 a1Var = n0Var instanceof i22.a1 ? (i22.a1) n0Var : null;
                r45.kj0 kj0Var = a1Var != null ? a1Var.f369459b : null;
                if (kj0Var != null) {
                    y12.m.f(abstractC13361x415b318.mo7438x76847179(), kj0Var.f460262g, kj0Var.f460260e, kj0Var.f460266n, kj0Var.f460265m, kj0Var.f460263h, a1Var.f369461d + 10000);
                    return;
                }
                return;
            }
            if (mo134661xfb85f7b0 != 4) {
                return;
            }
            i22.c1 c1Var = n0Var instanceof i22.c1 ? (i22.c1) n0Var : null;
            r45.ri0 ri0Var = c1Var != null ? c1Var.f369485a : null;
            if (ri0Var != null) {
                android.app.Activity mo7438x76847179 = abstractC13361x415b318.mo7438x76847179();
                if (mo7438x76847179 != null) {
                    k22.g d17 = n22.f.d(n22.f.f415823a, mo7438x76847179, n22.m.i(ri0Var), true, null, null, null, 0, 0L, c1Var.f369486b + 10000, 0, 0L, null, null, null, null, 32504, null);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ri0Var.f466434v)) {
                        java.lang.String StoreMeaning = ri0Var.f466434v;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(StoreMeaning, "StoreMeaning");
                        d17.d(StoreMeaning);
                    }
                }
                j22.a.e(ri0Var, 0, 3, 0L, c1Var.f369486b + 10000);
                return;
            }
            return;
        }
        i22.k0 k0Var = n0Var instanceof i22.k0 ? (i22.k0) n0Var : null;
        if (k0Var == null || (bArr = k0Var.f369529b) == null) {
            return;
        }
        android.app.Activity mo7438x768471792 = abstractC13361x415b318.mo7438x76847179();
        java.lang.String str = k0Var.f369530c;
        int i19 = k0Var.f369531d + 10000;
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.t().booleanValue()) {
            ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(mo7438x768471792);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(mo7438x768471792, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.ActivityC13368x4f5eb0ab.class);
        intent.putExtra("topic_name", str);
        intent.putExtra("emotion_list_buf", bArr);
        intent.putExtra("entrance_scene", i19);
        intent.putExtra("extra_ip_set_key", (java.lang.String) null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mo7438x768471792, arrayList.toArray(), "com/tencent/mm/plugin/emoji/mgr/EmojiUINavigatorMgr", "startV3TopicEmotionList", "(Landroid/content/Context;Ljava/lang/String;[BILjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        mo7438x768471792.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(mo7438x768471792, "com/tencent/mm/plugin/emoji/mgr/EmojiUINavigatorMgr", "startV3TopicEmotionList", "(Landroid/content/Context;Ljava/lang/String;[BILjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // i22.p0
    public void b(i22.m holder, int i17, i22.n0 n0Var) {
        j12.i iVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (n0Var != null && n0Var.mo134661xfb85f7b0() == 1) {
            i22.v vVar = (i22.v) holder;
            i22.m0 m0Var = n0Var instanceof i22.m0 ? (i22.m0) n0Var : null;
            if (m0Var == null || (iVar = m0Var.f369537a) == null) {
                return;
            }
            int i18 = iVar.f378704f;
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.AbstractC13361x415b318.C;
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.AbstractC13361x415b318 abstractC13361x415b318 = this.f349388a;
            i22.q x17 = abstractC13361x415b318.m0().x(i17);
            if (i18 == 9) {
                java.lang.String m7467x2fec8307 = abstractC13361x415b318.m7467x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572116z4);
                if (abstractC13361x415b318.m78397x697ca065()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(abstractC13361x415b318.f179945d, "[showLoadingDialog] activity is finished.");
                } else {
                    abstractC13361x415b318.f179953o = db5.e1.Q(abstractC13361x415b318.mo78409x676b27cd(), abstractC13361x415b318.m7467x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), m7467x2fec8307, true, true, g22.t.f349400d);
                }
            }
            if (vVar.K == null) {
                vVar.K = abstractC13361x415b318.n0().f349356e;
            }
            if (vVar.f369571J == null) {
                i22.b0 b0Var = new i22.b0();
                b0Var.f369467c = abstractC13361x415b318.mo78409x676b27cd();
                b0Var.f369468d = vVar;
                b0Var.f369469e = abstractC13361x415b318.n0().f349356e;
                b0Var.f369470f = x17 != null ? x17.f369545c : 0;
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6419xd51df726 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.b();
                b17.f137604e = 1;
                b17.f137603d = j22.a.f378782a;
                if (x17 != null) {
                    b17.p(java.lang.String.valueOf(i17 - x17.f369543a));
                    b17.f137609j = x17.f369545c;
                }
                b0Var.f369477m = b17;
                b0Var.f369473i = abstractC13361x415b318;
                if (abstractC13361x415b318.q0()) {
                    boolean z17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.o.a().f179121d;
                }
                vVar.f369571J = b0Var;
            }
            i22.b0 b0Var2 = vVar.f369571J;
            abstractC13361x415b318.f179954p = b0Var2;
            if (b0Var2 != null) {
                b0Var2.b();
            }
        }
    }
}
