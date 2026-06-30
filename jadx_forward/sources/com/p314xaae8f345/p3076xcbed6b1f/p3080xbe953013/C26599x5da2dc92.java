package com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013;

/* renamed from: com.tencent.tinker.loader.SystemClassLoaderAdder */
/* loaded from: classes13.dex */
public class C26599x5da2dc92 {

    /* renamed from: CHECK_DEX_CLASS */
    public static final java.lang.String f55427xd4d0ec79 = "com.tencent.tinker.loader.TinkerTestDexLoad";

    /* renamed from: CHECK_DEX_FIELD */
    public static final java.lang.String f55428xd4f9e3fb = "isPatch";
    private static final java.lang.String TAG = "Tinker.ClassLoaderAdder";

    /* renamed from: sPatchDexCount */
    private static int f55429x5d0751ed;

    /* renamed from: com.tencent.tinker.loader.SystemClassLoaderAdder$ArkHot */
    /* loaded from: classes13.dex */
    public static final class ArkHot {
        private ArkHot() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: install */
        public static void m104466x74ae259b(java.lang.ClassLoader classLoader, java.util.List<java.io.File> list) {
            java.lang.Class<?> loadClass = java.lang.ClassLoader.getSystemClassLoader().getParent().loadClass("com.huawei.ark.classloader.ExtendedClassLoaderHelper");
            java.util.Iterator<java.io.File> it = list.iterator();
            while (it.hasNext()) {
                java.lang.String canonicalPath = it.next().getCanonicalPath();
                java.lang.reflect.Method declaredMethod = loadClass.getDeclaredMethod("applyPatch", java.lang.ClassLoader.class, java.lang.String.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null, classLoader, canonicalPath);
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26599x5da2dc92.TAG, "ArkHot install path = " + canonicalPath, new java.lang.Object[0]);
            }
        }
    }

    /* renamed from: com.tencent.tinker.loader.SystemClassLoaderAdder$V14 */
    /* loaded from: classes13.dex */
    public static final class V14 {
        private V14() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: install */
        public static void m104468x74ae259b(java.lang.ClassLoader classLoader, java.util.List<java.io.File> list, java.io.File file) {
            java.lang.Object obj = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104703x183d66c1(classLoader, "pathList").get(classLoader);
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104699x5d4b2fb9(obj, "dexElements", m104469x277e360(obj, new java.util.ArrayList(list), file));
        }

        /* renamed from: makeDexElements */
        private static java.lang.Object[] m104469x277e360(java.lang.Object obj, java.util.ArrayList<java.io.File> arrayList, java.io.File file) {
            return (java.lang.Object[]) com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104705xfb2fc3fa(obj, "makeDexElements", (java.lang.Class<?>[]) new java.lang.Class[]{java.util.ArrayList.class, java.io.File.class}).invoke(obj, arrayList, file);
        }
    }

    /* renamed from: com.tencent.tinker.loader.SystemClassLoaderAdder$V19 */
    /* loaded from: classes13.dex */
    public static final class V19 {
        private V19() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: install */
        public static void m104472x74ae259b(java.lang.ClassLoader classLoader, java.util.List<java.io.File> list, java.io.File file) {
            java.lang.Object obj = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104703x183d66c1(classLoader, "pathList").get(classLoader);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104699x5d4b2fb9(obj, "dexElements", m104473x277e360(obj, new java.util.ArrayList(list), file, arrayList));
            if (arrayList.size() > 0) {
                java.util.Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    java.io.IOException iOException = (java.io.IOException) it.next();
                    com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.w(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26599x5da2dc92.TAG, "Exception in makeDexElement", iOException);
                    throw iOException;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: makeDexElements */
        public static java.lang.Object[] m104473x277e360(java.lang.Object obj, java.util.ArrayList<java.io.File> arrayList, java.io.File file, java.util.ArrayList<java.io.IOException> arrayList2) {
            java.lang.reflect.Method m104705xfb2fc3fa;
            try {
                m104705xfb2fc3fa = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104705xfb2fc3fa(obj, "makeDexElements", (java.lang.Class<?>[]) new java.lang.Class[]{java.util.ArrayList.class, java.io.File.class, java.util.ArrayList.class});
            } catch (java.lang.NoSuchMethodException unused) {
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26599x5da2dc92.TAG, "NoSuchMethodException: makeDexElements(ArrayList,File,ArrayList) failure", new java.lang.Object[0]);
                try {
                    m104705xfb2fc3fa = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104705xfb2fc3fa(obj, "makeDexElements", (java.lang.Class<?>[]) new java.lang.Class[]{java.util.List.class, java.io.File.class, java.util.List.class});
                } catch (java.lang.NoSuchMethodException e17) {
                    com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26599x5da2dc92.TAG, "NoSuchMethodException: makeDexElements(List,File,List) failure", new java.lang.Object[0]);
                    throw e17;
                }
            }
            return (java.lang.Object[]) m104705xfb2fc3fa.invoke(obj, arrayList, file, arrayList2);
        }
    }

    /* renamed from: com.tencent.tinker.loader.SystemClassLoaderAdder$V23 */
    /* loaded from: classes13.dex */
    public static final class V23 {
        private V23() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: install */
        public static void m104475x74ae259b(java.lang.ClassLoader classLoader, java.util.List<java.io.File> list, java.io.File file) {
            java.lang.Object obj = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104703x183d66c1(classLoader, "pathList").get(classLoader);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104699x5d4b2fb9(obj, "dexElements", m104476x5b3e794a(obj, new java.util.ArrayList(list), file, arrayList));
            if (arrayList.size() > 0) {
                java.util.Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    java.io.IOException iOException = (java.io.IOException) it.next();
                    com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.w(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26599x5da2dc92.TAG, "Exception in makePathElement", iOException);
                    throw iOException;
                }
            }
        }

        /* renamed from: makePathElements */
        private static java.lang.Object[] m104476x5b3e794a(java.lang.Object obj, java.util.ArrayList<java.io.File> arrayList, java.io.File file, java.util.ArrayList<java.io.IOException> arrayList2) {
            java.lang.reflect.Method m104705xfb2fc3fa;
            try {
                m104705xfb2fc3fa = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104705xfb2fc3fa(obj, "makePathElements", (java.lang.Class<?>[]) new java.lang.Class[]{java.util.List.class, java.io.File.class, java.util.List.class});
            } catch (java.lang.NoSuchMethodException unused) {
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26599x5da2dc92.TAG, "NoSuchMethodException: makePathElements(List,File,List) failure", new java.lang.Object[0]);
                try {
                    m104705xfb2fc3fa = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104705xfb2fc3fa(obj, "makePathElements", (java.lang.Class<?>[]) new java.lang.Class[]{java.util.ArrayList.class, java.io.File.class, java.util.ArrayList.class});
                } catch (java.lang.NoSuchMethodException unused2) {
                    com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26599x5da2dc92.TAG, "NoSuchMethodException: makeDexElements(ArrayList,File,ArrayList) failure", new java.lang.Object[0]);
                    try {
                        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26599x5da2dc92.TAG, "NoSuchMethodException: try use v19 instead", new java.lang.Object[0]);
                        return com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26599x5da2dc92.V19.m104473x277e360(obj, arrayList, file, arrayList2);
                    } catch (java.lang.NoSuchMethodException e17) {
                        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26599x5da2dc92.TAG, "NoSuchMethodException: makeDexElements(List,File,List) failure", new java.lang.Object[0]);
                        throw e17;
                    }
                }
            }
            return (java.lang.Object[]) m104705xfb2fc3fa.invoke(obj, arrayList, file, arrayList2);
        }
    }

    /* renamed from: com.tencent.tinker.loader.SystemClassLoaderAdder$V4 */
    /* loaded from: classes13.dex */
    public static final class V4 {
        private V4() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: install */
        public static void m104478x74ae259b(java.lang.ClassLoader classLoader, java.util.List<java.io.File> list, java.io.File file) {
            int size = list.size();
            java.lang.reflect.Field m104703x183d66c1 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104703x183d66c1(classLoader, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder((java.lang.String) m104703x183d66c1.get(classLoader));
            java.lang.String[] strArr = new java.lang.String[size];
            java.io.File[] fileArr = new java.io.File[size];
            java.util.zip.ZipFile[] zipFileArr = new java.util.zip.ZipFile[size];
            dalvik.system.DexFile[] dexFileArr = new dalvik.system.DexFile[size];
            java.util.ListIterator<java.io.File> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                java.io.File next = listIterator.next();
                java.lang.String absolutePath = next.getAbsolutePath();
                sb6.append(':');
                sb6.append(absolutePath);
                int previousIndex = listIterator.previousIndex();
                strArr[previousIndex] = absolutePath;
                fileArr[previousIndex] = next;
                zipFileArr[previousIndex] = new java.util.zip.ZipFile(next);
                dexFileArr[previousIndex] = dalvik.system.DexFile.loadDex(absolutePath, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104689x54ec473d(next, file), 0);
            }
            m104703x183d66c1.set(classLoader, sb6.toString());
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104699x5d4b2fb9(classLoader, "mPaths", strArr);
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104699x5d4b2fb9(classLoader, "mFiles", fileArr);
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104699x5d4b2fb9(classLoader, "mZips", zipFileArr);
            try {
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104699x5d4b2fb9(classLoader, "mDexs", dexFileArr);
            } catch (java.lang.Exception unused) {
            }
        }
    }

    /* renamed from: checkDexInstall */
    private static boolean m104459xbce4d8ac(java.lang.ClassLoader classLoader) {
        java.lang.Class<?> cls = java.lang.Class.forName(f55427xd4d0ec79, true, classLoader);
        boolean booleanValue = ((java.lang.Boolean) com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104702x183d66c1(cls, f55428xd4f9e3fb).get(null)).booleanValue();
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i(TAG, "checkDexInstall result: %s, checker_classloader: %s", java.lang.Boolean.valueOf(booleanValue), cls.getClassLoader());
        return booleanValue;
    }

    /* renamed from: createSortedAdditionalPathEntries */
    private static java.util.List<java.io.File> m104460xa4cb64ab(java.util.List<java.io.File> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        final java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String name = ((java.io.File) it.next()).getName();
            hashMap.put(name, java.lang.Boolean.valueOf(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55630x4296ce58.matcher(name).matches()));
        }
        java.util.Collections.sort(arrayList, new java.util.Comparator<java.io.File>() { // from class: com.tencent.tinker.loader.SystemClassLoaderAdder.1
            @Override // java.util.Comparator
            public int compare(java.io.File file, java.io.File file2) {
                if (file == null && file2 == null) {
                    return 0;
                }
                if (file == null) {
                    return -1;
                }
                if (file2 == null) {
                    return 1;
                }
                java.lang.String name2 = file.getName();
                java.lang.String name3 = file2.getName();
                if (name2.equals(name3)) {
                    return 0;
                }
                if (name2.startsWith(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55726x3eeb7ee0)) {
                    return 1;
                }
                if (name3.startsWith(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55726x3eeb7ee0)) {
                    return -1;
                }
                boolean booleanValue = ((java.lang.Boolean) hashMap.get(name2)).booleanValue();
                boolean booleanValue2 = ((java.lang.Boolean) hashMap.get(name3)).booleanValue();
                if (!booleanValue || !booleanValue2) {
                    if (booleanValue) {
                        return -1;
                    }
                    if (booleanValue2) {
                        return 1;
                    }
                    return name2.compareTo(name3);
                }
                int indexOf = name2.indexOf(46);
                int indexOf2 = name3.indexOf(46);
                int parseInt = indexOf > 7 ? java.lang.Integer.parseInt(name2.substring(7, indexOf)) : 1;
                int parseInt2 = indexOf2 > 7 ? java.lang.Integer.parseInt(name3.substring(7, indexOf2)) : 1;
                if (parseInt == parseInt2) {
                    return 0;
                }
                return parseInt < parseInt2 ? -1 : 1;
            }
        });
        return arrayList;
    }

    /* renamed from: injectDexesInternal */
    public static void m104461x9f7696d1(java.lang.ClassLoader classLoader, java.util.List<java.io.File> list, java.io.File file) {
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26599x5da2dc92.V23.m104475x74ae259b(classLoader, list, file);
    }

    /* renamed from: installApk */
    public static void m104462x35ab3281(dalvik.system.PathClassLoader pathClassLoader, java.util.List<java.io.File> list) {
        if (list.isEmpty()) {
            return;
        }
        java.util.List<java.io.File> m104460xa4cb64ab = m104460xa4cb64ab(list);
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26599x5da2dc92.ArkHot.m104466x74ae259b(pathClassLoader, m104460xa4cb64ab);
        f55429x5d0751ed = m104460xa4cb64ab.size();
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i(TAG, "after loaded classloader: " + pathClassLoader + ", dex size:" + f55429x5d0751ed, new java.lang.Object[0]);
        m104459xbce4d8ac(pathClassLoader);
    }

    /* renamed from: installDexes */
    public static void m104463x77ce1a2a(android.app.Application application, java.lang.ClassLoader classLoader, java.io.File file, java.util.List<java.io.File> list, boolean z17, boolean z18) {
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i(TAG, "installDexes dexOptDir: " + file.getAbsolutePath() + ", dex size:" + list.size(), new java.lang.Object[0]);
        if (list.isEmpty()) {
            return;
        }
        java.util.List<java.io.File> m104460xa4cb64ab = m104460xa4cb64ab(list);
        if (z17) {
            m104461x9f7696d1(classLoader, m104460xa4cb64ab, file);
        } else {
            classLoader = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26598xad6d125f.m104457xb96ca991(application, classLoader, file, z18, m104460xa4cb64ab);
        }
        f55429x5d0751ed = m104460xa4cb64ab.size();
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i(TAG, "after loaded classloader: " + classLoader + ", dex size:" + f55429x5d0751ed, new java.lang.Object[0]);
        if (m104459xbce4d8ac(classLoader)) {
            return;
        }
        m104464xa7a831b1(classLoader);
        throw new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26608x7636b0b6(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55625xd6edb921);
    }

    /* renamed from: uninstallPatchDex */
    public static void m104464xa7a831b1(java.lang.ClassLoader classLoader) {
        if (f55429x5d0751ed <= 0) {
            return;
        }
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104708x72843785(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104703x183d66c1(classLoader, "pathList").get(classLoader), "dexElements", f55429x5d0751ed);
    }
}
