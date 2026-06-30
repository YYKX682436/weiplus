package zq5;

/* loaded from: classes11.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f556607a;

    /* renamed from: b, reason: collision with root package name */
    public final zq5.j f556608b;

    /* renamed from: c, reason: collision with root package name */
    public final zq5.i f556609c;

    public k(java.lang.String tag, zq5.i level, zq5.j pipeline, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        level = (i17 & 2) != 0 ? zq5.i.f556603f : level;
        pipeline = (i17 & 4) != 0 ? zq5.a.f556588a : pipeline;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(level, "level");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pipeline, "pipeline");
        this.f556607a = tag;
        this.f556608b = pipeline;
        this.f556609c = level;
    }

    public final void a(yz5.a lazyMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lazyMsg, "lazyMsg");
        c(zq5.i.f556602e, lazyMsg);
    }

    public final void b(zq5.i level, java.lang.String msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(level, "level");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        if (level.compareTo(this.f556609c) >= 0) {
            ((zq5.a) this.f556608b).a(level, this.f556607a, msg, null);
        }
    }

    public final void c(zq5.i level, yz5.a lazyMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(level, "level");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lazyMsg, "lazyMsg");
        if (level.compareTo(this.f556609c) >= 0) {
            ((zq5.a) this.f556608b).a(level, this.f556607a, (java.lang.String) lazyMsg.mo152xb9724478(), null);
        }
    }

    public final void d(yz5.a lazyMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lazyMsg, "lazyMsg");
        c(zq5.i.f556601d, lazyMsg);
    }

    /* renamed from: equals */
    public boolean m179325xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zq5.k.class != obj.getClass()) {
            return false;
        }
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f556607a, ((zq5.k) obj).f556607a);
    }

    /* renamed from: hashCode */
    public int m179326x8cdac1b() {
        return this.f556607a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m179327x9616526c() {
        return "Logger(tag='" + this.f556607a + "', level=" + this.f556609c + ", pipeline=" + this.f556608b + ')';
    }
}
