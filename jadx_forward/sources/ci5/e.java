package ci5;

/* loaded from: classes10.dex */
public abstract class e implements mf3.k, zh5.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.api.p745xc4aaf986.C10598x47b4a646 f123258a;

    /* renamed from: b, reason: collision with root package name */
    public final t40.b f123259b;

    /* renamed from: c, reason: collision with root package name */
    public dn.j f123260c;

    public e(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.api.p745xc4aaf986.C10598x47b4a646 params, t40.b config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        this.f123258a = params;
        this.f123259b = config;
    }

    @Override // zh5.j0
    public java.lang.String b() {
        return null;
    }

    @Override // mf3.k
    public eg3.i c() {
        return null;
    }

    public final java.lang.String d() {
        return this.f123259b.f497006g + "/finder_live_gallery_image/downloaded/" + this.f123258a.f148137e + ".temp";
    }

    @Override // mf3.k
    public java.lang.String g() {
        return h();
    }

    @Override // mf3.k
    /* renamed from: getId */
    public java.lang.String mo2110x5db1b11() {
        return this.f123258a.f148137e;
    }

    public final java.lang.String h() {
        return this.f123259b.f497006g + "/finder_live_gallery_video/downloaded/" + this.f123258a.f148137e + ".mp4";
    }

    public final java.lang.String i() {
        return this.f123259b.f497006g + "/finder_live_gallery_video/downloading/" + this.f123258a.f148137e + ".mp4";
    }
}
