package com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806;

/* loaded from: classes12.dex */
public enum m {
    FD_TYPE_ANNON_INODE_EVENT("anon_inode:\\[event.*\\]"),
    FD_TYPE_ANNON_INODE_DMABUF(".*dmabuf.*"),
    FD_TYPE_ANNON_INODE_GRALLOC("anon_inode:gralloc.*"),
    FD_TYPE_ANNON_INODE_MALITL("anon_inode:malitl.*"),
    FD_TYPE_SOCKET(".*socket:.*"),
    FD_TYPE_PIPE(".*pipe:[0-9]*"),
    FD_TYPE_PATH_DATA_MM_FILES_MMKV("/data/.*/" + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + "/files/mmkv/.*"),
    FD_TYPE_PATH_DATA_MM_FILES_KVCOMM("/data/.*/" + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + "/files/kvcomm/.*"),
    FD_TYPE_PATH_DATA_MM_FILES_XLOG("/data/.*/" + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + "/files/xlog/.*"),
    FD_TYPE_PATH_DATA_MM_FILES_OTHERS("/data/.*/" + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + "/files/.*"),
    FD_TYPE_PATH_DATA_MM_MICRO_MSG("/data/.*/" + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + "/MicroMsg/.*"),
    FD_TYPE_PATH_DATA_MM_OTHERS("/data/.*/" + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + "/.*"),
    FD_TYPE_PATH_EXT_AC_VOICE(".*/MicroMsg/[0-9a-eA-E]+/voice2/.*"),
    FD_TYPE_PATH_EXT_AC_VIDEO(".*/MicroMsg/[0-9a-eA-E]+/video/.*"),
    FD_TYPE_PATH_EXT_AC_ATTACHMENT(".*/MicroMsg/[0-9a-eA-E]+/attachment/.*"),
    FD_TYPE_PATH_EXT_AC_IMAGE(".*/MicroMsg/[0-9a-eA-E]+/image[2]?/.*"),
    FD_TYPE_PATH_EXT_AC_OTHERS(".*/MicroMsg/[0-9a-eA-E]+/.*"),
    FD_TYPE_PATH_EXT_OTHERS(".*/MicroMsg/.*"),
    FD_TYPE_PATH_SYSTEM_FRAMEWORK("/system/framework/.*"),
    FD_TYPE_PATH_DEV_ASHMEM("/dev/ashmem"),
    FD_TYPE_PATH_DEV_OTHERS("/dev/.*"),
    FD_TYPE_RAW_PATH("/proc/[0-9]*/fd/[0-9]*"),
    FD_TYPE_OTHERS(".*");


    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f234634d;

    m(java.lang.String str) {
        this.f234634d = str;
    }
}
