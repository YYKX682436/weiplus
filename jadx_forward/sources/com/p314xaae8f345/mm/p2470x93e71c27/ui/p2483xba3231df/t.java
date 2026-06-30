package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df;

/* loaded from: classes8.dex */
public final class t implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.v f272523a;

    public t(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.v vVar) {
        this.f272523a = vVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.q3
    /* renamed from: dismiss */
    public final void mo2069x63a3b28a() {
        int i17;
        jz5.f0 f0Var;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.v vVar = this.f272523a;
        kb0.g gVar = vVar.f272543k;
        if (gVar != null) {
            java.util.Set<com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w> set = gVar.f387738i;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(set, 10));
            for (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w wVar : set) {
                java.lang.Integer num = (java.lang.Integer) gVar.f387740k.get(gVar.b(wVar));
                if (num == null) {
                    num = -1;
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
                arrayList.add(gVar.c(wVar, num.intValue()));
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                java.lang.String str = (java.lang.String) next;
                if ((((str == null || str.length() == 0) ? 1 : 0) ^ 1) != 0) {
                    arrayList2.add(next);
                }
            }
            java.lang.String g07 = kz5.n0.g0(arrayList2, "#", null, null, 0, null, null, 62, null);
            jz5.l[] lVarArr = new jz5.l[3];
            lVarArr[0] = new jz5.l("install_app_name_list", (java.lang.String) ((jz5.n) gVar.f387736g).mo141623x754a37bb());
            lVarArr[1] = new jz5.l("expose_app_name_list", g07);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w wVar2 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w) kz5.n0.Z(gVar.f387732c);
            if (wVar2 != null && wVar2.f272552i) {
                i17 = 1;
            }
            lVarArr[2] = new jz5.l("has_forward_yuanbao", java.lang.Integer.valueOf(i17));
            java.util.HashMap i18 = kz5.c1.i(lVarArr);
            i18.putAll(gVar.f387734e);
            java.lang.String concat = "unexp app list: ".concat(g07);
            java.lang.String str2 = gVar.f387733d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, concat);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("share_sheet_app_panel", "view_unexp", i18, 35480);
            java.util.Iterator it6 = gVar.f387739j.iterator();
            while (it6.hasNext()) {
                wj.t0 t0Var = ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w) it6.next()).f272554n;
                if (t0Var != null) {
                    xj.m Ui = ((wj.j0) ((xj.i) i95.n0.c(xj.i.class))).Ui(t0Var);
                    if (Ui != null) {
                        i95.m c17 = i95.n0.c(xj.i.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                        xj.i.gg((xj.i) c17, Ui.f536286a, wj.w0.f528075e, null, 4, null);
                        f0Var = jz5.f0.f384359a;
                    } else {
                        f0Var = null;
                    }
                    if (f0Var == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "adInfo is null posId: " + t0Var);
                    }
                }
            }
        }
        vVar.f272543k = null;
    }
}
