package aw1;

/* loaded from: classes8.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f14673a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14674b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f14675c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f14676d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f14677e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f14678f;

    public s0(long j17, int i17, boolean z17, boolean z18, boolean z19, java.lang.String fileExt) {
        kotlin.jvm.internal.o.g(fileExt, "fileExt");
        this.f14673a = j17;
        this.f14674b = i17;
        this.f14675c = z17;
        this.f14676d = z18;
        this.f14677e = z19;
        this.f14678f = fileExt;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aw1.s0)) {
            return false;
        }
        aw1.s0 s0Var = (aw1.s0) obj;
        return this.f14673a == s0Var.f14673a && this.f14674b == s0Var.f14674b && this.f14675c == s0Var.f14675c && this.f14676d == s0Var.f14676d && this.f14677e == s0Var.f14677e && kotlin.jvm.internal.o.b(this.f14678f, s0Var.f14678f);
    }

    public int hashCode() {
        return (((((((((java.lang.Long.hashCode(this.f14673a) * 31) + java.lang.Integer.hashCode(this.f14674b)) * 31) + java.lang.Boolean.hashCode(this.f14675c)) * 31) + java.lang.Boolean.hashCode(this.f14676d)) * 31) + java.lang.Boolean.hashCode(this.f14677e)) * 31) + this.f14678f.hashCode();
    }

    public java.lang.String toString() {
        return "C2CFileItem(fileSize=" + this.f14673a + ", fileType=" + this.f14674b + ", msgIsSend=" + this.f14675c + ", fileIsUpload=" + this.f14676d + ", isFromChatRoom=" + this.f14677e + ", fileExt=" + this.f14678f + ')';
    }
}
