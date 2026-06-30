package kq1;

/* loaded from: classes13.dex */
public class f extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f392774a;

    public f(java.lang.String str, kq1.n nVar) {
        super(str);
        this.f392774a = null;
        this.f392774a = new java.lang.ref.WeakReference(nVar);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        kq1.n nVar = (kq1.n) this.f392774a.get();
        if (nVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exdevice.BluetoothSDKManager", "null == BluetoothSdkManager");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothSDKManager", "handleMessage Message.What = " + message.what);
        switch (message.what) {
            case 0:
                kq1.m mVar = (kq1.m) message.obj;
                ((u32.p) nVar.f392790d).d(mVar.f392778a, mVar.f392779b);
                return;
            case 1:
                kq1.k kVar = (kq1.k) message.obj;
                kq1.o oVar = nVar.f392790d;
                long j17 = kVar.f392781a;
                ((u32.p) oVar).getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothSDKAdapter", "---onRecv--- sessionId = " + j17);
                com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.jni.C13411x69f9c21c.m55011x9ea26e3b(j17, kVar.f392782b);
                return;
            case 2:
                kq1.o oVar2 = nVar.f392790d;
                int i17 = message.arg1;
                u32.p pVar = (u32.p) oVar2;
                pVar.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothSDKAdapter", "---onScanFinished--- aBluetoothVersion =%d", java.lang.Integer.valueOf(i17));
                java.util.Vector vector = pVar.f505874b;
                if (vector.isEmpty()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exdevice.BluetoothSDKAdapter", "mScanCallbackList is empty");
                    return;
                }
                java.util.Iterator it = vector.iterator();
                while (it.hasNext()) {
                    u32.a1 a1Var = (u32.a1) it.next();
                    if (a1Var != null) {
                        a1Var.c(i17);
                    }
                }
                vector.clear();
                return;
            case 3:
                kq1.l lVar = (kq1.l) message.obj;
                kq1.o oVar3 = nVar.f392790d;
                java.lang.String str = lVar.f392783a;
                java.lang.String str2 = lVar.f392784b;
                int i18 = message.arg1;
                int i19 = lVar.f392785c;
                byte[] bArr = lVar.f392786d;
                java.util.Vector vector2 = ((u32.p) oVar3).f505874b;
                if (vector2.isEmpty()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exdevice.BluetoothSDKAdapter", "mScanCallbackList is empty");
                    return;
                }
                java.util.Iterator it6 = vector2.iterator();
                while (it6.hasNext()) {
                    ((u32.a1) it6.next()).b(str, str2, i18, i19, bArr);
                }
                return;
            case 4:
                kq1.i iVar = (kq1.i) message.obj;
                ((u32.p) nVar.f392790d).c(iVar.f392778a, iVar.f392779b);
                return;
            case 5:
                kq1.j jVar = (kq1.j) message.obj;
                kq1.o oVar4 = nVar.f392790d;
                long j18 = jVar.f392780a;
                ((u32.p) oVar4).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.jni.C13411x69f9c21c.m55009xad874415(j18, 0);
                return;
            case 6:
                kq1.g gVar = (kq1.g) message.obj;
                kq1.o oVar5 = nVar.f392790d;
                long j19 = gVar.f392776b;
                long j27 = gVar.f392775a;
                long j28 = gVar.f392777c;
                u32.p pVar2 = (u32.p) oVar5;
                pVar2.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothSDKAdapter", "---onSessionCreate--- aSessionId = " + j19 + " aDeviceID = " + j27);
                java.util.HashMap hashMap = pVar2.f505875c;
                iz5.a.g(null, hashMap.containsKey(java.lang.Long.valueOf(j27)));
                java.util.HashMap hashMap2 = pVar2.f505876d;
                if (!hashMap2.containsKey(java.lang.Long.valueOf(j19))) {
                    hashMap2.put(java.lang.Long.valueOf(j19), (java.lang.Integer) hashMap.get(java.lang.Long.valueOf(j27)));
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.jni.C13411x69f9c21c.m55015xa994db3d(j27, j28, j19);
                return;
            default:
                return;
        }
    }
}
