package com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f;

/* renamed from: com.tencent.wechat.aff.chatbot.ZIDL_H7GR2X7uJB */
/* loaded from: classes11.dex */
class C27216x8e9e3c1e extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131 implements com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.s {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.t f297586a;

    public C27216x8e9e3c1e(java.lang.Object obj) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.t tVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.t) obj;
        this.f297586a = tVar;
        ((d90.p) tVar).f308977e = this;
    }

    /* renamed from: ZIDL_AX */
    private native void m111881x1964d17f(long j17, long j18);

    /* renamed from: ZIDL_BX */
    private native void m111882x1964d19e(long j17, long j18);

    /* renamed from: ZIDL_CX */
    private native void m111883x1964d1bd(long j17, long j18);

    public void Q1(long j17) {
        m111881x1964d17f(this.f60633xf042a733, j17);
    }

    public void R1(long j17) {
        m111883x1964d1bd(this.f60633xf042a733, j17);
    }

    /* renamed from: ZIDL_AV */
    public void m111884x1964d17d(long j17, byte[][] bArr) {
        java.util.ArrayList m119629xd40dd8d = com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119629xd40dd8d(xv5.h.f539014m, bArr);
        d90.p pVar = (d90.p) this.f297586a;
        if (m119629xd40dd8d != null) {
            pVar.getClass();
            if (m119629xd40dd8d.isEmpty()) {
                return;
            } else {
                pVar.f308973a.a(m119629xd40dd8d);
            }
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.s sVar = pVar.f308977e;
        if (sVar != null) {
            ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.C27216x8e9e3c1e) sVar).Q1(j17);
        }
    }

    /* renamed from: ZIDL_BV */
    public void m111885x1964d19c(long j17, byte[][] bArr) {
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119629xd40dd8d(xv5.a.f538971n, bArr);
        this.f297586a.getClass();
    }

    /* renamed from: ZIDL_CV */
    public void m111886x1964d1bb(long j17) {
        d90.p pVar = (d90.p) this.f297586a;
        pVar.f308973a.b();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.s sVar = pVar.f308977e;
        if (sVar != null) {
            ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.C27216x8e9e3c1e) sVar).R1(j17);
        }
    }
}
