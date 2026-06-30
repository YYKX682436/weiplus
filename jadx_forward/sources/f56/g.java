package f56;

/* loaded from: classes7.dex */
public class g implements java.lang.Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public final int f341331d;

    /* renamed from: e, reason: collision with root package name */
    public final int f341332e;

    /* renamed from: f, reason: collision with root package name */
    public final int f341333f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f341334g;

    public g() {
        this.f341331d = 512;
        this.f341332e = 8192;
        this.f341333f = 8192;
        this.f341334g = true;
    }

    /* renamed from: clone */
    public java.lang.Object m129079x5a5dd5d() {
        return new f56.g(this);
    }

    /* renamed from: equals */
    public boolean m129080xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof f56.g)) {
            return false;
        }
        f56.g gVar = (f56.g) obj;
        return this.f341331d == gVar.f341331d && this.f341332e == gVar.f341332e && this.f341333f == gVar.f341333f && this.f341334g == gVar.f341334g;
    }

    /* renamed from: hashCode */
    public int m129081x8cdac1b() {
        return (((((this.f341331d * 31) + this.f341332e) * 31) + this.f341333f) * 31) + (this.f341334g ? 1 : 0);
    }

    public g(f56.g gVar) {
        this.f341331d = 512;
        this.f341332e = 8192;
        this.f341333f = 8192;
        this.f341334g = true;
        this.f341331d = gVar.f341331d;
        this.f341332e = gVar.f341332e;
        this.f341333f = gVar.f341333f;
        this.f341334g = gVar.f341334g;
    }
}
