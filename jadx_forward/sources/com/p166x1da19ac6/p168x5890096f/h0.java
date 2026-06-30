package com.p166x1da19ac6.p168x5890096f;

/* loaded from: classes13.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p166x1da19ac6.p168x5890096f.g0[] f125568a;

    public h0(com.p166x1da19ac6.p168x5890096f.g0[] g0VarArr) {
        this.f125568a = g0VarArr;
    }

    public static final com.p166x1da19ac6.p168x5890096f.h0 a(java.io.DataInput dataInput) {
        if (dataInput.readByte() != 1) {
            throw new java.lang.RuntimeException("wrong dso manifest version");
        }
        int readInt = dataInput.readInt();
        if (readInt < 0) {
            throw new java.lang.RuntimeException("illegal number of shared libraries");
        }
        com.p166x1da19ac6.p168x5890096f.g0[] g0VarArr = new com.p166x1da19ac6.p168x5890096f.g0[readInt];
        for (int i17 = 0; i17 < readInt; i17++) {
            g0VarArr[i17] = new com.p166x1da19ac6.p168x5890096f.g0(dataInput.readUTF(), dataInput.readUTF());
        }
        return new com.p166x1da19ac6.p168x5890096f.h0(g0VarArr);
    }
}
