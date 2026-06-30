package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes7.dex */
public interface IBSPatchJNIService extends i95.m {

    /* loaded from: classes7.dex */
    public interface ConstantsIncrementalMergeResult {
        public static final int FAIL_ALLOC = -3;
        public static final int FAIL_DECOMPRESS = -4;
        public static final int FAIL_OVERFLOW = -5;
        public static final int FAIL_READ_DIFF_FILE = -7;
        public static final int FAIL_READ_OLD_FILE = -6;
        public static final int FAIL_WRITE_NEW_FILE = -8;
        public static final int FATAL = 1;
        public static final int OK = 0;
    }

    int bspatch(java.lang.String str, java.lang.String str2, java.lang.String str3);
}
