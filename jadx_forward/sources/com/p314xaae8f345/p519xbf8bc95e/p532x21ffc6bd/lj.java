package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes7.dex */
public final class lj {

    /* renamed from: a, reason: collision with root package name */
    public static final int f131838a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f131839b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.Rect f131840c = new android.graphics.Rect();

    /* renamed from: d, reason: collision with root package name */
    public int[] f131841d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f131842e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f131843f;

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

    private static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lj a(byte[] bArr) {
        java.nio.ByteBuffer order = java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.nativeOrder());
        if (order.get() == 0) {
            return null;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lj ljVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lj();
        ljVar.f131841d = new int[order.get()];
        ljVar.f131842e = new int[order.get()];
        ljVar.f131843f = new int[order.get()];
        a(ljVar.f131841d.length);
        a(ljVar.f131842e.length);
        order.getInt();
        order.getInt();
        ljVar.f131840c.left = order.getInt();
        ljVar.f131840c.right = order.getInt();
        ljVar.f131840c.top = order.getInt();
        ljVar.f131840c.bottom = order.getInt();
        order.getInt();
        a(ljVar.f131841d, order);
        a(ljVar.f131842e, order);
        a(ljVar.f131843f, order);
        return ljVar;
    }
}
