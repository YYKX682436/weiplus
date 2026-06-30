package vz3;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f523198a;

    /* renamed from: b, reason: collision with root package name */
    public final int f523199b;

    /* renamed from: c, reason: collision with root package name */
    public final int f523200c;

    /* renamed from: d, reason: collision with root package name */
    public final int f523201d;

    public a(int i17, int i18, int i19, int i27) {
        this.f523198a = i17;
        this.f523199b = i18;
        this.f523200c = i19;
        this.f523201d = i27;
    }

    /* renamed from: equals */
    public boolean m172996xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vz3.a)) {
            return false;
        }
        vz3.a aVar = (vz3.a) obj;
        return this.f523198a == aVar.f523198a && this.f523199b == aVar.f523199b && this.f523200c == aVar.f523200c && this.f523201d == aVar.f523201d;
    }

    /* renamed from: hashCode */
    public int m172997x8cdac1b() {
        return (((((java.lang.Integer.hashCode(this.f523198a) * 31) + java.lang.Integer.hashCode(this.f523199b)) * 31) + java.lang.Integer.hashCode(this.f523200c)) * 31) + java.lang.Integer.hashCode(this.f523201d);
    }

    /* renamed from: toString */
    public java.lang.String m172998x9616526c() {
        return "CameraInfo(width=" + this.f523198a + ", height=" + this.f523199b + ", previewFormat=" + this.f523200c + ", cameraRotation=" + this.f523201d + ')';
    }
}
