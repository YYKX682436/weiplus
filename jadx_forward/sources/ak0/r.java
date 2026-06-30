package ak0;

/* loaded from: classes11.dex */
public class r extends nv5.a {
    public r(ak0.p pVar) {
    }

    @Override // nv5.a
    public int a(java.io.InputStream inputStream, java.io.InputStream inputStream2, java.io.File file, boolean z17) {
        java.lang.String absolutePath = file.getAbsolutePath();
        java.lang.String str = java.io.File.separator;
        new java.io.File(absolutePath.substring(0, absolutePath.lastIndexOf(str))).mkdirs();
        java.lang.String substring = file.getAbsolutePath().substring(0, file.getAbsolutePath().lastIndexOf(str));
        java.lang.String str2 = substring + str + "old_" + file.getName();
        java.lang.String str3 = substring + str + "diff_" + file.getName();
        java.io.File file2 = new java.io.File(str2);
        java.io.File file3 = new java.io.File(str3);
        file2.createNewFile();
        file3.createNewFile();
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file2);
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr, 0, 8192);
            if (read == -1) {
                break;
            }
            fileOutputStream.write(bArr, 0, read);
        }
        fileOutputStream.close();
        java.io.FileOutputStream fileOutputStream2 = new java.io.FileOutputStream(file3);
        byte[] bArr2 = new byte[8192];
        while (true) {
            int read2 = inputStream2.read(bArr2, 0, 8192);
            if (read2 == -1) {
                break;
            }
            fileOutputStream2.write(bArr2, 0, read2);
        }
        fileOutputStream2.close();
        int m48586x6582048 = com.p314xaae8f345.mm.p998xbc2a843b.p999x5e8986d.C11318x7f721ce0.m48586x6582048(file2.getAbsolutePath(), file3.getAbsolutePath(), file.getAbsolutePath(), 262144L);
        if (z17) {
            try {
                file.setReadOnly();
            } catch (java.lang.Throwable th6) {
                ak0.l.a("MicroMsg.HDiffFilePatch", "[-] Error when set read only: " + file.getAbsolutePath() + ", " + th6.getMessage());
            }
        }
        java.lang.String format = java.lang.String.format("%s:  res:%s, oldSize:%s, diffSize:%s, newSize:%s", file.getName(), java.lang.Integer.valueOf(m48586x6582048), java.lang.Long.valueOf(file2.length()), java.lang.Long.valueOf(file3.length()), java.lang.Long.valueOf(file.length()));
        ak0.k kVar = ak0.l.f87073a;
        if (kVar == null) {
            throw new java.lang.IllegalStateException("Log engine is not set");
        }
        kVar.a(4, "MicroMsg.HDiffFilePatch", format);
        file2.delete();
        file3.delete();
        return m48586x6582048;
    }
}
