package p7;

/* loaded from: classes13.dex */
public final class b implements t6.h {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f433988b;

    public b(java.lang.Object obj) {
        q7.n.b(obj);
        this.f433988b = obj;
    }

    @Override // t6.h
    public void b(java.security.MessageDigest messageDigest) {
        messageDigest.update(this.f433988b.toString().getBytes(t6.h.f497500a));
    }

    @Override // t6.h
    /* renamed from: equals */
    public boolean mo743xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof p7.b) {
            return this.f433988b.equals(((p7.b) obj).f433988b);
        }
        return false;
    }

    @Override // t6.h
    /* renamed from: hashCode */
    public int mo744x8cdac1b() {
        return this.f433988b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m157926x9616526c() {
        return "ObjectKey{object=" + this.f433988b + '}';
    }
}
