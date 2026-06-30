package io.p3284xd2ae381c.p3310xe3a677a0.p3317x1228f173;

/* renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin */
/* loaded from: classes8.dex */
public class C28779x889a4246 implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, io.p3284xd2ae381c.p3310xe3a677a0.p3317x1228f173.C28769xe84f656c.SharedPreferencesApi {

    /* renamed from: BIG_INTEGER_PREFIX */
    private static final java.lang.String f71974x7d8eca12 = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy";

    /* renamed from: DOUBLE_PREFIX */
    private static final java.lang.String f71975x5817f6c0 = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu";

    /* renamed from: LIST_IDENTIFIER */
    private static final java.lang.String f71976xed7856ea = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu";

    /* renamed from: SHARED_PREFERENCES_NAME */
    private static final java.lang.String f71977x952b82c = "FlutterSharedPreferences";
    private static final java.lang.String TAG = "SharedPreferencesPlugin";

    /* renamed from: listEncoder */
    private io.p3284xd2ae381c.p3310xe3a677a0.p3317x1228f173.InterfaceC28778x61b03f6b f71978xb2cb1e9e;

    /* renamed from: preferences */
    private android.content.SharedPreferences f71979x769adef8;

    /* renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$ListEncoder */
    /* loaded from: classes4.dex */
    public static class ListEncoder implements io.p3284xd2ae381c.p3310xe3a677a0.p3317x1228f173.InterfaceC28778x61b03f6b {
        @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3317x1228f173.InterfaceC28778x61b03f6b
        /* renamed from: decode */
        public java.util.List<java.lang.String> mo138934xb06291ee(java.lang.String str) {
            try {
                return (java.util.List) new java.io.ObjectInputStream(new java.io.ByteArrayInputStream(android.util.Base64.decode(str, 0))).readObject();
            } catch (java.io.IOException | java.lang.ClassNotFoundException e17) {
                throw new java.lang.RuntimeException(e17);
            }
        }

        @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3317x1228f173.InterfaceC28778x61b03f6b
        /* renamed from: encode */
        public java.lang.String mo138935xb2963e16(java.util.List<java.lang.String> list) {
            try {
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                java.io.ObjectOutputStream objectOutputStream = new java.io.ObjectOutputStream(byteArrayOutputStream);
                objectOutputStream.writeObject(list);
                objectOutputStream.flush();
                return android.util.Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
            } catch (java.io.IOException e17) {
                throw new java.lang.RuntimeException(e17);
            }
        }
    }

    public C28779x889a4246() {
        this(new io.p3284xd2ae381c.p3310xe3a677a0.p3317x1228f173.C28779x889a4246.ListEncoder());
    }

