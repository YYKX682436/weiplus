package zy1;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f558865a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashSet f558866b;

    public h(java.lang.String key, java.util.HashSet set, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        set = (i17 & 2) != 0 ? new java.util.HashSet() : set;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        this.f558865a = key;
        this.f558866b = set;
    }

    /* renamed from: equals */
    public boolean m179909xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy1.h)) {
            return false;
        }
        zy1.h hVar = (zy1.h) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f558865a, hVar.f558865a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f558866b, hVar.f558866b);
    }

    /* renamed from: hashCode */
    public int m179910x8cdac1b() {
        return (this.f558865a.hashCode() * 31) + this.f558866b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m179911x9616526c() {
        return "ReportUniqueInfo(key=" + this.f558865a + ", set=" + this.f558866b + ')';
    }
}
