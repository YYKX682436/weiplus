package pf5;

/* loaded from: classes5.dex */
public final class t0 extends java.util.HashMap {

    /* renamed from: d, reason: collision with root package name */
    public final pf5.v0 f435467d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f435468e;

    public t0(pf5.v0 store) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f435467d = store;
        this.f435468e = new java.util.HashMap(0);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        synchronized (this.f435467d.f435474c) {
            if (this.f435467d.f435473b) {
                super.clear();
                this.f435467d.f435475d = true;
            }
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return super.containsKey((java.lang.String) obj);
        }
        return false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(java.lang.Object obj) {
        if (obj instanceof p012xc85e97e9.p093xedfae76a.c1) {
            return super.containsValue((p012xc85e97e9.p093xedfae76a.c1) obj);
        }
        return false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.lang.Object get(java.lang.Object obj) {
        p012xc85e97e9.p093xedfae76a.c1 c1Var;
        if (!(obj instanceof java.lang.String)) {
            return null;
        }
        java.lang.String key = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        synchronized (this.f435467d.f435474c) {
            c1Var = (p012xc85e97e9.p093xedfae76a.c1) super.get(key);
        }
        return c1Var;
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        return !(obj instanceof java.lang.String) ? obj2 : (p012xc85e97e9.p093xedfae76a.c1) super.getOrDefault((java.lang.String) obj, (p012xc85e97e9.p093xedfae76a.c1) obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        p012xc85e97e9.p093xedfae76a.c1 c1Var;
        java.lang.String key = (java.lang.String) obj;
        p012xc85e97e9.p093xedfae76a.c1 value = (p012xc85e97e9.p093xedfae76a.c1) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        synchronized (this.f435467d.f435474c) {
            c1Var = (p012xc85e97e9.p093xedfae76a.c1) super.put(key, value);
        }
        return c1Var;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.lang.Object remove(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return (p012xc85e97e9.p093xedfae76a.c1) super.remove((java.lang.String) obj);
        }
        return null;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.util.Collection values() {
        java.util.Collection values;
        synchronized (this.f435467d.f435474c) {
            if (this.f435467d.f435473b) {
                values = new java.util.ArrayList(super.values());
            } else {
                values = this.f435468e.values();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
            }
        }
        return values;
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        if ((obj instanceof java.lang.String) && (obj2 instanceof p012xc85e97e9.p093xedfae76a.c1)) {
            return super.remove((java.lang.String) obj, (p012xc85e97e9.p093xedfae76a.c1) obj2);
        }
        return false;
    }
}
