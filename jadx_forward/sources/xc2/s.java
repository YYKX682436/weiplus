package xc2;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f534820a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f534821b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f534822c;

    public s(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 jumpInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfo, "jumpInfo");
        this.f534820a = jumpInfo;
        this.f534821b = new java.util.ArrayList();
        this.f534822c = new java.util.ArrayList();
    }

    /* renamed from: equals */
    public boolean m175327xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xc2.s) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f534820a, ((xc2.s) obj).f534820a);
    }

    /* renamed from: hashCode */
    public int m175328x8cdac1b() {
        return this.f534820a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m175329x9616526c() {
        return "FinderCombineJumpInfo(jumpInfo=" + this.f534820a + ')';
    }
}
