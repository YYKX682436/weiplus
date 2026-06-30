package com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861;

/* renamed from: com.tencent.tinker.loader.shareutil.ShareElfFile */
/* loaded from: classes13.dex */
public class C26633x8dbd5dfc implements java.io.Closeable {

    /* renamed from: FILE_TYPE_ELF */
    public static final int f55764x80fb455d = 1;

    /* renamed from: FILE_TYPE_ODEX */
    public static final int f55765x9e71d42a = 0;

    /* renamed from: FILE_TYPE_OTHERS */
    public static final int f55766xca3009c5 = -1;

    /* renamed from: elfHeader */
    public com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26633x8dbd5dfc.ElfHeader f55767xe654240c;
    private final java.io.FileInputStream fis;

    /* renamed from: programHeaders */
    public com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26633x8dbd5dfc.ProgramHeader[] f55768x98e4c62;

    /* renamed from: sectionHeaders */
    public com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26633x8dbd5dfc.SectionHeader[] f55769xb2d3ece1;

    /* renamed from: sectionNameToHeaderMap */
    private final java.util.Map<java.lang.String, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26633x8dbd5dfc.SectionHeader> f55770x6fc1fa24 = new java.util.HashMap();

    /* renamed from: com.tencent.tinker.loader.shareutil.ShareElfFile$ElfHeader */
    /* loaded from: classes13.dex */
    public static class ElfHeader {

        /* renamed from: EI_CLASS */
        public static final int f55771xbb4811fd = 4;

        /* renamed from: EI_DATA */
        public static final int f55772xc3fa5e65 = 5;

        /* renamed from: EI_NINDENT */
        private static final int f55773x4b01bddf = 16;

        /* renamed from: EI_VERSION */
        public static final int f55774xeb9f741d = 6;

        /* renamed from: ELFCLASS32 */
        public static final int f55775xa15b7858 = 1;

        /* renamed from: ELFCLASS64 */
        public static final int f55776xa15b78b7 = 2;

        /* renamed from: ELFDATA2LSB */
        public static final int f55777xcb700252 = 1;

        /* renamed from: ELFDATA2MSB */
        public static final int f55778xcb700613 = 2;

        /* renamed from: ET_CORE */
        public static final int f55779xd6bf6d2f = 4;

        /* renamed from: ET_DYN */
        public static final int f55780x7a8a52c9 = 3;

        /* renamed from: ET_EXEC */
        public static final int f55781xd6c07621 = 2;

        /* renamed from: ET_HIPROC */
        public static final int f55782x2ccbdd67 = 65535;

        /* renamed from: ET_LOPROC */
        public static final int f55783x33f3cce9 = 65280;

        /* renamed from: ET_NONE */
        public static final int f55784xd6c46cc8 = 0;

        /* renamed from: ET_REL */
        public static final int f55785x7a8a84e9 = 1;

        /* renamed from: EV_CURRENT */
        public static final int f55786xa14fb7cb = 1;

        /* renamed from: eEhSize */
        public final short f55787x5a74a409;

        /* renamed from: eEntry */
        public final long f55788xb0598f0d;

        /* renamed from: eFlags */
        public final int f55789xb0667522;

        /* renamed from: eIndent */
        public final byte[] f55790x61a43d71;

        /* renamed from: eMachine */
        public final short f55791x90409022;

        /* renamed from: ePhEntSize */
        public final short f55792xee23938f;

        /* renamed from: ePhNum */
        public final short f55793xb0f14909;

        /* renamed from: ePhOff */
        public final long f55794xb0f14af2;

        /* renamed from: eShEntSize */
        public final short f55795xaaf0e092;

        /* renamed from: eShNum */
        public final short f55796xb11b8f8c;

        /* renamed from: eShOff */
        public final long f55797xb11b9175;

        /* renamed from: eShStrNdx */
        public final short f55798x3ec34fcb;

        /* renamed from: eType */
        public final short f55799x5b7493f;

        /* renamed from: eVersion */
        public final int f55800x740468b3;

