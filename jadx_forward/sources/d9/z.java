package d9;

/* loaded from: classes15.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final int f308960a;

    /* renamed from: b, reason: collision with root package name */
    public final int f308961b;

    /* renamed from: c, reason: collision with root package name */
    public final int f308962c;

    public z(int i17, int i18, int i19) {
        this.f308960a = i17;
        this.f308961b = i18;
        this.f308962c = i19;
    }

    public boolean a() {
        return this.f308961b != -1;
    }

    /* renamed from: equals */
    public boolean m123743xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d9.z.class != obj.getClass()) {
            return false;
        }
        d9.z zVar = (d9.z) obj;
        return this.f308960a == zVar.f308960a && this.f308961b == zVar.f308961b && this.f308962c == zVar.f308962c;
    }

    /* renamed from: hashCode */
    public int m123744x8cdac1b() {
        return ((((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v5.f34918x366c91de + this.f308960a) * 31) + this.f308961b) * 31) + this.f308962c;
    }
}
