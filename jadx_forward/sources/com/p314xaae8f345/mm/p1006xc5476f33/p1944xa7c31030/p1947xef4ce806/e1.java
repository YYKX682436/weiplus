package com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806;

/* loaded from: classes12.dex */
public class e1 implements wu5.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.C16801xcc3e7637 f234573d;

    public e1(com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.C16801xcc3e7637 c16801xcc3e7637) {
        this.f234573d = c16801xcc3e7637;
    }

    @Override // wu5.f
    public boolean a() {
        return false;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "MicroMsg.ThreadWatchDog";
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        int i18;
        java.lang.String m67554xc84c5534;
        int i19;
        int i27;
        com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.C16801xcc3e7637 c16801xcc3e7637 = this.f234573d;
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        try {
            i17 = c16801xcc3e7637.f37744x4006283;
            c16801xcc3e7637.f37741xfe230939 = i17;
            i18 = c16801xcc3e7637.f37739x493c6d76;
            c16801xcc3e7637.f37740xda4c3280 = i18;
            c16801xcc3e7637.f37744x4006283 = com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.b1.b();
            java.util.Collection a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.b1.a();
            java.util.Iterator it = a17.iterator();
            int i28 = 0;
            while (it.hasNext()) {
                i28 += ((com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.z0) it.next()).a();
            }
            c16801xcc3e7637.f37739x493c6d76 = i28;
            m67554xc84c5534 = c16801xcc3e7637.m67554xc84c5534();
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            long uptimeMillis2 = android.os.SystemClock.uptimeMillis() - uptimeMillis;
            i19 = c16801xcc3e7637.f37739x493c6d76;
            i27 = c16801xcc3e7637.f37744x4006283;
            if (m67554xc84c5534 == null) {
                m67554xc84c5534 = a17.toString();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.C16801xcc3e7637.m67544x523e1edf("ui", uptimeMillis2, i19, i27, m67554xc84c5534);
        } finally {
            try {
            } finally {
            }
        }
    }
}
