package re5;

/* loaded from: classes12.dex */
public final class t extends ai5.c {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f476131e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f476132f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f476133g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(java.lang.String filePath, java.lang.String fileName) {
        super(new r45.gp0(), 0L, "", new hu.f());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        this.f476131e = filePath;
        this.f476132f = fileName;
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
        this.f476133g = uuid;
    }

    @Override // mf3.k
    public gg3.c a() {
        return new gg3.c(mo2110x5db1b11(), "", this.f476131e, this.f476132f, this.f86740a.f456981y * 1000, false, 32, null);
    }

    @Override // mf3.k
    public eg3.i c() {
        return null;
    }

    @Override // ai5.c
    public tt.h d() {
        return null;
    }

    @Override // mf3.k
    public sf3.g e() {
        return null;
    }

    @Override // ai5.c, mf3.k
    /* renamed from: getId */
    public java.lang.String mo2110x5db1b11() {
        return "local.video@" + this.f476133g;
    }

    @Override // mf3.k
    /* renamed from: getType */
    public mf3.u mo2109xfb85f7b0() {
        return mf3.u.f407657f;
    }

    @Override // ai5.c
    public tt.h i() {
        return null;
    }
}
