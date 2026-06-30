package gk2;

/* loaded from: classes.dex */
public final class f extends java.util.HashMap {

    /* renamed from: d, reason: collision with root package name */
    public final int f354010d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f354011e;

    public f(int i17, java.lang.String tag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        this.f354010d = i17;
        this.f354011e = tag;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public synchronized void clear() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveContext", "clear(" + hashCode() + ')');
        super.clear();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public synchronized java.lang.Object get(java.lang.Object obj) {
        return super.get(obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public synchronized java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveContext", "put(" + hashCode() + ") ,buContext(" + this.f354010d + ") buContextTag(" + this.f354011e + ")," + obj);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public synchronized java.lang.Object remove(java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveContext", "remove(" + hashCode() + ") " + obj);
        return super.remove(obj);
    }
}
