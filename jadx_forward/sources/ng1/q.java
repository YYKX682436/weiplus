package ng1;

/* loaded from: classes7.dex */
public final class q extends ng1.r {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1174xe125c5cf.C12540xf7cdfd54 f418481a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1174xe125c5cf.C12540xf7cdfd54 permission) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permission, "permission");
        this.f418481a = permission;
    }

    /* renamed from: equals */
    public boolean m149565xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ng1.q) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f418481a, ((ng1.q) obj).f418481a);
    }

    /* renamed from: hashCode */
    public int m149566x8cdac1b() {
        return this.f418481a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m149567x9616526c() {
        return "Succeed(permission=" + this.f418481a + ')';
    }
}
