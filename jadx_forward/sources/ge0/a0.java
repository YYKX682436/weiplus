package ge0;

/* loaded from: classes4.dex */
public enum a0 implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f352417d = null;

    static {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("$values", "com.tencent.mm.feature.sns.extension.SnsAppForegroundListenerProvider");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("$values", "com.tencent.mm.feature.sns.extension.SnsAppForegroundListenerProvider");
    }

    a0() {
    }

    /* renamed from: valueOf */
    public static ge0.a0 m131304xdce0328(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("valueOf", "com.tencent.mm.feature.sns.extension.SnsAppForegroundListenerProvider");
        ge0.a0 a0Var = (ge0.a0) java.lang.Enum.valueOf(ge0.a0.class, str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("valueOf", "com.tencent.mm.feature.sns.extension.SnsAppForegroundListenerProvider");
        return a0Var;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static ge0.a0[] valuesCustom() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("values", "com.tencent.mm.feature.sns.extension.SnsAppForegroundListenerProvider");
        ge0.a0[] a0VarArr = (ge0.a0[]) values().clone();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("values", "com.tencent.mm.feature.sns.extension.SnsAppForegroundListenerProvider");
        return a0VarArr;
    }

    @Override // fs.q
    public java.lang.Object get() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("get", "com.tencent.mm.feature.sns.extension.SnsAppForegroundListenerProvider");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("get", "com.tencent.mm.feature.sns.extension.SnsAppForegroundListenerProvider");
        java.lang.Object obj = this.f352417d;
        if (obj == null) {
            synchronized (this) {
                try {
                    obj = this.f352417d;
                    if (obj == null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("create", "com.tencent.mm.feature.sns.extension.SnsAppForegroundListenerProvider");
                        ge0.y yVar = new ge0.y();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("create", "com.tencent.mm.feature.sns.extension.SnsAppForegroundListenerProvider");
                        this.f352417d = yVar;
                        obj = yVar;
                    }
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("get", "com.tencent.mm.feature.sns.extension.SnsAppForegroundListenerProvider");
                    throw th6;
                }
            }
        }
        ge0.y yVar2 = (ge0.y) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("get", "com.tencent.mm.feature.sns.extension.SnsAppForegroundListenerProvider");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("get", "com.tencent.mm.feature.sns.extension.SnsAppForegroundListenerProvider");
        return yVar2;
    }

    @Override // fs.q
    /* renamed from: getQualifierAttribute */
    public java.lang.Object mo209xe96b5b08(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getQualifierAttribute", "com.tencent.mm.feature.sns.extension.SnsAppForegroundListenerProvider");
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
                java.util.List list = ge0.z.f352456a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getQualifierAttribute", "com.tencent.mm.feature.sns.extension.SnsAppForegroundListenerProvider");
                return list;
            case 1:
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getQualifierAttribute", "com.tencent.mm.feature.sns.extension.SnsAppForegroundListenerProvider");
                return java.lang.Void.class;
            case 2:
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getQualifierAttribute", "com.tencent.mm.feature.sns.extension.SnsAppForegroundListenerProvider");
                return bool;
            default:
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getQualifierAttribute", "com.tencent.mm.feature.sns.extension.SnsAppForegroundListenerProvider");
                return null;
        }
    }

    @Override // fs.q
    /* renamed from: hasKey */
    public boolean mo210xb7045565(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hasKey", "com.tencent.mm.feature.sns.extension.SnsAppForegroundListenerProvider");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasKey", "com.tencent.mm.feature.sns.extension.SnsAppForegroundListenerProvider");
        return false;
    }

    @Override // fs.q
    /* renamed from: hasNoKeys */
    public boolean mo211xe6e58a8f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hasNoKeys", "com.tencent.mm.feature.sns.extension.SnsAppForegroundListenerProvider");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasNoKeys", "com.tencent.mm.feature.sns.extension.SnsAppForegroundListenerProvider");
        return true;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.feature.sns.extension.SnsAppForegroundListenerProvider");
        java.lang.String concat = "provider ".concat(ge0.y.class.getName());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.feature.sns.extension.SnsAppForegroundListenerProvider");
        return concat;
    }
}
