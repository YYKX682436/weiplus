package uv4;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f512968a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f512969b;

    public i(int i17, boolean z17) {
        this.f512968a = i17;
        this.f512969b = z17;
    }

    /* renamed from: equals */
    public boolean m170607xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uv4.i)) {
            return false;
        }
        uv4.i iVar = (uv4.i) obj;
        return this.f512968a == iVar.f512968a && this.f512969b == iVar.f512969b;
    }

    /* renamed from: hashCode */
    public int m170608x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f512968a) * 31) + java.lang.Boolean.hashCode(this.f512969b);
    }

    /* renamed from: toString */
    public java.lang.String m170609x9616526c() {
        return "VersionLocation(version=" + this.f512968a + ", isInRootDir=" + this.f512969b + ')';
    }
}
