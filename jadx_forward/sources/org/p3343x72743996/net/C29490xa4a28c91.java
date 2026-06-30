package org.p3343x72743996.net;

@org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29387x20efb56(m152783x6ac9171 = "net::android::traffic_stats")
/* renamed from: org.chromium.net.AndroidTrafficStats */
/* loaded from: classes12.dex */
public class C29490xa4a28c91 {
    private C29490xa4a28c91() {
    }

    /* renamed from: getCurrentUidRxBytes */
    private static long m153087x577974f8() {
        long uidRxBytes = android.net.TrafficStats.getUidRxBytes(android.os.Process.myUid());
        if (uidRxBytes != -1) {
            return uidRxBytes;
        }
        return 0L;
    }

    /* renamed from: getCurrentUidTxBytes */
    private static long m153088xc145eb7a() {
        long uidTxBytes = android.net.TrafficStats.getUidTxBytes(android.os.Process.myUid());
        if (uidTxBytes != -1) {
            return uidTxBytes;
        }
        return 0L;
    }

    /* renamed from: getTotalRxBytes */
    private static long m153089xe12e9857() {
        long totalRxBytes = android.net.TrafficStats.getTotalRxBytes();
        if (totalRxBytes != -1) {
            return totalRxBytes;
        }
        return 0L;
    }

    /* renamed from: getTotalTxBytes */
    private static long m153090x4afb0ed9() {
        long totalTxBytes = android.net.TrafficStats.getTotalTxBytes();
        if (totalTxBytes != -1) {
            return totalTxBytes;
        }
        return 0L;
    }
}
