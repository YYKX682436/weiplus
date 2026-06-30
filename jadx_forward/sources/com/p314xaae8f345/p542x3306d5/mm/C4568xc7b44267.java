package com.p314xaae8f345.p542x3306d5.mm;

/* renamed from: com.tencent.mars.mm.MMLiveSpeedTestInterfaces */
/* loaded from: classes12.dex */
public class C4568xc7b44267 {
    private static final java.lang.String TAG = "MMLiveSpeedTestInterfaces";

    /* renamed from: mInstance */
    private static com.p314xaae8f345.p542x3306d5.mm.C4568xc7b44267 f19415x46143c22;

    /* renamed from: speedTestCallbackMap */
    private static java.util.Map<java.lang.Integer, com.p314xaae8f345.mm.p971x6de15a2e.c1> f19416x927fdf9e = new java.util.HashMap();

    /* renamed from: speedTestTaskId */
    private static int f19417x592d5c59 = 1;

    private C4568xc7b44267() {
    }

    /* renamed from: getInstance */
    public static synchronized com.p314xaae8f345.p542x3306d5.mm.C4568xc7b44267 m40184x9cf0d20b() {
        com.p314xaae8f345.p542x3306d5.mm.C4568xc7b44267 c4568xc7b44267;
        synchronized (com.p314xaae8f345.p542x3306d5.mm.C4568xc7b44267.class) {
            if (f19415x46143c22 == null) {
                f19415x46143c22 = new com.p314xaae8f345.p542x3306d5.mm.C4568xc7b44267();
            }
            c4568xc7b44267 = f19415x46143c22;
        }
        return c4568xc7b44267;
    }

    /* renamed from: doLiveSpeedTest */
    public int m40185x17921322(java.lang.String str, int i17, int i18, int i19, int i27, byte[] bArr, byte[] bArr2, com.p314xaae8f345.mm.p971x6de15a2e.c1 c1Var) {
        int i28;
        if (c1Var == null || bArr == null || bArr2 == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("speed test callback is null ");
            sb6.append(c1Var == null);
            sb6.append(" ");
            sb6.append(bArr == null);
            sb6.append(" ");
            sb6.append(bArr2 == null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, sb6.toString());
            return -1;
        }
        synchronized (com.p314xaae8f345.p542x3306d5.mm.C4568xc7b44267.class) {
            i28 = f19417x592d5c59;
            f19417x592d5c59 = i28 + 1;
            f19416x927fdf9e.put(java.lang.Integer.valueOf(i28), c1Var);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "start speed test " + str + " " + bArr.length + " " + bArr2.length + " id is " + i28);
        new java.lang.String(bArr);
        new java.lang.String(bArr2);
        com.p314xaae8f345.p542x3306d5.mm.C4575x2505020e c4575x2505020e = new com.p314xaae8f345.p542x3306d5.mm.C4575x2505020e();
        c4575x2505020e.f19511x49dab066 = bArr;
        c4575x2505020e.f19510xb7cf147f = bArr2;
        ((com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.class)).m40236x17921322(str, i17, i18, i19, i27, c4575x2505020e, i28);
        return 0;
    }

    /* renamed from: onLiveSpeedTestCallback */
    public void m40186xce1830b3(com.p314xaae8f345.p542x3306d5.mm.C4567xf5d28c4a c4567xf5d28c4a, boolean z17) {
        com.p314xaae8f345.mm.p971x6de15a2e.c1 c1Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "receive onSpeedTestUploadDone " + z17 + " id " + c4567xf5d28c4a.f19413xcb7ef180);
        synchronized (com.p314xaae8f345.p542x3306d5.mm.C4568xc7b44267.class) {
            c1Var = f19416x927fdf9e.get(java.lang.Integer.valueOf(c4567xf5d28c4a.f19413xcb7ef180));
        }
        if (c1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "speed test callback is null");
            return;
        }
        try {
            try {
                if (z17) {
                    c1Var.Za(c4567xf5d28c4a.f19412xf0d8725a, c4567xf5d28c4a.f19402x50ed02c3, c4567xf5d28c4a.f19411x1fdae0fe, c4567xf5d28c4a.f19414x7ac6c77b, c4567xf5d28c4a.f19404x40213094, c4567xf5d28c4a.f19409xefbad514, c4567xf5d28c4a.f19407xc89316c2, c4567xf5d28c4a.f19405x4cd74542, c4567xf5d28c4a.f19403xf47eb6ed, c4567xf5d28c4a.f19408x24413b6d, c4567xf5d28c4a.f19406x280fc99b);
                } else {
                    c1Var.le(c4567xf5d28c4a.f19412xf0d8725a, c4567xf5d28c4a.f19402x50ed02c3, c4567xf5d28c4a.f19411x1fdae0fe, c4567xf5d28c4a.f19414x7ac6c77b, c4567xf5d28c4a.f19404x40213094, c4567xf5d28c4a.f19409xefbad514, c4567xf5d28c4a.f19407xc89316c2);
                }
                if (z17) {
                    synchronized (com.p314xaae8f345.p542x3306d5.mm.C4568xc7b44267.class) {
                        f19416x927fdf9e.remove(java.lang.Integer.valueOf(c4567xf5d28c4a.f19413xcb7ef180));
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "error " + e17.toString());
                if (z17) {
                    synchronized (com.p314xaae8f345.p542x3306d5.mm.C4568xc7b44267.class) {
                        f19416x927fdf9e.remove(java.lang.Integer.valueOf(c4567xf5d28c4a.f19413xcb7ef180));
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            if (z17) {
                synchronized (com.p314xaae8f345.p542x3306d5.mm.C4568xc7b44267.class) {
                    f19416x927fdf9e.remove(java.lang.Integer.valueOf(c4567xf5d28c4a.f19413xcb7ef180));
                }
            }
            throw th6;
        }
    }
}