        private ElfHeader(java.nio.channels.FileChannel fileChannel) {
            byte[] bArr = new byte[16];
            this.f55790x61a43d71 = bArr;
            fileChannel.position(0L);
            fileChannel.read(java.nio.ByteBuffer.wrap(bArr));
            if (bArr[0] == Byte.MAX_VALUE && bArr[1] == 69 && bArr[2] == 76 && bArr[3] == 70) {
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26633x8dbd5dfc.m104630x6b7b4f2(bArr[4], 1, 2, "bad elf class: " + ((int) bArr[4]));
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26633x8dbd5dfc.m104630x6b7b4f2(bArr[5], 1, 2, "bad elf data encoding: " + ((int) bArr[5]));
                java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(bArr[4] == 1 ? 36 : 48);
                allocate.order(bArr[5] == 1 ? java.nio.ByteOrder.LITTLE_ENDIAN : java.nio.ByteOrder.BIG_ENDIAN);
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26633x8dbd5dfc.m104633x15077933(fileChannel, allocate, "failed to read rest part of ehdr.");
                this.f55799x5b7493f = allocate.getShort();
                this.f55791x90409022 = allocate.getShort();
                int i17 = allocate.getInt();
                this.f55800x740468b3 = i17;
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26633x8dbd5dfc.m104630x6b7b4f2(i17, 1, 1, "bad elf version: " + i17);
                byte b17 = bArr[4];
                if (b17 == 1) {
                    this.f55788xb0598f0d = allocate.getInt();
                    this.f55794xb0f14af2 = allocate.getInt();
                    this.f55797xb11b9175 = allocate.getInt();
                } else if (b17 == 2) {
                    this.f55788xb0598f0d = allocate.getLong();
                    this.f55794xb0f14af2 = allocate.getLong();
                    this.f55797xb11b9175 = allocate.getLong();
                } else {
                    throw new java.io.IOException("Unexpected elf class: " + ((int) bArr[4]));
                }
                this.f55789xb0667522 = allocate.getInt();
                this.f55787x5a74a409 = allocate.getShort();
                this.f55792xee23938f = allocate.getShort();
                this.f55793xb0f14909 = allocate.getShort();
                this.f55795xaaf0e092 = allocate.getShort();
                this.f55796xb11b8f8c = allocate.getShort();
                this.f55798x3ec34fcb = allocate.getShort();
                return;
            }
            throw new java.io.IOException(java.lang.String.format("bad elf magic: %x %x %x %x.", java.lang.Byte.valueOf(bArr[0]), java.lang.Byte.valueOf(bArr[1]), java.lang.Byte.valueOf(bArr[2]), java.lang.Byte.valueOf(bArr[3])));
        }
    }

    /* renamed from: com.tencent.tinker.loader.shareutil.ShareElfFile$ProgramHeader */
    /* loaded from: classes13.dex */
    public static class ProgramHeader {

        /* renamed from: PF_R */
        public static final int f55801x257049 = 4;

        /* renamed from: PF_W */
        public static final int f55802x25704e = 2;

        /* renamed from: PF_X */
        public static final int f55803x25704f = 1;

        /* renamed from: PT_DYNAMIC */
        public static final int f55804x336858e4 = 2;

        /* renamed from: PT_HIPROC */
        public static final int f55805x8bbca272 = Integer.MAX_VALUE;

        /* renamed from: PT_INTERP */
        public static final int f55806x8db991af = 3;

        /* renamed from: PT_LOAD */
        public static final int f55807x1ca80e41 = 1;

        /* renamed from: PT_LOPROC */
        public static final int f55808x92e491f4 = 1879048192;

        /* renamed from: PT_NOTE */
        public static final int f55809x1ca8f94d = 4;

        /* renamed from: PT_NULL */
        public static final int f55810x1ca90ee2 = 0;

        /* renamed from: PT_PHDR */
        public static final int f55811x1ca9c5e1 = 6;

        /* renamed from: PT_SHLIB */
        public static final int f55812x78b959f5 = 5;

        /* renamed from: pAlign */
        public final long f55813xc2e56c75;

        /* renamed from: pFileSize */
        public final long f55814xb5f3202d;

        /* renamed from: pFlags */
        public final int f55815xc32bc3f7;

        /* renamed from: pMemSize */
        public final long f55816xe4440e6;

        /* renamed from: pOffset */
        public final long f55817xb1563d23;

        /* renamed from: pPddr */
        public final long f55818x6502a12;

        /* renamed from: pType */
        public final int f55819x6524bca;

        /* renamed from: pVddr */
        public final long f55820x652e44c;

