package qd5;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f443441a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f443442b;

    public g(java.lang.String groupId, java.util.Map map) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groupId, "groupId");
        this.f443441a = groupId;
        this.f443442b = map;
    }

    /* renamed from: equals */
    public boolean m159896xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qd5.g)) {
            return false;
        }
        qd5.g gVar = (qd5.g) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f443441a, gVar.f443441a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f443442b, gVar.f443442b);
    }

    /* renamed from: hashCode */
    public int m159897x8cdac1b() {
        int hashCode = this.f443441a.hashCode() * 31;
        java.util.Map map = this.f443442b;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m159898x9616526c() {
        return "UIData(groupId=" + this.f443441a + ", startViews=" + this.f443442b + ')';
    }
}
