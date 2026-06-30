package com.facebook.soloader;

/* loaded from: classes13.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.facebook.soloader.g0[] f44035a;

    public h0(com.facebook.soloader.g0[] g0VarArr) {
        this.f44035a = g0VarArr;
    }

    public static final com.facebook.soloader.h0 a(java.io.DataInput dataInput) {
        if (dataInput.readByte() != 1) {
            throw new java.lang.RuntimeException("wrong dso manifest version");
        }
        int readInt = dataInput.readInt();
        if (readInt < 0) {
            throw new java.lang.RuntimeException("illegal number of shared libraries");
        }
        com.facebook.soloader.g0[] g0VarArr = new com.facebook.soloader.g0[readInt];
        for (int i17 = 0; i17 < readInt; i17++) {
            g0VarArr[i17] = new com.facebook.soloader.g0(dataInput.readUTF(), dataInput.readUTF());
        }
        return new com.facebook.soloader.h0(g0VarArr);
    }
}