        private ProgramHeader(java.nio.ByteBuffer byteBuffer, int i17) {
            if (i17 == 1) {
                this.f55819x6524bca = byteBuffer.getInt();
                this.f55817xb1563d23 = byteBuffer.getInt();
                this.f55820x652e44c = byteBuffer.getInt();
                this.f55818x6502a12 = byteBuffer.getInt();
                this.f55814xb5f3202d = byteBuffer.getInt();
                this.f55816xe4440e6 = byteBuffer.getInt();
                this.f55815xc32bc3f7 = byteBuffer.getInt();
                this.f55813xc2e56c75 = byteBuffer.getInt();
                return;
            }
            if (i17 == 2) {
                this.f55819x6524bca = byteBuffer.getInt();
                this.f55815xc32bc3f7 = byteBuffer.getInt();
                this.f55817xb1563d23 = byteBuffer.getLong();
                this.f55820x652e44c = byteBuffer.getLong();
                this.f55818x6502a12 = byteBuffer.getLong();
                this.f55814xb5f3202d = byteBuffer.getLong();
                this.f55816xe4440e6 = byteBuffer.getLong();
                this.f55813xc2e56c75 = byteBuffer.getLong();
                return;
            }
            throw new java.io.IOException("Unexpected elf class: " + i17);
        }
    }

    /* renamed from: com.tencent.tinker.loader.shareutil.ShareElfFile$SectionHeader */
    /* loaded from: classes13.dex */
    public static class SectionHeader {

        /* renamed from: SHF_ALLOC */
        public static final int f55821x664cdde7 = 2;

        /* renamed from: SHF_EXECINSTR */
        public static final int f55822x40a0e6ad = 4;

        /* renamed from: SHF_MASKPROC */
        public static final int f55823x6f7d4830 = -268435456;

        /* renamed from: SHF_WRITE */
        public static final int f55824x67859291 = 1;

        /* renamed from: SHN_ABS */
        public static final int f55825xa5f977ac = 65521;

        /* renamed from: SHN_COMMON */
        public static final int f55826xa5ecac51 = 65522;

        /* renamed from: SHN_HIPROC */
        public static final int f55827xae21ca3d = 65311;

        /* renamed from: SHN_HIRESERVE */
        public static final int f55828x4205ac55 = 65535;

        /* renamed from: SHN_LOPROC */
        public static final int f55829xb549b9bf = 65280;

        /* renamed from: SHN_LORESERVE */
        public static final int f55830x25e7593 = 65280;

        /* renamed from: SHN_UNDEF */
        public static final int f55831xe995786 = 0;

        /* renamed from: SHT_DYNAMIC */
        public static final int f55832xd742c47f = 6;

        /* renamed from: SHT_DYNSYM */
        public static final int f55833x1776094e = 11;

        /* renamed from: SHT_HASH */
        public static final int f55834x2375bcae = 5;

        /* renamed from: SHT_HIPROC */
        public static final int f55835x1d68d777 = Integer.MAX_VALUE;

        /* renamed from: SHT_HIUSER */
        public static final int f55836x1d6b1fec = -1;

        /* renamed from: SHT_LOPROC */
        public static final int f55837x2490c6f9 = 1879048192;

        /* renamed from: SHT_LOUSER */
        public static final int f55838x24930f6e = Integer.MIN_VALUE;

        /* renamed from: SHT_NOBITS */
        public static final int f55839x27f3f9e7 = 8;

        /* renamed from: SHT_NOTE */
        public static final int f55840x2378ab92 = 7;

        /* renamed from: SHT_NULL */
        public static final int f55841x2378c127 = 0;

        /* renamed from: SHT_PROGBITS */
        public static final int f55842x7f5caf00 = 1;

        /* renamed from: SHT_REL */
        public static final int f55843xa64e44d9 = 9;

        /* renamed from: SHT_RELA */
        public static final int f55844x237a5688 = 4;

        /* renamed from: SHT_SHLIB */
        public static final int f55845x4bdff050 = 10;

        /* renamed from: SHT_STRTAB */
        public static final int f55846x30ca1764 = 3;

        /* renamed from: SHT_SYMTAB */
        public static final int f55847x310e470e = 2;

        /* renamed from: shAddr */
        public final long f55848xca15ebe6;

        /* renamed from: shAddrAlign */
        public final long f55849xca263abf;

        /* renamed from: shEntSize */
        public final long f55850xd2851f77;

        /* renamed from: shFlags */
        public final long f55851x78f19d32;

        /* renamed from: shInfo */
        public final int f55852xca19b4a3;

        /* renamed from: shLink */
        public final int f55853xca1affef;

        /* renamed from: shName */
        public final int f55854xca1bca80;

        /* renamed from: shNameStr */
        public java.lang.String f55855x98136b91;

