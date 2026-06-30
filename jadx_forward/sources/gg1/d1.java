package gg1;

/* loaded from: classes7.dex */
public final class d1 implements x91.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gg1.k1 f353085d;

    public d1(gg1.k1 k1Var) {
        this.f353085d = k1Var;
    }

    @Override // x91.a
    public void C2(x91.h device) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(device, "device");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoCast.VideoCastDeviceManager", "onAddDevice: " + device);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoCast.VideoCastDeviceManager", "onAddDevice", e17);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 L = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L();
        x91.c cVar = device.f534180a;
        boolean z17 = false;
        boolean z18 = L.getLong(cVar != null ? cVar.f534174i : null, 0L) != 0;
        gg1.k1 k1Var = this.f353085d;
        if (z18) {
            java.util.ArrayList arrayList = k1Var.f353125e;
            if (!(arrayList instanceof java.util.Collection) || !arrayList.isEmpty()) {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    x91.c cVar2 = ((gg1.i) it.next()).f353101a.f534180a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar2);
                    java.lang.String str = cVar2.f534174i;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar);
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, cVar.f534174i)) {
                        break;
                    }
                }
            }
            z17 = true;
            if (z17) {
                k1Var.f353125e.add(new gg1.i(device));
            }
        } else {
            java.util.ArrayList arrayList2 = k1Var.f353124d;
            if (!(arrayList2 instanceof java.util.Collection) || !arrayList2.isEmpty()) {
                java.util.Iterator it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    x91.c cVar3 = ((gg1.i) it6.next()).f353101a.f534180a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar3);
                    java.lang.String str2 = cVar3.f534174i;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar);
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, cVar.f534174i)) {
                        break;
                    }
                }
            }
            z17 = true;
            if (z17) {
                k1Var.f353124d.add(new gg1.i(device));
            }
        }
        yz5.a aVar = k1Var.f353126f;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAddDevice: ");
        sb6.append(cVar != null ? cVar.f534172g : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoCast.VideoCastDeviceManager", sb6.toString());
    }

    @Override // x91.a
    public void K4(x91.h device) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(device, "device");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoCast.VideoCastDeviceManager", "onUpdateDevice: " + device);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoCast.VideoCastDeviceManager", "onUpdateDevice", e17);
        }
    }

    @Override // x91.a
    public void q2(x91.h device) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(device, "device");
        gg1.k1 k1Var = this.f353085d;
        k1Var.f353124d.remove(new gg1.i(device));
        k1Var.f353125e.remove(new gg1.i(device));
        yz5.a aVar = k1Var.f353126f;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onRemoveDevice: ");
        x91.c cVar = device.f534180a;
        sb6.append(cVar != null ? cVar.f534172g : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoCast.VideoCastDeviceManager", sb6.toString());
    }
}