    /* renamed from: getAllPrefs */
    private java.util.Map<java.lang.String, java.lang.Object> m138936xe6355305(java.lang.String str, java.util.Set<java.lang.String> set) {
        java.util.Map<java.lang.String, ?> all = this.f71979x769adef8.getAll();
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.lang.String str2 : all.keySet()) {
            if (str2.startsWith(str) && (set == null || set.contains(str2))) {
                hashMap.put(str2, m138938x99a8ebaf(str2, all.get(str2)));
            }
        }
        return hashMap;
    }

    /* renamed from: setUp */
    private void m138937x684369d(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, android.content.Context context) {
        this.f71979x769adef8 = context.getSharedPreferences(f71977x952b82c, 0);
        try {
            io.p3284xd2ae381c.p3310xe3a677a0.p3317x1228f173.C28769xe84f656c.SharedPreferencesApi.m138925x6843a7d(interfaceC28679x1b8c77f2, this);
        } catch (java.lang.Exception unused) {
        }
    }

    /* renamed from: transformPref */
    private java.lang.Object m138938x99a8ebaf(java.lang.String str, java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            java.lang.String str2 = (java.lang.String) obj;
            if (str2.startsWith(f71976xed7856ea)) {
                return this.f71978xb2cb1e9e.mo138934xb06291ee(str2.substring(40));
            }
            if (str2.startsWith(f71974x7d8eca12)) {
                return new java.math.BigInteger(str2.substring(44), 36);
            }
            if (str2.startsWith(f71975x5817f6c0)) {
                return java.lang.Double.valueOf(str2.substring(40));
            }
        } else if (obj instanceof java.util.Set) {
            java.util.ArrayList arrayList = new java.util.ArrayList((java.util.Set) obj);
            this.f71979x769adef8.edit().remove(str).putString(str, f71976xed7856ea + this.f71978xb2cb1e9e.mo138935xb2963e16(arrayList)).apply();
            return arrayList;
        }
        return obj;
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3317x1228f173.C28769xe84f656c.SharedPreferencesApi
    /* renamed from: clear */
    public java.lang.Boolean mo138926x5a5b64d(java.lang.String str, java.util.List<java.lang.String> list) {
        android.content.SharedPreferences.Editor edit = this.f71979x769adef8.edit();
        java.util.Map<java.lang.String, ?> all = this.f71979x769adef8.getAll();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str2 : all.keySet()) {
            if (str2.startsWith(str) && (list == null || list.contains(str2))) {
                arrayList.add(str2);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            edit.remove((java.lang.String) it.next());
        }
        return java.lang.Boolean.valueOf(edit.commit());
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3317x1228f173.C28769xe84f656c.SharedPreferencesApi
    /* renamed from: getAll */
    public java.util.Map<java.lang.String, java.lang.Object> mo138927xb5882a6b(java.lang.String str, java.util.List<java.lang.String> list) {
        return m138936xe6355305(str, list == null ? null : new java.util.HashSet(list));
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding flutterPluginBinding) {
        m138937x684369d(flutterPluginBinding.m137983x3b5b91dc(), flutterPluginBinding.m137982x6e669035());
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding flutterPluginBinding) {
        io.p3284xd2ae381c.p3310xe3a677a0.p3317x1228f173.C28769xe84f656c.SharedPreferencesApi.m138925x6843a7d(flutterPluginBinding.m137983x3b5b91dc(), null);
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3317x1228f173.C28769xe84f656c.SharedPreferencesApi
    /* renamed from: remove */
    public java.lang.Boolean mo138928xc84af884(java.lang.String str) {
        return java.lang.Boolean.valueOf(this.f71979x769adef8.edit().remove(str).commit());
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3317x1228f173.C28769xe84f656c.SharedPreferencesApi
    /* renamed from: setBool */
    public java.lang.Boolean mo138929x76486a6c(java.lang.String str, java.lang.Boolean bool) {
        return java.lang.Boolean.valueOf(this.f71979x769adef8.edit().putBoolean(str, bool.booleanValue()).commit());
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3317x1228f173.C28769xe84f656c.SharedPreferencesApi
    /* renamed from: setDouble */
    public java.lang.Boolean mo138930x943d2d3(java.lang.String str, java.lang.Double d17) {
        java.lang.String d18 = java.lang.Double.toString(d17.doubleValue());
        return java.lang.Boolean.valueOf(this.f71979x769adef8.edit().putString(str, f71975x5817f6c0 + d18).commit());
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3317x1228f173.C28769xe84f656c.SharedPreferencesApi
    /* renamed from: setInt */
    public java.lang.Boolean mo138931xca02702d(java.lang.String str, java.lang.Long l17) {
        return java.lang.Boolean.valueOf(this.f71979x769adef8.edit().putLong(str, l17.longValue()).commit());
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3317x1228f173.C28769xe84f656c.SharedPreferencesApi
    /* renamed from: setString */
    public java.lang.Boolean mo138932x2321b713(java.lang.String str, java.lang.String str2) {
        if (str2.startsWith(f71976xed7856ea) || str2.startsWith(f71974x7d8eca12) || str2.startsWith(f71975x5817f6c0)) {
            throw new java.lang.RuntimeException("StorageError: This string cannot be stored as it clashes with special identifier prefixes");
        }
        return java.lang.Boolean.valueOf(this.f71979x769adef8.edit().putString(str, str2).commit());
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3317x1228f173.C28769xe84f656c.SharedPreferencesApi
    /* renamed from: setStringList */
    public java.lang.Boolean mo138933xbe9e1a51(java.lang.String str, java.util.List<java.lang.String> list) {
        return java.lang.Boolean.valueOf(this.f71979x769adef8.edit().putString(str, f71976xed7856ea + this.f71978xb2cb1e9e.mo138935xb2963e16(list)).commit());
    }

    public C28779x889a4246(io.p3284xd2ae381c.p3310xe3a677a0.p3317x1228f173.InterfaceC28778x61b03f6b interfaceC28778x61b03f6b) {
        this.f71978xb2cb1e9e = interfaceC28778x61b03f6b;
    }
}