        /* renamed from: shOffset */
        public final long f55856xb44b8b48;

        /* renamed from: shSize */
        public final long f55857xca1e2ff6;

        /* renamed from: shType */
        public final int f55858xca1edf2f;

        private SectionHeader(java.nio.ByteBuffer byteBuffer, int i17) {
            if (i17 == 1) {
                this.f55854xca1bca80 = byteBuffer.getInt();
                this.f55858xca1edf2f = byteBuffer.getInt();
                this.f55851x78f19d32 = byteBuffer.getInt();
                this.f55848xca15ebe6 = byteBuffer.getInt();
                this.f55856xb44b8b48 = byteBuffer.getInt();
                this.f55857xca1e2ff6 = byteBuffer.getInt();
                this.f55853xca1affef = byteBuffer.getInt();
                this.f55852xca19b4a3 = byteBuffer.getInt();
                this.f55849xca263abf = byteBuffer.getInt();
                this.f55850xd2851f77 = byteBuffer.getInt();
            } else if (i17 == 2) {
                this.f55854xca1bca80 = byteBuffer.getInt();
                this.f55858xca1edf2f = byteBuffer.getInt();
                this.f55851x78f19d32 = byteBuffer.getLong();
                this.f55848xca15ebe6 = byteBuffer.getLong();
                this.f55856xb44b8b48 = byteBuffer.getLong();
                this.f55857xca1e2ff6 = byteBuffer.getLong();
                this.f55853xca1affef = byteBuffer.getInt();
                this.f55852xca19b4a3 = byteBuffer.getInt();
                this.f55849xca263abf = byteBuffer.getLong();
                this.f55850xd2851f77 = byteBuffer.getLong();
            } else {
                throw new java.io.IOException("Unexpected elf class: " + i17);
            }
            this.f55855x98136b91 = null;
        }
    }

