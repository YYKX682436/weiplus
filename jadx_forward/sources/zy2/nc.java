package zy2;

/* loaded from: classes3.dex */
public final class nc {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f559028a;

    /* renamed from: b, reason: collision with root package name */
    public final long f559029b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f559030c;

    /* renamed from: d, reason: collision with root package name */
    public final r45.nw1 f559031d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f559032e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f559033f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f559034g;

    /* renamed from: h, reason: collision with root package name */
    public final c50.e1 f559035h;

    public nc(java.lang.String objectUserName, long j17, java.lang.String objectNonceId, r45.nw1 nw1Var, java.lang.String sessionBuffer, java.lang.String nickName, android.widget.ImageView imageView, c50.e1 e1Var, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        imageView = (i17 & 64) != 0 ? null : imageView;
        e1Var = (i17 & 128) != 0 ? null : e1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objectUserName, "objectUserName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objectNonceId, "objectNonceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionBuffer, "sessionBuffer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickName, "nickName");
        this.f559028a = objectUserName;
        this.f559029b = j17;
        this.f559030c = objectNonceId;
        this.f559031d = nw1Var;
        this.f559032e = sessionBuffer;
        this.f559033f = nickName;
        this.f559034g = imageView;
        this.f559035h = e1Var;
    }

    /* renamed from: equals */
    public boolean m180008xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy2.nc)) {
            return false;
        }
        zy2.nc ncVar = (zy2.nc) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f559028a, ncVar.f559028a) && this.f559029b == ncVar.f559029b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f559030c, ncVar.f559030c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f559031d, ncVar.f559031d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f559032e, ncVar.f559032e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f559033f, ncVar.f559033f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f559034g, ncVar.f559034g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f559035h, ncVar.f559035h);
    }

    /* renamed from: hashCode */
    public int m180009x8cdac1b() {
        int hashCode = ((((this.f559028a.hashCode() * 31) + java.lang.Long.hashCode(this.f559029b)) * 31) + this.f559030c.hashCode()) * 31;
        r45.nw1 nw1Var = this.f559031d;
        int hashCode2 = (((((hashCode + (nw1Var == null ? 0 : nw1Var.hashCode())) * 31) + this.f559032e.hashCode()) * 31) + this.f559033f.hashCode()) * 31;
        android.widget.ImageView imageView = this.f559034g;
        int hashCode3 = (hashCode2 + (imageView == null ? 0 : imageView.hashCode())) * 31;
        c50.e1 e1Var = this.f559035h;
        return hashCode3 + (e1Var != null ? e1Var.m14159x8cdac1b() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m180010x9616526c() {
        return "LiveFluentFeedData(objectUserName=" + this.f559028a + ", feedId=" + this.f559029b + ", objectNonceId=" + this.f559030c + ", liveInfo=" + this.f559031d + ", sessionBuffer=" + this.f559032e + ", nickName=" + this.f559033f + ", thumbView=" + this.f559034g + ", config=" + this.f559035h + ')';
    }
}
