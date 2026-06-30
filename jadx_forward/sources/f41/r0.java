package f41;

/* loaded from: classes.dex */
public final class r0 implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f341044d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.z3 f341045e;

    public r0(java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        this.f341044d = username;
        this.f341045e = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(username, true);
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return this.f341044d.hashCode();
    }

    @Override // in5.c
    public int h() {
        return 0;
    }
}
