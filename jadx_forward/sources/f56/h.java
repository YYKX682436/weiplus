package f56;

/* loaded from: classes7.dex */
public class h implements java.lang.Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f341335d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f341336e;

    /* renamed from: f, reason: collision with root package name */
    public final java.nio.charset.CodingErrorAction f341337f;

    /* renamed from: g, reason: collision with root package name */
    public final java.nio.charset.CodingErrorAction f341338g;

    /* renamed from: h, reason: collision with root package name */
    public final int f341339h;

    /* renamed from: i, reason: collision with root package name */
    public final int f341340i;

    /* renamed from: m, reason: collision with root package name */
    public final int f341341m;

    public h() {
        this.f341335d = true;
        this.f341336e = true;
        java.nio.charset.CodingErrorAction codingErrorAction = java.nio.charset.CodingErrorAction.REPLACE;
        this.f341337f = codingErrorAction;
        this.f341338g = codingErrorAction;
        this.f341339h = Integer.MAX_VALUE;
        this.f341340i = 8192;
        this.f341341m = 8192;
    }

    /* renamed from: clone */
    public java.lang.Object m129082x5a5dd5d() {
        return new f56.h(this);
    }

    /* renamed from: equals */
    public boolean m129083xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof f56.h)) {
            return false;
        }
        f56.h hVar = (f56.h) obj;
        return this.f341335d == hVar.f341335d && this.f341336e == hVar.f341336e && this.f341337f == hVar.f341337f && this.f341338g == hVar.f341338g && this.f341339h == hVar.f341339h && this.f341341m == hVar.f341341m && this.f341340i == hVar.f341340i;
    }

    /* renamed from: hashCode */
    public int m129084x8cdac1b() {
        int i17 = (((this.f341335d ? 1 : 0) * 31) + (this.f341336e ? 1 : 0)) * 31;
        java.nio.charset.CodingErrorAction codingErrorAction = this.f341337f;
        int hashCode = (i17 + (codingErrorAction != null ? codingErrorAction.hashCode() : 0)) * 31;
        java.nio.charset.CodingErrorAction codingErrorAction2 = this.f341338g;
        return ((((((hashCode + (codingErrorAction2 != null ? codingErrorAction2.hashCode() : 0)) * 31) + this.f341339h) * 31) + this.f341340i) * 31) + this.f341341m;
    }

    public h(f56.h hVar) {
        this.f341335d = true;
        this.f341336e = true;
        java.nio.charset.CodingErrorAction codingErrorAction = java.nio.charset.CodingErrorAction.REPLACE;
        this.f341337f = codingErrorAction;
        this.f341338g = codingErrorAction;
        this.f341339h = Integer.MAX_VALUE;
        this.f341340i = 8192;
        this.f341341m = 8192;
        this.f341335d = hVar.f341335d;
        this.f341336e = hVar.f341336e;
        this.f341337f = hVar.f341337f;
        this.f341338g = hVar.f341338g;
        this.f341339h = hVar.f341339h;
        this.f341340i = hVar.f341340i;
    }
}
