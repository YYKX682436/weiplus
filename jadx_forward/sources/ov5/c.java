package ov5;

/* loaded from: classes12.dex */
public abstract class c {
    public static boolean a(com.p314xaae8f345.p3076xcbed6b1f.p3078x5c30872.AbstractC26587x7a37b8e7 abstractC26587x7a37b8e7, java.lang.String str) {
        if (abstractC26587x7a37b8e7 == null || abstractC26587x7a37b8e7.m104434x367a4c1a() == null) {
            throw new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26608x7636b0b6("tinkerApplication is null");
        }
        android.content.Intent m104443xced0bce = abstractC26587x7a37b8e7.m104443xced0bce();
        if (!(m104443xced0bce != null && com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.m104650xc7992e6f(m104443xced0bce) == 0)) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e("Tinker.LoadLibrary", "no loaded patch, skip installation.", new java.lang.Object[0]);
            return false;
        }
        java.lang.String a17 = tv5.c.a(abstractC26587x7a37b8e7);
        if (com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104743x83891ddd(a17)) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e("Tinker.LoadLibrary", "failed to get current patch version.", new java.lang.Object[0]);
            return false;
        }
        java.io.File m104679xac1dbbfb = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104679xac1dbbfb(abstractC26587x7a37b8e7.m104434x367a4c1a());
        if (m104679xac1dbbfb == null) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e("Tinker.LoadLibrary", "failed to get current patch directory.", new java.lang.Object[0]);
            return false;
        }
        java.io.File file = new java.io.File(new java.io.File(m104679xac1dbbfb.getAbsolutePath() + "/" + com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104684x2e62bb27(a17)).getAbsolutePath() + "/lib/lib/" + str);
        if (!file.exists()) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e("Tinker.LoadLibrary", "tinker lib path [%s] is not exists.", file);
            return false;
        }
        java.lang.ClassLoader classLoader = abstractC26587x7a37b8e7.m104434x367a4c1a().getClassLoader();
        if (classLoader == null) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e("Tinker.LoadLibrary", "classloader is null", new java.lang.Object[0]);
            return false;
        }
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i("Tinker.LoadLibrary", "before hack classloader:" + classLoader.toString(), new java.lang.Object[0]);
        try {
            java.lang.reflect.Method declaredMethod = ov5.c.class.getDeclaredMethod("b", java.lang.ClassLoader.class, java.io.File.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, classLoader, file);
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i("Tinker.LoadLibrary", "after hack classloader:" + classLoader.toString(), new java.lang.Object[0]);
            return true;
        } catch (java.lang.Throwable th6) {
            try {
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e("Tinker.LoadLibrary", "installNativeLibraryPath fail:" + file + ", thr: " + th6, new java.lang.Object[0]);
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i("Tinker.LoadLibrary", "after hack classloader:" + classLoader.toString(), new java.lang.Object[0]);
                return false;
            } catch (java.lang.Throwable th7) {
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i("Tinker.LoadLibrary", "after hack classloader:" + classLoader.toString(), new java.lang.Object[0]);
                throw th7;
            }
        }
    }

    public static void b(java.lang.ClassLoader classLoader, java.io.File file) {
        if (file == null || !file.exists()) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e("Tinker.LoadLibrary", "installNativeLibraryPath, folder %s is illegal", file);
            return;
        }
        int i17 = android.os.Build.VERSION.SDK_INT;
        if ((i17 == 25 && android.os.Build.VERSION.PREVIEW_SDK_INT != 0) || i17 > 25) {
            try {
                ov5.b.a(classLoader, file);
                return;
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e("Tinker.LoadLibrary", "installNativeLibraryPath, v25 fail, sdk: %d, error: %s, try to fallback to V23", java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT), th6.getMessage());
                ov5.a.a(classLoader, file);
                return;
            }
        }
        try {
            ov5.a.a(classLoader, file);
        } catch (java.lang.Throwable th7) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e("Tinker.LoadLibrary", "installNativeLibraryPath, v23 fail, sdk: %d, error: %s, try to fallback to V14", java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT), th7.getMessage());
            java.lang.Object obj = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104703x183d66c1(classLoader, "pathList").get(classLoader);
            java.lang.reflect.Field m104703x183d66c1 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104703x183d66c1(obj, "nativeLibraryDirectories");
            java.io.File[] fileArr = (java.io.File[]) m104703x183d66c1.get(obj);
            java.util.ArrayList arrayList = new java.util.ArrayList(fileArr.length + 1);
            arrayList.add(file);
            for (java.io.File file2 : fileArr) {
                if (!file.equals(file2)) {
                    arrayList.add(file2);
                }
            }
            m104703x183d66c1.set(obj, arrayList.toArray(new java.io.File[0]));
        }
    }
}
