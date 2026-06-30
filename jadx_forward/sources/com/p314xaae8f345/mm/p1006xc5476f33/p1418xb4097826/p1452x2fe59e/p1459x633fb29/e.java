package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Integer f189348a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g f189349b;

    public e(java.lang.Integer num, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f189348a = num;
        this.f189349b = gVar;
    }

    /* renamed from: equals */
    public boolean m56328xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.e)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.e eVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.e) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f189348a, eVar.f189348a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f189349b, eVar.f189349b);
    }

    /* renamed from: hashCode */
    public int m56329x8cdac1b() {
        java.lang.Integer num = this.f189348a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f189349b;
        return hashCode + (gVar != null ? gVar.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m56330x9616526c() {
        return "FeedRequestExtInfo(byPassInfoType=" + this.f189348a + ", byPassInfo=" + this.f189349b + ')';
    }
}
