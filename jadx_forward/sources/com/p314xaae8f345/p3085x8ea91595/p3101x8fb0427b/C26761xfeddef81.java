package com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b;

/* renamed from: com.tencent.tmassistantsdk.storage.TMAssistantFile */
/* loaded from: classes13.dex */
public class C26761xfeddef81 {

    /* renamed from: DataBufferMaxLen */
    protected static final int f56737x3331835b = 16384;
    protected static final java.lang.String TAG = "TMAssistantFile";

    /* renamed from: mFileDataLen */
    protected long f56739x713ef242;

    /* renamed from: mFinalFileName */
    protected java.lang.String f56741x7a171e50;

    /* renamed from: mTempFileName */
    protected java.lang.String f56742x8b847328;

    /* renamed from: mFileOutputStream */
    protected java.io.OutputStream f56740x467d8a0a = null;

    /* renamed from: mWriteDataBuffer */
    protected byte[] f56743xdddce19c = null;

    /* renamed from: mDataBufferDataLen */
    protected int f56738x8d4e934 = 0;

    public C26761xfeddef81(java.lang.String str, java.lang.String str2) {
        this.f56739x713ef242 = 0L;
        this.f56742x8b847328 = str;
        this.f56741x7a171e50 = str2;
        this.f56739x713ef242 = m105415xbe0e3ae6();
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "mFileDataLen = " + this.f56739x713ef242);
    }

    /* renamed from: getSaveFilePath */
    public static java.lang.String m105405x31429ad4(java.lang.String str) {
        java.lang.String m105406xffba5073;
        if (str == null || (m105406xffba5073 = m105406xffba5073()) == null) {
            return null;
        }
        return m105406xffba5073 + "/" + str;
    }

    /* renamed from: getSavePathRootDir */
    public static java.lang.String m105406xffba5073() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getExternalCacheDir() + "/TMAssistantSDK/Download";
    }

    /* renamed from: isSDCardExistAndCanWrite */
    public static boolean m105407x1bdbea3a() {
        return "mounted".equals(android.os.Environment.getExternalStorageState()) && android.os.Environment.getExternalStorageDirectory().canWrite();
    }

    /* renamed from: moveFileFromTmpToSavaPath */
    private boolean m105408xe2058859(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "moveFileFromTmpToSavaPath, tmpFilePath = " + str + ", saveFilePath = " + str2);
        boolean z17 = false;
        if (str != null && str2 != null) {
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
            if (r6Var.m()) {
                com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str2);
                java.lang.String str3 = a17.f294812f;
                if (str3 != null) {
                    java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str3, false, false);
                    if (!str3.equals(l17)) {
                        a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                    }
                }
                com.p314xaae8f345.mm.vfs.z2 M = r6Var.M();
                com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
                if (M.a() && m17.a()) {
                    try {
                        z17 = m17.f294799a.t(m17.f294800b, M.f294799a, M.f294800b);
                    } catch (java.io.IOException unused) {
                    }
                }
                if (z17) {
                    com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.m105489x8c8e38e5(str2);
                }
                return z17;
            }
        }
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.w(TAG, "moveFileFromTmpToSavaPath failed ");
        return false;
    }

    /* renamed from: writeData */
    private boolean m105409xac25b429(java.io.OutputStream outputStream, byte[] bArr, int i17, int i18, long j17) {
        if (outputStream == null || bArr == null) {
            return false;
        }
        if (j17 != this.f56739x713ef242) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "writeData0 failed,filelen:" + this.f56739x713ef242 + ",offset:" + j17 + ",filename:" + this.f56742x8b847328);
            return false;
        }
        if (i18 >= 16384) {
            try {
                int i19 = this.f56738x8d4e934;
                if (i19 > 0) {
                    outputStream.write(this.f56743xdddce19c, 0, i19);
                    this.f56738x8d4e934 = 0;
                }
                outputStream.write(bArr, i17, i18);
                this.f56739x713ef242 += i18;
                return true;
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
                com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.w(TAG, "writeData1 failed " + e17.getMessage());
                return false;
            }
        }
        int i27 = this.f56738x8d4e934;
        if (i27 + i18 > 16384 && i27 > 0) {
            try {
                outputStream.write(this.f56743xdddce19c, 0, i27);
                this.f56738x8d4e934 = 0;
            } catch (java.io.IOException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e18, "", new java.lang.Object[0]);
                com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.w(TAG, "writeData2 failed " + e18.getMessage());
                return false;
            }
        }
        java.lang.System.arraycopy(bArr, i17, this.f56743xdddce19c, this.f56738x8d4e934, i18);
        this.f56738x8d4e934 += i18;
        this.f56739x713ef242 += i18;
        return true;
    }

    /* renamed from: close */
    public synchronized void m105410x5a5ddf8() {
        m105413x5d03b04();
        try {
            java.io.OutputStream outputStream = this.f56740x467d8a0a;
            if (outputStream != null) {
                outputStream.close();
            }
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
        }
        this.f56740x467d8a0a = null;
        this.f56743xdddce19c = null;
        this.f56739x713ef242 = 0L;
    }

    /* renamed from: deleteTempFile */
    public void m105411x36cbb23b() {
        java.lang.String m105414xaae14c2 = m105414xaae14c2(this.f56742x8b847328);
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "deleteFile 1 tmpFilePathString: " + m105414xaae14c2);
        if (android.text.TextUtils.isEmpty(m105414xaae14c2)) {
            return;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(m105414xaae14c2);
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "deleteFile 2 file: " + r6Var);
        if (!r6Var.m()) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "deleteFile 3");
            return;
        }
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "deleteFile result:" + r6Var.l() + ",filename:" + m105414xaae14c2);
    }

    /* renamed from: ensureFilePath */
    public void m105412x39d5921f(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "fileFullPath is null or the filename.size is zero.");
            throw new java.security.InvalidParameterException("fileFullPath is null or the filename.size is zero.");
        }
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf != -1) {
            boolean z17 = true;
            if (str.length() != 1) {
                if (lastIndexOf > 0) {
                    str = str.substring(0, lastIndexOf);
                }
                com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
                java.lang.String str2 = a17.f294812f;
                if (str2 != null) {
                    java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                    if (!str2.equals(l17)) {
                        a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                    }
                }
                com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
                if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
                    com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, m17);
                    z17 = !m18.a() ? false : m18.f294799a.r(m18.f294800b);
                }
                if (z17) {
                    return;
                }
                com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "Failed to create directory. dir: ".concat(str));
                throw new java.io.IOException("Failed to create directory. dir: ".concat(str));
            }
        }
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "fileFullPath is not a valid full path. fileName: ".concat(str));
        throw new java.security.InvalidParameterException("fileFullPath is not a valid full path. fileName: ".concat(str));
    }

    /* renamed from: flush */
    public synchronized boolean m105413x5d03b04() {
        int i17;
        java.io.OutputStream outputStream = this.f56740x467d8a0a;
        if (outputStream != null && (i17 = this.f56738x8d4e934) > 0) {
            try {
                outputStream.write(this.f56743xdddce19c, 0, i17);
                this.f56738x8d4e934 = 0;
                return true;
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
                com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.w(TAG, "flush failed " + e17);
            }
        }
        return false;
    }

    /* renamed from: getTmpFilePath */
    public java.lang.String m105414xaae14c2(java.lang.String str) {
        java.lang.String m105406xffba5073;
        if (str == null || (m105406xffba5073 = m105406xffba5073()) == null) {
            return null;
        }
        return m105406xffba5073 + "/.tmp/" + str + ".tmp";
    }

    /* renamed from: length */
    public long m105415xbe0e3ae6() {
        java.lang.String m105405x31429ad4 = m105405x31429ad4(this.f56741x7a171e50);
        if (m105405x31429ad4 == null) {
            return 0L;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(m105405x31429ad4));
        if (r6Var.m()) {
            this.f56739x713ef242 = r6Var.C();
        } else {
            java.lang.String m105414xaae14c2 = m105414xaae14c2(this.f56742x8b847328);
            if (m105414xaae14c2 != null) {
                com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(m105414xaae14c2));
                if (r6Var2.m()) {
                    com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, m105414xaae14c2.concat(" exists"));
                    this.f56739x713ef242 = r6Var2.C();
                } else {
                    this.f56739x713ef242 = 0L;
                }
            }
        }
        return this.f56739x713ef242;
    }

    /* renamed from: moveFileToSavaPath */
    public void m105416xa5fca9a6() {
        m105408xe2058859(m105414xaae14c2(this.f56742x8b847328), m105405x31429ad4(this.f56741x7a171e50));
    }

    /* renamed from: write */
    public synchronized boolean m105417x6c257df(byte[] bArr, int i17, int i18, long j17, boolean z17) {
        if (this.f56740x467d8a0a == null) {
            java.lang.String m105414xaae14c2 = m105414xaae14c2(this.f56742x8b847328);
            if (m105414xaae14c2 == null) {
                com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.w(TAG, "write failed tmpFilePathString is null");
                return false;
            }
            try {
                m105412x39d5921f(m105414xaae14c2);
                this.f56740x467d8a0a = com.p314xaae8f345.mm.vfs.w6.K(m105414xaae14c2, true);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
                com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.w(TAG, "write failed" + e17.getMessage());
                return false;
            }
        }
        if (this.f56743xdddce19c == null) {
            this.f56743xdddce19c = new byte[16384];
            this.f56738x8d4e934 = 0;
        }
        boolean m105409xac25b429 = m105409xac25b429(this.f56740x467d8a0a, bArr, i17, i18, j17);
        if (!m105409xac25b429) {
            return m105409xac25b429;
        }
        if (!z17 || !m105413x5d03b04()) {
            return true;
        }
        return m105408xe2058859(m105414xaae14c2(this.f56742x8b847328), m105405x31429ad4(this.f56741x7a171e50));
    }
}
