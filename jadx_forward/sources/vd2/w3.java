package vd2;

/* loaded from: classes3.dex */
public final class w3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5499xac76da04 f517510d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c f517511e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5499xac76da04 c5499xac76da04, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c c14167x40aca97c) {
        super(0);
        this.f517510d = c5499xac76da04;
        this.f517511e = c14167x40aca97c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        km2.n nVar;
        java.util.ArrayList arrayList;
        int i17;
        km2.n nVar2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderLiveViewCallback", "LiveSwipeToNextListener: event feedId " + this.f517510d.f135831g.f87879a + " hint " + this.f517510d.f135831g.f87880b);
        long j17 = this.f517510d.f135831g.f87879a;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = this.f517511e.f193025q.mo7946xf939df19();
        java.lang.Integer num = null;
        num = null;
        vd2.s1 s1Var = mo7946xf939df19 instanceof vd2.s1 ? (vd2.s1) mo7946xf939df19 : null;
        if (s1Var != null && (nVar = s1Var.f517435e) != null && (arrayList = nVar.f390686e) != null) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5499xac76da04 c5499xac76da04 = this.f517510d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c c14167x40aca97c = this.f517511e;
            synchronized (arrayList) {
                java.util.Iterator it = arrayList.iterator();
                int i18 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i17 = -1;
                        break;
                    }
                    com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e b17 = ((km2.t) it.next()).b();
                    if ((b17 != null && b17.f150082s == j17) == true) {
                        i17 = i18;
                        break;
                    }
                    i18++;
                }
                if (i17 != -1) {
                    if (i17 >= arrayList.size()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveViewCallback", "LiveSwipeToNextListener: finish directly");
                        gk2.e eVar = gk2.e.f354004n;
                        mm2.c1 c1Var = eVar != null ? (mm2.c1) eVar.a(mm2.c1.class) : null;
                        if (c1Var != null) {
                            c1Var.O1 = false;
                        }
                        java.lang.String str = c5499xac76da04.f135831g.f87880b;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                        java.lang.String str2 = r26.n0.N(str) ^ true ? str : null;
                        if (str2 != null) {
                            db5.t7.g(c14167x40aca97c.f193025q.getContext(), str2);
                        }
                        c14167x40aca97c.f193017f.finish();
                    } else {
                        if (c14167x40aca97c.f193019h != null && (nVar2 = dk2.ef.H) != null) {
                            num = java.lang.Integer.valueOf(nVar2.d());
                        }
                        java.lang.Integer num2 = num;
                        if (num2 != null && num2.intValue() == i17) {
                            c14167x40aca97c.z(i17 + 1, 400);
                            c14167x40aca97c.f193025q.postDelayed(new vd2.v3(arrayList, c14167x40aca97c, i17, c5499xac76da04, j17), 450L);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveViewCallback", "LiveSwipeToNextListener: remove feedId=" + j17 + ", curIndex=" + i17 + ", flowCurPos=" + num2 + ", hint=" + c5499xac76da04.f135831g.f87880b);
                        }
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.util.Iterator it6 = arrayList.iterator();
                        while (it6.hasNext()) {
                            km2.m mVar = ((km2.t) it6.next()).f390755d;
                            if (mVar != null) {
                                arrayList2.add(mVar);
                            }
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c.j(c14167x40aca97c, i17, new java.util.ArrayList(arrayList2));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveViewCallback", "LiveSwipeToNextListener: remove feedId=" + j17 + ", curIndex=" + i17 + ", flowCurPos=" + num2 + ", hint=" + c5499xac76da04.f135831g.f87880b);
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
