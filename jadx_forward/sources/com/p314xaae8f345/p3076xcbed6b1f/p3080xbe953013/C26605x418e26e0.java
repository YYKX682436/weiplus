package com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013;

/* renamed from: com.tencent.tinker.loader.TinkerResourceLoader */
/* loaded from: classes13.dex */
public class C26605x418e26e0 {

    /* renamed from: RESOURCE_FILE */
    protected static final java.lang.String f55471xf5de4b0d = "resources.apk";

    /* renamed from: RESOURCE_META_FILE */
    protected static final java.lang.String f55472x2a9c0885 = "assets/res_meta.txt";

    /* renamed from: RESOURCE_PATH */
    protected static final java.lang.String f55473xf5e2b9b6 = "res";
    private static final java.lang.String TAG = "Tinker.ResourceLoader";

    /* renamed from: resPatchInfo */
    private static com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26640xcfe0bdb5 f55474x4127b056 = new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26640xcfe0bdb5();

    private C26605x418e26e0() {
    }

    /* renamed from: checkComplete */
    public static boolean m104520x6c31f261(android.content.Context context, java.lang.String str, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26641x1cdfa429 c26641x1cdfa429, android.content.Intent intent) {
        java.lang.String str2 = c26641x1cdfa429.m104717xa17536fe().get("assets/res_meta.txt");
        if (str2 == null) {
            return true;
        }
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26640xcfe0bdb5.m104713x1a85821b(str2, f55474x4127b056);
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26640xcfe0bdb5 c26640xcfe0bdb5 = f55474x4127b056;
        if (c26640xcfe0bdb5.f55918x295b92bd == null) {
            return true;
        }
        if (!com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26640xcfe0bdb5.m104710x9cff9d7e(c26640xcfe0bdb5)) {
            intent.putExtra(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.f55877xabc698fe, -8);
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.m104656x6b95c37b(intent, -8);
            return false;
        }
        java.lang.String str3 = str + "/res/";
        java.io.File file = new java.io.File(str3);
        if (!file.exists() || !file.isDirectory()) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.m104656x6b95c37b(intent, -21);
            return false;
        }
        if (!com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104686xc32e09cb(new java.io.File(str3 + "resources.apk"))) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.m104656x6b95c37b(intent, -22);
            return false;
        }
        try {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26606xacf71dc8.m104527x36c409d0(context);
            return true;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(TAG, "resource hook check failed.", th6);
            intent.putExtra(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.f55866xee6db935, th6);
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.m104656x6b95c37b(intent, -23);
            return false;
        }
    }

    /* renamed from: loadTinkerResources */
    public static boolean m104521x82b5000(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.app.AbstractApplicationC26612x4766a891 abstractApplicationC26612x4766a891, java.lang.String str, android.content.Intent intent) {
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26640xcfe0bdb5 c26640xcfe0bdb5 = f55474x4127b056;
        if (c26640xcfe0bdb5 == null || c26640xcfe0bdb5.f55918x295b92bd == null) {
            return true;
        }
        java.lang.String str2 = str + "/res/resources.apk";
        java.io.File file = new java.io.File(str2);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (abstractApplicationC26612x4766a891.m104539x27032e54()) {
            if (!com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104664xe6b79167(file, f55474x4127b056.f55918x295b92bd)) {
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(TAG, "Failed to load resource file, path: " + file.getPath() + ", expect md5: " + f55474x4127b056.f55918x295b92bd, new java.lang.Object[0]);
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.m104656x6b95c37b(intent, -24);
                return false;
            }
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i(TAG, "verify resource file:" + file.getPath() + " md5, use time: " + (java.lang.System.currentTimeMillis() - currentTimeMillis), new java.lang.Object[0]);
        }
        try {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26606xacf71dc8.m104528x62183525(abstractApplicationC26612x4766a891, str2, false);
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i(TAG, "monkeyPatchExistingResources resource file:" + str2 + ", use time: " + (java.lang.System.currentTimeMillis() - currentTimeMillis), new java.lang.Object[0]);
            return true;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(TAG, "install resources failed", new java.lang.Object[0]);
            try {
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26599x5da2dc92.m104464xa7a831b1(abstractApplicationC26612x4766a891.getClassLoader());
            } catch (java.lang.Throwable unused) {
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(TAG, "uninstallPatchDex failed", th6);
            }
            intent.putExtra(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.f55866xee6db935, th6);
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.m104656x6b95c37b(intent, -23);
            return false;
        }
    }
}
