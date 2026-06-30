package com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013;

/* renamed from: com.tencent.tinker.loader.TinkerDexLoader */
/* loaded from: classes13.dex */
public class C26602xc5c728b {

    /* renamed from: DEFAULT_DEX_OPTIMIZE_PATH */
    private static final java.lang.String f55439x9b979761 = "odex";

    /* renamed from: DEX_MEAT_FILE */
    private static final java.lang.String f55440xdefbfb28 = "assets/dex_meta.txt";

    /* renamed from: DEX_PATH */
    private static final java.lang.String f55441x75686f6d = "dex";

    /* renamed from: INTERPRET_DEX_OPTIMIZE_PATH */
    private static final java.lang.String f55442xa7e2e32d = "interpet";
    private static final java.lang.String TAG = "Tinker.TinkerDexLoader";

    /* renamed from: LOAD_DEX_LIST */
    private static final java.util.ArrayList<com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26632x3b07ed99> f55443x5b17531f = new java.util.ArrayList<>();

    /* renamed from: classNDexInfo */
    private static java.util.HashSet<com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26632x3b07ed99> f55444xa4db6eaf = new java.util.HashSet<>();

    /* renamed from: isVmArt */
    private static boolean f55445x7b9a1122 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104754x7b9a1122();

    private C26602xc5c728b() {
    }

