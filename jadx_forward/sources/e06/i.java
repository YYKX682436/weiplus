package e06;

/* loaded from: classes5.dex */
public class i implements java.lang.Iterable, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f327742d;

    /* renamed from: e, reason: collision with root package name */
    public final int f327743e;

    /* renamed from: f, reason: collision with root package name */
    public final int f327744f;

    public i(int i17, int i18, int i19) {
        if (i19 == 0) {
            throw new java.lang.IllegalArgumentException("Step must be non-zero.");
        }
        if (i19 == Integer.MIN_VALUE) {
            throw new java.lang.IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f327742d = i17;
        this.f327743e = sz5.b.a(i17, i18, i19);
        this.f327744f = i19;
    }

    /* renamed from: equals */
    public boolean mo126623xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof e06.i) {
            if (!mo126615x7aab3243() || !((e06.i) obj).mo126615x7aab3243()) {
                e06.i iVar = (e06.i) obj;
                if (this.f327742d != iVar.f327742d || this.f327743e != iVar.f327743e || this.f327744f != iVar.f327744f) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int mo126624x8cdac1b() {
        if (mo126615x7aab3243()) {
            return -1;
        }
        return (((this.f327742d * 31) + this.f327743e) * 31) + this.f327744f;
    }

    /* renamed from: isEmpty */
    public boolean mo126615x7aab3243() {
        int i17 = this.f327744f;
        int i18 = this.f327743e;
        int i19 = this.f327742d;
        if (i17 > 0) {
            if (i19 > i18) {
                return true;
            }
        } else if (i19 < i18) {
            return true;
        }
        return false;
    }

    public final int j() {
        return this.f327742d;
    }

    public final int k() {
        return this.f327743e;
    }

    @Override // java.lang.Iterable
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public kz5.x0 iterator() {
        return new e06.j(this.f327742d, this.f327743e, this.f327744f);
    }

    /* renamed from: toString */
    public java.lang.String mo126625x9616526c() {
        java.lang.StringBuilder sb6;
        int i17 = this.f327743e;
        int i18 = this.f327742d;
        int i19 = this.f327744f;
        if (i19 > 0) {
            sb6 = new java.lang.StringBuilder();
            sb6.append(i18);
            sb6.append("..");
            sb6.append(i17);
            sb6.append(" step ");
            sb6.append(i19);
        } else {
            sb6 = new java.lang.StringBuilder();
            sb6.append(i18);
            sb6.append(" downTo ");
            sb6.append(i17);
            sb6.append(" step ");
            sb6.append(-i19);
        }
        return sb6.toString();
    }
}
