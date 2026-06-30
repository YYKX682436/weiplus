package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6;

/* loaded from: classes7.dex */
public final class w implements nh1.b {
    public static final void d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6.w wVar, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var, int i17, java.lang.String str) {
        wVar.getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = k91.d1.f387094a;
        k91.d1.f387094a.putInt(str + "_FrameCaptureMode", i17);
        d75.b.g(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6.r(context, n7Var));
    }

    @Override // nh1.b
    public void a(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, java.lang.String str) {
        ce.g gVar;
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 pageView = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) v5Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageView, "pageView");
        if (str == null) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = k91.d1.f387094a;
        int i18 = k91.d1.f387094a.getInt(str.concat("_FrameCaptureMode"), 0);
        boolean c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11539x905d5b94.c(pageView);
        if (i18 == 0) {
            android.view.LayoutInflater.from(context);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, false);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            new java.util.ArrayList();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6.s sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6.s(c17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6.t tVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6.t(this, context, pageView, str);
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                db5.h4 h4Var = (db5.h4) ((android.view.MenuItem) it.next());
                h4Var.f309914y = null;
                h4Var.f309915z = null;
            }
            arrayList.clear();
            db5.g4 g4Var = new db5.g4(context);
            sVar.mo887xc459429a(g4Var);
            if (g4Var.z()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMSubMenuHelper", "show, menu empty");
                return;
            }
            k0Var.f293405n = sVar;
            k0Var.f293414s = tVar;
            k0Var.f293387d = null;
            k0Var.G = null;
            k0Var.v();
            return;
        }
        ae.r rVar = (ae.r) pageView.U1().z1(ae.r.class);
        if (rVar == null || (gVar = (ce.g) pageView.B1(ce.g.class)) == null) {
            return;
        }
        if (c17) {
            com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 c4216x654bedf2 = ((ce.o) gVar).f122219g;
            if (c4216x654bedf2 == null) {
                return;
            } else {
                i17 = c4216x654bedf2.getCanvasId();
            }
        } else {
            i17 = 0;
        }
        int h17 = rVar.h();
        android.view.LayoutInflater.from(context);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, false);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        new java.util.ArrayList();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6.u uVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6.u(c17, h17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6.v vVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6.v(this, context, pageView, str, rVar, gVar, i17);
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            db5.h4 h4Var2 = (db5.h4) ((android.view.MenuItem) it6.next());
            h4Var2.f309914y = null;
            h4Var2.f309915z = null;
        }
        arrayList2.clear();
        db5.g4 g4Var2 = new db5.g4(context);
        uVar.mo887xc459429a(g4Var2);
        if (g4Var2.z()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMSubMenuHelper", "show, menu empty");
            return;
        }
        k0Var2.f293405n = uVar;
        k0Var2.f293414s = vVar;
        k0Var2.f293387d = null;
        k0Var2.G = null;
        k0Var2.v();
    }

    @Override // nh1.b
    public java.lang.String b(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 pageView = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) v5Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageView, "pageView");
        return "Frame Capture";
    }

    @Override // nh1.b
    public boolean c(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 pageView = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) v5Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageView, "pageView");
        int i17 = com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83.f130109j;
        return false;
    }
}
