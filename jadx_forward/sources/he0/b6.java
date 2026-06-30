package he0;

/* loaded from: classes7.dex */
public enum b6 implements fs.q {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f362206d = null;

    static {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("$values", "com.tencent.mm.feature.sns.listener.SnsPermissionNotifyListenerProvider");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("$values", "com.tencent.mm.feature.sns.listener.SnsPermissionNotifyListenerProvider");
    }

    b6() {
    }

    /* renamed from: valueOf */
    public static he0.b6 m133252xdce0328(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("valueOf", "com.tencent.mm.feature.sns.listener.SnsPermissionNotifyListenerProvider");
        he0.b6 b6Var = (he0.b6) java.lang.Enum.valueOf(he0.b6.class, str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("valueOf", "com.tencent.mm.feature.sns.listener.SnsPermissionNotifyListenerProvider");
        return b6Var;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static he0.b6[] valuesCustom() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("values", "com.tencent.mm.feature.sns.listener.SnsPermissionNotifyListenerProvider");
        he0.b6[] b6VarArr = (he0.b6[]) values().clone();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("values", "com.tencent.mm.feature.sns.listener.SnsPermissionNotifyListenerProvider");
        return b6VarArr;
    }

    @Override // fs.q
    public java.lang.Object get() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("get", "com.tencent.mm.feature.sns.listener.SnsPermissionNotifyListenerProvider");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("get", "com.tencent.mm.feature.sns.listener.SnsPermissionNotifyListenerProvider");
        java.lang.Object obj = this.f362206d;
        if (obj == null) {
            synchronized (this) {
                try {
                    obj = this.f362206d;
                    if (obj == null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("create", "com.tencent.mm.feature.sns.listener.SnsPermissionNotifyListenerProvider");
                        he0.a6 a6Var = new he0.a6();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("create", "com.tencent.mm.feature.sns.listener.SnsPermissionNotifyListenerProvider");
                        this.f362206d = a6Var;
                        obj = a6Var;
                    }
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("get", "com.tencent.mm.feature.sns.listener.SnsPermissionNotifyListenerProvider");
                    throw th6;
                }
            }
        }
        he0.a6 a6Var2 = (he0.a6) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("get", "com.tencent.mm.feature.sns.listener.SnsPermissionNotifyListenerProvider");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("get", "com.tencent.mm.feature.sns.listener.SnsPermissionNotifyListenerProvider");
        return a6Var2;
    }

    @Override // fs.q
    /* renamed from: getQualifierAttribute */
    public java.lang.Object mo209xe96b5b08(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getQualifierAttribute", "com.tencent.mm.feature.sns.listener.SnsPermissionNotifyListenerProvider");
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
                java.util.List list = java.util.Collections.EMPTY_LIST;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getQualifierAttribute", "com.tencent.mm.feature.sns.listener.SnsPermissionNotifyListenerProvider");
                return list;
            case 1:
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getQualifierAttribute", "com.tencent.mm.feature.sns.listener.SnsPermissionNotifyListenerProvider");
                return java.lang.Void.class;
            case 2:
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getQualifierAttribute", "com.tencent.mm.feature.sns.listener.SnsPermissionNotifyListenerProvider");
                return bool;
            default:
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getQualifierAttribute", "com.tencent.mm.feature.sns.listener.SnsPermissionNotifyListenerProvider");
                return null;
        }
    }

    @Override // fs.q
    /* renamed from: hasKey */
    public boolean mo210xb7045565(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hasKey", "com.tencent.mm.feature.sns.listener.SnsPermissionNotifyListenerProvider");
        if (java.util.Objects.equals(obj, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6082xbd84dd0a.class)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasKey", "com.tencent.mm.feature.sns.listener.SnsPermissionNotifyListenerProvider");
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasKey", "com.tencent.mm.feature.sns.listener.SnsPermissionNotifyListenerProvider");
        return false;
    }

    @Override // fs.q
    /* renamed from: hasNoKeys */
    public boolean mo211xe6e58a8f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hasNoKeys", "com.tencent.mm.feature.sns.listener.SnsPermissionNotifyListenerProvider");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasNoKeys", "com.tencent.mm.feature.sns.listener.SnsPermissionNotifyListenerProvider");
        return false;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.feature.sns.listener.SnsPermissionNotifyListenerProvider");
        java.lang.String concat = "provider ".concat(he0.a6.class.getName());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.feature.sns.listener.SnsPermissionNotifyListenerProvider");
        return concat;
    }
}
