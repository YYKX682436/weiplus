package u24;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final u24.m f505662a = new u24.m();

    public final void a(a24.i iVar) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(iVar.getClass(), com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17523x8c728888.class)) {
            return;
        }
        int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h;
        if ((i17 == 788529167 || i17 == 788529166) || z65.c.a()) {
            throw new java.lang.IllegalArgumentException(iVar.getClass() + " parentGroup is itself");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingDataFactory", iVar.getClass() + " parentGroup is itself");
    }

    public final java.util.HashMap b(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = new fw3.d().d("Repairer_Setting").iterator();
        while (it.hasNext()) {
            java.lang.Object newInstance = ((java.lang.Class) it.next()).getConstructors()[0].newInstance(context);
            if (newInstance instanceof a24.i) {
                hashMap.put(((a24.i) newInstance).a7(), newInstance);
            }
        }
        return hashMap;
    }

    public final jz5.l c(java.lang.String key, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2061x2e06d1.AbstractActivityC17509x7e1428f3 context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.util.HashMap b17 = b(context);
        b17.size();
        java.util.Collection values = b17.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        kz5.n0.g0(values, null, null, null, 0, null, u24.k.f505659d, 31, null);
        a24.i iVar = (a24.i) b17.get(key);
        if (iVar == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        b17.forEach(new u24.l(iVar, arrayList));
        return new jz5.l(iVar, kz5.n0.S0(arrayList));
    }

    public final jz5.l d(a24.i rootItem, java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootItem, "rootItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            a24.i iVar = (a24.i) it.next();
            a24.u b76 = iVar.b7();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(rootItem.getClass(), b76.f82441a)) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(rootItem, iVar)) {
                    f505662a.a(iVar);
                } else {
                    hashMap.put(b76.f82442b, iVar);
                }
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (a24.i iVar2 = (a24.i) hashMap.get(null); iVar2 != null; iVar2 = (a24.i) hashMap.get(iVar2.getClass())) {
            arrayList.add(iVar2);
        }
        if (hashMap.size() != arrayList.size()) {
            int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h;
            if ((i17 == 788529167 || i17 == 788529166) || z65.c.a()) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                a24.i iVar3 = (a24.i) hashMap.get(null);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append("frontSize:" + hashMap.size() + " childrenSize:" + arrayList.size() + "  children:" + kz5.n0.g0(arrayList, null, null, null, 0, null, null, 63, null));
                for (java.util.Map.Entry entry : hashMap.entrySet()) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("| key:");
                    java.lang.Class cls = (java.lang.Class) entry.getKey();
                    sb7.append(cls != null ? cls.getSimpleName() : null);
                    sb7.append(" value: ");
                    sb7.append(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(entry.getValue().getClass()).g());
                    sb6.append(sb7.toString());
                }
                while (iVar3 != null) {
                    arrayList2.add(iVar3);
                    a24.i iVar4 = (a24.i) hashMap.get(iVar3.getClass());
                    sb6.append("| no one's front is " + iVar3.getClass());
                    iVar3 = iVar4;
                }
                throw new java.lang.IllegalArgumentException("group:" + rootItem.getClass() + " has config error, msg:" + ((java.lang.Object) sb6));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingDataFactory", "checkSize error");
        }
        return new jz5.l(rootItem, kz5.n0.S0(arrayList));
    }
}
