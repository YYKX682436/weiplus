package a7;

/* loaded from: classes13.dex */
public class c0 implements t6.h {

    /* renamed from: b, reason: collision with root package name */
    public final a7.d0 f83340b;

    /* renamed from: c, reason: collision with root package name */
    public final java.net.URL f83341c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f83342d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f83343e;

    /* renamed from: f, reason: collision with root package name */
    public java.net.URL f83344f;

    /* renamed from: g, reason: collision with root package name */
    public volatile byte[] f83345g;

    /* renamed from: h, reason: collision with root package name */
    public int f83346h;

    public c0(java.net.URL url) {
        a7.d0 d0Var = a7.d0.f83350a;
        q7.n.b(url);
        this.f83341c = url;
        this.f83342d = null;
        q7.n.b(d0Var);
        this.f83340b = d0Var;
    }

    @Override // t6.h
    public void b(java.security.MessageDigest messageDigest) {
        if (this.f83345g == null) {
            this.f83345g = c().getBytes(t6.h.f497500a);
        }
        messageDigest.update(this.f83345g);
    }

    public java.lang.String c() {
        java.lang.String str = this.f83342d;
        if (str != null) {
            return str;
        }
        java.net.URL url = this.f83341c;
        q7.n.b(url);
        return url.toString();
    }

    public java.net.URL d() {
        if (this.f83344f == null) {
            if (android.text.TextUtils.isEmpty(this.f83343e)) {
                java.lang.String str = this.f83342d;
                if (android.text.TextUtils.isEmpty(str)) {
                    java.net.URL url = this.f83341c;
                    q7.n.b(url);
                    str = url.toString();
                }
                this.f83343e = android.net.Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f83344f = new java.net.URL(this.f83343e);
        }
        return this.f83344f;
    }

    @Override // t6.h
    /* renamed from: equals */
    public boolean mo743xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof a7.c0)) {
            return false;
        }
        a7.c0 c0Var = (a7.c0) obj;
        return c().equals(c0Var.c()) && this.f83340b.equals(c0Var.f83340b);
    }

    @Override // t6.h
    /* renamed from: hashCode */
    public int mo744x8cdac1b() {
        if (this.f83346h == 0) {
            int hashCode = c().hashCode();
            this.f83346h = hashCode;
            this.f83346h = (hashCode * 31) + this.f83340b.hashCode();
        }
        return this.f83346h;
    }

    /* renamed from: toString */
    public java.lang.String m745x9616526c() {
        return c();
    }

    public c0(java.lang.String str) {
        a7.d0 d0Var = a7.d0.f83350a;
        this.f83341c = null;
        if (!android.text.TextUtils.isEmpty(str)) {
            this.f83342d = str;
            q7.n.b(d0Var);
            this.f83340b = d0Var;
            return;
        }
        throw new java.lang.IllegalArgumentException("Must not be null or empty");
    }
}
