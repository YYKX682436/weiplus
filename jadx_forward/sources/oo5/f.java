package oo5;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f428746a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f428747b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f428748c;

    public f(java.lang.String filePath, java.lang.String fileExt, boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i17 & 4) != 0 ? false : z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileExt, "fileExt");
        this.f428746a = filePath;
        this.f428747b = fileExt;
        this.f428748c = z17;
    }

    /* renamed from: equals */
    public boolean m152100xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oo5.f)) {
            return false;
        }
        oo5.f fVar = (oo5.f) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f428746a, fVar.f428746a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f428747b, fVar.f428747b) && this.f428748c == fVar.f428748c;
    }

    /* renamed from: hashCode */
    public int m152101x8cdac1b() {
        return (((this.f428746a.hashCode() * 31) + this.f428747b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f428748c);
    }

    /* renamed from: toString */
    public java.lang.String m152102x9616526c() {
        return "VoIPPreviewFileParams(filePath=" + this.f428746a + ", fileExt=" + this.f428747b + ", isDark=" + this.f428748c + ')';
    }
}
