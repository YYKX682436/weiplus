package cy5;

/* loaded from: classes13.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f306421a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f306422b = false;

    public static void a(int i17) {
        java.lang.String str;
        java.lang.String o17;
        if (!f306422b) {
            by5.c4.c("XWalkPluginManager", "checkKeyFiles error, not init");
            return;
        }
        java.util.Map map = f306421a;
        if (((java.util.HashMap) map).size() == 0) {
            by5.c4.c("XWalkPluginManager", "checkFilesSimple error, sPluginMap size is 0");
            return;
        }
        java.util.Iterator it = ((java.util.HashMap) map).entrySet().iterator();
        while (it.hasNext()) {
            cy5.h hVar = (cy5.h) ((java.util.Map.Entry) it.next()).getValue();
            int f17 = hVar.f(true);
            if (f17 > 0) {
                java.util.List j17 = hVar.j(f17);
                if (j17 == null) {
                    xx5.b.a(i17, hVar.m(), f17, 7, "keyFilesList");
                } else {
                    for (int i18 = 0; i18 < j17.size(); i18++) {
                        if (j17.get(i18) != null) {
                            java.io.File file = new java.io.File((java.lang.String) j17.get(i18));
                            if (!file.exists() || !file.isFile()) {
                                by5.c4.c(hVar.m(), "apk file in version = (" + f17 + ") missed");
                                if (j17.get(i18) != null && !((java.lang.String) j17.get(i18)).isEmpty()) {
                                    java.lang.String[] split = ((java.lang.String) j17.get(i18)).split(java.io.File.separator);
                                    if (split.length > 0) {
                                        str = split[split.length - 1];
                                        xx5.b.a(i17, hVar.m(), f17, 2, str);
                                        hVar.u(-1, true);
                                        o17 = hVar.o(f17);
                                        if (o17 != null && !o17.isEmpty()) {
                                            by5.u.h(o17);
                                        }
                                    }
                                }
                                str = "";
                                xx5.b.a(i17, hVar.m(), f17, 2, str);
                                hVar.u(-1, true);
                                o17 = hVar.o(f17);
                                if (o17 != null) {
                                    by5.u.h(o17);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static java.util.List b() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!f306422b) {
            by5.c4.c("XWalkPluginManager", "getAllPlugins error, not init");
            return arrayList;
        }
        java.util.Iterator it = ((java.util.HashMap) f306421a).entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((cy5.h) ((java.util.Map.Entry) it.next()).getValue());
        }
        return arrayList;
    }

    public static java.util.Map c(android.content.Context context) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61206xd3e8e450, java.lang.Integer.valueOf(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.j(context, com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61206xd3e8e450)));
        hashMap.put(com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61208xfb9a50aa, java.lang.Integer.valueOf(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.j(context, com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61208xfb9a50aa)));
        hashMap.put(com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61209xfb9a522c, java.lang.Integer.valueOf(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.j(context, com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61209xfb9a522c)));
        hashMap.put(com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61211x77b31e32, java.lang.Integer.valueOf(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.j(context, com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61211x77b31e32)));
        hashMap.put(com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61205x7db6e06f, java.lang.Integer.valueOf(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.j(context, com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61205x7db6e06f)));
        hashMap.put(com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61207x493967e4, java.lang.Integer.valueOf(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.j(context, com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61207x493967e4)));
        hashMap.put(com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61210xfb9a6228, java.lang.Integer.valueOf(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.j(context, com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61210xfb9a6228)));
        return hashMap;
    }

    public static cy5.h d(java.lang.String str) {
        if (!f306422b) {
            by5.c4.c("XWalkPluginManager", "getPlugin error, not init");
            return null;
        }
        if (str == null || str.isEmpty()) {
            return null;
        }
        return (cy5.h) ((java.util.HashMap) f306421a).get(str);
    }

    public static cy5.l e(java.io.File file) {
        if (file == null) {
            by5.c4.c("XWalkPluginManager", "getPluginInfoFromDir, dirFile is null");
            return null;
        }
        if (!file.exists() || !file.isDirectory()) {
            by5.c4.c("XWalkPluginManager", "getPluginInfoFromDir, dirFile is invalid");
            return null;
        }
        java.lang.String name = file.getName();
        int lastIndexOf = name.lastIndexOf(95);
        if (lastIndexOf < 0 || lastIndexOf >= name.length() - 1) {
            by5.c4.c("XWalkPluginManager", "getPluginInfoFromDir, can not find _");
            return null;
        }
        try {
            return new cy5.l(name.substring(0, lastIndexOf), java.lang.Integer.parseInt(name.substring(lastIndexOf + 1)));
        } catch (java.lang.Throwable th6) {
            by5.c4.c("XWalkPluginManager", "getPluginInfoFromDir, error: " + th6);
            return null;
        }
    }

    public static synchronized boolean f() {
        synchronized (cy5.m.class) {
            if (!f306422b) {
                by5.c4.f("XWalkPluginManager", "initPlugins");
                cy5.d dVar = new cy5.d();
                java.util.Map map = f306421a;
                ((java.util.HashMap) map).put(com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61206xd3e8e450, dVar);
                ((java.util.HashMap) map).put(com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61208xfb9a50aa, new cy5.f());
                ((java.util.HashMap) map).put(com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61209xfb9a522c, new cy5.g());
                ((java.util.HashMap) map).put(com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61211x77b31e32, new cy5.a0());
                ((java.util.HashMap) map).put(com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61205x7db6e06f, new cy5.c());
                ((java.util.HashMap) map).put(com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61207x493967e4, new cy5.e());
                ((java.util.HashMap) map).put(com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61210xfb9a6228, new cy5.z());
                f306422b = true;
                try {
                    by5.c4.f("XWalkPluginManager", "initEmbedPluginInfo, no embed or embed failed, return");
                } catch (java.lang.Throwable th6) {
                    by5.c4.d("XWalkPluginManager", "initEmbedPluginInfo error", th6);
                }
            }
            yu5.c.a(new cy5.k());
        }
        return true;
    }
}
