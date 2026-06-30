package ov5;

/* loaded from: classes12.dex */
public abstract class b {
    public static void a(java.lang.ClassLoader classLoader, java.io.File file) {
        java.lang.Object obj = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104703x183d66c1(classLoader, "pathList").get(classLoader);
        java.util.List list = (java.util.List) com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104703x183d66c1(obj, "nativeLibraryDirectories").get(obj);
        if (list == null) {
            list = new java.util.ArrayList(2);
        }
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (file.equals((java.io.File) it.next())) {
                it.remove();
                break;
            }
        }
        list.add(0, file);
        java.util.List list2 = (java.util.List) com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104703x183d66c1(obj, "systemNativeLibraryDirectories").get(obj);
        if (list2 == null) {
            list2 = new java.util.ArrayList(2);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size() + list2.size() + 1);
        arrayList.addAll(list);
        arrayList.addAll(list2);
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104703x183d66c1(obj, "nativeLibraryPathElements").set(obj, (java.lang.Object[]) com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104705xfb2fc3fa(obj, "makePathElements", (java.lang.Class<?>[]) new java.lang.Class[]{java.util.List.class}).invoke(obj, arrayList));
    }
}
