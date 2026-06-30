package lz5;

/* loaded from: classes14.dex */
public final class i implements java.util.Map.Entry, zz5.e {

    /* renamed from: d, reason: collision with root package name */
    public final lz5.m f403931d;

    /* renamed from: e, reason: collision with root package name */
    public final int f403932e;

    public i(lz5.m map, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(map, "map");
        this.f403931d = map;
        this.f403932e = i17;
    }

    @Override // java.util.Map.Entry
    public boolean equals(java.lang.Object obj) {
        if (obj instanceof java.util.Map.Entry) {
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(entry.getKey(), getKey()) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(entry.getValue(), getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getKey() {
        return this.f403931d.f403938d[this.f403932e];
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getValue() {
        java.lang.Object[] objArr = this.f403931d.f403939e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(objArr);
        return objArr[this.f403932e];
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        java.lang.Object key = getKey();
        int hashCode = key != null ? key.hashCode() : 0;
        java.lang.Object value = getValue();
        return hashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public java.lang.Object setValue(java.lang.Object obj) {
        lz5.m mVar = this.f403931d;
        mVar.c();
        java.lang.Object[] objArr = mVar.f403939e;
        if (objArr == null) {
            objArr = lz5.f.c(mVar.f403938d.length);
            mVar.f403939e = objArr;
        }
        int i17 = this.f403932e;
        java.lang.Object obj2 = objArr[i17];
        objArr[i17] = obj;
        return obj2;
    }

    /* renamed from: toString */
    public java.lang.String m146548x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(getKey());
        sb6.append('=');
        sb6.append(getValue());
        return sb6.toString();
    }
}
