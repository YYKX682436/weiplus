package com.tencent.mapsdk.internal;

/* loaded from: classes3.dex */
public final class jc implements com.tencent.mapsdk.internal.jk<java.lang.Integer> {
    @Override // com.tencent.mapsdk.internal.jk
    public final /* synthetic */ java.lang.Integer a(float f17, java.lang.Integer num, java.lang.Integer num2) {
        return java.lang.Integer.valueOf((int) (num.intValue() + (f17 * (num2.intValue() - r3))));
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private static java.lang.Integer a2(float f17, java.lang.Integer num, java.lang.Integer num2) {
        return java.lang.Integer.valueOf((int) (num.intValue() + (f17 * (num2.intValue() - r2))));
    }
}
