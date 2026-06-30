package uf;

/* loaded from: classes7.dex */
public final class q0 implements x91.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf.c1 f508623d;

    public q0(uf.c1 c1Var) {
        this.f508623d = c1Var;
    }

    @Override // x91.a
    public void C2(x91.h device) {
        long j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(device, "device");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCastDeviceManager", "[search]onAddDevice, " + device);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MediaCastDeviceManager", "[search]onAddDevice", e17);
        }
        uf.c1 c1Var = this.f508623d;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 d17 = c1Var.d();
        x91.c cVar = device.f534180a;
        if (d17 != null) {
            j17 = d17.getLong(cVar != null ? cVar.f534174i : null, 0L);
        } else {
            j17 = 0;
        }
        boolean z17 = false;
        if (0 != j17) {
            java.util.ArrayList arrayList = c1Var.f508518d;
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
                c1Var.f508518d.add(new gg1.i(device));
            }
        } else {
            java.util.ArrayList arrayList2 = c1Var.f508517c;
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
                c1Var.f508517c.add(new gg1.i(device));
            }
        }
        yz5.a aVar = c1Var.f508519e;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[search]onAddDevice, ");
        sb6.append(cVar != null ? cVar.f534172g : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCastDeviceManager", sb6.toString());
    }

    @Override // x91.a
    public void K4(x91.h device) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(device, "device");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCastDeviceManager", "[search]onUpdateDevice, " + device);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MediaCastDeviceManager", "[search]onUpdateDevice", e17);
        }
    }

    @Override // x91.a
    public void q2(x91.h device) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(device, "device");
        uf.c1 c1Var = this.f508623d;
        c1Var.f508517c.remove(new gg1.i(device));
        c1Var.f508518d.remove(new gg1.i(device));
        yz5.a aVar = c1Var.f508519e;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[search]onRemoveDevice, ");
        x91.c cVar = device.f534180a;
        sb6.append(cVar != null ? cVar.f534172g : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCastDeviceManager", sb6.toString());
    }
}
