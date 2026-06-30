package zo1;

/* loaded from: classes5.dex */
public final class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f556122d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f556123e;

    public e1(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, java.lang.ref.WeakReference weakReference) {
        this.f556122d = u3Var;
        this.f556123e = weakReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        java.lang.Object obj;
        java.util.List i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a.i(true);
        try {
            fo1.q qVar = new fo1.q();
            c01.d9.e().g(new ug3.i(gm0.j1.b().f354782l, 1, new fo1.b(new fo1.a(qVar))));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AutoBindHelper", "post NetSceneGetOnlineInfo into NetSceneQueue");
            java.util.Iterator it = so1.b.f491759a.d().iterator();
            while (true) {
                i17 = 0;
                if (!it.hasNext()) {
                    break;
                }
                po1.d dVar = (po1.d) it.next();
                if (!i18.isEmpty()) {
                    java.util.Iterator it6 = i18.iterator();
                    while (it6.hasNext()) {
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((po1.d) it6.next()).f438833f, dVar.f438833f)) {
                            break;
                        }
                    }
                }
                i17 = 1;
                if (i17 != 0) {
                    ((java.util.ArrayList) i18).add(dVar);
                }
            }
            java.lang.Object obj2 = qVar.get();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
            for (po1.d dVar2 : (java.lang.Iterable) obj2) {
                java.util.Iterator it7 = i18.iterator();
                while (true) {
                    if (it7.hasNext()) {
                        obj = it7.next();
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dVar2.f438828a, ((po1.d) obj).f438828a)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                po1.d dVar3 = (po1.d) obj;
                if (dVar3 != null) {
                    dVar3.f438835h = true;
                } else {
                    ((java.util.ArrayList) i18).add(dVar2);
                }
            }
            int size = ((java.util.ArrayList) i18).size() - 1;
            while (i17 < size) {
                while (i17 < size && ((po1.d) ((java.util.ArrayList) i18).get(i17)).f438835h) {
                    i17++;
                }
                while (i17 < size && !((po1.d) ((java.util.ArrayList) i18).get(size)).f438835h) {
                    size--;
                }
                if (i17 < size) {
                    java.util.ArrayList arrayList = (java.util.ArrayList) i18;
                    po1.d dVar4 = (po1.d) arrayList.get(i17);
                    java.util.ArrayList arrayList2 = (java.util.ArrayList) i18;
                    arrayList2.set(i17, arrayList.get(size));
                    arrayList2.set(size, dVar4);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CreatePackageUI", "Start select device, devices.count=" + ((java.util.ArrayList) i18).size());
        } catch (java.lang.InterruptedException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CreatePackageUI", e17.toString());
        }
        nf.e.f(new zo1.d1(this.f556122d, this.f556123e, i18));
    }
}
