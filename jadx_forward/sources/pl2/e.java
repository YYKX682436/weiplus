package pl2;

/* loaded from: classes3.dex */
public final class e implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pl2.s f438154d;

    public e(pl2.s sVar) {
        this.f438154d = sVar;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        km2.m mVar;
        com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e c10828x8f239b6e;
        km2.m mVar2;
        com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e c10828x8f239b6e2;
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        pl2.s sVar = this.f438154d;
        java.lang.String str = sVar.f438180b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("itemclick position:");
        sb6.append(i17);
        sb6.append(", sideBarDataList.size:");
        java.util.ArrayList arrayList = sVar.f438189k;
        sb6.append(arrayList.size());
        sb6.append(", curPosition:");
        sb6.append(sVar.f438190l);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        if (i17 < 0 || i17 > arrayList.size() || sVar.f438190l == i17) {
            return;
        }
        android.content.Context b17 = sVar.b();
        pf5.z zVar = pf5.z.f435481a;
        if (!(b17 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((pl2.x) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) b17).a(pl2.x.class)).f438220m.f438207d = i17;
        android.content.Context b18 = sVar.b();
        if (!(b18 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        pl2.w wVar = ((pl2.x) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) b18).a(pl2.x.class)).f438220m;
        pl2.a aVar = (pl2.a) kz5.n0.a0(arrayList, i17);
        wVar.getClass();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("banner_type", "common_recmd");
        int i18 = wVar.f438204a;
        linkedHashMap.put("active_id", java.lang.String.valueOf(i18));
        linkedHashMap.put("active_index", java.lang.String.valueOf(i17));
        if (aVar != null) {
            km2.m mVar3 = aVar.f438149d;
            linkedHashMap.put("liveId", pm0.v.u(mVar3.f390662d.f150070e));
            linkedHashMap.put("feedId", pm0.v.u(mVar3.f390662d.f150082s));
        }
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.f409539y1, linkedHashMap, null, null, null, null, false, 124, null);
        java.lang.String str2 = wVar.f438213j.f438214d;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("report reportSideBarItemClick ");
        sb7.append(i18);
        sb7.append(", ");
        sb7.append(i17);
        sb7.append(", ");
        long j17 = 0;
        sb7.append(pm0.v.u((aVar == null || (mVar2 = aVar.f438149d) == null || (c10828x8f239b6e2 = mVar2.f390662d) == null) ? 0L : c10828x8f239b6e2.f150070e));
        sb7.append(", ");
        if (aVar != null && (mVar = aVar.f438149d) != null && (c10828x8f239b6e = mVar.f390662d) != null) {
            j17 = c10828x8f239b6e.f150082s;
        }
        sb7.append(pm0.v.u(j17));
        sb7.append(' ');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb7.toString());
        int i19 = sVar.f438190l;
        sVar.g(i17);
        pl2.m mVar4 = sVar.f438184f;
        if (mVar4 != null) {
            vd2.l4 l4Var = (vd2.l4) mVar4;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveViewCallback", "lxltest onSelectLive fromPos:" + i19 + ", to:" + i17);
            km2.n nVar = l4Var.f517339e;
            if (i17 >= 0 && i17 < nVar.f390686e.size()) {
                boolean z17 = i19 >= 0 && i19 < nVar.f390686e.size();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c c14167x40aca97c = l4Var.f517337c;
                if (!z17 || java.lang.Math.abs(i19 - i17) <= 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveViewCallback", "lxltest onSelectLive step3 pos:" + i17);
                    c14167x40aca97c.z(i17, -1);
                    return;
                }
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("lxltest onSelectLive step1 pos:");
                sb8.append(i17 > i19 ? i17 - 1 : i17 + 1);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveViewCallback", sb8.toString());
                c14167x40aca97c.L = true;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14343x44b0b6f6 c14343x44b0b6f6 = c14167x40aca97c.f193025q;
                int i27 = i17 > i19 ? i17 - 1 : i17 + 1;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(java.lang.Integer.valueOf(i27));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(c14343x44b0b6f6, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/FinderLiveViewCallback$initView$3", "onSelectLive", "(II)V", "Undefined", "scrollToPosition", "(I)V");
                c14343x44b0b6f6.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(c14343x44b0b6f6, "com/tencent/mm/plugin/finder/live/FinderLiveViewCallback$initView$3", "onSelectLive", "(II)V", "Undefined", "scrollToPosition", "(I)V");
                c14167x40aca97c.f193025q.post(new vd2.k4(i17, c14167x40aca97c));
            }
        }
    }
}
