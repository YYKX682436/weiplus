package com.tencent.mapsdk.internal;

/* loaded from: classes3.dex */
public final class ja implements com.tencent.mapsdk.internal.jk<java.lang.Number> {
    @Override // com.tencent.mapsdk.internal.jk
    public final /* synthetic */ java.lang.Number a(float f17, java.lang.Number number, java.lang.Number number2) {
        double doubleValue = number.doubleValue();
        return java.lang.Double.valueOf(doubleValue + (f17 * (number2.doubleValue() - doubleValue)));
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private static java.lang.Number a2(float f17, java.lang.Number number, java.lang.Number number2) {
        double doubleValue = number.doubleValue();
        return java.lang.Double.valueOf(doubleValue + (f17 * (number2.doubleValue() - doubleValue)));
    }
}
