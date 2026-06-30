package w21;

/* loaded from: classes12.dex */
public class x implements w21.j {

    /* renamed from: a, reason: collision with root package name */
    public java.io.RandomAccessFile f524042a = null;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f524043b;

    public x(java.lang.String str) {
        this.f524043b = "";
        this.f524043b = str;
    }

    @Override // w21.j
    public int a(java.lang.String str) {
        java.lang.String str2 = this.f524043b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkFileOperator", "write: fromPath %s, toPath %s", str, str2);
        if (str.equals(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkFileOperator", "write: no need to move file");
            return 0;
        }
        if (com.p314xaae8f345.mm.vfs.w6.x(str, str2, true)) {
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(str2);
            if (r6Var.m()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkFileOperator", "write: copy success, file size: %d", java.lang.Long.valueOf(r6Var.C()));
                return (int) r6Var.C();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkFileOperator", "write: copy file error");
        }
        return -1;
    }

    @Override // w21.j
    public void b() {
        java.io.RandomAccessFile randomAccessFile = this.f524042a;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
                this.f524042a = null;
            } catch (java.io.IOException unused) {
            }
        }
    }

    @Override // w21.j
    public int c(byte[] bArr, int i17, int i18) {
        iz5.a.g(null, bArr.length > 0 && i17 > 0);
        if (this.f524042a == null && !e(true)) {
            return -1;
        }
        try {
            this.f524042a.seek(i18);
            this.f524042a.write(bArr, 0, i17);
            int i19 = i18 + i17;
            iz5.a.g(null, ((int) this.f524042a.getFilePointer()) == i19);
            iz5.a.g(null, i19 >= 0);
            return i19;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkFileOperator", "ERR: WriteFile[" + this.f524043b + "] Offset:" + i18 + " failed:[" + e17.getMessage() + "]");
            b();
            return -3;
        }
    }

    @Override // w21.j
    public w21.t d(int i17, int i18) {
        w21.t tVar = new w21.t();
        if (i17 < 0 || i18 <= 0) {
            tVar.f524000d = -3;
            return tVar;
        }
        if (this.f524042a == null && !e(false)) {
            tVar.f524000d = -2;
            return tVar;
        }
        tVar.f523997a = new byte[i18];
        try {
            this.f524042a.length();
            this.f524042a.seek(i17);
            int read = this.f524042a.read(tVar.f523997a, 0, i18);
            this.f524042a.getFilePointer();
            if (read < 0) {
                read = 0;
            }
            tVar.f523998b = read;
            tVar.f523999c = read + i17;
            tVar.f524000d = 0;
            return tVar;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkFileOperator", "ERR: ReadFile[" + this.f524043b + "] Offset:" + i17 + "  failed:[" + e17.getMessage() + "] ");
            b();
            tVar.f524000d = -1;
            return tVar;
        }
    }

    public final boolean e(boolean z17) {
        java.lang.String str = this.f524043b;
        iz5.a.g(null, str.length() >= 0);
        iz5.a.g(null, this.f524042a == null);
        java.util.Objects.toString(this.f524042a);
        if (z17) {
            com.p314xaae8f345.mm.vfs.w6.u(com.p314xaae8f345.mm.vfs.w6.r(str));
        }
        try {
            this.f524042a = com.p314xaae8f345.mm.vfs.w6.B(str, z17);
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkFileOperator", "ERR: OpenFile[" + str + "] failed:[" + e17.getMessage() + "]");
            this.f524042a = null;
            return false;
        }
    }

    @Override // w21.j
    /* renamed from: getFormat */
    public int mo173141x19771aed() {
        return 4;
    }
}
