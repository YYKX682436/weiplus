package e06;

/* loaded from: classes5.dex */
public final class e implements e06.f {

    /* renamed from: d, reason: collision with root package name */
    public final float f327740d;

    /* renamed from: e, reason: collision with root package name */
    public final float f327741e;

    public e(float f17, float f18) {
        this.f327740d = f17;
        this.f327741e = f18;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e06.f
    public boolean d(java.lang.Comparable comparable, java.lang.Comparable comparable2) {
        return ((java.lang.Number) comparable).floatValue() <= ((java.lang.Number) comparable2).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e06.h
    public boolean e(java.lang.Comparable comparable) {
        float floatValue = ((java.lang.Number) comparable).floatValue();
        return floatValue >= this.f327740d && floatValue <= this.f327741e;
    }

    /* renamed from: equals */
    public boolean m126620xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof e06.e)) {
            return false;
        }
        if (!mo126615x7aab3243() || !((e06.e) obj).mo126615x7aab3243()) {
            e06.e eVar = (e06.e) obj;
            if (!(this.f327740d == eVar.f327740d)) {
                return false;
            }
            if (!(this.f327741e == eVar.f327741e)) {
                return false;
            }
        }
        return true;
    }

    @Override // e06.h
    public java.lang.Comparable g() {
        return java.lang.Float.valueOf(this.f327741e);
    }

    @Override // e06.h
    public java.lang.Comparable h() {
        return java.lang.Float.valueOf(this.f327740d);
    }

    /* renamed from: hashCode */
    public int m126621x8cdac1b() {
        if (mo126615x7aab3243()) {
            return -1;
        }
        return (java.lang.Float.hashCode(this.f327740d) * 31) + java.lang.Float.hashCode(this.f327741e);
    }

    @Override // e06.h
    /* renamed from: isEmpty */
    public boolean mo126615x7aab3243() {
        return this.f327740d > this.f327741e;
    }

    /* renamed from: toString */
    public java.lang.String m126622x9616526c() {
        return this.f327740d + ".." + this.f327741e;
    }
}