    /* renamed from: checkComplete */
    public static boolean m104484x6c31f261(java.lang.String str, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26641x1cdfa429 c26641x1cdfa429, java.lang.String str2, android.content.Intent intent) {
        java.lang.String str3 = c26641x1cdfa429.m104717xa17536fe().get("assets/dex_meta.txt");
        if (str3 == null) {
            return true;
        }
        f55443x5b17531f.clear();
        f55444xa4db6eaf.clear();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26632x3b07ed99.m104627xbfd1408d(str3, arrayList);
        if (arrayList.isEmpty()) {
            return true;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = arrayList.iterator();
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26632x3b07ed99 c26632x3b07ed99 = null;
        while (it.hasNext()) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26632x3b07ed99 c26632x3b07ed992 = (com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26632x3b07ed99) it.next();
            if (!m104487x8d7ac2f5(c26632x3b07ed992)) {
                if (!com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26632x3b07ed99.m104626x9aafc0e2(c26632x3b07ed992)) {
                    intent.putExtra(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.f55877xabc698fe, -3);
                    com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.m104656x6b95c37b(intent, -8);
                    return false;
                }
                if (f55445x7b9a1122 && c26632x3b07ed992.f55762x3abe52d3.startsWith(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55726x3eeb7ee0)) {
                    c26632x3b07ed99 = c26632x3b07ed992;
                } else if (f55445x7b9a1122 && com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55630x4296ce58.matcher(c26632x3b07ed992.f55763xccb84949).matches()) {
                    f55444xa4db6eaf.add(c26632x3b07ed992);
                } else {
                    hashMap.put(c26632x3b07ed992.f55763xccb84949, m104486xb1c19dba(c26632x3b07ed992));
                    f55443x5b17531f.add(c26632x3b07ed992);
                }
            }
        }
        if (f55445x7b9a1122 && (c26632x3b07ed99 != null || !f55444xa4db6eaf.isEmpty())) {
            if (c26632x3b07ed99 != null) {
                java.util.HashSet<com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26632x3b07ed99> hashSet = f55444xa4db6eaf;
                hashSet.add(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104721xf5db5ba6(c26632x3b07ed99, hashSet.size() + 1));
            }
            hashMap.put(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55629x4d21106, "");
        }
        java.lang.String str4 = str + "/dex/";
        java.io.File file = new java.io.File(str4);
        if (!file.exists() || !file.isDirectory()) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.m104656x6b95c37b(intent, -9);
            return false;
        }
        java.io.File file2 = new java.io.File(str + "/" + str2 + "/");
        java.util.Iterator it6 = hashMap.keySet().iterator();
        while (it6.hasNext()) {
            java.io.File file3 = new java.io.File(str4 + ((java.lang.String) it6.next()));
            if (!com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104686xc32e09cb(file3)) {
                intent.putExtra(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.f55871x11023680, file3.getAbsolutePath());
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.m104656x6b95c37b(intent, -10);
                return false;
            }
            java.io.File file4 = new java.io.File(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104689x54ec473d(file3, file2));
            if (!com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104686xc32e09cb(file4) && !com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104691x54677ec4(file4)) {
                intent.putExtra(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.f55871x11023680, file4.getAbsolutePath());
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.m104656x6b95c37b(intent, -11);
                return false;
            }
        }
        intent.putExtra(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.f55865x7520f4f9, hashMap);
        return true;
    }

    /* renamed from: deleteOutOfDateOATFile */
    private static void m104485x559dab6(java.lang.String str) {
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104670xea9e22e2(str + "/odex/");
        if (com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104738x9cf9bcb2()) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104670xea9e22e2(str + "/dex/oat/");
        }
    }

    /* renamed from: getInfoMd5 */
    private static java.lang.String m104486xb1c19dba(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26632x3b07ed99 c26632x3b07ed99) {
        return f55445x7b9a1122 ? c26632x3b07ed99.f55754xf2f170e2 : c26632x3b07ed99.f55755xf2f17c9a;
    }

    /* renamed from: isJustArtSupportDex */
    private static boolean m104487x8d7ac2f5(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26632x3b07ed99 c26632x3b07ed99) {
        return !f55445x7b9a1122 && c26632x3b07ed99.f55755xf2f17c9a.equals("0");
    }

    /* renamed from: loadTinkerJars */
    public static boolean m104488x31f01afd(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.app.AbstractApplicationC26612x4766a891 abstractApplicationC26612x4766a891, java.lang.String str, java.lang.String str2, android.content.Intent intent, boolean z17, boolean z18) {
        java.io.File file;
        java.util.ArrayList<com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26632x3b07ed99> arrayList = f55443x5b17531f;
        int i17 = 0;
        if (arrayList.isEmpty() && f55444xa4db6eaf.isEmpty()) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.w(TAG, "there is no dex to load", new java.lang.Object[0]);
            return true;
        }
        java.lang.ClassLoader classLoader = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26602xc5c728b.class.getClassLoader();
        if (classLoader == null) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(TAG, "classloader is null", new java.lang.Object[0]);
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.m104656x6b95c37b(intent, -12);
            return false;
        }
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i(TAG, "classloader: " + classLoader.toString(), new java.lang.Object[0]);
        java.lang.String str3 = str + "/dex/";
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator<com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26632x3b07ed99> it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26632x3b07ed99 next = it.next();
            if (!m104487x8d7ac2f5(next)) {
                java.io.File file2 = new java.io.File(str3 + next.f55763xccb84949);
                if (abstractApplicationC26612x4766a891.m104539x27032e54()) {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    if (!com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104692x8a7ff3a4(file2, m104486xb1c19dba(next))) {
                        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.m104656x6b95c37b(intent, -13);
                        intent.putExtra(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.f55869x7b1fb9c4, file2.getAbsolutePath());
                        return false;
                    }
                    com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i(TAG, "verify dex file:" + file2.getPath() + " md5, use time: " + (java.lang.System.currentTimeMillis() - currentTimeMillis), new java.lang.Object[0]);
                }
                arrayList2.add(file2);
            }
        }
        if (f55445x7b9a1122 && !f55444xa4db6eaf.isEmpty()) {
            java.io.File file3 = new java.io.File(str3 + com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55629x4d21106);
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            if (abstractApplicationC26612x4766a891.m104539x27032e54()) {
                java.util.Iterator<com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26632x3b07ed99> it6 = f55444xa4db6eaf.iterator();
                while (it6.hasNext()) {
                    com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26632x3b07ed99 next2 = it6.next();
                    if (!com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104693x8a7ff3a4(file3, next2.f55762x3abe52d3, next2.f55754xf2f170e2)) {
                        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.m104656x6b95c37b(intent, -13);
                        intent.putExtra(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.f55869x7b1fb9c4, file3.getAbsolutePath());
                        return false;
                    }
                    i17 = 0;
                }
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i(TAG, "verify dex file:" + file3.getPath() + " md5, use time: " + (java.lang.System.currentTimeMillis() - currentTimeMillis2), new java.lang.Object[i17]);
            }
            arrayList2.add(file3);
        }
        java.io.File file4 = new java.io.File(str + "/" + str2);
        if (z17) {
            final boolean[] zArr = {true};
            final java.lang.Throwable[] thArr = new java.lang.Throwable[1];
            try {
                java.lang.String m104728x98963917 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104728x98963917();
                m104485x559dab6(str);
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.w(TAG, "systemOTA, try parallel oat dexes, targetISA:" + m104728x98963917, new java.lang.Object[0]);
                java.io.File file5 = new java.io.File(str + "/interpet");
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26603x94f113bd.m104503x79c2e584(abstractApplicationC26612x4766a891, arrayList2, file5, true, abstractApplicationC26612x4766a891.m104540x4022fa33(), m104728x98963917, false, new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26603x94f113bd.ResultCallback() { // from class: com.tencent.tinker.loader.TinkerDexLoader.1

                    /* renamed from: start */
                    long f55446x68ac462;

                    @Override // com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26603x94f113bd.ResultCallback
                    /* renamed from: onFailed */
                    public void mo104489x428b6afc(java.io.File file6, java.io.File file7, java.lang.Throwable th6) {
                        zArr[0] = false;
                        thArr[0] = th6;
                        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26602xc5c728b.TAG, "fail to optimize dex " + file6.getPath() + ", use time " + (java.lang.System.currentTimeMillis() - this.f55446x68ac462), new java.lang.Object[0]);
                    }

                    @Override // com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26603x94f113bd.ResultCallback
                    /* renamed from: onStart */
                    public void mo104490xb05099c3(java.io.File file6, java.io.File file7) {
                        this.f55446x68ac462 = java.lang.System.currentTimeMillis();
                        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26602xc5c728b.TAG, "start to optimize dex:" + file6.getPath(), new java.lang.Object[0]);
                    }

                    @Override // com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26603x94f113bd.ResultCallback
                    /* renamed from: onSuccess */
                    public void mo104491xe05b4124(java.io.File file6, java.io.File file7, java.io.File file8) {
                        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26602xc5c728b.TAG, "success to optimize dex " + file6.getPath() + ", use time " + (java.lang.System.currentTimeMillis() - this.f55446x68ac462), new java.lang.Object[0]);
                    }
                });
                if (!zArr[0]) {
                    com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(TAG, "parallel oat dexes failed", new java.lang.Object[0]);
                    intent.putExtra(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.f55867xebe168e3, thArr[0]);
                    com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.m104656x6b95c37b(intent, -16);
                    return false;
                }
                file = file5;
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i(TAG, "getCurrentInstructionSet fail:" + th6, new java.lang.Object[0]);
                m104485x559dab6(str);
                intent.putExtra(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.f55867xebe168e3, th6);
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.m104656x6b95c37b(intent, -15);
                return false;
            }
        } else {
            file = file4;
        }
        try {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26599x5da2dc92.m104463x77ce1a2a(abstractApplicationC26612x4766a891, classLoader, file, arrayList2, z18, abstractApplicationC26612x4766a891.m104540x4022fa33());
            return true;
        } catch (java.lang.Throwable th7) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(TAG, "install dexes failed", new java.lang.Object[0]);
            intent.putExtra(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.f55866xee6db935, th7);
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.m104656x6b95c37b(intent, -14);
            return false;
        }
    }
}
