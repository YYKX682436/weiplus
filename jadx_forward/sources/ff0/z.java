package ff0;

/* loaded from: classes2.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final int f343128a;

    /* renamed from: b, reason: collision with root package name */
    public final int f343129b;

    /* renamed from: c, reason: collision with root package name */
    public final int f343130c;

    public z(int i17, int i18, int i19) {
        this.f343128a = i17;
        this.f343129b = i18;
        this.f343130c = i19;
    }

    /* renamed from: equals */
    public boolean m129489xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ff0.z)) {
            return false;
        }
        ff0.z zVar = (ff0.z) obj;
        return this.f343128a == zVar.f343128a && this.f343129b == zVar.f343129b && this.f343130c == zVar.f343130c;
    }

    /* renamed from: hashCode */
    public int m129490x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f343128a) * 31) + java.lang.Integer.hashCode(this.f343129b)) * 31) + java.lang.Integer.hashCode(this.f343130c);
    }

    /* renamed from: toString */
    public java.lang.String m129491x9616526c() {
        return "TingImagePickColorResult(playerBackgroundColor=" + this.f343128a + ", minibarColor=" + this.f343129b + ", linkColor=" + this.f343130c + ')';
    }
}
