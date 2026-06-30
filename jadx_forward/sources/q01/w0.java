package q01;

/* loaded from: classes9.dex */
public final class w0 extends java.util.LinkedHashMap {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f440875d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(int i17) {
        super(i17);
        this.f440875d = i17;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(java.lang.Object obj) {
        if (obj instanceof java.lang.Integer) {
            return super.containsKey((java.lang.Integer) obj);
        }
        return false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(java.lang.Object obj) {
        if (obj instanceof q01.s0) {
            return super.containsValue((q01.s0) obj);
        }
        return false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.lang.Object get(java.lang.Object obj) {
        if (obj instanceof java.lang.Integer) {
            return (q01.s0) super.get((java.lang.Integer) obj);
        }
        return null;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public final /* bridge */ java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        return !(obj instanceof java.lang.Integer) ? obj2 : (q01.s0) super.getOrDefault((java.lang.Integer) obj, (q01.s0) obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.lang.Object remove(java.lang.Object obj) {
        if (obj instanceof java.lang.Integer) {
            return (q01.s0) super.remove((java.lang.Integer) obj);
        }
        return null;
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(java.util.Map.Entry entry) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entry, "entry");
        return super.size() > this.f440875d;
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        if ((obj instanceof java.lang.Integer) && (obj2 instanceof q01.s0)) {
            return super.remove((java.lang.Integer) obj, (q01.s0) obj2);
        }
        return false;
    }
}
