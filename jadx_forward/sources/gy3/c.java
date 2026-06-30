package gy3;

/* loaded from: classes13.dex */
public final class c extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f359085a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(gy3.d channel) {
        super("MicroMsg.Rtos.RtosBCChannel");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(channel, "channel");
        this.f359085a = new java.lang.ref.WeakReference(channel);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message msg) {
        gy3.f fVar;
        gy3.k kVar;
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        gy3.d dVar = (gy3.d) this.f359085a.get();
        if (dVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosBCChannel", "handleMessage " + msg.what);
            switch (msg.what) {
                case 1:
                    if (!dVar.f359094i) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Rtos.RtosBCChannel", "not connecting,ignore cancel");
                        return;
                    }
                    gy3.j jVar = dVar.f359088c;
                    if (jVar == null || (fVar = jVar.f359115b) == null) {
                        return;
                    }
                    try {
                        try {
                            try {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosBluetoothThreads", "cancel connect");
                                android.bluetooth.BluetoothSocket bluetoothSocket = fVar.f359100c;
                                if (bluetoothSocket != null) {
                                    bluetoothSocket.close();
                                }
                            } catch (java.io.IOException e17) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Rtos.RtosBluetoothThreads", "socket close failed (%s)", e17.toString());
                            }
                        } catch (java.lang.NullPointerException e18) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Rtos.RtosBluetoothThreads", "Close socket null!!! (" + e18 + ')');
                        }
                        return;
                    } finally {
                        fVar.f359100c = null;
                    }
                case 2:
                    if (dVar.f359089d.length() > 0) {
                        dVar.b();
                        return;
                    }
                    return;
                case 3:
                    gy3.k kVar2 = dVar.f359090e;
                    if (kVar2 != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchService", "onIsDeviceBonded ...false");
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Rtos.RtosWatchService", "bt is unbond! clear and close everything");
                        my3.c0 c0Var = ((my3.b0) kVar2).f414316a;
                        com.p314xaae8f345.p3133xd0ce8b26.p3170x3593a6.C27663xee5e94d4 c27663xee5e94d4 = c0Var.f414320b;
                        if (c27663xee5e94d4 != null) {
                            c27663xee5e94d4.m119272xbe98158a();
                        }
                        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0(), iy3.p.class);
                        c0Var.a();
                        return;
                    }
                    return;
                case 4:
                    byte[] bArr = (byte[]) msg.obj;
                    if (bArr == null || (kVar = dVar.f359090e) == null) {
                        return;
                    }
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    kz5.v.h(bArr, bArr2, 0, 0, length);
                    my3.c0 c0Var2 = ((my3.b0) kVar).f414316a;
                    gy3.a aVar = c0Var2.f414319a;
                    if (aVar != null) {
                        long j17 = ((gy3.d) aVar).f359091f;
                        com.p314xaae8f345.p3133xd0ce8b26.p3170x3593a6.C27663xee5e94d4 c27663xee5e94d42 = c0Var2.f414320b;
                        if (c27663xee5e94d42 != null) {
                            c27663xee5e94d42.m119273xf1858044(j17, bArr2);
                            return;
                        }
                        return;
                    }
                    return;
                case 5:
                    gy3.k kVar3 = dVar.f359090e;
                    if (kVar3 != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchService", "onRtosChannelConnected");
                        my3.c0 c0Var3 = ((my3.b0) kVar3).f414316a;
                        gy3.a aVar2 = c0Var3.f414319a;
                        if (aVar2 != null) {
                            long j18 = ((gy3.d) aVar2).f359091f;
                            com.p314xaae8f345.p3133xd0ce8b26.p3170x3593a6.C27663xee5e94d4 c27663xee5e94d43 = c0Var3.f414320b;
                            if (c27663xee5e94d43 != null) {
                                c27663xee5e94d43.m119277x1fbd28fd(j18, 512);
                            }
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(26126, 1, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 20, 0);
                        return;
                    }
                    return;
                case 6:
                    gy3.k kVar4 = dVar.f359090e;
                    if (kVar4 != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchService", "onRtosChannelDisconnected");
                        my3.c0 c0Var4 = ((my3.b0) kVar4).f414316a;
                        gy3.a aVar3 = c0Var4.f414319a;
                        if (aVar3 != null) {
                            long j19 = ((gy3.d) aVar3).f359091f;
                            com.p314xaae8f345.p3133xd0ce8b26.p3170x3593a6.C27663xee5e94d4 c27663xee5e94d44 = c0Var4.f414320b;
                            if (c27663xee5e94d44 != null) {
                                c27663xee5e94d44.m119274x989b04d5(j19);
                            }
                        }
                        if (c0Var4.f414323e) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(26126, 1, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 21, 0);
                        }
                        c0Var4.f414323e = false;
                        return;
                    }
                    return;
                case 7:
                    gy3.k kVar5 = dVar.f359090e;
                    if (kVar5 != null) {
                        my3.b0 b0Var = (my3.b0) kVar5;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchService", "onBluetoothOn");
                        android.os.Bundle bundle = (android.os.Bundle) com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0(), iy3.q.class);
                        java.lang.String string = bundle != null ? bundle.getString(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52914x1ed75ebb, "") : null;
                        java.lang.String string2 = bundle != null ? bundle.getString(dm.i4.f66875xa013b0d5, "") : null;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchService", "onBluetoothOn storeMac:" + string + ", storeUsername:" + string2);
                        if ((string == null || string.length() == 0) == false) {
                            hy3.a aVar4 = hy3.b.f367604a;
                            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                            java.lang.String a17 = aVar4.a(context, string);
                            android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                            boolean c17 = aVar4.c(context2, a17);
                            my3.c0 c0Var5 = b0Var.f414316a;
                            if (c17) {
                                gy3.a aVar5 = c0Var5.f414319a;
                                if (aVar5 != null) {
                                    ((gy3.d) aVar5).d(a17);
                                }
                                gy3.a aVar6 = c0Var5.f414319a;
                                if (aVar6 != null) {
                                    ((gy3.d) aVar6).b();
                                }
                            }
                            if (string2 != null) {
                                if ((string2.length() == 0) == false) {
                                    z17 = false;
                                    c0Var5.f414328j = z17;
                                }
                            }
                            z17 = true;
                            c0Var5.f414328j = z17;
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(26126, 1, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 25, 0);
                        return;
                    }
                    return;
                case 8:
                    if (dVar.f359090e != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchService", "onBluetoothOff");
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(26126, 1, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 26, 0);
                    }
                    gy3.j jVar2 = dVar.f359088c;
                    if (jVar2 != null) {
                        jVar2.a();
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}
