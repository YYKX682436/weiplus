package u32;

/* loaded from: classes13.dex */
public final class b extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u32.i f505807a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(u32.i iVar, java.lang.String str) {
        super(str);
        this.f505807a = iVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        switch (message.what) {
            case 1:
                u32.d dVar = (u32.d) message.obj;
                ((u32.a2) this.f505807a.f505838e).N6(1, 0, null, dVar.f505814a, dVar.f505815b, dVar.f505816c, dVar.f505817d);
                return;
            case 2:
                ((u32.a2) this.f505807a.f505838e).N6(2, 0, null, null, null, 0, null);
                return;
            case 3:
                u32.f fVar = (u32.f) message.obj;
                ((u32.a2) this.f505807a.f505838e).j(fVar.f505824a, fVar.f505825b, fVar.f505826c, fVar.f505827d);
                return;
            case 4:
                u32.e eVar = (u32.e) message.obj;
                ((u32.a2) this.f505807a.f505838e).g(eVar.f505818a, eVar.f505819b, eVar.f505820c, eVar.f505821d);
                return;
            case 5:
                u32.c cVar = (u32.c) message.obj;
                u32.x xVar = this.f505807a.f505838e;
                int i17 = message.arg1;
                long j17 = cVar.f505810a;
                short s17 = cVar.f505811b;
                short s18 = cVar.f505812c;
                byte[] bArr = cVar.f505813d;
                u32.a2 a2Var = (u32.a2) xVar;
                a2Var.getClass();
                java.lang.Object[] objArr = new java.lang.Object[5];
                objArr[0] = java.lang.Integer.valueOf(i17);
                objArr[1] = java.lang.Long.valueOf(j17);
                objArr[2] = java.lang.Short.valueOf(s17);
                objArr[3] = java.lang.Short.valueOf(s18);
                objArr[4] = java.lang.Integer.valueOf(bArr != null ? bArr.length : 0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "onDeviceRequest errorCode = %d, deviceId = %d, seq = %d, cmdId = %d, data length = %d", objArr);
                u32.p1 p1Var = new u32.p1(null);
                p1Var.f505880c = s18;
                p1Var.f505881d = bArr;
                p1Var.f505878a = j17;
                p1Var.f505879b = s17;
                p1Var.f505882e = i17;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = a2Var.f505800p;
                if (n3Var.mo50308x2936bf5f(n3Var.mo50292x733c63a2(6, p1Var))) {
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage failed!!!, message what = %d", 6);
                return;
            case 6:
            case 7:
            default:
                return;
            case 8:
                u32.h hVar = (u32.h) message.obj;
                u32.i iVar = this.f505807a;
                long j18 = hVar.f505830a;
                u32.w0 w0Var = hVar.f505831b;
                u32.x xVar2 = iVar.f505838e;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BTDeviceManager", "startTaskImp, taskId = %d", java.lang.Long.valueOf(j18));
                iz5.a.d(null, w0Var);
                try {
                    long mo167498xbdf72787 = w0Var.mo167500x2d63726f().mo167498xbdf72787();
                    if (!v32.a.c("conneted_device", mo167498xbdf72787)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exdevice.BTDeviceManager", "Cannot startTask because this channel is close aready!!!");
                        u32.f fVar2 = new u32.f();
                        fVar2.f505824a = j18;
                        fVar2.f505826c = -1;
                        fVar2.f505825b = -1;
                        fVar2.f505827d = "Channel is close aready!!!";
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var2 = u32.i.f505836h.f505839f;
                        iz5.a.g(null, n3Var2.mo50308x2936bf5f(n3Var2.mo50291x733c63a2(3, 0, 0, fVar2)));
                        return;
                    }
                    java.util.HashMap hashMap = iVar.f505837d;
                    if (!hashMap.containsKey(java.lang.Long.valueOf(mo167498xbdf72787))) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BTDeviceManager", "Cannot find Channel by DeviceInfo(%s) in mMapDeviceChannelId", java.lang.Long.valueOf(mo167498xbdf72787));
                        ((u32.a2) xVar2).j(j18, -1, -1, "Cannot find Channel by DeviceInfo!!!");
                        return;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.jni.C13411x69f9c21c.AccessoryCmd accessoryCmd = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.jni.C13411x69f9c21c.AccessoryCmd();
                    accessoryCmd.f35461x5720515e = ((java.lang.Long) hashMap.get(java.lang.Long.valueOf(mo167498xbdf72787))).longValue();
                    try {
                        accessoryCmd.f35462xe5d22dd7 = w0Var.mo167500x2d63726f().Hf();
                        accessoryCmd.f35463x88beb9e5 = w0Var.mo167500x2d63726f().W4();
                        try {
                            byte[] z96 = w0Var.mo167500x2d63726f().z9();
                            int W5 = w0Var.mo167500x2d63726f().W5();
                            if (com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.jni.C13411x69f9c21c.m55034x916e51e3(j18, (short) W5, accessoryCmd, z96) != 0) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BTDeviceManager", "Java2CExDevice.startTaskV2 Failed!!!");
                                return;
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BTDeviceManager", "------let task go------ taskId = %d, deviceId = %d, channelId = %d, seq = %d, reqCmdId = %d, respCmdId = %d", java.lang.Long.valueOf(j18), java.lang.Long.valueOf(mo167498xbdf72787), java.lang.Long.valueOf(accessoryCmd.f35461x5720515e), java.lang.Integer.valueOf(W5), java.lang.Integer.valueOf(accessoryCmd.f35462xe5d22dd7), java.lang.Integer.valueOf(accessoryCmd.f35463x88beb9e5));
                                return;
                            }
                        } catch (android.os.RemoteException e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BTDeviceManager", "Remote getDataOut failed!!! %s", e17.getMessage());
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.exdevice.BTDeviceManager", e17, "", new java.lang.Object[0]);
                            ((u32.a2) xVar2).j(j18, -1, -1, "Remote getDataOut failed!!!!!!");
                            return;
                        }
                    } catch (android.os.RemoteException e18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BTDeviceManager", "Remote getResquestCmdId or getResponseCmdId failed!!! %s", e18.getMessage());
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.exdevice.BTDeviceManager", e18, "", new java.lang.Object[0]);
                        ((u32.a2) xVar2).j(j18, -1, -1, "Remote getResquestCmdId or getResponseCmdId failed!!!");
                        return;
                    }
                } catch (android.os.RemoteException e19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BTDeviceManager", "Remote getDeviceId failed!!! %s", e19.getMessage());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.exdevice.BTDeviceManager", e19, "", new java.lang.Object[0]);
                    ((u32.a2) xVar2).j(j18, -1, -1, "Remote getDeviceId failed!!!");
                    return;
                }
            case 9:
                u32.i iVar2 = this.f505807a;
                long longValue = ((java.lang.Long) message.obj).longValue();
                iVar2.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BTDeviceManager", "stopTaskImp taskId = %d", java.lang.Long.valueOf(longValue));
                com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.jni.C13411x69f9c21c.m55042xb0405d83(longValue);
                return;
            case 10:
                u32.g gVar = (u32.g) message.obj;
                u32.i iVar3 = this.f505807a;
                long j19 = gVar.f505828a;
                byte[] bArr2 = gVar.f505829b;
                iVar3.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BTDeviceManager", "------setChannelSessionKeyImp------ deviceId = %d", java.lang.Long.valueOf(j19));
                java.util.HashMap hashMap2 = iVar3.f505837d;
                if (hashMap2.containsKey(java.lang.Long.valueOf(j19))) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.jni.C13411x69f9c21c.m55024xbf794926(((java.lang.Long) hashMap2.get(java.lang.Long.valueOf(j19))).longValue(), bArr2);
                    return;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BTDeviceManager", "Cannot find deviceId in the map");
                    return;
                }
            case 11:
                synchronized (this.f505807a.f505840g) {
                    u32.i.d(this.f505807a, ((java.lang.Long) message.obj).longValue());
                }
                return;
            case 12:
                synchronized (this.f505807a.f505840g) {
                    this.f505807a.f(((java.lang.Long) message.obj).longValue());
                }
                return;
        }
    }
}
