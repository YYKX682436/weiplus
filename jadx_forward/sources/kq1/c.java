package kq1;

/* loaded from: classes13.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final kq1.b f392770a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.BroadcastReceiver f392771b;

    public c(kq1.b bVar) {
        kq1.a aVar = new kq1.a(this);
        this.f392771b = aVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("McroMsg.exdevice.BluetoohtStateMonitor", "register BluetoothState receiver");
        this.f392770a = bVar;
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(aVar, intentFilter);
    }
}
