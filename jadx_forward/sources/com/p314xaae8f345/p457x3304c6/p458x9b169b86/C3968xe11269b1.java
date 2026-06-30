package com.p314xaae8f345.p457x3304c6.p458x9b169b86;

/* renamed from: com.tencent.maas.analytics.MJAnalyticsEvent */
/* loaded from: classes5.dex */
public class C3968xe11269b1 {

    /* renamed from: a, reason: collision with root package name */
    public final ig.a f129329a;

    /* renamed from: b, reason: collision with root package name */
    public final java.nio.ByteBuffer f129330b;

    public C3968xe11269b1(ig.a aVar, java.nio.ByteBuffer byteBuffer) {
        this.f129329a = aVar;
        this.f129330b = byteBuffer == null ? null : java.nio.ByteBuffer.allocate(byteBuffer.limit()).put(byteBuffer);
    }

    /* renamed from: createFrom */
    public static com.p314xaae8f345.p457x3304c6.p458x9b169b86.C3968xe11269b1 m32401x51964ec6(int i17, java.nio.ByteBuffer byteBuffer) {
        ig.a aVar;
        ig.a[] m135240xcee59d22 = ig.a.m135240xcee59d22();
        int length = m135240xcee59d22.length;
        int i18 = 0;
        while (true) {
            if (i18 >= length) {
                aVar = ig.a.General;
                break;
            }
            aVar = m135240xcee59d22[i18];
            if (aVar.f372801d == i17) {
                break;
            }
            i18++;
        }
        return new com.p314xaae8f345.p457x3304c6.p458x9b169b86.C3968xe11269b1(aVar, byteBuffer);
    }

    /* renamed from: getPBData */
    public java.nio.ByteBuffer m32402x27f85b92() {
        return this.f129330b;
    }
}
