package vb4;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f516326a = new java.util.LinkedHashMap();

    public static final boolean a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isBusy", "com.tencent.mm.plugin.sns.ui.animation.ItemBusyManager");
        java.util.Map map = f516326a;
        if (str == null) {
            str = "";
        }
        java.lang.Boolean bool = (java.lang.Boolean) ((java.util.LinkedHashMap) map).get(str);
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isBusy", "com.tencent.mm.plugin.sns.ui.animation.ItemBusyManager");
        return booleanValue;
    }

    public static final void b(java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setBusy", "com.tencent.mm.plugin.sns.ui.animation.ItemBusyManager");
        if (str == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBusy", "com.tencent.mm.plugin.sns.ui.animation.ItemBusyManager");
            return;
        }
        f516326a.put(str, java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBusy", "com.tencent.mm.plugin.sns.ui.animation.ItemBusyManager");
    }
}
