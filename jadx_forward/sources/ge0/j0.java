package ge0;

/* loaded from: classes.dex */
public enum j0 implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f352438d = null;

    static {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("$values", "com.tencent.mm.feature.sns.extension.SnsCoreStorageStatusCallbackProvider");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("$values", "com.tencent.mm.feature.sns.extension.SnsCoreStorageStatusCallbackProvider");
    }

    j0() {
    }

    /* renamed from: valueOf */
    public static ge0.j0 m131320xdce0328(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("valueOf", "com.tencent.mm.feature.sns.extension.SnsCoreStorageStatusCallbackProvider");
        ge0.j0 j0Var = (ge0.j0) java.lang.Enum.valueOf(ge0.j0.class, str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("valueOf", "com.tencent.mm.feature.sns.extension.SnsCoreStorageStatusCallbackProvider");
        return j0Var;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static ge0.j0[] valuesCustom() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("values", "com.tencent.mm.feature.sns.extension.SnsCoreStorageStatusCallbackProvider");
        ge0.j0[] j0VarArr = (ge0.j0[]) values().clone();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("values", "com.tencent.mm.feature.sns.extension.SnsCoreStorageStatusCallbackProvider");
        return j0VarArr;
    }

    @Override // fs.q
    public java.lang.Object get() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("get", "com.tencent.mm.feature.sns.extension.SnsCoreStorageStatusCallbackProvider");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("get", "com.tencent.mm.feature.sns.extension.SnsCoreStorageStatusCallbackProvider");
        java.lang.Object obj = this.f352438d;
        if (obj == null) {
            synchronized (this) {
                try {
                    obj = this.f352438d;
                    if (obj == null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("create", "com.tencent.mm.feature.sns.extension.SnsCoreStorageStatusCallbackProvider");
                        ge0.h0 h0Var = new ge0.h0();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("create", "com.tencent.mm.feature.sns.extension.SnsCoreStorageStatusCallbackProvider");
                        this.f352438d = h0Var;
                        obj = h0Var;
                    }
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("get", "com.tencent.mm.feature.sns.extension.SnsCoreStorageStatusCallbackProvider");
                    throw th6;
                }
            }
        }
        ge0.h0 h0Var2 = (ge0.h0) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("get", "com.tencent.mm.feature.sns.extension.SnsCoreStorageStatusCallbackProvider");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("get", "com.tencent.mm.feature.sns.extension.SnsCoreStorageStatusCallbackProvider");
        return h0Var2;
    }

    @Override // fs.q
    /* renamed from: getQualifierAttribute */
    public java.lang.Object mo209xe96b5b08(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getQualifierAttribute", "com.tencent.mm.feature.sns.extension.SnsCoreStorageStatusCallbackProvider");
        str.getClass();
        char c17 = 65535;
        switch (str.hashCode()) {
            case 1026760592:
                if (str.equals("onProcess")) {
                    c17 = 0;
                    break;
                }
                break;
            case 1028554796:
                if (str.equals("creator")) {
                    c17 = 1;
                    break;
                }
                break;
            case 1063801905:
                if (str.equals("accountAware")) {
                    c17 = 2;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                java.util.List list = ge0.i0.f352434a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getQualifierAttribute", "com.tencent.mm.feature.sns.extension.SnsCoreStorageStatusCallbackProvider");
                return list;
            case 1:
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getQualifierAttribute", "com.tencent.mm.feature.sns.extension.SnsCoreStorageStatusCallbackProvider");
                return java.lang.Void.class;
            case 2:
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getQualifierAttribute", "com.tencent.mm.feature.sns.extension.SnsCoreStorageStatusCallbackProvider");
                return bool;
            default:
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getQualifierAttribute", "com.tencent.mm.feature.sns.extension.SnsCoreStorageStatusCallbackProvider");
                return null;
        }
    }

    @Override // fs.q
    /* renamed from: hasKey */
    public boolean mo210xb7045565(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hasKey", "com.tencent.mm.feature.sns.extension.SnsCoreStorageStatusCallbackProvider");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasKey", "com.tencent.mm.feature.sns.extension.SnsCoreStorageStatusCallbackProvider");
        return false;
    }

    @Override // fs.q
    /* renamed from: hasNoKeys */
    public boolean mo211xe6e58a8f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hasNoKeys", "com.tencent.mm.feature.sns.extension.SnsCoreStorageStatusCallbackProvider");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasNoKeys", "com.tencent.mm.feature.sns.extension.SnsCoreStorageStatusCallbackProvider");
        return true;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.feature.sns.extension.SnsCoreStorageStatusCallbackProvider");
        java.lang.String concat = "provider ".concat(ge0.h0.class.getName());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.feature.sns.extension.SnsCoreStorageStatusCallbackProvider");
        return concat;
    }
}
