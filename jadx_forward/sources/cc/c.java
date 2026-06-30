package cc;

/* loaded from: classes14.dex */
public final class c extends cc.d0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cc.e f121893d;

    public c(cc.e eVar) {
        this.f121893d = eVar;
    }

    @Override // cc.d0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        java.util.Set entrySet = this.f121893d.f121898f.entrySet();
        int i17 = cc.w.f121937a;
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        return new cc.d(this.f121893d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        java.lang.Object obj2;
        if (!contains(obj)) {
            return false;
        }
        cc.r rVar = this.f121893d.f121899g;
        java.lang.Object key = ((java.util.Map.Entry) obj).getKey();
        java.util.Map map = rVar.f121930g;
        int i17 = cc.h0.f121913a;
        map.getClass();
        try {
            obj2 = map.remove(key);
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            obj2 = null;
        }
        java.util.Collection collection = (java.util.Collection) obj2;
        if (collection == null) {
            return true;
        }
        int size = collection.size();
        collection.clear();
        rVar.f121931h -= size;
        return true;
    }
}
