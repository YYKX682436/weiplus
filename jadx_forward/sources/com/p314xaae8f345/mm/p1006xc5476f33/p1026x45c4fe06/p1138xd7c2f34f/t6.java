package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class t6 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.w6 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f166692a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6(java.lang.String desc) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        this.f166692a = desc;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.w6
    public int a() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m51810xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.t6) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f166692a, ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.t6) obj).f166692a);
    }

    /* renamed from: hashCode */
    public int m51811x8cdac1b() {
        return this.f166692a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m51812x9616526c() {
        return "DESC(" + this.f166692a + ')';
    }
}
