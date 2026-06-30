package fo5;

/* loaded from: classes14.dex */
public final class e3 extends qz5.l implements yz5.p {
    public e3(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new fo5.e3(interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        fo5.e3 e3Var = new fo5.e3((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        e3Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        fo5.a aVar2 = fo5.f3.f346519c;
        if (aVar2 != null) {
            fo5.r0 r0Var = (fo5.r0) aVar2;
            ro5.b bVar = r0Var.f346630p;
            if (bVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("renderController");
                throw null;
            }
            bVar.x();
            io5.e eVar = r0Var.f346631q;
            if (eVar.f375067b) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPDeviceController", "device controller already started, ignore duplicate start call");
            } else {
                eVar.f375067b = true;
                eVar.f375068c = 0;
                eVar.f375072g = 1;
                eVar.f375070e = false;
                eVar.f375069d = 0;
                eVar.e();
                eVar.b();
                io5.a aVar3 = eVar.f375075j;
                aVar3.getClass();
                eVar.d(android.provider.Settings.System.getInt(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver(), "accelerometer_rotation", 0) == 0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPDeviceController", "initCurrentOri: uiRotate " + eVar.f375068c + ", systemRotateLocked = " + eVar.f375070e + ", naturalOrientation " + eVar.f375072g);
                di3.d dVar = new di3.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                dVar.f314222g = new io5.c(eVar);
                eVar.f375076k = dVar;
                dVar.enable();
                eVar.f375074i.registerContentObserver(android.provider.Settings.System.getUriFor("accelerometer_rotation"), true, aVar3);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPDeviceController", "device controller started");
            }
            r0Var.x();
        }
        return jz5.f0.f384359a;
    }
}
