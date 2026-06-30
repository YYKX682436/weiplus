package va;

/* loaded from: classes16.dex */
public final class y extends va.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f515740d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f515741e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ va.z f515742f;

    public y(va.z zVar, java.lang.Object obj, java.lang.Object obj2) {
        this.f515742f = zVar;
        this.f515740d = obj;
        this.f515741e = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        return this.f515740d.equals(entry.getKey()) && this.f515741e.equals(entry.getValue());
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getKey() {
        return this.f515740d;
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getValue() {
        return this.f515741e;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return this.f515740d.hashCode() ^ this.f515741e.hashCode();
    }

    @Override // java.util.Map.Entry
    public java.lang.Object setValue(java.lang.Object obj) {
        java.lang.Object put = this.f515742f.put(this.f515740d, obj);
        this.f515741e = obj;
        return put;
    }
}
