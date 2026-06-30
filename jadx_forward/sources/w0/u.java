package w0;

/* loaded from: classes10.dex */
public final class u implements w0.s {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.l f523396a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f523397b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f523398c;

    public u(java.util.Map map, yz5.l canBeSaved) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canBeSaved, "canBeSaved");
        this.f523396a = canBeSaved;
        java.util.Map t17 = map == null ? null : kz5.c1.t(map);
        this.f523397b = t17 == null ? new java.util.LinkedHashMap() : t17;
        this.f523398c = new java.util.LinkedHashMap();
    }

    @Override // w0.s
    public java.util.Map a() {
        java.util.Map t17 = kz5.c1.t(this.f523397b);
        for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) this.f523398c).entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.util.List list = (java.util.List) entry.getValue();
            int i17 = 0;
            if (list.size() == 1) {
                java.lang.Object mo152xb9724478 = ((yz5.a) list.get(0)).mo152xb9724478();
                if (mo152xb9724478 == null) {
                    continue;
                } else {
                    if (!b(mo152xb9724478)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    t17.put(str, kz5.c0.d(mo152xb9724478));
                }
            } else {
                int size = list.size();
                java.util.ArrayList arrayList = new java.util.ArrayList(size);
                while (i17 < size) {
                    int i18 = i17 + 1;
                    java.lang.Object mo152xb97244782 = ((yz5.a) list.get(i17)).mo152xb9724478();
                    if (mo152xb97244782 != null && !b(mo152xb97244782)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    arrayList.add(mo152xb97244782);
                    i17 = i18;
                }
                t17.put(str, arrayList);
            }
        }
        return t17;
    }

    @Override // w0.s
    public boolean b(java.lang.Object value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        return ((java.lang.Boolean) this.f523396a.mo146xb9724478(value)).booleanValue();
    }

    @Override // w0.s
    public java.lang.Object c(java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        java.util.Map map = this.f523397b;
        java.util.List list = (java.util.List) map.remove(key);
        if (list == null || !(!list.isEmpty())) {
            return null;
        }
        if (list.size() > 1) {
            map.put(key, list.subList(1, list.size()));
        }
        return list.get(0);
    }

    @Override // w0.s
    public w0.r d(java.lang.String key, yz5.a valueProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(valueProvider, "valueProvider");
        if (!(!r26.n0.N(key))) {
            throw new java.lang.IllegalArgumentException("Registered key is empty or blank".toString());
        }
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) this.f523398c;
        java.lang.Object obj = linkedHashMap.get(key);
        if (obj == null) {
            obj = new java.util.ArrayList();
            linkedHashMap.put(key, obj);
        }
        ((java.util.List) obj).add(valueProvider);
        return new w0.t(this, key, valueProvider);
    }
}
