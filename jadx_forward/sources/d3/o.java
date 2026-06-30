package d3;

/* loaded from: classes13.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.res.Resources f307635a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.res.Resources.Theme f307636b;

    public o(android.content.res.Resources resources, android.content.res.Resources.Theme theme) {
        this.f307635a = resources;
        this.f307636b = theme;
    }

    /* renamed from: equals */
    public boolean m123401xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d3.o.class != obj.getClass()) {
            return false;
        }
        d3.o oVar = (d3.o) obj;
        return this.f307635a.equals(oVar.f307635a) && m3.c.a(this.f307636b, oVar.f307636b);
    }

    /* renamed from: hashCode */
    public int m123402x8cdac1b() {
        return m3.c.b(this.f307635a, this.f307636b);
    }
}
