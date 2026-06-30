package ho1;

/* loaded from: classes5.dex */
public final class k0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f364269d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ho1.a1 f364270e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f364271f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(java.util.List list, ho1.a1 a1Var, long j17) {
        super(1);
        this.f364269d = list;
        this.f364270e = a1Var;
        this.f364271f = j17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.List<po1.d> list;
        boolean z17;
        java.lang.Object obj2;
        java.util.List onlineDevices = (java.util.List) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onlineDevices, "onlineDevices");
        java.util.Iterator it = onlineDevices.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            list = this.f364269d;
            if (!hasNext) {
                break;
            }
            po1.d dVar = (po1.d) it.next();
            java.util.Iterator it6 = list.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it6.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dVar.f438828a, ((po1.d) obj2).f438828a)) {
                    break;
                }
            }
            po1.d dVar2 = (po1.d) obj2;
            if (dVar2 != null) {
                dVar2.f438835h = true;
                java.lang.String str = dVar.f438830c;
                if (str != null) {
                    dVar2.f438830c = str;
                }
            } else {
                list.add(dVar);
            }
        }
        int size = list.size() - 1;
        int i17 = 0;
        while (i17 < size) {
            while (i17 < size && ((po1.d) list.get(i17)).f438835h) {
                i17++;
            }
            while (i17 < size && !((po1.d) list.get(size)).f438835h) {
                size--;
            }
            if (i17 < size) {
                po1.d dVar3 = (po1.d) list.get(i17);
                list.set(i17, list.get(size));
                list.set(size, dVar3);
            }
        }
        ho1.a1 a1Var = this.f364270e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a1Var.f364155a, "Start select device, devices.count=" + list.size() + " onlineDevices.count=" + onlineDevices.size());
        java.util.List b17 = ro1.v.f479547a.b();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (po1.d dVar4 : list) {
            if (dVar4.f438829b == po1.g.f438843h) {
                java.util.ArrayList arrayList2 = (java.util.ArrayList) b17;
                if (!arrayList2.isEmpty()) {
                    java.util.Iterator it7 = arrayList2.iterator();
                    while (it7.hasNext()) {
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((po1.d) it7.next()).f438833f, dVar4.f438833f)) {
                            z17 = true;
                            break;
                        }
                    }
                }
                z17 = false;
                dVar4.f438835h = z17;
            }
            arrayList.add(dVar4.e());
        }
        if (arrayList.size() > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a1Var.f364155a, "Start select device, devices.name=" + ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.q0) arrayList.get(0)).f297492g);
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.e0 e0Var = a1Var.f364156b;
        if (e0Var != null) {
            e0Var.V0(this.f364271f, arrayList);
        }
        return jz5.f0.f384359a;
    }
}
