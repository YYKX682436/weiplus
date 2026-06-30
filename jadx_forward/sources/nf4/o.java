package nf4;

/* loaded from: classes4.dex */
public final class o extends dm.fb {

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f418410v = dm.fb.m124985x3593deb(nf4.o.class);

    @Override // dm.fb, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        l75.e0 info = f418410v;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(info, "info");
        return info;
    }

    public final boolean t0() {
        int i17 = this.f66552x78351860;
        return i17 > 0 && this.f66549x799e9d9e == i17;
    }

    /* renamed from: toString */
    public java.lang.String m149522x9616526c() {
        return this.f66551x44346ab + ", " + this.f66550xf1e9b966 + ", cacheSize:" + this.f66549x799e9d9e + ", totalSize:" + this.f66552x78351860;
    }

    public final boolean u0() {
        return t0() && com.p314xaae8f345.mm.vfs.w6.j(this.f66550xf1e9b966);
    }
}
