package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class fb {

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.eb f166145b = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.eb(null);

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f166146a;

    public fb(java.util.List authItemList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(authItemList, "authItemList");
        this.f166146a = authItemList;
    }

    /* renamed from: equals */
    public boolean m51720xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.fb) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f166146a, ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.fb) obj).f166146a);
    }

    /* renamed from: hashCode */
    public int m51721x8cdac1b() {
        return this.f166146a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m51722x9616526c() {
        return "PrefetchGetSettingAuthInfoResponse(authItemList=" + this.f166146a + ')';
    }
}
