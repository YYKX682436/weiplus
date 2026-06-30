package com.facebook.soloader;

/* loaded from: classes13.dex */
public class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.io.File f44024d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f44025e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.facebook.soloader.h0 f44026f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.io.File f44027g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.facebook.soloader.t f44028h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.facebook.soloader.m0 f44029i;

    public f0(com.facebook.soloader.m0 m0Var, java.io.File file, byte[] bArr, com.facebook.soloader.h0 h0Var, java.io.File file2, com.facebook.soloader.t tVar) {
        this.f44029i = m0Var;
        this.f44024d = file;
        this.f44025e = bArr;
        this.f44026f = h0Var;
        this.f44027g = file2;
        this.f44028h = tVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.facebook.soloader.t tVar = this.f44028h;
        com.facebook.soloader.m0 m0Var = this.f44029i;
        try {
            try {
                java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(this.f44024d, "rw");
                try {
                    randomAccessFile.write(this.f44025e);
                    randomAccessFile.setLength(randomAccessFile.getFilePointer());
                    randomAccessFile.close();
                    randomAccessFile = new java.io.RandomAccessFile(new java.io.File(m0Var.f44022a, "dso_manifest"), "rw");
                    try {
                        com.facebook.soloader.h0 h0Var = this.f44026f;
                        h0Var.getClass();
                        randomAccessFile.writeByte(1);
                        com.facebook.soloader.g0[] g0VarArr = h0Var.f44035a;
                        randomAccessFile.writeInt(g0VarArr.length);
                        for (int i17 = 0; i17 < g0VarArr.length; i17++) {
                            randomAccessFile.writeUTF(g0VarArr[i17].f44030d);
                            randomAccessFile.writeUTF(g0VarArr[i17].f44031e);
                        }
                        randomAccessFile.close();
                        com.facebook.soloader.e0.b(m0Var.f44022a);
                        com.facebook.soloader.m0.m(this.f44027g, (byte) 1);
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
            java.util.Objects.toString(m0Var.f44022a);
            tVar.close();
        }
    }
}
