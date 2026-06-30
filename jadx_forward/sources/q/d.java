package q;

/* loaded from: classes13.dex */
public class d implements java.util.Map.Entry {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f440735d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f440736e;

    /* renamed from: f, reason: collision with root package name */
    public q.d f440737f;

    /* renamed from: g, reason: collision with root package name */
    public q.d f440738g;

    public d(java.lang.Object obj, java.lang.Object obj2) {
        this.f440735d = obj;
        this.f440736e = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q.d)) {
            return false;
        }
        q.d dVar = (q.d) obj;
        return this.f440735d.equals(dVar.f440735d) && this.f440736e.equals(dVar.f440736e);
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getKey() {
        return this.f440735d;
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getValue() {
        return this.f440736e;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return this.f440735d.hashCode() ^ this.f440736e.hashCode();
    }

    @Override // java.util.Map.Entry
    public java.lang.Object setValue(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("An entry modification is not supported");
    }

    /* renamed from: toString */
    public java.lang.String m159180x9616526c() {
        return this.f440735d + "=" + this.f440736e;
    }
}
