package om2;

/* loaded from: classes10.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f427918a;

    /* renamed from: b, reason: collision with root package name */
    public final int f427919b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g f427920c;

    public w(java.lang.String version, int i17, com.p314xaae8f345.mm.p2495xc50a8b8b.g noteContent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(version, "version");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(noteContent, "noteContent");
        this.f427918a = version;
        this.f427919b = i17;
        this.f427920c = noteContent;
    }

    /* renamed from: equals */
    public boolean m151688xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof om2.w)) {
            return false;
        }
        om2.w wVar = (om2.w) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f427918a, wVar.f427918a) && this.f427919b == wVar.f427919b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f427920c, wVar.f427920c);
    }

    /* renamed from: hashCode */
    public int m151689x8cdac1b() {
        return (((this.f427918a.hashCode() * 31) + java.lang.Integer.hashCode(this.f427919b)) * 31) + this.f427920c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m151690x9616526c() {
        return "version " + this.f427918a + " compressType: " + this.f427919b + " noteContent: " + this.f427920c.f273689a.length;
    }
}
