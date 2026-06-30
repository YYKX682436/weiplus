package com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013;

/* renamed from: com.tencent.tinker.loader.TinkerSoLoader */
/* loaded from: classes13.dex */
public class C26609x7b201ee {

    /* renamed from: SO_MEAT_FILE */
    protected static final java.lang.String f55505xb3db034d = "assets/so_meta.txt";

    /* renamed from: SO_PATH */
    protected static final java.lang.String f55506xb2d42428 = "lib";
    private static final java.lang.String TAG = "Tinker.TinkerSoLoader";

    /* renamed from: checkComplete */
    public static boolean m104533x6c31f261(java.lang.String str, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26641x1cdfa429 c26641x1cdfa429, android.content.Intent intent) {
        java.lang.String str2 = c26641x1cdfa429.m104717xa17536fe().get("assets/so_meta.txt");
        if (str2 == null) {
            return true;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26630x313bd001.m104623x116ae9e(str2, arrayList);
        if (arrayList.isEmpty()) {
            return true;
        }
        java.lang.String str3 = str + "/lib/";
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26630x313bd001 c26630x313bd001 = (com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26630x313bd001) it.next();
            if (!com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26630x313bd001.m104622x73671669(c26630x313bd001)) {
                intent.putExtra(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.f55877xabc698fe, -4);
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.m104656x6b95c37b(intent, -8);
                return false;
            }
            hashMap.put(c26630x313bd001.f55616x346425 + "/" + c26630x313bd001.f55614x337a8b, c26630x313bd001.f297082md5);
        }
        java.io.File file = new java.io.File(str3);
        if (!file.exists() || !file.isDirectory()) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.m104656x6b95c37b(intent, -17);
            return false;
        }
        java.util.Iterator it6 = hashMap.keySet().iterator();
        while (it6.hasNext()) {
            java.io.File file2 = new java.io.File(str3 + ((java.lang.String) it6.next()));
            if (!com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104686xc32e09cb(file2)) {
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.m104656x6b95c37b(intent, -18);
                intent.putExtra(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.f55872xfe19ecd2, file2.getAbsolutePath());
                return false;
            }
        }
        intent.putExtra(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.f55868xc9ea303c, hashMap);
        return true;
    }
}
