package com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a;

/* renamed from: com.tencent.wechat.aff.affroam.ZIDL_rRMvEYfRB */
/* loaded from: classes5.dex */
class C27137x54d78351 extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131 implements com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.v0 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.w0 f297296a;

    /* renamed from: ZIDL_BI */
    private native void m110930x1964d18f(long j17, byte[] bArr, byte[] bArr2);

    public void Q1(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.p pVar, byte[] bArr) {
        m110930x1964d18f(this.f60633xf042a733, pVar.m75963xebb06ba0(), bArr);
    }

    /* renamed from: ZIDL_A */
    public void m110931x9db8edf9() {
        po1.e eVar;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.w wVar;
        ho1.w wVar2 = (ho1.w) this.f297296a;
        wVar2.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CustomRoamDiskManagerImpl", "[+] Scan devices for custom roam disks.");
        oo1.j jVar = oo1.j.f428678a;
        ro1.v vVar = ro1.v.f479547a;
        java.util.List a17 = vVar.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UsbVolumeHelper", "allDevices=" + a17);
        java.util.List b17 = vVar.b();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = ((java.util.ArrayList) b17).iterator();
        while (it.hasNext()) {
            po1.d dVar = (po1.d) it.next();
            hashMap.put(dVar.f438833f, dVar);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UsbVolumeHelper", "connectedDevices=" + hashMap);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it6 = ((java.util.ArrayList) a17).iterator();
        while (it6.hasNext()) {
            java.lang.Object next = it6.next();
            if (hashMap.containsKey(((po1.d) next).f438833f)) {
                arrayList.add(next);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UsbVolumeHelper", "availableDevices=" + arrayList);
        java.util.Iterator it7 = arrayList.iterator();
        while (it7.hasNext()) {
            po1.d dVar2 = (po1.d) it7.next();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CustomRoamDiskManagerImpl", "discoverUSBDisk device=" + dVar2);
            dVar2.getClass();
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.p pVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.p();
            pVar.f297475e = dVar2.f438828a;
            pVar.f297474d = dVar2.b();
            po1.g gVar = dVar2.f438829b;
            gVar.getClass();
            po1.e[] eVarArr = po1.g.f438840e;
            int length = eVarArr.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length) {
                    eVar = null;
                    break;
                }
                eVar = eVarArr[i17];
                if (eVar.f438836a == gVar) {
                    break;
                } else {
                    i17++;
                }
            }
            if (eVar == null || (wVar = eVar.f438837b) == null) {
                wVar = com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.w.AFFROAM_DEVICE_TYPE_UNKNOWN;
            }
            pVar.f297476f = wVar;
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.v0 v0Var = wVar2.f364372a;
            if (v0Var != null) {
                ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.C27137x54d78351) v0Var).Q1(pVar, pVar.f297477g.g());
            }
        }
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131
    /* renamed from: attachStub */
    public void mo73242x8aebc093(java.lang.Object obj) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.w0 w0Var = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.w0) obj;
        this.f297296a = w0Var;
        ((ho1.w) w0Var).f364372a = this;
    }
}
