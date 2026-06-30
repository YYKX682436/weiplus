package mw2;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f413242a;

    /* renamed from: b, reason: collision with root package name */
    public final int f413243b;

    /* renamed from: c, reason: collision with root package name */
    public final int f413244c;

    /* renamed from: d, reason: collision with root package name */
    public final int f413245d;

    public e(int i17, int i18, int i19, int i27) {
        this.f413242a = i17;
        this.f413243b = i18;
        this.f413244c = i19;
        this.f413245d = i27;
    }

    /* renamed from: equals */
    public boolean m148481xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mw2.e)) {
            return false;
        }
        mw2.e eVar = (mw2.e) obj;
        return this.f413242a == eVar.f413242a && this.f413243b == eVar.f413243b && this.f413244c == eVar.f413244c && this.f413245d == eVar.f413245d;
    }

    /* renamed from: hashCode */
    public int m148482x8cdac1b() {
        return (((((java.lang.Integer.hashCode(this.f413242a) * 31) + java.lang.Integer.hashCode(this.f413243b)) * 31) + java.lang.Integer.hashCode(this.f413244c)) * 31) + java.lang.Integer.hashCode(this.f413245d);
    }

    /* renamed from: toString */
    public java.lang.String m148483x9616526c() {
        return "SpriteCropInfo(left=" + this.f413242a + ", top=" + this.f413243b + ", cropWidth=" + this.f413244c + ", cropHeight=" + this.f413245d + ')';
    }
}
