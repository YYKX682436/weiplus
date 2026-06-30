package fc2;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final so2.j5 f342510a;

    /* renamed from: b, reason: collision with root package name */
    public final int f342511b;

    /* renamed from: c, reason: collision with root package name */
    public in5.v0 f342512c;

    public r(so2.j5 feed, int i17, in5.v0 v0Var, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        v0Var = (i18 & 4) != 0 ? null : v0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        this.f342510a = feed;
        this.f342511b = i17;
        this.f342512c = v0Var;
    }

    public final int a() {
        return this.f342511b;
    }

    public final so2.j5 b() {
        return this.f342510a;
    }

    public final in5.v0 c() {
        return this.f342512c;
    }

    /* renamed from: equals */
    public boolean m129332xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fc2.r)) {
            return false;
        }
        fc2.r rVar = (fc2.r) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f342510a, rVar.f342510a) && this.f342511b == rVar.f342511b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f342512c, rVar.f342512c);
    }

    /* renamed from: hashCode */
    public int m129333x8cdac1b() {
        int hashCode = ((this.f342510a.hashCode() * 31) + java.lang.Integer.hashCode(this.f342511b)) * 31;
        in5.v0 v0Var = this.f342512c;
        return hashCode + (v0Var == null ? 0 : v0Var.m136796x8cdac1b());
    }

    /* renamed from: toString */
    public java.lang.String m129334x9616526c() {
        return "FlowScrollEventFeedData(feed=" + this.f342510a + ", dataPos=" + this.f342511b + ", showInfo=" + this.f342512c + ')';
    }
}
