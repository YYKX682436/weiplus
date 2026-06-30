package ta4;

/* loaded from: classes7.dex */
public enum o implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f498341d = null;

    static {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("$values", "com.tencent.mm.plugin.sns.report.ShareSnsEndListenerProvider");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("$values", "com.tencent.mm.plugin.sns.report.ShareSnsEndListenerProvider");
    }

    o() {
    }

    /* renamed from: valueOf */
    public static ta4.o m166080xdce0328(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("valueOf", "com.tencent.mm.plugin.sns.report.ShareSnsEndListenerProvider");
        ta4.o oVar = (ta4.o) java.lang.Enum.valueOf(ta4.o.class, str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("valueOf", "com.tencent.mm.plugin.sns.report.ShareSnsEndListenerProvider");
        return oVar;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static ta4.o[] valuesCustom() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("values", "com.tencent.mm.plugin.sns.report.ShareSnsEndListenerProvider");
        ta4.o[] oVarArr = (ta4.o[]) values().clone();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("values", "com.tencent.mm.plugin.sns.report.ShareSnsEndListenerProvider");
        return oVarArr;
    }

    @Override // fs.q
    public java.lang.Object get() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("get", "com.tencent.mm.plugin.sns.report.ShareSnsEndListenerProvider");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("get", "com.tencent.mm.plugin.sns.report.ShareSnsEndListenerProvider");
        java.lang.Object obj = this.f498341d;
        if (obj == null) {
            synchronized (this) {
                try {
                    obj = this.f498341d;
                    if (obj == null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("create", "com.tencent.mm.plugin.sns.report.ShareSnsEndListenerProvider");
                        ta4.m mVar = new ta4.m();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("create", "com.tencent.mm.plugin.sns.report.ShareSnsEndListenerProvider");
                        this.f498341d = mVar;
                        obj = mVar;
                    }
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("get", "com.tencent.mm.plugin.sns.report.ShareSnsEndListenerProvider");
                    throw th6;
                }
            }
        }
        ta4.m mVar2 = (ta4.m) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("get", "com.tencent.mm.plugin.sns.report.ShareSnsEndListenerProvider");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("get", "com.tencent.mm.plugin.sns.report.ShareSnsEndListenerProvider");
        return mVar2;
    }

    @Override // fs.q
    /* renamed from: getQualifierAttribute */
    public java.lang.Object mo209xe96b5b08(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getQualifierAttribute", "com.tencent.mm.plugin.sns.report.ShareSnsEndListenerProvider");
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
                java.util.List list = ta4.n.f498337a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getQualifierAttribute", "com.tencent.mm.plugin.sns.report.ShareSnsEndListenerProvider");
                return list;
            case 1:
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getQualifierAttribute", "com.tencent.mm.plugin.sns.report.ShareSnsEndListenerProvider");
                return java.lang.Void.class;
            case 2:
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getQualifierAttribute", "com.tencent.mm.plugin.sns.report.ShareSnsEndListenerProvider");
                return bool;
            default:
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getQualifierAttribute", "com.tencent.mm.plugin.sns.report.ShareSnsEndListenerProvider");
                return null;
        }
    }

    @Override // fs.q
    /* renamed from: hasKey */
    public boolean mo210xb7045565(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hasKey", "com.tencent.mm.plugin.sns.report.ShareSnsEndListenerProvider");
        if (java.util.Objects.equals(obj, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6014xd52b9d6c.class)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasKey", "com.tencent.mm.plugin.sns.report.ShareSnsEndListenerProvider");
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasKey", "com.tencent.mm.plugin.sns.report.ShareSnsEndListenerProvider");
        return false;
    }

    @Override // fs.q
    /* renamed from: hasNoKeys */
    public boolean mo211xe6e58a8f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hasNoKeys", "com.tencent.mm.plugin.sns.report.ShareSnsEndListenerProvider");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasNoKeys", "com.tencent.mm.plugin.sns.report.ShareSnsEndListenerProvider");
        return false;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.report.ShareSnsEndListenerProvider");
        java.lang.String concat = "provider ".concat(ta4.m.class.getName());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.report.ShareSnsEndListenerProvider");
        return concat;
    }
}
