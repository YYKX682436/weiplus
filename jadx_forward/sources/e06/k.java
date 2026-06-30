package e06;

/* loaded from: classes2.dex */
public final class k extends e06.i implements e06.h {

    /* renamed from: g, reason: collision with root package name */
    public static final e06.k f327749g = new e06.k(1, 0);

    public k(int i17, int i18) {
        super(i17, i18, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e06.h
    public /* bridge */ /* synthetic */ boolean e(java.lang.Comparable comparable) {
        return m(((java.lang.Number) comparable).intValue());
    }

    @Override // e06.i
    /* renamed from: equals */
    public boolean mo126623xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof e06.k) {
            if (!mo126615x7aab3243() || !((e06.k) obj).mo126615x7aab3243()) {
                e06.k kVar = (e06.k) obj;
                if (this.f327742d == kVar.f327742d) {
                    if (this.f327743e == kVar.f327743e) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // e06.i
    /* renamed from: hashCode */
    public int mo126624x8cdac1b() {
        if (mo126615x7aab3243()) {
            return -1;
        }
        return (this.f327742d * 31) + this.f327743e;
    }

    @Override // e06.i, e06.h
    /* renamed from: isEmpty */
    public boolean mo126615x7aab3243() {
        return this.f327742d > this.f327743e;
    }

    public boolean m(int i17) {
        return this.f327742d <= i17 && i17 <= this.f327743e;
    }

    @Override // e06.h
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public java.lang.Integer g() {
        return java.lang.Integer.valueOf(this.f327743e);
    }

    @Override // e06.h
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public java.lang.Integer h() {
        return java.lang.Integer.valueOf(this.f327742d);
    }

    @Override // e06.i
    /* renamed from: toString */
    public java.lang.String mo126625x9616526c() {
        return this.f327742d + ".." + this.f327743e;
    }
}
