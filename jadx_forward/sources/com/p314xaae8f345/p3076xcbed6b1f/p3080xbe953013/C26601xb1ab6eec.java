package com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013;

/* renamed from: com.tencent.tinker.loader.TinkerClassLoader */
/* loaded from: classes13.dex */
public final class C26601xb1ab6eec extends dalvik.system.PathClassLoader {

    /* renamed from: mOriginAppClassLoader */
    private final java.lang.ClassLoader f55435xdde8c79d;

    /* renamed from: com.tencent.tinker.loader.TinkerClassLoader$CompoundEnumeration */
    /* loaded from: classes13.dex */
    public class CompoundEnumeration<E> implements java.util.Enumeration<E> {

        /* renamed from: enums */
        private java.util.Enumeration<E>[] f55436x5c30b92;

        /* renamed from: index */
        private int f55437x5fb28d2 = 0;

        public CompoundEnumeration(java.util.Enumeration<E>[] enumerationArr) {
            this.f55436x5c30b92 = enumerationArr;
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            while (true) {
                int i17 = this.f55437x5fb28d2;
                java.util.Enumeration<E>[] enumerationArr = this.f55436x5c30b92;
                if (i17 >= enumerationArr.length) {
                    return false;
                }
                java.util.Enumeration<E> enumeration = enumerationArr[i17];
                if (enumeration != null && enumeration.hasMoreElements()) {
                    return true;
                }
                this.f55437x5fb28d2++;
            }
        }

        @Override // java.util.Enumeration
        public E nextElement() {
            if (hasMoreElements()) {
                return this.f55436x5c30b92[this.f55437x5fb28d2].nextElement();
            }
            throw new java.util.NoSuchElementException();
        }
    }

    public C26601xb1ab6eec(java.lang.String str, java.io.File file, java.lang.String str2, java.lang.ClassLoader classLoader) {
        super("", str2, java.lang.ClassLoader.getSystemClassLoader());
        this.f55435xdde8c79d = classLoader;
        m104482x527fb20b(this, str, file);
    }

    /* renamed from: injectDexPath */
    private static void m104482x527fb20b(java.lang.ClassLoader classLoader, java.lang.String str, java.io.File file) {
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList(16);
            for (java.lang.String str2 : str.split(":")) {
                if (!str2.isEmpty()) {
                    arrayList.add(new java.io.File(str2));
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26599x5da2dc92.m104461x9f7696d1(classLoader, arrayList, file);
        } catch (java.lang.Throwable th6) {
            throw new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26608x7636b0b6("Fail to create TinkerClassLoader.", th6);
        }
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public java.lang.Class<?> findClass(java.lang.String str) {
        java.lang.Class<?> cls;
        try {
            cls = super.findClass(str);
        } catch (java.lang.ClassNotFoundException unused) {
            cls = null;
        }
        return cls != null ? cls : this.f55435xdde8c79d.loadClass(str);
    }

    @Override // java.lang.ClassLoader
    public java.net.URL getResource(java.lang.String str) {
        java.net.URL resource = java.lang.Object.class.getClassLoader().getResource(str);
        if (resource != null) {
            return resource;
        }
        java.net.URL findResource = findResource(str);
        return findResource != null ? findResource : this.f55435xdde8c79d.getResource(str);
    }

    @Override // java.lang.ClassLoader
    public java.util.Enumeration<java.net.URL> getResources(java.lang.String str) {
        return new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26601xb1ab6eec.CompoundEnumeration(new java.util.Enumeration[]{java.lang.Object.class.getClassLoader().getResources(str), findResources(str), this.f55435xdde8c79d.getResources(str)});
    }
}
