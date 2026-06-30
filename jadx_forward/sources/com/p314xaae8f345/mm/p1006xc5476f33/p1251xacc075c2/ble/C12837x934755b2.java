package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.ble;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/backup/ble/BluetoothStateReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "vn1/o", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.backup.ble.BluetoothStateReceiver */
/* loaded from: classes11.dex */
public final class C12837x934755b2 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Set f174072a;

    static {
        new vn1.o(null);
        f174072a = new java.util.LinkedHashSet();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(intent.getAction(), "android.bluetooth.adapter.action.STATE_CHANGED")) {
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
            java.util.Set set = f174072a;
            if (intExtra == 10) {
                java.util.Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((vn1.n) it.next()).b();
                }
            } else {
                if (intExtra != 12) {
                    return;
                }
                java.util.Iterator it6 = set.iterator();
                while (it6.hasNext()) {
                    ((vn1.n) it6.next()).a();
                }
            }
        }
    }
}
