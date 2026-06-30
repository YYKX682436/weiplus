package u1;

/* loaded from: classes14.dex */
public final class x1 extends u1.p0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(u1.c1 layoutNodeWrapper, p1.z modifier) {
        super(layoutNodeWrapper, modifier);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutNodeWrapper, "layoutNodeWrapper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(modifier, "modifier");
    }

    @Override // u1.p0
    public void a() {
        this.f505190g = true;
        z0.t tVar = this.f505188e;
        ((p1.z) tVar).N().f432458d = this.f505187d;
        ((p1.z) tVar).N().f432459e = true;
    }

    @Override // u1.p0
    public void b() {
        this.f505190g = false;
        ((p1.z) this.f505188e).N().f432459e = false;
    }

    public final boolean c() {
        p1.y N = ((p1.z) this.f505188e).N();
        N.getClass();
        if (!(N instanceof p1.f0)) {
            u1.x1 x1Var = (u1.x1) this.f505189f;
            if (!(x1Var != null ? x1Var.c() : false)) {
                return false;
            }
        }
        return true;
    }
}