    public C26633x8dbd5dfc(java.io.File file) {
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26633x8dbd5dfc.SectionHeader[] sectionHeaderArr;
        this.f55767xe654240c = null;
        this.f55768x98e4c62 = null;
        this.f55769xb2d3ece1 = null;
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
        this.fis = fileInputStream;
        java.nio.channels.FileChannel channel = fileInputStream.getChannel();
        this.f55767xe654240c = new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26633x8dbd5dfc.ElfHeader(channel);
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(128);
        allocate.limit(this.f55767xe654240c.f55792xee23938f);
        allocate.order(this.f55767xe654240c.f55790x61a43d71[5] == 1 ? java.nio.ByteOrder.LITTLE_ENDIAN : java.nio.ByteOrder.BIG_ENDIAN);
        channel.position(this.f55767xe654240c.f55794xb0f14af2);
        this.f55768x98e4c62 = new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26633x8dbd5dfc.ProgramHeader[this.f55767xe654240c.f55793xb0f14909];
        for (int i17 = 0; i17 < this.f55768x98e4c62.length; i17++) {
            m104633x15077933(channel, allocate, "failed to read phdr.");
            this.f55768x98e4c62[i17] = new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26633x8dbd5dfc.ProgramHeader(allocate, this.f55767xe654240c.f55790x61a43d71[4]);
        }
        channel.position(this.f55767xe654240c.f55797xb11b9175);
        allocate.limit(this.f55767xe654240c.f55795xaaf0e092);
        this.f55769xb2d3ece1 = new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26633x8dbd5dfc.SectionHeader[this.f55767xe654240c.f55796xb11b8f8c];
        int i18 = 0;
        while (true) {
            sectionHeaderArr = this.f55769xb2d3ece1;
            if (i18 >= sectionHeaderArr.length) {
                break;
            }
            m104633x15077933(channel, allocate, "failed to read shdr.");
            this.f55769xb2d3ece1[i18] = new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26633x8dbd5dfc.SectionHeader(allocate, this.f55767xe654240c.f55790x61a43d71[4]);
            i18++;
        }
        short s17 = this.f55767xe654240c.f55798x3ec34fcb;
        if (s17 > 0) {
            java.nio.ByteBuffer m104636xb33cbaaf = m104636xb33cbaaf(sectionHeaderArr[s17]);
            for (com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26633x8dbd5dfc.SectionHeader sectionHeader : this.f55769xb2d3ece1) {
                m104636xb33cbaaf.position(sectionHeader.f55854xca1bca80);
                java.lang.String m104632xdd309fde = m104632xdd309fde(m104636xb33cbaaf);
                sectionHeader.f55855x98136b91 = m104632xdd309fde;
                this.f55770x6fc1fa24.put(m104632xdd309fde, sectionHeader);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: assertInRange */
    public static void m104630x6b7b4f2(int i17, int i18, int i19, java.lang.String str) {
        if (i17 < i18 || i17 > i19) {
            throw new java.io.IOException(str);
        }
    }

    /* renamed from: getFileTypeByMagic */
    public static int m104631x9feb9daa(java.io.File file) {
        java.io.FileInputStream fileInputStream = null;
        try {
            byte[] bArr = new byte[4];
            java.io.FileInputStream fileInputStream2 = new java.io.FileInputStream(file);
            try {
                fileInputStream2.read(bArr);
                byte b17 = bArr[0];
                if (b17 == 100 && bArr[1] == 101 && bArr[2] == 121 && bArr[3] == 10) {
                    try {
                        fileInputStream2.close();
                    } catch (java.lang.Throwable unused) {
                    }
                    return 0;
                }
                if (b17 == Byte.MAX_VALUE && bArr[1] == 69 && bArr[2] == 76) {
                    if (bArr[3] == 70) {
                        try {
                            fileInputStream2.close();
                        } catch (java.lang.Throwable unused2) {
                        }
                        return 1;
                    }
                }
                try {
                    fileInputStream2.close();
                    return -1;
                } catch (java.lang.Throwable unused3) {
                    return -1;
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (java.lang.Throwable unused4) {
                    }
                }
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    /* renamed from: readCString */
    public static java.lang.String m104632xdd309fde(java.nio.ByteBuffer byteBuffer) {
        byte[] array = byteBuffer.array();
        int position = byteBuffer.position();
        while (byteBuffer.hasRemaining() && array[byteBuffer.position()] != 0) {
            byteBuffer.position(byteBuffer.position() + 1);
        }
        byteBuffer.position(byteBuffer.position() + 1);
        return new java.lang.String(array, position, (byteBuffer.position() - position) - 1, java.nio.charset.Charset.forName("ASCII"));
    }

    /* renamed from: readUntilLimit */
    public static void m104633x15077933(java.nio.channels.FileChannel fileChannel, java.nio.ByteBuffer byteBuffer, java.lang.String str) {
        byteBuffer.rewind();
        int read = fileChannel.read(byteBuffer);
        if (read == byteBuffer.limit()) {
            byteBuffer.flip();
            return;
        }
        throw new java.io.IOException(str + " Rest bytes insufficient, expect to read " + byteBuffer.limit() + " bytes but only " + read + " bytes were read.");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.fis.close();
        this.f55770x6fc1fa24.clear();
        this.f55768x98e4c62 = null;
        this.f55769xb2d3ece1 = null;
    }

    /* renamed from: getChannel */
    public java.nio.channels.FileChannel m104634x69d8b8cd() {
        return this.fis.getChannel();
    }

    /* renamed from: getDataOrder */
    public java.nio.ByteOrder m104635xe8e2530e() {
        return this.f55767xe654240c.f55790x61a43d71[5] == 1 ? java.nio.ByteOrder.LITTLE_ENDIAN : java.nio.ByteOrder.BIG_ENDIAN;
    }

    /* renamed from: getSection */
    public java.nio.ByteBuffer m104636xb33cbaaf(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26633x8dbd5dfc.SectionHeader sectionHeader) {
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate((int) sectionHeader.f55857xca1e2ff6);
        this.fis.getChannel().position(sectionHeader.f55856xb44b8b48);
        m104633x15077933(this.fis.getChannel(), allocate, "failed to read section: " + sectionHeader.f55855x98136b91);
        return allocate;
    }

    /* renamed from: getSectionHeaderByName */
    public com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26633x8dbd5dfc.SectionHeader m104637x5c1268be(java.lang.String str) {
        return this.f55770x6fc1fa24.get(str);
    }

    /* renamed from: getSegment */
    public java.nio.ByteBuffer m104638xb371dafd(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26633x8dbd5dfc.ProgramHeader programHeader) {
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate((int) programHeader.f55814xb5f3202d);
        this.fis.getChannel().position(programHeader.f55817xb1563d23);
        m104633x15077933(this.fis.getChannel(), allocate, "failed to read segment (type: " + programHeader.f55819x6524bca + ").");
        return allocate;
    }

    /* renamed from: is32BitElf */
    public boolean m104639x4a4e0ebb() {
        return this.f55767xe654240c.f55790x61a43d71[4] == 1;
    }
}
