package com.p314xaae8f345.p347x615374d.p349x208df1fe.app;

/* renamed from: com.tencent.kinda.framework.app.TestMeasure */
/* loaded from: classes9.dex */
public class C3161x83f0b84c {
    public static final java.lang.String TAG = "TestMeasure";

    /* renamed from: valMeasure */
    public long f12172x35ed5efd = 0;

    /* renamed from: valLayout */
    public long f12171x8c3e11ab = 0;

    /* renamed from: reset */
    public void m25503x6761d4f() {
        this.f12172x35ed5efd = 0L;
        this.f12171x8c3e11ab = 0L;
    }

    /* renamed from: result */
    public java.lang.String m25504xc84dc81d() {
        return java.lang.String.format("result valMeasure:%s valLayout:%s total:%s", java.lang.Long.valueOf(this.f12172x35ed5efd), java.lang.Long.valueOf(this.f12171x8c3e11ab), java.lang.Long.valueOf(this.f12171x8c3e11ab + this.f12172x35ed5efd));
    }
}
