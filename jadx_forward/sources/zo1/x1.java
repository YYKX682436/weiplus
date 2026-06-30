package zo1;

/* loaded from: classes5.dex */
public final class x1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f556353d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e f556354e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(java.util.List list, com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e activityC12868xd8a7d79e) {
        super(1);
        this.f556353d = list;
        this.f556354e = activityC12868xd8a7d79e;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.List list;
        java.lang.Object obj2;
        boolean z17;
        java.util.List deviceList = (java.util.List) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceList, "deviceList");
        java.util.Iterator it = deviceList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            list = this.f556353d;
            if (!hasNext) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            po1.d dVar = (po1.d) obj2;
            if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                java.util.Iterator it6 = list.iterator();
                while (it6.hasNext()) {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dVar.f438833f, ((po1.d) it6.next()).f438833f)) {
                        z17 = true;
                        break;
                    }
                }
            }
            z17 = false;
            if (z17) {
                break;
            }
        }
        po1.d dVar2 = (po1.d) obj2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e activityC12868xd8a7d79e = this.f556354e;
        if (dVar2 == null) {
            po1.d a17 = po1.d.a((po1.d) kz5.n0.i0(list), null, null, null, null, "/", null, null, 111, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CreatePackageUI", "bound device is null, try first device=" + a17);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(activityC12868xd8a7d79e);
            u1Var.g(activityC12868xd8a7d79e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mx9));
            u1Var.a(true);
            u1Var.b(new zo1.v1(activityC12868xd8a7d79e, a17));
            u1Var.q(false);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CreatePackageUI", "find a bound device = " + dVar2);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(activityC12868xd8a7d79e);
            u1Var2.g(activityC12868xd8a7d79e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mx9));
            u1Var2.a(true);
            u1Var2.b(new zo1.w1(activityC12868xd8a7d79e, dVar2));
            u1Var2.q(false);
        }
        return jz5.f0.f384359a;
    }
}
