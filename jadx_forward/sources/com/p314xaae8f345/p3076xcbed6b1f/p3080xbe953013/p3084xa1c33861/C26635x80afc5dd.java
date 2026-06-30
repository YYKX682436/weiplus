package com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861;

/* renamed from: com.tencent.tinker.loader.shareutil.ShareIntentUtil */
/* loaded from: classes13.dex */
public class C26635x80afc5dd {

    /* renamed from: INTENT_IS_PROTECTED_APP */
    public static final java.lang.String f55863x2aa7febe = "intent_is_protected_app";

    /* renamed from: INTENT_PATCH_COST_TIME */
    public static final java.lang.String f55864x87ca0d05 = "intent_patch_cost_time";

    /* renamed from: INTENT_PATCH_DEXES_PATH */
    public static final java.lang.String f55865x7520f4f9 = "intent_patch_dexes_path";

    /* renamed from: INTENT_PATCH_EXCEPTION */
    public static final java.lang.String f55866xee6db935 = "intent_patch_exception";

    /* renamed from: INTENT_PATCH_INTERPRET_EXCEPTION */
    public static final java.lang.String f55867xebe168e3 = "intent_patch_interpret_exception";

    /* renamed from: INTENT_PATCH_LIBS_PATH */
    public static final java.lang.String f55868xc9ea303c = "intent_patch_libs_path";

    /* renamed from: INTENT_PATCH_MISMATCH_DEX_PATH */
    public static final java.lang.String f55869x7b1fb9c4 = "intent_patch_mismatch_dex_path";

    /* renamed from: INTENT_PATCH_MISMATCH_LIB_PATH */
    public static final java.lang.String f55870x68377016 = "intent_patch_mismatch_lib_path";

    /* renamed from: INTENT_PATCH_MISSING_DEX_PATH */
    public static final java.lang.String f55871x11023680 = "intent_patch_missing_dex_path";

    /* renamed from: INTENT_PATCH_MISSING_LIB_PATH */
    public static final java.lang.String f55872xfe19ecd2 = "intent_patch_missing_lib_path";

    /* renamed from: INTENT_PATCH_NEW_VERSION */
    public static final java.lang.String f55873x6affac7f = "intent_patch_new_version";

    /* renamed from: INTENT_PATCH_OAT_DIR */
    public static final java.lang.String f55874x4a5799f6 = "intent_patch_oat_dir";

    /* renamed from: INTENT_PATCH_OLD_VERSION */
    public static final java.lang.String f55875xacd23a06 = "intent_patch_old_version";

    /* renamed from: INTENT_PATCH_PACKAGE_CONFIG */
    public static final java.lang.String f55876xa59d3835 = "intent_patch_package_config";

    /* renamed from: INTENT_PATCH_PACKAGE_PATCH_CHECK */
    public static final java.lang.String f55877xabc698fe = "intent_patch_package_patch_check";

    /* renamed from: INTENT_PATCH_SYSTEM_OTA */
    public static final java.lang.String f55878x540460a6 = "intent_patch_system_ota";

    /* renamed from: INTENT_RETURN_CODE */
    public static final java.lang.String f55879xf651ea79 = "intent_return_code";

    /* renamed from: INTENT_USE_CUSTOM_PATCH */
    public static final java.lang.String f55880x258e14f5 = "intent_use_custom_patch";
    private static final java.lang.String TAG = "ShareIntentUtil";

    /* renamed from: fixIntentClassLoader */
    public static void m104641xade803da(android.content.Intent intent, java.lang.ClassLoader classLoader) {
        try {
            intent.setExtrasClassLoader(classLoader);
        } catch (java.lang.Throwable unused) {
        }
    }

