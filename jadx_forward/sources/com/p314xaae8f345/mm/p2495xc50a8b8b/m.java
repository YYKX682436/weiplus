package com.p314xaae8f345.mm.p2495xc50a8b8b;

/* loaded from: classes8.dex */
public final class m extends java.util.LinkedHashMap {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.a f273702d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.q f273703e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.p f273704f;

    public m(yz5.a onClear, yz5.q onPut, yz5.p onRemove) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onClear, "onClear");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onPut, "onPut");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onRemove, "onRemove");
        this.f273702d = onClear;
        this.f273703e = onPut;
        this.f273704f = onRemove;
    }

    public final void a(java.lang.Iterable entries) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entries, "entries");
        java.util.Iterator it = entries.iterator();
        while (it.hasNext()) {
            jz5.l lVar = (jz5.l) it.next();
            super.put(lVar.f384366d, lVar.f384367e);
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f273702d.mo152xb9724478();
        super.clear();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        this.f273703e.mo147xb9724478(obj, obj2, java.lang.Boolean.valueOf(get(obj) != 0));
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(java.util.Map from) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(from, "from");
        for (java.util.Map.Entry entry : from.entrySet()) {
            java.lang.Object key = entry.getKey();
            this.f273703e.mo147xb9724478(key, entry.getValue(), java.lang.Boolean.valueOf(get(key) != 0));
        }
        super.putAll(from);
    }

    @Override // java.util.HashMap, java.util.Map
    public java.lang.Object putIfAbsent(java.lang.Object obj, java.lang.Object obj2) {
        if (get(obj) == 0) {
            this.f273703e.mo147xb9724478(obj, obj2, java.lang.Boolean.FALSE);
        }
        return super.putIfAbsent(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public java.lang.Object remove(java.lang.Object obj) {
        java.lang.Object obj2 = get(obj);
        if (obj2 != null) {
            this.f273704f.mo149xb9724478(obj, obj2);
        }
        return super.remove(obj);
    }

    @Override // java.util.HashMap, java.util.Map
    public boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        this.f273704f.mo149xb9724478(obj, obj2);
        return super.remove(obj, obj2);
    }
}
