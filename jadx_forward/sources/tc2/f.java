package tc2;

/* loaded from: classes.dex */
public final class f extends java.util.HashMap {

    /* renamed from: d, reason: collision with root package name */
    public final int f498676d;

    public f(int i17) {
        this.f498676d = i17;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public synchronized void clear() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFeedControllerStore", "clear(" + hashCode() + ')');
        super.clear();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public synchronized java.lang.Object get(java.lang.Object obj) {
        return super.get(obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public synchronized java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFeedControllerStore", "put(" + hashCode() + ") ,FinderFeedController(" + this.f498676d + ") " + obj);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public synchronized java.lang.Object remove(java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFeedControllerStore", "remove(" + hashCode() + ") " + obj);
        return super.remove(obj);
    }
}
