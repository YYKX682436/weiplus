package org.p3343x72743996.net;

@org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29387x20efb56(m152783x6ac9171 = "net")
/* renamed from: org.chromium.net.NetworkActiveNotifier */
/* loaded from: classes13.dex */
public class C29527x6545447a implements android.net.ConnectivityManager.OnNetworkActiveListener {

    /* renamed from: mAreNotificationsEnabled */
    private boolean f74119x3ba0a280;

    /* renamed from: mConnectivityManager */
    private final android.net.ConnectivityManager f74120xfcf94049 = (android.net.ConnectivityManager) org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035().getSystemService("connectivity");

    /* renamed from: mNativeNetworkActiveObserver */
    private final long f74121x56bf5d46;

    /* renamed from: org.chromium.net.NetworkActiveNotifier$Natives */
    /* loaded from: classes13.dex */
    public interface Natives {
        @org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29388xc13ad346(m152784x6ac9171 = "NetworkChangeNotifierDelegateAndroid")
        /* renamed from: notifyOfDefaultNetworkActive */
        void mo153311x227cdd33(long j17);
    }

    private C29527x6545447a(long j17) {
        this.f74121x56bf5d46 = j17;
    }

    /* renamed from: build */
    public static org.p3343x72743996.net.C29527x6545447a m153306x59bc66e(long j17) {
        return new org.p3343x72743996.net.C29527x6545447a(j17);
    }

    /* renamed from: disableNotifications */
    public void m153307x8e5d9ae0() {
        this.f74119x3ba0a280 = false;
        this.f74120xfcf94049.removeDefaultNetworkActiveListener(this);
    }

    /* renamed from: enableNotifications */
    public void m153308x5a2ec25() {
        this.f74119x3ba0a280 = true;
        this.f74120xfcf94049.addDefaultNetworkActiveListener(this);
    }

    /* renamed from: fakeDefaultNetworkActive */
    public void m153309x759d4508() {
        if (this.f74119x3ba0a280) {
            onNetworkActive();
        }
    }

    /* renamed from: isDefaultNetworkActive */
    public boolean m153310x93853e5d() {
        return this.f74120xfcf94049.isDefaultNetworkActive();
    }

    @Override // android.net.ConnectivityManager.OnNetworkActiveListener
    public void onNetworkActive() {
        org.p3343x72743996.net.C29528xf7bcd4cb.get().mo153311x227cdd33(this.f74121x56bf5d46);
    }
}
