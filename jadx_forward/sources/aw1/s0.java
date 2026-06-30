package aw1;

/* loaded from: classes8.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f96206a;

    /* renamed from: b, reason: collision with root package name */
    public final int f96207b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f96208c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f96209d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f96210e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f96211f;

    public s0(long j17, int i17, boolean z17, boolean z18, boolean z19, java.lang.String fileExt) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileExt, "fileExt");
        this.f96206a = j17;
        this.f96207b = i17;
        this.f96208c = z17;
        this.f96209d = z18;
        this.f96210e = z19;
        this.f96211f = fileExt;
    }

    /* renamed from: equals */
    public boolean m9152xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aw1.s0)) {
            return false;
        }
        aw1.s0 s0Var = (aw1.s0) obj;
        return this.f96206a == s0Var.f96206a && this.f96207b == s0Var.f96207b && this.f96208c == s0Var.f96208c && this.f96209d == s0Var.f96209d && this.f96210e == s0Var.f96210e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f96211f, s0Var.f96211f);
    }

    /* renamed from: hashCode */
    public int m9153x8cdac1b() {
        return (((((((((java.lang.Long.hashCode(this.f96206a) * 31) + java.lang.Integer.hashCode(this.f96207b)) * 31) + java.lang.Boolean.hashCode(this.f96208c)) * 31) + java.lang.Boolean.hashCode(this.f96209d)) * 31) + java.lang.Boolean.hashCode(this.f96210e)) * 31) + this.f96211f.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m9154x9616526c() {
        return "C2CFileItem(fileSize=" + this.f96206a + ", fileType=" + this.f96207b + ", msgIsSend=" + this.f96208c + ", fileIsUpload=" + this.f96209d + ", isFromChatRoom=" + this.f96210e + ", fileExt=" + this.f96211f + ')';
    }
}
