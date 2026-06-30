package com.p314xaae8f345.mm.p930xc01b152a;

/* renamed from: com.tencent.mm.mm7zip.SevenZipUtil */
/* loaded from: classes16.dex */
public class C11080x4adeb616 {

    /* renamed from: com.tencent.mm.mm7zip.SevenZipUtil$ExtractCallback */
    /* loaded from: classes16.dex */
    public static class ExtractCallback implements com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11033x7deeaa6d {

        /* renamed from: extractPath */
        private final java.lang.String f32452x6ca48c46;

        /* renamed from: inArchive */
        private final com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11037xc9d7a994 f32454xa97447dd;

        /* renamed from: hasFail */
        private boolean f32453x298400d8 = false;

        /* renamed from: paths */
        private java.util.List<java.lang.String> f32455x65820ee = new java.util.ArrayList();

        public ExtractCallback(com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11037xc9d7a994 interfaceC11037xc9d7a994, java.lang.String str) {
            this.f32454xa97447dd = interfaceC11037xc9d7a994;
            if (!str.endsWith("/") && !str.endsWith("\\")) {
                str = str + java.io.File.separator;
            }
            this.f32452x6ca48c46 = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$getStream$0 */
        public /* synthetic */ int m47709x84dfd425(int i17, byte[] bArr) {
            java.io.FileOutputStream fileOutputStream;
            java.io.FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    java.io.File file = new java.io.File(this.f32452x6ca48c46 + this.f32454xa97447dd.mo47585x5f40cdfc(i17, com.p314xaae8f345.mm.p930xc01b152a.EnumC11062x8efe4bde.PATH));
                    if (!this.f32455x65820ee.contains(file.getAbsolutePath())) {
                        com.p314xaae8f345.mm.p930xc01b152a.p934x36f002.C11097x30421776.m47814x692721c7(file.getAbsolutePath());
                    }
                    this.f32455x65820ee.add(file.getAbsolutePath());
                    com.p314xaae8f345.mm.p930xc01b152a.p934x36f002.C11097x30421776.m47817xdfa79994(file.getAbsolutePath(), false);
                    fileOutputStream = new java.io.FileOutputStream(file, true);
                } catch (java.io.IOException unused) {
                }
                try {
                    fileOutputStream.write(bArr);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                } catch (java.io.IOException unused2) {
                    fileOutputStream2 = fileOutputStream;
                    if (fileOutputStream2 != null) {
                        fileOutputStream2.flush();
                        fileOutputStream2.close();
                    }
                    return bArr.length;
                } catch (java.lang.Throwable th6) {
                    fileOutputStream2 = fileOutputStream;
                    th = th6;
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.flush();
                            fileOutputStream2.close();
                        } catch (java.io.IOException unused3) {
                        }
                    }
                    throw th;
                }
            } catch (java.io.IOException unused4) {
            } catch (java.lang.Throwable th7) {
                th = th7;
            }
            return bArr.length;
        }

        @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11033x7deeaa6d
        /* renamed from: getStream */
        public com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11060xf8e90f26 mo47561x2fec7276(final int i17, com.p314xaae8f345.mm.p930xc01b152a.EnumC11031xa996e81b enumC11031xa996e81b) {
            return new com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11060xf8e90f26() { // from class: com.tencent.mm.mm7zip.SevenZipUtil$ExtractCallback$$a
                @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11060xf8e90f26
                /* renamed from: write */
                public final int mo47635x6c257df(byte[] bArr) {
                    int m47709x84dfd425;
                    m47709x84dfd425 = com.p314xaae8f345.mm.p930xc01b152a.C11080x4adeb616.ExtractCallback.this.m47709x84dfd425(i17, bArr);
                    return m47709x84dfd425;
                }
            };
        }

        /* renamed from: hasFail */
        public boolean m47710x298400d8() {
            return this.f32453x298400d8;
        }

        @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11033x7deeaa6d
        /* renamed from: prepareOperation */
        public void mo47562x9d07a020(com.p314xaae8f345.mm.p930xc01b152a.EnumC11031xa996e81b enumC11031xa996e81b) {
        }

        @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11057xfb2cd96
        /* renamed from: setCompleted */
        public void mo47631x8222809(long j17) {
        }

        @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11033x7deeaa6d
        /* renamed from: setOperationResult */
        public void mo47563xac740ba2(com.p314xaae8f345.mm.p930xc01b152a.EnumC11032xedd175c3 enumC11032xedd175c3) {
            if (enumC11032xedd175c3 != com.p314xaae8f345.mm.p930xc01b152a.EnumC11032xedd175c3.OK) {
                this.f32453x298400d8 = true;
            }
        }

        @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11057xfb2cd96
        /* renamed from: setTotal */
        public void mo47632x53c29c02(long j17) {
        }
    }

    /* renamed from: extract */
    public static int m47708xb232dc81(java.lang.String str, java.lang.String str2) {
        java.io.RandomAccessFile randomAccessFile;
        if (!com.p314xaae8f345.mm.p930xc01b152a.p934x36f002.C11097x30421776.m47815xb325f45c(str)) {
            return -1;
        }
        com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11037xc9d7a994 interfaceC11037xc9d7a994 = null;
        try {
            randomAccessFile = new java.io.RandomAccessFile(new java.io.File(str), "r");
            try {
                com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11037xc9d7a994 m47681x9f37b4b3 = com.p314xaae8f345.mm.p930xc01b152a.C11077x5bf56bf4.m47681x9f37b4b3(null, new com.p314xaae8f345.mm.p930xc01b152a.p931x316220.C11089x9d248468(randomAccessFile));
                try {
                    for (com.p314xaae8f345.mm.p930xc01b152a.p932xca3831b2.InterfaceC11093x5c54b8f5 interfaceC11093x5c54b8f5 : m47681x9f37b4b3.mo47583x9848f571().mo47771xfb5cd294()) {
                        com.p314xaae8f345.mm.p930xc01b152a.p934x36f002.C11097x30421776.m47817xdfa79994(new java.io.File(str2, interfaceC11093x5c54b8f5.mo47786xfb83cc9b()).getAbsolutePath(), interfaceC11093x5c54b8f5.mo47792xdc8a0e38());
                    }
                    com.p314xaae8f345.mm.p930xc01b152a.C11080x4adeb616.ExtractCallback extractCallback = new com.p314xaae8f345.mm.p930xc01b152a.C11080x4adeb616.ExtractCallback(m47681x9f37b4b3, str2);
                    m47681x9f37b4b3.mo47569xb232dc81(null, false, extractCallback);
                    int i17 = extractCallback.m47710x298400d8() ? -1 : 0;
                    m47681x9f37b4b3.close();
                    randomAccessFile.close();
                    return i17;
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    interfaceC11037xc9d7a994 = m47681x9f37b4b3;
                    if (interfaceC11037xc9d7a994 != null) {
                        interfaceC11037xc9d7a994.close();
                    }
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
            }
        } catch (java.lang.Throwable th8) {
            th = th8;
            randomAccessFile = null;
        }
    }
}
