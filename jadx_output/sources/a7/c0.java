package a7;

/* loaded from: classes13.dex */
public class c0 implements t6.h {

    /* renamed from: b, reason: collision with root package name */
    public final a7.d0 f1807b;

    /* renamed from: c, reason: collision with root package name */
    public final java.net.URL f1808c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f1809d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f1810e;

    /* renamed from: f, reason: collision with root package name */
    public java.net.URL f1811f;

    /* renamed from: g, reason: collision with root package name */
    public volatile byte[] f1812g;

    /* renamed from: h, reason: collision with root package name */
    public int f1813h;

    public c0(java.net.URL url) {
        a7.d0 d0Var = a7.d0.f1817a;
        q7.n.b(url);
        this.f1808c = url;
        this.f1809d = null;
        q7.n.b(d0Var);
        this.f1807b = d0Var;
    }

    @Override // t6.h
    public void b(java.security.MessageDigest messageDigest) {
        if (this.f1812g == null) {
            this.f1812g = c().getBytes(t6.h.f415967a);
        }
        messageDigest.update(this.f1812g);
    }

    public java.lang.String c() {
        java.lang.String str = this.f1809d;
        if (str != null) {
            return str;
        }
        java.net.URL url = this.f1808c;
        q7.n.b(url);
        return url.toString();
    }

    public java.net.URL d() {
        if (this.f1811f == null) {
            if (android.text.TextUtils.isEmpty(this.f1810e)) {
                java.lang.String str = this.f1809d;
                if (android.text.TextUtils.isEmpty(str)) {
                    java.net.URL url = this.f1808c;
                    q7.n.b(url);
                    str = url.toString();
                }
                this.f1810e = android.net.Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f1811f = new java.net.URL(this.f1810e);
        }
        return this.f1811f;
    }

    @Override // t6.h
    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof a7.c0)) {
            return false;
        }
        a7.c0 c0Var = (a7.c0) obj;
        return c().equals(c0Var.c()) && this.f1807b.equals(c0Var.f1807b);
    }

    @Override // t6.h
    public int hashCode() {
        if (this.f1813h == 0) {
            int hashCode = c().hashCode();
            this.f1813h = hashCode;
            this.f1813h = (hashCode * 31) + this.f1807b.hashCode();
        }
        return this.f1813h;
    }

    public java.lang.String toString() {
        return c();
    }

    public c0(java.lang.String str) {
        a7.d0 d0Var = a7.d0.f1817a;
        this.f1808c = null;
        if (!android.text.TextUtils.isEmpty(str)) {
            this.f1809d = str;
            q7.n.b(d0Var);
            this.f1807b = d0Var;
            return;
        }
        throw new java.lang.IllegalArgumentException("Must not be null or empty");
    }
}
