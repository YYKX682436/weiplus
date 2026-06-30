package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class e9 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.g9 {

    /* renamed from: a, reason: collision with root package name */
    public final long f166129a;

    public e9(long j17) {
        super(null);
        this.f166129a = j17;
    }

    /* renamed from: equals */
    public boolean m51711xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.e9) && this.f166129a == ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.e9) obj).f166129a;
    }

    /* renamed from: hashCode */
    public int m51712x8cdac1b() {
        return java.lang.Long.hashCode(this.f166129a);
    }

    /* renamed from: toString */
    public java.lang.String m51713x9616526c() {
        return "FallbackIfTimeout[" + this.f166129a + "ms]";
    }
}
