package zf4;

/* loaded from: classes13.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public java.io.RandomAccessFile f554202a = null;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f554203b;

    public i(java.lang.String str) {
        this.f554203b = "";
        this.f554203b = str;
    }

    public static int a(java.lang.String str) {
        int C;
        iz5.a.g(null, str.length() >= 0);
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
        if (r6Var.m() && (C = (int) r6Var.C()) > 0) {
            return C;
        }
        return 0;
    }

    public zf4.h b(int i17, int i18) {
        zf4.h hVar = new zf4.h();
        if (i17 < 0 || i18 <= 0) {
            hVar.f554201d = -3;
            return hVar;
        }
        java.io.RandomAccessFile randomAccessFile = this.f554202a;
        java.lang.String str = this.f554203b;
        if (randomAccessFile == null) {
            boolean z17 = true;
            iz5.a.g(null, str.length() >= 0);
            iz5.a.g(null, this.f554202a == null);
            java.util.Objects.toString(this.f554202a);
            try {
                this.f554202a = com.p314xaae8f345.mm.vfs.w6.A(com.p314xaae8f345.mm.vfs.z7.a(str), false);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SpxFileOperator", "ERR: OpenFile[" + str + "] failed:[" + e17.getMessage() + "]");
                this.f554202a = null;
                z17 = false;
            }
            if (!z17) {
                hVar.f554201d = -2;
                return hVar;
            }
        }
        hVar.f554198a = new byte[i18];
        try {
            this.f554202a.length();
            this.f554202a.seek(i17);
            int read = this.f554202a.read(hVar.f554198a, 0, i18);
            this.f554202a.getFilePointer();
            if (read < 0) {
                read = 0;
            }
            hVar.f554199b = read;
            hVar.f554200c = read + i17;
            hVar.f554201d = 0;
            return hVar;
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SpxFileOperator", "ERR: ReadFile[" + str + "] Offset:" + i17 + "  failed:[" + e18.getMessage() + "] ");
            java.io.RandomAccessFile randomAccessFile2 = this.f554202a;
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                    this.f554202a = null;
                } catch (java.io.IOException unused) {
                }
            }
            hVar.f554201d = -1;
            return hVar;
        }
    }
}
