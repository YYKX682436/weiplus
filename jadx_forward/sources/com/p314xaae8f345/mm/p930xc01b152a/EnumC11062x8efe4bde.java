package com.p314xaae8f345.mm.p930xc01b152a;

/* renamed from: com.tencent.mm.mm7zip.PropID */
/* loaded from: classes16.dex */
public enum EnumC11062x8efe4bde {
    NO_PROPERTY1,
    NO_PROPERTY2,
    HANDLER_ITEM_INDEX,
    PATH,
    NAME,
    EXTENSION,
    IS_FOLDER,
    SIZE,
    PACKED_SIZE,
    ATTRIBUTES,
    CREATION_TIME,
    LAST_ACCESS_TIME,
    LAST_MODIFICATION_TIME,
    SOLID,
    COMMENTED,
    ENCRYPTED,
    SPLIT_BEFORE,
    SPLIT_AFTER,
    DICTIONARY_SIZE,
    CRC,
    TYPE,
    IS_ANTI,
    METHOD,
    HOST_OS,
    FILE_SYSTEM,
    USER,
    GROUP,
    BLOCK,
    COMMENT,
    POSITION,
    PREFIX,
    NUM_SUB_DIRS,
    NUM_SUB_FILES,
    UNPACK_VER,
    VOLUME,
    IS_VOLUME,
    OFFSET,
    LINKS,
    NUM_BLOCKS,
    NUM_VOLUMES,
    TIME_TYPE,
    BIT64,
    BIG_ENDIAN,
    CPU,
    PHY_SIZE,
    HEADERS_SIZE,
    CHECKSUM,
    CHARACTS,
    VA,
    ID,
    SHORT_NAME,
    CREATOR_APP,
    SECTOR_SIZE,
    POSIX_ATTRIB,
    SYM_LINK,
    ERROR,
    TOTAL_SIZE,
    FREE_SPACE,
    CLUSTER_SIZE,
    VOLUME_NAME,
    LOCAL_NAME,
    PROVIDER,
    NT_SECURE,
    IS_ALT_STREAM,
    IS_AUX,
    IS_DELETED,
    IS_TREE,
    SHA1,
    SHA256,
    ERROR_TYPE,
    NUM_ERRORS,
    ERROR_FLAGS,
    WARNING_FLAGS,
    WARNING,
    NUM_STREAMS,
    NUM_ALT_STREAMS,
    ALT_STREAMS_SIZE,
    VIRTUAL_SIZE,
    UNPACK_SIZE,
    TOTAL_PHY_SIZE,
    VOLUME_INDEX,
    SUB_TYPE,
    SHORT_COMMENT,
    CODE_PAGE,
    IS_NOT_ARC_TYPE,
    PHY_SIZE_CANT_BE_DETECTED,
    ZEROS_TAIL_IS_ALLOWED,
    TAIL_SIZE,
    EMBEDDED_STUB_SIZE,
    NT_REPARSE,
    HARD_LINK,
    INODE,
    STREAM_ID,
    READ_ONLY,
    OUT_NAME,
    COPY_LINK,
    NUM_DEFINED,
    USER_DEFINED(65536),
    UNKNOWN(-1);


    /* renamed from: propIDIndex */
    private final int f29910x36daffb4;

    /* renamed from: com.tencent.mm.mm7zip.PropID$AttributesBitMask */
    /* loaded from: classes4.dex */
    public static class AttributesBitMask {

        /* renamed from: FILE_ATTRIBUTE_ARCHIVE */
        public static final int f29911xf1b981dc = 32;

        /* renamed from: FILE_ATTRIBUTE_COMPRESSED */
        public static final int f29912xb2e5bc07 = 2048;

        /* renamed from: FILE_ATTRIBUTE_DEVICE */
        public static final int f29913x2d446ddc = 64;

        /* renamed from: FILE_ATTRIBUTE_DIRECTORY */
        public static final int f29914x934cdd07 = 16;

        /* renamed from: FILE_ATTRIBUTE_ENCRYPTED */
        public static final int f29915x2cdcf85e = 16384;

        /* renamed from: FILE_ATTRIBUTE_HIDDEN */
        public static final int f29916x3447ed30 = 2;

        /* renamed from: FILE_ATTRIBUTE_NORMAL */
        public static final int f29917x3ee00c6d = 128;

        /* renamed from: FILE_ATTRIBUTE_OFFLINE */
        public static final int f29918xc202aefd = 4096;

        /* renamed from: FILE_ATTRIBUTE_READONLY */
        public static final int f29919x781a4048 = 1;

        /* renamed from: FILE_ATTRIBUTE_REPARSE_POINT */
        public static final int f29920x7665d26b = 1024;

        /* renamed from: FILE_ATTRIBUTE_SPARSE_FILE */
        public static final int f29921xfe7d0475 = 512;

        /* renamed from: FILE_ATTRIBUTE_SYSTEM */
        public static final int f29922x47f5c1b5 = 4;

        /* renamed from: FILE_ATTRIBUTE_TEMPORARY */
        public static final int f29923x42fd3ceb = 256;

        /* renamed from: FILE_ATTRIBUTE_UNIX_EXTENSION */
        public static final int f29924x323923ae = 32768;
    }

    EnumC11062x8efe4bde(int i17) {
        this.f29910x36daffb4 = i17;
    }

    /* renamed from: getPropIDByIndex */
    public static com.p314xaae8f345.mm.p930xc01b152a.EnumC11062x8efe4bde m47640x487aad67(int i17) {
        if (i17 >= 0 && i17 < m47642xcee59d22().length && m47642xcee59d22()[i17].m47643x10b1467e() == i17) {
            return m47642xcee59d22()[i17];
        }
        int length = m47642xcee59d22().length;
        do {
            length--;
            if (length == -1) {
                return UNKNOWN;
            }
        } while (m47642xcee59d22()[length].m47643x10b1467e() != i17);
        return m47642xcee59d22()[length];
    }

    /* renamed from: getPropIDIndex */
    public int m47643x10b1467e() {
        return this.f29910x36daffb4;
    }

    EnumC11062x8efe4bde() {
        this.f29910x36daffb4 = ordinal();
    }
}
