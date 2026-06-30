package um2;

/* loaded from: classes3.dex */
public final class o4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f510441d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ km2.q f510442e;

    public o4(um2.x5 x5Var, km2.q qVar) {
        this.f510441d = x5Var;
        this.f510442e = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xh2.c cVar;
        java.lang.Object obj;
        kn0.p pVar;
        java.util.ArrayList<km2.q> m57671x48ab93c4;
        um2.x5 x5Var = this.f510441d;
        fm2.c cVar2 = x5Var.f101139c;
        if (cVar2 != null && (m57671x48ab93c4 = cVar2.m57671x48ab93c4()) != null) {
            m57671x48ab93c4.clear();
        }
        ((mm2.o4) x5Var.c(mm2.o4.class)).O7(this.f510442e);
        co0.s E = x5Var.E();
        if (E != null) {
            E.S = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dk0 dk0Var = x5Var.f510574i;
        if (dk0Var != null && (cVar = (xh2.c) ((mm2.o4) dk0Var.P0(mm2.o4.class)).A.mo3195x754a37bb()) != null) {
            java.util.LinkedList<xh2.a> linkedList = cVar.f536064a;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            for (xh2.a aVar : linkedList) {
                java.lang.String b17 = aVar.b();
                xh2.i iVar = aVar.f536054b;
                arrayList.add(new jo0.a(b17, new hn5.b(iVar.f364142a, iVar.f364143b, iVar.f364144c, iVar.f364145d), false));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorPreviewPlugin", "preAddCameraView micDataSize: " + arrayList.size());
            java.lang.String m86 = ((mm2.c1) dk0Var.P0(mm2.c1.class)).m8();
            if (m86 == null) {
                m86 = "";
            }
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((jo0.a) obj).f382403a, m86)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            if (obj == null) {
                arrayList.add(new jo0.a(m86, new hn5.b(0.0f, 0.0f, 0.1f, 0.1f), true));
            }
            co0.s u17 = dk0Var.u1();
            dk0Var.f193832p.d(arrayList, cVar.f536065b, (u17 == null || (pVar = u17.D) == null || !pVar.f391122i) ? false : true);
        }
        co0.s E2 = x5Var.E();
        if (E2 != null) {
            zl2.r4 r4Var = zl2.r4.f555483a;
            E2.R0(x5Var.f510567f1 ? 5 : 2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dk0 dk0Var2 = x5Var.f510574i;
        if (dk0Var2 != null) {
            dk0Var2.v1();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dk0 dk0Var3 = x5Var.f510574i;
        if (dk0Var3 != null) {
            com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p833x36756d.C10844x4ce18327 c10844x4ce18327 = dk0Var3.f193832p.renderRatioLayout;
            c10844x4ce18327.getClass();
            c10844x4ce18327.f150109o.d(false);
        }
    }
}
