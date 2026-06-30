package ru0;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 f481193a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f481194b;

    public d(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID, java.lang.String roleID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roleID, "roleID");
        this.f481193a = segmentID;
        this.f481194b = roleID;
    }

    /* renamed from: equals */
    public boolean m163015xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ru0.d)) {
            return false;
        }
        ru0.d dVar = (ru0.d) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f481193a, dVar.f481193a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f481194b, dVar.f481194b);
    }

    /* renamed from: hashCode */
    public int m163016x8cdac1b() {
        return (this.f481193a.m32423x8cdac1b() * 31) + this.f481194b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m163017x9616526c() {
        return "RequestIdentity(segmentID=" + this.f481193a + ", roleID=" + this.f481194b + ')';
    }
}
