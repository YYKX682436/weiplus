package gl3;

/* loaded from: classes13.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public java.io.RandomAccessFile f354373a = null;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f354374b;

    public i(java.lang.String str) {
        java.lang.String d17 = xl3.c.d(str);
        this.f354374b = d17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.PieceFileCache", "PieceFileCache mUrl:%s, fileName:%s,", str, d17);
    }

    public static void a(java.lang.String str) {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i("MicroMsg.Music.PieceFileCache", "deleteFile, fileName:" + str);
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
        if (!r6Var.m()) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e("MicroMsg.Music.PieceFileCache", "file not exist, delete piece File fail");
        } else {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i("MicroMsg.Music.PieceFileCache", "delete the piece File");
            r6Var.l();
        }
    }

    public static boolean b(java.lang.String str) {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i("MicroMsg.Music.PieceFileCache", "existFileByUrl");
        java.lang.String d17 = xl3.c.d(str);
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i("MicroMsg.Music.PieceFileCache", "existFile, fileName:" + d17);
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(d17);
        java.lang.String str2 = a17.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        boolean F = m17.a() ? m17.f294799a.F(m17.f294800b) : false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.PieceFileCache", "the piece File exist:%b", java.lang.Boolean.valueOf(F));
        return F;
    }

    public static long c(java.lang.String str) {
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(xl3.c.d(str));
        if (r6Var.m()) {
            return r6Var.C();
        }
        return -1L;
    }

    public synchronized int d() {
        java.io.RandomAccessFile randomAccessFile = this.f354373a;
        if (randomAccessFile == null) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e("MicroMsg.Music.PieceFileCache", "getLength error, randomAccessFile is null");
            return -1;
        }
        try {
            return (int) randomAccessFile.length();
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e("MicroMsg.Music.PieceFileCache", "Error get length of file , err %s", "" + e17.getMessage());
            return -1;
        }
    }

    public synchronized boolean e(byte[] bArr, long j17, int i17) {
        if (i17 == 0) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e("MicroMsg.Music.PieceFileCache", "write error, length == 0");
            return false;
        }
        java.io.RandomAccessFile randomAccessFile = this.f354373a;
        if (randomAccessFile == null) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e("MicroMsg.Music.PieceFileCache", "write error, randomAccessFile is null");
            return false;
        }
        try {
            randomAccessFile.seek(j17);
            this.f354373a.write(bArr, 0, i17);
            return true;
        } catch (java.io.IOException unused) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e("MicroMsg.Music.PieceFileCache", java.lang.String.format("Error writing %d bytes to from buffer with size %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(bArr.length)));
            return false;
        }
    }
}
