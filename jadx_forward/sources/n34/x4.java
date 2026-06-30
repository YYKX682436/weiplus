package n34;

/* loaded from: classes.dex */
public enum x4 implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f416313d = null;

    static {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("$values", "com.tencent.mm.plugin.sns.TimeLineHelperServiceProvider");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("$values", "com.tencent.mm.plugin.sns.TimeLineHelperServiceProvider");
    }

    x4() {
    }

    /* renamed from: valueOf */
    public static n34.x4 m149063xdce0328(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("valueOf", "com.tencent.mm.plugin.sns.TimeLineHelperServiceProvider");
        n34.x4 x4Var = (n34.x4) java.lang.Enum.valueOf(n34.x4.class, str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("valueOf", "com.tencent.mm.plugin.sns.TimeLineHelperServiceProvider");
        return x4Var;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static n34.x4[] valuesCustom() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("values", "com.tencent.mm.plugin.sns.TimeLineHelperServiceProvider");
        n34.x4[] x4VarArr = (n34.x4[]) values().clone();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("values", "com.tencent.mm.plugin.sns.TimeLineHelperServiceProvider");
        return x4VarArr;
    }

    @Override // fs.q
    public java.lang.Object get() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("get", "com.tencent.mm.plugin.sns.TimeLineHelperServiceProvider");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("get", "com.tencent.mm.plugin.sns.TimeLineHelperServiceProvider");
        java.lang.Object obj = this.f416313d;
        if (obj == null) {
            synchronized (this) {
                try {
                    obj = this.f416313d;
                    if (obj == null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("create", "com.tencent.mm.plugin.sns.TimeLineHelperServiceProvider");
                        n34.v4 v4Var = new n34.v4();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("create", "com.tencent.mm.plugin.sns.TimeLineHelperServiceProvider");
                        this.f416313d = v4Var;
                        obj = v4Var;
                    }
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("get", "com.tencent.mm.plugin.sns.TimeLineHelperServiceProvider");
                    throw th6;
                }
            }
        }
        n34.v4 v4Var2 = (n34.v4) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("get", "com.tencent.mm.plugin.sns.TimeLineHelperServiceProvider");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("get", "com.tencent.mm.plugin.sns.TimeLineHelperServiceProvider");
        return v4Var2;
    }

    @Override // fs.q
    /* renamed from: getQualifierAttribute */
    public java.lang.Object mo209xe96b5b08(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getQualifierAttribute", "com.tencent.mm.plugin.sns.TimeLineHelperServiceProvider");
        str.getClass();
        char c17 = 65535;
        switch (str.hashCode()) {
            case 503774505:
                if (str.equals("dependencies")) {
                    c17 = 0;
                    break;
                }
                break;
            case 1026760592:
                if (str.equals("onProcess")) {
                    c17 = 1;
                    break;
                }
                break;
            case 1028554796:
                if (str.equals("creator")) {
                    c17 = 2;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                java.util.List list = java.util.Collections.EMPTY_LIST;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getQualifierAttribute", "com.tencent.mm.plugin.sns.TimeLineHelperServiceProvider");
                return list;
            case 1:
                java.util.List list2 = n34.w4.f416306a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getQualifierAttribute", "com.tencent.mm.plugin.sns.TimeLineHelperServiceProvider");
                return list2;
            case 2:
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getQualifierAttribute", "com.tencent.mm.plugin.sns.TimeLineHelperServiceProvider");
                return java.lang.Void.class;
            default:
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getQualifierAttribute", "com.tencent.mm.plugin.sns.TimeLineHelperServiceProvider");
                return null;
        }
    }

    @Override // fs.q
    /* renamed from: hasKey */
    public boolean mo210xb7045565(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hasKey", "com.tencent.mm.plugin.sns.TimeLineHelperServiceProvider");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasKey", "com.tencent.mm.plugin.sns.TimeLineHelperServiceProvider");
        return false;
    }

    @Override // fs.q
    /* renamed from: hasNoKeys */
    public boolean mo211xe6e58a8f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hasNoKeys", "com.tencent.mm.plugin.sns.TimeLineHelperServiceProvider");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasNoKeys", "com.tencent.mm.plugin.sns.TimeLineHelperServiceProvider");
        return true;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.TimeLineHelperServiceProvider");
        java.lang.String concat = "provider ".concat(n34.v4.class.getName());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.TimeLineHelperServiceProvider");
        return concat;
    }
}
