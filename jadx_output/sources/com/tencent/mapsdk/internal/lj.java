package com.tencent.mapsdk.internal;

/* loaded from: classes7.dex */
public final class lj {

    /* renamed from: a, reason: collision with root package name */
    public static final int f50305a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f50306b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.Rect f50307c = new android.graphics.Rect();

    /* renamed from: d, reason: collision with root package name */
    public int[] f50308d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f50309e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f50310f;

    private static void a(int[] iArr, java.nio.ByteBuffer byteBuffer) {
        int length = iArr.length;
        for (int i17 = 0; i17 < length; i17++) {
            iArr[i17] = byteBuffer.getInt();
        }
    }

    private static void a(int i17) {
        if (i17 == 0 || (i17 & 1) != 0) {
            throw new java.lang.RuntimeException("invalid nine-patch: ".concat(java.lang.String.valueOf(i17)));
        }
    }

    private static com.tencent.mapsdk.internal.lj a(byte[] bArr) {
        java.nio.ByteBuffer order = java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.nativeOrder());
        if (order.get() == 0) {
            return null;
        }
        com.tencent.mapsdk.internal.lj ljVar = new com.tencent.mapsdk.internal.lj();
        ljVar.f50308d = new int[order.get()];
        ljVar.f50309e = new int[order.get()];
        ljVar.f50310f = new int[order.get()];
        a(ljVar.f50308d.length);
        a(ljVar.f50309e.length);
        order.getInt();
        order.getInt();
        ljVar.f50307c.left = order.getInt();
        ljVar.f50307c.right = order.getInt();
        ljVar.f50307c.top = order.getInt();
        ljVar.f50307c.bottom = order.getInt();
        order.getInt();
        a(ljVar.f50308d, order);
        a(ljVar.f50309e, order);
        a(ljVar.f50310f, order);
        return ljVar;
    }
}
