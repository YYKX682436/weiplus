package com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3236xd162537e;

/* renamed from: com.tencent.youtu.ytagreflectlivecheck.worker.TimeCounter */
/* loaded from: classes.dex */
public class C27953xc673f24f {
    private static java.lang.String TAG = "TimeCounter";

    /* renamed from: allMap */
    private static java.util.HashMap<java.lang.String, com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3236xd162537e.C27953xc673f24f> f62563xabaa43fb;

    /* renamed from: name */
    private java.lang.String f62568x337a8b;
    private float sum = 0.0f;

    /* renamed from: count */
    private int f62566x5a7510f = 0;

    /* renamed from: average */
    private float f62564xda5cde1d = 0.0f;
    private float min = 0.0f;
    private float max = 0.0f;

    /* renamed from: last */
    private float f62567x329296 = 0.0f;

    /* renamed from: beginTime */
    private long f62565xc00dc316 = 0;

    public C27953xc673f24f(java.lang.String str) {
        this.f62568x337a8b = str;
    }

    /* renamed from: clearIns */
    public static void m121197x2f1aaa61() {
        f62563xabaa43fb.clear();
        f62563xabaa43fb = null;
    }

    /* renamed from: getCurrentTime */
    private static long m121198xfdac66b0() {
        return java.lang.System.currentTimeMillis() * 1000;
    }

    public static com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3236xd162537e.C27953xc673f24f ins(java.lang.String str) {
        if (f62563xabaa43fb == null) {
            f62563xabaa43fb = new java.util.HashMap<>();
        }
        if (f62563xabaa43fb.get(str) == null) {
            f62563xabaa43fb.put(str, new com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3236xd162537e.C27953xc673f24f(str));
        }
        return f62563xabaa43fb.get(str);
    }

    /* renamed from: printAll */
    public static java.lang.String m121199xba7ab3b4() {
        java.util.Iterator<java.lang.String> it = f62563xabaa43fb.keySet().iterator();
        java.lang.String str = "";
        while (it.hasNext()) {
            str = str + "\n" + f62563xabaa43fb.get(it.next()).m121201x65fb2ad();
        }
        return str;
    }

    /* renamed from: begin */
    public void m121200x59478a9() {
        this.f62565xc00dc316 = m121198xfdac66b0();
    }

    public void end() {
        end(true);
    }

    /* renamed from: print */
    public java.lang.String m121201x65fb2ad() {
        return this.f62568x337a8b + " count:" + this.f62566x5a7510f + " avg:" + this.f62564xda5cde1d + "ms max:" + this.max + "ms min:" + this.min + "ms last:" + this.f62567x329296 + "ms";
    }

    /* renamed from: reset */
    public void m121202x6761d4f() {
        this.sum = 0.0f;
        this.f62564xda5cde1d = 0.0f;
        this.min = 0.0f;
        this.max = 0.0f;
        this.f62567x329296 = 0.0f;
        this.f62565xc00dc316 = 0L;
    }

    public void end(boolean z17) {
        float m121198xfdac66b0 = ((float) (m121198xfdac66b0() - this.f62565xc00dc316)) / 1000.0f;
        float f17 = this.sum + m121198xfdac66b0;
        this.sum = f17;
        int i17 = this.f62566x5a7510f + 1;
        this.f62566x5a7510f = i17;
        this.f62564xda5cde1d = f17 / i17;
        if (i17 == 1) {
            this.min = m121198xfdac66b0;
            this.max = m121198xfdac66b0;
        } else {
            if (m121198xfdac66b0 < this.min) {
                this.min = m121198xfdac66b0;
            }
            if (m121198xfdac66b0 > this.max) {
                this.max = m121198xfdac66b0;
            }
        }
        this.f62567x329296 = m121198xfdac66b0;
        if (z17) {
            m121201x65fb2ad();
        }
    }
}
