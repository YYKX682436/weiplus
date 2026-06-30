package zk;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f554882a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f554883b;

    public b(java.lang.String fileId, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileId, "fileId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        this.f554882a = fileId;
        this.f554883b = msgInfo;
    }

    /* renamed from: equals */
    public boolean m179058xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zk.b)) {
            return false;
        }
        zk.b bVar = (zk.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f554882a, bVar.f554882a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f554883b, bVar.f554883b);
    }

    /* renamed from: hashCode */
    public int m179059x8cdac1b() {
        return (this.f554882a.hashCode() * 31) + this.f554883b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m179060x9616526c() {
        return "FileIdWithMsg(fileId=" + this.f554882a + ", msgInfo=" + this.f554883b + ')';
    }
}
