package bf4;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f19691a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f19692b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19693c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19694d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f19695e;

    public a(int i17, boolean z17, int i18, int i19, int i27, kotlin.jvm.internal.i iVar) {
        i17 = (i27 & 1) != 0 ? 2 : i17;
        z17 = (i27 & 2) != 0 ? true : z17;
        i18 = (i27 & 4) != 0 ? 0 : i18;
        i19 = (i27 & 8) != 0 ? 0 : i19;
        this.f19691a = i17;
        this.f19692b = z17;
        this.f19693c = i18;
        this.f19694d = i19;
        this.f19695e = new java.util.HashSet();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bf4.a)) {
            return false;
        }
        bf4.a aVar = (bf4.a) obj;
        return this.f19691a == aVar.f19691a && this.f19692b == aVar.f19692b && this.f19693c == aVar.f19693c && this.f19694d == aVar.f19694d;
    }

    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.f19691a) * 31) + java.lang.Boolean.hashCode(this.f19692b)) * 31) + java.lang.Integer.hashCode(this.f19693c)) * 31) + java.lang.Integer.hashCode(this.f19694d);
    }

    public java.lang.String toString() {
        return "StoryBasicConfig(repeatMD5=" + this.f19691a + ", showMusicIcon=" + this.f19692b + ", albumThumbHeight=" + this.f19693c + ", albumThumbWidth=" + this.f19694d + ')';
    }
}
