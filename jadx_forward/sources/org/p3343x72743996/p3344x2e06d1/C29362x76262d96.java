package org.p3343x72743996.p3344x2e06d1;

@org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29387x20efb56(m152783x6ac9171 = "base::android")
/* renamed from: org.chromium.base.RadioUtils */
/* loaded from: classes13.dex */
public class C29362x76262d96 {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f73416x7118e671 = false;

    /* renamed from: sHaveAccessNetworkState */
    private static java.lang.Boolean f73417x45d63262;

    /* renamed from: sHaveAccessWifiState */
    private static java.lang.Boolean f73418x6702937d;

    private C29362x76262d96() {
    }

    /* renamed from: getCellDataActivity */
    private static int m152629x35dd3ed1() {
        org.p3343x72743996.p3344x2e06d1.C29371xb04a7075 m152702xc9e48c90 = org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.m152702xc9e48c90("RadioUtils::getCellDataActivity");
        try {
            try {
                int dataActivity = ((android.telephony.TelephonyManager) org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035().getSystemService("phone")).getDataActivity();
                if (m152702xc9e48c90 != null) {
                    m152702xc9e48c90.close();
                }
                return dataActivity;
            } catch (java.lang.SecurityException unused) {
                if (m152702xc9e48c90 == null) {
                    return -1;
                }
                m152702xc9e48c90.close();
                return -1;
            }
        } catch (java.lang.Throwable th6) {
            if (m152702xc9e48c90 != null) {
                try {
                    m152702xc9e48c90.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    /* renamed from: getCellSignalLevel */
    private static int m152630x296ac4c4() {
        org.p3343x72743996.p3344x2e06d1.C29371xb04a7075 m152702xc9e48c90 = org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.m152702xc9e48c90("RadioUtils::getCellSignalLevel");
        try {
            int i17 = -1;
            try {
                android.telephony.SignalStrength m152838xd707c7ff = org.p3343x72743996.p3344x2e06d1.p3346xaf3f3382.C29394xdcec370f.m152838xd707c7ff((android.telephony.TelephonyManager) org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035().getSystemService("phone"));
                if (m152838xd707c7ff != null) {
                    i17 = m152838xd707c7ff.getLevel();
                }
            } catch (java.lang.SecurityException unused) {
            }
            if (m152702xc9e48c90 != null) {
                m152702xc9e48c90.close();
            }
            return i17;
        } catch (java.lang.Throwable th6) {
            if (m152702xc9e48c90 != null) {
                try {
                    m152702xc9e48c90.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    /* renamed from: haveAccessNetworkState */
    private static boolean m152631xc245ae0f() {
        if (f73417x45d63262 == null) {
            f73417x45d63262 = java.lang.Boolean.valueOf(org.p3343x72743996.p3344x2e06d1.C29279xa15234bb.m152158x28e6dcf7(org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035(), "android.permission.ACCESS_NETWORK_STATE", android.os.Process.myPid(), android.os.Process.myUid()) == 0);
        }
        return f73417x45d63262.booleanValue();
    }

    /* renamed from: haveAccessWifiState */
    private static boolean m152632xe9b7ef0() {
        if (f73418x6702937d == null) {
            f73418x6702937d = java.lang.Boolean.valueOf(org.p3343x72743996.p3344x2e06d1.C29279xa15234bb.m152158x28e6dcf7(org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035(), "android.permission.ACCESS_WIFI_STATE", android.os.Process.myPid(), android.os.Process.myUid()) == 0);
        }
        return f73418x6702937d.booleanValue();
    }

    /* renamed from: isSupported */
    private static boolean m152633x450f16a4() {
        return android.os.Build.VERSION.SDK_INT >= 28 && m152631xc245ae0f() && m152632xe9b7ef0();
    }

    /* renamed from: isWifiConnected */
    private static boolean m152634x622ee26a() {
        org.p3343x72743996.p3344x2e06d1.C29371xb04a7075 m152702xc9e48c90 = org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.m152702xc9e48c90("RadioUtils::isWifiConnected");
        try {
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035().getSystemService("connectivity");
            android.net.Network m152789xe4f45c92 = org.p3343x72743996.p3344x2e06d1.p3346xaf3f3382.C29390xdcec370c.m152789xe4f45c92(connectivityManager);
            if (m152789xe4f45c92 == null) {
                if (m152702xc9e48c90 != null) {
                    m152702xc9e48c90.close();
                }
                return false;
            }
            android.net.NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(m152789xe4f45c92);
            if (networkCapabilities == null) {
                if (m152702xc9e48c90 != null) {
                    m152702xc9e48c90.close();
                }
                return false;
            }
            boolean hasTransport = networkCapabilities.hasTransport(1);
            if (m152702xc9e48c90 != null) {
                m152702xc9e48c90.close();
            }
            return hasTransport;
        } catch (java.lang.Throwable th6) {
            if (m152702xc9e48c90 != null) {
                try {
                    m152702xc9e48c90.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }
}
