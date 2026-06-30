package com.tencent.maas.analytics;

/* loaded from: classes5.dex */
public class MJAnalyticsEvent {

    /* renamed from: a, reason: collision with root package name */
    public final ig.a f47796a;

    /* renamed from: b, reason: collision with root package name */
    public final java.nio.ByteBuffer f47797b;

    public MJAnalyticsEvent(ig.a aVar, java.nio.ByteBuffer byteBuffer) {
        this.f47796a = aVar;
        this.f47797b = byteBuffer == null ? null : java.nio.ByteBuffer.allocate(byteBuffer.limit()).put(byteBuffer);
    }

    public static com.tencent.maas.analytics.MJAnalyticsEvent createFrom(int i17, java.nio.ByteBuffer byteBuffer) {
        ig.a aVar;
        ig.a[] values = ig.a.values();
        int length = values.length;
        int i18 = 0;
        while (true) {
            if (i18 >= length) {
                aVar = ig.a.General;
                break;
            }
            aVar = values[i18];
            if (aVar.f291268d == i17) {
                break;
            }
            i18++;
        }
        return new com.tencent.maas.analytics.MJAnalyticsEvent(aVar, byteBuffer);
    }

    public java.nio.ByteBuffer getPBData() {
        return this.f47797b;
    }
}
