package nv0;

/* loaded from: classes5.dex */
public final class b implements nv0.e {

    /* renamed from: a, reason: collision with root package name */
    public final kz5.q f421957a = new kz5.q();

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.n f421958b;

    public final boolean d(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6 abstractC10936x89d53ec6, android.view.ViewGroup viewGroup, zw0.e eVar, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.m mVar, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.o oVar, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.n nVar, boolean z17) {
        boolean z18;
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d5.a()) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        }
        java.lang.String name = abstractC10936x89d53ec6.getClass().getName();
        kz5.q qVar = this.f421957a;
        if (!(qVar instanceof java.util.Collection) || !qVar.isEmpty()) {
            java.util.Iterator it = qVar.iterator();
            while (it.hasNext()) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6) it.next()).getClass().getName(), name)) {
                    z18 = true;
                    break;
                }
            }
        }
        z18 = false;
        if (!(!z18)) {
            return false;
        }
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.n nVar2 = this.f421958b;
        java.util.ArrayList arrayList = abstractC10936x89d53ec6.f150743m;
        if (nVar2 != null) {
            nv0.b bVar = (nv0.b) abstractC10936x89d53ec6.m47059x78645ef2();
            bVar.getClass();
            if (bVar.f421958b == null) {
                bVar.f421958b = nVar2;
            }
            if (!arrayList.contains(nVar2)) {
                arrayList.add(nVar2);
            }
        }
        if (abstractC10936x89d53ec6.getF150738e() == com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.p.f150775d) {
            if (nVar != null && !arrayList.contains(nVar)) {
                arrayList.add(nVar);
            }
            if (viewGroup.getId() != com.p314xaae8f345.mm.R.id.q8n) {
                java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            }
            abstractC10936x89d53ec6.d(viewGroup, this);
        }
        if (abstractC10936x89d53ec6.getF150738e() == com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.p.f150783o) {
            if (viewGroup.getId() != com.p314xaae8f345.mm.R.id.q8n) {
                java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            }
            abstractC10936x89d53ec6.d(viewGroup, this);
        }
        if (abstractC10936x89d53ec6.getF150738e() == com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.p.f150778g || abstractC10936x89d53ec6.getF150738e() == com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.p.f150780i) {
            return false;
        }
        if (abstractC10936x89d53ec6.isShown()) {
            java.util.Objects.toString(abstractC10936x89d53ec6.getF150738e());
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            return false;
        }
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.p f150738e = abstractC10936x89d53ec6.getF150738e();
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.p pVar = com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.p.f150777f;
        if (f150738e != pVar) {
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.p f150738e2 = abstractC10936x89d53ec6.getF150738e();
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.p pVar2 = com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.p.f150781m;
            if (f150738e2 != pVar2) {
                java.util.Objects.toString(abstractC10936x89d53ec6.getF150738e());
                pVar.toString();
                pVar2.toString();
                java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                return false;
            }
        }
        if (mVar != null) {
            abstractC10936x89d53ec6.f150742i.add(mVar);
        }
        if (oVar != null) {
            abstractC10936x89d53ec6.m47073x32851f53(oVar);
        }
        abstractC10936x89d53ec6.A(z17, false, eVar);
        qVar.m144677xb4f1a68f(abstractC10936x89d53ec6);
        return true;
    }

    public boolean e(boolean z17) {
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d5.a()) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("close: ----> stack ");
        kz5.q qVar = this.f421957a;
        sb6.append(qVar.d());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DefaultPanelNavigation", sb6.toString());
        if (qVar.isEmpty()) {
            return false;
        }
        if (qVar.isEmpty()) {
            throw new java.util.NoSuchElementException("ArrayDeque is empty.");
        }
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6 abstractC10936x89d53ec6 = (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6) qVar.f395532e[qVar.f395531d];
        if (!((nv0.b) abstractC10936x89d53ec6.m47059x78645ef2()).e(z17)) {
            return nv0.e.b(this, abstractC10936x89d53ec6, z17, false, 4, null);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DefaultPanelNavigation", "close: ----> childPanelNavigation stack " + qVar.d());
        return false;
    }
}
