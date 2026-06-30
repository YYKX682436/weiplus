package com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861;

/* renamed from: com.tencent.tinker.loader.shareutil.SharePatchInfo */
/* loaded from: classes13.dex */
public class C26638x12179c17 {

    /* renamed from: DEFAULT_DIR */
    public static final java.lang.String f55893x665ba14f = "odex";

    /* renamed from: FINGER_PRINT */
    public static final java.lang.String f55894xb53fa237 = "print";

    /* renamed from: IS_PROTECTED_APP */
    public static final java.lang.String f55895x5c23bb7b = "is_protected_app";

    /* renamed from: IS_REMOVE_INTERPRET_OAT_DIR */
    public static final java.lang.String f55896xaa307498 = "is_remove_interpret_oat_dir";

    /* renamed from: MAX_EXTRACT_ATTEMPTS */
    public static final int f55897xe86ff = 2;

    /* renamed from: NEW_VERSION */
    public static final java.lang.String f55898x650bfcf9 = "new";

    /* renamed from: OAT_DIR */
    public static final java.lang.String f55899xc6c33770 = "dir";

    /* renamed from: OLD_VERSION */
    public static final java.lang.String f55900xa6de8a80 = "old";
    private static final java.lang.String TAG = "Tinker.PatchInfo";

    /* renamed from: USE_CUSTOM_FILE_PATCH */
    public static final java.lang.String f55901xe8fd285b = "use_custom_file_patch";

    /* renamed from: VERSION_TO_REMOVE */
    public static final java.lang.String f55902x36ef4c01 = "version_to_remove";

    /* renamed from: fingerPrint */
    public java.lang.String f55903xac39f8c4;

    /* renamed from: isProtectedApp */
    public boolean f55904xd598c1dd;

    /* renamed from: isRemoveInterpretOATDir */
    public boolean f55905xbe61af8a;

    /* renamed from: newVersion */
    public java.lang.String f55906x3867f718;

    /* renamed from: oatDir */
    public java.lang.String f55907xc2f69c4b;

    /* renamed from: oldVersion */
    public java.lang.String f55908x84da1cb1;

    /* renamed from: useCustomPatch */
    public boolean f55909x60ea1b50;

    /* renamed from: versionToRemove */
    @java.lang.Deprecated
    public java.lang.String f55910x7d3d13d7;

    public C26638x12179c17(java.lang.String str, java.lang.String str2, boolean z17, boolean z18, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z19) {
        this.f55908x84da1cb1 = str;
        this.f55906x3867f718 = str2;
        this.f55904xd598c1dd = z17;
        this.f55910x7d3d13d7 = str3;
        this.f55903xac39f8c4 = str4;
        this.f55907xc2f69c4b = str5;
        this.f55905xbe61af8a = z19;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e6 A[ADDED_TO_REGION, SYNTHETIC] */
    /* renamed from: readAndCheckProperty */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26638x12179c17 m104695xe938fc1c(java.io.File r17) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26638x12179c17.m104695xe938fc1c(java.io.File):com.tencent.tinker.loader.shareutil.SharePatchInfo");
    }

    /* renamed from: readAndCheckPropertyWithLock */
    public static com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26638x12179c17 m104696x91bd9b4d(java.io.File file, java.io.File file2) {
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26634x2c5b4cf4 c26634x2c5b4cf4 = null;
        if (file == null || file2 == null) {
            return null;
        }
        java.io.File parentFile = file2.getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        try {
            try {
                c26634x2c5b4cf4 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26634x2c5b4cf4.m104640x4fff4e3d(file2);
                return m104695xe938fc1c(file);
            } catch (java.lang.Exception e17) {
                throw new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26608x7636b0b6("readAndCheckPropertyWithLock fail", e17);
            }
        } finally {
            if (c26634x2c5b4cf4 != null) {
                try {
                    c26634x2c5b4cf4.close();
                } catch (java.io.IOException e18) {
                    com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.w(TAG, "releaseInfoLock error", e18);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x015f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009e A[SYNTHETIC] */
    /* renamed from: rewritePatchInfoFile */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean m104697x9c056586(java.io.File r8, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26638x12179c17 r9) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26638x12179c17.m104697x9c056586(java.io.File, com.tencent.tinker.loader.shareutil.SharePatchInfo):boolean");
    }

    /* renamed from: rewritePatchInfoFileWithLock */
    public static boolean m104698x2e66fab7(java.io.File file, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26638x12179c17 c26638x12179c17, java.io.File file2) {
        if (file == null || c26638x12179c17 == null || file2 == null) {
            return false;
        }
        java.io.File parentFile = file2.getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26634x2c5b4cf4 c26634x2c5b4cf4 = null;
        try {
            try {
                c26634x2c5b4cf4 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26634x2c5b4cf4.m104640x4fff4e3d(file2);
                return m104697x9c056586(file, c26638x12179c17);
            } finally {
                if (c26634x2c5b4cf4 != null) {
                    try {
                        c26634x2c5b4cf4.close();
                    } catch (java.io.IOException e17) {
                        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i(TAG, "releaseInfoLock error", e17);
                    }
                }
            }
        } catch (java.lang.Exception e18) {
            throw new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26608x7636b0b6("rewritePatchInfoFileWithLock fail", e18);
        }
    }
}
