package lo0;

/* loaded from: classes14.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f401578a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f401579b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f401580c;

    /* renamed from: d, reason: collision with root package name */
    public final int f401581d;

    public m(org.json.JSONObject itemGroupJson, java.util.Map groupedItems) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemGroupJson, "itemGroupJson");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groupedItems, "groupedItems");
        java.lang.String optString = itemGroupJson.optString(dm.i4.f66865x76d1ec5a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        if (!(optString.length() == 0)) {
            java.lang.String optString2 = itemGroupJson.optString("displayName");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
            if (!(optString2.length() == 0)) {
                int optInt = itemGroupJson.optInt("order");
                java.util.List list = (java.util.List) groupedItems.get(optString);
                if (list == null) {
                    list = null;
                } else if (list.size() > 1) {
                    kz5.g0.t(list, new lo0.l());
                }
                this.f401578a = optString;
                this.f401579b = optString2;
                this.f401580c = list == null ? kz5.p0.f395529d : list;
                this.f401581d = optInt;
                return;
            }
            throw new lo0.u("Item group display name is empty. ".concat(optString));
        }
        throw new lo0.u("Item group ID is empty.");
    }

    public m(lo0.m mVar, java.util.Map badges) {
        this.f401578a = mVar.f401578a;
        this.f401579b = mVar.f401579b;
        java.util.List<lo0.k> list = mVar.f401580c;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (lo0.k kVar : list) {
            kVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(badges, "badges");
            arrayList.add(new lo0.k(kVar, badges));
        }
        this.f401580c = arrayList;
        this.f401581d = mVar.f401581d;
    }
}
