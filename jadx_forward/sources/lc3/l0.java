package lc3;

/* loaded from: classes7.dex */
public final class l0 extends lc3.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 f399441a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 assetFs) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(assetFs, "assetFs");
        this.f399441a = assetFs;
    }

    /* renamed from: equals */
    public boolean m145577xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lc3.l0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f399441a, ((lc3.l0) obj).f399441a);
    }

    /* renamed from: hashCode */
    public int m145578x8cdac1b() {
        return this.f399441a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m145579x9616526c() {
        return "AssetPkgFsDescriptor(assetFs=" + this.f399441a + ')';
    }
}
