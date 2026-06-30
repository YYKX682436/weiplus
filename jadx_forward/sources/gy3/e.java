package gy3;

/* loaded from: classes13.dex */
public final class e extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f359097a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.lang.String name, gy3.f context) {
        super(name);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f359097a = new java.lang.ref.WeakReference(context);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        gy3.f fVar = (gy3.f) this.f359097a.get();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosBluetoothThreads", "handleMessage " + msg.what);
        int i17 = msg.what;
        if (i17 != 0) {
            if (i17 == 1 && fVar != null) {
                try {
                    try {
                        try {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosBluetoothThreads", "begin close socket");
                            android.bluetooth.BluetoothSocket bluetoothSocket = fVar.f359100c;
                            if (bluetoothSocket != null) {
                                bluetoothSocket.close();
                            }
                        } catch (java.lang.NullPointerException e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Rtos.RtosBluetoothThreads", "Close socket null!!! (" + e17 + ')');
                        }
                    } catch (java.io.IOException e18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Rtos.RtosBluetoothThreads", "socket close failed (%s)", e18.toString());
                    }
                    return;
                } finally {
                    fVar.f359100c = null;
                }
            }
            return;
        }
        if (fVar != null) {
            if (android.os.Build.VERSION.SDK_INT >= 31 && b3.l.m9698x3fed0563(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "android.permission.BLUETOOTH_CONNECT") != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Rtos.RtosBluetoothThreads", "don`t have bluetooth connect permission");
                return;
            }
            try {
                android.bluetooth.BluetoothSocket createInsecureRfcommSocketToServiceRecord = fVar.f359099b.createInsecureRfcommSocketToServiceRecord(gy3.j.f359113e);
                fVar.f359100c = createInsecureRfcommSocketToServiceRecord;
                if (createInsecureRfcommSocketToServiceRecord == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Rtos.RtosBluetoothThreads", "createRfcommSocket Failed: null");
                    ((gy3.d) fVar.f359098a.f359114a).h("Can not createRfcommSocket");
                    ((gy3.d) fVar.f359098a.f359114a).g();
                    return;
                }
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosBluetoothThreads", "begin socket connect()");
                    ((gy3.d) fVar.f359098a.f359114a).f();
                    createInsecureRfcommSocketToServiceRecord.connect();
                    gy3.d dVar = (gy3.d) fVar.f359098a.f359114a;
                    dVar.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosBCChannel", "onConnected");
                    dVar.f359094i = false;
                    dVar.f359093h = true;
                    dVar.f359095j.a();
                    gy3.c cVar = dVar.f359092g;
                    cVar.mo50308x2936bf5f(cVar.mo50289x733c63a2(5));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosBluetoothThreads", "startWorkThread");
                    gy3.j jVar = fVar.f359098a;
                    jVar.getClass();
                    gy3.h hVar = jVar.f359116c;
                    if (hVar != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RecvThread", "RecvRunnable cancel");
                        if (hVar.f359105g) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Rtos.RecvThread", "Cancel is done aready, just leave");
                        } else {
                            hVar.f359105g = true;
                        }
                    }
                    jVar.f359116c = null;
                    gy3.i iVar = jVar.f359117d;
                    if (iVar != null) {
                        iVar.a();
                    }
                    jVar.f359117d = null;
                    jVar.f359116c = new gy3.h(jVar, createInsecureRfcommSocketToServiceRecord);
                    ku5.u0 u0Var = ku5.t0.f394148d;
                    gy3.h hVar2 = jVar.f359116c;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(hVar2);
                    ((ku5.t0) u0Var).q(hVar2);
                    jVar.f359117d = new gy3.i(jVar, createInsecureRfcommSocketToServiceRecord);
                    ku5.u0 u0Var2 = ku5.t0.f394148d;
                    gy3.i iVar2 = jVar.f359117d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(iVar2);
                    ((ku5.t0) u0Var2).q(iVar2);
                } catch (java.io.IOException e19) {
                    fVar.b(e19);
                } catch (java.lang.NullPointerException e27) {
                    fVar.b(e27);
                } catch (java.lang.SecurityException e28) {
                    fVar.b(e28);
                }
            } catch (java.io.IOException e29) {
                fVar.f359100c = null;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Rtos.RtosBluetoothThreads", "createRfcommSocket Failed!!! (" + e29 + ')');
                ((gy3.d) fVar.f359098a.f359114a).h("Can not createRfcommSocket");
                ((gy3.d) fVar.f359098a.f359114a).g();
            }
        }
    }
}
