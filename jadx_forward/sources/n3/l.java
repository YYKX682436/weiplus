package n3;

/* loaded from: classes13.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.DisplayCutout f415894a;

    public l(android.view.DisplayCutout displayCutout) {
        this.f415894a = displayCutout;
    }

    public int a() {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return n3.j.c(this.f415894a);
        }
        return 0;
    }

    public int b() {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return n3.j.d(this.f415894a);
        }
        return 0;
    }

    public int c() {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return n3.j.e(this.f415894a);
        }
        return 0;
    }

    public int d() {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return n3.j.f(this.f415894a);
        }
        return 0;
    }

    public e3.d e() {
        return android.os.Build.VERSION.SDK_INT >= 30 ? e3.d.d(n3.k.b(this.f415894a)) : e3.d.f328576e;
    }

    /* renamed from: equals */
    public boolean m148932xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n3.l.class != obj.getClass()) {
            return false;
        }
        return m3.c.a(this.f415894a, ((n3.l) obj).f415894a);
    }

    /* renamed from: hashCode */
    public int m148933x8cdac1b() {
        android.view.DisplayCutout displayCutout = this.f415894a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m148934x9616526c() {
        return "DisplayCutoutCompat{" + this.f415894a + "}";
    }
}
