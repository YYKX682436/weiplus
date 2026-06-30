package com.p166x1da19ac6.p168x5890096f;

/* loaded from: classes13.dex */
public class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.io.File f125557d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f125558e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p166x1da19ac6.p168x5890096f.h0 f125559f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.io.File f125560g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p166x1da19ac6.p168x5890096f.t f125561h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p166x1da19ac6.p168x5890096f.m0 f125562i;

    public f0(com.p166x1da19ac6.p168x5890096f.m0 m0Var, java.io.File file, byte[] bArr, com.p166x1da19ac6.p168x5890096f.h0 h0Var, java.io.File file2, com.p166x1da19ac6.p168x5890096f.t tVar) {
        this.f125562i = m0Var;
        this.f125557d = file;
        this.f125558e = bArr;
        this.f125559f = h0Var;
        this.f125560g = file2;
        this.f125561h = tVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p166x1da19ac6.p168x5890096f.t tVar = this.f125561h;
        com.p166x1da19ac6.p168x5890096f.m0 m0Var = this.f125562i;
        try {
            try {
                java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(this.f125557d, "rw");
                try {
                    randomAccessFile.write(this.f125558e);
                    randomAccessFile.setLength(randomAccessFile.getFilePointer());
                    randomAccessFile.close();
                    randomAccessFile = new java.io.RandomAccessFile(new java.io.File(m0Var.f125555a, "dso_manifest"), "rw");
                    try {
                        com.p166x1da19ac6.p168x5890096f.h0 h0Var = this.f125559f;
                        h0Var.getClass();
                        randomAccessFile.writeByte(1);
                        com.p166x1da19ac6.p168x5890096f.g0[] g0VarArr = h0Var.f125568a;
                        randomAccessFile.writeInt(g0VarArr.length);
                        for (int i17 = 0; i17 < g0VarArr.length; i17++) {
                            randomAccessFile.writeUTF(g0VarArr[i17].f125563d);
                            randomAccessFile.writeUTF(g0VarArr[i17].f125564e);
                        }
                        randomAccessFile.close();
                        com.p166x1da19ac6.p168x5890096f.e0.b(m0Var.f125555a);
                        com.p166x1da19ac6.p168x5890096f.m0.m(this.f125560g, (byte) 1);
                    } finally {
                    }
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            } catch (java.io.IOException e17) {
                throw new java.lang.RuntimeException(e17);
            }
        } finally {
            java.util.Objects.toString(m0Var.f125555a);
            tVar.close();
        }
    }
}
