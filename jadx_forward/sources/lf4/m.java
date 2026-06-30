package lf4;

/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f399971a;

    /* renamed from: b, reason: collision with root package name */
    public int f399972b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.ArrayList f399973c;

    /* renamed from: d, reason: collision with root package name */
    public int f399974d;

    public m(java.lang.String username, int i17, java.util.ArrayList items, int i18, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        if ((i19 & 8) != 0) {
            int e17 = c01.id.e();
            ef4.n.f333993a.a();
            i18 = e17 - 86400;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items, "items");
        this.f399971a = username;
        this.f399972b = i17;
        this.f399973c = items;
        this.f399974d = i18;
    }

    /* renamed from: equals */
    public boolean m145717xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lf4.m)) {
            return false;
        }
        lf4.m mVar = (lf4.m) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f399971a, mVar.f399971a) && this.f399972b == mVar.f399972b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f399973c, mVar.f399973c) && this.f399974d == mVar.f399974d;
    }

    /* renamed from: hashCode */
    public int m145718x8cdac1b() {
        return (((((this.f399971a.hashCode() * 31) + java.lang.Integer.hashCode(this.f399972b)) * 31) + this.f399973c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f399974d);
    }

    /* renamed from: toString */
    public java.lang.String m145719x9616526c() {
        return "UserData(username=" + this.f399971a + ", state=" + this.f399972b + ", items=" + this.f399973c + ", timestampBound=" + this.f399974d + ')';
    }
}
