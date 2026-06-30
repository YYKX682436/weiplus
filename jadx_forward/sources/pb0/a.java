package pb0;

/* loaded from: classes4.dex */
public final class a extends java.util.WeakHashMap {
    public final long a() {
        long j17 = 0;
        if (!isEmpty()) {
            java.util.Set entrySet = super.entrySet();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(entrySet, "<get-entries>(...)");
            java.util.Iterator it = entrySet.iterator();
            while (it.hasNext()) {
                java.lang.Object value = ((java.util.Map.Entry) it.next()).getValue();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(value, "<get-value>(...)");
                j17 += ((java.lang.Number) value).longValue();
            }
        }
        return j17;
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(java.lang.Object obj) {
        if (obj == null ? true : obj instanceof android.graphics.Bitmap) {
            return super.containsKey((android.graphics.Bitmap) obj);
        }
        return false;
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(java.lang.Object obj) {
        if (obj == null ? true : obj instanceof java.lang.Integer) {
            return super.containsValue((java.lang.Integer) obj);
        }
        return false;
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.lang.Object get(java.lang.Object obj) {
        if (obj == null ? true : obj instanceof android.graphics.Bitmap) {
            return (java.lang.Integer) super.get((android.graphics.Bitmap) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        return !(obj == null ? true : obj instanceof android.graphics.Bitmap) ? obj2 : (java.lang.Integer) super.getOrDefault((android.graphics.Bitmap) obj, (java.lang.Integer) obj2);
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.lang.Object remove(java.lang.Object obj) {
        if (obj == null ? true : obj instanceof android.graphics.Bitmap) {
            return (java.lang.Integer) super.remove((android.graphics.Bitmap) obj);
        }
        return null;
    }

    @Override // java.util.AbstractMap
    public java.lang.String toString() {
        java.util.Iterator it = super.entrySet().iterator();
        if (!it.hasNext()) {
            return "{}";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("{");
        while (true) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(entry);
            java.lang.Integer num = (java.lang.Integer) entry.getValue();
            sb6.append("Bm:");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
            sb6.append(num.intValue());
            if (!it.hasNext()) {
                sb6.append('}');
                java.lang.String sb7 = sb6.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
                return sb7;
            }
            sb6.append(", ");
        }
    }

    @Override // java.util.Map
    public final /* bridge */ boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        if (!(obj == null ? true : obj instanceof android.graphics.Bitmap)) {
            return false;
        }
        if (obj2 != null ? obj2 instanceof java.lang.Integer : true) {
            return super.remove((android.graphics.Bitmap) obj, (java.lang.Integer) obj2);
        }
        return false;
    }
}
