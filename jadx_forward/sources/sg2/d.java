package sg2;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f489422a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f489423b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f489424c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f489425d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f489426e;

    public d(java.lang.String f_gifting_pag, java.lang.String f_primary_pag, java.lang.String f_sound_mp3, java.lang.String d_primary_lua, java.lang.String d_gifting_lua) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(f_gifting_pag, "f_gifting_pag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(f_primary_pag, "f_primary_pag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(f_sound_mp3, "f_sound_mp3");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(d_primary_lua, "d_primary_lua");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(d_gifting_lua, "d_gifting_lua");
        this.f489422a = f_gifting_pag;
        this.f489423b = f_primary_pag;
        this.f489424c = f_sound_mp3;
        this.f489425d = d_primary_lua;
        this.f489426e = d_gifting_lua;
    }

    /* renamed from: equals */
    public boolean m164541xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sg2.d)) {
            return false;
        }
        sg2.d dVar = (sg2.d) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f489422a, dVar.f489422a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f489423b, dVar.f489423b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f489424c, dVar.f489424c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f489425d, dVar.f489425d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f489426e, dVar.f489426e);
    }

    /* renamed from: hashCode */
    public int m164542x8cdac1b() {
        return (((((((this.f489422a.hashCode() * 31) + this.f489423b.hashCode()) * 31) + this.f489424c.hashCode()) * 31) + this.f489425d.hashCode()) * 31) + this.f489426e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m164543x9616526c() {
        return "ResourceStatus(f_gifting_pag=" + this.f489422a + ", f_primary_pag=" + this.f489423b + ", f_sound_mp3=" + this.f489424c + ", d_primary_lua=" + this.f489425d + ", d_gifting_lua=" + this.f489426e + ')';
    }
}
