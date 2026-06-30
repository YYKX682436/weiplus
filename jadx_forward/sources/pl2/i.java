package pl2;

/* loaded from: classes3.dex */
public final class i extends ym5.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pl2.s f438161a;

    public i(pl2.s sVar) {
        this.f438161a = sVar;
    }

    @Override // ym5.m0
    public boolean d() {
        return true;
    }

    @Override // ym5.m0
    public void e(android.view.View parent, java.util.List exposedHolders) {
        pl2.s sVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exposedHolders, "exposedHolders");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) parent;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(exposedHolders, 10));
        java.util.Iterator it = exposedHolders.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(((p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) it.next()).m8183xf806b362()));
        }
        java.util.Set X0 = kz5.n0.X0(arrayList);
        int childCount = c1163xf1deaba4.getChildCount();
        int i17 = 0;
        while (true) {
            sVar = this.f438161a;
            if (i17 >= childCount) {
                break;
            }
            android.view.View childAt = c1163xf1deaba4.getChildAt(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(childAt, "getChildAt(...)");
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 w07 = c1163xf1deaba4.w0(childAt);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(w07, "getChildViewHolder(...)");
            if (!X0.contains(java.lang.Integer.valueOf(w07.m8183xf806b362()))) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 c14522x8ffd8962 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962) childAt.findViewById(com.p314xaae8f345.mm.R.id.toa);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(sVar.f438180b, "Starting sidebar item play. " + w07.m8183xf806b362());
                c14522x8ffd8962.mo58404x360802();
                c14522x8ffd8962.mo58389x41012807();
            }
            i17++;
        }
        java.util.Iterator it6 = exposedHolders.iterator();
        while (it6.hasNext()) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) it6.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 c14522x8ffd89622 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962) k3Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.toa);
            if (!c14522x8ffd89622.mo58387xc00617a4()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(sVar.f438180b, "Stopping sidebar item play. " + k3Var.m8183xf806b362());
                c14522x8ffd89622.t();
            }
        }
        if (sVar.f438192n) {
            android.content.Context b17 = sVar.b();
            pf5.z zVar = pf5.z.f435481a;
            if (!(b17 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            pl2.w wVar = ((pl2.x) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) b17).a(pl2.x.class)).f438220m;
            java.util.ArrayList sideBarDataList = sVar.f438189k;
            wVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sideBarDataList, "sideBarDataList");
            java.util.HashSet hashSet = new java.util.HashSet();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var2 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) kz5.n0.Z(exposedHolders);
            int m8183xf806b362 = k3Var2 != null ? k3Var2.m8183xf806b362() : 1000;
            java.util.Iterator it7 = exposedHolders.iterator();
            int i18 = -1;
            while (it7.hasNext()) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var3 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) it7.next();
                if (k3Var3.m8183xf806b362() > i18 && k3Var3.m8183xf806b362() >= 0) {
                    i18 = k3Var3.m8183xf806b362();
                }
                if (k3Var3.m8183xf806b362() < m8183xf806b362 && k3Var3.m8183xf806b362() >= 0) {
                    m8183xf806b362 = k3Var3.m8183xf806b362();
                }
            }
            if (m8183xf806b362 <= i18) {
                while (true) {
                    hashSet.add(java.lang.Integer.valueOf(m8183xf806b362));
                    if (m8183xf806b362 == i18) {
                        break;
                    } else {
                        m8183xf806b362++;
                    }
                }
            }
            pm0.v.L("SideBarReport", true, new pl2.t(hashSet, wVar, wVar.f438213j, sideBarDataList));
        }
    }
}
