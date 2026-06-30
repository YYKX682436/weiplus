package nx1;

/* loaded from: classes12.dex */
public class z implements mx1.c {

    /* renamed from: f, reason: collision with root package name */
    public static int f422862f;

    /* renamed from: g, reason: collision with root package name */
    public static android.util.DisplayMetrics f422863g;

    /* renamed from: b, reason: collision with root package name */
    public final kx1.a f422865b;

    /* renamed from: a, reason: collision with root package name */
    public final transient java.util.ArrayList f422864a = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public mx1.b f422866c = null;

    /* renamed from: d, reason: collision with root package name */
    public boolean f422867d = false;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View.OnKeyListener f422868e = new nx1.y(this);

    public z(kx1.a aVar) {
        this.f422865b = aVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1 abstractActivityC13156x6363e8e1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1) aVar;
        o25.n1.a(abstractActivityC13156x6363e8e1.mo55332x76847179());
        com.p314xaae8f345.mm.ui.bk.q(abstractActivityC13156x6363e8e1.mo55332x76847179());
        f422862f = com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.f(abstractActivityC13156x6363e8e1.mo55332x76847179())[0];
        android.util.DisplayMetrics displayMetrics = abstractActivityC13156x6363e8e1.mo55332x76847179().getResources().getDisplayMetrics();
        f422863g = displayMetrics;
        android.util.TypedValue.applyDimension(1, 8.0f, displayMetrics);
        px1.k.f440358h = 0.0f;
    }

    public static boolean a(nx1.z zVar, com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a c13158x154ec45a, int i17) {
        zVar.getClass();
        int selectionStart = c13158x154ec45a.getSelectionStart();
        if (selectionStart != c13158x154ec45a.getSelectionEnd()) {
            return false;
        }
        if (selectionStart == c13158x154ec45a.m54591x80562c().f422848d) {
            c13158x154ec45a.K = true;
            px1.s sVar = px1.v.f440394b;
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            zVar.d(sVar, bool);
            zVar.d(px1.v.f440395c, bool);
            zVar.d(px1.v.f440396d, bool);
            zVar.d(px1.v.f440393a, bool);
            qx1.q qVar = (qx1.q) zVar.f422866c;
            qVar.f448850k = false;
            qVar.f448844e.setPressed(false);
            qx1.q qVar2 = (qx1.q) zVar.f422866c;
            qVar2.f448851l = false;
            qVar2.f448845f.setPressed(false);
            qx1.q qVar3 = (qx1.q) zVar.f422866c;
            qVar3.f448852m = false;
            qVar3.f448846g.setPressed(false);
            c13158x154ec45a.K = false;
        }
        return selectionStart == 0 && i17 != 0;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a b() {
        nx1.d q17 = nx1.d.q();
        java.util.ArrayList arrayList = this.f422864a;
        q17.getClass();
        if (arrayList != null) {
            arrayList.clear();
            synchronized (q17) {
                java.util.ArrayList arrayList2 = q17.f422815a;
                if (arrayList2 != null) {
                    java.util.Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ix1.a aVar = (ix1.a) it.next();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a c13158x154ec45a = aVar.f376849f;
                        if (c13158x154ec45a != null) {
                            arrayList.add(c13158x154ec45a);
                        } else {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a c13158x154ec45a2 = aVar.f376847d;
                            if (c13158x154ec45a2 != null && aVar.f376848e != null) {
                                arrayList.add(c13158x154ec45a2);
                                arrayList.add(aVar.f376848e);
                            }
                        }
                    }
                }
            }
        }
        java.util.ArrayList arrayList3 = this.f422864a;
        if (arrayList3 == null) {
            return null;
        }
        java.util.Iterator it6 = arrayList3.iterator();
        while (it6.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a c13158x154ec45a3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a) it6.next();
            if (c13158x154ec45a3.hasFocus()) {
                return c13158x154ec45a3;
            }
        }
        return null;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a b17 = b();
        if (b17 != null) {
            return b17;
        }
        java.util.ArrayList arrayList = this.f422864a;
        return arrayList.size() >= 1 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a) arrayList.get(arrayList.size() - 1) : b17;
    }

    public void d(px1.u uVar, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a b17 = b();
        if (b17 != null) {
            if (b17.m54589xbc88a4a7() != 0) {
                b17.M = true;
                b17.L = uVar.b();
                b17.getText().append("\n");
                return;
            }
            int i17 = b17.m54595x9925e2d6().f422848d;
            int length = b17.getText().length();
            if ((obj instanceof java.lang.Boolean) && ((java.lang.Boolean) obj).booleanValue() && i17 == length) {
                b17.x();
                b17.getText().append("\n");
                b17.B();
                b17.setSelection(i17);
            }
            b17.u(uVar, obj);
        }
    }

    public void e(com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a c13158x154ec45a, android.text.Spannable spannable, android.text.Spannable spannable2, int i17, int i18, int i19, int i27) {
        java.lang.String w17 = c13158x154ec45a.w(nx1.w.f422857b);
        int m54589xbc88a4a7 = c13158x154ec45a.m54589xbc88a4a7();
        kx1.a aVar = this.f422865b;
        if (m54589xbc88a4a7 == 0) {
            ix1.a l17 = nx1.d.q().l(c13158x154ec45a.m54593xef703fb1());
            if (l17 != null && l17.b() == 1) {
                int h17 = (spannable2 == null ? 0 : com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.u1.h(spannable2.toString())) - (spannable == null ? 0 : com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.u1.h(spannable.toString()));
                if (nx1.d.q().f(h17, 0)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1 abstractActivityC13156x6363e8e1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1) aVar;
                    abstractActivityC13156x6363e8e1.getClass();
                    abstractActivityC13156x6363e8e1.f7();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1 abstractActivityC13156x6363e8e12 = (com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1) aVar;
                    abstractActivityC13156x6363e8e12.getClass();
                    abstractActivityC13156x6363e8e12.j3(c13158x154ec45a.m54593xef703fb1(), 0L);
                } else {
                    nx1.d.q().i();
                    ix1.l lVar = (ix1.l) l17;
                    lVar.f376846c = i27;
                    lVar.f376871s = w17;
                    lVar.f376845b = true;
                    l17.f376850g = false;
                    nx1.d.q().f422819e += h17;
                }
            }
        } else {
            c13158x154ec45a.m54601x765074af("");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w17)) {
                return;
            }
            ix1.l lVar2 = new ix1.l();
            if (w17.equals("<br/>")) {
                w17 = "";
            }
            lVar2.f376871s = w17;
            int r17 = nx1.d.q().r(lVar2, c13158x154ec45a, true, true, true, false, false);
            nx1.d.q().d(r17 - 1, r17 + 1, true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1 abstractActivityC13156x6363e8e13 = (com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1) aVar;
        abstractActivityC13156x6363e8e13.getClass();
        abstractActivityC13156x6363e8e13.U3();
    }

    public void f(com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a c13158x154ec45a) {
        if (c13158x154ec45a.B == 0) {
            c13158x154ec45a.setTextSize(0, i65.a.h(c13158x154ec45a.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia));
        }
        nx1.q.f422853d = c13158x154ec45a.getTextSize();
        c13158x154ec45a.f178132r = this;
        c13158x154ec45a.m54599xe08d546d(null);
        c13158x154ec45a.setOnKeyListener(this.f422868e);
    }

    public void g(int i17, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1 abstractActivityC13156x6363e8e1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1) this.f422865b;
        abstractActivityC13156x6363e8e1.getClass();
        abstractActivityC13156x6363e8e1.j7(i17, j17);
    }

    public void h(boolean z17, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1 abstractActivityC13156x6363e8e1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1) this.f422865b;
        abstractActivityC13156x6363e8e1.getClass();
        abstractActivityC13156x6363e8e1.k7(z17, j17);
    }
}
