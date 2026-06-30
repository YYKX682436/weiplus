package hq1;

/* loaded from: classes13.dex */
public class u implements hq1.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hq1.a0 f364729a;

    public u(hq1.a0 a0Var) {
        this.f364729a = a0Var;
    }

    @Override // hq1.m
    public void a() {
        hq1.a0 a0Var = this.f364729a;
        hq1.z zVar = a0Var.f364615b;
        if (zVar != null) {
            u32.l1 l1Var = (u32.l1) zVar;
            l1Var.getClass();
            u32.u1 u1Var = new u32.u1(null);
            u1Var.f505907a = true;
            u1Var.f505908b = null;
            u1Var.f505909c = null;
            u1Var.f505910d = 0;
            u1Var.f505911e = null;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = l1Var.f505856a.f505800p;
            if (!n3Var.mo50308x2936bf5f(n3Var.mo50292x733c63a2(13, u1Var))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage failed!!!, message what = %d", 13);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exdevice.BluetoothLESimpleManager", "no SimpleBLEManagerCallback");
        }
        a0Var.f364621h.clear();
    }

    @Override // hq1.m
    public void b(android.bluetooth.BluetoothDevice bluetoothDevice, int i17, byte[] bArr) {
        boolean z17;
        java.nio.ByteBuffer order;
        long h17 = a42.i.h(bluetoothDevice.getAddress());
        hq1.a0 a0Var = this.f364729a;
        if (a0Var.f364621h.contains(java.lang.Long.valueOf(h17))) {
            return;
        }
        bluetoothDevice.getName();
        bluetoothDevice.getAddress();
        a42.i.a(bArr);
        a0Var.f364621h.add(java.lang.Long.valueOf(h17));
        java.util.HashMap hashMap = iq1.f.f375212a;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(bArr)) {
            int i18 = 0;
            loop0: while (true) {
                if (i18 < 0 || i18 >= bArr.length) {
                    break;
                }
                int i19 = i18 + 1;
                byte b17 = bArr[i18];
                if (i19 + b17 > bArr.length) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("iq1.f", "broadcast data len is not enough. offset = %d, current len = %d, broadcast len = %d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(b17), java.lang.Integer.valueOf(bArr.length));
                    break;
                }
                if (b17 <= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("iq1.f", "current part of data's len = %d.", java.lang.Integer.valueOf(b17));
                    break;
                }
                int i27 = i19 + 1;
                byte b18 = bArr[i19];
                int i28 = b17 - 1;
                if (b18 != -1) {
                    java.util.HashMap hashMap2 = iq1.f.f375212a;
                    z17 = true;
                    if (b18 == 2 || b18 == 3) {
                        while (2 <= i28) {
                            int i29 = i27 + 1;
                            int i37 = i29 + 1;
                            i28 -= 2;
                            if (hashMap2.containsKey(java.lang.String.format("%08x-0000-1000-8000-00805f9b34fb", java.lang.Integer.valueOf(((bArr[i29] & 255) << 8) | (bArr[i27] & 255))))) {
                                break loop0;
                            } else {
                                i27 = i37;
                            }
                        }
                        i18 = i28 + i27;
                    } else {
                        if (b18 == 6 || b18 == 7) {
                            while (16 <= i28) {
                                try {
                                    order = java.nio.ByteBuffer.wrap(bArr, i27, 16).order(java.nio.ByteOrder.LITTLE_ENDIAN);
                                } catch (java.lang.IndexOutOfBoundsException e17) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("BlueToothDeviceFilter.parseUUID", e17.toString());
                                }
                                if (hashMap2.containsKey(new java.util.UUID(order.getLong(), order.getLong()).toString())) {
                                    break loop0;
                                }
                                i27 += 16;
                                i28 -= 16;
                            }
                        }
                        i18 = i28 + i27;
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("iq1.f", "Manufacturer Specific Data size = %s", java.lang.Integer.valueOf(i28));
                    i18 = i28 + i27;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("iq1.f", "Manufacturer Specific Data = %s", a42.i.a(java.util.Arrays.copyOfRange(bArr, i27, i18)));
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("iq1.f", "parseBroadcastServiceUuid error. broadcast data is null or nil");
        }
        z17 = false;
        if (z17) {
            hq1.z zVar = a0Var.f364615b;
            java.lang.String address = bluetoothDevice.getAddress();
            java.lang.String name = bluetoothDevice.getName();
            u32.l1 l1Var = (u32.l1) zVar;
            l1Var.getClass();
            u32.u1 u1Var = new u32.u1(null);
            u1Var.f505907a = false;
            u1Var.f505908b = address;
            u1Var.f505909c = name;
            u1Var.f505910d = i17;
            u1Var.f505911e = bArr;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = l1Var.f505856a.f505800p;
            if (n3Var.mo50308x2936bf5f(n3Var.mo50292x733c63a2(13, u1Var))) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage failed!!!, message what = %d", 13);
        }
    }
}
