package lb1;

/* loaded from: classes7.dex */
public class d implements lb1.l {

    /* renamed from: a, reason: collision with root package name */
    public volatile java.util.Queue f399233a;

    /* renamed from: b, reason: collision with root package name */
    public volatile ob1.c f399234b;

    /* renamed from: c, reason: collision with root package name */
    public volatile java.util.List f399235c;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f399236d = new android.os.Handler(android.os.Looper.getMainLooper());

    @Override // lb1.l
    public void a(android.bluetooth.BluetoothGatt bluetoothGatt, int i17, int i18) {
        ob1.c cVar = this.f399234b;
        if (cVar != null) {
            cVar.a(bluetoothGatt, i17, i18);
        }
        java.util.List list = this.f399235c;
        if (list != null) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                ob1.c cVar2 = (ob1.c) it.next();
                if (!cVar2.f425530l) {
                    cVar2.a(bluetoothGatt, i17, i18);
                }
            }
        }
    }

    @Override // lb1.l
    public void b(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor, int i17) {
        java.util.List list = this.f399235c;
        if (list != null) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                boolean z17 = ((ob1.c) it.next()).f425530l;
            }
        }
    }

    @Override // lb1.l
    public void c(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor, int i17) {
        ob1.c cVar = this.f399234b;
        if (cVar != null) {
            cVar.c(bluetoothGatt, bluetoothGattDescriptor, i17);
        }
        java.util.List list = this.f399235c;
        if (list != null) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                ob1.c cVar2 = (ob1.c) it.next();
                if (!cVar2.f425530l) {
                    cVar2.c(bluetoothGatt, bluetoothGattDescriptor, i17);
                }
            }
        }
    }

    @Override // lb1.l
    public void d(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        java.util.List list = this.f399235c;
        if (list != null) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                boolean z17 = ((ob1.c) it.next()).f425530l;
            }
        }
    }

    @Override // lb1.l
    public void e(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, int i17) {
        ob1.c cVar = this.f399234b;
        if (cVar != null) {
            cVar.e(bluetoothGatt, bluetoothGattCharacteristic, i17);
        }
        java.util.List list = this.f399235c;
        if (list != null) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                ob1.c cVar2 = (ob1.c) it.next();
                if (!cVar2.f425530l) {
                    cVar2.j(bluetoothGatt, i17);
                }
            }
        }
    }

    @Override // lb1.l
    public void f(android.bluetooth.BluetoothGatt bluetoothGatt, int i17) {
        java.util.List list = this.f399235c;
        if (list != null) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                boolean z17 = ((ob1.c) it.next()).f425530l;
            }
        }
    }

    @Override // lb1.l
    public void g(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, int i17) {
        ob1.c cVar = this.f399234b;
        if (cVar != null) {
            cVar.g(bluetoothGatt, bluetoothGattCharacteristic, i17);
        }
        java.util.List list = this.f399235c;
        if (list != null) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                ob1.c cVar2 = (ob1.c) it.next();
                if (!cVar2.f425530l) {
                    cVar2.g(bluetoothGatt, bluetoothGattCharacteristic, i17);
                }
            }
        }
    }

    @Override // lb1.l
    public void h(android.bluetooth.BluetoothGatt bluetoothGatt, int i17, int i18) {
        ob1.c cVar = this.f399234b;
        if (cVar != null) {
            cVar.h(bluetoothGatt, i17, i18);
        }
        java.util.List list = this.f399235c;
        if (list != null) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                ob1.c cVar2 = (ob1.c) it.next();
                if (!cVar2.f425530l) {
                    cVar2.j(bluetoothGatt, i18);
                }
            }
        }
    }

    @Override // lb1.l
    public void i(android.bluetooth.BluetoothGatt bluetoothGatt, int i17, int i18) {
        ob1.c cVar = this.f399234b;
        if (cVar != null) {
            cVar.i(bluetoothGatt, i17, i18);
        }
        java.util.List list = this.f399235c;
        if (list != null) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                ob1.c cVar2 = (ob1.c) it.next();
                if (!cVar2.f425530l) {
                    cVar2.i(bluetoothGatt, i17, i18);
                }
            }
        }
    }

    @Override // lb1.l
    public void j(android.bluetooth.BluetoothGatt bluetoothGatt, int i17) {
        ob1.c cVar = this.f399234b;
        if (cVar != null) {
            cVar.j(bluetoothGatt, i17);
        }
        java.util.List list = this.f399235c;
        if (list != null) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                ob1.c cVar2 = (ob1.c) it.next();
                if (!cVar2.f425530l) {
                    cVar2.j(bluetoothGatt, i17);
                }
            }
        }
    }

    public final synchronized void k() {
        ob1.c cVar = this.f399234b;
        if (cVar == null || cVar.f425530l) {
            java.util.Queue queue = this.f399233a;
            if (queue != null) {
                java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = (java.util.concurrent.ConcurrentLinkedQueue) queue;
                if (concurrentLinkedQueue.size() > 0) {
                    ob1.c cVar2 = (ob1.c) concurrentLinkedQueue.poll();
                    if (cVar2 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Ble.BleConnectDispatcher", "curSerialAction is null, err", new java.lang.Object[0]);
                        return;
                    }
                    this.f399234b = cVar2;
                    if (cVar2.f425525g) {
                        this.f399236d.postDelayed(new lb1.c(this, cVar2), cVar2.f425528j);
                    } else {
                        cVar2.k();
                    }
                }
            }
        }
    }
}