    /* renamed from: getBooleanExtra */
    public static boolean m104642x21a1233e(android.content.Intent intent, java.lang.String str, boolean z17) {
        if (intent == null) {
            return z17;
        }
        try {
            return intent.getBooleanExtra(str, z17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(TAG, "getBooleanExtra exception:" + e17.getMessage(), new java.lang.Object[0]);
            return z17;
        }
    }

    /* renamed from: getIntExtra */
    public static int m104643x9c19e6d7(android.content.Intent intent, java.lang.String str, int i17) {
        if (intent == null) {
            return i17;
        }
        try {
            return intent.getIntExtra(str, i17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(TAG, "getIntExtra exception:" + e17.getMessage(), new java.lang.Object[0]);
            return i17;
        }
    }

    /* renamed from: getIntentInterpretException */
    public static java.lang.Throwable m104644xe662af4(android.content.Intent intent) {
        java.io.Serializable m104652x44c1999b = m104652x44c1999b(intent, f55867xebe168e3);
        if (m104652x44c1999b != null) {
            return (java.lang.Throwable) m104652x44c1999b;
        }
        return null;
    }

    /* renamed from: getIntentPackageConfig */
    public static java.util.HashMap<java.lang.String, java.lang.String> m104645x1d734ab6(android.content.Intent intent) {
        java.io.Serializable m104652x44c1999b = m104652x44c1999b(intent, f55876xa59d3835);
        if (m104652x44c1999b != null) {
            return (java.util.HashMap) m104652x44c1999b;
        }
        return null;
    }

    /* renamed from: getIntentPatchCostTime */
    public static long m104646x33adf830(android.content.Intent intent) {
        return intent.getLongExtra(f55864x87ca0d05, 0L);
    }

    /* renamed from: getIntentPatchDexPaths */
    public static java.util.HashMap<java.lang.String, java.lang.String> m104647x9123d30d(android.content.Intent intent) {
        java.io.Serializable m104652x44c1999b = m104652x44c1999b(intent, f55865x7520f4f9);
        if (m104652x44c1999b != null) {
            return (java.util.HashMap) m104652x44c1999b;
        }
        return null;
    }

    /* renamed from: getIntentPatchException */
    public static java.lang.Throwable m104648xab179f19(android.content.Intent intent) {
        java.io.Serializable m104652x44c1999b = m104652x44c1999b(intent, f55866xee6db935);
        if (m104652x44c1999b != null) {
            return (java.lang.Throwable) m104652x44c1999b;
        }
        return null;
    }

    /* renamed from: getIntentPatchLibsPaths */
    public static java.util.HashMap<java.lang.String, java.lang.String> m104649x83f739ca(android.content.Intent intent) {
        java.io.Serializable m104652x44c1999b = m104652x44c1999b(intent, f55868xc9ea303c);
        if (m104652x44c1999b != null) {
            return (java.util.HashMap) m104652x44c1999b;
        }
        return null;
    }

    /* renamed from: getIntentReturnCode */
    public static int m104650xc7992e6f(android.content.Intent intent) {
        return m104643x9c19e6d7(intent, f55879xf651ea79, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55644xa67f77f6);
    }

    /* renamed from: getLongExtra */
    public static long m104651x5a3fc3e(android.content.Intent intent, java.lang.String str, long j17) {
        if (intent == null) {
            return j17;
        }
        try {
            return intent.getLongExtra(str, j17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(TAG, "getIntExtra exception:" + e17.getMessage(), new java.lang.Object[0]);
            return j17;
        }
    }

    /* renamed from: getSerializableExtra */
    public static java.io.Serializable m104652x44c1999b(android.content.Intent intent, java.lang.String str) {
        if (intent == null) {
            return null;
        }
        try {
            return intent.getSerializableExtra(str);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(TAG, "getSerializableExtra exception:" + e17.getMessage(), new java.lang.Object[0]);
            return null;
        }
    }

    /* renamed from: getStringArrayListExtra */
    public static java.util.ArrayList<java.lang.String> m104653xaa7ddea0(android.content.Intent intent, java.lang.String str) {
        if (intent == null) {
            return null;
        }
        try {
            return intent.getStringArrayListExtra(str);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(TAG, "getStringExtra exception:" + e17.getMessage(), new java.lang.Object[0]);
            return null;
        }
    }

    /* renamed from: getStringExtra */
    public static java.lang.String m104654x7e63ed49(android.content.Intent intent, java.lang.String str) {
        if (intent == null) {
            return null;
        }
        try {
            return intent.getStringExtra(str);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(TAG, "getStringExtra exception:" + e17.getMessage(), new java.lang.Object[0]);
            return null;
        }
    }

    /* renamed from: setIntentPatchCostTime */
    public static void m104655x81f2b7a4(android.content.Intent intent, long j17) {
        intent.putExtra(f55864x87ca0d05, j17);
    }

    /* renamed from: setIntentReturnCode */
    public static void m104656x6b95c37b(android.content.Intent intent, int i17) {
        intent.putExtra(f55879xf651ea79, i17);
    }
}
