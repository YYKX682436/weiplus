package com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013;

/* renamed from: com.tencent.tinker.loader.TinkerArkHotLoader */
/* loaded from: classes13.dex */
public class C26600xfe99f265 {

    /* renamed from: ARKHOT_PATH */
    private static final java.lang.String f55431x9cbc3531 = "arkHot";

    /* renamed from: ARK_MEAT_FILE */
    private static final java.lang.String f55432xe7db39ab = "assets/arkHot_meta.txt";
    private static final java.lang.String TAG = "Tinker.TinkerArkHotLoader";

    /* renamed from: arkHotApkInfo */
    private static java.util.HashSet<com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26629x8c0ce37f> f55433x4c4e95d7 = new java.util.HashSet<>();

    /* renamed from: isArkHotRuning */
    private static boolean f55434x6e3ebd34 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104739x6e3ebd34();

    private C26600xfe99f265() {
    }

    /* renamed from: checkComplete */
    public static boolean m104480x6c31f261(java.lang.String str, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26641x1cdfa429 c26641x1cdfa429, android.content.Intent intent) {
        java.lang.String str2 = c26641x1cdfa429.m104717xa17536fe().get("assets/arkHot_meta.txt");
        if (str2 == null) {
            return true;
        }
        f55433x4c4e95d7.clear();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26629x8c0ce37f.m104620x116ae9e(str2, arrayList);
        if (arrayList.isEmpty()) {
            return true;
        }
        java.util.HashMap hashMap = new java.util.HashMap(1);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26629x8c0ce37f c26629x8c0ce37f = (com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26629x8c0ce37f) it.next();
            if (!com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26629x8c0ce37f.m104619x73671669(c26629x8c0ce37f)) {
                intent.putExtra(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.f55877xabc698fe, -3);
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.m104656x6b95c37b(intent, -8);
                return false;
            }
            if (f55434x6e3ebd34 && com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55622x61cebc4e.equals(c26629x8c0ce37f.f55611x337a8b)) {
                f55433x4c4e95d7.add(c26629x8c0ce37f);
            }
        }
        if (f55434x6e3ebd34 && !f55433x4c4e95d7.isEmpty()) {
            hashMap.put(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55622x61cebc4e, "");
        }
        java.lang.String str3 = str + "/arkHot/";
        java.io.File file = new java.io.File(str3);
        if (!file.exists() || !file.isDirectory()) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.m104656x6b95c37b(intent, -9);
            return false;
        }
        java.util.Iterator it6 = hashMap.keySet().iterator();
        while (it6.hasNext()) {
            java.io.File file2 = new java.io.File(str3 + ((java.lang.String) it6.next()));
            if (!com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104686xc32e09cb(file2)) {
                try {
                    intent.putExtra(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.f55871x11023680, file2.getCanonicalPath());
                } catch (java.io.IOException unused) {
                }
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.m104656x6b95c37b(intent, -10);
                return false;
            }
        }
        intent.putExtra(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.f55865x7520f4f9, hashMap);
        return true;
    }

    /* renamed from: loadTinkerArkHot */
    public static boolean m104481x67e57f98(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.app.AbstractApplicationC26612x4766a891 abstractApplicationC26612x4766a891, java.lang.String str, android.content.Intent intent) {
        if (f55433x4c4e95d7.isEmpty()) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.w(TAG, "there is no apk to load", new java.lang.Object[0]);
            return true;
        }
        dalvik.system.PathClassLoader pathClassLoader = (dalvik.system.PathClassLoader) com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26600xfe99f265.class.getClassLoader();
        if (pathClassLoader == null) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(TAG, "classloader is null", new java.lang.Object[0]);
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.m104656x6b95c37b(intent, -12);
            return false;
        }
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i(TAG, "classloader: " + pathClassLoader.toString(), new java.lang.Object[0]);
        java.lang.String str2 = str + "/arkHot/";
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (f55434x6e3ebd34 && !f55433x4c4e95d7.isEmpty()) {
            arrayList.add(new java.io.File(str2 + com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55622x61cebc4e));
        }
        try {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26599x5da2dc92.m104462x35ab3281(pathClassLoader, arrayList);
            return true;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(TAG, "install dexes failed", new java.lang.Object[0]);
            intent.putExtra(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.f55866xee6db935, th6);
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.m104656x6b95c37b(intent, -14);
            return false;
        }
    }
}
