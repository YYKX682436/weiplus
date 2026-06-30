package r95;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f474986a;

    /* renamed from: b, reason: collision with root package name */
    public final int f474987b;

    public d(int i17, int i18) {
        this.f474986a = i17;
        this.f474987b = i18;
    }

    /* renamed from: equals */
    public boolean m162077xb2c87fbf(java.lang.Object obj) {
        if (this != obj) {
            if (obj instanceof r95.d) {
                r95.d dVar = (r95.d) obj;
                if (this.f474986a == dVar.f474986a) {
                    if (this.f474987b == dVar.f474987b) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: hashCode */
    public int m162078x8cdac1b() {
        return (this.f474986a * 31) + this.f474987b;
    }

    /* renamed from: toString */
    public java.lang.String m162079x9616526c() {
        return "Size(width=" + this.f474986a + ", height=" + this.f474987b + ')';
    }
}
